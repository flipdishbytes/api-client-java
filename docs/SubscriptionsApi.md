# SubscriptionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionById**](SubscriptionsApi.md#getSubscriptionById) | **GET** /api/v1.0/{appId}/subscriptions/{subscriptionId} | 
[**getSubscriptionsForApp**](SubscriptionsApi.md#getSubscriptionsForApp) | **GET** /api/v1.0/{appId}/subscriptions | 


<a name="getSubscriptionById"></a>
# **getSubscriptionById**
> RestApiResultSubscription getSubscriptionById(appId, subscriptionId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String appId = "appId_example"; // String | 
String subscriptionId = "subscriptionId_example"; // String | 
try {
    RestApiResultSubscription result = apiInstance.getSubscriptionById(appId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **subscriptionId** | **String**|  |

### Return type

[**RestApiResultSubscription**](RestApiResultSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSubscriptionsForApp"></a>
# **getSubscriptionsForApp**
> RestApiArrayResultSubscriptionSummary getSubscriptionsForApp(appId, excludeNotOwnedSubscriptions, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String appId = "appId_example"; // String | 
Boolean excludeNotOwnedSubscriptions = true; // Boolean | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
try {
    RestApiArrayResultSubscriptionSummary result = apiInstance.getSubscriptionsForApp(appId, excludeNotOwnedSubscriptions, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionsForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **excludeNotOwnedSubscriptions** | **Boolean**|  | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiArrayResultSubscriptionSummary**](RestApiArrayResultSubscriptionSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

