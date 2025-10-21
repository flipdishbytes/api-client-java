# WhiteLabelBuildsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCheck**](WhiteLabelBuildsApi.md#healthCheck) | **GET** /api/v1.0/whitelabelbuilds/health | 
[**submitAndroidApps**](WhiteLabelBuildsApi.md#submitAndroidApps) | **POST** /api/v1.0/whitelabelbuilds/android/multiple | 
[**submitAndroidBuild**](WhiteLabelBuildsApi.md#submitAndroidBuild) | **POST** /api/v1.0/whitelabelbuilds/{appId}/android | 
[**submitIosApps**](WhiteLabelBuildsApi.md#submitIosApps) | **POST** /api/v1.0/whitelabelbuilds/ios/multiple | 
[**submitIosBuild**](WhiteLabelBuildsApi.md#submitIosBuild) | **POST** /api/v1.0/whitelabelbuilds/{appId}/ios | 


<a name="healthCheck"></a>
# **healthCheck**
> String healthCheck()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelBuildsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelBuildsApi apiInstance = new WhiteLabelBuildsApi();
try {
    String result = apiInstance.healthCheck();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelBuildsApi#healthCheck");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submitAndroidApps"></a>
# **submitAndroidApps**
> RestApiResultBuildResultModel submitAndroidApps(whiteLabelIds, branch, buildType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelBuildsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelBuildsApi apiInstance = new WhiteLabelBuildsApi();
String whiteLabelIds = "whiteLabelIds_example"; // String | 
String branch = "branch_example"; // String | 
String buildType = "buildType_example"; // String | 
try {
    RestApiResultBuildResultModel result = apiInstance.submitAndroidApps(whiteLabelIds, branch, buildType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelBuildsApi#submitAndroidApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whiteLabelIds** | **String**|  |
 **branch** | **String**|  | [optional]
 **buildType** | **String**|  | [optional]

### Return type

[**RestApiResultBuildResultModel**](RestApiResultBuildResultModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submitAndroidBuild"></a>
# **submitAndroidBuild**
> RestApiResultBuildResultModel submitAndroidBuild(appId, branch, lane, buildType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelBuildsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelBuildsApi apiInstance = new WhiteLabelBuildsApi();
String appId = "appId_example"; // String | 
String branch = "branch_example"; // String | 
String lane = "lane_example"; // String | 
String buildType = "buildType_example"; // String | 
try {
    RestApiResultBuildResultModel result = apiInstance.submitAndroidBuild(appId, branch, lane, buildType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelBuildsApi#submitAndroidBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **branch** | **String**|  |
 **lane** | **String**|  |
 **buildType** | **String**|  |

### Return type

[**RestApiResultBuildResultModel**](RestApiResultBuildResultModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submitIosApps"></a>
# **submitIosApps**
> RestApiResultBuildResultModel submitIosApps(whiteLabelIds, branch, buildType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelBuildsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelBuildsApi apiInstance = new WhiteLabelBuildsApi();
String whiteLabelIds = "whiteLabelIds_example"; // String | 
String branch = "branch_example"; // String | 
String buildType = "buildType_example"; // String | 
try {
    RestApiResultBuildResultModel result = apiInstance.submitIosApps(whiteLabelIds, branch, buildType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelBuildsApi#submitIosApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whiteLabelIds** | **String**|  |
 **branch** | **String**|  | [optional]
 **buildType** | **String**|  | [optional]

### Return type

[**RestApiResultBuildResultModel**](RestApiResultBuildResultModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="submitIosBuild"></a>
# **submitIosBuild**
> RestApiResultBuildResultModel submitIosBuild(appId, buildType, branch, submitForReview)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelBuildsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelBuildsApi apiInstance = new WhiteLabelBuildsApi();
String appId = "appId_example"; // String | 
String buildType = "buildType_example"; // String | 
String branch = "branch_example"; // String | 
Boolean submitForReview = true; // Boolean | 
try {
    RestApiResultBuildResultModel result = apiInstance.submitIosBuild(appId, buildType, branch, submitForReview);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelBuildsApi#submitIosBuild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **buildType** | **String**|  |
 **branch** | **String**|  |
 **submitForReview** | **Boolean**|  | [optional]

### Return type

[**RestApiResultBuildResultModel**](RestApiResultBuildResultModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

