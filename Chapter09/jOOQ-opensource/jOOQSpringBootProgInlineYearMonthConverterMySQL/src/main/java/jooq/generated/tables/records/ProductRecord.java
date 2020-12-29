/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import java.math.BigDecimal;

import javax.annotation.processing.Generated;
import javax.validation.constraints.Size;

import jooq.generated.tables.Product;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record10<Long, String, String, String, String, String, Short, BigDecimal, BigDecimal, String> {

    private static final long serialVersionUID = -1058687287;

    /**
     * Setter for <code>classicmodels.product.product_id</code>.
     */
    public void setProductId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>classicmodels.product.product_name</code>.
     */
    public void setProductName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_name</code>.
     */
    @Size(max = 70)
    public String getProductName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.product.product_line</code>.
     */
    public void setProductLine(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_line</code>.
     */
    @Size(max = 50)
    public String getProductLine() {
        return (String) get(2);
    }

    /**
     * Setter for <code>classicmodels.product.product_scale</code>.
     */
    public void setProductScale(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_scale</code>.
     */
    @Size(max = 10)
    public String getProductScale() {
        return (String) get(3);
    }

    /**
     * Setter for <code>classicmodels.product.product_vendor</code>.
     */
    public void setProductVendor(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_vendor</code>.
     */
    @Size(max = 50)
    public String getProductVendor() {
        return (String) get(4);
    }

    /**
     * Setter for <code>classicmodels.product.product_description</code>.
     */
    public void setProductDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>classicmodels.product.product_description</code>.
     */
    @Size(max = 65535)
    public String getProductDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>classicmodels.product.quantity_in_stock</code>.
     */
    public void setQuantityInStock(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>classicmodels.product.quantity_in_stock</code>.
     */
    public Short getQuantityInStock() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>classicmodels.product.buy_price</code>.
     */
    public void setBuyPrice(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>classicmodels.product.buy_price</code>.
     */
    public BigDecimal getBuyPrice() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>classicmodels.product.msrp</code>.
     */
    public void setMsrp(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>classicmodels.product.msrp</code>.
     */
    public BigDecimal getMsrp() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>classicmodels.product.specs</code>.
     */
    public void setSpecs(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>classicmodels.product.specs</code>.
     */
    @Size(max = 16777215)
    public String getSpecs() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, String, String, String, String, Short, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, String, String, String, String, Short, BigDecimal, BigDecimal, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Product.PRODUCT.PRODUCT_ID;
    }

    @Override
    public Field<String> field2() {
        return Product.PRODUCT.PRODUCT_NAME;
    }

    @Override
    public Field<String> field3() {
        return Product.PRODUCT.PRODUCT_LINE;
    }

    @Override
    public Field<String> field4() {
        return Product.PRODUCT.PRODUCT_SCALE;
    }

    @Override
    public Field<String> field5() {
        return Product.PRODUCT.PRODUCT_VENDOR;
    }

    @Override
    public Field<String> field6() {
        return Product.PRODUCT.PRODUCT_DESCRIPTION;
    }

    @Override
    public Field<Short> field7() {
        return Product.PRODUCT.QUANTITY_IN_STOCK;
    }

    @Override
    public Field<BigDecimal> field8() {
        return Product.PRODUCT.BUY_PRICE;
    }

    @Override
    public Field<BigDecimal> field9() {
        return Product.PRODUCT.MSRP;
    }

    @Override
    public Field<String> field10() {
        return Product.PRODUCT.SPECS;
    }

    @Override
    public Long component1() {
        return getProductId();
    }

    @Override
    public String component2() {
        return getProductName();
    }

    @Override
    public String component3() {
        return getProductLine();
    }

    @Override
    public String component4() {
        return getProductScale();
    }

    @Override
    public String component5() {
        return getProductVendor();
    }

    @Override
    public String component6() {
        return getProductDescription();
    }

    @Override
    public Short component7() {
        return getQuantityInStock();
    }

    @Override
    public BigDecimal component8() {
        return getBuyPrice();
    }

    @Override
    public BigDecimal component9() {
        return getMsrp();
    }

    @Override
    public String component10() {
        return getSpecs();
    }

    @Override
    public Long value1() {
        return getProductId();
    }

    @Override
    public String value2() {
        return getProductName();
    }

    @Override
    public String value3() {
        return getProductLine();
    }

    @Override
    public String value4() {
        return getProductScale();
    }

    @Override
    public String value5() {
        return getProductVendor();
    }

    @Override
    public String value6() {
        return getProductDescription();
    }

    @Override
    public Short value7() {
        return getQuantityInStock();
    }

    @Override
    public BigDecimal value8() {
        return getBuyPrice();
    }

    @Override
    public BigDecimal value9() {
        return getMsrp();
    }

    @Override
    public String value10() {
        return getSpecs();
    }

    @Override
    public ProductRecord value1(Long value) {
        setProductId(value);
        return this;
    }

    @Override
    public ProductRecord value2(String value) {
        setProductName(value);
        return this;
    }

    @Override
    public ProductRecord value3(String value) {
        setProductLine(value);
        return this;
    }

    @Override
    public ProductRecord value4(String value) {
        setProductScale(value);
        return this;
    }

    @Override
    public ProductRecord value5(String value) {
        setProductVendor(value);
        return this;
    }

    @Override
    public ProductRecord value6(String value) {
        setProductDescription(value);
        return this;
    }

    @Override
    public ProductRecord value7(Short value) {
        setQuantityInStock(value);
        return this;
    }

    @Override
    public ProductRecord value8(BigDecimal value) {
        setBuyPrice(value);
        return this;
    }

    @Override
    public ProductRecord value9(BigDecimal value) {
        setMsrp(value);
        return this;
    }

    @Override
    public ProductRecord value10(String value) {
        setSpecs(value);
        return this;
    }

    @Override
    public ProductRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Short value7, BigDecimal value8, BigDecimal value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductRecord
     */
    public ProductRecord() {
        super(Product.PRODUCT);
    }

    /**
     * Create a detached, initialised ProductRecord
     */
    public ProductRecord(Long productId, String productName, String productLine, String productScale, String productVendor, String productDescription, Short quantityInStock, BigDecimal buyPrice, BigDecimal msrp, String specs) {
        super(Product.PRODUCT);

        set(0, productId);
        set(1, productName);
        set(2, productLine);
        set(3, productScale);
        set(4, productVendor);
        set(5, productDescription);
        set(6, quantityInStock);
        set(7, buyPrice);
        set(8, msrp);
        set(9, specs);
    }
}
