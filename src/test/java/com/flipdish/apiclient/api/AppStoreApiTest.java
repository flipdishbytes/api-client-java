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

import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultAppStoreAppSummary;
import com.flipdish.apiclient.model.RestApiResultAppStoreApp;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppStoreApi
 */
@Ignore
public class AppStoreApiTest {

    private final AppStoreApi api = new AppStoreApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAppStoreAppTest() throws Exception {
        String appStoreAppId = null;
        String appId = null;
        RestApiResultAppStoreApp response = api.getAppStoreApp(appStoreAppId, appId);

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
    public void getAppStoreAppsTest() throws Exception {
        String search = null;
        Integer page = null;
        Integer limit = null;
        Boolean excludeNotOwned = null;
        Boolean showOnlyVerified = null;
        RestApiPaginationResultAppStoreAppSummary response = api.getAppStoreApps(search, page, limit, excludeNotOwned, showOnlyVerified);

        // TODO: test validations
    }
    
}
