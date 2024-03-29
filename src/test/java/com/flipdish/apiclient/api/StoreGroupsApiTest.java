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
import com.flipdish.apiclient.model.RestApiPaginationResultStoreGroup;
import com.flipdish.apiclient.model.RestApiPaginationResultStoreGroupExtended;
import com.flipdish.apiclient.model.RestApiResultStoreGroup;
import com.flipdish.apiclient.model.RestApiResultStoreGroupBase;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.StoreGroupBase;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreGroupsApi
 */
@Ignore
public class StoreGroupsApiTest {

    private final StoreGroupsApi api = new StoreGroupsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createStoreGroupTest() throws ApiException {
        String appNameId = null;
        StoreGroupBase storeGroup = null;
        RestApiResultStoreGroup response = api.createStoreGroup(appNameId, storeGroup);

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
    public void getStoreGroupTest() throws ApiException {
        Integer storeGroupId = null;
        RestApiResultStoreGroup response = api.getStoreGroup(storeGroupId);

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
    public void getStoreGroupsTest() throws ApiException {
        String appNameId = null;
        String searchQuery = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultStoreGroup response = api.getStoreGroups(appNameId, searchQuery, page, limit);

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
    public void getStoreGroupsExtendedTest() throws ApiException {
        String appNameId = null;
        String searchQuery = null;
        Integer page = null;
        Integer limit = null;
        Integer groupingRadius = null;
        RestApiPaginationResultStoreGroupExtended response = api.getStoreGroupsExtended(appNameId, searchQuery, page, limit, groupingRadius);

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
    public void removeStoreGroupTest() throws ApiException {
        Integer storeGroupId = null;
        api.removeStoreGroup(storeGroupId);

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
    public void setMenuMessagePerDeliveryTypeTest() throws ApiException {
        Integer storeGroupId = null;
        String deliveryType = null;
        String menuMessage = null;
        api.setMenuMessagePerDeliveryType(storeGroupId, deliveryType, menuMessage);

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
    public void updateStoreGroupTest() throws ApiException {
        Integer storeGroupId = null;
        StoreGroupBase storeGroup = null;
        RestApiResultStoreGroupBase response = api.updateStoreGroup(storeGroupId, storeGroup);

        // TODO: test validations
    }
    
}
