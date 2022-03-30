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


import com.flipdish.apiclient.model.CreateLocation;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultLocationAreaLocation;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationApi {
    private ApiClient apiClient;

    public LocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createLocation
     * @param createLocationInput Input data for creating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLocationCall(CreateLocation createLocationInput, Integer locationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createLocationInput;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location"
            .replaceAll("\\{" + "locationAreaId" + "\\}", apiClient.escapeString(locationAreaId.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createLocationValidateBeforeCall(CreateLocation createLocationInput, Integer locationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createLocationInput' is set
        if (createLocationInput == null) {
            throw new ApiException("Missing the required parameter 'createLocationInput' when calling createLocation(Async)");
        }
        
        // verify the required parameter 'locationAreaId' is set
        if (locationAreaId == null) {
            throw new ApiException("Missing the required parameter 'locationAreaId' when calling createLocation(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling createLocation(Async)");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling createLocation(Async)");
        }
        

        com.squareup.okhttp.Call call = createLocationCall(createLocationInput, locationAreaId, appId, storeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a Location i.e: Table, Hotel Room, Car park space
     * 
     * @param createLocationInput Input data for creating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object createLocation(CreateLocation createLocationInput, Integer locationAreaId, String appId, Integer storeId) throws ApiException {
        ApiResponse<Object> resp = createLocationWithHttpInfo(createLocationInput, locationAreaId, appId, storeId);
        return resp.getData();
    }

    /**
     * Create a Location i.e: Table, Hotel Room, Car park space
     * 
     * @param createLocationInput Input data for creating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> createLocationWithHttpInfo(CreateLocation createLocationInput, Integer locationAreaId, String appId, Integer storeId) throws ApiException {
        com.squareup.okhttp.Call call = createLocationValidateBeforeCall(createLocationInput, locationAreaId, appId, storeId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Location i.e: Table, Hotel Room, Car park space (asynchronously)
     * 
     * @param createLocationInput Input data for creating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLocationAsync(CreateLocation createLocationInput, Integer locationAreaId, String appId, Integer storeId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLocationValidateBeforeCall(createLocationInput, locationAreaId, appId, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteLocation
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the Location Area that the Location belong (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLocationCall(Integer locationId, Integer locationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/delete"
            .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
            .replaceAll("\\{" + "locationAreaId" + "\\}", apiClient.escapeString(locationAreaId.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteLocationValidateBeforeCall(Integer locationId, Integer locationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling deleteLocation(Async)");
        }
        
        // verify the required parameter 'locationAreaId' is set
        if (locationAreaId == null) {
            throw new ApiException("Missing the required parameter 'locationAreaId' when calling deleteLocation(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteLocation(Async)");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling deleteLocation(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteLocationCall(locationId, locationAreaId, appId, storeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Set a Location as deleted
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the Location Area that the Location belong (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deleteLocation(Integer locationId, Integer locationAreaId, String appId, Integer storeId) throws ApiException {
        ApiResponse<Object> resp = deleteLocationWithHttpInfo(locationId, locationAreaId, appId, storeId);
        return resp.getData();
    }

    /**
     * Set a Location as deleted
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the Location Area that the Location belong (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deleteLocationWithHttpInfo(Integer locationId, Integer locationAreaId, String appId, Integer storeId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLocationValidateBeforeCall(locationId, locationAreaId, appId, storeId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set a Location as deleted (asynchronously)
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the Location Area that the Location belong (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLocationAsync(Integer locationId, Integer locationAreaId, String appId, Integer storeId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLocationValidateBeforeCall(locationId, locationAreaId, appId, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveLocation
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the new Location area that it should be moved to (required)
     * @param newLocationAreaId Id of the new Location area that it should be moved to (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveLocationCall(Integer locationId, Integer locationAreaId, Integer newLocationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/move"
            .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
            .replaceAll("\\{" + "locationAreaId" + "\\}", apiClient.escapeString(locationAreaId.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (newLocationAreaId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("newLocationAreaId", newLocationAreaId));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveLocationValidateBeforeCall(Integer locationId, Integer locationAreaId, Integer newLocationAreaId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling moveLocation(Async)");
        }
        
        // verify the required parameter 'locationAreaId' is set
        if (locationAreaId == null) {
            throw new ApiException("Missing the required parameter 'locationAreaId' when calling moveLocation(Async)");
        }
        
        // verify the required parameter 'newLocationAreaId' is set
        if (newLocationAreaId == null) {
            throw new ApiException("Missing the required parameter 'newLocationAreaId' when calling moveLocation(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling moveLocation(Async)");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling moveLocation(Async)");
        }
        

        com.squareup.okhttp.Call call = moveLocationCall(locationId, locationAreaId, newLocationAreaId, appId, storeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move a Location to a different location Area
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the new Location area that it should be moved to (required)
     * @param newLocationAreaId Id of the new Location area that it should be moved to (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object moveLocation(Integer locationId, Integer locationAreaId, Integer newLocationAreaId, String appId, Integer storeId) throws ApiException {
        ApiResponse<Object> resp = moveLocationWithHttpInfo(locationId, locationAreaId, newLocationAreaId, appId, storeId);
        return resp.getData();
    }

    /**
     * Move a Location to a different location Area
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the new Location area that it should be moved to (required)
     * @param newLocationAreaId Id of the new Location area that it should be moved to (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> moveLocationWithHttpInfo(Integer locationId, Integer locationAreaId, Integer newLocationAreaId, String appId, Integer storeId) throws ApiException {
        com.squareup.okhttp.Call call = moveLocationValidateBeforeCall(locationId, locationAreaId, newLocationAreaId, appId, storeId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move a Location to a different location Area (asynchronously)
     * 
     * @param locationId Id of the Location that will be moved (required)
     * @param locationAreaId Id of the new Location area that it should be moved to (required)
     * @param newLocationAreaId Id of the new Location area that it should be moved to (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call moveLocationAsync(Integer locationId, Integer locationAreaId, Integer newLocationAreaId, String appId, Integer storeId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = moveLocationValidateBeforeCall(locationId, locationAreaId, newLocationAreaId, appId, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateLocation
     * @param updateLocationInput Input data for updating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param locationId Id of the Location to be updated (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateLocationCall(CreateLocation updateLocationInput, Integer locationAreaId, Integer locationId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateLocationInput;

        // create path and map variables
        String localVarPath = "/api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/update"
            .replaceAll("\\{" + "locationAreaId" + "\\}", apiClient.escapeString(locationAreaId.toString()))
            .replaceAll("\\{" + "locationId" + "\\}", apiClient.escapeString(locationId.toString()))
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "storeId" + "\\}", apiClient.escapeString(storeId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateLocationValidateBeforeCall(CreateLocation updateLocationInput, Integer locationAreaId, Integer locationId, String appId, Integer storeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'updateLocationInput' is set
        if (updateLocationInput == null) {
            throw new ApiException("Missing the required parameter 'updateLocationInput' when calling updateLocation(Async)");
        }
        
        // verify the required parameter 'locationAreaId' is set
        if (locationAreaId == null) {
            throw new ApiException("Missing the required parameter 'locationAreaId' when calling updateLocation(Async)");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling updateLocation(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateLocation(Async)");
        }
        
        // verify the required parameter 'storeId' is set
        if (storeId == null) {
            throw new ApiException("Missing the required parameter 'storeId' when calling updateLocation(Async)");
        }
        

        com.squareup.okhttp.Call call = updateLocationCall(updateLocationInput, locationAreaId, locationId, appId, storeId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a Location i.e: Table, Hotel Room, Car park space
     * 
     * @param updateLocationInput Input data for updating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param locationId Id of the Location to be updated (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return RestApiResultLocationAreaLocation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestApiResultLocationAreaLocation updateLocation(CreateLocation updateLocationInput, Integer locationAreaId, Integer locationId, String appId, Integer storeId) throws ApiException {
        ApiResponse<RestApiResultLocationAreaLocation> resp = updateLocationWithHttpInfo(updateLocationInput, locationAreaId, locationId, appId, storeId);
        return resp.getData();
    }

    /**
     * Update a Location i.e: Table, Hotel Room, Car park space
     * 
     * @param updateLocationInput Input data for updating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param locationId Id of the Location to be updated (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @return ApiResponse&lt;RestApiResultLocationAreaLocation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestApiResultLocationAreaLocation> updateLocationWithHttpInfo(CreateLocation updateLocationInput, Integer locationAreaId, Integer locationId, String appId, Integer storeId) throws ApiException {
        com.squareup.okhttp.Call call = updateLocationValidateBeforeCall(updateLocationInput, locationAreaId, locationId, appId, storeId, null, null);
        Type localVarReturnType = new TypeToken<RestApiResultLocationAreaLocation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Location i.e: Table, Hotel Room, Car park space (asynchronously)
     * 
     * @param updateLocationInput Input data for updating the Location (required)
     * @param locationAreaId Id of the Location area where the Location belongs (required)
     * @param locationId Id of the Location to be updated (required)
     * @param appId AppId i.e: (fd1234) (required)
     * @param storeId Id of the Store (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateLocationAsync(CreateLocation updateLocationInput, Integer locationAreaId, Integer locationId, String appId, Integer storeId, final ApiCallback<RestApiResultLocationAreaLocation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateLocationValidateBeforeCall(updateLocationInput, locationAreaId, locationId, appId, storeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestApiResultLocationAreaLocation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}