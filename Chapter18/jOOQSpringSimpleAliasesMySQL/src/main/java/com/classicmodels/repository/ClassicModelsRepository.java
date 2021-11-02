package com.classicmodels.repository;

import static jooq.generated.Classicmodels.CLASSICMODELS;
import static jooq.generated.tables.Employee.EMPLOYEE;
import static jooq.generated.tables.Product.PRODUCT;
import jooq.generated.tables.records.ProductRecord;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.name;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    public void simpleTableAlias() {

        // using schema name
        Table<ProductRecord> p0 = CLASSICMODELS.PRODUCT;

        Table<ProductRecord> p1 = PRODUCT;
        Table<ProductRecord> p2 = PRODUCT.as("p");
        Table<ProductRecord> p3 = PRODUCT.as(name("p"));

        System.out.println("Table name (0): " + p0.getName());
        System.out.println("Table name (1): " + p1.getName());
        System.out.println("Table name (2): " + p2.getName());
        System.out.println("Table name (3): " + p3.getName());

        System.out.println("Table unqualified name (0): " + p0.getUnqualifiedName());
        System.out.println("Table unqualified name (1): " + p1.getUnqualifiedName());
        System.out.println("Table unqualified name (2): " + p2.getUnqualifiedName());
        System.out.println("Table unqualified name (3): " + p3.getUnqualifiedName());

        System.out.println("Table qualified name (0): " + p0.getQualifiedName());
        System.out.println("Table qualified name (1): " + p1.getQualifiedName());
        System.out.println("Table qualified name (2): " + p2.getQualifiedName());
        System.out.println("Table qualified name (3): " + p3.getQualifiedName());
    }

    public void tableEquality() {

        Table<ProductRecord> p1 = PRODUCT.as("p1");
        Table<ProductRecord> p2 = PRODUCT.as("p2");
        Table<ProductRecord> p3 = PRODUCT;
        Table<ProductRecord> p4 = PRODUCT;

        System.out.println("p1 = p2 ? " + (p1.equals(p2)));
        System.out.println("p3 = p4 ? " + (p3.equals(p4)));
        System.out.println("p1 = p3 ? " + (p1.equals(p3)));
        System.out.println("p2 = p4 ? " + (p2.equals(p4)));                
    }

    public void simpleColumnAlias() {

        // using schema name
        Field<String> f0 = CLASSICMODELS.PRODUCT.PRODUCT_NAME;

        Field<String> f1 = PRODUCT.PRODUCT_NAME;
        Field<String> f2 = PRODUCT.PRODUCT_NAME.as("f");
        Field<String> f3 = PRODUCT.PRODUCT_NAME.as(name("f"));

        System.out.println("Field name (0): " + f0.getName());
        System.out.println("Field name (1): " + f1.getName());
        System.out.println("Field name (2): " + f2.getName());
        System.out.println("Field name (3): " + f3.getName());

        System.out.println("Field unqualified name (0): " + f0.getUnqualifiedName());
        System.out.println("Field unqualified name (1): " + f1.getUnqualifiedName());
        System.out.println("Field unqualified name (2): " + f2.getUnqualifiedName());
        System.out.println("Field unqualified name (3): " + f3.getUnqualifiedName());

        System.out.println("Field qualified name (0): " + f0.getQualifiedName());
        System.out.println("Field qualified name (1): " + f1.getQualifiedName());
        System.out.println("Field qualified name (2): " + f2.getQualifiedName());
        System.out.println("Field qualified name (3): " + f3.getQualifiedName());
    }

    public void fieldEquality() {

        Field<String> f1 = PRODUCT.PRODUCT_NAME.as("f");
        Field<String> f2 = PRODUCT.PRODUCT_NAME.as("f");
        Field<String> f3 = PRODUCT.PRODUCT_NAME;
        Field<String> f4 = PRODUCT.PRODUCT_NAME;

        System.out.println("f1 = f2 ? " + (f1.equals(f2)));
        System.out.println("f3 = f4 ? " + (f3.equals(f4)));
        System.out.println("f1 = f3 ? " + (f1.equals(f3)));
        System.out.println("f2 = f4 ? " + (f2.equals(f4)));
    }

    public void simpleSelectAndAs() {
        
        // table aliases        
        ctx.select(field(name("t", "first_name")), field(name("t", "last_name")))
                .from(EMPLOYEE.as("t"))
                .fetch();

        // column aliases in select
        ctx.select(EMPLOYEE.FIRST_NAME.as("fn"), EMPLOYEE.LAST_NAME.as("ln"))
                .from(EMPLOYEE)
                .fetch();                
    }
}
