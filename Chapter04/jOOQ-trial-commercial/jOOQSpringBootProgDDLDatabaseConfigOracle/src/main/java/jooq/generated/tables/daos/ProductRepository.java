/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.math.BigDecimal;
import java.util.List;

import jooq.generated.tables.Product;
import jooq.generated.tables.pojos.JooqProduct;
import jooq.generated.tables.records.ProductRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ProductRepository extends DAOImpl<ProductRecord, JooqProduct, Long> {

    /**
     * Create a new ProductRepository without any configuration
     */
    public ProductRepository() {
        super(Product.PRODUCT, JooqProduct.class);
    }

    /**
     * Create a new ProductRepository with an attached configuration
     */
    @Autowired
    public ProductRepository(Configuration configuration) {
        super(Product.PRODUCT, JooqProduct.class, configuration);
    }

    @Override
    public Long getId(JooqProduct object) {
        return object.getProductId();
    }

    /**
     * Fetch records that have <code>PRODUCT_ID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_ID IN (values)</code>
     */
    public List<JooqProduct> fetchByProductId(Long... values) {
        return fetch(Product.PRODUCT.PRODUCT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PRODUCT_ID = value</code>
     */
    public JooqProduct fetchOneByProductId(Long value) {
        return fetchOne(Product.PRODUCT.PRODUCT_ID, value);
    }

    /**
     * Fetch records that have <code>PRODUCT_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_NAME IN (values)</code>
     */
    public List<JooqProduct> fetchByProductName(String... values) {
        return fetch(Product.PRODUCT.PRODUCT_NAME, values);
    }

    /**
     * Fetch records that have <code>PRODUCT_LINE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductLine(String lowerInclusive, String upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_LINE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_LINE IN (values)</code>
     */
    public List<JooqProduct> fetchByProductLine(String... values) {
        return fetch(Product.PRODUCT.PRODUCT_LINE, values);
    }

    /**
     * Fetch records that have <code>PRODUCT_SCALE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductScale(String lowerInclusive, String upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_SCALE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_SCALE IN (values)</code>
     */
    public List<JooqProduct> fetchByProductScale(String... values) {
        return fetch(Product.PRODUCT.PRODUCT_SCALE, values);
    }

    /**
     * Fetch records that have <code>PRODUCT_VENDOR BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductVendor(String lowerInclusive, String upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_VENDOR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_VENDOR IN (values)</code>
     */
    public List<JooqProduct> fetchByProductVendor(String... values) {
        return fetch(Product.PRODUCT.PRODUCT_VENDOR, values);
    }

    /**
     * Fetch records that have <code>PRODUCT_DESCRIPTION BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfProductDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCT_DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PRODUCT_DESCRIPTION IN (values)</code>
     */
    public List<JooqProduct> fetchByProductDescription(String... values) {
        return fetch(Product.PRODUCT.PRODUCT_DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>QUANTITY_IN_STOCK BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfQuantityInStock(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Product.PRODUCT.QUANTITY_IN_STOCK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>QUANTITY_IN_STOCK IN (values)</code>
     */
    public List<JooqProduct> fetchByQuantityInStock(Integer... values) {
        return fetch(Product.PRODUCT.QUANTITY_IN_STOCK, values);
    }

    /**
     * Fetch records that have <code>BUY_PRICE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfBuyPrice(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Product.PRODUCT.BUY_PRICE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>BUY_PRICE IN (values)</code>
     */
    public List<JooqProduct> fetchByBuyPrice(BigDecimal... values) {
        return fetch(Product.PRODUCT.BUY_PRICE, values);
    }

    /**
     * Fetch records that have <code>MSRP BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqProduct> fetchRangeOfMsrp(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Product.PRODUCT.MSRP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>MSRP IN (values)</code>
     */
    public List<JooqProduct> fetchByMsrp(BigDecimal... values) {
        return fetch(Product.PRODUCT.MSRP, values);
    }
}
