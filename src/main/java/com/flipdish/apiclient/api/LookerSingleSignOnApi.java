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


import com.flipdish.apiclient.model.DashboardEmbed;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LookerSingleSignOnApi {
    private ApiClient apiClient;

    public LookerSingleSignOnApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LookerSingleSignOnApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSSOEndpoint
     * @param appId  (required)
     * @param embedPath  (required)
     * @param filters  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSSOEndpointCall(String appId, String embedPath, String filters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/looker/sso"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (embedPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("embedPath", embedPath));
        if (filters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filters", filters));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSSOEndpointValidateBeforeCall(String appId, String embedPath, String filters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getSSOEndpoint(Async)");
        }
        
        // verify the required parameter 'embedPath' is set
        if (embedPath == null) {
            throw new ApiException("Missing the required parameter 'embedPath' when calling getSSOEndpoint(Async)");
        }
        

        com.squareup.okhttp.Call call = getSSOEndpointCall(appId, embedPath, filters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param embedPath  (required)
     * @param filters  (optional)
     * @return DashboardEmbed
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DashboardEmbed getSSOEndpoint(String appId, String embedPath, String filters) throws ApiException {
        ApiResponse<DashboardEmbed> resp = getSSOEndpointWithHttpInfo(appId, embedPath, filters);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param embedPath  (required)
     * @param filters  (optional)
     * @return ApiResponse&lt;DashboardEmbed&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DashboardEmbed> getSSOEndpointWithHttpInfo(String appId, String embedPath, String filters) throws ApiException {
        com.squareup.okhttp.Call call = getSSOEndpointValidateBeforeCall(appId, embedPath, filters, null, null);
        Type localVarReturnType = new TypeToken<DashboardEmbed>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param embedPath  (required)
     * @param filters  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSSOEndpointAsync(String appId, String embedPath, String filters, final ApiCallback<DashboardEmbed> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSSOEndpointValidateBeforeCall(appId, embedPath, filters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DashboardEmbed>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
