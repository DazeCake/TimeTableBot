/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.InnodbMutexes;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbMutexesRecord extends TableRecordImpl<InnodbMutexesRecord> implements Record4<String, String, UInteger, ULong> {

    private static final long serialVersionUID = 374423857;

    /**
     * Setter for <code>information_schema.INNODB_MUTEXES.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_MUTEXES.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_MUTEXES.CREATE_FILE</code>.
     */
    public void setCreateFile(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_MUTEXES.CREATE_FILE</code>.
     */
    public String getCreateFile() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_MUTEXES.CREATE_LINE</code>.
     */
    public void setCreateLine(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_MUTEXES.CREATE_LINE</code>.
     */
    public UInteger getCreateLine() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_MUTEXES.OS_WAITS</code>.
     */
    public void setOsWaits(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_MUTEXES.OS_WAITS</code>.
     */
    public ULong getOsWaits() {
        return (ULong) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, UInteger, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, UInteger, ULong> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbMutexes.INNODB_MUTEXES.NAME;
    }

    @Override
    public Field<String> field2() {
        return InnodbMutexes.INNODB_MUTEXES.CREATE_FILE;
    }

    @Override
    public Field<UInteger> field3() {
        return InnodbMutexes.INNODB_MUTEXES.CREATE_LINE;
    }

    @Override
    public Field<ULong> field4() {
        return InnodbMutexes.INNODB_MUTEXES.OS_WAITS;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getCreateFile();
    }

    @Override
    public UInteger component3() {
        return getCreateLine();
    }

    @Override
    public ULong component4() {
        return getOsWaits();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getCreateFile();
    }

    @Override
    public UInteger value3() {
        return getCreateLine();
    }

    @Override
    public ULong value4() {
        return getOsWaits();
    }

    @Override
    public InnodbMutexesRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public InnodbMutexesRecord value2(String value) {
        setCreateFile(value);
        return this;
    }

    @Override
    public InnodbMutexesRecord value3(UInteger value) {
        setCreateLine(value);
        return this;
    }

    @Override
    public InnodbMutexesRecord value4(ULong value) {
        setOsWaits(value);
        return this;
    }

    @Override
    public InnodbMutexesRecord values(String value1, String value2, UInteger value3, ULong value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbMutexesRecord
     */
    public InnodbMutexesRecord() {
        super(InnodbMutexes.INNODB_MUTEXES);
    }

    /**
     * Create a detached, initialised InnodbMutexesRecord
     */
    public InnodbMutexesRecord(String name, String createFile, UInteger createLine, ULong osWaits) {
        super(InnodbMutexes.INNODB_MUTEXES);

        set(0, name);
        set(1, createFile);
        set(2, createLine);
        set(3, osWaits);
    }
}
