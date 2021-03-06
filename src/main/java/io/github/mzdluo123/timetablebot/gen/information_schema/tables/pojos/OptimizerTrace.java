/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OptimizerTrace implements Serializable {

    private static final long serialVersionUID = 464247190;

    private String  query;
    private String  trace;
    private Integer missingBytesBeyondMaxMemSize;
    private Byte    insufficientPrivileges;

    public OptimizerTrace() {}

    public OptimizerTrace(OptimizerTrace value) {
        this.query = value.query;
        this.trace = value.trace;
        this.missingBytesBeyondMaxMemSize = value.missingBytesBeyondMaxMemSize;
        this.insufficientPrivileges = value.insufficientPrivileges;
    }

    public OptimizerTrace(
        String  query,
        String  trace,
        Integer missingBytesBeyondMaxMemSize,
        Byte    insufficientPrivileges
    ) {
        this.query = query;
        this.trace = trace;
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
        this.insufficientPrivileges = insufficientPrivileges;
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTrace() {
        return this.trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public Integer getMissingBytesBeyondMaxMemSize() {
        return this.missingBytesBeyondMaxMemSize;
    }

    public void setMissingBytesBeyondMaxMemSize(Integer missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    public Byte getInsufficientPrivileges() {
        return this.insufficientPrivileges;
    }

    public void setInsufficientPrivileges(Byte insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OptimizerTrace (");

        sb.append(query);
        sb.append(", ").append(trace);
        sb.append(", ").append(missingBytesBeyondMaxMemSize);
        sb.append(", ").append(insufficientPrivileges);

        sb.append(")");
        return sb.toString();
    }
}
