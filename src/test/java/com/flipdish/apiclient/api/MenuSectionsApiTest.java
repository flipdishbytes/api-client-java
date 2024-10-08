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

import com.flipdish.apiclient.model.BusinessHoursPeriodBase;
import java.io.File;
import com.flipdish.apiclient.model.MenuObjectDisplayOrders;
import com.flipdish.apiclient.model.MenuSectionAvailabilityBase;
import com.flipdish.apiclient.model.MenuSectionBase;
import com.flipdish.apiclient.model.RestApiArrayResultMenuSection;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultBusinessHoursPeriod;
import com.flipdish.apiclient.model.RestApiResultMenuSection;
import com.flipdish.apiclient.model.RestApiResultMenuSectionAvailability;
import com.flipdish.apiclient.model.RestApiStringResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MenuSectionsApi
 */
@Ignore
public class MenuSectionsApiTest {

    private final MenuSectionsApi api = new MenuSectionsApi();

    
    /**
     * Clone menu section
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cloneMenuSectionTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        RestApiResultMenuSection response = api.cloneMenuSection(menuId, menuSectionId);

        // TODO: test validations
    }
    
    /**
     * Set/update menu section availability hours.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMenuAvailabilityForDayTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        String dayOfWeek = null;
        BusinessHoursPeriodBase businessHoursPeriod = null;
        Object response = api.createMenuAvailabilityForDay(menuId, menuSectionId, dayOfWeek, businessHoursPeriod);

        // TODO: test validations
    }
    
    /**
     * Create menu section
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMenuSectionTest() throws Exception {
        Integer menuId = null;
        MenuSectionBase menuSection = null;
        Object response = api.createMenuSection(menuId, menuSection);

        // TODO: test validations
    }
    
    /**
     * Create menu availability type
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMenuSectionAvailabilityTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        MenuSectionAvailabilityBase menuSectionAvailability = null;
        Object response = api.createMenuSectionAvailability(menuId, menuSectionId, menuSectionAvailability);

        // TODO: test validations
    }
    
    /**
     * Delete menu section
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuSectionTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        api.deleteMenuSection(menuId, menuSectionId);

        // TODO: test validations
    }
    
    /**
     * Delete menu section image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuSectionImageTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        api.deleteMenuSectionImage(menuId, menuSectionId);

        // TODO: test validations
    }
    
    /**
     * Get menu section by identifier
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuSectionByIdTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        RestApiResultMenuSection response = api.getMenuSectionById(menuId, menuSectionId);

        // TODO: test validations
    }
    
    /**
     * Get menu sections
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuSectionsTest() throws Exception {
        Integer menuId = null;
        RestApiArrayResultMenuSection response = api.getMenuSections(menuId);

        // TODO: test validations
    }
    
    /**
     * Re-arrange Items within a Section
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void menuSectionsSetItemDisplayOrdersTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        MenuObjectDisplayOrders displayOrders = null;
        api.menuSectionsSetItemDisplayOrders(menuId, menuSectionId, displayOrders);

        // TODO: test validations
    }
    
    /**
     * Update menu section
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMenuSectionTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        MenuSectionBase menuSection = null;
        Double undoAfter = null;
        api.updateMenuSection(menuId, menuSectionId, menuSection, undoAfter);

        // TODO: test validations
    }
    
    /**
     * Upload menu section image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadMenuSectionImageTest() throws Exception {
        Integer menuId = null;
        Integer menuSectionId = null;
        File image = null;
        RestApiStringResult response = api.uploadMenuSectionImage(menuId, menuSectionId, image);

        // TODO: test validations
    }
    
}
