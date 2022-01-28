# AuthorizationTokensApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthorizationTokens**](AuthorizationTokensApi.md#getAuthorizationTokens) | **GET** /api/v1.0/{appId}/authorizationtokens/{oauthAppId} | Get authorization tokens
[**revokeToken**](AuthorizationTokensApi.md#revokeToken) | **DELETE** /api/v1.0/{appId}/authorizationtokens/{key} | Revoke token


<a name="getAuthorizationTokens"></a>
# **getAuthorizationTokens**
> RestApiPaginationResultOAuthTokenModel getAuthorizationTokens(oauthAppId, appId, page, limit)

Get authorization tokens



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AuthorizationTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationTokensApi apiInstance = new AuthorizationTokensApi();
String oauthAppId = "oauthAppId_example"; // String | Client identifier
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | Requested page number
Integer limit = 56; // Integer | Requested page limit
try {
    RestApiPaginationResultOAuthTokenModel result = apiInstance.getAuthorizationTokens(oauthAppId, appId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationTokensApi#getAuthorizationTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| Client identifier |
 **appId** | **String**|  |
 **page** | **Integer**| Requested page number | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

### Return type

[**RestApiPaginationResultOAuthTokenModel**](RestApiPaginationResultOAuthTokenModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="revokeToken"></a>
# **revokeToken**
> revokeToken(key, appId)

Revoke token

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AuthorizationTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AuthorizationTokensApi apiInstance = new AuthorizationTokensApi();
String key = "key_example"; // String | Token identifier key
String appId = "appId_example"; // String | 
try {
    apiInstance.revokeToken(key, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationTokensApi#revokeToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| Token identifier key |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

