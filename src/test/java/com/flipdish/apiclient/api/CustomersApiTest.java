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

import com.flipdish.apiclient.model.CustomerCreateModel;
import com.flipdish.apiclient.model.CustomerUpdateModel;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultCustomer;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
@Ignore
public class CustomersApiTest {

    private final CustomersApi api = new CustomersApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCustomerTest() throws Exception {
        String appId = null;
        CustomerCreateModel customerCreateModel = null;
        RestApiResultCustomer response = api.createCustomer(appId, customerCreateModel);

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
    public void getCustomerByIdTest() throws Exception {
        String appId = null;
        Integer customerId = null;
        RestApiResultCustomer response = api.getCustomerById(appId, customerId);

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
    public void updateCustomerByIdTest() throws Exception {
        String appId = null;
        Integer customerId = null;
        CustomerUpdateModel updateCustomer = null;
        RestApiResultCustomer response = api.updateCustomerById(appId, customerId, updateCustomer);

        // TODO: test validations
    }
    
}
