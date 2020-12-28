/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.annotation.processing.Generated;

import jooq.generated.tables.Svals;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


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
public class SvalsRecord extends TableRecordImpl<SvalsRecord> implements Record1<String> {

    private static final long serialVersionUID = 900814483;

    /**
     * Setter for <code>public.svals.svals</code>.
     */
    public void setSvals(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.svals.svals</code>.
     */
    public String getSvals() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Svals.SVALS.SVALS_;
    }

    @Override
    public String component1() {
        return getSvals();
    }

    @Override
    public String value1() {
        return getSvals();
    }

    @Override
    public SvalsRecord value1(String value) {
        setSvals(value);
        return this;
    }

    @Override
    public SvalsRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SvalsRecord
     */
    public SvalsRecord() {
        super(Svals.SVALS);
    }

    /**
     * Create a detached, initialised SvalsRecord
     */
    public SvalsRecord(String svals) {
        super(Svals.SVALS);

        set(0, svals);
    }
}
