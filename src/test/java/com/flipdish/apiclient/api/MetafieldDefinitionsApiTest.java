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
import com.flipdish.apiclient.model.CreateMetafieldDefinition;
import com.flipdish.apiclient.model.OwnerEntityConfigurations;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultMetafieldDefinition;
import com.flipdish.apiclient.model.RestApiPaginationResultMetafieldDefinitionRecommendation;
import com.flipdish.apiclient.model.RestApiResultMetafieldDefinition;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.UpdateMetafieldDefinition;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetafieldDefinitionsApi
 */
@Ignore
public class MetafieldDefinitionsApiTest {

    private final MetafieldDefinitionsApi api = new MetafieldDefinitionsApi();

    
    /**
     * Create a Metafield Definition
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMetafieldDefinitionTest() throws ApiException {
        String appId = null;
        String ownerEntity = null;
        CreateMetafieldDefinition createMetafieldDefinition = null;
        RestApiResultMetafieldDefinition response = api.createMetafieldDefinition(appId, ownerEntity, createMetafieldDefinition);

        // TODO: test validations
    }
    
    /**
     * Get a Metafield Definition for the specified owner entity and key.
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetafieldDefinitionByKeyTest() throws ApiException {
        String appId = null;
        String ownerEntity = null;
        String key = null;
        RestApiResultMetafieldDefinition response = api.getMetafieldDefinitionByKey(appId, ownerEntity, key);

        // TODO: test validations
    }
    
    /**
     * Get Metafield Definitions for the specified owner entity.
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetafieldDefinitionsTest() throws ApiException {
        String appId = null;
        String ownerEntity = null;
        String searchTerm = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultMetafieldDefinition response = api.getMetafieldDefinitions(appId, ownerEntity, searchTerm, page, limit);

        // TODO: test validations
    }
    
    /**
     * Get OwnerEntity Configurations which contain information to manage Metafield Definitions
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOwnerEntityConfigurationsTest() throws ApiException {
        String appId = null;
        OwnerEntityConfigurations response = api.getOwnerEntityConfigurations(appId);

        // TODO: test validations
    }
    
    /**
     * Get OwnerEntity Definition Recommendations
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOwnerEntityRecommendationsTest() throws ApiException {
        String appId = null;
        String ownerEntity = null;
        String searchTerm = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultMetafieldDefinitionRecommendation response = api.getOwnerEntityRecommendations(appId, ownerEntity, searchTerm, page, limit);

        // TODO: test validations
    }
    
    /**
     * Update a Metafield Definition
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetafieldDefinitionTest() throws ApiException {
        String appId = null;
        String ownerEntity = null;
        String key = null;
        UpdateMetafieldDefinition updateMetafieldDefinition = null;
        RestApiResultMetafieldDefinition response = api.updateMetafieldDefinition(appId, ownerEntity, key, updateMetafieldDefinition);

        // TODO: test validations
    }
    
}
