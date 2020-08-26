/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables;


import io.github.mzdluo123.timetablebot.gen.information_schema.InformationSchema;
import io.github.mzdluo123.timetablebot.gen.information_schema.tables.records.TablesRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<TablesRecord> {

    private static final long serialVersionUID = 1639537784;

    /**
     * The reference instance of <code>information_schema.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesRecord> getRecordType() {
        return TablesRecord.class;
    }

    /**
     * The column <code>information_schema.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<TablesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_NAME</code>.
     */
    public final TableField<TablesRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<TablesRecord, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.ENGINE</code>.
     */
    public final TableField<TablesRecord, String> ENGINE = createField(DSL.name("ENGINE"), org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.VERSION</code>.
     */
    public final TableField<TablesRecord, ULong> VERSION = createField(DSL.name("VERSION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.ROW_FORMAT</code>.
     */
    public final TableField<TablesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), org.jooq.impl.SQLDataType.VARCHAR(10).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_ROWS</code>.
     */
    public final TableField<TablesRecord, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.INDEX_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_FREE</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>.
     */
    public final TableField<TablesRecord, ULong> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.TABLES.UPDATE_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.TABLES.CHECK_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> CHECK_TIME = createField(DSL.name("CHECK_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COLLATION</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COLLATION = createField(DSL.name("TABLE_COLLATION"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.CHECKSUM</code>.
     */
    public final TableField<TablesRecord, ULong> CHECKSUM = createField(DSL.name("CHECKSUM"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>.
     */
    public final TableField<TablesRecord, String> CREATE_OPTIONS = createField(DSL.name("CREATE_OPTIONS"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COMMENT</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COMMENT = createField(DSL.name("TABLE_COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("''", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLES.MAX_INDEX_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> MAX_INDEX_LENGTH = createField(DSL.name("MAX_INDEX_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLES.TEMPORARY</code>.
     */
    public final TableField<TablesRecord, String> TEMPORARY = createField(DSL.name("TEMPORARY"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    private Tables(Name alias, Table<TablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<TablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tables(Table<O> child, ForeignKey<O, TablesRecord> key) {
        super(child, key, TABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }
}
