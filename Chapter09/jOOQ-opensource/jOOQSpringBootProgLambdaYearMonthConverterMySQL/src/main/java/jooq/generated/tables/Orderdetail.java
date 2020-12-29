/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Classicmodels;
import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.tables.records.OrderdetailRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
    date = "2020-12-29T07:38:31.604Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Orderdetail extends TableImpl<OrderdetailRecord> {

    private static final long serialVersionUID = -1858320249;

    /**
     * The reference instance of <code>classicmodels.orderdetail</code>
     */
    public static final Orderdetail ORDERDETAIL = new Orderdetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderdetailRecord> getRecordType() {
        return OrderdetailRecord.class;
    }

    /**
     * The column <code>classicmodels.orderdetail.order_id</code>.
     */
    public final TableField<OrderdetailRecord, Long> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetail.product_id</code>.
     */
    public final TableField<OrderdetailRecord, Long> PRODUCT_ID = createField(DSL.name("product_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetail.quantity_ordered</code>.
     */
    public final TableField<OrderdetailRecord, Integer> QUANTITY_ORDERED = createField(DSL.name("quantity_ordered"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetail.price_each</code>.
     */
    public final TableField<OrderdetailRecord, BigDecimal> PRICE_EACH = createField(DSL.name("price_each"), org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>classicmodels.orderdetail.order_line_number</code>.
     */
    public final TableField<OrderdetailRecord, Short> ORDER_LINE_NUMBER = createField(DSL.name("order_line_number"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>classicmodels.orderdetail</code> table reference
     */
    public Orderdetail() {
        this(DSL.name("orderdetail"), null);
    }

    /**
     * Create an aliased <code>classicmodels.orderdetail</code> table reference
     */
    public Orderdetail(String alias) {
        this(DSL.name(alias), ORDERDETAIL);
    }

    /**
     * Create an aliased <code>classicmodels.orderdetail</code> table reference
     */
    public Orderdetail(Name alias) {
        this(alias, ORDERDETAIL);
    }

    private Orderdetail(Name alias, Table<OrderdetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private Orderdetail(Name alias, Table<OrderdetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Orderdetail(Table<O> child, ForeignKey<O, OrderdetailRecord> key) {
        super(child, key, ORDERDETAIL);
    }

    @Override
    public Schema getSchema() {
        return Classicmodels.CLASSICMODELS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDERDETAIL_PRODUCT_ID);
    }

    @Override
    public UniqueKey<OrderdetailRecord> getPrimaryKey() {
        return Keys.KEY_ORDERDETAIL_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderdetailRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderdetailRecord>>asList(Keys.KEY_ORDERDETAIL_PRIMARY);
    }

    @Override
    public List<ForeignKey<OrderdetailRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderdetailRecord, ?>>asList(Keys.ORDERDETAILS_IBFK_1, Keys.ORDERDETAILS_IBFK_2);
    }

    public Order order() {
        return new Order(this, Keys.ORDERDETAILS_IBFK_1);
    }

    public Product product() {
        return new Product(this, Keys.ORDERDETAILS_IBFK_2);
    }

    @Override
    public Orderdetail as(String alias) {
        return new Orderdetail(DSL.name(alias), this);
    }

    @Override
    public Orderdetail as(Name alias) {
        return new Orderdetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Orderdetail rename(String name) {
        return new Orderdetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Orderdetail rename(Name name) {
        return new Orderdetail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Integer, BigDecimal, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
