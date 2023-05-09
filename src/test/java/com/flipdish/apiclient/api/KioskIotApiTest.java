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
import com.flipdish.apiclient.model.RestApiResultKioskIotConnectionParameters;
import com.flipdish.apiclient.model.RestApiResultTelemetrySeriesResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.TelemetrySeriesQueryParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for KioskIotApi
 */
@Ignore
public class KioskIotApiTest {

    private final KioskIotApi api = new KioskIotApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKioskIotConnectionTest() throws ApiException {
        RestApiResultKioskIotConnectionParameters response = api.getKioskIotConnection();

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
    public void queryTelemetrySeriesTest() throws ApiException {
        String appId = null;
        TelemetrySeriesQueryParameters queryParams = null;
        RestApiResultTelemetrySeriesResult response = api.queryTelemetrySeries(appId, queryParams);

        // TODO: test validations
    }
    
}
