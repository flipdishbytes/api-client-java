# ReceiptsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReceipt**](ReceiptsApi.md#getReceipt) | **GET** /api/v1.0/receipts/{orderId} | 


<a name="getReceipt"></a>
# **getReceipt**
> GetReceiptByOrderIdQueryResponse getReceipt(orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ReceiptsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReceiptsApi apiInstance = new ReceiptsApi();
Integer orderId = 56; // Integer | 
try {
    GetReceiptByOrderIdQueryResponse result = apiInstance.getReceipt(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReceiptsApi#getReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**GetReceiptByOrderIdQueryResponse**](GetReceiptByOrderIdQueryResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

