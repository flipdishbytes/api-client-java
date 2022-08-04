/*
 * Flipdish Open API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipdish.apiclient.api;

import com.flipdish.apiclient.ApiException;
import com.flipdish.apiclient.model.FulfillmentStatesConfiguration;
import com.flipdish.apiclient.model.FulfillmentStatesConfigurationCreateBase;
import com.flipdish.apiclient.model.RestApiArrayResultFulfillmentStatesConfigurationSummary;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultFulfillmentStatesConfiguration;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.UpdateFulfillmentStatesConfiguration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FulfillmentStateConfigurationApi
 */
@Ignore
public class FulfillmentStateConfigurationApiTest {

    private final FulfillmentStateConfigurationApi api = new FulfillmentStateConfigurationApi();

    
    /**
     * Create fulfillment configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentStatesConfigTest() throws ApiException {
        String appId = null;
        FulfillmentStatesConfigurationCreateBase fulfillmentStateConfiguration = null;
        RestApiResultFulfillmentStatesConfiguration response = api.createFulfillmentStatesConfig(appId, fulfillmentStateConfiguration);

        // TODO: test validations
    }
    
    /**
     * Delete fulfillment states configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFulfillmentStatesConfigTest() throws ApiException {
        String appId = null;
        String configId = null;
        RestApiStringResult response = api.deleteFulfillmentStatesConfig(appId, configId);

        // TODO: test validations
    }
    
    /**
     * Get fulfillment configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentStatesConfigurationTest() throws ApiException {
        String appId = null;
        String configId = null;
        FulfillmentStatesConfiguration response = api.getFulfillmentStatesConfiguration(appId, configId);

        // TODO: test validations
    }
    
    /**
     * List fulfillment configurations for AppId
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchFulfillmentStatesConfigurationsTest() throws ApiException {
        String appId = null;
        RestApiArrayResultFulfillmentStatesConfigurationSummary response = api.searchFulfillmentStatesConfigurations(appId);

        // TODO: test validations
    }
    
    /**
     * Update fulfillment configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFulfillmentStatesConfigTest() throws ApiException {
        String appId = null;
        String configId = null;
        UpdateFulfillmentStatesConfiguration updateFulfillmentStatesConfiguration = null;
        api.updateFulfillmentStatesConfig(appId, configId, updateFulfillmentStatesConfiguration);

        // TODO: test validations
    }
    
}
