# AppStoreConfigurationsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appStoreConfigurationsAppStoreHandleOauthResponseCode**](AppStoreConfigurationsApi.md#appStoreConfigurationsAppStoreHandleOauthResponseCode) | **GET** /api/v1.0/appstore/oauthresponse/{appStoreAppId}/responsecode | Process the OAuth response code (bounce back redirect from external OAuth provider after successful authentication)  the query string will contain state and code
[**createAppStoreConfig**](AppStoreConfigurationsApi.md#createAppStoreConfig) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config | Create App store app configuration
[**deleteAppStoreConfig**](AppStoreConfigurationsApi.md#deleteAppStoreConfig) | **DELETE** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Delete App store app configuration
[**executeConfigurationAction**](AppStoreConfigurationsApi.md#executeConfigurationAction) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId}/action | Execute configuration action on a configuration item (eg. handle button press)
[**getAppStoreConfig**](AppStoreConfigurationsApi.md#getAppStoreConfig) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Get App store app configuration
[**getConfiguredAppSingleApp**](AppStoreConfigurationsApi.md#getConfiguredAppSingleApp) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId} | Get list of App store app configurations for one App store app
[**getConfiguredApps**](AppStoreConfigurationsApi.md#getConfiguredApps) | **GET** /api/v1.0/{appId}/appstore/apps | Get list of App store apps which have been configured
[**updateAppStoreConfig**](AppStoreConfigurationsApi.md#updateAppStoreConfig) | **PUT** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | Update App store app configuration
[**updateAppStoreConfigSettingValues**](AppStoreConfigurationsApi.md#updateAppStoreConfigSettingValues) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId}/updatesettings | Update AppStore App Configuration values, specified settings only


<a name="appStoreConfigurationsAppStoreHandleOauthResponseCode"></a>
# **appStoreConfigurationsAppStoreHandleOauthResponseCode**
> Object appStoreConfigurationsAppStoreHandleOauthResponseCode(appStoreAppId)

Process the OAuth response code (bounce back redirect from external OAuth provider after successful authentication)  the query string will contain state and code

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
String appStoreAppId = "appStoreAppId_example"; // String | 
try {
    Object result = apiInstance.appStoreConfigurationsAppStoreHandleOauthResponseCode(appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#appStoreConfigurationsAppStoreHandleOauthResponseCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appStoreAppId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAppStoreConfig"></a>
# **createAppStoreConfig**
> RestApiResultAppStoreAppConfiguration createAppStoreConfig(appId, appStoreAppId)

Create App store app configuration

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
String appId = "appId_example"; // String | App id
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
try {
    RestApiResultAppStoreAppConfiguration result = apiInstance.createAppStoreConfig(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#createAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **appStoreAppId** | **String**| App store app id |

### Return type

[**RestApiResultAppStoreAppConfiguration**](RestApiResultAppStoreAppConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteAppStoreConfig"></a>
# **deleteAppStoreConfig**
> RestApiStringResult deleteAppStoreConfig(appId, appStoreAppId, configId)

Delete App store app configuration

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
String appId = "appId_example"; // String | App id
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
String configId = "configId_example"; // String | App store app configuration id
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
 **appId** | **String**| App id |
 **appStoreAppId** | **String**| App store app id |
 **configId** | **String**| App store app configuration id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="executeConfigurationAction"></a>
# **executeConfigurationAction**
> ExecuteConfigurationActionResult executeConfigurationAction(appId, appStoreAppId, configId, executeConfigurationActionRequest)

Execute configuration action on a configuration item (eg. handle button press)

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
String appStoreAppId = "appStoreAppId_example"; // String | AppStore App Id
String configId = "configId_example"; // String | AppStore App configuration Id
ExecuteConfigurationActionRequest executeConfigurationActionRequest = new ExecuteConfigurationActionRequest(); // ExecuteConfigurationActionRequest | Action request details
try {
    ExecuteConfigurationActionResult result = apiInstance.executeConfigurationAction(appId, appStoreAppId, configId, executeConfigurationActionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#executeConfigurationAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **appStoreAppId** | **String**| AppStore App Id |
 **configId** | **String**| AppStore App configuration Id |
 **executeConfigurationActionRequest** | [**ExecuteConfigurationActionRequest**](ExecuteConfigurationActionRequest.md)| Action request details |

### Return type

[**ExecuteConfigurationActionResult**](ExecuteConfigurationActionResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreConfig"></a>
# **getAppStoreConfig**
> AppStoreAppConfiguration getAppStoreConfig(appId, appStoreAppId, configId)

Get App store app configuration

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
String appId = "appId_example"; // String | App id
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
String configId = "configId_example"; // String | App store app configuration id
try {
    AppStoreAppConfiguration result = apiInstance.getAppStoreConfig(appId, appStoreAppId, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **appStoreAppId** | **String**| App store app id |
 **configId** | **String**| App store app configuration id |

### Return type

[**AppStoreAppConfiguration**](AppStoreAppConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredAppSingleApp"></a>
# **getConfiguredAppSingleApp**
> RestApiArrayResultAppStoreAppConfigurationSummary getConfiguredAppSingleApp(appId, appStoreAppId)

Get list of App store app configurations for one App store app

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
String appId = "appId_example"; // String | App id
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
try {
    RestApiArrayResultAppStoreAppConfigurationSummary result = apiInstance.getConfiguredAppSingleApp(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getConfiguredAppSingleApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **appStoreAppId** | **String**| App store app id |

### Return type

[**RestApiArrayResultAppStoreAppConfigurationSummary**](RestApiArrayResultAppStoreAppConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredApps"></a>
# **getConfiguredApps**
> RestApiArrayResultAppStoreAppConfigurationHeader getConfiguredApps(appId)

Get list of App store apps which have been configured

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
String appId = "appId_example"; // String | App id
try {
    RestApiArrayResultAppStoreAppConfigurationHeader result = apiInstance.getConfiguredApps(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getConfiguredApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |

### Return type

[**RestApiArrayResultAppStoreAppConfigurationHeader**](RestApiArrayResultAppStoreAppConfigurationHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreConfig"></a>
# **updateAppStoreConfig**
> updateAppStoreConfig(appId, appStoreAppId, configId, updateAppStoreAppConfiguration)

Update App store app configuration

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
String appId = "appId_example"; // String | App id
String appStoreAppId = "appStoreAppId_example"; // String | App store app id
String configId = "configId_example"; // String | App store app configuration id
UpdateAppStoreAppConfiguration updateAppStoreAppConfiguration = new UpdateAppStoreAppConfiguration(); // UpdateAppStoreAppConfiguration | Update App store app configuration
try {
    apiInstance.updateAppStoreConfig(appId, appStoreAppId, configId, updateAppStoreAppConfiguration);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#updateAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **appStoreAppId** | **String**| App store app id |
 **configId** | **String**| App store app configuration id |
 **updateAppStoreAppConfiguration** | [**UpdateAppStoreAppConfiguration**](UpdateAppStoreAppConfiguration.md)| Update App store app configuration |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreConfigSettingValues"></a>
# **updateAppStoreConfigSettingValues**
> updateAppStoreConfigSettingValues(appId, appStoreAppId, configId, updateAppStoreAppConfigurationValues)

Update AppStore App Configuration values, specified settings only

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
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
String configId = "configId_example"; // String | 
UpdateAppStoreAppConfigurationValuesBatch updateAppStoreAppConfigurationValues = new UpdateAppStoreAppConfigurationValuesBatch(); // UpdateAppStoreAppConfigurationValuesBatch | 
try {
    apiInstance.updateAppStoreConfigSettingValues(appId, appStoreAppId, configId, updateAppStoreAppConfigurationValues);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#updateAppStoreConfigSettingValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **configId** | **String**|  |
 **updateAppStoreAppConfigurationValues** | [**UpdateAppStoreAppConfigurationValuesBatch**](UpdateAppStoreAppConfigurationValuesBatch.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

