/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.GlobalVariables;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalVariablesRecord extends TableRecordImpl<GlobalVariablesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -394667614;

    /**
     * Setter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GlobalVariables.GLOBAL_VARIABLES.VARIABLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return GlobalVariables.GLOBAL_VARIABLES.VARIABLE_VALUE;
    }

    @Override
    public String component1() {
        return getVariableName();
    }

    @Override
    public String component2() {
        return getVariableValue();
    }

    @Override
    public String value1() {
        return getVariableName();
    }

    @Override
    public String value2() {
        return getVariableValue();
    }

    @Override
    public GlobalVariablesRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public GlobalVariablesRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    @Override
    public GlobalVariablesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GlobalVariablesRecord
     */
    public GlobalVariablesRecord() {
        super(GlobalVariables.GLOBAL_VARIABLES);
    }

    /**
     * Create a detached, initialised GlobalVariablesRecord
     */
    public GlobalVariablesRecord(String variableName, String variableValue) {
        super(GlobalVariables.GLOBAL_VARIABLES);

        set(0, variableName);
        set(1, variableValue);
    }
}
