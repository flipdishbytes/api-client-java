# PaymentsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderPaymentInformation**](PaymentsApi.md#getOrderPaymentInformation) | **GET** /api/v1.0/payments/payment/{orderId}/refundable | 


<a name="getOrderPaymentInformation"></a>
# **getOrderPaymentInformation**
> RestApiResultOrderPaymentInformation getOrderPaymentInformation(orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
Integer orderId = 56; // Integer | 
try {
    RestApiResultOrderPaymentInformation result = apiInstance.getOrderPaymentInformation(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getOrderPaymentInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**RestApiResultOrderPaymentInformation**](RestApiResultOrderPaymentInformation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

