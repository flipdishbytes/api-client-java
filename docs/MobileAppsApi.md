# MobileAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatistics**](MobileAppsApi.md#getStatistics) | **GET** /api/v1.0/mobileapps/{appId}/statistics | Get statistics mobile apps
[**getSubmissionDetails**](MobileAppsApi.md#getSubmissionDetails) | **GET** /api/v1.0/mobileapps/{appId}/submission/details | Get submission details mobile apps
[**getSubmissionStatus**](MobileAppsApi.md#getSubmissionStatus) | **GET** /api/v1.0/mobileapps/{appId}/submission/status | Get submission status mobile apps
[**submission**](MobileAppsApi.md#submission) | **POST** /api/v1.0/mobileapps/{appId}/submission | Submission form mobile apps
[**updateAppConfigSalesChannel**](MobileAppsApi.md#updateAppConfigSalesChannel) | **POST** /api/v1.0/mobileapps/{appId}/saleschannel | Update the application sales channel configuration
[**uploadImage**](MobileAppsApi.md#uploadImage) | **POST** /api/v1.0/mobileapps/{appId}/submission/image | Upload image mobile apps


<a name="getStatistics"></a>
# **getStatistics**
> RestApiArrayResultMobileAppsStatistics getStatistics(appId, platformTypes)

Get statistics mobile apps

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
List<String> platformTypes = Arrays.asList("platformTypes_example"); // List<String> | 
try {
    RestApiArrayResultMobileAppsStatistics result = apiInstance.getStatistics(appId, platformTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **platformTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: Android, IOS]

### Return type

[**RestApiArrayResultMobileAppsStatistics**](RestApiArrayResultMobileAppsStatistics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSubmissionDetails"></a>
# **getSubmissionDetails**
> RestApiResultMobileAppsSubmissionDetails getSubmissionDetails(appId)

Get submission details mobile apps

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
    RestApiResultMobileAppsSubmissionDetails result = apiInstance.getSubmissionDetails(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getSubmissionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultMobileAppsSubmissionDetails**](RestApiResultMobileAppsSubmissionDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSubmissionStatus"></a>
# **getSubmissionStatus**
> RestApiResultMobileAppsSubmissionStatus getSubmissionStatus(appId, type)

Get submission status mobile apps

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
String type = "type_example"; // String | 
try {
    RestApiResultMobileAppsSubmissionStatus result = apiInstance.getSubmissionStatus(appId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getSubmissionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **type** | **String**|  | [enum: Android, IOS]

### Return type

[**RestApiResultMobileAppsSubmissionStatus**](RestApiResultMobileAppsSubmissionStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submission"></a>
# **submission**
> RestApiResultMobileAppsSubmission submission(appId, mobileAppsSubmission)

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
    RestApiResultMobileAppsSubmission result = apiInstance.submission(appId, mobileAppsSubmission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#submission");
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

<a name="updateAppConfigSalesChannel"></a>
# **updateAppConfigSalesChannel**
> RestApiResultAppConfigSalesChannel updateAppConfigSalesChannel(appId, appConfigSalesChannel)

Update the application sales channel configuration

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
    RestApiResultAppConfigSalesChannel result = apiInstance.updateAppConfigSalesChannel(appId, appConfigSalesChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#updateAppConfigSalesChannel");
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

<a name="uploadImage"></a>
# **uploadImage**
> RestApiResultMobileAppsImage uploadImage(appId, image)

Upload image mobile apps

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
    RestApiResultMobileAppsImage result = apiInstance.uploadImage(appId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#uploadImage");
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

