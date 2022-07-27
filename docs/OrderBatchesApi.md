# OrderBatchesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllOrderBatches**](OrderBatchesApi.md#getAllOrderBatches) | **GET** /api/v1.0/{appId}/stores/{storeId}/order-batches | Returns order batches
[**getOrderBatch**](OrderBatchesApi.md#getOrderBatch) | **GET** /api/v1.0/{appId}/stores/{storeId}/order-batches/{batchId} | Returns the order batch details


<a name="getAllOrderBatches"></a>
# **getAllOrderBatches**
> RestApiArrayResultOrderBatchItem getAllOrderBatches(appId, storeId, createdFrom, createdTo)

Returns order batches

Entries are sorted by date, from the most recent. At most 100 entries are returned.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderBatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderBatchesApi apiInstance = new OrderBatchesApi();
String appId = "appId_example"; // String | App Id
Integer storeId = 56; // Integer | Store Id
OffsetDateTime createdFrom = OffsetDateTime.now(); // OffsetDateTime | Start date for retrieving the entries
OffsetDateTime createdTo = OffsetDateTime.now(); // OffsetDateTime | End date for retrieving the entries
try {
    RestApiArrayResultOrderBatchItem result = apiInstance.getAllOrderBatches(appId, storeId, createdFrom, createdTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBatchesApi#getAllOrderBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **storeId** | **Integer**| Store Id |
 **createdFrom** | **OffsetDateTime**| Start date for retrieving the entries | [optional]
 **createdTo** | **OffsetDateTime**| End date for retrieving the entries | [optional]

### Return type

[**RestApiArrayResultOrderBatchItem**](RestApiArrayResultOrderBatchItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderBatch"></a>
# **getOrderBatch**
> RestApiResultOrderBatch getOrderBatch(appId, storeId, batchId)

Returns the order batch details

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderBatchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderBatchesApi apiInstance = new OrderBatchesApi();
String appId = "appId_example"; // String | App Id
Integer storeId = 56; // Integer | Store Id
Integer batchId = 56; // Integer | Order Batch Id
try {
    RestApiResultOrderBatch result = apiInstance.getOrderBatch(appId, storeId, batchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBatchesApi#getOrderBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **storeId** | **Integer**| Store Id |
 **batchId** | **Integer**| Order Batch Id |

### Return type

[**RestApiResultOrderBatch**](RestApiResultOrderBatch.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

