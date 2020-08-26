/*
 * This file is generated by jOOQ.
 */
package io.github.mzdluo123.timetablebot.gen.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserVariables implements Serializable {

    private static final long serialVersionUID = -636714772;

    private String variableName;
    private String variableValue;
    private String variableType;
    private String characterSetName;

    public UserVariables() {}

    public UserVariables(UserVariables value) {
        this.variableName = value.variableName;
        this.variableValue = value.variableValue;
        this.variableType = value.variableType;
        this.characterSetName = value.characterSetName;
    }

    public UserVariables(
        String variableName,
        String variableValue,
        String variableType,
        String characterSetName
    ) {
        this.variableName = variableName;
        this.variableValue = variableValue;
        this.variableType = variableType;
        this.characterSetName = characterSetName;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableValue() {
        return this.variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    public String getVariableType() {
        return this.variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserVariables (");

        sb.append(variableName);
        sb.append(", ").append(variableValue);
        sb.append(", ").append(variableType);
        sb.append(", ").append(characterSetName);

        sb.append(")");
        return sb.toString();
    }
}
