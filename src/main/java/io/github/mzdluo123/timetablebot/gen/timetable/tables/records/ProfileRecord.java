/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.records;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Profile;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileRecord extends UpdatableRecordImpl<ProfileRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 717984486;

    /**
     * Setter for <code>timetable.profile.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>timetable.profile.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>timetable.profile.user</code>.
     */
    public void setUser(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>timetable.profile.user</code>.
     */
    public Integer getUser() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>timetable.profile.extra</code>. json存储的用户额外信息
     */
    public void setExtra(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>timetable.profile.extra</code>. json存储的用户额外信息
     */
    public String getExtra() {
        return (String) get(2);
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
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Profile.PROFILE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Profile.PROFILE.USER;
    }

    @Override
    public Field<String> field3() {
        return Profile.PROFILE.EXTRA;
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
    public String component3() {
        return getExtra();
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
    public String value3() {
        return getExtra();
    }

    @Override
    public ProfileRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ProfileRecord value2(Integer value) {
        setUser(value);
        return this;
    }

    @Override
    public ProfileRecord value3(String value) {
        setExtra(value);
        return this;
    }

    @Override
    public ProfileRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProfileRecord
     */
    public ProfileRecord() {
        super(Profile.PROFILE);
    }

    /**
     * Create a detached, initialised ProfileRecord
     */
    public ProfileRecord(Integer id, Integer user, String extra) {
        super(Profile.PROFILE);

        set(0, id);
        set(1, user);
        set(2, extra);
    }
}
