# WhiteLabelConfigApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppGeneralConfig**](WhiteLabelConfigApi.md#getAppGeneralConfig) | **GET** /api/v1.0/whitelabelconfig/{appId}/general | 
[**getAppStoreConfig**](WhiteLabelConfigApi.md#getAppStoreConfig) | **GET** /api/v1.0/whitelabelconfig/{appId}/appstore | 
[**getPlayStoreConfig**](WhiteLabelConfigApi.md#getPlayStoreConfig) | **GET** /api/v1.0/whitelabelconfig/{appId}/playstore | 
[**getWhiteLabelConfig**](WhiteLabelConfigApi.md#getWhiteLabelConfig) | **GET** /api/v1.0/whitelabelconfig/id/{wlid} | 
[**getWhiteLabelConfigByAppNameId**](WhiteLabelConfigApi.md#getWhiteLabelConfigByAppNameId) | **GET** /api/v1.0/whitelabelconfig/name/{appId} | 
[**healthCheck**](WhiteLabelConfigApi.md#healthCheck) | **GET** /api/v1.0/whitelabelconfig/health | 
[**updateAppGeneralConfig**](WhiteLabelConfigApi.md#updateAppGeneralConfig) | **POST** /api/v1.0/whitelabelconfig/{appId}/general | 
[**updateAppStoreConfig**](WhiteLabelConfigApi.md#updateAppStoreConfig) | **POST** /api/v1.0/whitelabelconfig/{appId}/appstore | 
[**updatePlayStoreConfig**](WhiteLabelConfigApi.md#updatePlayStoreConfig) | **POST** /api/v1.0/whitelabelconfig/{appId}/playstore | 
[**uploadAppStoreIcon**](WhiteLabelConfigApi.md#uploadAppStoreIcon) | **POST** /api/v1.0/whitelabelconfig/{appId}/app-store-icon | 


<a name="getAppGeneralConfig"></a>
# **getAppGeneralConfig**
> RestApiResultAppGeneralConfigModel getAppGeneralConfig(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultAppGeneralConfigModel result = apiInstance.getAppGeneralConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#getAppGeneralConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultAppGeneralConfigModel**](RestApiResultAppGeneralConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppStoreConfig"></a>
# **getAppStoreConfig**
> RestApiResultAppStoreConfigModel getAppStoreConfig(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultAppStoreConfigModel result = apiInstance.getAppStoreConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#getAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultAppStoreConfigModel**](RestApiResultAppStoreConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPlayStoreConfig"></a>
# **getPlayStoreConfig**
> RestApiResultPlayStoreConfigModel getPlayStoreConfig(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultPlayStoreConfigModel result = apiInstance.getPlayStoreConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#getPlayStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultPlayStoreConfigModel**](RestApiResultPlayStoreConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWhiteLabelConfig"></a>
# **getWhiteLabelConfig**
> RestApiResultWhiteLabelConfigModel getWhiteLabelConfig(wlid)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
Integer wlid = 56; // Integer | 
try {
    RestApiResultWhiteLabelConfigModel result = apiInstance.getWhiteLabelConfig(wlid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#getWhiteLabelConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wlid** | **Integer**|  |

### Return type

[**RestApiResultWhiteLabelConfigModel**](RestApiResultWhiteLabelConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWhiteLabelConfigByAppNameId"></a>
# **getWhiteLabelConfigByAppNameId**
> RestApiResultWhiteLabelConfigModel getWhiteLabelConfigByAppNameId(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultWhiteLabelConfigModel result = apiInstance.getWhiteLabelConfigByAppNameId(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#getWhiteLabelConfigByAppNameId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultWhiteLabelConfigModel**](RestApiResultWhiteLabelConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="healthCheck"></a>
# **healthCheck**
> String healthCheck()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
try {
    String result = apiInstance.healthCheck();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#healthCheck");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppGeneralConfig"></a>
# **updateAppGeneralConfig**
> RestApiResultAppGeneralConfigModel updateAppGeneralConfig(appId, appGeneralConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
AppGeneralConfigModel appGeneralConfig = new AppGeneralConfigModel(); // AppGeneralConfigModel | 
try {
    RestApiResultAppGeneralConfigModel result = apiInstance.updateAppGeneralConfig(appId, appGeneralConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#updateAppGeneralConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appGeneralConfig** | [**AppGeneralConfigModel**](AppGeneralConfigModel.md)|  |

### Return type

[**RestApiResultAppGeneralConfigModel**](RestApiResultAppGeneralConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppStoreConfig"></a>
# **updateAppStoreConfig**
> RestApiResultAppStoreConfigModel updateAppStoreConfig(appId, appStoreConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
AppStoreConfigModel appStoreConfig = new AppStoreConfigModel(); // AppStoreConfigModel | 
try {
    RestApiResultAppStoreConfigModel result = apiInstance.updateAppStoreConfig(appId, appStoreConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#updateAppStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreConfig** | [**AppStoreConfigModel**](AppStoreConfigModel.md)|  |

### Return type

[**RestApiResultAppStoreConfigModel**](RestApiResultAppStoreConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePlayStoreConfig"></a>
# **updatePlayStoreConfig**
> RestApiResultPlayStoreConfigModel updatePlayStoreConfig(appId, playStoreConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
PlayStoreConfigModel playStoreConfig = new PlayStoreConfigModel(); // PlayStoreConfigModel | 
try {
    RestApiResultPlayStoreConfigModel result = apiInstance.updatePlayStoreConfig(appId, playStoreConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#updatePlayStoreConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **playStoreConfig** | [**PlayStoreConfigModel**](PlayStoreConfigModel.md)|  |

### Return type

[**RestApiResultPlayStoreConfigModel**](RestApiResultPlayStoreConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadAppStoreIcon"></a>
# **uploadAppStoreIcon**
> RestApiResultAssetResultModel uploadAppStoreIcon(appId, file)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelConfigApi apiInstance = new WhiteLabelConfigApi();
String appId = "appId_example"; // String | 
HttpPostedFileBase file = new HttpPostedFileBase(); // HttpPostedFileBase | 
try {
    RestApiResultAssetResultModel result = apiInstance.uploadAppStoreIcon(appId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelConfigApi#uploadAppStoreIcon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **file** | [**HttpPostedFileBase**](HttpPostedFileBase.md)|  |

### Return type

[**RestApiResultAssetResultModel**](RestApiResultAssetResultModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

