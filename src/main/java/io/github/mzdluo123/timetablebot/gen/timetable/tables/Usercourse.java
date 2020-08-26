/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables;


import io.github.mzdluo123.timetablebot.gen.timetable.Keys;
import io.github.mzdluo123.timetablebot.gen.timetable.Timetable;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.UsercourseRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Usercourse extends TableImpl<UsercourseRecord> {

    private static final long serialVersionUID = -1605252526;

    /**
     * The reference instance of <code>timetable.usercourse</code>
     */
    public static final Usercourse USERCOURSE = new Usercourse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsercourseRecord> getRecordType() {
        return UsercourseRecord.class;
    }

    /**
     * The column <code>timetable.usercourse.id</code>.
     */
    public final TableField<UsercourseRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>timetable.usercourse.user</code>.
     */
    public final TableField<UsercourseRecord, Integer> USER = createField(DSL.name("user"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>timetable.usercourse.course</code>.
     */
    public final TableField<UsercourseRecord, Integer> COURSE = createField(DSL.name("course"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>timetable.usercourse</code> table reference
     */
    public Usercourse() {
        this(DSL.name("usercourse"), null);
    }

    /**
     * Create an aliased <code>timetable.usercourse</code> table reference
     */
    public Usercourse(String alias) {
        this(DSL.name(alias), USERCOURSE);
    }

    /**
     * Create an aliased <code>timetable.usercourse</code> table reference
     */
    public Usercourse(Name alias) {
        this(alias, USERCOURSE);
    }

    private Usercourse(Name alias, Table<UsercourseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Usercourse(Name alias, Table<UsercourseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Usercourse(Table<O> child, ForeignKey<O, UsercourseRecord> key) {
        super(child, key, USERCOURSE);
    }

    @Override
    public Schema getSchema() {
        return Timetable.TIMETABLE;
    }

    @Override
    public Identity<UsercourseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERCOURSE;
    }

    @Override
    public UniqueKey<UsercourseRecord> getPrimaryKey() {
        return Keys.KEY_USERCOURSE_PRIMARY;
    }

    @Override
    public List<UniqueKey<UsercourseRecord>> getKeys() {
        return Arrays.<UniqueKey<UsercourseRecord>>asList(Keys.KEY_USERCOURSE_PRIMARY);
    }

    @Override
    public List<ForeignKey<UsercourseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UsercourseRecord, ?>>asList(Keys.FK_USERCOURSE_USER_ID, Keys.FK_USERCOURSE_COURSE_ID);
    }

    public User user() {
        return new User(this, Keys.FK_USERCOURSE_USER_ID);
    }

    public Course course() {
        return new Course(this, Keys.FK_USERCOURSE_COURSE_ID);
    }

    @Override
    public Usercourse as(String alias) {
        return new Usercourse(DSL.name(alias), this);
    }

    @Override
    public Usercourse as(Name alias) {
        return new Usercourse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Usercourse rename(String name) {
        return new Usercourse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Usercourse rename(Name name) {
        return new Usercourse(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
