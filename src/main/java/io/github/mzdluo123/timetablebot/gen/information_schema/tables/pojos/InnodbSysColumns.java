/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import org.jooq.types.ULong;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysColumns implements Serializable {

    private static final long serialVersionUID = 348903301;

    private ULong   tableId;
    private String  name;
    private ULong   pos;
    private Integer mtype;
    private Integer prtype;
    private Integer len;

    public InnodbSysColumns() {}

    public InnodbSysColumns(InnodbSysColumns value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.pos = value.pos;
        this.mtype = value.mtype;
        this.prtype = value.prtype;
        this.len = value.len;
    }

    public InnodbSysColumns(
        ULong   tableId,
        String  name,
        ULong   pos,
        Integer mtype,
        Integer prtype,
        Integer len
    ) {
        this.tableId = tableId;
        this.name = name;
        this.pos = pos;
        this.mtype = mtype;
        this.prtype = prtype;
        this.len = len;
    }

    public ULong getTableId() {
        return this.tableId;
    }

    public void setTableId(ULong tableId) {
        this.tableId = tableId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ULong getPos() {
        return this.pos;
    }

    public void setPos(ULong pos) {
        this.pos = pos;
    }

    public Integer getMtype() {
        return this.mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getPrtype() {
        return this.prtype;
    }

    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    public Integer getLen() {
        return this.len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbSysColumns (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(pos);
        sb.append(", ").append(mtype);
        sb.append(", ").append(prtype);
        sb.append(", ").append(len);

        sb.append(")");
        return sb.toString();
    }
}