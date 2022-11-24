# StoreFeeConfigsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessingFeeConfigsByStoreId**](StoreFeeConfigsApi.md#getProcessingFeeConfigsByStoreId) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs | Get processing fee configs by store identifier
[**getProcessingFeeConfigsByStoreIdAndPaymentAccountType**](StoreFeeConfigsApi.md#getProcessingFeeConfigsByStoreIdAndPaymentAccountType) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs/{paymentAccountType} | Get processing fee configs by store identifier and paymentAccountType
[**getStoreFeeConfig**](StoreFeeConfigsApi.md#getStoreFeeConfig) | **GET** /api/v1.0/stores/{storeId}/feeConfig | Get Store feeConfig


<a name="getProcessingFeeConfigsByStoreId"></a>
# **getProcessingFeeConfigsByStoreId**
> RestApiArrayResultProcessingFeeConfig getProcessingFeeConfigsByStoreId(storeId, appNameId)

Get processing fee configs by store identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreFeeConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreFeeConfigsApi apiInstance = new StoreFeeConfigsApi();
Integer storeId = 56; // Integer | Store identifier
String appNameId = "appNameId_example"; // String | App Name Id(Not used, still here for compatability reasons)
try {
    RestApiArrayResultProcessingFeeConfig result = apiInstance.getProcessingFeeConfigsByStoreId(storeId, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreFeeConfigsApi#getProcessingFeeConfigsByStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store identifier |
 **appNameId** | **String**| App Name Id(Not used, still here for compatability reasons) | [optional]

### Return type

[**RestApiArrayResultProcessingFeeConfig**](RestApiArrayResultProcessingFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getProcessingFeeConfigsByStoreIdAndPaymentAccountType"></a>
# **getProcessingFeeConfigsByStoreIdAndPaymentAccountType**
> RestApiResultProcessingFeeConfig getProcessingFeeConfigsByStoreIdAndPaymentAccountType(storeId, paymentAccountType, appNameId)

Get processing fee configs by store identifier and paymentAccountType

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreFeeConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreFeeConfigsApi apiInstance = new StoreFeeConfigsApi();
Integer storeId = 56; // Integer | Store identifier
String paymentAccountType = "paymentAccountType_example"; // String | 
String appNameId = "appNameId_example"; // String | App Name Id(Not used, still here for compatability reasons)
try {
    RestApiResultProcessingFeeConfig result = apiInstance.getProcessingFeeConfigsByStoreIdAndPaymentAccountType(storeId, paymentAccountType, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreFeeConfigsApi#getProcessingFeeConfigsByStoreIdAndPaymentAccountType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store identifier |
 **paymentAccountType** | **String**|  | [enum: Card, Cash, Ideal, Bancontact, Giropay, Eps, Emv, PayPal, PayGreen]
 **appNameId** | **String**| App Name Id(Not used, still here for compatability reasons) | [optional]

### Return type

[**RestApiResultProcessingFeeConfig**](RestApiResultProcessingFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreFeeConfig"></a>
# **getStoreFeeConfig**
> StoreFeeConfig getStoreFeeConfig(storeId)

Get Store feeConfig

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreFeeConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreFeeConfigsApi apiInstance = new StoreFeeConfigsApi();
Integer storeId = 56; // Integer | Store identifier
try {
    StoreFeeConfig result = apiInstance.getStoreFeeConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreFeeConfigsApi#getStoreFeeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store identifier |

### Return type

[**StoreFeeConfig**](StoreFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

