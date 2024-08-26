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

import com.flipdish.apiclient.model.ExecuteConfigurationActionRequest;
import com.flipdish.apiclient.model.RestApiArrayResultAppStoreAppConfigurationSummary;
import com.flipdish.apiclient.model.RestApiArrayResultAppStoreAppSummary;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAppStoreAppConfiguration;
import com.flipdish.apiclient.model.RestApiResultExecuteConfigurationActionResult;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.UpdateAppStoreAppConfiguration;
import com.flipdish.apiclient.model.UpdateAppStoreAppConfigurationValuesBatch;
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
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void appStoreConfigurationsAppStoreHandleOauthResponseCodeTest() throws Exception {
        String appStoreAppId = null;
        Object response = api.appStoreConfigurationsAppStoreHandleOauthResponseCode(appStoreAppId);

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
    public void createAppStoreConfigTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        RestApiResultAppStoreAppConfiguration response = api.createAppStoreConfig(appId, appStoreAppId);

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
    public void deleteAppStoreConfigTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        RestApiStringResult response = api.deleteAppStoreConfig(appId, appStoreAppId, configId);

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
    public void executeConfigurationActionTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        ExecuteConfigurationActionRequest executeConfigurationActionRequest = null;
        RestApiResultExecuteConfigurationActionResult response = api.executeConfigurationAction(appId, appStoreAppId, configId, executeConfigurationActionRequest);

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
    public void getAppStoreConfigTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        RestApiResultAppStoreAppConfiguration response = api.getAppStoreConfig(appId, appStoreAppId, configId);

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
    public void getConfiguredAppSingleAppTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        RestApiArrayResultAppStoreAppConfigurationSummary response = api.getConfiguredAppSingleApp(appId, appStoreAppId);

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
    public void getConfiguredAppsTest() throws Exception {
        String appId = null;
        RestApiArrayResultAppStoreAppSummary response = api.getConfiguredApps(appId);

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
    public void updateAppStoreConfigTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        UpdateAppStoreAppConfiguration updateAppStoreAppConfiguration = null;
        api.updateAppStoreConfig(appId, appStoreAppId, configId, updateAppStoreAppConfiguration);

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
    public void updateAppStoreConfigSettingValuesTest() throws Exception {
        String appId = null;
        String appStoreAppId = null;
        String configId = null;
        UpdateAppStoreAppConfigurationValuesBatch updateAppStoreAppConfigurationValues = null;
        api.updateAppStoreConfigSettingValues(appId, appStoreAppId, configId, updateAppStoreAppConfigurationValues);

        // TODO: test validations
    }
    
}
