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
import com.flipdish.apiclient.model.RestApiFinanceSearchPaginationResultInvoice;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoicesApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public InvoicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoicesApi(ApiClient apiClient) {
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
     * Build call for getInvoices
     * @param appId  (required)
     * @param subscriptionId  (optional)
     * @param limit  (optional)
     * @param pageId  (optional)
     * @param excludeNotOwnedInvoices  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param invoiceNumber  (optional)
     * @param storeId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInvoicesCall(String appId, String subscriptionId, Integer limit, String pageId, Boolean excludeNotOwnedInvoices, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNumber, List<Integer> storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/invoices"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (subscriptionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subscriptionId", subscriptionId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (pageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageId", pageId));
        if (excludeNotOwnedInvoices != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("excludeNotOwnedInvoices", excludeNotOwnedInvoices));
        if (dateFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateFrom", dateFrom));
        if (dateTo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dateTo", dateTo));
        if (invoiceNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("invoiceNumber", invoiceNumber));
        if (storeId != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "storeId", storeId));

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
    private com.squareup.okhttp.Call getInvoicesValidateBeforeCall(String appId, String subscriptionId, Integer limit, String pageId, Boolean excludeNotOwnedInvoices, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNumber, List<Integer> storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getInvoices(Async)");
        }
        

        com.squareup.okhttp.Call call = getInvoicesCall(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param subscriptionId  (optional)
     * @param limit  (optional)
     * @param pageId  (optional)
     * @param excludeNotOwnedInvoices  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param invoiceNumber  (optional)
     * @param storeId  (optional)
     * @return RestApiFinanceSearchPaginationResultInvoice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiFinanceSearchPaginationResultInvoice getInvoices(String appId, String subscriptionId, Integer limit, String pageId, Boolean excludeNotOwnedInvoices, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNumber, List<Integer> storeId) throws ApiException {
        ApiResponse<RestApiFinanceSearchPaginationResultInvoice> resp = getInvoicesWithHttpInfo(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param appId  (required)
     * @param subscriptionId  (optional)
     * @param limit  (optional)
     * @param pageId  (optional)
     * @param excludeNotOwnedInvoices  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param invoiceNumber  (optional)
     * @param storeId  (optional)
     * @return ApiResponse&lt;RestApiFinanceSearchPaginationResultInvoice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiFinanceSearchPaginationResultInvoice> getInvoicesWithHttpInfo(String appId, String subscriptionId, Integer limit, String pageId, Boolean excludeNotOwnedInvoices, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNumber, List<Integer> storeId) throws ApiException {
        com.squareup.okhttp.Call call = getInvoicesValidateBeforeCall(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId, null, null);
        Type localVarReturnType = new TypeToken<RestApiFinanceSearchPaginationResultInvoice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (required)
     * @param subscriptionId  (optional)
     * @param limit  (optional)
     * @param pageId  (optional)
     * @param excludeNotOwnedInvoices  (optional)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param invoiceNumber  (optional)
     * @param storeId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInvoicesAsync(String appId, String subscriptionId, Integer limit, String pageId, Boolean excludeNotOwnedInvoices, OffsetDateTime dateFrom, OffsetDateTime dateTo, String invoiceNumber, List<Integer> storeId, final ApiCallback<RestApiFinanceSearchPaginationResultInvoice> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInvoicesValidateBeforeCall(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiFinanceSearchPaginationResultInvoice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
