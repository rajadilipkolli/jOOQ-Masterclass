/*
 * This file is generated by jOOQ.
 */
package jooq.generated.routines;


import javax.annotation.processing.Generated;

import jooq.generated.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


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
public class SliceArray extends AbstractRoutine<String[]> {

    private static final long serialVersionUID = 1651443319;

    /**
     * The parameter <code>public.slice_array.RETURN_VALUE</code>.
     */
    public static final Parameter<String[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"hstore\""), false, true);

    /**
     * The parameter <code>public.slice_array._2</code>.
     */
    public static final Parameter<String[]> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public SliceArray() {
        super("slice_array", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String[] value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<String[]> field) {
        setField(_2, field);
    }
}
