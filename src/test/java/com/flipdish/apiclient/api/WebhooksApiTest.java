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

import org.threeten.bp.OffsetDateTime;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiIntegerResult;
import com.flipdish.apiclient.model.RestApiPaginationResultWebhookLog;
import com.flipdish.apiclient.model.RestApiPaginationResultWebhookSubscription;
import com.flipdish.apiclient.model.RestApiStringArrayResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.WebhookEventSample;
import com.flipdish.apiclient.model.WebhookSubscription;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createWebhookSubscriptionTest() throws Exception {
        String oauthAppId = null;
        WebhookSubscription webhookSubscription = null;
        String appId = null;
        RestApiIntegerResult response = api.createWebhookSubscription(oauthAppId, webhookSubscription, appId);

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
    public void createWebhookSubscriptionEventNamesTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        String eventName = null;
        String appId = null;
        api.createWebhookSubscriptionEventNames(oauthAppId, webhookSubscriptionId, eventName, appId);

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
    public void deleteWebhookSubscriptionTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        String appId = null;
        api.deleteWebhookSubscription(oauthAppId, webhookSubscriptionId, appId);

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
    public void deleteWebhookSubscriptionEventNameTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        String eventName = null;
        String appId = null;
        api.deleteWebhookSubscriptionEventName(oauthAppId, webhookSubscriptionId, eventName, appId);

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
    public void getWebhookEventNamesTest() throws Exception {
        String appId = null;
        RestApiStringArrayResult response = api.getWebhookEventNames(appId);

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
    public void getWebhookEventNamesBySubscriptionIdTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        String appId = null;
        RestApiStringArrayResult response = api.getWebhookEventNamesBySubscriptionId(oauthAppId, webhookSubscriptionId, appId);

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
    public void getWebhookEventSampleTest() throws Exception {
        String eventName = null;
        String appId = null;
        String oauthAppId = null;
        String webhookSubscriptionId = null;
        String version = null;
        WebhookEventSample response = api.getWebhookEventSample(eventName, appId, oauthAppId, webhookSubscriptionId, version);

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
    public void getWebhookLogsTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        String appId = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultWebhookLog response = api.getWebhookLogs(oauthAppId, webhookSubscriptionId, start, end, appId, page, limit);

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
    public void getWebhookSubscriptionsTest() throws Exception {
        String oauthAppId = null;
        String appId = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultWebhookSubscription response = api.getWebhookSubscriptions(oauthAppId, appId, page, limit);

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
    public void updateWebhookSubscriptionTest() throws Exception {
        String oauthAppId = null;
        Integer webhookSubscriptionId = null;
        WebhookSubscription webhookSubscription = null;
        String appId = null;
        api.updateWebhookSubscription(oauthAppId, webhookSubscriptionId, webhookSubscription, appId);

        // TODO: test validations
    }
    
}
