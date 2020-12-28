/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.net.InetAddress;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Department;
import jooq.generated.tables.pojos.JooqDepartment;
import jooq.generated.tables.records.DepartmentRecord;

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
public class DepartmentRepository extends DAOImpl<DepartmentRecord, JooqDepartment, Integer> {

    /**
     * Create a new DepartmentRepository without any configuration
     */
    public DepartmentRepository() {
        super(Department.DEPARTMENT, JooqDepartment.class);
    }

    /**
     * Create a new DepartmentRepository with an attached configuration
     */
    @Autowired
    public DepartmentRepository(Configuration configuration) {
        super(Department.DEPARTMENT, JooqDepartment.class, configuration);
    }

    @Override
    public Integer getId(JooqDepartment object) {
        return object.getDepartmentId();
    }

    /**
     * Fetch records that have <code>department_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfDepartmentId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Department.DEPARTMENT.DEPARTMENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>department_id IN (values)</code>
     */
    public List<JooqDepartment> fetchByDepartmentId(Integer... values) {
        return fetch(Department.DEPARTMENT.DEPARTMENT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>department_id = value</code>
     */
    public JooqDepartment fetchOneByDepartmentId(Integer value) {
        return fetchOne(Department.DEPARTMENT.DEPARTMENT_ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Department.DEPARTMENT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<JooqDepartment> fetchByName(String... values) {
        return fetch(Department.DEPARTMENT.NAME, values);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Department.DEPARTMENT.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<JooqDepartment> fetchByPhone(String... values) {
        return fetch(Department.DEPARTMENT.PHONE, values);
    }

    /**
     * Fetch records that have <code>code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfCode(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Department.DEPARTMENT.CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<JooqDepartment> fetchByCode(Short... values) {
        return fetch(Department.DEPARTMENT.CODE, values);
    }

    /**
     * Fetch records that have <code>office_code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfOfficeCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Department.DEPARTMENT.OFFICE_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>office_code IN (values)</code>
     */
    public List<JooqDepartment> fetchByOfficeCode(String... values) {
        return fetch(Department.DEPARTMENT.OFFICE_CODE, values);
    }

    /**
     * Fetch records that have <code>topic BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfTopic(String[] lowerInclusive, String[] upperInclusive) {
        return fetchRange(Department.DEPARTMENT.TOPIC, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>topic IN (values)</code>
     */
    public List<JooqDepartment> fetchByTopic(String[]... values) {
        return fetch(Department.DEPARTMENT.TOPIC, values);
    }

    /**
     * Fetch records that have <code>dep_net_ipv4 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqDepartment> fetchRangeOfDepNetIpv4(InetAddress lowerInclusive, InetAddress upperInclusive) {
        return fetchRange(Department.DEPARTMENT.DEP_NET_IPV4, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>dep_net_ipv4 IN (values)</code>
     */
    public List<JooqDepartment> fetchByDepNetIpv4(InetAddress... values) {
        return fetch(Department.DEPARTMENT.DEP_NET_IPV4, values);
    }
}
