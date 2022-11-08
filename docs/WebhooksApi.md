# WebhooksApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookSubscription**](WebhooksApi.md#createWebhookSubscription) | **POST** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions | Create a webhook subscription for you Oauth App
[**createWebhookSubscriptionEventNames**](WebhooksApi.md#createWebhookSubscriptionEventNames) | **POST** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | Add event name to your webhook subscription
[**deleteWebhookSubscription**](WebhooksApi.md#deleteWebhookSubscription) | **DELETE** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId} | Delete you webhook subscription
[**deleteWebhookSubscriptionEventName**](WebhooksApi.md#deleteWebhookSubscriptionEventName) | **DELETE** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | Remove event name to your webhook subscription
[**getWebhookEventNames**](WebhooksApi.md#getWebhookEventNames) | **GET** /api/v1.0/{appId}/webhooks/events | Get all webhook subscription event names
[**getWebhookEventNamesBySubscriptionId**](WebhooksApi.md#getWebhookEventNamesBySubscriptionId) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events | Get your webhook subscriptions selected event names
[**getWebhookEventSample**](WebhooksApi.md#getWebhookEventSample) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName}/test | Get a sample event from a webhook subscription
[**getWebhookLogs**](WebhooksApi.md#getWebhookLogs) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/logs | Get logs for your webhook subscription
[**getWebhookSubscriptions**](WebhooksApi.md#getWebhookSubscriptions) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions | Get all webhook subscriptions by your Oauth App id
[**updateWebhookSubscription**](WebhooksApi.md#updateWebhookSubscription) | **PUT** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId} | Update a webhook subscription object


<a name="createWebhookSubscription"></a>
# **createWebhookSubscription**
> RestApiIntegerResult createWebhookSubscription(oauthAppId, webhookSubscription, appId)

Create a webhook subscription for you Oauth App

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | Webhook subscription object
String appId = "appId_example"; // String | 
try {
    RestApiIntegerResult result = apiInstance.createWebhookSubscription(oauthAppId, webhookSubscription, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)| Webhook subscription object |
 **appId** | **String**|  |

### Return type

[**RestApiIntegerResult**](RestApiIntegerResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createWebhookSubscriptionEventNames"></a>
# **createWebhookSubscriptionEventNames**
> createWebhookSubscriptionEventNames(oauthAppId, webhookSubscriptionId, eventName, appId)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String eventName = "eventName_example"; // String | Webhook subscription event name
String appId = "appId_example"; // String | 
try {
    apiInstance.createWebhookSubscriptionEventNames(oauthAppId, webhookSubscriptionId, eventName, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhookSubscriptionEventNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **eventName** | **String**| Webhook subscription event name |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteWebhookSubscription"></a>
# **deleteWebhookSubscription**
> deleteWebhookSubscription(oauthAppId, webhookSubscriptionId, appId)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String appId = "appId_example"; // String | 
try {
    apiInstance.deleteWebhookSubscription(oauthAppId, webhookSubscriptionId, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteWebhookSubscriptionEventName"></a>
# **deleteWebhookSubscriptionEventName**
> deleteWebhookSubscriptionEventName(oauthAppId, webhookSubscriptionId, eventName, appId)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String eventName = "eventName_example"; // String | Webhook subscription event name
String appId = "appId_example"; // String | 
try {
    apiInstance.deleteWebhookSubscriptionEventName(oauthAppId, webhookSubscriptionId, eventName, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhookSubscriptionEventName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **eventName** | **String**| Webhook subscription event name |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookEventNames"></a>
# **getWebhookEventNames**
> RestApiStringArrayResult getWebhookEventNames(appId)

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
String appId = "appId_example"; // String | 
try {
    RestApiStringArrayResult result = apiInstance.getWebhookEventNames(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookEventNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookEventNamesBySubscriptionId"></a>
# **getWebhookEventNamesBySubscriptionId**
> RestApiStringArrayResult getWebhookEventNamesBySubscriptionId(oauthAppId, webhookSubscriptionId, appId)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
String appId = "appId_example"; // String | 
try {
    RestApiStringArrayResult result = apiInstance.getWebhookEventNamesBySubscriptionId(oauthAppId, webhookSubscriptionId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookEventNamesBySubscriptionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **appId** | **String**|  |

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookEventSample"></a>
# **getWebhookEventSample**
> WebhookEventSample getWebhookEventSample(eventName, appId, oauthAppId, webhookSubscriptionId, version)

Get a sample event from a webhook subscription

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
String eventName = "eventName_example"; // String | 
String appId = "appId_example"; // String | 
String oauthAppId = "oauthAppId_example"; // String | 
String webhookSubscriptionId = "webhookSubscriptionId_example"; // String | 
String version = "version_example"; // String | 
try {
    WebhookEventSample result = apiInstance.getWebhookEventSample(eventName, appId, oauthAppId, webhookSubscriptionId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookEventSample");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**|  |
 **appId** | **String**|  |
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **String**|  |
 **version** | **String**|  | [optional]

### Return type

[**WebhookEventSample**](WebhookEventSample.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> RestApiPaginationResultWebhookLog getWebhookLogs(oauthAppId, webhookSubscriptionId, start, end, appId, page, limit)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start time
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End time
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | Page number
Integer limit = 56; // Integer | Page size
try {
    RestApiPaginationResultWebhookLog result = apiInstance.getWebhookLogs(oauthAppId, webhookSubscriptionId, start, end, appId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **start** | **OffsetDateTime**| Start time |
 **end** | **OffsetDateTime**| End time |
 **appId** | **String**|  |
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
> RestApiPaginationResultWebhookSubscription getWebhookSubscriptions(oauthAppId, appId, page, limit)

Get all webhook subscriptions by your Oauth App id

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultWebhookSubscription result = apiInstance.getWebhookSubscriptions(oauthAppId, appId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **appId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultWebhookSubscription**](RestApiPaginationResultWebhookSubscription.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateWebhookSubscription"></a>
# **updateWebhookSubscription**
> updateWebhookSubscription(oauthAppId, webhookSubscriptionId, webhookSubscription, appId)

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
String oauthAppId = "oauthAppId_example"; // String | Oauth App identifier
Integer webhookSubscriptionId = 56; // Integer | Webhook subscription identifier
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | Webhook subscription object
String appId = "appId_example"; // String | 
try {
    apiInstance.updateWebhookSubscription(oauthAppId, webhookSubscriptionId, webhookSubscription, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhookSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Oauth App identifier |
 **webhookSubscriptionId** | **Integer**| Webhook subscription identifier |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)| Webhook subscription object |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

