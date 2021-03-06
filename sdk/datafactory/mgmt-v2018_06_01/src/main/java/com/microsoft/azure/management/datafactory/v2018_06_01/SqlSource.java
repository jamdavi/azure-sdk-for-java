/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SqlSource.class)
@JsonTypeName("SqlSource")
public class SqlSource extends TabularSource {
    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlReaderQuery")
    private Object sqlReaderQuery;

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be
     * used at the same time as SqlReaderQuery. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "sqlReaderStoredProcedureName")
    private Object sqlReaderStoredProcedureName;

    /**
     * Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * Specifies the transaction locking behavior for the SQL source. Allowed
     * values:
     * ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The
     * default value is ReadCommitted. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "isolationLevel")
    private Object isolationLevel;

    /**
     * The partition mechanism that will be used for Sql read in parallel.
     * Possible values include: 'None', 'PhysicalPartitionsOfTable',
     * 'DynamicRange'.
     */
    @JsonProperty(value = "partitionOption")
    private SqlPartitionOption partitionOption;

    /**
     * The settings that will be leveraged for Sql source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private SqlPartitionSettings partitionSettings;

    /**
     * Get sQL reader query. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderQuery value
     */
    public Object sqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set sQL reader query. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderQuery the sqlReaderQuery value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderStoredProcedureName value
     */
    public Object sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withStoredProcedureParameters(Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
     *
     * @return the isolationLevel value
     */
    public Object isolationLevel() {
        return this.isolationLevel;
    }

    /**
     * Set specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
     *
     * @param isolationLevel the isolationLevel value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withIsolationLevel(Object isolationLevel) {
        this.isolationLevel = isolationLevel;
        return this;
    }

    /**
     * Get the partition mechanism that will be used for Sql read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @return the partitionOption value
     */
    public SqlPartitionOption partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partition mechanism that will be used for Sql read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @param partitionOption the partitionOption value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withPartitionOption(SqlPartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the settings that will be leveraged for Sql source partitioning.
     *
     * @return the partitionSettings value
     */
    public SqlPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the settings that will be leveraged for Sql source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set
     * @return the SqlSource object itself.
     */
    public SqlSource withPartitionSettings(SqlPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

}
