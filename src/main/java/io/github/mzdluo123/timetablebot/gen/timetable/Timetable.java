/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable;


import io.github.mzdluo123.timetablebot.gen.DefaultCatalog;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Classroom;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Course;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.CourseTime;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.OtherCourse;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Profile;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.User;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserCourse;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserOtherCourse;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Timetable extends SchemaImpl {

    private static final long serialVersionUID = -2100742046;

    /**
     * The reference instance of <code>timetable</code>
     */
    public static final Timetable TIMETABLE = new Timetable();

    /**
     * The table <code>timetable.classroom</code>.
     */
    public final Classroom CLASSROOM = Classroom.CLASSROOM;

    /**
     * The table <code>timetable.course</code>.
     */
    public final Course COURSE = Course.COURSE;

    /**
     * The table <code>timetable.course_time</code>.
     */
    public final CourseTime COURSE_TIME = CourseTime.COURSE_TIME;

    /**
     * The table <code>timetable.other_course</code>.
     */
    public final OtherCourse OTHER_COURSE = OtherCourse.OTHER_COURSE;

    /**
     * The table <code>timetable.profile</code>.
     */
    public final Profile PROFILE = Profile.PROFILE;

    /**
     * The table <code>timetable.user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>timetable.user_course</code>.
     */
    public final UserCourse USER_COURSE = UserCourse.USER_COURSE;

    /**
     * The table <code>timetable.user_other_course</code>.
     */
    public final UserOtherCourse USER_OTHER_COURSE = UserOtherCourse.USER_OTHER_COURSE;

    /**
     * No further instances allowed
     */
    private Timetable() {
        super("timetable", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Classroom.CLASSROOM,
            Course.COURSE,
            CourseTime.COURSE_TIME,
            OtherCourse.OTHER_COURSE,
            Profile.PROFILE,
            User.USER,
            UserCourse.USER_COURSE,
            UserOtherCourse.USER_OTHER_COURSE);
    }
}
