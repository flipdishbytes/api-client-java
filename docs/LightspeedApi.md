# LightspeedApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateMenu**](LightspeedApi.md#generateMenu) | **POST** /api/v1.0/lightspeed/{storeId}/menu/generate | 
[**getStoreSettings**](LightspeedApi.md#getStoreSettings) | **GET** /api/v1.0/lightspeed/{storeId}/settings | 
[**saveStoreSettings**](LightspeedApi.md#saveStoreSettings) | **POST** /api/v1.0/lightspeed/{storeId}/settings | 


<a name="generateMenu"></a>
# **generateMenu**
> generateMenu(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LightspeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LightspeedApi apiInstance = new LightspeedApi();
Integer storeId = 56; // Integer | 
try {
    apiInstance.generateMenu(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#generateMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreSettings"></a>
# **getStoreSettings**
> RestApiResultLightspeedSettings getStoreSettings(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LightspeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LightspeedApi apiInstance = new LightspeedApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultLightspeedSettings result = apiInstance.getStoreSettings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#getStoreSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultLightspeedSettings**](RestApiResultLightspeedSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="saveStoreSettings"></a>
# **saveStoreSettings**
> RestApiResultLightspeedSettings saveStoreSettings(storeId, lightspeedSettings)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LightspeedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LightspeedApi apiInstance = new LightspeedApi();
Integer storeId = 56; // Integer | 
LightspeedSettings lightspeedSettings = new LightspeedSettings(); // LightspeedSettings | 
try {
    RestApiResultLightspeedSettings result = apiInstance.saveStoreSettings(storeId, lightspeedSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#saveStoreSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **lightspeedSettings** | [**LightspeedSettings**](LightspeedSettings.md)|  |

### Return type

[**RestApiResultLightspeedSettings**](RestApiResultLightspeedSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

