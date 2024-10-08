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

import com.flipdish.apiclient.model.CreateFulfillmentStatesConfiguration;
import com.flipdish.apiclient.model.FulfillmentStatesConfiguration;
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
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentStatesConfigTest() throws Exception {
        String appId = null;
        CreateFulfillmentStatesConfiguration fulfillmentStateConfiguration = null;
        RestApiResultFulfillmentStatesConfiguration response = api.createFulfillmentStatesConfig(appId, fulfillmentStateConfiguration);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteFulfillmentStatesConfigTest() throws Exception {
        String appId = null;
        String configId = null;
        RestApiStringResult response = api.deleteFulfillmentStatesConfig(appId, configId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentStatesConfigurationTest() throws Exception {
        String appId = null;
        String configId = null;
        FulfillmentStatesConfiguration response = api.getFulfillmentStatesConfiguration(appId, configId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentStatesConfigurationTemplateTest() throws Exception {
        String appId = null;
        FulfillmentStatesConfiguration response = api.getFulfillmentStatesConfigurationTemplate(appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchFulfillmentStatesConfigurationsTest() throws Exception {
        String appId = null;
        RestApiArrayResultFulfillmentStatesConfigurationSummary response = api.searchFulfillmentStatesConfigurations(appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateFulfillmentStatesConfigTest() throws Exception {
        String appId = null;
        String configId = null;
        UpdateFulfillmentStatesConfiguration updateFulfillmentStatesConfiguration = null;
        api.updateFulfillmentStatesConfig(appId, configId, updateFulfillmentStatesConfiguration);

        // TODO: test validations
    }
    
}
