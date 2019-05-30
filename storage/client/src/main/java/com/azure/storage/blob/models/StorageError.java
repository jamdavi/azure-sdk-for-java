// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The StorageError model.
 */
@JacksonXmlRootElement(localName = "StorageError")
public final class StorageError {
    /*
     * The code property.
     */
    @JsonProperty(value = "Code")
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "Message")
    private String message;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the StorageError object itself.
     */
    public StorageError code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the StorageError object itself.
     */
    public StorageError message(String message) {
        this.message = message;
        return this;
    }
}
