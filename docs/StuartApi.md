# StuartApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stuartCancelJob**](StuartApi.md#stuartCancelJob) | **DELETE** /api/v1.0/stuart/jobs/{jobId} | 
[**stuartGetJob**](StuartApi.md#stuartGetJob) | **GET** /api/v1.0/stuart/jobs/{jobId} | 
[**stuartGetStuartSettings**](StuartApi.md#stuartGetStuartSettings) | **GET** /api/v1.0/stuart/settings/{storeId} | 
[**stuartPostStuartSettings**](StuartApi.md#stuartPostStuartSettings) | **POST** /api/v1.0/stuart/settings/{storeId} | 


<a name="stuartCancelJob"></a>
# **stuartCancelJob**
> Object stuartCancelJob(jobId, storeId)



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
 **jobId** | **Integer**|  |
 **storeId** | **Integer**|  |

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
 **jobId** | **Integer**|  |
 **storeId** | **Integer**|  |

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
 **storeId** | **Integer**|  |

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
 **storeId** | **Integer**|  |
 **stuartSettings** | [**StuartSettings**](StuartSettings.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

