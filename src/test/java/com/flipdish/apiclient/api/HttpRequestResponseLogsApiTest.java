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
import org.threeten.bp.OffsetDateTime;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultHttpRequestAndResponseLog;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HttpRequestResponseLogsApi
 */
@Ignore
public class HttpRequestResponseLogsApiTest {

    private final HttpRequestResponseLogsApi api = new HttpRequestResponseLogsApi();

    
    /**
     * Get API interaction logs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsTest() throws ApiException {
        OffsetDateTime start = null;
        OffsetDateTime end = null;
        String appId = null;
        Integer filterByUserId = null;
        String guid = null;
        Integer page = null;
        Integer limit = null;
        RestApiPaginationResultHttpRequestAndResponseLog response = api.getLogs(start, end, appId, filterByUserId, guid, page, limit);

        // TODO: test validations
    }
    
}
