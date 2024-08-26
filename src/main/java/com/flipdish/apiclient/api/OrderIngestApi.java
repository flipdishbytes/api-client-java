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


import com.flipdish.apiclient.model.OrderIngestSubmitOrderRequest;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultOrderIngestSubmitOrderResponse;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderIngestApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public OrderIngestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderIngestApi(ApiClient apiClient) {
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
     * Build call for orderIngestSubmitNewOrder
     * @param order  (required)
     * @param appNameId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderIngestSubmitNewOrderCall(OrderIngestSubmitOrderRequest order, String appNameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = order;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appNameId}/order-ingest/submit"
            .replaceAll("\\{" + "appNameId" + "\\}", apiClient.escapeString(appNameId.toString()));

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
    private com.squareup.okhttp.Call orderIngestSubmitNewOrderValidateBeforeCall(OrderIngestSubmitOrderRequest order, String appNameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException("Missing the required parameter 'order' when calling orderIngestSubmitNewOrder(Async)");
        }
        
        // verify the required parameter 'appNameId' is set
        if (appNameId == null) {
            throw new ApiException("Missing the required parameter 'appNameId' when calling orderIngestSubmitNewOrder(Async)");
        }
        

        com.squareup.okhttp.Call call = orderIngestSubmitNewOrderCall(order, appNameId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param order  (required)
     * @param appNameId  (required)
     * @return RestApiResultOrderIngestSubmitOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiResultOrderIngestSubmitOrderResponse orderIngestSubmitNewOrder(OrderIngestSubmitOrderRequest order, String appNameId) throws ApiException {
        ApiResponse<RestApiResultOrderIngestSubmitOrderResponse> resp = orderIngestSubmitNewOrderWithHttpInfo(order, appNameId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param order  (required)
     * @param appNameId  (required)
     * @return ApiResponse&lt;RestApiResultOrderIngestSubmitOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiResultOrderIngestSubmitOrderResponse> orderIngestSubmitNewOrderWithHttpInfo(OrderIngestSubmitOrderRequest order, String appNameId) throws ApiException {
        com.squareup.okhttp.Call call = orderIngestSubmitNewOrderValidateBeforeCall(order, appNameId, null, null);
        Type localVarReturnType = new TypeToken<RestApiResultOrderIngestSubmitOrderResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param order  (required)
     * @param appNameId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderIngestSubmitNewOrderAsync(OrderIngestSubmitOrderRequest order, String appNameId, final ApiCallback<RestApiResultOrderIngestSubmitOrderResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderIngestSubmitNewOrderValidateBeforeCall(order, appNameId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiResultOrderIngestSubmitOrderResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
