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

import com.flipdish.apiclient.model.ClientDeviceAssignEnrolledDevice;
import com.flipdish.apiclient.model.ClientDeviceEnroll;
import com.flipdish.apiclient.model.RestApiArrayResultClientDeviceSummary;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultClientDevice;
import com.flipdish.apiclient.model.RestApiResultClientDeviceEnrollmentResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceApi
 */
@Ignore
public class DeviceApiTest {

    private final DeviceApi api = new DeviceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assignDeviceTest() throws Exception {
        String appId = null;
        ClientDeviceAssignEnrolledDevice assignDeviceRequest = null;
        RestApiResultClientDeviceEnrollmentResult response = api.assignDevice(appId, assignDeviceRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void enrollDeviceTest() throws Exception {
        String appId = null;
        ClientDeviceEnroll deviceEnrollmentRequest = null;
        RestApiResultClientDeviceEnrollmentResult response = api.enrollDevice(appId, deviceEnrollmentRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDeviceDetailsTest() throws Exception {
        String appId = null;
        String deviceModel = null;
        String deviceId = null;
        RestApiResultClientDevice response = api.getDeviceDetails(appId, deviceModel, deviceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchDevicesTest() throws Exception {
        String appId = null;
        Integer storeId = null;
        String deviceModel = null;
        RestApiArrayResultClientDeviceSummary response = api.searchDevices(appId, storeId, deviceModel);

        // TODO: test validations
    }
    
}
