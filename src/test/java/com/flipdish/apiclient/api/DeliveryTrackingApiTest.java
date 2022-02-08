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
import com.flipdish.apiclient.model.DriverInvitation;
import com.flipdish.apiclient.model.OrderIdAndSequenceNumber;
import com.flipdish.apiclient.model.RestApiArrayResultDriver;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultDriver;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeliveryTrackingApi
 */
@Ignore
public class DeliveryTrackingApiTest {

    private final DeliveryTrackingApi api = new DeliveryTrackingApi();

    
    /**
     * [PRIVATE] Assign driver to order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignDriverToOrderTest() throws ApiException {
        String appId = null;
        Integer orderId = null;
        Integer driverId = null;
        api.assignDriverToOrder(appId, orderId, driverId);

        // TODO: test validations
    }
    
    /**
     * Assign driver to multiple orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignDriverToOrdersTest() throws ApiException {
        String appId = null;
        Integer driverId = null;
        List<OrderIdAndSequenceNumber> orderIdAndSequenceNumbers = null;
        api.assignDriverToOrders(appId, driverId, orderIdAndSequenceNumbers);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE] Get drivers by App
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDriversTest() throws ApiException {
        String appId = null;
        String name = null;
        String phoneNumber = null;
        Integer storeId = null;
        String presence = null;
        RestApiArrayResultDriver response = api.getDrivers(appId, name, phoneNumber, storeId, presence);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE] Invite driver
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inviteDriverToAppTest() throws ApiException {
        String appId = null;
        DriverInvitation driverInvitation = null;
        RestApiResultDriver response = api.inviteDriverToApp(appId, driverInvitation);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE] Unassign driver from app
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDriverFromAppTest() throws ApiException {
        String appId = null;
        Integer driverId = null;
        api.removeDriverFromApp(appId, driverId);

        // TODO: test validations
    }
    
    /**
     * [PRIVATE] Unassign driver from order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unassignDriverFromOrderTest() throws ApiException {
        String appId = null;
        Integer orderId = null;
        api.unassignDriverFromOrder(appId, orderId);

        // TODO: test validations
    }
    
}