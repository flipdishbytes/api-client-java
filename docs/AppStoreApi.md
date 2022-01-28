# AppStoreApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appVerificationUpdate**](AppStoreApi.md#appVerificationUpdate) | **PUT** /api/v1.0/appstore/apps/{appStoreAppId}/verification | Update app store app verification
[**createAppStoreApp**](AppStoreApi.md#createAppStoreApp) | **POST** /api/v1.0/appstore/apps | Create app store app
[**deleteAppStoreApp**](AppStoreApi.md#deleteAppStoreApp) | **DELETE** /api/v1.0/appstore/apps/{appStoreAppId} | Delete app store app
[**getAppStoreApp**](AppStoreApi.md#getAppStoreApp) | **GET** /api/v1.0/appstore/apps/{appStoreAppId} | Get app store app details
[**getAppStoreApps**](AppStoreApi.md#getAppStoreApps) | **GET** /api/v1.0/appstore/apps | Get list of app store app summaries
[**updateAppStoreApp**](AppStoreApi.md#updateAppStoreApp) | **PUT** /api/v1.0/appstore/apps/{appStoreAppId} | Update app store app
[**uploadAppStoreAppLogo**](AppStoreApi.md#uploadAppStoreAppLogo) | **POST** /api/v1.0/appstore/apps/{appStoreAppId}/logo | Upload the app store app logo \\ icon


<a name="appVerificationUpdate"></a>
# **appVerificationUpdate**
> appVerificationUpdate(appStoreAppId, verificationStatus)

Update app store app verification

[BETA - this endpoint is under development, do not use it in your production system][Note: Only Flipdish staff can verify apps]

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
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
String verificationStatus = "verificationStatus_example"; // String | New Verification Status
try {
    apiInstance.appVerificationUpdate(appStoreAppId, verificationStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#appVerificationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App Store App Id |
 **verificationStatus** | **String**| New Verification Status |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAppStoreApp"></a>
# **createAppStoreApp**
> RestApiResultAppDetail createAppStoreApp(appDetailBase)

Create app store app

[BETA - this endpoint is under development, do not use it in your production system]

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
AppDetailBase appDetailBase = new AppDetailBase(); // AppDetailBase | App Store App Detail Base
try {
    RestApiResultAppDetail result = apiInstance.createAppStoreApp(appDetailBase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#createAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDetailBase** | [**AppDetailBase**](AppDetailBase.md)| App Store App Detail Base |

### Return type

[**RestApiResultAppDetail**](RestApiResultAppDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppStoreApp"></a>
# **deleteAppStoreApp**
> RestApiStringResult deleteAppStoreApp(appStoreAppId)

Delete app store app

[BETA - this endpoint is under development, do not use it in your production system]

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
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
try {
    RestApiStringResult result = apiInstance.deleteAppStoreApp(appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#deleteAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App Store App Id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreApp"></a>
# **getAppStoreApp**
> AppDetail getAppStoreApp(appStoreAppId)

Get app store app details

[BETA - this endpoint is under development, do not use it in your production system]

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
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
try {
    AppDetail result = apiInstance.getAppStoreApp(appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App Store App Id |

### Return type

[**AppDetail**](AppDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreApps"></a>
# **getAppStoreApps**
> RestApiPaginationResultAppSummary getAppStoreApps(search, page, limit, excludeNotOwned)

Get list of app store app summaries

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
String search = "search_example"; // String | Query app store app name
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
Boolean excludeNotOwned = true; // Boolean | Exclude app store apps that user is not the owner off
try {
    RestApiPaginationResultAppSummary result = apiInstance.getAppStoreApps(search, page, limit, excludeNotOwned);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#getAppStoreApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| Query app store app name |
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **excludeNotOwned** | **Boolean**| Exclude app store apps that user is not the owner off | [optional]

### Return type

[**RestApiPaginationResultAppSummary**](RestApiPaginationResultAppSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreApp"></a>
# **updateAppStoreApp**
> updateAppStoreApp(appStoreAppId, appDetail)

Update app store app

[BETA - this endpoint is under development, do not use it in your production system]

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
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
AppDetail appDetail = new AppDetail(); // AppDetail | App Store App Detail
try {
    apiInstance.updateAppStoreApp(appStoreAppId, appDetail);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#updateAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App Store App Id |
 **appDetail** | [**AppDetail**](AppDetail.md)| App Store App Detail |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadAppStoreAppLogo"></a>
# **uploadAppStoreAppLogo**
> uploadAppStoreAppLogo(appStoreAppId, image)

Upload the app store app logo \\ icon

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
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
File image = new File("/path/to/file.txt"); // File | App Store App Logo
try {
    apiInstance.uploadAppStoreAppLogo(appStoreAppId, image);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#uploadAppStoreAppLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App Store App Id |
 **image** | **File**| App Store App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

