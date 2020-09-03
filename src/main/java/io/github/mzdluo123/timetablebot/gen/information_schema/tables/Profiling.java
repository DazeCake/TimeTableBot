/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.ProfilingRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Profiling extends TableImpl<ProfilingRecord> {

    private static final long serialVersionUID = -1605786981;

    /**
     * The reference instance of <code>information_schema.PROFILING</code>
     */
    public static final Profiling PROFILING = new Profiling();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfilingRecord> getRecordType() {
        return ProfilingRecord.class;
    }

    /**
     * The column <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public final TableField<ProfilingRecord, Integer> QUERY_ID = createField(DSL.name("QUERY_ID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SEQ</code>.
     */
    public final TableField<ProfilingRecord, Integer> SEQ = createField(DSL.name("SEQ"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.STATE</code>.
     */
    public final TableField<ProfilingRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.DURATION</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> DURATION = createField(DSL.name("DURATION"), org.jooq.impl.SQLDataType.DECIMAL(9, 6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> CPU_USER = createField(DSL.name("CPU_USER"), org.jooq.impl.SQLDataType.DECIMAL(9, 6).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public final TableField<ProfilingRecord, BigDecimal> CPU_SYSTEM = createField(DSL.name("CPU_SYSTEM"), org.jooq.impl.SQLDataType.DECIMAL(9, 6).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public final TableField<ProfilingRecord, Integer> CONTEXT_VOLUNTARY = createField(DSL.name("CONTEXT_VOLUNTARY"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public final TableField<ProfilingRecord, Integer> CONTEXT_INVOLUNTARY = createField(DSL.name("CONTEXT_INVOLUNTARY"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public final TableField<ProfilingRecord, Integer> BLOCK_OPS_IN = createField(DSL.name("BLOCK_OPS_IN"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public final TableField<ProfilingRecord, Integer> BLOCK_OPS_OUT = createField(DSL.name("BLOCK_OPS_OUT"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public final TableField<ProfilingRecord, Integer> MESSAGES_SENT = createField(DSL.name("MESSAGES_SENT"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public final TableField<ProfilingRecord, Integer> MESSAGES_RECEIVED = createField(DSL.name("MESSAGES_RECEIVED"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public final TableField<ProfilingRecord, Integer> PAGE_FAULTS_MAJOR = createField(DSL.name("PAGE_FAULTS_MAJOR"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public final TableField<ProfilingRecord, Integer> PAGE_FAULTS_MINOR = createField(DSL.name("PAGE_FAULTS_MINOR"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SWAPS</code>.
     */
    public final TableField<ProfilingRecord, Integer> SWAPS = createField(DSL.name("SWAPS"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public final TableField<ProfilingRecord, String> SOURCE_FUNCTION = createField(DSL.name("SOURCE_FUNCTION"), org.jooq.impl.SQLDataType.VARCHAR(30).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public final TableField<ProfilingRecord, String> SOURCE_FILE = createField(DSL.name("SOURCE_FILE"), org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public final TableField<ProfilingRecord, Integer> SOURCE_LINE = createField(DSL.name("SOURCE_LINE"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.PROFILING</code> table reference
     */
    public Profiling() {
        this(DSL.name("PROFILING"), null);
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table reference
     */
    public Profiling(String alias) {
        this(DSL.name(alias), PROFILING);
    }

    /**
     * Create an aliased <code>information_schema.PROFILING</code> table reference
     */
    public Profiling(Name alias) {
        this(alias, PROFILING);
    }

    private Profiling(Name alias, Table<ProfilingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Profiling(Name alias, Table<ProfilingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Profiling(Table<O> child, ForeignKey<O, ProfilingRecord> key) {
        super(child, key, PROFILING);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Profiling as(String alias) {
        return new Profiling(DSL.name(alias), this);
    }

    @Override
    public Profiling as(Name alias) {
        return new Profiling(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(String name) {
        return new Profiling(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Profiling rename(Name name) {
        return new Profiling(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
