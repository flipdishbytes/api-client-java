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
import com.flipdish.apiclient.model.RestApiArrayResultProcessingFeeConfig;
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
 * API tests for ProcessingFeeConfigsApi
 */
@Ignore
public class ProcessingFeeConfigsApiTest {

    private final ProcessingFeeConfigsApi api = new ProcessingFeeConfigsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessingFeeConfigsByStoreIdsTest() throws ApiException {
        List<Integer> storeIds = null;
        RestApiArrayResultProcessingFeeConfig response = api.getProcessingFeeConfigsByStoreIds(storeIds);

        // TODO: test validations
    }
    
}
