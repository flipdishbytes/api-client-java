# WebhooksApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**craeteWebhookSubscription**](WebhooksApi.md#craeteWebhookSubscription) | **POST** /api/v1.0/webhooks/{clientId}/subscriptions | Create a webhook subscription for you Oauth client
[**createWebhookSubscriptionEventNames**](WebhooksApi.md#createWebhookSubscriptionEventNames) | **POST** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | Add event name to your webhook subscription
[**deleteWebhookSubscription**](WebhooksApi.md#deleteWebhookSubscription) | **DELETE** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId} | Delete you webhook subscription
[**deleteWebhookSubscriptionEventName**](WebhooksApi.md#deleteWebhookSubscriptionEventName) | **DELETE** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | Remove event name to your webhook subscription
[**getWebhookEventNames**](WebhooksApi.md#getWebhookEventNames) | **GET** /api/v1.0/webhooks/events | Get all webhook subscription event names
[**getWebhookEventNamesBySubscriptionId**](WebhooksApi.md#getWebhookEventNamesBySubscriptionId) | **GET** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId}/events | Get your webhook subscriptions selected event names
[**getWebhookLogs**](WebhooksApi.md#getWebhookLogs) | **GET** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId}/logs | Get logs for your webhook subscription
[**getWebhookSubscriptions**](WebhooksApi.md#getWebhookSubscriptions) | **GET** /api/v1.0/webhooks/{clientId}/subscriptions | Get all webhook subscriptions by your Oauth client id
[**updateWebhookSubscription**](WebhooksApi.md#updateWebhookSubscription) | **PUT** /api/v1.0/webhooks/{clientId}/subscriptions/{webhookSubscriptionId} | Update a webhook subscription object


<a name="craeteWebhookSubscription"></a>
# **craeteWebhookSubscription**
> RestApiIntegerResult craeteWebhookSubscription(clientId, webhookSubscription)

Create a webhook subscription for you Oauth client

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | Webhook subscription object
try {
    RestApiIntegerResult result = apiInstance.craeteWebhookSubscription(clientId, webhookSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#craeteWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)| Webhook subscription object |

### Return type

[**RestApiIntegerResult**](RestApiIntegerResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createWebhookSubscriptionEventNames"></a>
# **createWebhookSubscriptionEventNames**
> createWebhookSubscriptionEventNames(clientId, webhookSubscriptionId, eventName)

Add event name to your webhook subscription

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String eventName = "eventName_example"; // String | Webhook subscription event name
try {
    apiInstance.createWebhookSubscriptionEventNames(clientId, webhookSubscriptionId, eventName);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhookSubscriptionEventNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **eventName** | **String**| Webhook subscription event name |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteWebhookSubscription"></a>
# **deleteWebhookSubscription**
> deleteWebhookSubscription(clientId, webhookSubscriptionId)

Delete you webhook subscription

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
try {
    apiInstance.deleteWebhookSubscription(clientId, webhookSubscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteWebhookSubscriptionEventName"></a>
# **deleteWebhookSubscriptionEventName**
> deleteWebhookSubscriptionEventName(clientId, webhookSubscriptionId, eventName)

Remove event name to your webhook subscription

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String eventName = "eventName_example"; // String | Webhook subscription event name
try {
    apiInstance.deleteWebhookSubscriptionEventName(clientId, webhookSubscriptionId, eventName);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhookSubscriptionEventName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **eventName** | **String**| Webhook subscription event name |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookEventNames"></a>
# **getWebhookEventNames**
> RestApiStringArrayResult getWebhookEventNames()

Get all webhook subscription event names

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
try {
    RestApiStringArrayResult result = apiInstance.getWebhookEventNames();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookEventNames");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookEventNamesBySubscriptionId"></a>
# **getWebhookEventNamesBySubscriptionId**
> RestApiStringArrayResult getWebhookEventNamesBySubscriptionId(clientId, webhookSubscriptionId)

Get your webhook subscriptions selected event names

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
try {
    RestApiStringArrayResult result = apiInstance.getWebhookEventNamesBySubscriptionId(clientId, webhookSubscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookEventNamesBySubscriptionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> RestApiPaginationResultWebhookLog getWebhookLogs(clientId, webhookSubscriptionId, start, end, page, limit)

Get logs for your webhook subscription

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start time
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End time
Integer page = 56; // Integer | Page number
Integer limit = 56; // Integer | Page size
try {
    RestApiPaginationResultWebhookLog result = apiInstance.getWebhookLogs(clientId, webhookSubscriptionId, start, end, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **start** | **OffsetDateTime**| Start time |
 **end** | **OffsetDateTime**| End time |
 **page** | **Integer**| Page number | [optional]
 **limit** | **Integer**| Page size | [optional]

### Return type

[**RestApiPaginationResultWebhookLog**](RestApiPaginationResultWebhookLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookSubscriptions"></a>
# **getWebhookSubscriptions**
> RestApiArrayResultWebhookSubscription getWebhookSubscriptions(clientId)

Get all webhook subscriptions by your Oauth client id

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
try {
    RestApiArrayResultWebhookSubscription result = apiInstance.getWebhookSubscriptions(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |

### Return type

[**RestApiArrayResultWebhookSubscription**](RestApiArrayResultWebhookSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateWebhookSubscription"></a>
# **updateWebhookSubscription**
> updateWebhookSubscription(clientId, webhookSubscriptionId, webhookSubscription)

Update a webhook subscription object

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebhooksApi apiInstance = new WebhooksApi();
String clientId = "clientId_example"; // String | Oauth client identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | Webhook subscription object
try {
    apiInstance.updateWebhookSubscription(clientId, webhookSubscriptionId, webhookSubscription);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Oauth client identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)| Webhook subscription object |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

