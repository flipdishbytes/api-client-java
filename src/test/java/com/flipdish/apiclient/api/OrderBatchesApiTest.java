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
import org.threeten.bp.OffsetDateTime;
import com.flipdish.apiclient.model.RestApiArrayResultOrderBatchSummary;
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
     * Returns order batches
     *
     * Entries are sorted by date, from the most recent. At most 100 entries are returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOrderBatchesTest() throws ApiException {
        String appId = null;
        Integer storeId = null;
        OffsetDateTime createdFrom = null;
        OffsetDateTime createdTo = null;
        RestApiArrayResultOrderBatchSummary response = api.getAllOrderBatches(appId, storeId, createdFrom, createdTo);

        // TODO: test validations
    }
    
    /**
     * Returns the order batch details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderBatchTest() throws ApiException {
        String appId = null;
        Integer storeId = null;
        Integer orderBatchId = null;
        RestApiResultOrderBatch response = api.getOrderBatch(appId, storeId, orderBatchId);

        // TODO: test validations
    }
    
}
