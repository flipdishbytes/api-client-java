# EndUserFeesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEndUserFeeConfig**](EndUserFeesApi.md#createEndUserFeeConfig) | **POST** /api/v1.0/{appId}/stores/{storeId}/end-user-fees | 
[**getEndUserFeesForStore**](EndUserFeesApi.md#getEndUserFeesForStore) | **GET** /api/v1.0/{appId}/stores/{storeId}/end-user-fees | 
[**setV2FeeCalculation**](EndUserFeesApi.md#setV2FeeCalculation) | **POST** /api/v1.0/{appId}/stores/{storeId}/end-user-fees/v2-fee-calculation | 


<a name="createEndUserFeeConfig"></a>
# **createEndUserFeeConfig**
> Object createEndUserFeeConfig(input, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EndUserFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EndUserFeesApi apiInstance = new EndUserFeesApi();
CreateEndUserFeeConfig input = new CreateEndUserFeeConfig(); // CreateEndUserFeeConfig | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.createEndUserFeeConfig(input, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndUserFeesApi#createEndUserFeeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**CreateEndUserFeeConfig**](CreateEndUserFeeConfig.md)|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEndUserFeesForStore"></a>
# **getEndUserFeesForStore**
> RestApiResultGetEndUserFeeConfigsResponse getEndUserFeesForStore(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EndUserFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EndUserFeesApi apiInstance = new EndUserFeesApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultGetEndUserFeeConfigsResponse result = apiInstance.getEndUserFeesForStore(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndUserFeesApi#getEndUserFeesForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultGetEndUserFeeConfigsResponse**](RestApiResultGetEndUserFeeConfigsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setV2FeeCalculation"></a>
# **setV2FeeCalculation**
> RestApiResultSetV2FeeCalculationRequest setV2FeeCalculation(input, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EndUserFeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EndUserFeesApi apiInstance = new EndUserFeesApi();
SetV2FeeCalculationRequest input = new SetV2FeeCalculationRequest(); // SetV2FeeCalculationRequest | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultSetV2FeeCalculationRequest result = apiInstance.setV2FeeCalculation(input, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndUserFeesApi#setV2FeeCalculation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**SetV2FeeCalculationRequest**](SetV2FeeCalculationRequest.md)|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultSetV2FeeCalculationRequest**](RestApiResultSetV2FeeCalculationRequest.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

