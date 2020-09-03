/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysDatafiles implements Serializable {

    private static final long serialVersionUID = 514124014;

    private UInteger space;
    private String   path;

    public InnodbSysDatafiles() {}

    public InnodbSysDatafiles(InnodbSysDatafiles value) {
        this.space = value.space;
        this.path = value.path;
    }

    public InnodbSysDatafiles(
        UInteger space,
        String   path
    ) {
        this.space = space;
        this.path = path;
    }

    public UInteger getSpace() {
        return this.space;
    }

    public void setSpace(UInteger space) {
        this.space = space;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbSysDatafiles (");

        sb.append(space);
        sb.append(", ").append(path);

        sb.append(")");
        return sb.toString();
    }
}
