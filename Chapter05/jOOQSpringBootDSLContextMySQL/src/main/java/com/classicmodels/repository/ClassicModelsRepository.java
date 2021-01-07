package com.classicmodels.repository;

import com.classicmodels.pojo.Office;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import javax.sql.DataSource;
import static jooq.generated.tables.Office.OFFICE;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

@Repository
public class ClassicModelsRepository {

    private final DataSource ds;
    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx, DataSource ds) {
        this.ctx = ctx;
        this.ds = ds;
    }

    public List<Office> findOfficesInTerritory1(String territory) {

        List<Office> result = DSL.using(ds, SQLDialect.MYSQL)
                .selectFrom(OFFICE)
                .where(OFFICE.TERRITORY.eq(territory))
                .fetchInto(Office.class);

        return result;
    }

    public List<Office> findOfficesInTerritory2(String territory) {

        List<Office> result = DSL.using(
                ds, SQLDialect.MYSQL, new Settings().withRenderSchema(Boolean.FALSE))
                .selectFrom(OFFICE)
                .where(OFFICE.TERRITORY.eq(territory))
                .fetchInto(Office.class);

        return result;
    }

    public List<Office> findOfficesInTerritory3(String territory) {

        List<Office> result = ctx.configuration()
                .set(new Settings().withRenderSchema(Boolean.FALSE)).dsl()
                .selectFrom(OFFICE)
                .where(OFFICE.TERRITORY.eq(territory))
                .fetchInto(Office.class);

        return result;
    }

    public List<Office> findOfficesInTerritory4(String territory) {

        try (Connection conn
                = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/classicmodels", "root", "root")) {

            List<Office> result = DSL.using(conn)
                    .selectFrom(OFFICE)
                    .where(OFFICE.TERRITORY.eq(territory))
                    .fetchInto(Office.class);

            return result;

        } catch (SQLException ex) {
            // handle exception
        }

        return Collections.emptyList();
    }

    public String findOfficesInTerritory5(String territory) {

        String sql = DSL.using(SQLDialect.MYSQL)
                .selectFrom(OFFICE)
                .where(OFFICE.TERRITORY.eq(territory))
                .getSQL();

        return sql;
    }

    // prior to jOOQ 3.14
    /*
    public List<Office> findOfficesInTerritory6(String territory) {

        try ( DSLContext ctx = DSL.using(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "root")) {

            List<Office> result = ctx.selectFrom(OFFICE)
                    .where(OFFICE.TERRITORY.eq(territory))
                    .fetchInto(Office.class);

            return result;
        }
    }    
     */
    
    // starting with jOOQ 3.14
    public List<Office> findOfficesInTerritory6(String territory) {

        DSLContext ctxLocal = DSL.using(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "root");

        List<Office> result = ctxLocal.selectFrom(OFFICE)
                .where(OFFICE.TERRITORY.eq(territory))
                .fetchInto(Office.class);

        return result;
    }
}
