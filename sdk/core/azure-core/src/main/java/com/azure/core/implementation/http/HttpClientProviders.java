// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.core.implementation.http;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpClientProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * This class handles loading available HTTP clients
 */
public final class HttpClientProviders {
    private static HttpClientProvider defaultProvider;
    private static final String CANNOT_FIND_HTTP_CLIENT = "A request was made to load the default HttpClient provider "
        + "but one could not be found on the classpath. If you are using a dependency manager, consider including a "
        + "dependency on azure-core-http-netty or azure-core-http-okhttp. Depending on your existing dependencies, you "
        + "have the choice of Netty or OkHttp implementations. Additionally, refer to "
        + "https://aka.ms/azsdk/java/docs/custom-httpclient to learn about writing your own implementation.";

    static {
        ServiceLoader<HttpClientProvider> serviceLoader = ServiceLoader.load(HttpClientProvider.class);
        // Use the first provider found in the service loader iterator.
        Iterator<HttpClientProvider> it = serviceLoader.iterator();
        if (it.hasNext()) {
            defaultProvider = it.next();
        }
    }

    private HttpClientProviders() {
        // no-op
    }

    public static HttpClient createInstance() {
        if (defaultProvider == null) {
            throw new IllegalStateException(CANNOT_FIND_HTTP_CLIENT);
        }
        return defaultProvider.createInstance();
    }
}
