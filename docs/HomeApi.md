# HomeApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeHomeAction**](HomeApi.md#completeHomeAction) | **POST** /api/v1.0/{appId}/home/{homeActionId} | [PRIVATE API] Complete Home Action
[**dismissOldPortalAction**](HomeApi.md#dismissOldPortalAction) | **POST** /api/v1.0/home/dismissoldportalaction | [PRIVATE API] Complete Home Action
[**getHomeActions**](HomeApi.md#getHomeActions) | **GET** /api/v1.0/{appId}/home | [PRIVATE API] Get Home Actions
[**getHomeStatistics**](HomeApi.md#getHomeStatistics) | **GET** /api/v1.0/{appId}/home/stats | [PRIVATE API] Get Home Statistics
[**getOktaPortalFeatureFlag**](HomeApi.md#getOktaPortalFeatureFlag) | **GET** /api/v1.0/home/okta-portal | [PRIVATE API] Get Azure KeyVault OktaApiPortalLoginRequired


<a name="completeHomeAction"></a>
# **completeHomeAction**
> Object completeHomeAction(appId, homeActionId, isDismissed)

[PRIVATE API] Complete Home Action

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
String appId = "appId_example"; // String | App Name Id
Integer homeActionId = 56; // Integer | Id of the action
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
 **appId** | **String**| App Name Id |
 **homeActionId** | **Integer**| Id of the action |
 **isDismissed** | **Boolean**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dismissOldPortalAction"></a>
# **dismissOldPortalAction**
> Object dismissOldPortalAction()

[PRIVATE API] Complete Home Action

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
    Object result = apiInstance.dismissOldPortalAction();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeApi#dismissOldPortalAction");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

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

[PRIVATE API] Get Home Actions

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
String appId = "appId_example"; // String | App Name Id
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
 **appId** | **String**| App Name Id |

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

[PRIVATE API] Get Home Statistics

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
String appId = "appId_example"; // String | App Name Id
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
 **appId** | **String**| App Name Id |

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

[PRIVATE API] Get Azure KeyVault OktaApiPortalLoginRequired

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

