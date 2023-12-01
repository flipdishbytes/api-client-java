# AppStoreSubscriptionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppStoreSubscription**](AppStoreSubscriptionsApi.md#createAppStoreSubscription) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions | 
[**deleteAppSubscription**](AppStoreSubscriptionsApi.md#deleteAppSubscription) | **DELETE** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions/{subscriptionId} | 
[**updateAppStoreSubscription**](AppStoreSubscriptionsApi.md#updateAppStoreSubscription) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/subscriptions/{subscriptionId} | 


<a name="createAppStoreSubscription"></a>
# **createAppStoreSubscription**
> RestApiResultAppStoreSubscriptionJobResponse createAppStoreSubscription(appId, appStoreAppId, addAppStoreSubscriptionRequest)



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
    RestApiResultAppStoreSubscriptionJobResponse result = apiInstance.createAppStoreSubscription(appId, appStoreAppId, addAppStoreSubscriptionRequest);
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
> RestApiStringResult deleteAppSubscription(appId, appStoreAppId, subscriptionId)



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
    RestApiStringResult result = apiInstance.deleteAppSubscription(appId, appStoreAppId, subscriptionId);
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

[**RestApiStringResult**](RestApiStringResult.md)

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

