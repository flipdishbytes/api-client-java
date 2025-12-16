# MobileAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppConfigSalesChannel**](MobileAppsApi.md#getAppConfigSalesChannel) | **GET** /api/v1.0/mobileapps/{appId}/saleschannel/details | 
[**getStatistics**](MobileAppsApi.md#getStatistics) | **GET** /api/v1.0/mobileapps/{appId}/statistics | 
[**getSubmissionDetails**](MobileAppsApi.md#getSubmissionDetails) | **GET** /api/v1.0/mobileapps/{appId}/submission/details | 
[**getSubmissionStatus**](MobileAppsApi.md#getSubmissionStatus) | **GET** /api/v1.0/mobileapps/{appId}/submission/{submissionId}/status | 
[**publish**](MobileAppsApi.md#publish) | **POST** /api/v1.0/mobileapps/{appId}/submission/{submissionId}/publish | 
[**resubmission**](MobileAppsApi.md#resubmission) | **POST** /api/v1.0/mobileapps/{appId}/resubmission | 
[**submission**](MobileAppsApi.md#submission) | **POST** /api/v1.0/mobileapps/{appId}/submission | 
[**unpublish**](MobileAppsApi.md#unpublish) | **POST** /api/v1.0/mobileapps/{appId}/submission/{submissionId}/unpublish | 
[**updateAppConfigSalesChannel**](MobileAppsApi.md#updateAppConfigSalesChannel) | **POST** /api/v1.0/mobileapps/{appId}/saleschannel | 
[**updateSubmissionStatus**](MobileAppsApi.md#updateSubmissionStatus) | **POST** /api/v1.0/mobileapps/{appId}/submission/{submissionId}/status | 
[**uploadImage**](MobileAppsApi.md#uploadImage) | **POST** /api/v1.0/mobileapps/{appId}/submission/image | 


<a name="getAppConfigSalesChannel"></a>
# **getAppConfigSalesChannel**
> RestApiResultAppConfigSalesChannel getAppConfigSalesChannel(appId)



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
    RestApiResultAppConfigSalesChannel result = apiInstance.getAppConfigSalesChannel(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#getAppConfigSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultAppConfigSalesChannel**](RestApiResultAppConfigSalesChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStatistics"></a>
# **getStatistics**
> RestApiArrayResultMobileAppsStatistics getStatistics(appId, platformTypes)



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
 **platformTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: None, Android, IOS]

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
> RestApiResultMobileAppsSubmissionStatus getSubmissionStatus(appId, submissionId)



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
Integer submissionId = 56; // Integer | 
try {
    RestApiResultMobileAppsSubmissionStatus result = apiInstance.getSubmissionStatus(appId, submissionId);
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
 **submissionId** | **Integer**|  |

### Return type

[**RestApiResultMobileAppsSubmissionStatus**](RestApiResultMobileAppsSubmissionStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="publish"></a>
# **publish**
> RestApiResultRestApiIntegerResult publish(appId, submissionId, platformType)



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
Integer submissionId = 56; // Integer | 
String platformType = "platformType_example"; // String | 
try {
    RestApiResultRestApiIntegerResult result = apiInstance.publish(appId, submissionId, platformType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#publish");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **submissionId** | **Integer**|  |
 **platformType** | **String**|  | [optional] [enum: None, Android, IOS]

### Return type

[**RestApiResultRestApiIntegerResult**](RestApiResultRestApiIntegerResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="resubmission"></a>
# **resubmission**
> RestApiResultMobileAppsSubmission resubmission(appId, mobileAppsSubmission)



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
    RestApiResultMobileAppsSubmission result = apiInstance.resubmission(appId, mobileAppsSubmission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#resubmission");
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

<a name="submission"></a>
# **submission**
> RestApiResultMobileAppsSubmission submission(appId, mobileAppsSubmission)



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

<a name="unpublish"></a>
# **unpublish**
> RestApiIntegerResult unpublish(appId, submissionId, platformType)



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
Integer submissionId = 56; // Integer | 
String platformType = "platformType_example"; // String | 
try {
    RestApiIntegerResult result = apiInstance.unpublish(appId, submissionId, platformType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#unpublish");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **submissionId** | **Integer**|  |
 **platformType** | **String**|  | [optional] [enum: None, Android, IOS]

### Return type

[**RestApiIntegerResult**](RestApiIntegerResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppConfigSalesChannel"></a>
# **updateAppConfigSalesChannel**
> RestApiResultAppConfigSalesChannel updateAppConfigSalesChannel(appId, appConfigSalesChannel)



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

<a name="updateSubmissionStatus"></a>
# **updateSubmissionStatus**
> RestApiResultUpdateMobileAppsSubmissionStatus updateSubmissionStatus(appId, submissionId, updateSubmissionStatus)



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
Integer submissionId = 56; // Integer | 
UpdateMobileAppsSubmissionStatus updateSubmissionStatus = new UpdateMobileAppsSubmissionStatus(); // UpdateMobileAppsSubmissionStatus | 
try {
    RestApiResultUpdateMobileAppsSubmissionStatus result = apiInstance.updateSubmissionStatus(appId, submissionId, updateSubmissionStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#updateSubmissionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **submissionId** | **Integer**|  |
 **updateSubmissionStatus** | [**UpdateMobileAppsSubmissionStatus**](UpdateMobileAppsSubmissionStatus.md)|  |

### Return type

[**RestApiResultUpdateMobileAppsSubmissionStatus**](RestApiResultUpdateMobileAppsSubmissionStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadImage"></a>
# **uploadImage**
> RestApiResultMobileAppsImage uploadImage(appId, image)



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

