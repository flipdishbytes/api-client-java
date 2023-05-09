# OAuthClientsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRedirectUri**](OAuthClientsApi.md#addRedirectUri) | **POST** /api/v1.0/{appId}/oauthclients/{oauthAppId}/redirecturis | 
[**createOAuthApp**](OAuthClientsApi.md#createOAuthApp) | **POST** /api/v1.0/{appId}/oauthclients | 
[**deleteOAuthApp**](OAuthClientsApi.md#deleteOAuthApp) | **DELETE** /api/v1.0/{appId}/oauthclients/{oauthAppId} | 
[**getOAuthApps**](OAuthClientsApi.md#getOAuthApps) | **GET** /api/v1.0/{appId}/oauthclients | 
[**getOAuthClientByClientId**](OAuthClientsApi.md#getOAuthClientByClientId) | **GET** /api/v1.0/{appId}/oauthclients/{oauthAppId} | 
[**getOAuthClientSecret**](OAuthClientsApi.md#getOAuthClientSecret) | **GET** /api/v1.0/{appId}/oauthclients/{oauthAppId}/secret | 
[**getOauthAccessToken**](OAuthClientsApi.md#getOauthAccessToken) | **GET** /api/v1.0/{appId}/oauthclients/{oauthAppId}/accesstoken | 
[**getRedirectUris**](OAuthClientsApi.md#getRedirectUris) | **GET** /api/v1.0/{appId}/oauthclients/{oauthAppId}/redirecturis | 
[**oAuthClientsGetApplications**](OAuthClientsApi.md#oAuthClientsGetApplications) | **GET** /api/v1.0/{appId}/oauthclients/appnames | 
[**removeRedirectUri**](OAuthClientsApi.md#removeRedirectUri) | **DELETE** /api/v1.0/{appId}/oauthclients/{oauthAppId}/redirecturis/{uriId} | 
[**updateOAuthApp**](OAuthClientsApi.md#updateOAuthApp) | **POST** /api/v1.0/{appId}/oauthclients/{oauthAppId} | 


<a name="addRedirectUri"></a>
# **addRedirectUri**
> RestApiResultOauthClientRedirectUri addRedirectUri(oauthAppId, uri, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String uri = "uri_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultOauthClientRedirectUri result = apiInstance.addRedirectUri(oauthAppId, uri, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#addRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **uri** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultOauthClientRedirectUri**](RestApiResultOauthClientRedirectUri.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createOAuthApp"></a>
# **createOAuthApp**
> createOAuthApp(oAuthApp, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
OAuthApp oAuthApp = new OAuthApp(); // OAuthApp | 
String appId = "appId_example"; // String | 
try {
    apiInstance.createOAuthApp(oAuthApp, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#createOAuthApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthApp** | [**OAuthApp**](OAuthApp.md)|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteOAuthApp"></a>
# **deleteOAuthApp**
> deleteOAuthApp(oauthAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    apiInstance.deleteOAuthApp(oauthAppId, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#deleteOAuthApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthApps"></a>
# **getOAuthApps**
> RestApiArrayResultOAuthApp getOAuthApps(appId, oauthAppName)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String appId = "appId_example"; // String | 
String oauthAppName = "oauthAppName_example"; // String | 
try {
    RestApiArrayResultOAuthApp result = apiInstance.getOAuthApps(appId, oauthAppName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **oauthAppName** | **String**|  | [optional]

### Return type

[**RestApiArrayResultOAuthApp**](RestApiArrayResultOAuthApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthClientByClientId"></a>
# **getOAuthClientByClientId**
> RestApiResultOAuthApp getOAuthClientByClientId(oauthAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultOAuthApp result = apiInstance.getOAuthClientByClientId(oauthAppId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClientByClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultOAuthApp**](RestApiResultOAuthApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthClientSecret"></a>
# **getOAuthClientSecret**
> RestApiStringResult getOAuthClientSecret(oauthAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiStringResult result = apiInstance.getOAuthClientSecret(oauthAppId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClientSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOauthAccessToken"></a>
# **getOauthAccessToken**
> RestApiStringResult getOauthAccessToken(oauthAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiStringResult result = apiInstance.getOauthAccessToken(oauthAppId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOauthAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRedirectUris"></a>
# **getRedirectUris**
> RestApiArrayResultOauthClientRedirectUri getRedirectUris(oauthAppId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultOauthClientRedirectUri result = apiInstance.getRedirectUris(oauthAppId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getRedirectUris");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultOauthClientRedirectUri**](RestApiArrayResultOauthClientRedirectUri.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="oAuthClientsGetApplications"></a>
# **oAuthClientsGetApplications**
> Object oAuthClientsGetApplications(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String appId = "appId_example"; // String | 
try {
    Object result = apiInstance.oAuthClientsGetApplications(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#oAuthClientsGetApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeRedirectUri"></a>
# **removeRedirectUri**
> removeRedirectUri(oauthAppId, uriId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
Integer uriId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    apiInstance.removeRedirectUri(oauthAppId, uriId, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#removeRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **uriId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateOAuthApp"></a>
# **updateOAuthApp**
> updateOAuthApp(oauthAppId, oAuthApp, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OAuthClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OAuthClientsApi apiInstance = new OAuthClientsApi();
String oauthAppId = "oauthAppId_example"; // String | 
OAuthApp oAuthApp = new OAuthApp(); // OAuthApp | 
String appId = "appId_example"; // String | 
try {
    apiInstance.updateOAuthApp(oauthAppId, oAuthApp, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#updateOAuthApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **oAuthApp** | [**OAuthApp**](OAuthApp.md)|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

