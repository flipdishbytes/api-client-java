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
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultBluetoothTerminalStatus;
import com.flipdish.apiclient.model.RestApiResultStripeTerminalPrivateKey;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardReadersApi
 */
@Ignore
public class CardReadersApiTest {

    private final CardReadersApi api = new CardReadersApi();

    
    /**
     * Get Authorization Key for Stripe Terminal
     *
     * Can only be called by Kiosk  [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeStripeTerminalTest() throws ApiException {
        RestApiResultStripeTerminalPrivateKey response = api.authorizeStripeTerminal();

        // TODO: test validations
    }
    
    /**
     * Get Authorization Key for Stripe Terminal
     *
     * Can only be called by Kiosk  [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeStripeTerminal_0Test() throws ApiException {
        String appId = null;
        RestApiResultStripeTerminalPrivateKey response = api.authorizeStripeTerminal_0(appId);

        // TODO: test validations
    }
    
    /**
     * Get the status of the bluetooth terminal
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBluetoothTerminalStatusTest() throws ApiException {
        String appId = null;
        String deviceId = null;
        RestApiResultBluetoothTerminalStatus response = api.getBluetoothTerminalStatus(appId, deviceId);

        // TODO: test validations
    }
    
    /**
     * Trigger check for Bluetooth device update on Kiosk
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateBluetoothTerminalDeviceUpdateCheckTest() throws ApiException {
        String appId = null;
        String deviceId = null;
        String terminalType = null;
        api.initiateBluetoothTerminalDeviceUpdateCheck(appId, deviceId, terminalType);

        // TODO: test validations
    }
    
    /**
     * Initiate stripe terminal pairing mode
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initiateKioskBluetoothPairingModeTest() throws ApiException {
        String appId = null;
        String deviceId = null;
        String terminalType = null;
        api.initiateKioskBluetoothPairingMode(appId, deviceId, terminalType);

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
    public void initiateKioskUpdateInstallForBluetoothTerminalTest() throws ApiException {
        String appId = null;
        String deviceId = null;
        String terminalType = null;
        api.initiateKioskUpdateInstallForBluetoothTerminal(appId, deviceId, terminalType);

        // TODO: test validations
    }
    
    /**
     * Unpair the currently paired stripe terminal
     *
     * [BETA - this endpoint is under development, do not use it in your production system]
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unpairCurrentlyPairedBluetoothDeviceTest() throws ApiException {
        String appId = null;
        String deviceId = null;
        api.unpairCurrentlyPairedBluetoothDevice(appId, deviceId);

        // TODO: test validations
    }
    
}
