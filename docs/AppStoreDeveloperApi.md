# AppStoreDeveloperApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appVerificationUpdate**](AppStoreDeveloperApi.md#appVerificationUpdate) | **PUT** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/verification | Update App store app verification
[**createAppStoreApp**](AppStoreDeveloperApi.md#createAppStoreApp) | **POST** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps | Create App store app
[**deleteAppStoreApp**](AppStoreDeveloperApi.md#deleteAppStoreApp) | **DELETE** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId} | Delete App store app
[**getExternalFunctionSigningKey**](AppStoreDeveloperApi.md#getExternalFunctionSigningKey) | **GET** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/external_function_signing_key | Get external function action signing key for app
[**updateAppStoreApp**](AppStoreDeveloperApi.md#updateAppStoreApp) | **PUT** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId} | Update App store app
[**uploadAppStoreAppLogo**](AppStoreDeveloperApi.md#uploadAppStoreAppLogo) | **POST** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/logo | Upload the App store app logo \\ icon


<a name="appVerificationUpdate"></a>
# **appVerificationUpdate**
> appVerificationUpdate(oauthAppId, appStoreAppId, verificationStatus)

Update App store app verification

[BETA - this endpoint is under development, do not use it in your production system][Note: Only Flipdish staff can verify apps]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
String verificationStatus = "verificationStatus_example"; // String | New verification status
try {
    apiInstance.appVerificationUpdate(oauthAppId, appStoreAppId, verificationStatus);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#appVerificationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **appStoreAppId** | **String**| App store app id |
 **verificationStatus** | **String**| New verification status | [enum: Draft, Submitted, Verified]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAppStoreApp"></a>
# **createAppStoreApp**
> RestApiResultAppStoreApp createAppStoreApp(oauthAppId, createAppStoreApp)

Create App store app

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
CreateAppStoreApp createAppStoreApp = new CreateAppStoreApp(); // CreateAppStoreApp | App store app
try {
    RestApiResultAppStoreApp result = apiInstance.createAppStoreApp(oauthAppId, createAppStoreApp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#createAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **createAppStoreApp** | [**CreateAppStoreApp**](CreateAppStoreApp.md)| App store app |

### Return type

[**RestApiResultAppStoreApp**](RestApiResultAppStoreApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppStoreApp"></a>
# **deleteAppStoreApp**
> RestApiStringResult deleteAppStoreApp(oauthAppId, appStoreAppId)

Delete App store app

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
try {
    RestApiStringResult result = apiInstance.deleteAppStoreApp(oauthAppId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#deleteAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **appStoreAppId** | **String**| App store app id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getExternalFunctionSigningKey"></a>
# **getExternalFunctionSigningKey**
> getExternalFunctionSigningKey(oauthAppId, appStoreAppId)

Get external function action signing key for app

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
try {
    apiInstance.getExternalFunctionSigningKey(oauthAppId, appStoreAppId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#getExternalFunctionSigningKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **appStoreAppId** | **String**| App store app id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreApp"></a>
# **updateAppStoreApp**
> updateAppStoreApp(oauthAppId, appStoreAppId, appStoreApp)

Update App store app

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
UpdateAppStoreApp appStoreApp = new UpdateAppStoreApp(); // UpdateAppStoreApp | Update App store app
try {
    apiInstance.updateAppStoreApp(oauthAppId, appStoreAppId, appStoreApp);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#updateAppStoreApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **appStoreAppId** | **String**| App store app id |
 **appStoreApp** | [**UpdateAppStoreApp**](UpdateAppStoreApp.md)| Update App store app |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadAppStoreAppLogo"></a>
# **uploadAppStoreAppLogo**
> uploadAppStoreAppLogo(oauthAppId, appStoreAppId, image)

Upload the App store app logo \\ icon

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreDeveloperApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreDeveloperApi apiInstance = new AppStoreDeveloperApi();
String oauthAppId = "oauthAppId_example"; // String | OAuth App identifier
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
File image = new File("/path/to/file.txt"); // File | App Store App Logo
try {
    apiInstance.uploadAppStoreAppLogo(oauthAppId, appStoreAppId, image);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#uploadAppStoreAppLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**| OAuth App identifier |
 **appStoreAppId** | **String**| App store app id |
 **image** | **File**| App Store App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

