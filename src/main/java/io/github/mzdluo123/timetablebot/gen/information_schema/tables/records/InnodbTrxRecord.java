/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.InnodbTrx;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTrxRecord extends TableRecordImpl<InnodbTrxRecord> implements Record22<String, String, LocalDateTime, String, LocalDateTime, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, String, Integer, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = -580205126;

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_id</code>.
     */
    public void setTrxId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_id</code>.
     */
    public String getTrxId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_state</code>.
     */
    public void setTrxState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_state</code>.
     */
    public String getTrxState() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_started</code>.
     */
    public void setTrxStarted(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_started</code>.
     */
    public LocalDateTime getTrxStarted() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
     */
    public void setTrxRequestedLockId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
     */
    public String getTrxRequestedLockId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
     */
    public void setTrxWaitStarted(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
     */
    public LocalDateTime getTrxWaitStarted() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_weight</code>.
     */
    public void setTrxWeight(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_weight</code>.
     */
    public ULong getTrxWeight() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
     */
    public void setTrxMysqlThreadId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
     */
    public ULong getTrxMysqlThreadId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_query</code>.
     */
    public void setTrxQuery(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_query</code>.
     */
    public String getTrxQuery() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
     */
    public void setTrxOperationState(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
     */
    public String getTrxOperationState() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
     */
    public void setTrxTablesInUse(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
     */
    public ULong getTrxTablesInUse() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
     */
    public void setTrxTablesLocked(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
     */
    public ULong getTrxTablesLocked() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
     */
    public void setTrxLockStructs(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
     */
    public ULong getTrxLockStructs() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
     */
    public void setTrxLockMemoryBytes(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
     */
    public ULong getTrxLockMemoryBytes() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
     */
    public void setTrxRowsLocked(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
     */
    public ULong getTrxRowsLocked() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
     */
    public void setTrxRowsModified(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
     */
    public ULong getTrxRowsModified() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
     */
    public void setTrxConcurrencyTickets(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
     */
    public ULong getTrxConcurrencyTickets() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
     */
    public void setTrxIsolationLevel(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
     */
    public String getTrxIsolationLevel() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
     */
    public void setTrxUniqueChecks(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
     */
    public Integer getTrxUniqueChecks() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
     */
    public void setTrxForeignKeyChecks(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
     */
    public Integer getTrxForeignKeyChecks() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
     */
    public void setTrxLastForeignKeyError(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
     */
    public String getTrxLastForeignKeyError() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
     */
    public void setTrxIsReadOnly(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
     */
    public Integer getTrxIsReadOnly() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
     */
    public void setTrxAutocommitNonLocking(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
     */
    public Integer getTrxAutocommitNonLocking() {
        return (Integer) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, LocalDateTime, String, LocalDateTime, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, String, Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, LocalDateTime, String, LocalDateTime, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, String, Integer, Integer, String, Integer, Integer> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbTrx.INNODB_TRX.TRX_ID;
    }

    @Override
    public Field<String> field2() {
        return InnodbTrx.INNODB_TRX.TRX_STATE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return InnodbTrx.INNODB_TRX.TRX_STARTED;
    }

    @Override
    public Field<String> field4() {
        return InnodbTrx.INNODB_TRX.TRX_REQUESTED_LOCK_ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return InnodbTrx.INNODB_TRX.TRX_WAIT_STARTED;
    }

    @Override
    public Field<ULong> field6() {
        return InnodbTrx.INNODB_TRX.TRX_WEIGHT;
    }

    @Override
    public Field<ULong> field7() {
        return InnodbTrx.INNODB_TRX.TRX_MYSQL_THREAD_ID;
    }

    @Override
    public Field<String> field8() {
        return InnodbTrx.INNODB_TRX.TRX_QUERY;
    }

    @Override
    public Field<String> field9() {
        return InnodbTrx.INNODB_TRX.TRX_OPERATION_STATE;
    }

    @Override
    public Field<ULong> field10() {
        return InnodbTrx.INNODB_TRX.TRX_TABLES_IN_USE;
    }

    @Override
    public Field<ULong> field11() {
        return InnodbTrx.INNODB_TRX.TRX_TABLES_LOCKED;
    }

    @Override
    public Field<ULong> field12() {
        return InnodbTrx.INNODB_TRX.TRX_LOCK_STRUCTS;
    }

    @Override
    public Field<ULong> field13() {
        return InnodbTrx.INNODB_TRX.TRX_LOCK_MEMORY_BYTES;
    }

    @Override
    public Field<ULong> field14() {
        return InnodbTrx.INNODB_TRX.TRX_ROWS_LOCKED;
    }

    @Override
    public Field<ULong> field15() {
        return InnodbTrx.INNODB_TRX.TRX_ROWS_MODIFIED;
    }

    @Override
    public Field<ULong> field16() {
        return InnodbTrx.INNODB_TRX.TRX_CONCURRENCY_TICKETS;
    }

    @Override
    public Field<String> field17() {
        return InnodbTrx.INNODB_TRX.TRX_ISOLATION_LEVEL;
    }

    @Override
    public Field<Integer> field18() {
        return InnodbTrx.INNODB_TRX.TRX_UNIQUE_CHECKS;
    }

    @Override
    public Field<Integer> field19() {
        return InnodbTrx.INNODB_TRX.TRX_FOREIGN_KEY_CHECKS;
    }

    @Override
    public Field<String> field20() {
        return InnodbTrx.INNODB_TRX.TRX_LAST_FOREIGN_KEY_ERROR;
    }

    @Override
    public Field<Integer> field21() {
        return InnodbTrx.INNODB_TRX.TRX_IS_READ_ONLY;
    }

    @Override
    public Field<Integer> field22() {
        return InnodbTrx.INNODB_TRX.TRX_AUTOCOMMIT_NON_LOCKING;
    }

    @Override
    public String component1() {
        return getTrxId();
    }

    @Override
    public String component2() {
        return getTrxState();
    }

    @Override
    public LocalDateTime component3() {
        return getTrxStarted();
    }

    @Override
    public String component4() {
        return getTrxRequestedLockId();
    }

    @Override
    public LocalDateTime component5() {
        return getTrxWaitStarted();
    }

    @Override
    public ULong component6() {
        return getTrxWeight();
    }

    @Override
    public ULong component7() {
        return getTrxMysqlThreadId();
    }

    @Override
    public String component8() {
        return getTrxQuery();
    }

    @Override
    public String component9() {
        return getTrxOperationState();
    }

    @Override
    public ULong component10() {
        return getTrxTablesInUse();
    }

    @Override
    public ULong component11() {
        return getTrxTablesLocked();
    }

    @Override
    public ULong component12() {
        return getTrxLockStructs();
    }

    @Override
    public ULong component13() {
        return getTrxLockMemoryBytes();
    }

    @Override
    public ULong component14() {
        return getTrxRowsLocked();
    }

    @Override
    public ULong component15() {
        return getTrxRowsModified();
    }

    @Override
    public ULong component16() {
        return getTrxConcurrencyTickets();
    }

    @Override
    public String component17() {
        return getTrxIsolationLevel();
    }

    @Override
    public Integer component18() {
        return getTrxUniqueChecks();
    }

    @Override
    public Integer component19() {
        return getTrxForeignKeyChecks();
    }

    @Override
    public String component20() {
        return getTrxLastForeignKeyError();
    }

    @Override
    public Integer component21() {
        return getTrxIsReadOnly();
    }

    @Override
    public Integer component22() {
        return getTrxAutocommitNonLocking();
    }

    @Override
    public String value1() {
        return getTrxId();
    }

    @Override
    public String value2() {
        return getTrxState();
    }

    @Override
    public LocalDateTime value3() {
        return getTrxStarted();
    }

    @Override
    public String value4() {
        return getTrxRequestedLockId();
    }

    @Override
    public LocalDateTime value5() {
        return getTrxWaitStarted();
    }

    @Override
    public ULong value6() {
        return getTrxWeight();
    }

    @Override
    public ULong value7() {
        return getTrxMysqlThreadId();
    }

    @Override
    public String value8() {
        return getTrxQuery();
    }

    @Override
    public String value9() {
        return getTrxOperationState();
    }

    @Override
    public ULong value10() {
        return getTrxTablesInUse();
    }

    @Override
    public ULong value11() {
        return getTrxTablesLocked();
    }

    @Override
    public ULong value12() {
        return getTrxLockStructs();
    }

    @Override
    public ULong value13() {
        return getTrxLockMemoryBytes();
    }

    @Override
    public ULong value14() {
        return getTrxRowsLocked();
    }

    @Override
    public ULong value15() {
        return getTrxRowsModified();
    }

    @Override
    public ULong value16() {
        return getTrxConcurrencyTickets();
    }

    @Override
    public String value17() {
        return getTrxIsolationLevel();
    }

    @Override
    public Integer value18() {
        return getTrxUniqueChecks();
    }

    @Override
    public Integer value19() {
        return getTrxForeignKeyChecks();
    }

    @Override
    public String value20() {
        return getTrxLastForeignKeyError();
    }

    @Override
    public Integer value21() {
        return getTrxIsReadOnly();
    }

    @Override
    public Integer value22() {
        return getTrxAutocommitNonLocking();
    }

    @Override
    public InnodbTrxRecord value1(String value) {
        setTrxId(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value2(String value) {
        setTrxState(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value3(LocalDateTime value) {
        setTrxStarted(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value4(String value) {
        setTrxRequestedLockId(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value5(LocalDateTime value) {
        setTrxWaitStarted(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value6(ULong value) {
        setTrxWeight(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value7(ULong value) {
        setTrxMysqlThreadId(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value8(String value) {
        setTrxQuery(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value9(String value) {
        setTrxOperationState(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value10(ULong value) {
        setTrxTablesInUse(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value11(ULong value) {
        setTrxTablesLocked(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value12(ULong value) {
        setTrxLockStructs(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value13(ULong value) {
        setTrxLockMemoryBytes(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value14(ULong value) {
        setTrxRowsLocked(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value15(ULong value) {
        setTrxRowsModified(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value16(ULong value) {
        setTrxConcurrencyTickets(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value17(String value) {
        setTrxIsolationLevel(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value18(Integer value) {
        setTrxUniqueChecks(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value19(Integer value) {
        setTrxForeignKeyChecks(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value20(String value) {
        setTrxLastForeignKeyError(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value21(Integer value) {
        setTrxIsReadOnly(value);
        return this;
    }

    @Override
    public InnodbTrxRecord value22(Integer value) {
        setTrxAutocommitNonLocking(value);
        return this;
    }

    @Override
    public InnodbTrxRecord values(String value1, String value2, LocalDateTime value3, String value4, LocalDateTime value5, ULong value6, ULong value7, String value8, String value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16, String value17, Integer value18, Integer value19, String value20, Integer value21, Integer value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbTrxRecord
     */
    public InnodbTrxRecord() {
        super(InnodbTrx.INNODB_TRX);
    }

    /**
     * Create a detached, initialised InnodbTrxRecord
     */
    public InnodbTrxRecord(String trxId, String trxState, LocalDateTime trxStarted, String trxRequestedLockId, LocalDateTime trxWaitStarted, ULong trxWeight, ULong trxMysqlThreadId, String trxQuery, String trxOperationState, ULong trxTablesInUse, ULong trxTablesLocked, ULong trxLockStructs, ULong trxLockMemoryBytes, ULong trxRowsLocked, ULong trxRowsModified, ULong trxConcurrencyTickets, String trxIsolationLevel, Integer trxUniqueChecks, Integer trxForeignKeyChecks, String trxLastForeignKeyError, Integer trxIsReadOnly, Integer trxAutocommitNonLocking) {
        super(InnodbTrx.INNODB_TRX);

        set(0, trxId);
        set(1, trxState);
        set(2, trxStarted);
        set(3, trxRequestedLockId);
        set(4, trxWaitStarted);
        set(5, trxWeight);
        set(6, trxMysqlThreadId);
        set(7, trxQuery);
        set(8, trxOperationState);
        set(9, trxTablesInUse);
        set(10, trxTablesLocked);
        set(11, trxLockStructs);
        set(12, trxLockMemoryBytes);
        set(13, trxRowsLocked);
        set(14, trxRowsModified);
        set(15, trxConcurrencyTickets);
        set(16, trxIsolationLevel);
        set(17, trxUniqueChecks);
        set(18, trxForeignKeyChecks);
        set(19, trxLastForeignKeyError);
        set(20, trxIsReadOnly);
        set(21, trxAutocommitNonLocking);
    }
}
