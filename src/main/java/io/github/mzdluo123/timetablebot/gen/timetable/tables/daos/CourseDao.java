/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.daos;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Course;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.CourseRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CourseDao extends DAOImpl<CourseRecord, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course, Integer> {

    /**
     * Create a new CourseDao without any configuration
     */
    public CourseDao() {
        super(Course.COURSE, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course.class);
    }

    /**
     * Create a new CourseDao with an attached configuration
     */
    public CourseDao(Configuration configuration) {
        super(Course.COURSE, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course.class, configuration);
    }

    @Override
    public Integer getId(io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Course.COURSE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchById(Integer... values) {
        return fetch(Course.COURSE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course fetchOneById(Integer value) {
        return fetchOne(Course.COURSE.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Course.COURSE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByName(String... values) {
        return fetch(Course.COURSE.NAME, values);
    }

    /**
     * Fetch records that have <code>teacher BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfTeacher(String lowerInclusive, String upperInclusive) {
        return fetchRange(Course.COURSE.TEACHER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>teacher IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByTeacher(String... values) {
        return fetch(Course.COURSE.TEACHER, values);
    }

    /**
     * Fetch records that have <code>course_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfCourseId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Course.COURSE.COURSE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>course_id IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByCourseId(String... values) {
        return fetch(Course.COURSE.COURSE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>course_id = value</code>
     */
    public io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course fetchOneByCourseId(String value) {
        return fetchOne(Course.COURSE.COURSE_ID, value);
    }

    /**
     * Fetch records that have <code>week_period BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfWeekPeriod(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(Course.COURSE.WEEK_PERIOD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>week_period IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByWeekPeriod(Byte... values) {
        return fetch(Course.COURSE.WEEK_PERIOD, values);
    }

    /**
     * Fetch records that have <code>period BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfPeriod(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(Course.COURSE.PERIOD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>period IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByPeriod(Byte... values) {
        return fetch(Course.COURSE.PERIOD, values);
    }

    /**
     * Fetch records that have <code>score BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchRangeOfScore(Double lowerInclusive, Double upperInclusive) {
        return fetchRange(Course.COURSE.SCORE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Course> fetchByScore(Double... values) {
        return fetch(Course.COURSE.SCORE, values);
    }
}
