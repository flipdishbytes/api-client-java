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


import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiPaginationResultOAuthTokenModel;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationTokensApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public AuthorizationTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthorizationTokensApi(ApiClient apiClient) {
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
     * Build call for getAuthorizationTokens
     * @param oauthAppId  (required)
     * @param appId  (required)
     * @param page  (optional)
     * @param limit  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationTokensCall(String oauthAppId, String appId, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/authorizationtokens/{oauthAppId}"
            .replaceAll("\\{" + "oauthAppId" + "\\}", apiClient.escapeString(oauthAppId.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getAuthorizationTokensValidateBeforeCall(String oauthAppId, String appId, Integer page, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'oauthAppId' is set
        if (oauthAppId == null) {
            throw new ApiException("Missing the required parameter 'oauthAppId' when calling getAuthorizationTokens(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAuthorizationTokens(Async)");
        }
        

        com.squareup.okhttp.Call call = getAuthorizationTokensCall(oauthAppId, appId, page, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param oauthAppId  (required)
     * @param appId  (required)
     * @param page  (optional)
     * @param limit  (optional)
     * @return RestApiPaginationResultOAuthTokenModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiPaginationResultOAuthTokenModel getAuthorizationTokens(String oauthAppId, String appId, Integer page, Integer limit) throws ApiException {
        ApiResponse<RestApiPaginationResultOAuthTokenModel> resp = getAuthorizationTokensWithHttpInfo(oauthAppId, appId, page, limit);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param oauthAppId  (required)
     * @param appId  (required)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;RestApiPaginationResultOAuthTokenModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiPaginationResultOAuthTokenModel> getAuthorizationTokensWithHttpInfo(String oauthAppId, String appId, Integer page, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getAuthorizationTokensValidateBeforeCall(oauthAppId, appId, page, limit, null, null);
        Type localVarReturnType = new TypeToken<RestApiPaginationResultOAuthTokenModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param oauthAppId  (required)
     * @param appId  (required)
     * @param page  (optional)
     * @param limit  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuthorizationTokensAsync(String oauthAppId, String appId, Integer page, Integer limit, final ApiCallback<RestApiPaginationResultOAuthTokenModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAuthorizationTokensValidateBeforeCall(oauthAppId, appId, page, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiPaginationResultOAuthTokenModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for revokeToken
     * @param key  (required)
     * @param appId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call revokeTokenCall(String key, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/authorizationtokens/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call revokeTokenValidateBeforeCall(String key, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling revokeToken(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling revokeToken(Async)");
        }
        

        com.squareup.okhttp.Call call = revokeTokenCall(key, appId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param key  (required)
     * @param appId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void revokeToken(String key, String appId) throws ApiException {
        revokeTokenWithHttpInfo(key, appId);
    }

    /**
     * 
     * 
     * @param key  (required)
     * @param appId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> revokeTokenWithHttpInfo(String key, String appId) throws ApiException {
        com.squareup.okhttp.Call call = revokeTokenValidateBeforeCall(key, appId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param key  (required)
     * @param appId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call revokeTokenAsync(String key, String appId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = revokeTokenValidateBeforeCall(key, appId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
