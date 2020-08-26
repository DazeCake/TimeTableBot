/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.ColumnPrivileges;
import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnPrivilegesRecord extends TableRecordImpl<ColumnPrivilegesRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1520735342;

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.GRANTEE;
    }

    @Override
    public Field<String> field2() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field3() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field4() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_NAME;
    }

    @Override
    public Field<String> field5() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.COLUMN_NAME;
    }

    @Override
    public Field<String> field6() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field7() {
        return ColumnPrivileges.COLUMN_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantee();
    }

    @Override
    public String component2() {
        return getTableCatalog();
    }

    @Override
    public String component3() {
        return getTableSchema();
    }

    @Override
    public String component4() {
        return getTableName();
    }

    @Override
    public String component5() {
        return getColumnName();
    }

    @Override
    public String component6() {
        return getPrivilegeType();
    }

    @Override
    public String component7() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantee();
    }

    @Override
    public String value2() {
        return getTableCatalog();
    }

    @Override
    public String value3() {
        return getTableSchema();
    }

    @Override
    public String value4() {
        return getTableName();
    }

    @Override
    public String value5() {
        return getColumnName();
    }

    @Override
    public String value6() {
        return getPrivilegeType();
    }

    @Override
    public String value7() {
        return getIsGrantable();
    }

    @Override
    public ColumnPrivilegesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value2(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value3(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value4(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value5(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value6(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public ColumnPrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnPrivilegesRecord
     */
    public ColumnPrivilegesRecord() {
        super(ColumnPrivileges.COLUMN_PRIVILEGES);
    }

    /**
     * Create a detached, initialised ColumnPrivilegesRecord
     */
    public ColumnPrivilegesRecord(String grantee, String tableCatalog, String tableSchema, String tableName, String columnName, String privilegeType, String isGrantable) {
        super(ColumnPrivileges.COLUMN_PRIVILEGES);

        set(0, grantee);
        set(1, tableCatalog);
        set(2, tableSchema);
        set(3, tableName);
        set(4, columnName);
        set(5, privilegeType);
        set(6, isGrantable);
    }
}
