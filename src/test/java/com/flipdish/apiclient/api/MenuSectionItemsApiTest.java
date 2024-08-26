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

import com.flipdish.apiclient.model.CreateMenuSectionItemFromCatalogItems;
import java.io.File;
import com.flipdish.apiclient.model.MenuSectionItemBase;
import com.flipdish.apiclient.model.RestApiArrayResultMenuSectionItem;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultCreatedMenuSectionItems;
import com.flipdish.apiclient.model.RestApiResultMenuSectionItem;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenuSectionItemsApi
 */
@Ignore
public class MenuSectionItemsApiTest {

    private final MenuSectionItemsApi api = new MenuSectionItemsApi();

    
    /**
     * Clone menu section item
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cloneMenuSectionItemTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        RestApiResultMenuSectionItem response = api.cloneMenuSectionItem(menuId, menuSectionId, menuSectionItemId);

        // TODO: test validations
    }
    
    /**
     * Create menu section item
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMenuSectionItemTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        MenuSectionItemBase menuSectionItem = null;
        Object response = api.createMenuSectionItem(menuId, menuSectionId, menuSectionItem);

        // TODO: test validations
    }
    
    /**
     * Create menu section items from a list of Catalog Items
     *
     * BETA - this endpoint is under development, do not use it in your production system
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMenuSectionItemFromCatalogItemsTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        CreateMenuSectionItemFromCatalogItems createFromCatalogItems = null;
        Object response = api.createMenuSectionItemFromCatalogItems(menuId, menuSectionId, createFromCatalogItems);

        // TODO: test validations
    }
    
    /**
     * Delete menu section item
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuSectionItemTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        api.deleteMenuSectionItem(menuId, menuSectionId, menuSectionItemId);

        // TODO: test validations
    }
    
    /**
     * Delete menu section item image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuSectionItemImageTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        api.deleteMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId);

        // TODO: test validations
    }
    
    /**
     * Get menu item by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuItemByIdTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        RestApiResultMenuSectionItem response = api.getMenuItemById(menuId, menuSectionId, menuSectionItemId);

        // TODO: test validations
    }
    
    /**
     * Get menu items
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuItemsTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        RestApiArrayResultMenuSectionItem response = api.getMenuItems(menuId, menuSectionId);

        // TODO: test validations
    }
    
    /**
     * Move an Item within a menu
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void moveMenuItemTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer destinationDisplayOrder = null;
        api.moveMenuItem(menuId, menuSectionId, menuSectionItemId, destinationDisplayOrder);

        // TODO: test validations
    }
    
    /**
     * Set tax rate for menu item
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setSectionItemTaxTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        Integer taxRateId = null;
        api.setSectionItemTax(menuId, menuSectionId, menuSectionItemId, taxRateId);

        // TODO: test validations
    }
    
    /**
     * Update menu section item
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMenuSectionItemTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        MenuSectionItemBase menuSectionItem = null;
        Double undoAfter = null;
        api.updateMenuSectionItem(menuId, menuSectionId, menuSectionItemId, menuSectionItem, undoAfter);

        // TODO: test validations
    }
    
    /**
     * Upload menu section item image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadMenuSectionItemImageTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        Integer menuSectionItemId = null;
        File image = null;
        RestApiStringResult response = api.uploadMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId, image);

        // TODO: test validations
    }
    
}
