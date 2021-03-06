/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCmpPerIndex implements Serializable {

    private static final long serialVersionUID = 345375494;

    private String  databaseName;
    private String  tableName;
    private String  indexName;
    private Integer compressOps;
    private Integer compressOpsOk;
    private Integer compressTime;
    private Integer uncompressOps;
    private Integer uncompressTime;

    public InnodbCmpPerIndex() {}

    public InnodbCmpPerIndex(InnodbCmpPerIndex value) {
        this.databaseName = value.databaseName;
        this.tableName = value.tableName;
        this.indexName = value.indexName;
        this.compressOps = value.compressOps;
        this.compressOpsOk = value.compressOpsOk;
        this.compressTime = value.compressTime;
        this.uncompressOps = value.uncompressOps;
        this.uncompressTime = value.uncompressTime;
    }

    public InnodbCmpPerIndex(
        String  databaseName,
        String  tableName,
        String  indexName,
        Integer compressOps,
        Integer compressOpsOk,
        Integer compressTime,
        Integer uncompressOps,
        Integer uncompressTime
    ) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.indexName = indexName;
        this.compressOps = compressOps;
        this.compressOpsOk = compressOpsOk;
        this.compressTime = compressTime;
        this.uncompressOps = uncompressOps;
        this.uncompressTime = uncompressTime;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Integer getCompressOps() {
        return this.compressOps;
    }

    public void setCompressOps(Integer compressOps) {
        this.compressOps = compressOps;
    }

    public Integer getCompressOpsOk() {
        return this.compressOpsOk;
    }

    public void setCompressOpsOk(Integer compressOpsOk) {
        this.compressOpsOk = compressOpsOk;
    }

    public Integer getCompressTime() {
        return this.compressTime;
    }

    public void setCompressTime(Integer compressTime) {
        this.compressTime = compressTime;
    }

    public Integer getUncompressOps() {
        return this.uncompressOps;
    }

    public void setUncompressOps(Integer uncompressOps) {
        this.uncompressOps = uncompressOps;
    }

    public Integer getUncompressTime() {
        return this.uncompressTime;
    }

    public void setUncompressTime(Integer uncompressTime) {
        this.uncompressTime = uncompressTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCmpPerIndex (");

        sb.append(databaseName);
        sb.append(", ").append(tableName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(compressOps);
        sb.append(", ").append(compressOpsOk);
        sb.append(", ").append(compressTime);
        sb.append(", ").append(uncompressOps);
        sb.append(", ").append(uncompressTime);

        sb.append(")");
        return sb.toString();
    }
}
