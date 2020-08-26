/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.SpatialRefSys;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpatialRefSysRecord extends TableRecordImpl<SpatialRefSysRecord> implements Record4<Short, String, Integer, String> {

    private static final long serialVersionUID = -16876100;

    /**
     * Setter for <code>information_schema.SPATIAL_REF_SYS.SRID</code>.
     */
    public void setSrid(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.SPATIAL_REF_SYS.SRID</code>.
     */
    public Short getSrid() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>information_schema.SPATIAL_REF_SYS.AUTH_NAME</code>.
     */
    public void setAuthName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.SPATIAL_REF_SYS.AUTH_NAME</code>.
     */
    public String getAuthName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.SPATIAL_REF_SYS.AUTH_SRID</code>.
     */
    public void setAuthSrid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.SPATIAL_REF_SYS.AUTH_SRID</code>.
     */
    public Integer getAuthSrid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>information_schema.SPATIAL_REF_SYS.SRTEXT</code>.
     */
    public void setSrtext(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.SPATIAL_REF_SYS.SRTEXT</code>.
     */
    public String getSrtext() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return SpatialRefSys.SPATIAL_REF_SYS.SRID;
    }

    @Override
    public Field<String> field2() {
        return SpatialRefSys.SPATIAL_REF_SYS.AUTH_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return SpatialRefSys.SPATIAL_REF_SYS.AUTH_SRID;
    }

    @Override
    public Field<String> field4() {
        return SpatialRefSys.SPATIAL_REF_SYS.SRTEXT;
    }

    @Override
    public Short component1() {
        return getSrid();
    }

    @Override
    public String component2() {
        return getAuthName();
    }

    @Override
    public Integer component3() {
        return getAuthSrid();
    }

    @Override
    public String component4() {
        return getSrtext();
    }

    @Override
    public Short value1() {
        return getSrid();
    }

    @Override
    public String value2() {
        return getAuthName();
    }

    @Override
    public Integer value3() {
        return getAuthSrid();
    }

    @Override
    public String value4() {
        return getSrtext();
    }

    @Override
    public SpatialRefSysRecord value1(Short value) {
        setSrid(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value2(String value) {
        setAuthName(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value3(Integer value) {
        setAuthSrid(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord value4(String value) {
        setSrtext(value);
        return this;
    }

    @Override
    public SpatialRefSysRecord values(Short value1, String value2, Integer value3, String value4) {
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
     * Create a detached SpatialRefSysRecord
     */
    public SpatialRefSysRecord() {
        super(SpatialRefSys.SPATIAL_REF_SYS);
    }

    /**
     * Create a detached, initialised SpatialRefSysRecord
     */
    public SpatialRefSysRecord(Short srid, String authName, Integer authSrid, String srtext) {
        super(SpatialRefSys.SPATIAL_REF_SYS);

        set(0, srid);
        set(1, authName);
        set(2, authSrid);
        set(3, srtext);
    }
}
