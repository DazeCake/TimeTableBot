/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.records;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Classroom;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassroomRecord extends UpdatableRecordImpl<ClassroomRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1385952332;

    /**
     * Setter for <code>timetable.classroom.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>timetable.classroom.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>timetable.classroom.location</code>.
     */
    public void setLocation(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>timetable.classroom.location</code>.
     */
    public String getLocation() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Classroom.CLASSROOM.ID;
    }

    @Override
    public Field<String> field2() {
        return Classroom.CLASSROOM.LOCATION;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLocation();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLocation();
    }

    @Override
    public ClassroomRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ClassroomRecord value2(String value) {
        setLocation(value);
        return this;
    }

    @Override
    public ClassroomRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassroomRecord
     */
    public ClassroomRecord() {
        super(Classroom.CLASSROOM);
    }

    /**
     * Create a detached, initialised ClassroomRecord
     */
    public ClassroomRecord(Integer id, String location) {
        super(Classroom.CLASSROOM);

        set(0, id);
        set(1, location);
    }
}
