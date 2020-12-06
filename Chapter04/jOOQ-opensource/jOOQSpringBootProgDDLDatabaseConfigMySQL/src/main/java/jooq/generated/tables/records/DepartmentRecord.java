/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Department;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record5<Long, String, String, Short, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>department.department_id</code>.
     */
    public void setDepartmentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>department.department_id</code>.
     */
    public Long getDepartmentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>department.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>department.name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>department.phone</code>.
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>department.phone</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>department.code</code>.
     */
    public void setCode(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>department.code</code>.
     */
    public Short getCode() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>department.office_code</code>.
     */
    public void setOfficeCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>department.office_code</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getOfficeCode() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Short, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, String, Short, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Department.DEPARTMENT.DEPARTMENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Department.DEPARTMENT.NAME;
    }

    @Override
    public Field<String> field3() {
        return Department.DEPARTMENT.PHONE;
    }

    @Override
    public Field<Short> field4() {
        return Department.DEPARTMENT.CODE;
    }

    @Override
    public Field<String> field5() {
        return Department.DEPARTMENT.OFFICE_CODE;
    }

    @Override
    public Long component1() {
        return getDepartmentId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPhone();
    }

    @Override
    public Short component4() {
        return getCode();
    }

    @Override
    public String component5() {
        return getOfficeCode();
    }

    @Override
    public Long value1() {
        return getDepartmentId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPhone();
    }

    @Override
    public Short value4() {
        return getCode();
    }

    @Override
    public String value5() {
        return getOfficeCode();
    }

    @Override
    public DepartmentRecord value1(Long value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public DepartmentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DepartmentRecord value3(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public DepartmentRecord value4(Short value) {
        setCode(value);
        return this;
    }

    @Override
    public DepartmentRecord value5(String value) {
        setOfficeCode(value);
        return this;
    }

    @Override
    public DepartmentRecord values(Long value1, String value2, String value3, Short value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DepartmentRecord
     */
    public DepartmentRecord() {
        super(Department.DEPARTMENT);
    }

    /**
     * Create a detached, initialised DepartmentRecord
     */
    public DepartmentRecord(Long departmentId, String name, String phone, Short code, String officeCode) {
        super(Department.DEPARTMENT);

        setDepartmentId(departmentId);
        setName(name);
        setPhone(phone);
        setCode(code);
        setOfficeCode(officeCode);
    }
}
