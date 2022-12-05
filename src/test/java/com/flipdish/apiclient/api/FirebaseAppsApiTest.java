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
import com.flipdish.apiclient.model.FirebaseApp;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FirebaseAppsApi
 */
@Ignore
public class FirebaseAppsApiTest {

    private final FirebaseAppsApi api = new FirebaseAppsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void firebaseAppsAddFirebaseAppTest() throws ApiException {
        FirebaseApp firebaseApp = null;
        Object response = api.firebaseAppsAddFirebaseApp(firebaseApp);

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
    public void firebaseAppsGetFirebaseAppTest() throws ApiException {
        Integer whitelabelId = null;
        Object response = api.firebaseAppsGetFirebaseApp(whitelabelId);

        // TODO: test validations
    }
    
}