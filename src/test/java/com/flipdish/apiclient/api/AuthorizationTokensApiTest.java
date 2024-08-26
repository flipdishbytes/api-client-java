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
import com.flipdish.apiclient.model.RestApiPaginationResultOAuthTokenModel;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizationTokensApi
 */
@Ignore
public class AuthorizationTokensApiTest {

    private final AuthorizationTokensApi api = new AuthorizationTokensApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuthorizationTokensTest() throws Exception {
        String oauthAppId = null;
        String appId = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultOAuthTokenModel response = api.getAuthorizationTokens(oauthAppId, appId, page, limit);

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
    public void revokeTokenTest() throws Exception {
        String key = null;
        String appId = null;
        api.revokeToken(key, appId);

        // TODO: test validations
    }
    
}
