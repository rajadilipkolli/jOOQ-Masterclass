package com.classicmodels.repository;

import static jooq.generated.tables.Employee.EMPLOYEE;
import static jooq.generated.tables.Office.OFFICE;
import static jooq.generated.tables.Orderdetail.ORDERDETAIL;
import static jooq.generated.tables.Sale.SALE;
import org.jooq.DSLContext;
import static org.jooq.impl.DSL.all;
import static org.jooq.impl.DSL.avg;
import static org.jooq.impl.DSL.concat;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.listAgg;
import static org.jooq.impl.DSL.percentileCont;
import static org.jooq.impl.DSL.percentileDisc;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.val;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    // PERCENTILE_DISC() & PERCENTILE_CONT()
    public void percentileDiscContEmployeePerOffice() {

        ctx.select(OFFICE.OFFICE_CODE, OFFICE.CITY, OFFICE.COUNTRY,
                EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME, EMPLOYEE.SALARY,
                percentileDisc(0.5).withinGroupOrderBy(EMPLOYEE.SALARY)
                        .over().partitionBy(OFFICE.OFFICE_CODE).as("percentile_disc"),
                percentileCont(0.5).withinGroupOrderBy(EMPLOYEE.SALARY)
                        .over().partitionBy(OFFICE.OFFICE_CODE).as("percentile_cont"))
                .from(OFFICE)
                .join(EMPLOYEE)
                .on(OFFICE.OFFICE_CODE.eq(EMPLOYEE.OFFICE_CODE))
                .fetch();
    }

    // LIST_AGG()
    public void listAggEmployee() {

        ctx.select(
                listAgg(EMPLOYEE.FIRST_NAME).withinGroupOrderBy(EMPLOYEE.SALARY).as("list_agg"))
                .from(EMPLOYEE)
                .fetch();

        ctx.select(
                listAgg(concat(EMPLOYEE.FIRST_NAME, val(" "), EMPLOYEE.LAST_NAME), ", ")
                        .withinGroupOrderBy(EMPLOYEE.SALARY.desc(), EMPLOYEE.FIRST_NAME.desc()).as("employees"))
                .from(EMPLOYEE)
                .fetch();
    }

    // MODE()
    public void modeSale() {

        // emulation of mode
        ctx.select(SALE.FISCAL_YEAR)
                .from(SALE)
                .groupBy(SALE.FISCAL_YEAR)
                .having(count().ge(all(select(count())
                        .from(SALE).groupBy(SALE.FISCAL_YEAR))))
                .fetch();

        // emulation of mode using a percentage of the total number of occurrences
        ctx.select(avg(ORDERDETAIL.QUANTITY_ORDERED))
                .from(ORDERDETAIL)
                .groupBy(ORDERDETAIL.QUANTITY_ORDERED)
                .having(count().ge(all(select(count().mul(0.75))
                        .from(ORDERDETAIL).groupBy(ORDERDETAIL.QUANTITY_ORDERED))))
                .fetch();

        ctx.select(avg(ORDERDETAIL.QUANTITY_ORDERED))
                .from(ORDERDETAIL)
                .groupBy(ORDERDETAIL.QUANTITY_ORDERED)
                .having(count().ge(all(select(count().mul(0.95))
                        .from(ORDERDETAIL).groupBy(ORDERDETAIL.QUANTITY_ORDERED))))
                .fetch();
    }
}