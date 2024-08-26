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

import com.flipdish.apiclient.model.ItemNutritionInfoV2AddUpdateModel;
import com.flipdish.apiclient.model.RestApiArrayResultAllergen;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultNutritionInfoV2;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenusNutritionInfoV2Api
 */
@Ignore
public class MenusNutritionInfoV2ApiTest {

    private final MenusNutritionInfoV2Api api = new MenusNutritionInfoV2Api();

    
    /**
     * Add or update menuitem nutrition info by menu item&#39;s publicId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addOrUpdateMenuItemNutritionInfoV2Test() throws Exception {
        Integer menuId = null;
        String publicId = null;
        ItemNutritionInfoV2AddUpdateModel addOrUpdateModel = null;
        String appId = null;
        Object response = api.addOrUpdateMenuItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId);

        // TODO: test validations
    }
    
    /**
     * Add or update menuitem option set item&#39;s nutrition info by its publicId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addOrUpdateMenuItemOptionSetItemNutritionInfoV2Test() throws Exception {
        Integer menuId = null;
        String publicId = null;
        ItemNutritionInfoV2AddUpdateModel addOrUpdateModel = null;
        String appId = null;
        Object response = api.addOrUpdateMenuItemOptionSetItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId);

        // TODO: test validations
    }
    
    /**
     * Get allergens
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllergensV2Test() throws Exception {
        String appId = null;
        String languageId = null;
        RestApiArrayResultAllergen response = api.getAllergensV2(appId, languageId);

        // TODO: test validations
    }
    
    /**
     * Get menu nutrition by menuId
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuNutritionInfoV2ByMenuIdTest() throws Exception {
        String appId = null;
        Integer menuId = null;
        String languageId = null;
        RestApiResultNutritionInfoV2 response = api.getMenuNutritionInfoV2ByMenuId(appId, menuId, languageId);

        // TODO: test validations
    }
    
}
