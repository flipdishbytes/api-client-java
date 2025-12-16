# TipsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tipConfigGet**](TipsApi.md#tipConfigGet) | **GET** /api/v1.0/stores/{storeId}/tipconfig | 
[**tipConfigUpsert**](TipsApi.md#tipConfigUpsert) | **POST** /api/v1.0/stores/{storeId}/tipconfig | 


<a name="tipConfigGet"></a>
# **tipConfigGet**
> RestApiResultTipConfiguration tipConfigGet(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TipsApi apiInstance = new TipsApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultTipConfiguration result = apiInstance.tipConfigGet(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TipsApi#tipConfigGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultTipConfiguration**](RestApiResultTipConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="tipConfigUpsert"></a>
# **tipConfigUpsert**
> RestApiResultTipConfiguration tipConfigUpsert(storeId, updateConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TipsApi apiInstance = new TipsApi();
Integer storeId = 56; // Integer | 
UpdateTipConfiguration updateConfig = new UpdateTipConfiguration(); // UpdateTipConfiguration | 
try {
    RestApiResultTipConfiguration result = apiInstance.tipConfigUpsert(storeId, updateConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TipsApi#tipConfigUpsert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **updateConfig** | [**UpdateTipConfiguration**](UpdateTipConfiguration.md)|  |

### Return type

[**RestApiResultTipConfiguration**](RestApiResultTipConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

