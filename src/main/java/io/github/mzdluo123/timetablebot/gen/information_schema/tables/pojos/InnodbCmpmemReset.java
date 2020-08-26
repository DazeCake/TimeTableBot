/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCmpmemReset implements Serializable {

    private static final long serialVersionUID = 1643747151;

    private Integer pageSize;
    private Integer bufferPoolInstance;
    private Integer pagesUsed;
    private Integer pagesFree;
    private Long    relocationOps;
    private Integer relocationTime;

    public InnodbCmpmemReset() {}

    public InnodbCmpmemReset(InnodbCmpmemReset value) {
        this.pageSize = value.pageSize;
        this.bufferPoolInstance = value.bufferPoolInstance;
        this.pagesUsed = value.pagesUsed;
        this.pagesFree = value.pagesFree;
        this.relocationOps = value.relocationOps;
        this.relocationTime = value.relocationTime;
    }

    public InnodbCmpmemReset(
        Integer pageSize,
        Integer bufferPoolInstance,
        Integer pagesUsed,
        Integer pagesFree,
        Long    relocationOps,
        Integer relocationTime
    ) {
        this.pageSize = pageSize;
        this.bufferPoolInstance = bufferPoolInstance;
        this.pagesUsed = pagesUsed;
        this.pagesFree = pagesFree;
        this.relocationOps = relocationOps;
        this.relocationTime = relocationTime;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getBufferPoolInstance() {
        return this.bufferPoolInstance;
    }

    public void setBufferPoolInstance(Integer bufferPoolInstance) {
        this.bufferPoolInstance = bufferPoolInstance;
    }

    public Integer getPagesUsed() {
        return this.pagesUsed;
    }

    public void setPagesUsed(Integer pagesUsed) {
        this.pagesUsed = pagesUsed;
    }

    public Integer getPagesFree() {
        return this.pagesFree;
    }

    public void setPagesFree(Integer pagesFree) {
        this.pagesFree = pagesFree;
    }

    public Long getRelocationOps() {
        return this.relocationOps;
    }

    public void setRelocationOps(Long relocationOps) {
        this.relocationOps = relocationOps;
    }

    public Integer getRelocationTime() {
        return this.relocationTime;
    }

    public void setRelocationTime(Integer relocationTime) {
        this.relocationTime = relocationTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCmpmemReset (");

        sb.append(pageSize);
        sb.append(", ").append(bufferPoolInstance);
        sb.append(", ").append(pagesUsed);
        sb.append(", ").append(pagesFree);
        sb.append(", ").append(relocationOps);
        sb.append(", ").append(relocationTime);

        sb.append(")");
        return sb.toString();
    }
}
