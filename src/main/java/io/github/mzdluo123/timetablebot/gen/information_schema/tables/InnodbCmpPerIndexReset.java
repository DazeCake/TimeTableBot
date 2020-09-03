/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.InnodbCmpPerIndexResetRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class InnodbCmpPerIndexReset extends TableImpl<InnodbCmpPerIndexResetRecord> {

    private static final long serialVersionUID = 1850112364;

    /**
     * The reference instance of <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>
     */
    public static final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = new InnodbCmpPerIndexReset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpPerIndexResetRecord> getRecordType() {
        return InnodbCmpPerIndexResetRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.database_name</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, String> DATABASE_NAME = createField(DSL.name("database_name"), org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.table_name</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.index_name</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, String> INDEX_NAME = createField(DSL.name("index_name"), org.jooq.impl.SQLDataType.VARCHAR(192).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_time</code>.
     */
    public final TableField<InnodbCmpPerIndexResetRecord, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset() {
        this(DSL.name("INNODB_CMP_PER_INDEX_RESET"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset(String alias) {
        this(DSL.name(alias), INNODB_CMP_PER_INDEX_RESET);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset(Name alias) {
        this(alias, INNODB_CMP_PER_INDEX_RESET);
    }

    private InnodbCmpPerIndexReset(Name alias, Table<InnodbCmpPerIndexResetRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpPerIndexReset(Name alias, Table<InnodbCmpPerIndexResetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> InnodbCmpPerIndexReset(Table<O> child, ForeignKey<O, InnodbCmpPerIndexResetRecord> key) {
        super(child, key, INNODB_CMP_PER_INDEX_RESET);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpPerIndexReset as(String alias) {
        return new InnodbCmpPerIndexReset(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpPerIndexReset as(Name alias) {
        return new InnodbCmpPerIndexReset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndexReset rename(String name) {
        return new InnodbCmpPerIndexReset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndexReset rename(Name name) {
        return new InnodbCmpPerIndexReset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
