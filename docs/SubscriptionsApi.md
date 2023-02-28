# SubscriptionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionById**](SubscriptionsApi.md#getSubscriptionById) | **GET** /api/v1.0/{appId}/subscriptions/{subscriptionId} | Get subscription by id
[**getSubscriptionInvoices**](SubscriptionsApi.md#getSubscriptionInvoices) | **GET** /api/v1.0/{appId}/subscriptions/{subscriptionId}/invoices | Get list of invoices for a subscription by id
[**getSubscriptionsForApp**](SubscriptionsApi.md#getSubscriptionsForApp) | **GET** /api/v1.0/{appId}/subscriptions | Get list of subscriptions for an App


<a name="getSubscriptionById"></a>
# **getSubscriptionById**
> RestApiResultSubscription getSubscriptionById(appId, subscriptionId)

Get subscription by id

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id
String subscriptionId = "subscriptionId_example"; // String | Subscription Id
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
 **appId** | **String**| App Id |
 **subscriptionId** | **String**| Subscription Id |

### Return type

[**RestApiResultSubscription**](RestApiResultSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSubscriptionInvoices"></a>
# **getSubscriptionInvoices**
> RestApiPaginationResultInvoice getSubscriptionInvoices(appId, subscriptionId, limit, startingAfterId)

Get list of invoices for a subscription by id

[BETA - this endpoint is under development, do not use it in your production system] Due to the nature of this request, page will always remain as 0.

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
String appId = "appId_example"; // String | App Id
String subscriptionId = "subscriptionId_example"; // String | Subscription Id
Integer limit = 56; // Integer | Limit of invoices to return
String startingAfterId = "startingAfterId_example"; // String | Id for use in pagination. This defines your last known invoice in the list. For instance, if you make a list request and receive 10 invoices, last invoice ends with in_xxx, your subsequent call should include startingAfterId=in_xxx in order to fetch the next page of the invoices list.
try {
    RestApiPaginationResultInvoice result = apiInstance.getSubscriptionInvoices(appId, subscriptionId, limit, startingAfterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **subscriptionId** | **String**| Subscription Id |
 **limit** | **Integer**| Limit of invoices to return | [optional]
 **startingAfterId** | **String**| Id for use in pagination. This defines your last known invoice in the list. For instance, if you make a list request and receive 10 invoices, last invoice ends with in_xxx, your subsequent call should include startingAfterId&#x3D;in_xxx in order to fetch the next page of the invoices list. | [optional]

### Return type

[**RestApiPaginationResultInvoice**](RestApiPaginationResultInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSubscriptionsForApp"></a>
# **getSubscriptionsForApp**
> RestApiArrayResultSubscriptionSummary getSubscriptionsForApp(appId, excludeNotOwnedSubscriptions)

Get list of subscriptions for an App

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id
Boolean excludeNotOwnedSubscriptions = true; // Boolean | Exclude not owned subscriptions. Set to true to only view your subscriptions
try {
    RestApiArrayResultSubscriptionSummary result = apiInstance.getSubscriptionsForApp(appId, excludeNotOwnedSubscriptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscriptionsForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **excludeNotOwnedSubscriptions** | **Boolean**| Exclude not owned subscriptions. Set to true to only view your subscriptions | [optional]

### Return type

[**RestApiArrayResultSubscriptionSummary**](RestApiArrayResultSubscriptionSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

