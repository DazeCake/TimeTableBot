/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.records;


import io.github.mzdluo123.timetablebot.gen.information_schema.tables.AllPlugins;
import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllPluginsRecord extends TableRecordImpl<AllPluginsRecord> implements Record13<String, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -722231976;

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_NAME</code>.
     */
    public void setPluginName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_NAME</code>.
     */
    public String getPluginName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_VERSION</code>.
     */
    public void setPluginVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_VERSION</code>.
     */
    public String getPluginVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_STATUS</code>.
     */
    public void setPluginStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_STATUS</code>.
     */
    public String getPluginStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_TYPE</code>.
     */
    public void setPluginType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_TYPE</code>.
     */
    public String getPluginType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public void setPluginTypeVersion(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public String getPluginTypeVersion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public void setPluginLibrary(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public String getPluginLibrary() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public void setPluginLibraryVersion(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public String getPluginLibraryVersion() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public void setPluginAuthor(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public String getPluginAuthor() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public void setPluginDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public String getPluginDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_LICENSE</code>.
     */
    public void setPluginLicense(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_LICENSE</code>.
     */
    public String getPluginLicense() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.LOAD_OPTION</code>.
     */
    public void setLoadOption(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.LOAD_OPTION</code>.
     */
    public String getLoadOption() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_MATURITY</code>.
     */
    public void setPluginMaturity(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_MATURITY</code>.
     */
    public String getPluginMaturity() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.ALL_PLUGINS.PLUGIN_AUTH_VERSION</code>.
     */
    public void setPluginAuthVersion(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.ALL_PLUGINS.PLUGIN_AUTH_VERSION</code>.
     */
    public String getPluginAuthVersion() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_NAME;
    }

    @Override
    public Field<String> field2() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_VERSION;
    }

    @Override
    public Field<String> field3() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_STATUS;
    }

    @Override
    public Field<String> field4() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_TYPE;
    }

    @Override
    public Field<String> field5() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_TYPE_VERSION;
    }

    @Override
    public Field<String> field6() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_LIBRARY;
    }

    @Override
    public Field<String> field7() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_LIBRARY_VERSION;
    }

    @Override
    public Field<String> field8() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_AUTHOR;
    }

    @Override
    public Field<String> field9() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_DESCRIPTION;
    }

    @Override
    public Field<String> field10() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_LICENSE;
    }

    @Override
    public Field<String> field11() {
        return AllPlugins.ALL_PLUGINS.LOAD_OPTION;
    }

    @Override
    public Field<String> field12() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_MATURITY;
    }

    @Override
    public Field<String> field13() {
        return AllPlugins.ALL_PLUGINS.PLUGIN_AUTH_VERSION;
    }

    @Override
    public String component1() {
        return getPluginName();
    }

    @Override
    public String component2() {
        return getPluginVersion();
    }

    @Override
    public String component3() {
        return getPluginStatus();
    }

    @Override
    public String component4() {
        return getPluginType();
    }

    @Override
    public String component5() {
        return getPluginTypeVersion();
    }

    @Override
    public String component6() {
        return getPluginLibrary();
    }

    @Override
    public String component7() {
        return getPluginLibraryVersion();
    }

    @Override
    public String component8() {
        return getPluginAuthor();
    }

    @Override
    public String component9() {
        return getPluginDescription();
    }

    @Override
    public String component10() {
        return getPluginLicense();
    }

    @Override
    public String component11() {
        return getLoadOption();
    }

    @Override
    public String component12() {
        return getPluginMaturity();
    }

    @Override
    public String component13() {
        return getPluginAuthVersion();
    }

    @Override
    public String value1() {
        return getPluginName();
    }

    @Override
    public String value2() {
        return getPluginVersion();
    }

    @Override
    public String value3() {
        return getPluginStatus();
    }

    @Override
    public String value4() {
        return getPluginType();
    }

    @Override
    public String value5() {
        return getPluginTypeVersion();
    }

    @Override
    public String value6() {
        return getPluginLibrary();
    }

    @Override
    public String value7() {
        return getPluginLibraryVersion();
    }

    @Override
    public String value8() {
        return getPluginAuthor();
    }

    @Override
    public String value9() {
        return getPluginDescription();
    }

    @Override
    public String value10() {
        return getPluginLicense();
    }

    @Override
    public String value11() {
        return getLoadOption();
    }

    @Override
    public String value12() {
        return getPluginMaturity();
    }

    @Override
    public String value13() {
        return getPluginAuthVersion();
    }

    @Override
    public AllPluginsRecord value1(String value) {
        setPluginName(value);
        return this;
    }

    @Override
    public AllPluginsRecord value2(String value) {
        setPluginVersion(value);
        return this;
    }

    @Override
    public AllPluginsRecord value3(String value) {
        setPluginStatus(value);
        return this;
    }

    @Override
    public AllPluginsRecord value4(String value) {
        setPluginType(value);
        return this;
    }

    @Override
    public AllPluginsRecord value5(String value) {
        setPluginTypeVersion(value);
        return this;
    }

    @Override
    public AllPluginsRecord value6(String value) {
        setPluginLibrary(value);
        return this;
    }

    @Override
    public AllPluginsRecord value7(String value) {
        setPluginLibraryVersion(value);
        return this;
    }

    @Override
    public AllPluginsRecord value8(String value) {
        setPluginAuthor(value);
        return this;
    }

    @Override
    public AllPluginsRecord value9(String value) {
        setPluginDescription(value);
        return this;
    }

    @Override
    public AllPluginsRecord value10(String value) {
        setPluginLicense(value);
        return this;
    }

    @Override
    public AllPluginsRecord value11(String value) {
        setLoadOption(value);
        return this;
    }

    @Override
    public AllPluginsRecord value12(String value) {
        setPluginMaturity(value);
        return this;
    }

    @Override
    public AllPluginsRecord value13(String value) {
        setPluginAuthVersion(value);
        return this;
    }

    @Override
    public AllPluginsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AllPluginsRecord
     */
    public AllPluginsRecord() {
        super(AllPlugins.ALL_PLUGINS);
    }

    /**
     * Create a detached, initialised AllPluginsRecord
     */
    public AllPluginsRecord(String pluginName, String pluginVersion, String pluginStatus, String pluginType, String pluginTypeVersion, String pluginLibrary, String pluginLibraryVersion, String pluginAuthor, String pluginDescription, String pluginLicense, String loadOption, String pluginMaturity, String pluginAuthVersion) {
        super(AllPlugins.ALL_PLUGINS);

        set(0, pluginName);
        set(1, pluginVersion);
        set(2, pluginStatus);
        set(3, pluginType);
        set(4, pluginTypeVersion);
        set(5, pluginLibrary);
        set(6, pluginLibraryVersion);
        set(7, pluginAuthor);
        set(8, pluginDescription);
        set(9, pluginLicense);
        set(10, loadOption);
        set(11, pluginMaturity);
        set(12, pluginAuthVersion);
    }
}
