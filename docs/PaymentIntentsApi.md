# PaymentIntentsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentIntent**](PaymentIntentsApi.md#getPaymentIntent) | **GET** /api/v1.0/payment_intents/{paymentIntentId} | 


<a name="getPaymentIntent"></a>
# **getPaymentIntent**
> RestApiResultPaymentIntent getPaymentIntent(paymentIntentId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaymentIntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaymentIntentsApi apiInstance = new PaymentIntentsApi();
String paymentIntentId = "paymentIntentId_example"; // String | 
try {
    RestApiResultPaymentIntent result = apiInstance.getPaymentIntent(paymentIntentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentIntentsApi#getPaymentIntent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentIntentId** | **String**|  |

### Return type

[**RestApiResultPaymentIntent**](RestApiResultPaymentIntent.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

