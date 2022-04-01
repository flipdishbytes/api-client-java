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
import com.flipdish.apiclient.model.DashboardEmbed;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LookerSingleSignOnApi
 */
@Ignore
public class LookerSingleSignOnApiTest {

    private final LookerSingleSignOnApi api = new LookerSingleSignOnApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLookerCustomerReportingEmbedUrlTest() throws ApiException {
        String appId = null;
        String embedPath = null;
        DashboardEmbed response = api.getLookerCustomerReportingEmbedUrl(appId, embedPath);

        // TODO: test validations
    }
    
    /**
     * Get the single sign on embed URL for PerformanceSummary Dashboard
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLookerPerformanceSummaryEmbedUrlTest() throws ApiException {
        String appId = null;
        String embedPath = null;
        DashboardEmbed response = api.getLookerPerformanceSummaryEmbedUrl(appId, embedPath);

        // TODO: test validations
    }
    
}
