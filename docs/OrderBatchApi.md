# OrderBatchApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllOrderBatches**](OrderBatchApi.md#getAllOrderBatches) | **GET** /api/v1.0/{appId}/stores/{storeId}/order-batches | Returns order batches created in a given time range


<a name="getAllOrderBatches"></a>
# **getAllOrderBatches**
> RestApiArrayResultOrderBatchItem getAllOrderBatches(appId, storeId, startDate, endDate)

Returns order batches created in a given time range

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderBatchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderBatchApi apiInstance = new OrderBatchApi();
String appId = "appId_example"; // String | App Id
Integer storeId = 56; // Integer | Store Id
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start Date
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End Date
try {
    RestApiArrayResultOrderBatchItem result = apiInstance.getAllOrderBatches(appId, storeId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBatchApi#getAllOrderBatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **storeId** | **Integer**| Store Id |
 **startDate** | **OffsetDateTime**| Start Date |
 **endDate** | **OffsetDateTime**| End Date |

### Return type

[**RestApiArrayResultOrderBatchItem**](RestApiArrayResultOrderBatchItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

