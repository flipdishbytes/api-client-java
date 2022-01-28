# AppStoreConfigurationsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppStoreConfig**](AppStoreConfigurationsApi.md#createAppStoreConfig) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config | Create app store app configuration
[**deleteAppStoreConfig**](AppStoreConfigurationsApi.md#deleteAppStoreConfig) | **DELETE** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Delete app store app configuration
[**getAppStoreConfig**](AppStoreConfigurationsApi.md#getAppStoreConfig) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Get app store app configuration
[**getConfiguredAppSingleApp**](AppStoreConfigurationsApi.md#getConfiguredAppSingleApp) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId} | Get list of app store app configurations for one app store app
[**getConfiguredApps**](AppStoreConfigurationsApi.md#getConfiguredApps) | **GET** /api/v1.0/{appId}/appstore/apps | Get list of app store apps which have been configured
[**updateAppStoreConfig**](AppStoreConfigurationsApi.md#updateAppStoreConfig) | **PUT** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Update app store app configuration


<a name="createAppStoreConfig"></a>
# **createAppStoreConfig**
> RestApiResultAppConfigurationSummary createAppStoreConfig(appId, appStoreAppId)

Create app store app configuration

[BETA - this endpoint is under development, do not use it in your production system] This adds an Application to a Whitelabel that can later be configured to specific stores

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
try {
    RestApiResultAppConfigurationSummary result = apiInstance.createAppStoreConfig(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#createAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| App Store App Id |

### Return type

[**RestApiResultAppConfigurationSummary**](RestApiResultAppConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppStoreConfig"></a>
# **deleteAppStoreConfig**
> RestApiStringResult deleteAppStoreConfig(appId, appStoreAppId, configId)

Delete app store app configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
String configId = "configId_example"; // String | App Store Configuration Id
try {
    RestApiStringResult result = apiInstance.deleteAppStoreConfig(appId, appStoreAppId, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#deleteAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| App Store App Id |
 **configId** | **String**| App Store Configuration Id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreConfig"></a>
# **getAppStoreConfig**
> AppConfigurationDetail getAppStoreConfig(appId, appStoreAppId, configId)

Get app store app configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
String configId = "configId_example"; // String | App Store Configuration Id
try {
    AppConfigurationDetail result = apiInstance.getAppStoreConfig(appId, appStoreAppId, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| App Store App Id |
 **configId** | **String**| App Store Configuration Id |

### Return type

[**AppConfigurationDetail**](AppConfigurationDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredAppSingleApp"></a>
# **getConfiguredAppSingleApp**
> RestApiArrayResultAppConfigurationSummary getConfiguredAppSingleApp(appId, appStoreAppId)

Get list of app store app configurations for one app store app

[ALPHA - this endpoint is not ready to be consumed]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
try {
    RestApiArrayResultAppConfigurationSummary result = apiInstance.getConfiguredAppSingleApp(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getConfiguredAppSingleApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| App Store App Id |

### Return type

[**RestApiArrayResultAppConfigurationSummary**](RestApiArrayResultAppConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredApps"></a>
# **getConfiguredApps**
> RestApiArrayResultAppConfigurationHeader getConfiguredApps(appId)

Get list of app store apps which have been configured

[ALPHA - this endpoint is not ready to be consumed]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
try {
    RestApiArrayResultAppConfigurationHeader result = apiInstance.getConfiguredApps(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getConfiguredApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |

### Return type

[**RestApiArrayResultAppConfigurationHeader**](RestApiArrayResultAppConfigurationHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreConfig"></a>
# **updateAppStoreConfig**
> updateAppStoreConfig(appId, appStoreAppId, configId, appConfigurationBase)

Update app store app configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreConfigurationsApi apiInstance = new AppStoreConfigurationsApi();
String appId = "appId_example"; // String | App Id
String appStoreAppId = "appStoreAppId_example"; // String | App Store App Id
String configId = "configId_example"; // String | App Store Configuration Id
AppConfiguration appConfigurationBase = new AppConfiguration(); // AppConfiguration | App Store Configuration Base
try {
    apiInstance.updateAppStoreConfig(appId, appStoreAppId, configId, appConfigurationBase);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#updateAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| App Store App Id |
 **configId** | **String**| App Store Configuration Id |
 **appConfigurationBase** | [**AppConfiguration**](AppConfiguration.md)| App Store Configuration Base |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

