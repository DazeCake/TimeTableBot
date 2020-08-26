/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.timetable.tables.daos;


import io.github.mzdluo123.timetablebot.gen.timetable.tables.Classroom;
import io.github.mzdluo123.timetablebot.gen.timetable.tables.records.ClassroomRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassroomDao extends DAOImpl<ClassroomRecord, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom, Integer> {

    /**
     * Create a new ClassroomDao without any configuration
     */
    public ClassroomDao() {
        super(Classroom.CLASSROOM, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom.class);
    }

    /**
     * Create a new ClassroomDao with an attached configuration
     */
    public ClassroomDao(Configuration configuration) {
        super(Classroom.CLASSROOM, io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom.class, configuration);
    }

    @Override
    public Integer getId(io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Classroom.CLASSROOM.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom> fetchById(Integer... values) {
        return fetch(Classroom.CLASSROOM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom fetchOneById(Integer value) {
        return fetchOne(Classroom.CLASSROOM.ID, value);
    }

    /**
     * Fetch records that have <code>location BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom> fetchRangeOfLocation(String lowerInclusive, String upperInclusive) {
        return fetchRange(Classroom.CLASSROOM.LOCATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>location IN (values)</code>
     */
    public List<io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom> fetchByLocation(String... values) {
        return fetch(Classroom.CLASSROOM.LOCATION, values);
    }

    /**
     * Fetch a unique record that has <code>location = value</code>
     */
    public io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.Classroom fetchOneByLocation(String value) {
        return fetchOne(Classroom.CLASSROOM.LOCATION, value);
    }
}