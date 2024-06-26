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
import com.flipdish.apiclient.model.AddAppStoreSubscriptionRequest;
import com.flipdish.apiclient.model.RestApiArrayResultAppStoreSubscriptionItem;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAppStoreAppEntitlements;
import com.flipdish.apiclient.model.RestApiResultAppStoreSubscriptionChangeJobStatusResponse;
import com.flipdish.apiclient.model.RestApiResultAppStoreSubscriptionJobResponse;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.UpdateAppStoreSubscriptionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppStoreSubscriptionsApi
 */
@Ignore
public class AppStoreSubscriptionsApiTest {

    private final AppStoreSubscriptionsApi api = new AppStoreSubscriptionsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppStoreSubscriptionTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        AddAppStoreSubscriptionRequest addAppStoreSubscriptionRequest = null;
        RestApiResultAppStoreSubscriptionJobResponse response = api.createAppStoreSubscription(appId, appStoreAppId, addAppStoreSubscriptionRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppSubscriptionTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String subscriptionId = null;
        RestApiResultAppStoreSubscriptionJobResponse response = api.deleteAppSubscription(appId, appStoreAppId, subscriptionId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppStoreAppEntitlementsTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        RestApiResultAppStoreAppEntitlements response = api.getAppStoreAppEntitlements(appId, appStoreAppId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppStoreSubscriptionChangeJobStatusTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String jobId = null;
        RestApiResultAppStoreSubscriptionChangeJobStatusResponse response = api.getAppStoreSubscriptionChangeJobStatus(appId, appStoreAppId, jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppStoreSubscriptionsTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        RestApiArrayResultAppStoreSubscriptionItem response = api.getAppStoreSubscriptions(appId, appStoreAppId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppStoreSubscriptionTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String subscriptionId = null;
        UpdateAppStoreSubscriptionRequest updateAppStoreSubscriptionRequest = null;
        RestApiResultAppStoreSubscriptionJobResponse response = api.updateAppStoreSubscription(appId, appStoreAppId, subscriptionId, updateAppStoreSubscriptionRequest);

        // TODO: test validations
    }
    
}
