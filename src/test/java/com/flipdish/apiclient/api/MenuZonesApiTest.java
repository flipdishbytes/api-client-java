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

import com.flipdish.apiclient.model.HttpPostedFileBase;
import com.flipdish.apiclient.model.MenuZone;
import com.flipdish.apiclient.model.RestApiArrayResultMenuZone;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultMenuZone;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenuZonesApi
 */
@Ignore
public class MenuZonesApiTest {

    private final MenuZonesApi api = new MenuZonesApi();

    
    /**
     * Adds a new menu zone to a menu.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addMenuZoneTest() throws Exception {
        Integer menuId = null;
        MenuZone menuZone = null;
        RestApiResultMenuZone response = api.addMenuZone(menuId, menuZone);

        // TODO: test validations
    }
    
    /**
     * Deletes a menu zone.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuZoneTest() throws Exception {
        Integer menuZoneId = null;
        String menuId = null;
        api.deleteMenuZone(menuZoneId, menuId);

        // TODO: test validations
    }
    
    /**
     * Deletes a menu zone image.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuZoneImageTest() throws Exception {
        Integer menuZoneId = null;
        String menuId = null;
        api.deleteMenuZoneImage(menuZoneId, menuId);

        // TODO: test validations
    }
    
    /**
     * Flips the order of two menu zones.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void flipMenuZonesTest() throws Exception {
        Integer menuZoneId = null;
        Integer menuZoneI2 = null;
        String menuId = null;
        api.flipMenuZones(menuZoneId, menuZoneI2, menuId);

        // TODO: test validations
    }
    
    /**
     * Gets a specific menu zone for a given zone id
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuZoneTest() throws Exception {
        Integer menuId = null;
        Integer menuZoneId = null;
        RestApiResultMenuZone response = api.getMenuZone(menuId, menuZoneId);

        // TODO: test validations
    }
    
    /**
     * Gets all the menu zones for a menu
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuZonesForMenuIdTest() throws Exception {
        Integer menuId = null;
        RestApiArrayResultMenuZone response = api.getMenuZonesForMenuId(menuId);

        // TODO: test validations
    }
    
    /**
     * Sets a zone to a menu section.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setMenuSectionMenuZoneTest() throws Exception {
        Integer menuZoneId = null;
        Integer menuSectionId = null;
        String menuId = null;
        api.setMenuSectionMenuZone(menuZoneId, menuSectionId, menuId);

        // TODO: test validations
    }
    
    /**
     * Sets the description of a menu zone.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setMenuZoneDescriptionTest() throws Exception {
        Integer menuZoneId = null;
        String description = null;
        String menuId = null;
        api.setMenuZoneDescription(menuZoneId, description, menuId);

        // TODO: test validations
    }
    
    /**
     * Sets the name of a menu zone.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setMenuZoneNameTest() throws Exception {
        Integer menuZoneId = null;
        String menuZoneName = null;
        String menuId = null;
        api.setMenuZoneName(menuZoneId, menuZoneName, menuId);

        // TODO: test validations
    }
    
    /**
     * Updates a menu zone.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMenuZoneTest() throws Exception {
        Integer menuId = null;
        Integer menuZoneId = null;
        MenuZone menuZone = null;
        api.updateMenuZone(menuId, menuZoneId, menuZone);

        // TODO: test validations
    }
    
    /**
     * Uploads an image for a menu zone.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadMenuZoneImageTest() throws Exception {
        Integer menuZoneId = null;
        List<HttpPostedFileBase> file = null;
        String menuId = null;
        api.uploadMenuZoneImage(menuZoneId, file, menuId);

        // TODO: test validations
    }
    
}
