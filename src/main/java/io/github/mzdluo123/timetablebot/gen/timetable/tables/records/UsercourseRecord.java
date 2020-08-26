/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.records;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Usercourse;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsercourseRecord extends UpdatableRecordImpl<UsercourseRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1360613663;

    /**
     * Setter for <code>timetable.usercourse.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>timetable.usercourse.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>timetable.usercourse.user</code>.
     */
    public void setUser(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>timetable.usercourse.user</code>.
     */
    public Integer getUser() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>timetable.usercourse.course</code>.
     */
    public void setCourse(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>timetable.usercourse.course</code>.
     */
    public Integer getCourse() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Usercourse.USERCOURSE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Usercourse.USERCOURSE.USER;
    }

    @Override
    public Field<Integer> field3() {
        return Usercourse.USERCOURSE.COURSE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUser();
    }

    @Override
    public Integer component3() {
        return getCourse();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUser();
    }

    @Override
    public Integer value3() {
        return getCourse();
    }

    @Override
    public UsercourseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UsercourseRecord value2(Integer value) {
        setUser(value);
        return this;
    }

    @Override
    public UsercourseRecord value3(Integer value) {
        setCourse(value);
        return this;
    }

    @Override
    public UsercourseRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsercourseRecord
     */
    public UsercourseRecord() {
        super(Usercourse.USERCOURSE);
    }

    /**
     * Create a detached, initialised UsercourseRecord
     */
    public UsercourseRecord(Integer id, Integer user, Integer course) {
        super(Usercourse.USERCOURSE);

        set(0, id);
        set(1, user);
        set(2, course);
    }
}
