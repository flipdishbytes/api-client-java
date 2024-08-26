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

import com.flipdish.apiclient.model.CatalogItem;
import com.flipdish.apiclient.model.CreateCatalogItem;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultCatalogItem;
import com.flipdish.apiclient.model.RestApiResultCatalogItem;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.UpdateCatalogItem;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogItemsApi
 */
@Ignore
public class CatalogItemsApiTest {

    private final CatalogItemsApi api = new CatalogItemsApi();

    
    /**
     * Archive Catalog Item
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void archiveCatalogItemTest() throws Exception {
        String appId = null;
        String catalogItemId = null;
        api.archiveCatalogItem(appId, catalogItemId);

        // TODO: test validations
    }
    
    /**
     * Create a Catalog Item
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCatalogItemTest() throws Exception {
        String appId = null;
        CreateCatalogItem createCatalogItem = null;
        RestApiResultCatalogItem response = api.createCatalogItem(appId, createCatalogItem);

        // TODO: test validations
    }
    
    /**
     * Duplicate Catalog Item
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void duplicateCatalogItemTest() throws Exception {
        String appId = null;
        String catalogItemId = null;
        api.duplicateCatalogItem(appId, catalogItemId);

        // TODO: test validations
    }
    
    /**
     * Get item by Id
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCatalogItemByIdTest() throws Exception {
        String appId = null;
        String catalogItemId = null;
        CatalogItem response = api.getCatalogItemById(appId, catalogItemId);

        // TODO: test validations
    }
    
    /**
     * Get paginated items by app name id filtered by types
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsTest() throws Exception {
        String appId = null;
        List<String> itemTypes = null;
        String searchTerm = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultCatalogItem response = api.getItems(appId, itemTypes, searchTerm, page, limit);

        // TODO: test validations
    }
    
    /**
     * Update Catalog Item
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCatalogItemTest() throws Exception {
        String appId = null;
        String catalogItemId = null;
        UpdateCatalogItem updateCatalogItem = null;
        api.updateCatalogItem(appId, catalogItemId, updateCatalogItem);

        // TODO: test validations
    }
    
}
