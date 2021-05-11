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
import com.flipdish.apiclient.model.MenuItemOptionSetItemBase;
import com.flipdish.apiclient.model.RestApiArrayResultMenuItemOptionSetItem;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultMenuItemOptionSetItem;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenuOptionSetItemsApi
 */
@Ignore
public class MenuOptionSetItemsApiTest {

    private final MenuOptionSetItemsApi api = new MenuOptionSetItemsApi();

    
    /**
     * Create menu item option set item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMenuItemOptionSetItemTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        MenuItemOptionSetItemBase menuItemOptionSetItem = null;
        Object response = api.addMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItem);

        // TODO: test validations
    }
    
    /**
     * Delete menu item option set item image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOptionSetItemImageTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        api.deleteOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);

        // TODO: test validations
    }
    
    /**
     * Get menu item option set item by identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemOptionSetItemByIdTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        RestApiResultMenuItemOptionSetItem response = api.getMenuItemOptionSetItemById(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);

        // TODO: test validations
    }
    
    /**
     * Get menu item option set items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemOptionSetItemsTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        RestApiArrayResultMenuItemOptionSetItem response = api.getMenuItemOptionSetItems(menuId, menuSectionId, menuSectionItemId, optionSetId);

        // TODO: test validations
    }
    
    /**
     * Delete menu item option set item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeMenuItemOptionSetItemTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        api.removeMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);

        // TODO: test validations
    }
    
    /**
     * [Private API] Set Tax Rate on OptionSetItem
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setOptionSetItemTaxTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        Integer taxRateId = null;
        api.setOptionSetItemTax(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, taxRateId);

        // TODO: test validations
    }
    
    /**
     * Update menu item option set item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMenuItemOptionSetItemTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        MenuItemOptionSetItemBase menuItemOptionSetItem = null;
        Double undoAfter = null;
        api.updateMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, menuItemOptionSetItem, undoAfter);

        // TODO: test validations
    }
    
    /**
     * Upload menu item option set item image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadOptionSetItemImageTest() throws ApiException {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer optionSetId = null;
        Integer menuItemOptionSetItemId = null;
        File image = null;
        RestApiStringResult response = api.uploadOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, image);

        // TODO: test validations
    }
    
}
