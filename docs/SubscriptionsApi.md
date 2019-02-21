# SubscriptionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriptionsCancelSubscription**](SubscriptionsApi.md#subscriptionsCancelSubscription) | **DELETE** /api/v1.0/subscriptions/{subscriptionId} | Cancel the subscription
[**subscriptionsGetCard**](SubscriptionsApi.md#subscriptionsGetCard) | **GET** /api/v1.0/subscriptions/{subscriptionId}/card | Get the card linked to the subscription
[**subscriptionsGetPlansByCurrency**](SubscriptionsApi.md#subscriptionsGetPlansByCurrency) | **GET** /api/v1.0/subscriptions/plans | Get avaialble plans for currency&#39;s user
[**subscriptionsGetSubscription**](SubscriptionsApi.md#subscriptionsGetSubscription) | **GET** /api/v1.0/subscriptions/{subscriptionId} | Get the subscription including the payment history
[**subscriptionsGetUserSubscriptionByAppId**](SubscriptionsApi.md#subscriptionsGetUserSubscriptionByAppId) | **GET** /api/v1.0/subscriptions | Get subscription by appId
[**subscriptionsReplaceOldCardWithNewCard**](SubscriptionsApi.md#subscriptionsReplaceOldCardWithNewCard) | **POST** /api/v1.0/subscriptions/{subscriptionId}/card/new | Add a new card and replace the old one
[**subscriptionsSubscribe**](SubscriptionsApi.md#subscriptionsSubscribe) | **POST** /api/v1.0/subscriptions | Create a new subscription
[**subscriptionsUpdateCardExpiringDate**](SubscriptionsApi.md#subscriptionsUpdateCardExpiringDate) | **POST** /api/v1.0/subscriptions/{subscriptionId}/card | Update card expiring date
[**subscriptionsUpdateSubscription**](SubscriptionsApi.md#subscriptionsUpdateSubscription) | **POST** /api/v1.0/subscriptions/{subscriptionId} | Update the subscription


<a name="subscriptionsCancelSubscription"></a>
# **subscriptionsCancelSubscription**
> Object subscriptionsCancelSubscription(subscriptionId)

Cancel the subscription

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
Integer subscriptionId = 56; // Integer | Subscription identifier
try {
    Object result = apiInstance.subscriptionsCancelSubscription(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsCancelSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription identifier |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsGetCard"></a>
# **subscriptionsGetCard**
> RestApiResultCard subscriptionsGetCard(subscriptionId)

Get the card linked to the subscription

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
Integer subscriptionId = 56; // Integer | Subscription identifier
try {
    RestApiResultCard result = apiInstance.subscriptionsGetCard(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription identifier |

### Return type

[**RestApiResultCard**](RestApiResultCard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsGetPlansByCurrency"></a>
# **subscriptionsGetPlansByCurrency**
> RestApiResultSubscriptionPlansResponse subscriptionsGetPlansByCurrency()

Get avaialble plans for currency&#39;s user

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
try {
    RestApiResultSubscriptionPlansResponse result = apiInstance.subscriptionsGetPlansByCurrency();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetPlansByCurrency");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultSubscriptionPlansResponse**](RestApiResultSubscriptionPlansResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsGetSubscription"></a>
# **subscriptionsGetSubscription**
> RestApiResultSubscription subscriptionsGetSubscription(subscriptionId)

Get the subscription including the payment history

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
Integer subscriptionId = 56; // Integer | Subscription Identifier
try {
    RestApiResultSubscription result = apiInstance.subscriptionsGetSubscription(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription Identifier |

### Return type

[**RestApiResultSubscription**](RestApiResultSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsGetUserSubscriptionByAppId"></a>
# **subscriptionsGetUserSubscriptionByAppId**
> RestApiResultSubscription subscriptionsGetUserSubscriptionByAppId(appId)

Get subscription by appId

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
String appId = "appId_example"; // String | The string app identifier
try {
    RestApiResultSubscription result = apiInstance.subscriptionsGetUserSubscriptionByAppId(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetUserSubscriptionByAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The string app identifier |

### Return type

[**RestApiResultSubscription**](RestApiResultSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsReplaceOldCardWithNewCard"></a>
# **subscriptionsReplaceOldCardWithNewCard**
> Object subscriptionsReplaceOldCardWithNewCard(subscriptionId, card)

Add a new card and replace the old one

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
Integer subscriptionId = 56; // Integer | Subscription identifier
CardWithToken card = new CardWithToken(); // CardWithToken | Token Id
try {
    Object result = apiInstance.subscriptionsReplaceOldCardWithNewCard(subscriptionId, card);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsReplaceOldCardWithNewCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription identifier |
 **card** | [**CardWithToken**](CardWithToken.md)| Token Id |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsSubscribe"></a>
# **subscriptionsSubscribe**
> Object subscriptionsSubscribe(subscription)

Create a new subscription

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
SubscriptionWithToken subscription = new SubscriptionWithToken(); // SubscriptionWithToken | Data necessary to create a new subscription
try {
    Object result = apiInstance.subscriptionsSubscribe(subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsSubscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription** | [**SubscriptionWithToken**](SubscriptionWithToken.md)| Data necessary to create a new subscription |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsUpdateCardExpiringDate"></a>
# **subscriptionsUpdateCardExpiringDate**
> RestApiResultCard subscriptionsUpdateCardExpiringDate(subscriptionId, card)

Update card expiring date

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
Integer subscriptionId = 56; // Integer | Subscription identifier
CardBase card = new CardBase(); // CardBase | Data to update card expiring date
try {
    RestApiResultCard result = apiInstance.subscriptionsUpdateCardExpiringDate(subscriptionId, card);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdateCardExpiringDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription identifier |
 **card** | [**CardBase**](CardBase.md)| Data to update card expiring date |

### Return type

[**RestApiResultCard**](RestApiResultCard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="subscriptionsUpdateSubscription"></a>
# **subscriptionsUpdateSubscription**
> Object subscriptionsUpdateSubscription(subscriptionId, subscription)

Update the subscription

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
Integer subscriptionId = 56; // Integer | Subscription identifier
SubscriptionBase subscription = new SubscriptionBase(); // SubscriptionBase | Data to update the subscription
try {
    Object result = apiInstance.subscriptionsUpdateSubscription(subscriptionId, subscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Integer**| Subscription identifier |
 **subscription** | [**SubscriptionBase**](SubscriptionBase.md)| Data to update the subscription |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

