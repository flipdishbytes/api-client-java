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
import com.flipdish.apiclient.model.RestApiArrayResultOrderBatch;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultOrderBatch;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderBatchesApi
 */
@Ignore
public class OrderBatchesApiTest {

    private final OrderBatchesApi api = new OrderBatchesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllOrderBatchesTest() throws Exception {
        String appId = null;
        List<Integer> storeIds = null;
        OffsetDateTime createdFrom = null;
        OffsetDateTime createdTo = null;
        RestApiArrayResultOrderBatch response = api.getAllOrderBatches(appId, storeIds, createdFrom, createdTo);

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
    public void getOrderBatchTest() throws Exception {
        String appId = null;
        Integer orderBatchId = null;
        RestApiResultOrderBatch response = api.getOrderBatch(appId, orderBatchId);

        // TODO: test validations
    }
    
}
