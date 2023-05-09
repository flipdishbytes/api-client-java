# OrderIngestApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderIngestSubmitNewOrder**](OrderIngestApi.md#orderIngestSubmitNewOrder) | **POST** /api/v1.0/{appNameId}/order-ingest/submit | 


<a name="orderIngestSubmitNewOrder"></a>
# **orderIngestSubmitNewOrder**
> RestApiResultOrderIngestSubmitOrderResponse orderIngestSubmitNewOrder(order, appNameId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderIngestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderIngestApi apiInstance = new OrderIngestApi();
OrderIngestSubmitOrderRequest order = new OrderIngestSubmitOrderRequest(); // OrderIngestSubmitOrderRequest | 
String appNameId = "appNameId_example"; // String | 
try {
    RestApiResultOrderIngestSubmitOrderResponse result = apiInstance.orderIngestSubmitNewOrder(order, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderIngestApi#orderIngestSubmitNewOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**OrderIngestSubmitOrderRequest**](OrderIngestSubmitOrderRequest.md)|  |
 **appNameId** | **String**|  |

### Return type

[**RestApiResultOrderIngestSubmitOrderResponse**](RestApiResultOrderIngestSubmitOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

