# AppStoreApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appVerificationUpdate**](AppStoreApi.md#appVerificationUpdate) | **PUT** /api/v1.0/appstore/apps/{appStoreAppId}/verification | Update App store app verification
[**createAppStoreApp**](AppStoreApi.md#createAppStoreApp) | **POST** /api/v1.0/appstore/apps | Create App store app
[**deleteAppStoreApp**](AppStoreApi.md#deleteAppStoreApp) | **DELETE** /api/v1.0/appstore/apps/{appStoreAppId} | Delete App store app
[**getAppStoreApp**](AppStoreApi.md#getAppStoreApp) | **GET** /api/v1.0/appstore/apps/{appStoreAppId} | Get App store app
[**getAppStoreApps**](AppStoreApi.md#getAppStoreApps) | **GET** /api/v1.0/appstore/apps | Get list of App store app summaries
[**updateAppStoreApp**](AppStoreApi.md#updateAppStoreApp) | **PUT** /api/v1.0/appstore/apps/{appStoreAppId} | Update App store app
[**uploadAppStoreAppLogo**](AppStoreApi.md#uploadAppStoreAppLogo) | **POST** /api/v1.0/appstore/apps/{appStoreAppId}/logo | Upload the App store app logo \\ icon


<a name="appVerificationUpdate"></a>
# **appVerificationUpdate**
> appVerificationUpdate(appStoreAppId, verificationStatus)

Update App store app verification

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
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
String verificationStatus = "verificationStatus_example"; // String | New verification status
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
 **appStoreAppId** | **String**| App store app id |
 **verificationStatus** | **String**| New verification status |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAppStoreApp"></a>
# **createAppStoreApp**
> RestApiResultAppStoreApp createAppStoreApp(createAppStoreApp)

Create App store app

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
CreateAppStoreApp createAppStoreApp = new CreateAppStoreApp(); // CreateAppStoreApp | App store app
try {
    RestApiResultAppStoreApp result = apiInstance.createAppStoreApp(createAppStoreApp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#createAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAppStoreApp** | [**CreateAppStoreApp**](CreateAppStoreApp.md)| App store app |

### Return type

[**RestApiResultAppStoreApp**](RestApiResultAppStoreApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppStoreApp"></a>
# **deleteAppStoreApp**
> RestApiStringResult deleteAppStoreApp(appStoreAppId)

Delete App store app

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
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
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
 **appStoreAppId** | **String**| App store app id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreApp"></a>
# **getAppStoreApp**
> AppStoreApp getAppStoreApp(appStoreAppId)

Get App store app

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

<a name="updateAppStoreApp"></a>
# **updateAppStoreApp**
> updateAppStoreApp(appStoreAppId, appStoreApp)

Update App store app

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
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
UpdateAppStoreApp appStoreApp = new UpdateAppStoreApp(); // UpdateAppStoreApp | Update App store app
try {
    apiInstance.updateAppStoreApp(appStoreAppId, appStoreApp);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreApi#updateAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**| App store app id |
 **appStoreApp** | [**UpdateAppStoreApp**](UpdateAppStoreApp.md)| Update App store app |

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

Upload the App store app logo \\ icon

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
 **appStoreAppId** | **String**| App store app id |
 **image** | **File**| App Store App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

