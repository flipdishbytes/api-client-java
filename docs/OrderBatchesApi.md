# OrderBatchesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllOrderBatches**](OrderBatchesApi.md#getAllOrderBatches) | **GET** /api/v1.0/{appId}/order-batches | Returns order batches
[**getOrderBatch**](OrderBatchesApi.md#getOrderBatch) | **GET** /api/v1.0/{appId}/order-batches/{orderBatchId} | Returns the order batch details


<a name="getAllOrderBatches"></a>
# **getAllOrderBatches**
> RestApiArrayResultOrderBatch getAllOrderBatches(appId, storeIds, createdFrom, createdTo)

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
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | List of store Ids
OffsetDateTime createdFrom = OffsetDateTime.now(); // OffsetDateTime | Start date for retrieving the entries
OffsetDateTime createdTo = OffsetDateTime.now(); // OffsetDateTime | End date for retrieving the entries
try {
    RestApiArrayResultOrderBatch result = apiInstance.getAllOrderBatches(appId, storeIds, createdFrom, createdTo);
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
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)| List of store Ids | [optional]
 **createdFrom** | **OffsetDateTime**| Start date for retrieving the entries | [optional]
 **createdTo** | **OffsetDateTime**| End date for retrieving the entries | [optional]

### Return type

[**RestApiArrayResultOrderBatch**](RestApiArrayResultOrderBatch.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderBatch"></a>
# **getOrderBatch**
> RestApiResultOrderBatch getOrderBatch(appId, orderBatchId)

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
Integer orderBatchId = 56; // Integer | Order Batch Id
try {
    RestApiResultOrderBatch result = apiInstance.getOrderBatch(appId, orderBatchId);
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
 **orderBatchId** | **Integer**| Order Batch Id |

### Return type

[**RestApiResultOrderBatch**](RestApiResultOrderBatch.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

