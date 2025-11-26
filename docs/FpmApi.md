# FpmApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFpmForStore**](FpmApi.md#createFpmForStore) | **POST** /api/v1.0/{storeId}/fpm | 
[**deleteFpmForStore**](FpmApi.md#deleteFpmForStore) | **DELETE** /api/v1.0/{storeId}/fpm | 
[**editFpmForStore**](FpmApi.md#editFpmForStore) | **POST** /api/v1.0/{storeId}/fpm/edit | 
[**getFpmForStore**](FpmApi.md#getFpmForStore) | **GET** /api/v1.0/{storeId}/fpm | 


<a name="createFpmForStore"></a>
# **createFpmForStore**
> Object createFpmForStore(storeId, phoneNumber)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FpmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FpmApi apiInstance = new FpmApi();
Integer storeId = 56; // Integer | 
String phoneNumber = "phoneNumber_example"; // String | 
try {
    Object result = apiInstance.createFpmForStore(storeId, phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FpmApi#createFpmForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **phoneNumber** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteFpmForStore"></a>
# **deleteFpmForStore**
> deleteFpmForStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FpmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FpmApi apiInstance = new FpmApi();
Integer storeId = 56; // Integer | 
try {
    apiInstance.deleteFpmForStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling FpmApi#deleteFpmForStore");
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

<a name="editFpmForStore"></a>
# **editFpmForStore**
> editFpmForStore(storeId, telephonyConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FpmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FpmApi apiInstance = new FpmApi();
Integer storeId = 56; // Integer | 
TelephonyConfig telephonyConfig = new TelephonyConfig(); // TelephonyConfig | 
try {
    apiInstance.editFpmForStore(storeId, telephonyConfig);
} catch (ApiException e) {
    System.err.println("Exception when calling FpmApi#editFpmForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **telephonyConfig** | [**TelephonyConfig**](TelephonyConfig.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFpmForStore"></a>
# **getFpmForStore**
> TelephonyConfig getFpmForStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FpmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FpmApi apiInstance = new FpmApi();
Integer storeId = 56; // Integer | 
try {
    TelephonyConfig result = apiInstance.getFpmForStore(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FpmApi#getFpmForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**TelephonyConfig**](TelephonyConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

