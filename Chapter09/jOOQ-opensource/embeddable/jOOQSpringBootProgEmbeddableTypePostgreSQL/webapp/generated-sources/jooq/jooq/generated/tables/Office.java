/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.embeddables.records.OfficeFullAddressRecord;
import jooq.generated.tables.records.OfficeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
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
public class Office extends TableImpl<OfficeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.office</code>
     */
    public static final Office OFFICE = new Office();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OfficeRecord> getRecordType() {
        return OfficeRecord.class;
    }

    /**
     * The column <code>public.office.office_code</code>.
     */
    public final TableField<OfficeRecord, String> OFFICE_CODE = createField(DSL.name("office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>public.office.city</code>.
     */
    public final TableField<OfficeRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.office.phone</code>.
     */
    public final TableField<OfficeRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.office.address_line_first</code>.
     */
    public final TableField<OfficeRecord, String> ADDRESS_LINE_FIRST = createField(DSL.name("address_line_first"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.office.address_line_second</code>.
     */
    public final TableField<OfficeRecord, String> ADDRESS_LINE_SECOND = createField(DSL.name("address_line_second"), SQLDataType.VARCHAR(50).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.office.state</code>.
     */
    public final TableField<OfficeRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(50).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.office.country</code>.
     */
    public final TableField<OfficeRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.office.postal_code</code>.
     */
    public final TableField<OfficeRecord, String> POSTAL_CODE = createField(DSL.name("postal_code"), jooq.generated.Domains.POSTAL_CODE.getDataType(), this, "");

    /**
     * The column <code>public.office.territory</code>.
     */
    public final TableField<OfficeRecord, String> TERRITORY = createField(DSL.name("territory"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<OfficeRecord, Object> LOCATION = createField(DSL.name("location"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"point\""), this, "");

    /**
     * The column <code>public.office.internal_budget</code>.
     */
    public final TableField<OfficeRecord, Integer> INTERNAL_BUDGET = createField(DSL.name("internal_budget"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The embeddable type <code>OFFICE_FULL_ADDRESS</code>. The full address of an office
     */
    public final TableField<OfficeRecord, OfficeFullAddressRecord> OFFICE_FULL_ADDRESS = Internal.createEmbeddable(DSL.name("OFFICE_FULL_ADDRESS"), OfficeFullAddressRecord.class, false, this, CITY, ADDRESS_LINE_FIRST, STATE, COUNTRY, TERRITORY);

    private Office(Name alias, Table<OfficeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Office(Name alias, Table<OfficeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.office</code> table reference
     */
    public Office(String alias) {
        this(DSL.name(alias), OFFICE);
    }

    /**
     * Create an aliased <code>public.office</code> table reference
     */
    public Office(Name alias) {
        this(alias, OFFICE);
    }

    /**
     * Create a <code>public.office</code> table reference
     */
    public Office() {
        this(DSL.name("office"), null);
    }

    public <O extends Record> Office(Table<O> child, ForeignKey<O, OfficeRecord> key) {
        super(child, key, OFFICE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<OfficeRecord> getPrimaryKey() {
        return Keys.OFFICE_PK;
    }

    @Override
    public List<UniqueKey<OfficeRecord>> getKeys() {
        return Arrays.<UniqueKey<OfficeRecord>>asList(Keys.OFFICE_PK, Keys.OFFICE_POSTAL_CODE_UK);
    }

    @Override
    public Office as(String alias) {
        return new Office(DSL.name(alias), this);
    }

    @Override
    public Office as(Name alias) {
        return new Office(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Office rename(String name) {
        return new Office(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Office rename(Name name) {
        return new Office(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, String, Object, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}