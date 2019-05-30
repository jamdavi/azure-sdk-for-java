// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * An Azure Storage file range.
 */
@JacksonXmlRootElement(localName = "Range")
public final class Range {
    /*
     * Start of the range.
     */
    @JsonProperty(value = "Start", required = true)
    private long start;

    /*
     * End of the range.
     */
    @JsonProperty(value = "End", required = true)
    private long end;

    /**
     * Get the start property: Start of the range.
     *
     * @return the start value.
     */
    public long start() {
        return this.start;
    }

    /**
     * Set the start property: Start of the range.
     *
     * @param start the start value to set.
     * @return the Range object itself.
     */
    public Range start(long start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: End of the range.
     *
     * @return the end value.
     */
    public long end() {
        return this.end;
    }

    /**
     * Set the end property: End of the range.
     *
     * @param end the end value to set.
     * @return the Range object itself.
     */
    public Range end(long end) {
        this.end = end;
        return this;
    }
}
