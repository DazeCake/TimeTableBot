/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClientStatistics implements Serializable {

    private static final long serialVersionUID = 788659392;

    private String client;
    private Long   totalConnections;
    private Long   concurrentConnections;
    private Long   connectedTime;
    private Double busyTime;
    private Double cpuTime;
    private Long   bytesReceived;
    private Long   bytesSent;
    private Long   binlogBytesWritten;
    private Long   rowsRead;
    private Long   rowsSent;
    private Long   rowsDeleted;
    private Long   rowsInserted;
    private Long   rowsUpdated;
    private Long   selectCommands;
    private Long   updateCommands;
    private Long   otherCommands;
    private Long   commitTransactions;
    private Long   rollbackTransactions;
    private Long   deniedConnections;
    private Long   lostConnections;
    private Long   accessDenied;
    private Long   emptyQueries;
    private ULong  totalSslConnections;
    private Long   maxStatementTimeExceeded;

    public ClientStatistics() {}

    public ClientStatistics(ClientStatistics value) {
        this.client = value.client;
        this.totalConnections = value.totalConnections;
        this.concurrentConnections = value.concurrentConnections;
        this.connectedTime = value.connectedTime;
        this.busyTime = value.busyTime;
        this.cpuTime = value.cpuTime;
        this.bytesReceived = value.bytesReceived;
        this.bytesSent = value.bytesSent;
        this.binlogBytesWritten = value.binlogBytesWritten;
        this.rowsRead = value.rowsRead;
        this.rowsSent = value.rowsSent;
        this.rowsDeleted = value.rowsDeleted;
        this.rowsInserted = value.rowsInserted;
        this.rowsUpdated = value.rowsUpdated;
        this.selectCommands = value.selectCommands;
        this.updateCommands = value.updateCommands;
        this.otherCommands = value.otherCommands;
        this.commitTransactions = value.commitTransactions;
        this.rollbackTransactions = value.rollbackTransactions;
        this.deniedConnections = value.deniedConnections;
        this.lostConnections = value.lostConnections;
        this.accessDenied = value.accessDenied;
        this.emptyQueries = value.emptyQueries;
        this.totalSslConnections = value.totalSslConnections;
        this.maxStatementTimeExceeded = value.maxStatementTimeExceeded;
    }

    public ClientStatistics(
        String client,
        Long   totalConnections,
        Long   concurrentConnections,
        Long   connectedTime,
        Double busyTime,
        Double cpuTime,
        Long   bytesReceived,
        Long   bytesSent,
        Long   binlogBytesWritten,
        Long   rowsRead,
        Long   rowsSent,
        Long   rowsDeleted,
        Long   rowsInserted,
        Long   rowsUpdated,
        Long   selectCommands,
        Long   updateCommands,
        Long   otherCommands,
        Long   commitTransactions,
        Long   rollbackTransactions,
        Long   deniedConnections,
        Long   lostConnections,
        Long   accessDenied,
        Long   emptyQueries,
        ULong  totalSslConnections,
        Long   maxStatementTimeExceeded
    ) {
        this.client = client;
        this.totalConnections = totalConnections;
        this.concurrentConnections = concurrentConnections;
        this.connectedTime = connectedTime;
        this.busyTime = busyTime;
        this.cpuTime = cpuTime;
        this.bytesReceived = bytesReceived;
        this.bytesSent = bytesSent;
        this.binlogBytesWritten = binlogBytesWritten;
        this.rowsRead = rowsRead;
        this.rowsSent = rowsSent;
        this.rowsDeleted = rowsDeleted;
        this.rowsInserted = rowsInserted;
        this.rowsUpdated = rowsUpdated;
        this.selectCommands = selectCommands;
        this.updateCommands = updateCommands;
        this.otherCommands = otherCommands;
        this.commitTransactions = commitTransactions;
        this.rollbackTransactions = rollbackTransactions;
        this.deniedConnections = deniedConnections;
        this.lostConnections = lostConnections;
        this.accessDenied = accessDenied;
        this.emptyQueries = emptyQueries;
        this.totalSslConnections = totalSslConnections;
        this.maxStatementTimeExceeded = maxStatementTimeExceeded;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getTotalConnections() {
        return this.totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    public Long getConcurrentConnections() {
        return this.concurrentConnections;
    }

    public void setConcurrentConnections(Long concurrentConnections) {
        this.concurrentConnections = concurrentConnections;
    }

    public Long getConnectedTime() {
        return this.connectedTime;
    }

    public void setConnectedTime(Long connectedTime) {
        this.connectedTime = connectedTime;
    }

    public Double getBusyTime() {
        return this.busyTime;
    }

    public void setBusyTime(Double busyTime) {
        this.busyTime = busyTime;
    }

    public Double getCpuTime() {
        return this.cpuTime;
    }

    public void setCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    public void setBytesReceived(Long bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    public Long getBytesSent() {
        return this.bytesSent;
    }

    public void setBytesSent(Long bytesSent) {
        this.bytesSent = bytesSent;
    }

    public Long getBinlogBytesWritten() {
        return this.binlogBytesWritten;
    }

    public void setBinlogBytesWritten(Long binlogBytesWritten) {
        this.binlogBytesWritten = binlogBytesWritten;
    }

    public Long getRowsRead() {
        return this.rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Long getRowsSent() {
        return this.rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public Long getRowsDeleted() {
        return this.rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public Long getRowsInserted() {
        return this.rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public Long getRowsUpdated() {
        return this.rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public Long getSelectCommands() {
        return this.selectCommands;
    }

    public void setSelectCommands(Long selectCommands) {
        this.selectCommands = selectCommands;
    }

    public Long getUpdateCommands() {
        return this.updateCommands;
    }

    public void setUpdateCommands(Long updateCommands) {
        this.updateCommands = updateCommands;
    }

    public Long getOtherCommands() {
        return this.otherCommands;
    }

    public void setOtherCommands(Long otherCommands) {
        this.otherCommands = otherCommands;
    }

    public Long getCommitTransactions() {
        return this.commitTransactions;
    }

    public void setCommitTransactions(Long commitTransactions) {
        this.commitTransactions = commitTransactions;
    }

    public Long getRollbackTransactions() {
        return this.rollbackTransactions;
    }

    public void setRollbackTransactions(Long rollbackTransactions) {
        this.rollbackTransactions = rollbackTransactions;
    }

    public Long getDeniedConnections() {
        return this.deniedConnections;
    }

    public void setDeniedConnections(Long deniedConnections) {
        this.deniedConnections = deniedConnections;
    }

    public Long getLostConnections() {
        return this.lostConnections;
    }

    public void setLostConnections(Long lostConnections) {
        this.lostConnections = lostConnections;
    }

    public Long getAccessDenied() {
        return this.accessDenied;
    }

    public void setAccessDenied(Long accessDenied) {
        this.accessDenied = accessDenied;
    }

    public Long getEmptyQueries() {
        return this.emptyQueries;
    }

    public void setEmptyQueries(Long emptyQueries) {
        this.emptyQueries = emptyQueries;
    }

    public ULong getTotalSslConnections() {
        return this.totalSslConnections;
    }

    public void setTotalSslConnections(ULong totalSslConnections) {
        this.totalSslConnections = totalSslConnections;
    }

    public Long getMaxStatementTimeExceeded() {
        return this.maxStatementTimeExceeded;
    }

    public void setMaxStatementTimeExceeded(Long maxStatementTimeExceeded) {
        this.maxStatementTimeExceeded = maxStatementTimeExceeded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClientStatistics (");

        sb.append(client);
        sb.append(", ").append(totalConnections);
        sb.append(", ").append(concurrentConnections);
        sb.append(", ").append(connectedTime);
        sb.append(", ").append(busyTime);
        sb.append(", ").append(cpuTime);
        sb.append(", ").append(bytesReceived);
        sb.append(", ").append(bytesSent);
        sb.append(", ").append(binlogBytesWritten);
        sb.append(", ").append(rowsRead);
        sb.append(", ").append(rowsSent);
        sb.append(", ").append(rowsDeleted);
        sb.append(", ").append(rowsInserted);
        sb.append(", ").append(rowsUpdated);
        sb.append(", ").append(selectCommands);
        sb.append(", ").append(updateCommands);
        sb.append(", ").append(otherCommands);
        sb.append(", ").append(commitTransactions);
        sb.append(", ").append(rollbackTransactions);
        sb.append(", ").append(deniedConnections);
        sb.append(", ").append(lostConnections);
        sb.append(", ").append(accessDenied);
        sb.append(", ").append(emptyQueries);
        sb.append(", ").append(totalSslConnections);
        sb.append(", ").append(maxStatementTimeExceeded);

        sb.append(")");
        return sb.toString();
    }
}
