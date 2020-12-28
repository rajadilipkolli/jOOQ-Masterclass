/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.time.LocalDate;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Order;
import jooq.generated.tables.pojos.JooqOrder;
import jooq.generated.tables.records.OrderRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class OrderRepository extends DAOImpl<OrderRecord, JooqOrder, Long> {

    /**
     * Create a new OrderRepository without any configuration
     */
    public OrderRepository() {
        super(Order.ORDER, JooqOrder.class);
    }

    /**
     * Create a new OrderRepository with an attached configuration
     */
    @Autowired
    public OrderRepository(Configuration configuration) {
        super(Order.ORDER, JooqOrder.class, configuration);
    }

    @Override
    public Long getId(JooqOrder object) {
        return object.getOrderId();
    }

    /**
     * Fetch records that have <code>order_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfOrderId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Order.ORDER.ORDER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<JooqOrder> fetchByOrderId(Long... values) {
        return fetch(Order.ORDER.ORDER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>order_id = value</code>
     */
    public JooqOrder fetchOneByOrderId(Long value) {
        return fetchOne(Order.ORDER.ORDER_ID, value);
    }

    /**
     * Fetch records that have <code>order_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfOrderDate(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Order.ORDER.ORDER_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_date IN (values)</code>
     */
    public List<JooqOrder> fetchByOrderDate(LocalDate... values) {
        return fetch(Order.ORDER.ORDER_DATE, values);
    }

    /**
     * Fetch records that have <code>required_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfRequiredDate(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Order.ORDER.REQUIRED_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>required_date IN (values)</code>
     */
    public List<JooqOrder> fetchByRequiredDate(LocalDate... values) {
        return fetch(Order.ORDER.REQUIRED_DATE, values);
    }

    /**
     * Fetch records that have <code>shipped_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfShippedDate(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(Order.ORDER.SHIPPED_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>shipped_date IN (values)</code>
     */
    public List<JooqOrder> fetchByShippedDate(LocalDate... values) {
        return fetch(Order.ORDER.SHIPPED_DATE, values);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfStatus(String lowerInclusive, String upperInclusive) {
        return fetchRange(Order.ORDER.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<JooqOrder> fetchByStatus(String... values) {
        return fetch(Order.ORDER.STATUS, values);
    }

    /**
     * Fetch records that have <code>comments BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfComments(String lowerInclusive, String upperInclusive) {
        return fetchRange(Order.ORDER.COMMENTS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>comments IN (values)</code>
     */
    public List<JooqOrder> fetchByComments(String... values) {
        return fetch(Order.ORDER.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>customer_number BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqOrder> fetchRangeOfCustomerNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Order.ORDER.CUSTOMER_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_number IN (values)</code>
     */
    public List<JooqOrder> fetchByCustomerNumber(Long... values) {
        return fetch(Order.ORDER.CUSTOMER_NUMBER, values);
    }
}
