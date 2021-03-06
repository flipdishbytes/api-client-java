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
import java.io.File;
import com.flipdish.apiclient.model.MenuItemOptionSetBase;
import com.flipdish.apiclient.model.RestApiArrayResultMenuItemOptionSet;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultMenuItemOptionSet;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenuOptionSetsApi
 */
@Ignore
public class MenuOptionSetsApiTest {

    private final MenuOptionSetsApi api = new MenuOptionSetsApi();

    
    /**
     * Create menu item option set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMenuItemOptionSetTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        MenuItemOptionSetBase menuItemOptionSet = null;
        Object response = api.createMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, menuItemOptionSet);

        // TODO: test validations
    }
    
    /**
     * Delete menu item option set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMenuItemOptionSetTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionItemId = null;
        Integer menuSectionId = null;
        Integer optionSetId = null;
        api.deleteMenuItemOptionSet(menuId, menuSectionItemId, menuSectionId, optionSetId);

        // TODO: test validations
    }
    
    /**
     * Delete option set image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOptionSetImageTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        api.deleteOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId);

        // TODO: test validations
    }
    
    /**
     * Get menu item option set by identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemOptionSetByIdTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        RestApiResultMenuItemOptionSet response = api.getMenuItemOptionSetById(menuId, menuSectionId, menuSectionItemId, optionSetId);

        // TODO: test validations
    }
    
    /**
     * Get menu item option sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemOptionSetsTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        RestApiArrayResultMenuItemOptionSet response = api.getMenuItemOptionSets(menuId, menuSectionId, menuSectionItemId);

        // TODO: test validations
    }
    
    /**
     * Update menu item option set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMenuItemOptionSetTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        MenuItemOptionSetBase menuItemOptionSet = null;
        api.updateMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSet);

        // TODO: test validations
    }
    
    /**
     * Upload menu item option set image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadOptionSetImageTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        File image = null;
        RestApiStringResult response = api.uploadOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId, image);

        // TODO: test validations
    }
    
}
