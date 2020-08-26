/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbMetrics implements Serializable {

    private static final long serialVersionUID = -702892484;

    private String        name;
    private String        subsystem;
    private Long          count;
    private Long          maxCount;
    private Long          minCount;
    private Double        avgCount;
    private Long          countReset;
    private Long          maxCountReset;
    private Long          minCountReset;
    private Double        avgCountReset;
    private LocalDateTime timeEnabled;
    private LocalDateTime timeDisabled;
    private Long          timeElapsed;
    private LocalDateTime timeReset;
    private String        status;
    private String        type;
    private String        comment;

    public InnodbMetrics() {}

    public InnodbMetrics(InnodbMetrics value) {
        this.name = value.name;
        this.subsystem = value.subsystem;
        this.count = value.count;
        this.maxCount = value.maxCount;
        this.minCount = value.minCount;
        this.avgCount = value.avgCount;
        this.countReset = value.countReset;
        this.maxCountReset = value.maxCountReset;
        this.minCountReset = value.minCountReset;
        this.avgCountReset = value.avgCountReset;
        this.timeEnabled = value.timeEnabled;
        this.timeDisabled = value.timeDisabled;
        this.timeElapsed = value.timeElapsed;
        this.timeReset = value.timeReset;
        this.status = value.status;
        this.type = value.type;
        this.comment = value.comment;
    }

    public InnodbMetrics(
        String        name,
        String        subsystem,
        Long          count,
        Long          maxCount,
        Long          minCount,
        Double        avgCount,
        Long          countReset,
        Long          maxCountReset,
        Long          minCountReset,
        Double        avgCountReset,
        LocalDateTime timeEnabled,
        LocalDateTime timeDisabled,
        Long          timeElapsed,
        LocalDateTime timeReset,
        String        status,
        String        type,
        String        comment
    ) {
        this.name = name;
        this.subsystem = subsystem;
        this.count = count;
        this.maxCount = maxCount;
        this.minCount = minCount;
        this.avgCount = avgCount;
        this.countReset = countReset;
        this.maxCountReset = maxCountReset;
        this.minCountReset = minCountReset;
        this.avgCountReset = avgCountReset;
        this.timeEnabled = timeEnabled;
        this.timeDisabled = timeDisabled;
        this.timeElapsed = timeElapsed;
        this.timeReset = timeReset;
        this.status = status;
        this.type = type;
        this.comment = comment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubsystem() {
        return this.subsystem;
    }

    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getMaxCount() {
        return this.maxCount;
    }

    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    public Long getMinCount() {
        return this.minCount;
    }

    public void setMinCount(Long minCount) {
        this.minCount = minCount;
    }

    public Double getAvgCount() {
        return this.avgCount;
    }

    public void setAvgCount(Double avgCount) {
        this.avgCount = avgCount;
    }

    public Long getCountReset() {
        return this.countReset;
    }

    public void setCountReset(Long countReset) {
        this.countReset = countReset;
    }

    public Long getMaxCountReset() {
        return this.maxCountReset;
    }

    public void setMaxCountReset(Long maxCountReset) {
        this.maxCountReset = maxCountReset;
    }

    public Long getMinCountReset() {
        return this.minCountReset;
    }

    public void setMinCountReset(Long minCountReset) {
        this.minCountReset = minCountReset;
    }

    public Double getAvgCountReset() {
        return this.avgCountReset;
    }

    public void setAvgCountReset(Double avgCountReset) {
        this.avgCountReset = avgCountReset;
    }

    public LocalDateTime getTimeEnabled() {
        return this.timeEnabled;
    }

    public void setTimeEnabled(LocalDateTime timeEnabled) {
        this.timeEnabled = timeEnabled;
    }

    public LocalDateTime getTimeDisabled() {
        return this.timeDisabled;
    }

    public void setTimeDisabled(LocalDateTime timeDisabled) {
        this.timeDisabled = timeDisabled;
    }

    public Long getTimeElapsed() {
        return this.timeElapsed;
    }

    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public LocalDateTime getTimeReset() {
        return this.timeReset;
    }

    public void setTimeReset(LocalDateTime timeReset) {
        this.timeReset = timeReset;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbMetrics (");

        sb.append(name);
        sb.append(", ").append(subsystem);
        sb.append(", ").append(count);
        sb.append(", ").append(maxCount);
        sb.append(", ").append(minCount);
        sb.append(", ").append(avgCount);
        sb.append(", ").append(countReset);
        sb.append(", ").append(maxCountReset);
        sb.append(", ").append(minCountReset);
        sb.append(", ").append(avgCountReset);
        sb.append(", ").append(timeEnabled);
        sb.append(", ").append(timeDisabled);
        sb.append(", ").append(timeElapsed);
        sb.append(", ").append(timeReset);
        sb.append(", ").append(status);
        sb.append(", ").append(type);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }
}
