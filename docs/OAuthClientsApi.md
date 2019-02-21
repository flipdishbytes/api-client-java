# OAuthClientsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRedirectUri**](OAuthClientsApi.md#addRedirectUri) | **POST** /api/v1.0/oauthclients/{oAuthClientId}/redirecturis | Create OAuth client redirect uri
[**createOAuthClient**](OAuthClientsApi.md#createOAuthClient) | **POST** /api/v1.0/oauthclients | Create OAuth client
[**deleteOAuthClient**](OAuthClientsApi.md#deleteOAuthClient) | **DELETE** /api/v1.0/oauthclients/{oAuthClientId} | Delete OAuth client
[**getOAuthClientByClientId**](OAuthClientsApi.md#getOAuthClientByClientId) | **GET** /api/v1.0/oauthclients/{clientId} | Get OAuth client by identifier
[**getOAuthClientSecret**](OAuthClientsApi.md#getOAuthClientSecret) | **GET** /api/v1.0/oauthclients/{clientId}/secret | Get OAuth client secret key
[**getOAuthClients**](OAuthClientsApi.md#getOAuthClients) | **GET** /api/v1.0/oauthclients | Get all OAuth client
[**getOauthAccessToken**](OAuthClientsApi.md#getOauthAccessToken) | **GET** /api/v1.0/oauthclients/{oAuthClientId}/accesstoken | Get OAuth access token for client
[**getRedirectUris**](OAuthClientsApi.md#getRedirectUris) | **GET** /api/v1.0/oauthclients/{oAuthClientId}/redirecturis | Get OAuth client redirect uris
[**removeRedirectUri**](OAuthClientsApi.md#removeRedirectUri) | **DELETE** /api/v1.0/oauthclients/{oAuthClientId}/redirecturis/{uriId} | Delete OAuth client redirect uri


<a name="addRedirectUri"></a>
# **addRedirectUri**
> RestApiResultOauthClientRedirectUri addRedirectUri(oAuthClientId, uri)

Create OAuth client redirect uri

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
String oAuthClientId = "oAuthClientId_example"; // String | OAuth client identifier
String uri = "uri_example"; // String | Redirect uri
try {
    RestApiResultOauthClientRedirectUri result = apiInstance.addRedirectUri(oAuthClientId, uri);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#addRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClientId** | **String**| OAuth client identifier |
 **uri** | **String**| Redirect uri |

### Return type

[**RestApiResultOauthClientRedirectUri**](RestApiResultOauthClientRedirectUri.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createOAuthClient"></a>
# **createOAuthClient**
> createOAuthClient(oAuthClient)

Create OAuth client

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
OAuthClient oAuthClient = new OAuthClient(); // OAuthClient | OAuth client
try {
    apiInstance.createOAuthClient(oAuthClient);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#createOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClient** | [**OAuthClient**](OAuthClient.md)| OAuth client |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteOAuthClient"></a>
# **deleteOAuthClient**
> deleteOAuthClient(oAuthClientId)

Delete OAuth client

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
String oAuthClientId = "oAuthClientId_example"; // String | OAuth client identifier
try {
    apiInstance.deleteOAuthClient(oAuthClientId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#deleteOAuthClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClientId** | **String**| OAuth client identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthClientByClientId"></a>
# **getOAuthClientByClientId**
> RestApiResultOAuthClient getOAuthClientByClientId(clientId)

Get OAuth client by identifier

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
String clientId = "clientId_example"; // String | OAuth client identifier
try {
    RestApiResultOAuthClient result = apiInstance.getOAuthClientByClientId(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClientByClientId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| OAuth client identifier |

### Return type

[**RestApiResultOAuthClient**](RestApiResultOAuthClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthClientSecret"></a>
# **getOAuthClientSecret**
> RestApiStringResult getOAuthClientSecret(clientId)

Get OAuth client secret key

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
String clientId = "clientId_example"; // String | OAuth client identifier
try {
    RestApiStringResult result = apiInstance.getOAuthClientSecret(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClientSecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| OAuth client identifier |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOAuthClients"></a>
# **getOAuthClients**
> RestApiArrayResultOAuthClient getOAuthClients()

Get all OAuth client

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
try {
    RestApiArrayResultOAuthClient result = apiInstance.getOAuthClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOAuthClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiArrayResultOAuthClient**](RestApiArrayResultOAuthClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOauthAccessToken"></a>
# **getOauthAccessToken**
> RestApiStringResult getOauthAccessToken(oAuthClientId)

Get OAuth access token for client

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
String oAuthClientId = "oAuthClientId_example"; // String | OAuth client identifier
try {
    RestApiStringResult result = apiInstance.getOauthAccessToken(oAuthClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getOauthAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClientId** | **String**| OAuth client identifier |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRedirectUris"></a>
# **getRedirectUris**
> RestApiArrayResultOauthClientRedirectUri getRedirectUris(oAuthClientId)

Get OAuth client redirect uris

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
String oAuthClientId = "oAuthClientId_example"; // String | OAuth client identifier
try {
    RestApiArrayResultOauthClientRedirectUri result = apiInstance.getRedirectUris(oAuthClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#getRedirectUris");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClientId** | **String**| OAuth client identifier |

### Return type

[**RestApiArrayResultOauthClientRedirectUri**](RestApiArrayResultOauthClientRedirectUri.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeRedirectUri"></a>
# **removeRedirectUri**
> removeRedirectUri(oAuthClientId, uriId)

Delete OAuth client redirect uri

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
String oAuthClientId = "oAuthClientId_example"; // String | OAuth client identifier
Integer uriId = 56; // Integer | Redirect uri identifier
try {
    apiInstance.removeRedirectUri(oAuthClientId, uriId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthClientsApi#removeRedirectUri");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oAuthClientId** | **String**| OAuth client identifier |
 **uriId** | **Integer**| Redirect uri identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

