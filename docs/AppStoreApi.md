# AppStoreApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppStoreApp**](AppStoreApi.md#getAppStoreApp) | **GET** /api/v1.0/appstore/apps/{appStoreAppId} | Get App store app
[**getAppStoreApps**](AppStoreApi.md#getAppStoreApps) | **GET** /api/v1.0/appstore/apps | Get list of App store app summaries


<a name="getAppStoreApp"></a>
# **getAppStoreApp**
> AppStoreApp getAppStoreApp(appStoreAppId)

Get App store app

App store app must be verified or you are the owner [BETA - this endpoint is under development, do not use it in your production system]

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
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
try {
    AppStoreApp result = apiInstance.getAppStoreApp(appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App store app id |

### Return type

[**AppStoreApp**](AppStoreApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreApps"></a>
# **getAppStoreApps**
> RestApiPaginationResultAppStoreAppSummary getAppStoreApps(search, page, limit, excludeNotOwned)

Get list of App store app summaries

Only returns verified applications [BETA - this endpoint is under development, do not use it in your production system]

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
String search = "search_example"; // String | Query App store app name
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
Boolean excludeNotOwned = true; // Boolean | Exclude App store apps that user is not the owner off
try {
    RestApiPaginationResultAppStoreAppSummary result = apiInstance.getAppStoreApps(search, page, limit, excludeNotOwned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| Query App store app name |
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **excludeNotOwned** | **Boolean**| Exclude App store apps that user is not the owner off | [optional]

### Return type

[**RestApiPaginationResultAppStoreAppSummary**](RestApiPaginationResultAppStoreAppSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

