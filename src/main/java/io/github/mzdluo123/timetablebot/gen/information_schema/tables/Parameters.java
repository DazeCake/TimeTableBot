/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.ParametersRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<ParametersRecord> {

    private static final long serialVersionUID = 1777689745;

    /**
     * The reference instance of <code>information_schema.PARAMETERS</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParametersRecord> getRecordType() {
        return ParametersRecord.class;
    }

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public final TableField<ParametersRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_MODE = createField(DSL.name("PARAMETER_MODE"), org.jooq.impl.SQLDataType.VARCHAR(5).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_NAME = createField(DSL.name("PARAMETER_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public final TableField<ParametersRecord, ULong> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public final TableField<ParametersRecord, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), org.jooq.impl.SQLDataType.CLOB.nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> ROUTINE_TYPE = createField(DSL.name("ROUTINE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters() {
        this(DSL.name("PARAMETERS"), null);
    }

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters(String alias) {
        this(DSL.name(alias), PARAMETERS);
    }

    /**
     * Create an aliased <code>information_schema.PARAMETERS</code> table reference
     */
    public Parameters(Name alias) {
        this(alias, PARAMETERS);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, ParametersRecord> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Parameters as(String alias) {
        return new Parameters(DSL.name(alias), this);
    }

    @Override
    public Parameters as(Name alias) {
        return new Parameters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(String name) {
        return new Parameters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Name name) {
        return new Parameters(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, Integer, String, String, String, Integer, Integer, Integer, Integer, ULong, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
