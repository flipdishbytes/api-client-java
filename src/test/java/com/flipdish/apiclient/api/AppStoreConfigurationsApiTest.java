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
import com.flipdish.apiclient.model.AppConfiguration;
import com.flipdish.apiclient.model.AppConfigurationDetail;
import com.flipdish.apiclient.model.RestApiArrayResultAppConfigurationHeader;
import com.flipdish.apiclient.model.RestApiArrayResultAppConfigurationSummary;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAppConfigurationSummary;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppStoreConfigurationsApi
 */
@Ignore
public class AppStoreConfigurationsApiTest {

    private final AppStoreConfigurationsApi api = new AppStoreConfigurationsApi();

    
    /**
     * Create app store app configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system] This adds an Application to a Whitelabel that can later be configured to specific stores
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAppStoreConfigTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        RestApiResultAppConfigurationSummary response = api.createAppStoreConfig(appId, appStoreAppId);

        // TODO: test validations
    }
    
    /**
     * Delete app store app configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppStoreConfigTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        RestApiStringResult response = api.deleteAppStoreConfig(appId, appStoreAppId, configId);

        // TODO: test validations
    }
    
    /**
     * Get app store app configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppStoreConfigTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        AppConfigurationDetail response = api.getAppStoreConfig(appId, appStoreAppId, configId);

        // TODO: test validations
    }
    
    /**
     * Get list of app store app configurations for one app store app
     *
     * [ALPHA - this endpoint is not ready to be consumed]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfiguredAppSingleAppTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        RestApiArrayResultAppConfigurationSummary response = api.getConfiguredAppSingleApp(appId, appStoreAppId);

        // TODO: test validations
    }
    
    /**
     * Get list of app store apps which have been configured
     *
     * [ALPHA - this endpoint is not ready to be consumed]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfiguredAppsTest() throws ApiException {
        String appId = null;
        RestApiArrayResultAppConfigurationHeader response = api.getConfiguredApps(appId);

        // TODO: test validations
    }
    
    /**
     * Update app store app configuration
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppStoreConfigTest() throws ApiException {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        AppConfiguration appConfigurationBase = null;
        api.updateAppStoreConfig(appId, appStoreAppId, configId, appConfigurationBase);

        // TODO: test validations
    }
    
}