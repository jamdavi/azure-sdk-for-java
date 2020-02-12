/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.GlobalAdministrators;
import rx.Completable;

class GlobalAdministratorsImpl extends WrapperImpl<GlobalAdministratorsInner> implements GlobalAdministrators {
    private final AuthorizationManager manager;

    GlobalAdministratorsImpl(AuthorizationManager manager) {
        super(manager.inner().globalAdministrators());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Completable elevateAccessAsync() {
        GlobalAdministratorsInner client = this.inner();
        return client.elevateAccessAsync().toCompletable();
    }

}