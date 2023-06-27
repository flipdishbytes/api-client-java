# AppStoreConfigurationsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appStoreConfigurationsAppStoreHandleOauthResponseCode**](AppStoreConfigurationsApi.md#appStoreConfigurationsAppStoreHandleOauthResponseCode) | **GET** /api/v1.0/appstore/oauthresponse/{appStoreAppId}/responsecode | 
[**createAppStoreConfig**](AppStoreConfigurationsApi.md#createAppStoreConfig) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config | 
[**deleteAppStoreConfig**](AppStoreConfigurationsApi.md#deleteAppStoreConfig) | **DELETE** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | 
[**executeConfigurationAction**](AppStoreConfigurationsApi.md#executeConfigurationAction) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId}/action | 
[**getAppStoreConfig**](AppStoreConfigurationsApi.md#getAppStoreConfig) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | 
[**getConfiguredAppSingleApp**](AppStoreConfigurationsApi.md#getConfiguredAppSingleApp) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId} | 
[**getConfiguredAppWithSubscriptionsSingleApp**](AppStoreConfigurationsApi.md#getConfiguredAppWithSubscriptionsSingleApp) | **GET** /api/v1.0/{appId}/appstore/apps_subscriptions/{appStoreAppId} | 
[**getConfiguredApps**](AppStoreConfigurationsApi.md#getConfiguredApps) | **GET** /api/v1.0/{appId}/appstore/apps | 
[**updateAppStoreConfig**](AppStoreConfigurationsApi.md#updateAppStoreConfig) | **PUT** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId} | 
[**updateAppStoreConfigSettingValues**](AppStoreConfigurationsApi.md#updateAppStoreConfigSettingValues) | **POST** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/config/{configId}/updatesettings | 


<a name="appStoreConfigurationsAppStoreHandleOauthResponseCode"></a>
# **appStoreConfigurationsAppStoreHandleOauthResponseCode**
> Object appStoreConfigurationsAppStoreHandleOauthResponseCode(appStoreAppId)



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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |

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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **configId** | **String**|  |

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
ExecuteConfigurationActionRequest executeConfigurationActionRequest = new ExecuteConfigurationActionRequest(); // ExecuteConfigurationActionRequest | 
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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **configId** | **String**|  |
 **executeConfigurationActionRequest** | [**ExecuteConfigurationActionRequest**](ExecuteConfigurationActionRequest.md)|  |

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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **configId** | **String**|  |

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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiArrayResultAppStoreAppConfigurationSummary**](RestApiArrayResultAppStoreAppConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredAppWithSubscriptionsSingleApp"></a>
# **getConfiguredAppWithSubscriptionsSingleApp**
> RestApiResultAppStoreAppConfigurationsWithSubscriptions getConfiguredAppWithSubscriptionsSingleApp(appId, appStoreAppId)



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
try {
    RestApiResultAppStoreAppConfigurationsWithSubscriptions result = apiInstance.getConfiguredAppWithSubscriptionsSingleApp(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreConfigurationsApi#getConfiguredAppWithSubscriptionsSingleApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiResultAppStoreAppConfigurationsWithSubscriptions**](RestApiResultAppStoreAppConfigurationsWithSubscriptions.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getConfiguredApps"></a>
# **getConfiguredApps**
> RestApiArrayResultAppStoreAppConfigurationHeader getConfiguredApps(appId)



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
 **appId** | **String**|  |

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
UpdateAppStoreAppConfiguration updateAppStoreAppConfiguration = new UpdateAppStoreAppConfiguration(); // UpdateAppStoreAppConfiguration | 
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
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |
 **configId** | **String**|  |
 **updateAppStoreAppConfiguration** | [**UpdateAppStoreAppConfiguration**](UpdateAppStoreAppConfiguration.md)|  |

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

