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
import com.flipdish.apiclient.model.EventSearchResult;
import org.threeten.bp.OffsetDateTime;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiEventSearchPaginationResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerEventsTest() throws ApiException {
        String appId = null;
        Integer customerId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getCustomerEvents(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getEventsTest() throws ApiException {
        String appId = null;
        Integer whiteLabelId = null;
        Integer customerId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getEvents(appId, whiteLabelId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getEventsByIdTest() throws ApiException {
        UUID eventId = null;
        String appId = null;
        EventSearchResult response = api.getEventsById(eventId, appId);

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
    public void getMenuEventsTest() throws ApiException {
        String appId = null;
        Integer menuId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId2 = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getMenuEvents(appId, menuId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId2, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getOrderEventsTest() throws ApiException {
        String appId = null;
        Integer orderId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId2 = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getOrderEvents(appId, orderId, limit, page, start, end, orderId2, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getOrderEventsByCustomerTest() throws ApiException {
        String appId = null;
        Integer customerId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getOrderEventsByCustomer(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getStoreEventsTest() throws ApiException {
        String appId = null;
        Integer storeId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId2 = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getStoreEvents(appId, storeId, limit, page, start, end, orderId, storeId2, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getUserEventsTest() throws ApiException {
        String appId = null;
        Integer userId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId2 = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getUserEvents(appId, userId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId2, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

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
    public void getWhiteLabelEventsTest() throws ApiException {
        String appId = null;
        Integer whitelabelId = null;
        Integer limit = null;
        Integer page = null;
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        Integer orderId = null;
        Integer storeId = null;
        List<Integer> storeIdList = null;
        Integer storeGroupId = null;
        Integer userId = null;
        Integer menuId = null;
        Integer campaignId = null;
        String userEmail = null;
        String userName = null;
        String voucherCode = null;
        List<String> eventType = null;
        String flipdishEventId = null;
        RestApiEventSearchPaginationResult response = api.getWhiteLabelEvents(appId, whitelabelId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);

        // TODO: test validations
    }
    
}
