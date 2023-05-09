# TeammatesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTeammate**](TeammatesApi.md#createTeammate) | **POST** /api/v1.0/{appId}/teammates | 
[**deleteTeammate**](TeammatesApi.md#deleteTeammate) | **DELETE** /api/v1.0/{appId}/teammates/{id} | 
[**getTeammateByAppIdAndTeammateId**](TeammatesApi.md#getTeammateByAppIdAndTeammateId) | **GET** /api/v1.0/{appId}/teammates/{id} | 
[**getTeammatesByAppId**](TeammatesApi.md#getTeammatesByAppId) | **GET** /api/v1.0/{appId}/teammates | 
[**redeemInvitation**](TeammatesApi.md#redeemInvitation) | **GET** /api/v1.0/{appId}/teammates/redeem/{otc} | 
[**updateTeammate**](TeammatesApi.md#updateTeammate) | **POST** /api/v1.0/{appId}/teammates/{id} | 


<a name="createTeammate"></a>
# **createTeammate**
> RestApiResultTeammate createTeammate(appId, teammate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String appId = "appId_example"; // String | 
CreateTeammate teammate = new CreateTeammate(); // CreateTeammate | 
try {
    RestApiResultTeammate result = apiInstance.createTeammate(appId, teammate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#createTeammate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **teammate** | [**CreateTeammate**](CreateTeammate.md)|  |

### Return type

[**RestApiResultTeammate**](RestApiResultTeammate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteTeammate"></a>
# **deleteTeammate**
> deleteTeammate(appId, id)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String appId = "appId_example"; // String | 
String id = "id_example"; // String | 
try {
    apiInstance.deleteTeammate(appId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#deleteTeammate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getTeammateByAppIdAndTeammateId"></a>
# **getTeammateByAppIdAndTeammateId**
> RestApiResultTeammate getTeammateByAppIdAndTeammateId(appId, id)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String appId = "appId_example"; // String | 
String id = "id_example"; // String | 
try {
    RestApiResultTeammate result = apiInstance.getTeammateByAppIdAndTeammateId(appId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#getTeammateByAppIdAndTeammateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **id** | **String**|  |

### Return type

[**RestApiResultTeammate**](RestApiResultTeammate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getTeammatesByAppId"></a>
# **getTeammatesByAppId**
> RestApiArrayResultTeammate getTeammatesByAppId(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultTeammate result = apiInstance.getTeammatesByAppId(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#getTeammatesByAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultTeammate**](RestApiArrayResultTeammate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="redeemInvitation"></a>
# **redeemInvitation**
> RestApiResultRedeemInvitationResult redeemInvitation(otc, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String otc = "otc_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultRedeemInvitationResult result = apiInstance.redeemInvitation(otc, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#redeemInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **otc** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultRedeemInvitationResult**](RestApiResultRedeemInvitationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateTeammate"></a>
# **updateTeammate**
> RestApiResultTeammate updateTeammate(appId, id, teammate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.TeammatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TeammatesApi apiInstance = new TeammatesApi();
String appId = "appId_example"; // String | 
String id = "id_example"; // String | 
TeammateBase teammate = new TeammateBase(); // TeammateBase | 
try {
    RestApiResultTeammate result = apiInstance.updateTeammate(appId, id, teammate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeammatesApi#updateTeammate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **id** | **String**|  |
 **teammate** | [**TeammateBase**](TeammateBase.md)|  |

### Return type

[**RestApiResultTeammate**](RestApiResultTeammate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

