# WebhooksApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookSubscription**](WebhooksApi.md#createWebhookSubscription) | **POST** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions | 
[**createWebhookSubscriptionEventNames**](WebhooksApi.md#createWebhookSubscriptionEventNames) | **POST** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | 
[**deleteWebhookSubscription**](WebhooksApi.md#deleteWebhookSubscription) | **DELETE** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId} | 
[**deleteWebhookSubscriptionEventName**](WebhooksApi.md#deleteWebhookSubscriptionEventName) | **DELETE** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName} | 
[**getWebhookEventNames**](WebhooksApi.md#getWebhookEventNames) | **GET** /api/v1.0/{appId}/webhooks/events | 
[**getWebhookEventNamesBySubscriptionId**](WebhooksApi.md#getWebhookEventNamesBySubscriptionId) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events | 
[**getWebhookEventSample**](WebhooksApi.md#getWebhookEventSample) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/events/{eventName}/test | 
[**getWebhookLogs**](WebhooksApi.md#getWebhookLogs) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId}/logs | 
[**getWebhookSubscriptions**](WebhooksApi.md#getWebhookSubscriptions) | **GET** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions | 
[**updateWebhookSubscription**](WebhooksApi.md#updateWebhookSubscription) | **PUT** /api/v1.0/{appId}/webhooks/{oauthAppId}/subscriptions/{webhookSubscriptionId} | 


<a name="createWebhookSubscription"></a>
# **createWebhookSubscription**
> RestApiIntegerResult createWebhookSubscription(oauthAppId, webhookSubscription, appId)



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
String oauthAppId = "oauthAppId_example"; // String | 
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
String eventName = "eventName_example"; // String | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
 **eventName** | **String**|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
String eventName = "eventName_example"; // String | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
 **eventName** | **String**|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | 
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
 **start** | **OffsetDateTime**|  |
 **end** | **OffsetDateTime**|  |
 **appId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

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
String oauthAppId = "oauthAppId_example"; // String | 
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
 **oauthAppId** | **String**|  |
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
String oauthAppId = "oauthAppId_example"; // String | 
Integer webhookSubscriptionId = 56; // Integer | 
WebhookSubscription webhookSubscription = new WebhookSubscription(); // WebhookSubscription | 
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
 **oauthAppId** | **String**|  |
 **webhookSubscriptionId** | **Integer**|  |
 **webhookSubscription** | [**WebhookSubscription**](WebhookSubscription.md)|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

