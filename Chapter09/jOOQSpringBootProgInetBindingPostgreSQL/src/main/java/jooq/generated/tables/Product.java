/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.ProductRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.1"
    },
    date = "2020-12-28T06:34:31.202Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = 1479625002;

    /**
     * The reference instance of <code>public.product</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>public.product.product_id</code>.
     */
    public final TableField<ProductRecord, Long> PRODUCT_ID = createField(DSL.name("product_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('product_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.product.product_name</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_NAME = createField(DSL.name("product_name"), org.jooq.impl.SQLDataType.VARCHAR(70).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.product.product_line</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_LINE = createField(DSL.name("product_line"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.product.product_scale</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_SCALE = createField(DSL.name("product_scale"), org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.product.product_vendor</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_VENDOR = createField(DSL.name("product_vendor"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.product.product_description</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_DESCRIPTION = createField(DSL.name("product_description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.product.quantity_in_stock</code>.
     */
    public final TableField<ProductRecord, Short> QUANTITY_IN_STOCK = createField(DSL.name("quantity_in_stock"), org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.product.buy_price</code>.
     */
    public final TableField<ProductRecord, BigDecimal> BUY_PRICE = createField(DSL.name("buy_price"), org.jooq.impl.SQLDataType.NUMERIC(10, 2).defaultValue(org.jooq.impl.DSL.field("0.0", org.jooq.impl.SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>public.product.msrp</code>.
     */
    public final TableField<ProductRecord, BigDecimal> MSRP = createField(DSL.name("msrp"), org.jooq.impl.SQLDataType.NUMERIC(10, 2).defaultValue(org.jooq.impl.DSL.field("0.0", org.jooq.impl.SQLDataType.NUMERIC)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<ProductRecord, Object> SPECS = createField(DSL.name("specs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"hstore\""), this, "");

    /**
     * Create a <code>public.product</code> table reference
     */
    public Product() {
        this(DSL.name("product"), null);
    }

    /**
     * Create an aliased <code>public.product</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>public.product</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Product(Table<O> child, ForeignKey<O, ProductRecord> key) {
        super(child, key, PRODUCT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRODUCT_LINE);
    }

    @Override
    public Identity<ProductRecord, Long> getIdentity() {
        return Keys.IDENTITY_PRODUCT;
    }

    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.PRODUCT_PKEY;
    }

    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.PRODUCT_PKEY);
    }

    @Override
    public List<ForeignKey<ProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProductRecord, ?>>asList(Keys.PRODUCT__PRODUCTS_IBFK_1);
    }

    public Productline productline() {
        return new Productline(this, Keys.PRODUCT__PRODUCTS_IBFK_1);
    }

    @Override
    public Product as(String alias) {
        return new Product(DSL.name(alias), this);
    }

    @Override
    public Product as(Name alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(Name name) {
        return new Product(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, String, String, String, Short, BigDecimal, BigDecimal, Object> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
