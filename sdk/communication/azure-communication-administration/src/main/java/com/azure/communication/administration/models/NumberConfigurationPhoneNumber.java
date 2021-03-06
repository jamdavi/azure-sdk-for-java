// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NumberConfigurationPhoneNumber model. */
@Fluent
public final class NumberConfigurationPhoneNumber {
    /*
     * The phone number in the E.164 format
     */
    @JsonProperty(value = "phoneNumber", required = true)
    private String phoneNumber;

    /**
     * Get the phoneNumber property: The phone number in the E.164 format.
     *
     * @return the phoneNumber value.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: The phone number in the E.164 format.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the NumberConfigurationPhoneNumber object itself.
     */
    public NumberConfigurationPhoneNumber setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
