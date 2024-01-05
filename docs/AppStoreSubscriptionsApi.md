# AppStoreSubscriptionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppStoreSubscription**](AppStoreSubscriptionsApi.md#createAppStoreSubscription) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions | 
[**createAppStoreSubscription_0**](AppStoreSubscriptionsApi.md#createAppStoreSubscription_0) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions | 
[**deleteAppSubscription**](AppStoreSubscriptionsApi.md#deleteAppSubscription) | **DELETE** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions/{subscriptionId} | 
[**getAppStoreSubscriptionChangeJobStatus**](AppStoreSubscriptionsApi.md#getAppStoreSubscriptionChangeJobStatus) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions/jobs/{jobId} | 
[**updateAppStoreSubscription**](AppStoreSubscriptionsApi.md#updateAppStoreSubscription) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions/{subscriptionId} | 


<a name="createAppStoreSubscription"></a>
# **createAppStoreSubscription**
> RestApiArrayResultAppStoreSubscriptionItem createAppStoreSubscription(appId, appStoreAppId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreSubscriptionsApi apiInstance = new AppStoreSubscriptionsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
try {
    RestApiArrayResultAppStoreSubscriptionItem result = apiInstance.createAppStoreSubscription(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreSubscriptionsApi#createAppStoreSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiArrayResultAppStoreSubscriptionItem**](RestApiArrayResultAppStoreSubscriptionItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAppStoreSubscription_0"></a>
# **createAppStoreSubscription_0**
> RestApiResultAppStoreSubscriptionJobResponse createAppStoreSubscription_0(appId, appStoreAppId, addAppStoreSubscriptionRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreSubscriptionsApi apiInstance = new AppStoreSubscriptionsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
AddAppStoreSubscriptionRequest addAppStoreSubscriptionRequest = new AddAppStoreSubscriptionRequest(); // AddAppStoreSubscriptionRequest | 
try {
    RestApiResultAppStoreSubscriptionJobResponse result = apiInstance.createAppStoreSubscription_0(appId, appStoreAppId, addAppStoreSubscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreSubscriptionsApi#createAppStoreSubscription_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **addAppStoreSubscriptionRequest** | [**AddAppStoreSubscriptionRequest**](AddAppStoreSubscriptionRequest.md)|  |

### Return type

[**RestApiResultAppStoreSubscriptionJobResponse**](RestApiResultAppStoreSubscriptionJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppSubscription"></a>
# **deleteAppSubscription**
> RestApiResultAppStoreSubscriptionJobResponse deleteAppSubscription(appId, appStoreAppId, subscriptionId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreSubscriptionsApi apiInstance = new AppStoreSubscriptionsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
String subscriptionId = "subscriptionId_example"; // String | 
try {
    RestApiResultAppStoreSubscriptionJobResponse result = apiInstance.deleteAppSubscription(appId, appStoreAppId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreSubscriptionsApi#deleteAppSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **subscriptionId** | **String**|  |

### Return type

[**RestApiResultAppStoreSubscriptionJobResponse**](RestApiResultAppStoreSubscriptionJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreSubscriptionChangeJobStatus"></a>
# **getAppStoreSubscriptionChangeJobStatus**
> RestApiResultAppStoreSubscriptionChangeJobStatusResponse getAppStoreSubscriptionChangeJobStatus(appId, appStoreAppId, jobId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreSubscriptionsApi apiInstance = new AppStoreSubscriptionsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
String jobId = "jobId_example"; // String | 
try {
    RestApiResultAppStoreSubscriptionChangeJobStatusResponse result = apiInstance.getAppStoreSubscriptionChangeJobStatus(appId, appStoreAppId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreSubscriptionsApi#getAppStoreSubscriptionChangeJobStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **jobId** | **String**|  |

### Return type

[**RestApiResultAppStoreSubscriptionChangeJobStatusResponse**](RestApiResultAppStoreSubscriptionChangeJobStatusResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreSubscription"></a>
# **updateAppStoreSubscription**
> RestApiResultAppStoreSubscriptionJobResponse updateAppStoreSubscription(appId, appStoreAppId, subscriptionId, updateAppStoreSubscriptionRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreSubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreSubscriptionsApi apiInstance = new AppStoreSubscriptionsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
String subscriptionId = "subscriptionId_example"; // String | 
UpdateAppStoreSubscriptionRequest updateAppStoreSubscriptionRequest = new UpdateAppStoreSubscriptionRequest(); // UpdateAppStoreSubscriptionRequest | 
try {
    RestApiResultAppStoreSubscriptionJobResponse result = apiInstance.updateAppStoreSubscription(appId, appStoreAppId, subscriptionId, updateAppStoreSubscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreSubscriptionsApi#updateAppStoreSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **subscriptionId** | **String**|  |
 **updateAppStoreSubscriptionRequest** | [**UpdateAppStoreSubscriptionRequest**](UpdateAppStoreSubscriptionRequest.md)|  |

### Return type

[**RestApiResultAppStoreSubscriptionJobResponse**](RestApiResultAppStoreSubscriptionJobResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

