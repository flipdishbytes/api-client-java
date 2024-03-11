# AppStoreApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppStoreApp**](AppStoreApi.md#getAppStoreApp) | **GET** /api/v1.0/appstore/apps/{appStoreAppId} | 
[**getAppStoreApps**](AppStoreApi.md#getAppStoreApps) | **GET** /api/v1.0/appstore/apps | 


<a name="getAppStoreApp"></a>
# **getAppStoreApp**
> RestApiResultAppStoreApp getAppStoreApp(appStoreAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreApi apiInstance = new AppStoreApi();
String appStoreAppId = "appStoreAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultAppStoreApp result = apiInstance.getAppStoreApp(appStoreAppId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**|  |
 **appId** | **String**|  | [optional]

### Return type

[**RestApiResultAppStoreApp**](RestApiResultAppStoreApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreApps"></a>
# **getAppStoreApps**
> RestApiPaginationResultAppStoreAppSummary getAppStoreApps(search, page, limit, excludeNotOwned, showOnlyVerified)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreApi apiInstance = new AppStoreApi();
String search = "search_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
Boolean excludeNotOwned = true; // Boolean | 
Boolean showOnlyVerified = true; // Boolean | 
try {
    RestApiPaginationResultAppStoreAppSummary result = apiInstance.getAppStoreApps(search, page, limit, excludeNotOwned, showOnlyVerified);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **excludeNotOwned** | **Boolean**|  | [optional]
 **showOnlyVerified** | **Boolean**|  | [optional]

### Return type

[**RestApiPaginationResultAppStoreAppSummary**](RestApiPaginationResultAppStoreAppSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

