/*
 * This file is generated by jOOQ.
 */
package jooq.generated.udt;


import javax.annotation.processing.Generated;

import jooq.generated.Public;
import jooq.generated.udt.records.EvaluationCriteriaRecord;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EvaluationCriteria extends UDTImpl<EvaluationCriteriaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.evaluation_criteria</code>
     */
    public static final EvaluationCriteria EVALUATION_CRITERIA = new EvaluationCriteria();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EvaluationCriteriaRecord> getRecordType() {
        return EvaluationCriteriaRecord.class;
    }

    /**
     * The attribute <code>public.evaluation_criteria.communication_ability</code>.
     */
    public static final UDTField<EvaluationCriteriaRecord, Integer> COMMUNICATION_ABILITY = createField(DSL.name("communication_ability"), SQLDataType.INTEGER, EVALUATION_CRITERIA, "");

    /**
     * The attribute <code>public.evaluation_criteria.ethics</code>.
     */
    public static final UDTField<EvaluationCriteriaRecord, Integer> ETHICS = createField(DSL.name("ethics"), SQLDataType.INTEGER, EVALUATION_CRITERIA, "");

    /**
     * The attribute <code>public.evaluation_criteria.performance</code>.
     */
    public static final UDTField<EvaluationCriteriaRecord, Integer> PERFORMANCE = createField(DSL.name("performance"), SQLDataType.INTEGER, EVALUATION_CRITERIA, "");

    /**
     * The attribute <code>public.evaluation_criteria.employee_input</code>.
     */
    public static final UDTField<EvaluationCriteriaRecord, Integer> EMPLOYEE_INPUT = createField(DSL.name("employee_input"), SQLDataType.INTEGER, EVALUATION_CRITERIA, "");

    /**
     * No further instances allowed
     */
    private EvaluationCriteria() {
        super("evaluation_criteria", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}