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

import com.flipdish.apiclient.ApiCallback;
import com.flipdish.apiclient.ApiClient;
import com.flipdish.apiclient.ApiException;
import com.flipdish.apiclient.ApiResponse;
import com.flipdish.apiclient.Configuration;
import com.flipdish.apiclient.Pair;
import com.flipdish.apiclient.ProgressRequestBody;
import com.flipdish.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.threeten.bp.OffsetDateTime;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultHttpRequestAndResponseLog;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequestResponseLogsApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public HttpRequestResponseLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HttpRequestResponseLogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for getLogs
     * @param start  (required)
     * @param end  (required)
     * @param appId  (required)
     * @param filterByUserId  (optional)
     * @param guid  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLogsCall(OffsetDateTime start, OffsetDateTime end, String appId, Integer filterByUserId, String guid, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/interactions/logs"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end", end));
        if (filterByUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterByUserId", filterByUserId));
        if (guid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("guid", guid));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLogsValidateBeforeCall(OffsetDateTime start, OffsetDateTime end, String appId, Integer filterByUserId, String guid, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'start' is set
        if (start == null) {
            throw new ApiException("Missing the required parameter 'start' when calling getLogs(Async)");
        }
        
        // verify the required parameter 'end' is set
        if (end == null) {
            throw new ApiException("Missing the required parameter 'end' when calling getLogs(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getLogs(Async)");
        }
        

        com.squareup.okhttp.Call call = getLogsCall(start, end, appId, filterByUserId, guid, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param start  (required)
     * @param end  (required)
     * @param appId  (required)
     * @param filterByUserId  (optional)
     * @param guid  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return RestApiPaginationResultHttpRequestAndResponseLog
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiPaginationResultHttpRequestAndResponseLog getLogs(OffsetDateTime start, OffsetDateTime end, String appId, Integer filterByUserId, String guid, Integer page, Integer limit) throws ApiException {
        ApiResponse<RestApiPaginationResultHttpRequestAndResponseLog> resp = getLogsWithHttpInfo(start, end, appId, filterByUserId, guid, page, limit);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param start  (required)
     * @param end  (required)
     * @param appId  (required)
     * @param filterByUserId  (optional)
     * @param guid  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;RestApiPaginationResultHttpRequestAndResponseLog&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiPaginationResultHttpRequestAndResponseLog> getLogsWithHttpInfo(OffsetDateTime start, OffsetDateTime end, String appId, Integer filterByUserId, String guid, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getLogsValidateBeforeCall(start, end, appId, filterByUserId, guid, page, limit, null, null);
        Type localVarReturnType = new TypeToken<RestApiPaginationResultHttpRequestAndResponseLog>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param start  (required)
     * @param end  (required)
     * @param appId  (required)
     * @param filterByUserId  (optional)
     * @param guid  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLogsAsync(OffsetDateTime start, OffsetDateTime end, String appId, Integer filterByUserId, String guid, Integer page, Integer limit, final ApiCallback<RestApiPaginationResultHttpRequestAndResponseLog> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLogsValidateBeforeCall(start, end, appId, filterByUserId, guid, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiPaginationResultHttpRequestAndResponseLog>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
