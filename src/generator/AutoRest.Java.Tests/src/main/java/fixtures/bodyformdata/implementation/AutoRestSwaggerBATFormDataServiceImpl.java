/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata.implementation;

import fixtures.bodyformdata.AutoRestSwaggerBATFormDataService;
import fixtures.bodyformdata.Formdatas;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the AutoRestSwaggerBATFormDataService class.
 */
public class AutoRestSwaggerBATFormDataServiceImpl extends ServiceClient implements AutoRestSwaggerBATFormDataService {

    /**
     * The Formdatas object to access its operations.
     */
    private Formdatas formdatas;

    /**
     * Gets the Formdatas object to access its operations.
     * @return the Formdatas object.
     */
    public Formdatas formdatas() {
        return this.formdatas;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     */
    public AutoRestSwaggerBATFormDataServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATFormDataServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATFormDataServiceImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("http://localhost", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public AutoRestSwaggerBATFormDataServiceImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATFormDataService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestSwaggerBATFormDataServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.formdatas = new FormdatasImpl(retrofit(), this);
    }
}
