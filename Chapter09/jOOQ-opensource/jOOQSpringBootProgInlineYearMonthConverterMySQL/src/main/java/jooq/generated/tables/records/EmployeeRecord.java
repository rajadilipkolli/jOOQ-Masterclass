/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Employee;

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
public class EmployeeRecord extends UpdatableRecordImpl<EmployeeRecord> implements Record10<Long, String, String, String, String, String, Integer, Long, String, String> {

    private static final long serialVersionUID = 514083038;

    /**
     * Setter for <code>classicmodels.employee.employee_number</code>.
     */
    public void setEmployeeNumber(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.employee.employee_number</code>.
     */
    @NotNull
    public Long getEmployeeNumber() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>classicmodels.employee.last_name</code>.
     */
    public void setLastName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.employee.last_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getLastName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>classicmodels.employee.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.employee.first_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>classicmodels.employee.extension</code>.
     */
    public void setExtension(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.employee.extension</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getExtension() {
        return (String) get(3);
    }

    /**
     * Setter for <code>classicmodels.employee.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>classicmodels.employee.email</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>classicmodels.employee.office_code</code>.
     */
    public void setOfficeCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>classicmodels.employee.office_code</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getOfficeCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>classicmodels.employee.salary</code>.
     */
    public void setSalary(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>classicmodels.employee.salary</code>.
     */
    @NotNull
    public Integer getSalary() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>classicmodels.employee.reports_to</code>.
     */
    public void setReportsTo(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>classicmodels.employee.reports_to</code>.
     */
    public Long getReportsTo() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>classicmodels.employee.job_title</code>.
     */
    public void setJobTitle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>classicmodels.employee.job_title</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getJobTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>classicmodels.employee.employee_of_year</code>.
     */
    public void setEmployeeOfYear(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>classicmodels.employee.employee_of_year</code>.
     */
    @Size(max = 50)
    public String getEmployeeOfYear() {
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
    public Row10<Long, String, String, String, String, String, Integer, Long, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, String, String, String, String, Integer, Long, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Employee.EMPLOYEE.EMPLOYEE_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return Employee.EMPLOYEE.LAST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Employee.EMPLOYEE.FIRST_NAME;
    }

    @Override
    public Field<String> field4() {
        return Employee.EMPLOYEE.EXTENSION;
    }

    @Override
    public Field<String> field5() {
        return Employee.EMPLOYEE.EMAIL;
    }

    @Override
    public Field<String> field6() {
        return Employee.EMPLOYEE.OFFICE_CODE;
    }

    @Override
    public Field<Integer> field7() {
        return Employee.EMPLOYEE.SALARY;
    }

    @Override
    public Field<Long> field8() {
        return Employee.EMPLOYEE.REPORTS_TO;
    }

    @Override
    public Field<String> field9() {
        return Employee.EMPLOYEE.JOB_TITLE;
    }

    @Override
    public Field<String> field10() {
        return Employee.EMPLOYEE.EMPLOYEE_OF_YEAR;
    }

    @Override
    public Long component1() {
        return getEmployeeNumber();
    }

    @Override
    public String component2() {
        return getLastName();
    }

    @Override
    public String component3() {
        return getFirstName();
    }

    @Override
    public String component4() {
        return getExtension();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public String component6() {
        return getOfficeCode();
    }

    @Override
    public Integer component7() {
        return getSalary();
    }

    @Override
    public Long component8() {
        return getReportsTo();
    }

    @Override
    public String component9() {
        return getJobTitle();
    }

    @Override
    public String component10() {
        return getEmployeeOfYear();
    }

    @Override
    public Long value1() {
        return getEmployeeNumber();
    }

    @Override
    public String value2() {
        return getLastName();
    }

    @Override
    public String value3() {
        return getFirstName();
    }

    @Override
    public String value4() {
        return getExtension();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public String value6() {
        return getOfficeCode();
    }

    @Override
    public Integer value7() {
        return getSalary();
    }

    @Override
    public Long value8() {
        return getReportsTo();
    }

    @Override
    public String value9() {
        return getJobTitle();
    }

    @Override
    public String value10() {
        return getEmployeeOfYear();
    }

    @Override
    public EmployeeRecord value1(Long value) {
        setEmployeeNumber(value);
        return this;
    }

    @Override
    public EmployeeRecord value2(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public EmployeeRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public EmployeeRecord value4(String value) {
        setExtension(value);
        return this;
    }

    @Override
    public EmployeeRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public EmployeeRecord value6(String value) {
        setOfficeCode(value);
        return this;
    }

    @Override
    public EmployeeRecord value7(Integer value) {
        setSalary(value);
        return this;
    }

    @Override
    public EmployeeRecord value8(Long value) {
        setReportsTo(value);
        return this;
    }

    @Override
    public EmployeeRecord value9(String value) {
        setJobTitle(value);
        return this;
    }

    @Override
    public EmployeeRecord value10(String value) {
        setEmployeeOfYear(value);
        return this;
    }

    @Override
    public EmployeeRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Integer value7, Long value8, String value9, String value10) {
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
     * Create a detached EmployeeRecord
     */
    public EmployeeRecord() {
        super(Employee.EMPLOYEE);
    }

    /**
     * Create a detached, initialised EmployeeRecord
     */
    public EmployeeRecord(Long employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, Integer salary, Long reportsTo, String jobTitle, String employeeOfYear) {
        super(Employee.EMPLOYEE);

        set(0, employeeNumber);
        set(1, lastName);
        set(2, firstName);
        set(3, extension);
        set(4, email);
        set(5, officeCode);
        set(6, salary);
        set(7, reportsTo);
        set(8, jobTitle);
        set(9, employeeOfYear);
    }
}
