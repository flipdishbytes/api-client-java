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


import com.flipdish.apiclient.model.RestApiArrayResultSubscriptionSummary;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultHasPaymentMethodResponse;
import com.flipdish.apiclient.model.RestApiResultSubscription;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionsApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public SubscriptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubscriptionsApi(ApiClient apiClient) {
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
     * Build call for getSubscriptionById
     * @param appId  (required)
     * @param subscriptionId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionByIdCall(String appId, String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/subscriptions/{subscriptionId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSubscriptionByIdValidateBeforeCall(String appId, String subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getSubscriptionById(Async)");
        }
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling getSubscriptionById(Async)");
        }
        

        com.squareup.okhttp.Call call = getSubscriptionByIdCall(appId, subscriptionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param subscriptionId  (required)
     * @return RestApiResultSubscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiResultSubscription getSubscriptionById(String appId, String subscriptionId) throws ApiException {
        ApiResponse<RestApiResultSubscription> resp = getSubscriptionByIdWithHttpInfo(appId, subscriptionId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param subscriptionId  (required)
     * @return ApiResponse&lt;RestApiResultSubscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiResultSubscription> getSubscriptionByIdWithHttpInfo(String appId, String subscriptionId) throws ApiException {
        com.squareup.okhttp.Call call = getSubscriptionByIdValidateBeforeCall(appId, subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<RestApiResultSubscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param subscriptionId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionByIdAsync(String appId, String subscriptionId, final ApiCallback<RestApiResultSubscription> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSubscriptionByIdValidateBeforeCall(appId, subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiResultSubscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSubscriptionsForApp
     * @param appId  (required)
     * @param excludeNotOwnedSubscriptions  (optional)
     * @param storeId  (optional)
     * @param excludeCancelledSubscriptions  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionsForAppCall(String appId, Boolean excludeNotOwnedSubscriptions, List<Integer> storeId, Boolean excludeCancelledSubscriptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/subscriptions"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (excludeNotOwnedSubscriptions != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("excludeNotOwnedSubscriptions", excludeNotOwnedSubscriptions));
        if (storeId != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "storeId", storeId));
        if (excludeCancelledSubscriptions != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("excludeCancelledSubscriptions", excludeCancelledSubscriptions));

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
    private com.squareup.okhttp.Call getSubscriptionsForAppValidateBeforeCall(String appId, Boolean excludeNotOwnedSubscriptions, List<Integer> storeId, Boolean excludeCancelledSubscriptions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getSubscriptionsForApp(Async)");
        }
        

        com.squareup.okhttp.Call call = getSubscriptionsForAppCall(appId, excludeNotOwnedSubscriptions, storeId, excludeCancelledSubscriptions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param excludeNotOwnedSubscriptions  (optional)
     * @param storeId  (optional)
     * @param excludeCancelledSubscriptions  (optional)
     * @return RestApiArrayResultSubscriptionSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiArrayResultSubscriptionSummary getSubscriptionsForApp(String appId, Boolean excludeNotOwnedSubscriptions, List<Integer> storeId, Boolean excludeCancelledSubscriptions) throws ApiException {
        ApiResponse<RestApiArrayResultSubscriptionSummary> resp = getSubscriptionsForAppWithHttpInfo(appId, excludeNotOwnedSubscriptions, storeId, excludeCancelledSubscriptions);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param excludeNotOwnedSubscriptions  (optional)
     * @param storeId  (optional)
     * @param excludeCancelledSubscriptions  (optional)
     * @return ApiResponse&lt;RestApiArrayResultSubscriptionSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiArrayResultSubscriptionSummary> getSubscriptionsForAppWithHttpInfo(String appId, Boolean excludeNotOwnedSubscriptions, List<Integer> storeId, Boolean excludeCancelledSubscriptions) throws ApiException {
        com.squareup.okhttp.Call call = getSubscriptionsForAppValidateBeforeCall(appId, excludeNotOwnedSubscriptions, storeId, excludeCancelledSubscriptions, null, null);
        Type localVarReturnType = new TypeToken<RestApiArrayResultSubscriptionSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param excludeNotOwnedSubscriptions  (optional)
     * @param storeId  (optional)
     * @param excludeCancelledSubscriptions  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSubscriptionsForAppAsync(String appId, Boolean excludeNotOwnedSubscriptions, List<Integer> storeId, Boolean excludeCancelledSubscriptions, final ApiCallback<RestApiArrayResultSubscriptionSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSubscriptionsForAppValidateBeforeCall(appId, excludeNotOwnedSubscriptions, storeId, excludeCancelledSubscriptions, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiArrayResultSubscriptionSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for hasCustomerGotPaymentMethodOnFile
     * @param appId  (required)
     * @param email  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call hasCustomerGotPaymentMethodOnFileCall(String appId, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/subscriptions/hasPaymentMethod"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("email", email));

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
    private com.squareup.okhttp.Call hasCustomerGotPaymentMethodOnFileValidateBeforeCall(String appId, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling hasCustomerGotPaymentMethodOnFile(Async)");
        }
        

        com.squareup.okhttp.Call call = hasCustomerGotPaymentMethodOnFileCall(appId, email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param email  (optional)
     * @return RestApiResultHasPaymentMethodResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiResultHasPaymentMethodResponse hasCustomerGotPaymentMethodOnFile(String appId, String email) throws ApiException {
        ApiResponse<RestApiResultHasPaymentMethodResponse> resp = hasCustomerGotPaymentMethodOnFileWithHttpInfo(appId, email);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param email  (optional)
     * @return ApiResponse&lt;RestApiResultHasPaymentMethodResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiResultHasPaymentMethodResponse> hasCustomerGotPaymentMethodOnFileWithHttpInfo(String appId, String email) throws ApiException {
        com.squareup.okhttp.Call call = hasCustomerGotPaymentMethodOnFileValidateBeforeCall(appId, email, null, null);
        Type localVarReturnType = new TypeToken<RestApiResultHasPaymentMethodResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param email  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call hasCustomerGotPaymentMethodOnFileAsync(String appId, String email, final ApiCallback<RestApiResultHasPaymentMethodResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = hasCustomerGotPaymentMethodOnFileValidateBeforeCall(appId, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiResultHasPaymentMethodResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
