/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.math.BigDecimal;
import java.util.List;

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
     * Fetch records that have <code>CUSTOMER_NUMBER BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCustomerNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CUSTOMER_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMER_NUMBER IN (values)</code>
     */
    public List<JooqCustomer> fetchByCustomerNumber(Long... values) {
        return fetch(Customer.CUSTOMER.CUSTOMER_NUMBER, values);
    }

    /**
     * Fetch a unique record that has <code>CUSTOMER_NUMBER = value</code>
     */
    public JooqCustomer fetchOneByCustomerNumber(Long value) {
        return fetchOne(Customer.CUSTOMER.CUSTOMER_NUMBER, value);
    }

    /**
     * Fetch records that have <code>CUSTOMER_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCustomerName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CUSTOMER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMER_NAME IN (values)</code>
     */
    public List<JooqCustomer> fetchByCustomerName(String... values) {
        return fetch(Customer.CUSTOMER.CUSTOMER_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTACT_LAST_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfContactLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CONTACT_LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CONTACT_LAST_NAME IN (values)</code>
     */
    public List<JooqCustomer> fetchByContactLastName(String... values) {
        return fetch(Customer.CUSTOMER.CONTACT_LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTACT_FIRST_NAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfContactFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CONTACT_FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CONTACT_FIRST_NAME IN (values)</code>
     */
    public List<JooqCustomer> fetchByContactFirstName(String... values) {
        return fetch(Customer.CUSTOMER.CONTACT_FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>PHONE BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PHONE IN (values)</code>
     */
    public List<JooqCustomer> fetchByPhone(String... values) {
        return fetch(Customer.CUSTOMER.PHONE, values);
    }

    /**
     * Fetch records that have <code>SALES_REP_EMPLOYEE_NUMBER BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfSalesRepEmployeeNumber(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Customer.CUSTOMER.SALES_REP_EMPLOYEE_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>SALES_REP_EMPLOYEE_NUMBER IN (values)</code>
     */
    public List<JooqCustomer> fetchBySalesRepEmployeeNumber(Long... values) {
        return fetch(Customer.CUSTOMER.SALES_REP_EMPLOYEE_NUMBER, values);
    }

    /**
     * Fetch records that have <code>CREDIT_LIMIT BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqCustomer> fetchRangeOfCreditLimit(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CREDIT_LIMIT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CREDIT_LIMIT IN (values)</code>
     */
    public List<JooqCustomer> fetchByCreditLimit(BigDecimal... values) {
        return fetch(Customer.CUSTOMER.CREDIT_LIMIT, values);
    }
}
