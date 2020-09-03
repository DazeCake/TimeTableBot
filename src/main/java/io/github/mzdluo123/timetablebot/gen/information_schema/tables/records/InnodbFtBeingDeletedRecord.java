/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.InnodbFtBeingDeleted;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtBeingDeletedRecord extends TableRecordImpl<InnodbFtBeingDeletedRecord> implements Record1<ULong> {

    private static final long serialVersionUID = 250083132;

    /**
     * Setter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
     */
    public void setDocId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
     */
    public ULong getDocId() {
        return (ULong) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<ULong> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<ULong> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED.DOC_ID;
    }

    @Override
    public ULong component1() {
        return getDocId();
    }

    @Override
    public ULong value1() {
        return getDocId();
    }

    @Override
    public InnodbFtBeingDeletedRecord value1(ULong value) {
        setDocId(value);
        return this;
    }

    @Override
    public InnodbFtBeingDeletedRecord values(ULong value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFtBeingDeletedRecord
     */
    public InnodbFtBeingDeletedRecord() {
        super(InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);
    }

    /**
     * Create a detached, initialised InnodbFtBeingDeletedRecord
     */
    public InnodbFtBeingDeletedRecord(ULong docId) {
        super(InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);

        set(0, docId);
    }
}
