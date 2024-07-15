# HomeApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeHomeAction**](HomeApi.md#completeHomeAction) | **POST** /api/v1.0/{appId}/home/{homeActionId} | 
[**getHomeActions**](HomeApi.md#getHomeActions) | **GET** /api/v1.0/{appId}/home | 
[**getHomeStatistics**](HomeApi.md#getHomeStatistics) | **GET** /api/v1.0/{appId}/home/stats | 
[**getOktaPortalFeatureFlag**](HomeApi.md#getOktaPortalFeatureFlag) | **GET** /api/v1.0/home/okta-portal | 


<a name="completeHomeAction"></a>
# **completeHomeAction**
> Object completeHomeAction(appId, homeActionId, isDismissed)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HomeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HomeApi apiInstance = new HomeApi();
String appId = "appId_example"; // String | 
Integer homeActionId = 56; // Integer | 
Boolean isDismissed = true; // Boolean | 
try {
    Object result = apiInstance.completeHomeAction(appId, homeActionId, isDismissed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeApi#completeHomeAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **homeActionId** | **Integer**|  |
 **isDismissed** | **Boolean**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getHomeActions"></a>
# **getHomeActions**
> RestApiArrayResultHomeAction getHomeActions(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HomeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HomeApi apiInstance = new HomeApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultHomeAction result = apiInstance.getHomeActions(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeApi#getHomeActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultHomeAction**](RestApiArrayResultHomeAction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getHomeStatistics"></a>
# **getHomeStatistics**
> RestApiResultHomeStatistics getHomeStatistics(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HomeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HomeApi apiInstance = new HomeApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultHomeStatistics result = apiInstance.getHomeStatistics(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeApi#getHomeStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultHomeStatistics**](RestApiResultHomeStatistics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOktaPortalFeatureFlag"></a>
# **getOktaPortalFeatureFlag**
> RestApiResultOktaPortalFeatureFlag getOktaPortalFeatureFlag()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HomeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HomeApi apiInstance = new HomeApi();
try {
    RestApiResultOktaPortalFeatureFlag result = apiInstance.getOktaPortalFeatureFlag();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeApi#getOktaPortalFeatureFlag");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultOktaPortalFeatureFlag**](RestApiResultOktaPortalFeatureFlag.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

