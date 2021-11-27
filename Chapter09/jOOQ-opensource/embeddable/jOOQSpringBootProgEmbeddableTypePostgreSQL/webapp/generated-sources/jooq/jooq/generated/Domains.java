/*
 * This file is generated by jOOQ.
 */
package jooq.generated;


import javax.annotation.processing.Generated;

import org.jooq.Domain;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.LazySchema;
import org.jooq.impl.LazySupplier;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all Domains in public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains {

    /**
     * The domain <code>public.postal_code</code>.
     */
    public static final Domain<String> POSTAL_CODE = Internal.createDomain(
          schema()
        , DSL.name("postal_code")
        , SQLDataType.VARCHAR(15)
        , Internal.createCheck(null, null, "CHECK ((((VALUE)::text ~ '^\\d{5}$'::text) OR ((VALUE)::text ~ '^[A-Z]{2}[0-9]{3}[A-Z]{2}$'::text)))")
    );

    private static final Schema schema() {
        return new LazySchema(DSL.name("public"), DSL.comment(""), new LazySupplier<Schema>() {
            @Override
            public Schema get() {
                return Public.PUBLIC;
            }
        });
    }
}