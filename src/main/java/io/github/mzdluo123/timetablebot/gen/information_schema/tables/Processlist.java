/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.ProcesslistRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Processlist extends TableImpl<ProcesslistRecord> {

    private static final long serialVersionUID = -1802611316;

    /**
     * The reference instance of <code>information_schema.PROCESSLIST</code>
     */
    public static final Processlist PROCESSLIST = new Processlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcesslistRecord> getRecordType() {
        return ProcesslistRecord.class;
    }

    /**
     * The column <code>information_schema.PROCESSLIST.ID</code>.
     */
    public final TableField<ProcesslistRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.USER</code>.
     */
    public final TableField<ProcesslistRecord, String> USER = createField(DSL.name("USER"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public final TableField<ProcesslistRecord, String> HOST = createField(DSL.name("HOST"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.DB</code>.
     */
    public final TableField<ProcesslistRecord, String> DB = createField(DSL.name("DB"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public final TableField<ProcesslistRecord, String> COMMAND = createField(DSL.name("COMMAND"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public final TableField<ProcesslistRecord, Integer> TIME = createField(DSL.name("TIME"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public final TableField<ProcesslistRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public final TableField<ProcesslistRecord, String> INFO = createField(DSL.name("INFO"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.TIME_MS</code>.
     */
    public final TableField<ProcesslistRecord, BigDecimal> TIME_MS = createField(DSL.name("TIME_MS"), org.jooq.impl.SQLDataType.DECIMAL(22, 3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.STAGE</code>.
     */
    public final TableField<ProcesslistRecord, Byte> STAGE = createField(DSL.name("STAGE"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.MAX_STAGE</code>.
     */
    public final TableField<ProcesslistRecord, Byte> MAX_STAGE = createField(DSL.name("MAX_STAGE"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.PROGRESS</code>.
     */
    public final TableField<ProcesslistRecord, BigDecimal> PROGRESS = createField(DSL.name("PROGRESS"), org.jooq.impl.SQLDataType.DECIMAL(7, 3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.MEMORY_USED</code>.
     */
    public final TableField<ProcesslistRecord, Long> MEMORY_USED = createField(DSL.name("MEMORY_USED"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.MAX_MEMORY_USED</code>.
     */
    public final TableField<ProcesslistRecord, Long> MAX_MEMORY_USED = createField(DSL.name("MAX_MEMORY_USED"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.EXAMINED_ROWS</code>.
     */
    public final TableField<ProcesslistRecord, Integer> EXAMINED_ROWS = createField(DSL.name("EXAMINED_ROWS"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.QUERY_ID</code>.
     */
    public final TableField<ProcesslistRecord, Long> QUERY_ID = createField(DSL.name("QUERY_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.INFO_BINARY</code>.
     */
    public final TableField<ProcesslistRecord, byte[]> INFO_BINARY = createField(DSL.name("INFO_BINARY"), org.jooq.impl.SQLDataType.BLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BLOB)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.TID</code>.
     */
    public final TableField<ProcesslistRecord, Long> TID = createField(DSL.name("TID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist() {
        this(DSL.name("PROCESSLIST"), null);
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist(String alias) {
        this(DSL.name(alias), PROCESSLIST);
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist(Name alias) {
        this(alias, PROCESSLIST);
    }

    private Processlist(Name alias, Table<ProcesslistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Processlist(Name alias, Table<ProcesslistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Processlist(Table<O> child, ForeignKey<O, ProcesslistRecord> key) {
        super(child, key, PROCESSLIST);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Processlist as(String alias) {
        return new Processlist(DSL.name(alias), this);
    }

    @Override
    public Processlist as(Name alias) {
        return new Processlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(String name) {
        return new Processlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(Name name) {
        return new Processlist(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, String, String, String, Integer, String, String, BigDecimal, Byte, Byte, BigDecimal, Long, Long, Integer, Long, byte[], Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
