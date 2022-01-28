# StuartApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stuartCancelJob**](StuartApi.md#stuartCancelJob) | **DELETE** /api/v1.0/stuart/jobs/{jobId} | Cancel a stuart job
[**stuartGetJob**](StuartApi.md#stuartGetJob) | **GET** /api/v1.0/stuart/jobs/{jobId} | Get start job details
[**stuartGetStuartSettings**](StuartApi.md#stuartGetStuartSettings) | **GET** /api/v1.0/stuart/settings/{storeId} | Get stuart settings for a store
[**stuartPostStuartSettings**](StuartApi.md#stuartPostStuartSettings) | **POST** /api/v1.0/stuart/settings/{storeId} | Set stuart settings for a store


<a name="stuartCancelJob"></a>
# **stuartCancelJob**
> Object stuartCancelJob(jobId, storeId)

Cancel a stuart job

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StuartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StuartApi apiInstance = new StuartApi();
Integer jobId = 56; // Integer | Stuart job identifier
Integer storeId = 56; // Integer | Store identifier
try {
    Object result = apiInstance.stuartCancelJob(jobId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#stuartCancelJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Stuart job identifier |
 **storeId** | **Integer**| Store identifier |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stuartGetJob"></a>
# **stuartGetJob**
> RestApiResultJobResponse stuartGetJob(jobId, storeId)

Get start job details

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StuartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StuartApi apiInstance = new StuartApi();
Integer jobId = 56; // Integer | Stuart job identifier
Integer storeId = 56; // Integer | Store identifier
try {
    RestApiResultJobResponse result = apiInstance.stuartGetJob(jobId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#stuartGetJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**| Stuart job identifier |
 **storeId** | **Integer**| Store identifier |

### Return type

[**RestApiResultJobResponse**](RestApiResultJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stuartGetStuartSettings"></a>
# **stuartGetStuartSettings**
> RestApiResultStuartSettings stuartGetStuartSettings(storeId)

Get stuart settings for a store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StuartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StuartApi apiInstance = new StuartApi();
Integer storeId = 56; // Integer | Store Identifier
try {
    RestApiResultStuartSettings result = apiInstance.stuartGetStuartSettings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#stuartGetStuartSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store Identifier |

### Return type

[**RestApiResultStuartSettings**](RestApiResultStuartSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stuartPostStuartSettings"></a>
# **stuartPostStuartSettings**
> Object stuartPostStuartSettings(storeId, stuartSettings)

Set stuart settings for a store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StuartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StuartApi apiInstance = new StuartApi();
Integer storeId = 56; // Integer | Store Identifier
StuartSettings stuartSettings = new StuartSettings(); // StuartSettings | Stuart settings model
try {
    Object result = apiInstance.stuartPostStuartSettings(storeId, stuartSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#stuartPostStuartSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store Identifier |
 **stuartSettings** | [**StuartSettings**](StuartSettings.md)| Stuart settings model |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

