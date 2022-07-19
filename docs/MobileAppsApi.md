# MobileAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editAppConfigSalesChannel**](MobileAppsApi.md#editAppConfigSalesChannel) | **POST** /api/v1.0/mobileapps/{appId}/submission | Submission form mobile apps
[**editAppConfigSalesChannel_0**](MobileAppsApi.md#editAppConfigSalesChannel_0) | **POST** /api/v1.0/mobileapps/{appId}/saleschannel | Set the application sales channel configuration
[**getAppConfig**](MobileAppsApi.md#getAppConfig) | **GET** /api/v1.0/mobileapps/{appId}/config | Get mobile app configuration
[**getAppDetails**](MobileAppsApi.md#getAppDetails) | **GET** /api/v1.0/mobileapps/{appId}/details | Get mobile app details
[**getMobileAppsSubmissionStatus**](MobileAppsApi.md#getMobileAppsSubmissionStatus) | **GET** /api/v1.0/mobileapps/{appId}/submissionstatus{plataformType} | Get mobile app submitted status
[**setAppConfig**](MobileAppsApi.md#setAppConfig) | **POST** /api/v1.0/mobileapps/{appId}/config | Set mobile app configuration
[**uploadMobileAppsImage**](MobileAppsApi.md#uploadMobileAppsImage) | **POST** /api/v1.0/mobileapps/{appId}/image | Upload a Mobile Apps Image


<a name="editAppConfigSalesChannel"></a>
# **editAppConfigSalesChannel**
> RestApiResultMobileAppsSubmission editAppConfigSalesChannel(appId, mobileAppsSubmission)

Submission form mobile apps

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
MobileAppsSubmission mobileAppsSubmission = new MobileAppsSubmission(); // MobileAppsSubmission | 
try {
    RestApiResultMobileAppsSubmission result = apiInstance.editAppConfigSalesChannel(appId, mobileAppsSubmission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#editAppConfigSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **mobileAppsSubmission** | [**MobileAppsSubmission**](MobileAppsSubmission.md)|  |

### Return type

[**RestApiResultMobileAppsSubmission**](RestApiResultMobileAppsSubmission.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editAppConfigSalesChannel_0"></a>
# **editAppConfigSalesChannel_0**
> RestApiResultAppConfigSalesChannel editAppConfigSalesChannel_0(appId, appConfigSalesChannel)

Set the application sales channel configuration

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
AppConfigSalesChannel appConfigSalesChannel = new AppConfigSalesChannel(); // AppConfigSalesChannel | 
try {
    RestApiResultAppConfigSalesChannel result = apiInstance.editAppConfigSalesChannel_0(appId, appConfigSalesChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#editAppConfigSalesChannel_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appConfigSalesChannel** | [**AppConfigSalesChannel**](AppConfigSalesChannel.md)|  |

### Return type

[**RestApiResultAppConfigSalesChannel**](RestApiResultAppConfigSalesChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppConfig"></a>
# **getAppConfig**
> RestApiResultMobileAppsDetails getAppConfig(appId)

Get mobile app configuration

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultMobileAppsDetails result = apiInstance.getAppConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getAppConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultMobileAppsDetails**](RestApiResultMobileAppsDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppDetails"></a>
# **getAppDetails**
> RestApiResultMobileAppsDetails getAppDetails(appId)

Get mobile app details

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultMobileAppsDetails result = apiInstance.getAppDetails(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getAppDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultMobileAppsDetails**](RestApiResultMobileAppsDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMobileAppsSubmissionStatus"></a>
# **getMobileAppsSubmissionStatus**
> RestApiResultMobileAppsSubmissionStatus getMobileAppsSubmissionStatus(appId, plataformType)

Get mobile app submitted status

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
String plataformType = "plataformType_example"; // String | 
try {
    RestApiResultMobileAppsSubmissionStatus result = apiInstance.getMobileAppsSubmissionStatus(appId, plataformType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getMobileAppsSubmissionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **plataformType** | **String**|  | [enum: Android, IOS]

### Return type

[**RestApiResultMobileAppsSubmissionStatus**](RestApiResultMobileAppsSubmissionStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppConfig"></a>
# **setAppConfig**
> RestApiResult setAppConfig(appId, configUpdate)

Set mobile app configuration

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
MobileAppConfig configUpdate = new MobileAppConfig(); // MobileAppConfig | 
try {
    RestApiResult result = apiInstance.setAppConfig(appId, configUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#setAppConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **configUpdate** | [**MobileAppConfig**](MobileAppConfig.md)|  |

### Return type

[**RestApiResult**](RestApiResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMobileAppsImage"></a>
# **uploadMobileAppsImage**
> RestApiResultMobileAppsImage uploadMobileAppsImage(appId, image)

Upload a Mobile Apps Image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
File image = new File("/path/to/file.txt"); // File | Mobile Apps image
try {
    RestApiResultMobileAppsImage result = apiInstance.uploadMobileAppsImage(appId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#uploadMobileAppsImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **image** | **File**| Mobile Apps image |

### Return type

[**RestApiResultMobileAppsImage**](RestApiResultMobileAppsImage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

