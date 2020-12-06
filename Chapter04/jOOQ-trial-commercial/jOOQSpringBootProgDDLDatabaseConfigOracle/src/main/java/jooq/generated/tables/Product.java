/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import jooq.generated.DefaultSchema;
import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.tables.records.ProductRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PRODUCT</code>
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
     * The column <code>PRODUCT.PRODUCT_ID</code>.
     */
    public final TableField<ProductRecord, Long> PRODUCT_ID = createField(DSL.name("PRODUCT_ID"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PRODUCT.PRODUCT_NAME</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_NAME = createField(DSL.name("PRODUCT_NAME"), SQLDataType.VARCHAR(70).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PRODUCT.PRODUCT_LINE</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_LINE = createField(DSL.name("PRODUCT_LINE"), SQLDataType.VARCHAR(50).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PRODUCT.PRODUCT_SCALE</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_SCALE = createField(DSL.name("PRODUCT_SCALE"), SQLDataType.VARCHAR(10).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PRODUCT.PRODUCT_VENDOR</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_VENDOR = createField(DSL.name("PRODUCT_VENDOR"), SQLDataType.VARCHAR(50).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PRODUCT.PRODUCT_DESCRIPTION</code>.
     */
    public final TableField<ProductRecord, String> PRODUCT_DESCRIPTION = createField(DSL.name("PRODUCT_DESCRIPTION"), SQLDataType.CLOB.defaultValue(DSL.field("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>PRODUCT.QUANTITY_IN_STOCK</code>.
     */
    public final TableField<ProductRecord, Integer> QUANTITY_IN_STOCK = createField(DSL.name("QUANTITY_IN_STOCK"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PRODUCT.BUY_PRICE</code>.
     */
    public final TableField<ProductRecord, BigDecimal> BUY_PRICE = createField(DSL.name("BUY_PRICE"), SQLDataType.DECIMAL(10, 2).defaultValue(DSL.field("0.0", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>PRODUCT.MSRP</code>.
     */
    public final TableField<ProductRecord, BigDecimal> MSRP = createField(DSL.name("MSRP"), SQLDataType.DECIMAL(10, 2).defaultValue(DSL.field("0.0", SQLDataType.DECIMAL)), this, "");

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PRODUCT</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>PRODUCT</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    /**
     * Create a <code>PRODUCT</code> table reference
     */
    public Product() {
        this(DSL.name("PRODUCT"), null);
    }

    public <O extends Record> Product(Table<O> child, ForeignKey<O, ProductRecord> key) {
        super(child, key, PRODUCT);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRODUCT_LINE);
    }

    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1;
    }

    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.CONSTRAINT_1);
    }

    @Override
    public List<ForeignKey<ProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProductRecord, ?>>asList(Keys.PRODUCTS_IBFK_1);
    }

    public Productline productline() {
        return new Productline(this, Keys.PRODUCTS_IBFK_1);
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
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, Integer, BigDecimal, BigDecimal> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
