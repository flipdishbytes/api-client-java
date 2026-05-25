# StuartApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelJob**](StuartApi.md#cancelJob) | **DELETE** /api/v1.0/stuart/jobs/{jobId} | 
[**getJob**](StuartApi.md#getJob) | **GET** /api/v1.0/stuart/jobs/{jobId} | 
[**getStuartSettings**](StuartApi.md#getStuartSettings) | **GET** /api/v1.0/stuart/settings/{storeId} | 
[**postStuartSettings**](StuartApi.md#postStuartSettings) | **POST** /api/v1.0/stuart/settings/{storeId} | 


<a name="cancelJob"></a>
# **cancelJob**
> cancelJob(jobId, storeId)



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
Integer jobId = 56; // Integer | 
Integer storeId = 56; // Integer | 
try {
    apiInstance.cancelJob(jobId, storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#cancelJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |
 **storeId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getJob"></a>
# **getJob**
> RestApiResultJobResponse getJob(jobId, storeId)



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
Integer jobId = 56; // Integer | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultJobResponse result = apiInstance.getJob(jobId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#getJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Integer**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultJobResponse**](RestApiResultJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStuartSettings"></a>
# **getStuartSettings**
> RestApiResultStuartSettings getStuartSettings(storeId)



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
Integer storeId = 56; // Integer | 
try {
    RestApiResultStuartSettings result = apiInstance.getStuartSettings(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#getStuartSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultStuartSettings**](RestApiResultStuartSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="postStuartSettings"></a>
# **postStuartSettings**
> Object postStuartSettings(storeId, stuartSettings)



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
Integer storeId = 56; // Integer | 
StuartSettings stuartSettings = new StuartSettings(); // StuartSettings | 
try {
    Object result = apiInstance.postStuartSettings(storeId, stuartSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StuartApi#postStuartSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **stuartSettings** | [**StuartSettings**](StuartSettings.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

