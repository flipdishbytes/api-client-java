# GoogleFoodOrderPrototypeApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](GoogleFoodOrderPrototypeApi.md#createOrder) | **POST** /api/v1.0/{appId}/googleorder | 
[**submitOrder**](GoogleFoodOrderPrototypeApi.md#submitOrder) | **POST** /api/v1.0/{appId}/googleorder/{orderId}/submit | 


<a name="createOrder"></a>
# **createOrder**
> RestApiResultSubmitOrderResponseDm createOrder(appId, orderRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.GoogleFoodOrderPrototypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GoogleFoodOrderPrototypeApi apiInstance = new GoogleFoodOrderPrototypeApi();
String appId = "appId_example"; // String | 
CreateOrderRequest orderRequest = new CreateOrderRequest(); // CreateOrderRequest | 
try {
    RestApiResultSubmitOrderResponseDm result = apiInstance.createOrder(appId, orderRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoogleFoodOrderPrototypeApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  |

### Return type

[**RestApiResultSubmitOrderResponseDm**](RestApiResultSubmitOrderResponseDm.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submitOrder"></a>
# **submitOrder**
> RestApiResultSubmitOrderResponseDm submitOrder(appId, orderId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.GoogleFoodOrderPrototypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

GoogleFoodOrderPrototypeApi apiInstance = new GoogleFoodOrderPrototypeApi();
String appId = "appId_example"; // String | 
Integer orderId = 56; // Integer | 
SubmitOrderRequest request = new SubmitOrderRequest(); // SubmitOrderRequest | 
try {
    RestApiResultSubmitOrderResponseDm result = apiInstance.submitOrder(appId, orderId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoogleFoodOrderPrototypeApi#submitOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderId** | **Integer**|  |
 **request** | [**SubmitOrderRequest**](SubmitOrderRequest.md)|  |

### Return type

[**RestApiResultSubmitOrderResponseDm**](RestApiResultSubmitOrderResponseDm.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

