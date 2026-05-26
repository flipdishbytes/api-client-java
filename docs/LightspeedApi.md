# LightspeedApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lightspeedGenerateMenu**](LightspeedApi.md#lightspeedGenerateMenu) | **POST** /api/v1.0/lightspeed/{storeId}/menu/generate | 
[**lightspeedGetStoreSettings**](LightspeedApi.md#lightspeedGetStoreSettings) | **GET** /api/v1.0/lightspeed/{storeId}/settings | 
[**lightspeedSaveStoreSettings**](LightspeedApi.md#lightspeedSaveStoreSettings) | **POST** /api/v1.0/lightspeed/{storeId}/settings | 


<a name="lightspeedGenerateMenu"></a>
# **lightspeedGenerateMenu**
> Object lightspeedGenerateMenu(storeId)



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
    Object result = apiInstance.lightspeedGenerateMenu(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#lightspeedGenerateMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="lightspeedGetStoreSettings"></a>
# **lightspeedGetStoreSettings**
> RestApiResultLightspeedSettings lightspeedGetStoreSettings(storeId)



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
    RestApiResultLightspeedSettings result = apiInstance.lightspeedGetStoreSettings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#lightspeedGetStoreSettings");
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

<a name="lightspeedSaveStoreSettings"></a>
# **lightspeedSaveStoreSettings**
> RestApiResultLightspeedSettings lightspeedSaveStoreSettings(storeId, lightspeedSettings)



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
    RestApiResultLightspeedSettings result = apiInstance.lightspeedSaveStoreSettings(storeId, lightspeedSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightspeedApi#lightspeedSaveStoreSettings");
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

