package com.classicmodels.repository;

import java.math.BigDecimal;
import static jooq.generated.tables.Employee.EMPLOYEE;
import static jooq.generated.tables.Manager.MANAGER;
import static jooq.generated.tables.Office.OFFICE;
import static jooq.generated.tables.OfficeHasManager.OFFICE_HAS_MANAGER;
import static jooq.generated.tables.Orderdetail.ORDERDETAIL;
import static jooq.generated.tables.Product.PRODUCT;
import jooq.generated.tables.Sale;
import static jooq.generated.tables.Sale.SALE;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import static org.jooq.impl.DSL.avg;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.lateral;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.row;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.sum;
import static org.jooq.impl.DSL.values;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    public void unamedDerivedTable() {

        // unnamed derived table
        Table<?> t1 = select(inline(1).as("one")).asTable();
        // or, Table<?> t1 = table(select(inline(1).as("one")));

        // select "alias_30260683"."one" from (select 1 "one" from dual) "alias_30260683"
        ctx.selectFrom(t1).fetch();

        // explicit alias
        Table<?> t2 = select(inline(1).as("one")).asTable("t");
        // or, Table<?> t2 = table(select(inline(1).as("one"))).as("t");

        // select "t"."one" from (select 1 "one" from dual) "t"
        ctx.selectFrom(t2).fetch();

        Table<?> t3 = select().from(values(row(1, "John"), row(2, "Mary"), row(3, "Kelly"))
                        .as("t", "id", "name")).asTable();
        
        // select "alias_116047195"."id", "alias_116047195"."name" from 
        // (select "t"."id", "t"."name" from (select 1 "id", 'John' "name" from dual union all 
        // select 2, 'Mary' from dual union all select 3, 'Kelly' from dual) "t") "alias_116047195"
        ctx.selectFrom(t3).fetch();
        
        Table<?> t4 = select().from(values(row(1, "John"), 
                row(2, "Mary"), row(3, "Kelly"))).asTable("t", "id", "name");
        
        // select "t"."id", "t"."name" from (select null "id", null "name" from dual where 1 = 0 
        // union all select "v"."c1", "v"."c2" from (select 1 "c1", 'John' "c2" from dual union all 
        // select 2, 'Mary' from dual union all select 3, 'Kelly' from dual) "v") "t"
        ctx.selectFrom(t4).fetch();
        
        Table<?> t5 = select().from(values(row(1, "John"), 
                row(2, "Mary"), row(3, "Kelly")).as("x", "x1", "x2")).asTable("t", "id", "name");
        
        // select "t"."id", "t"."name" from (select null "id", null "name" from dual where 1 = 0 
        // union all select "x"."x1", "x"."x2" from (select 1 "x1", 'John' "x2" from dual union all 
        // select 2, 'Mary' from dual union all select 3, 'Kelly' from dual) "x") "t"
        ctx.selectFrom(t5).fetch();
    }

    // a "nested SELECT" is often called a "derived table"
    public void nestedSelectDerivedTableSingleColumn() {

        // ---SUBQUERY HAVING A SINGLE COLUMN---
        
        // derived table as nested SELECT
        ctx.selectFrom(PRODUCT)
                .where(PRODUCT.PRODUCT_ID.in(
                        select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
                                .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L))))
                .fetch();

        // prefer to extract the nested SELECT via field() 
        // since there is a single column fetched        
        Field<Long> f = field(select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
                .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L)));

        // this is not type-safe, you can replace Long with other type (e.g., String)
        // Field<Long> f = select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
        //      .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L)).asField();
        ctx.selectFrom(PRODUCT)
                .where(PRODUCT.PRODUCT_ID.in(f))
                .fetch();

        // avoid this approach, prefer above 
        Table<?> t = select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
                .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L)).asTable("t");
        // or, Table<?> t = table(select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
        //             .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L))).as("t");

        // this also works, but jOOQ will attach the alias for the derived table
        // var t = select(ORDERDETAIL.PRODUCT_ID).from(ORDERDETAIL)
        //        .where(ORDERDETAIL.QUANTITY_ORDERED.gt(80L));
        ctx.select().from(PRODUCT, t)
                .where(PRODUCT.PRODUCT_ID.in(t.field(name("product_id"))))
                .fetch();

        ctx.selectFrom(PRODUCT)
                .where(PRODUCT.PRODUCT_ID.in(
                        select(t.field(name("product_id"), Long.class)).from(t)))
                .fetch();
    }

    // a "nested SELECT" is often called a "derived table"
    public void nestedSelectDerivedTableMultipleColumns() {

        // ---SUBQUERY HAVING MULTIPLE COLUMNS---        
        
        // EXAMPLE 1
        ctx.selectFrom(PRODUCT)
                .where(row(PRODUCT.PRODUCT_ID, PRODUCT.BUY_PRICE).in(
                        select(ORDERDETAIL.PRODUCT_ID, ORDERDETAIL.PRICE_EACH).from(ORDERDETAIL)
                                .where(ORDERDETAIL.QUANTITY_ORDERED.gt(50L))))
                .fetch();

        Table<?> t = select(ORDERDETAIL.PRODUCT_ID, ORDERDETAIL.PRICE_EACH).from(ORDERDETAIL)
                .where(ORDERDETAIL.QUANTITY_ORDERED.gt(50L)).asTable("t");
        // or, Table<?> t = table(select(ORDERDETAIL.PRODUCT_ID, ORDERDETAIL.PRICE_EACH).from(ORDERDETAIL)
        //                        .where(ORDERDETAIL.QUANTITY_ORDERED.gt(50L))).as("t");

        ctx.selectFrom(PRODUCT)
                .where(row(PRODUCT.PRODUCT_ID, PRODUCT.BUY_PRICE).in(
                        select(t.field(name("product_id"), Long.class),
                                t.field(name("price_each"), BigDecimal.class)).from(t)))
                .fetch();

        // using <T> Field<T> field(Field<T> field)
        ctx.selectFrom(PRODUCT)
                .where(row(PRODUCT.PRODUCT_ID, PRODUCT.BUY_PRICE).in(
                        select(t.field(ORDERDETAIL.PRODUCT_ID), t.field(ORDERDETAIL.PRICE_EACH)).from(t)))
                .fetch();

        // EXAMPLE 2 
        Field<BigDecimal> avgs = avg(ORDERDETAIL.PRICE_EACH).as("avgs");
        Field<Long> order = ORDERDETAIL.ORDER_ID.as("order");

        ctx.select(ORDERDETAIL.ORDER_ID, ORDERDETAIL.ORDERDETAIL_ID,
                ORDERDETAIL.PRODUCT_ID, ORDERDETAIL.PRICE_EACH)
                .from(ORDERDETAIL, select(avgs, order)
                        .from(ORDERDETAIL)
                        .groupBy(ORDERDETAIL.ORDER_ID))
                .where(ORDERDETAIL.ORDER_ID.eq(order)
                        .and(ORDERDETAIL.PRICE_EACH.lt(avgs)))
                .orderBy(ORDERDETAIL.ORDER_ID)
                .fetch();

        // extract the derived table
        Table<?> p = select(avgs, order)
                .from(ORDERDETAIL)
                .groupBy(ORDERDETAIL.ORDER_ID)
                .asTable("p");

        ctx.select(ORDERDETAIL.ORDER_ID, ORDERDETAIL.ORDERDETAIL_ID,
                ORDERDETAIL.PRODUCT_ID, ORDERDETAIL.PRICE_EACH)
                .from(ORDERDETAIL, p)
                .where(ORDERDETAIL.ORDER_ID.eq(order)
                        .and(ORDERDETAIL.PRICE_EACH.lt(avgs)))
                .orderBy(ORDERDETAIL.ORDER_ID)
                .fetch();
    }

    // a "nested SELECT" is often called a "derived table"
    public void multipleNestedSelectDerivedTables() {

        ctx.select(EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME, EMPLOYEE.SALARY)
                .from(EMPLOYEE)
                .where(select(avg(SALE.SALE_)).from(SALE).lt(
                        (select(sum(SALE.SALE_)).from(SALE)
                                .where(EMPLOYEE.EMPLOYEE_NUMBER
                                        .eq(SALE.EMPLOYEE_NUMBER)))))
                .fetch();

        // extract the derived tables
        Field<BigDecimal> f1 = field(select(avg(SALE.SALE_)).from(SALE));
        Field<BigDecimal> f2 = field(select(sum(SALE.SALE_)).from(SALE)
                .where(EMPLOYEE.EMPLOYEE_NUMBER
                        .eq(SALE.EMPLOYEE_NUMBER)));

        ctx.select(EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME, EMPLOYEE.SALARY)
                .from(EMPLOYEE)
                .where(f1.lt((f2)))
                .fetch();
    }

    public void selectAsteriskAndFields() {

        Sale sale1 = SALE.as("t");
        Table<?> sale2 = SALE.as("t");
        Table<?> sale3 = ctx.selectFrom(SALE).asTable("t");

        // single SELECT!
        ctx.select(sale1.fields())
                .from(sale1)
                .where(sale1.SALE_.gt(50000.0)).fetch();

        // single SELECT!
        ctx.select(sale2.fields())
                .from(sale2)
                .where(sale2.field(name("SALE"), Double.class).gt(50000.0)).fetch();

        // nested SELECT!
        ctx.select(sale3.fields())
                .from(sale3)
                .where(sale3.field(name("SALE"), Double.class).gt(50000.0)).fetch();

        // fields() and asterisk()
        Table<?> t = ctx.select(SALE.EMPLOYEE_NUMBER, count(SALE.SALE_).as("sales_count"))
                .from(SALE)
                .groupBy(SALE.EMPLOYEE_NUMBER).asTable("t");

        ctx.select(t.fields())
                .from(t)
                .orderBy(t.field(name("sales_count"))).fetch();

        ctx.select(t.asterisk(), EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME)
                .from(EMPLOYEE, t)
                .where(EMPLOYEE.EMPLOYEE_NUMBER.eq(t.field(name("employee_number"), Long.class)))
                .orderBy(t.field(name("sales_count"))).fetch();
    }

    public void derivedTableAndLateral() {

        // LATERAL keyword to connect a derived table to the previous table in the FROM clause
        ctx.select().from(EMPLOYEE, lateral(
                select(count().as("sales_count")).from(SALE)
                        .where(SALE.EMPLOYEE_NUMBER.eq(EMPLOYEE.EMPLOYEE_NUMBER)).asTable("t")))
                .fetch();

        ctx.select(MANAGER.MANAGER_ID, MANAGER.MANAGER_NAME,
                field(name("officeCode")), field(name("city")), field(name("state")))
                .from(MANAGER, lateral(select(OFFICE.OFFICE_CODE.as("officeCode"),
                        OFFICE.CITY.as("city"), OFFICE.STATE.as("state"))
                        .from(OFFICE).join(OFFICE_HAS_MANAGER)
                        .on(OFFICE.OFFICE_CODE.eq(OFFICE_HAS_MANAGER.OFFICES_OFFICE_CODE))
                        .where(MANAGER.MANAGER_ID.eq(OFFICE_HAS_MANAGER.MANAGERS_MANAGER_ID)).asTable("t")))
                .orderBy(MANAGER.MANAGER_ID)
                .fetch();

        // CROSS APPLY
        ctx.select().from(EMPLOYEE)
                .crossApply(select(count().as("sales_count")).from(SALE)
                        .where(SALE.EMPLOYEE_NUMBER.eq(EMPLOYEE.EMPLOYEE_NUMBER)).asTable("t"))
                .fetch();

        ctx.select(MANAGER.MANAGER_ID, MANAGER.MANAGER_NAME,
                field(name("officeCode")), field(name("city")), field(name("state")))
                .from(MANAGER).crossApply(select(OFFICE.OFFICE_CODE.as("officeCode"),
                OFFICE.CITY.as("city"), OFFICE.STATE.as("state"))
                .from(OFFICE).join(OFFICE_HAS_MANAGER)
                .on(OFFICE.OFFICE_CODE.eq(OFFICE_HAS_MANAGER.OFFICES_OFFICE_CODE))
                .where(MANAGER.MANAGER_ID.eq(OFFICE_HAS_MANAGER.MANAGERS_MANAGER_ID)).asTable("t"))
                .orderBy(MANAGER.MANAGER_ID)
                .fetch();
    }
}