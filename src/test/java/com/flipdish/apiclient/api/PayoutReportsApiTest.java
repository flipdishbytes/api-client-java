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
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultPayoutReport3PayoutOrder;
import com.flipdish.apiclient.model.RestApiResultPayoutReport3Details;
import com.flipdish.apiclient.model.RestApiResultPayoutReport3Overview;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayoutReportsApi
 */
@Ignore
public class PayoutReportsApiTest {

    private final PayoutReportsApi api = new PayoutReportsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayoutReport3DetailsTest() throws ApiException {
        String appId = null;
        Integer bankAccountId = null;
        Integer payoutId = null;
        List<Integer> storeIds = null;
        RestApiResultPayoutReport3Details response = api.getPayoutReport3Details(appId, bankAccountId, payoutId, storeIds);

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
    public void getPayoutReport3OrdersTest() throws ApiException {
        String appId = null;
        Integer bankAccountId = null;
        Integer payoutId = null;
        List<Integer> storeIds = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultPayoutReport3PayoutOrder response = api.getPayoutReport3Orders(appId, bankAccountId, payoutId, storeIds, page, limit);

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
    public void getPayoutReport3OverviewTest() throws ApiException {
        String appId = null;
        Integer bankAccountId = null;
        Integer payoutId = null;
        RestApiResultPayoutReport3Overview response = api.getPayoutReport3Overview(appId, bankAccountId, payoutId);

        // TODO: test validations
    }
    
}
