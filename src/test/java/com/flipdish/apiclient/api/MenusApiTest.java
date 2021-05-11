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
import com.flipdish.apiclient.model.CreateFullMenu;
import java.io.File;
import com.flipdish.apiclient.model.MenuBase;
import com.flipdish.apiclient.model.MenuElementHide;
import com.flipdish.apiclient.model.MenuObjectDisplayOrders;
import com.flipdish.apiclient.model.MenuTaxRate;
import com.flipdish.apiclient.model.Metadata;
import com.flipdish.apiclient.model.RestApiArrayResultAllMetadataResult;
import com.flipdish.apiclient.model.RestApiArrayResultMenuCheckpoint;
import com.flipdish.apiclient.model.RestApiArrayResultMenuElementEditResponse;
import com.flipdish.apiclient.model.RestApiArrayResultMenuStoreNames;
import com.flipdish.apiclient.model.RestApiArrayResultMenuSummary;
import com.flipdish.apiclient.model.RestApiArrayResultMenuTaxDetails;
import com.flipdish.apiclient.model.RestApiArrayResultMetadata;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultMenu;
import com.flipdish.apiclient.model.RestApiResultMetadata;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenusApi
 */
@Ignore
public class MenusApiTest {

    private final MenusApi api = new MenusApi();

    
    /**
     * [PRIVATE API]Clone a menu, (without attaching stores)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDraftMenuFromExistingMenuTest() throws ApiException {
        Integer menuId = null;
        String newName = null;
        RestApiResultMenu response = api.createDraftMenuFromExistingMenu(menuId, newName);

        // TODO: test validations
    }
    
    /**
     * Create a new menu. If request body is empty, the system will create a menu with default items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewMenuForAppTest() throws ApiException {
        String appId = null;
        CreateFullMenu menu = null;
        Integer response = api.createNewMenuForApp(appId, menu);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Mark a Menu as Deleted
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMenuTest() throws ApiException {
        Integer menuId = null;
        api.deleteMenu(menuId);

        // TODO: test validations
    }
    
    /**
     * Delete menu image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMenuImageTest() throws ApiException {
        Integer menuId = null;
        api.deleteMenuImage(menuId);

        // TODO: test validations
    }
    
    /**
     * Delete menu item metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMenuItemMetadataTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer menuItemId = null;
        String key = null;
        api.deleteMenuItemMetadata(menuId, storeId, menuItemId, key);

        // TODO: test validations
    }
    
    /**
     * Get all menu metadata by menu ID and store ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMenuMetadataByMenuIdAndStoreIdTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        RestApiArrayResultAllMetadataResult response = api.getAllMenuMetadataByMenuIdAndStoreId(menuId, storeId);

        // TODO: test validations
    }
    
    /**
     * Get menu by identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuByIdTest() throws ApiException {
        Integer menuId = null;
        RestApiResultMenu response = api.getMenuById(menuId);

        // TODO: test validations
    }
    
    /**
     * Get menu item metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemMetadataTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer menuItemId = null;
        RestApiArrayResultMetadata response = api.getMenuItemMetadata(menuId, storeId, menuItemId);

        // TODO: test validations
    }
    
    /**
     * Get menu item metadata by key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemMetadataByKeyTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer menuItemId = null;
        String key = null;
        api.getMenuItemMetadataByKey(menuId, storeId, menuItemId, key);

        // TODO: test validations
    }
    
    /**
     * Get menu item option set item metadata by key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuItemOptionSetItemMetadataTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer optionSetItemId = null;
        RestApiResultMetadata response = api.getMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Get menus store names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuStoreNamesTest() throws ApiException {
        Integer menuId = null;
        RestApiArrayResultMenuStoreNames response = api.getMenuStoreNames(menuId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Get menus tax details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenuTaxDetailsTest() throws ApiException {
        Integer menuId = null;
        RestApiArrayResultMenuTaxDetails response = api.getMenuTaxDetails(menuId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Get menus by appId
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenusByAppIdTest() throws ApiException {
        String appId = null;
        RestApiArrayResultMenuSummary response = api.getMenusByAppId(appId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Get a Menus Checkpoints
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMenusCheckpointsTest() throws ApiException {
        Integer menuId = null;
        RestApiArrayResultMenuCheckpoint response = api.getMenusCheckpoints(menuId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Remove a Menus Tax Rate, can only remove a tax rate that does not have items/optionSetItems attached
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void menusDeleteTaxRateTest() throws ApiException {
        Integer menuId = null;
        Integer taxId = null;
        api.menusDeleteTaxRate(menuId, taxId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Set if tax shows for a Menu
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void menusSetDisplayOnMenuTaxTest() throws ApiException {
        Integer menuId = null;
        Boolean show = null;
        api.menusSetDisplayOnMenuTax(menuId, show);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Re-arrange Sections within a Menu
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void menusSetItemDisplayOrdersTest() throws ApiException {
        Integer menuId = null;
        MenuObjectDisplayOrders displayOrders = null;
        api.menusSetItemDisplayOrders(menuId, displayOrders);

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
    public void menusShowHideBulkItemsTest() throws ApiException {
        Integer menuId = null;
        List<MenuElementHide> menuElements = null;
        Boolean hide = null;
        Double undoAfter = null;
        RestApiArrayResultMenuElementEditResponse response = api.menusShowHideBulkItems(menuId, menuElements, hide, undoAfter);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Set the type of Tax on a Menu
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void menusUpdateTaxTypeTest() throws ApiException {
        Integer menuId = null;
        String type = null;
        api.menusUpdateTaxType(menuId, type);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Add/Update a Tax Rate
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void menusUpsertTaxRateTest() throws ApiException {
        Integer menuId = null;
        MenuTaxRate taxRate = null;
        MenuTaxRate response = api.menusUpsertTaxRate(menuId, taxRate);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Restore a Menu to a checkpoint
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreAMenuCheckpointTest() throws ApiException {
        Integer menuId = null;
        Integer checkpointId = null;
        api.restoreAMenuCheckpoint(menuId, checkpointId);

        // TODO: test validations
    }
    
    /**
     * Update menu item metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMenuItemMetadataTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer menuItemId = null;
        Metadata metadata = null;
        api.setMenuItemMetadata(menuId, storeId, menuItemId, metadata);

        // TODO: test validations
    }
    
    /**
     * Update menu item option set item metadata
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMenuItemOptionSetItemMetadataTest() throws ApiException {
        Integer menuId = null;
        Integer storeId = null;
        Integer optionSetItemId = null;
        Metadata metadata = null;
        api.setMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId, metadata);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Lock/Unlock a Menu for Editing
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMenuLockTest() throws ApiException {
        Integer menuId = null;
        Boolean locked = null;
        api.setMenuLock(menuId, locked);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE API]Set Menus Name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMenuNameTest() throws ApiException {
        Integer menuId = null;
        String name = null;
        api.setMenuName(menuId, name);

        // TODO: test validations
    }
    
    /**
     * Update menu
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMenuTest() throws ApiException {
        Integer menuId = null;
        MenuBase menu = null;
        api.updateMenu(menuId, menu);

        // TODO: test validations
    }
    
    /**
     * Upload menu image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadMenuImageTest() throws ApiException {
        Integer menuId = null;
        File image = null;
        RestApiStringResult response = api.uploadMenuImage(menuId, image);

        // TODO: test validations
    }
    
    /**
     * Create a new menu from xlsx file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadNewMenuForAppTest() throws ApiException {
        String appId = null;
        File menu = null;
        Integer response = api.uploadNewMenuForApp(appId, menu);

        // TODO: test validations
    }
    
}
