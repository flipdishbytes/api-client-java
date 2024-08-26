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


import com.flipdish.apiclient.model.ChannelStoreMapping;
import com.flipdish.apiclient.model.RestApiArrayResultStoreChannelStoreMapping;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelsStoreMappingApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ChannelsStoreMappingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelsStoreMappingApi(ApiClient apiClient) {
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
     * Build call for channelsGetStoreChannelStoreMapping
     * @param appId  (required)
     * @param channelId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call channelsGetStoreChannelStoreMappingCall(String appId, Integer channelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/channels/storemappings"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("channelId", channelId));

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
    private com.squareup.okhttp.Call channelsGetStoreChannelStoreMappingValidateBeforeCall(String appId, Integer channelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling channelsGetStoreChannelStoreMapping(Async)");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling channelsGetStoreChannelStoreMapping(Async)");
        }
        

        com.squareup.okhttp.Call call = channelsGetStoreChannelStoreMappingCall(appId, channelId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @return RestApiArrayResultStoreChannelStoreMapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiArrayResultStoreChannelStoreMapping channelsGetStoreChannelStoreMapping(String appId, Integer channelId) throws ApiException {
        ApiResponse<RestApiArrayResultStoreChannelStoreMapping> resp = channelsGetStoreChannelStoreMappingWithHttpInfo(appId, channelId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @return ApiResponse&lt;RestApiArrayResultStoreChannelStoreMapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiArrayResultStoreChannelStoreMapping> channelsGetStoreChannelStoreMappingWithHttpInfo(String appId, Integer channelId) throws ApiException {
        com.squareup.okhttp.Call call = channelsGetStoreChannelStoreMappingValidateBeforeCall(appId, channelId, null, null);
        Type localVarReturnType = new TypeToken<RestApiArrayResultStoreChannelStoreMapping>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call channelsGetStoreChannelStoreMappingAsync(String appId, Integer channelId, final ApiCallback<RestApiArrayResultStoreChannelStoreMapping> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = channelsGetStoreChannelStoreMappingValidateBeforeCall(appId, channelId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiArrayResultStoreChannelStoreMapping>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for channelsSetStoreChannelStoreMapping
     * @param appId  (required)
     * @param channelId  (required)
     * @param stores  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call channelsSetStoreChannelStoreMappingCall(String appId, Integer channelId, List<ChannelStoreMapping> stores, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = stores;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/channels/storemappings"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (channelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("channelId", channelId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call channelsSetStoreChannelStoreMappingValidateBeforeCall(String appId, Integer channelId, List<ChannelStoreMapping> stores, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling channelsSetStoreChannelStoreMapping(Async)");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling channelsSetStoreChannelStoreMapping(Async)");
        }
        
        // verify the required parameter 'stores' is set
        if (stores == null) {
            throw new ApiException("Missing the required parameter 'stores' when calling channelsSetStoreChannelStoreMapping(Async)");
        }
        

        com.squareup.okhttp.Call call = channelsSetStoreChannelStoreMappingCall(appId, channelId, stores, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @param stores  (required)
     * @return RestApiArrayResultStoreChannelStoreMapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiArrayResultStoreChannelStoreMapping channelsSetStoreChannelStoreMapping(String appId, Integer channelId, List<ChannelStoreMapping> stores) throws ApiException {
        ApiResponse<RestApiArrayResultStoreChannelStoreMapping> resp = channelsSetStoreChannelStoreMappingWithHttpInfo(appId, channelId, stores);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @param stores  (required)
     * @return ApiResponse&lt;RestApiArrayResultStoreChannelStoreMapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiArrayResultStoreChannelStoreMapping> channelsSetStoreChannelStoreMappingWithHttpInfo(String appId, Integer channelId, List<ChannelStoreMapping> stores) throws ApiException {
        com.squareup.okhttp.Call call = channelsSetStoreChannelStoreMappingValidateBeforeCall(appId, channelId, stores, null, null);
        Type localVarReturnType = new TypeToken<RestApiArrayResultStoreChannelStoreMapping>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param channelId  (required)
     * @param stores  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call channelsSetStoreChannelStoreMappingAsync(String appId, Integer channelId, List<ChannelStoreMapping> stores, final ApiCallback<RestApiArrayResultStoreChannelStoreMapping> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = channelsSetStoreChannelStoreMappingValidateBeforeCall(appId, channelId, stores, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiArrayResultStoreChannelStoreMapping>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
