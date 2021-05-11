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
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultJobResponse;
import com.flipdish.apiclient.model.RestApiResultStuartSettings;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.StuartSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StuartApi
 */
@Ignore
public class StuartApiTest {

    private final StuartApi api = new StuartApi();

    
    /**
     * Cancel a stuart job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stuartCancelJobTest() throws ApiException {
        Integer jobId = null;
        Integer storeId = null;
        Object response = api.stuartCancelJob(jobId, storeId);

        // TODO: test validations
    }
    
    /**
     * Get start job details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stuartGetJobTest() throws ApiException {
        Integer jobId = null;
        Integer storeId = null;
        RestApiResultJobResponse response = api.stuartGetJob(jobId, storeId);

        // TODO: test validations
    }
    
    /**
     * Get stuart settings for a store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stuartGetStuartSettingsTest() throws ApiException {
        Integer storeId = null;
        RestApiResultStuartSettings response = api.stuartGetStuartSettings(storeId);

        // TODO: test validations
    }
    
    /**
     * Set stuart settings for a store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stuartPostStuartSettingsTest() throws ApiException {
        Integer storeId = null;
        StuartSettings stuartSettings = null;
        Object response = api.stuartPostStuartSettings(storeId, stuartSettings);

        // TODO: test validations
    }
    
}
