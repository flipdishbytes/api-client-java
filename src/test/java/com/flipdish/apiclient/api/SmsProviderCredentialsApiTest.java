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

import com.flipdish.apiclient.model.RestApiArrayResultSmsProviderCredential;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultSmsProviderCredential;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.SmsProviderCredential;
import com.flipdish.apiclient.model.SmsProviderCredentialUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmsProviderCredentialsApi
 */
@Ignore
public class SmsProviderCredentialsApiTest {

    private final SmsProviderCredentialsApi api = new SmsProviderCredentialsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBrandSmsProviderCredentialByServiceTypeTest() throws Exception {
        String orgId = null;
        String brandId = null;
        String serviceType = null;
        Boolean withFallback = null;
        RestApiResultSmsProviderCredential response = api.getBrandSmsProviderCredentialByServiceType(orgId, brandId, serviceType, withFallback);

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
    public void getBrandSmsProviderCredentialsTest() throws Exception {
        String orgId = null;
        String brandId = null;
        RestApiArrayResultSmsProviderCredential response = api.getBrandSmsProviderCredentials(orgId, brandId);

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
    public void smsProviderCredentialDeleteTest() throws Exception {
        String orgId = null;
        String brandId = null;
        String serviceType = null;
        RestApiResultSmsProviderCredential response = api.smsProviderCredentialDelete(orgId, brandId, serviceType);

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
    public void smsProviderCredentialUpdateTest() throws Exception {
        String orgId = null;
        String brandId = null;
        String serviceType = null;
        SmsProviderCredentialUpdateRequest credential = null;
        RestApiResultSmsProviderCredential response = api.smsProviderCredentialUpdate(orgId, brandId, serviceType, credential);

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
    public void smsProviderCredentialsBulkUpsertTest() throws Exception {
        List<SmsProviderCredential> credentials = null;
        RestApiArrayResultSmsProviderCredential response = api.smsProviderCredentialsBulkUpsert(credentials);

        // TODO: test validations
    }
    
}
