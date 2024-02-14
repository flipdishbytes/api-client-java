# AppStoreDeveloperApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appVerificationUpdate**](AppStoreDeveloperApi.md#appVerificationUpdate) | **PUT** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/verification | 
[**createAppStoreApp**](AppStoreDeveloperApi.md#createAppStoreApp) | **POST** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps | 
[**deleteAppStoreApp**](AppStoreDeveloperApi.md#deleteAppStoreApp) | **DELETE** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId} | 
[**getAppExternalProduct**](AppStoreDeveloperApi.md#getAppExternalProduct) | **GET** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/external_product | 
[**getExternalFunctionSigningKey**](AppStoreDeveloperApi.md#getExternalFunctionSigningKey) | **GET** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/external_function_signing_key | 
[**updateAppStoreApp**](AppStoreDeveloperApi.md#updateAppStoreApp) | **PUT** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId} | 
[**updateExternalProduct**](AppStoreDeveloperApi.md#updateExternalProduct) | **PUT** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/external_product | 
[**uploadAppStoreAppLogo**](AppStoreDeveloperApi.md#uploadAppStoreAppLogo) | **POST** /api/v1.0/oauthclients/{oauthAppId}/appstore/apps/{appStoreAppId}/logo | 


<a name="appVerificationUpdate"></a>
# **appVerificationUpdate**
> appVerificationUpdate(oauthAppId, appStoreAppId, verificationStatus)



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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
String verificationStatus = "verificationStatus_example"; // String | 
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
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **verificationStatus** | **String**|  | [enum: Draft, Submitted, Verified]

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
String oauthAppId = "oauthAppId_example"; // String | 
CreateAppStoreApp createAppStoreApp = new CreateAppStoreApp(); // CreateAppStoreApp | 
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
 **oauthAppId** | **String**|  |
 **createAppStoreApp** | [**CreateAppStoreApp**](CreateAppStoreApp.md)|  |

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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
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
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppExternalProduct"></a>
# **getAppExternalProduct**
> getAppExternalProduct(oauthAppId, appStoreAppId)



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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
try {
    apiInstance.getAppExternalProduct(oauthAppId, appStoreAppId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#getAppExternalProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getExternalFunctionSigningKey"></a>
# **getExternalFunctionSigningKey**
> RestApiErrorResult getExternalFunctionSigningKey(oauthAppId, appStoreAppId)



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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
try {
    RestApiErrorResult result = apiInstance.getExternalFunctionSigningKey(oauthAppId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#getExternalFunctionSigningKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiErrorResult**](RestApiErrorResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreApp"></a>
# **updateAppStoreApp**
> updateAppStoreApp(oauthAppId, appStoreAppId, appStoreApp)



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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
UpdateAppStoreApp appStoreApp = new UpdateAppStoreApp(); // UpdateAppStoreApp | 
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
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **appStoreApp** | [**UpdateAppStoreApp**](UpdateAppStoreApp.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateExternalProduct"></a>
# **updateExternalProduct**
> updateExternalProduct(oauthAppId, appStoreAppId, appStoreAppExternalProduct)



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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
UpdateAppStoreAppExternalProduct appStoreAppExternalProduct = new UpdateAppStoreAppExternalProduct(); // UpdateAppStoreAppExternalProduct | 
try {
    apiInstance.updateExternalProduct(oauthAppId, appStoreAppId, appStoreAppExternalProduct);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreDeveloperApi#updateExternalProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **appStoreAppExternalProduct** | [**UpdateAppStoreAppExternalProduct**](UpdateAppStoreAppExternalProduct.md)|  |

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
String oauthAppId = "oauthAppId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
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
 **oauthAppId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **image** | **File**| App Store App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

