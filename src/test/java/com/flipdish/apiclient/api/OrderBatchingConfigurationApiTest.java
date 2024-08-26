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
import com.flipdish.apiclient.model.RestApiResultOrderBatchingConfiguration;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.SetOrderBatchingConfiguration;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderBatchingConfigurationApi
 */
@Ignore
public class OrderBatchingConfigurationApiTest {

    private final OrderBatchingConfigurationApi api = new OrderBatchingConfigurationApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTest() throws Exception {
        Integer storeId = null;
        RestApiResultOrderBatchingConfiguration response = api.get(storeId);

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
    public void postTest() throws Exception {
        Integer storeId = null;
        SetOrderBatchingConfiguration setOrderBatchingConfiguration = null;
        api.post(storeId, setOrderBatchingConfiguration);

        // TODO: test validations
    }
    
}
