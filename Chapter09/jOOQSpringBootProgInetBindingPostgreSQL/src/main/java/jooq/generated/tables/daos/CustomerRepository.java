/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.math.BigDecimal;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Customer;
import jooq.generated.tables.pojos.JooqCustomer;
import jooq.generated.tables.records.CustomerRecord;

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
public class CustomerRepository extends DAOImpl<CustomerRecord, JooqCustomer, Long> {

    /**
     * Create a new CustomerRepository without any configuration
     */
    public CustomerRepository() {
        super(Customer.CUSTOMER, JooqCustomer.class);
    }

    /**
     * Create a new CustomerRepository with an attached configuration
     */
    @Autowired
    public CustomerRepository(Configuration configuration) {
        super(Customer.CUSTOMER, JooqCustomer.class, configuration);
    }

    @Override
    public Long getId(JooqCustomer object) {
        return object.getCustomerNumber();
    }

    /**
     * Fetch records that have <code>customer_number BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCustomerNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CUSTOMER_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_number IN (values)</code>
     */
    public List<JooqCustomer> fetchByCustomerNumber(Long... values) {
        return fetch(Customer.CUSTOMER.CUSTOMER_NUMBER, values);
    }

    /**
     * Fetch a unique record that has <code>customer_number = value</code>
     */
    public JooqCustomer fetchOneByCustomerNumber(Long value) {
        return fetchOne(Customer.CUSTOMER.CUSTOMER_NUMBER, value);
    }

    /**
     * Fetch records that have <code>customer_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCustomerName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CUSTOMER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_name IN (values)</code>
     */
    public List<JooqCustomer> fetchByCustomerName(String... values) {
        return fetch(Customer.CUSTOMER.CUSTOMER_NAME, values);
    }

    /**
     * Fetch records that have <code>contact_last_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfContactLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CONTACT_LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>contact_last_name IN (values)</code>
     */
    public List<JooqCustomer> fetchByContactLastName(String... values) {
        return fetch(Customer.CUSTOMER.CONTACT_LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>contact_first_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfContactFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CONTACT_FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>contact_first_name IN (values)</code>
     */
    public List<JooqCustomer> fetchByContactFirstName(String... values) {
        return fetch(Customer.CUSTOMER.CONTACT_FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<JooqCustomer> fetchByPhone(String... values) {
        return fetch(Customer.CUSTOMER.PHONE, values);
    }

    /**
     * Fetch records that have <code>sales_rep_employee_number BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfSalesRepEmployeeNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Customer.CUSTOMER.SALES_REP_EMPLOYEE_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>sales_rep_employee_number IN (values)</code>
     */
    public List<JooqCustomer> fetchBySalesRepEmployeeNumber(Long... values) {
        return fetch(Customer.CUSTOMER.SALES_REP_EMPLOYEE_NUMBER, values);
    }

    /**
     * Fetch records that have <code>credit_limit BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCreditLimit(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CREDIT_LIMIT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>credit_limit IN (values)</code>
     */
    public List<JooqCustomer> fetchByCreditLimit(BigDecimal... values) {
        return fetch(Customer.CUSTOMER.CREDIT_LIMIT, values);
    }

    /**
     * Fetch records that have <code>first_buy_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfFirstBuyDate(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Customer.CUSTOMER.FIRST_BUY_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_buy_date IN (values)</code>
     */
    public List<JooqCustomer> fetchByFirstBuyDate(Integer... values) {
        return fetch(Customer.CUSTOMER.FIRST_BUY_DATE, values);
    }
}
