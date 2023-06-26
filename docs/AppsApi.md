# AppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApp**](AppsApi.md#getApp) | **GET** /api/v1.0/apps/{appId} | 
[**getAppHostnameStatus**](AppsApi.md#getAppHostnameStatus) | **GET** /api/v1.0/apps/{appId}/hostnamestatus | 
[**getApps**](AppsApi.md#getApps) | **GET** /api/v1.0/apps | 
[**getCompliance**](AppsApi.md#getCompliance) | **GET** /api/v1.0/apps/{appId}/compliance | 
[**getPanaceaVanityUrl**](AppsApi.md#getPanaceaVanityUrl) | **GET** /api/v1.0/apps/{appId}/panacea/url | 
[**getSalesforceReferences**](AppsApi.md#getSalesforceReferences) | **GET** /api/v1.0/apps/{appId}/salesforcereferences | 
[**getSupportedCountries**](AppsApi.md#getSupportedCountries) | **GET** /api/v1.0/apps/supportedcountries | 
[**isPanaceaVanityUrlAvailable**](AppsApi.md#isPanaceaVanityUrlAvailable) | **GET** /api/v1.0/apps/{appId}/panacea/url/available | 
[**setAppConfig**](AppsApi.md#setAppConfig) | **POST** /api/v1.0/apps/{appId}/config | 
[**setAppHostname**](AppsApi.md#setAppHostname) | **POST** /api/v1.0/apps/{appId}/hostname | 
[**setAppLanguages**](AppsApi.md#setAppLanguages) | **POST** /api/v1.0/apps/{appId}/config/languages | 
[**setAppStoreName**](AppsApi.md#setAppStoreName) | **POST** /api/v1.0/apps/{appId}/appstorename | 
[**setCompliance**](AppsApi.md#setCompliance) | **POST** /api/v1.0/apps/{appId}/compliance | 
[**setPanaceaVanityUrl**](AppsApi.md#setPanaceaVanityUrl) | **POST** /api/v1.0/apps/{appId}/panacea/url | 
[**setSalesforceReferences**](AppsApi.md#setSalesforceReferences) | **POST** /api/v1.0/apps/{appId}/salesforcereferences | 
[**toggleNextGenWeb**](AppsApi.md#toggleNextGenWeb) | **POST** /api/v1.0/apps/{appId}/nextgenweb | 
[**uploadAppLogo**](AppsApi.md#uploadAppLogo) | **POST** /api/v1.0/apps/{appId}/logo | 


<a name="getApp"></a>
# **getApp**
> RestApiResultApp getApp(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultApp result = apiInstance.getApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultApp**](RestApiResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAppHostnameStatus"></a>
# **getAppHostnameStatus**
> RestApiResultDnsRecordInformation getAppHostnameStatus(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultDnsRecordInformation result = apiInstance.getAppHostnameStatus(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppHostnameStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultDnsRecordInformation**](RestApiResultDnsRecordInformation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getApps"></a>
# **getApps**
> RestApiPaginationResultApp getApps(nameFilter, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String nameFilter = "nameFilter_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultApp result = apiInstance.getApps(nameFilter, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameFilter** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultApp**](RestApiPaginationResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCompliance"></a>
# **getCompliance**
> RestApiResultAppCompliance getCompliance(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultAppCompliance result = apiInstance.getCompliance(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getCompliance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultAppCompliance**](RestApiResultAppCompliance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPanaceaVanityUrl"></a>
# **getPanaceaVanityUrl**
> RestApiStringResult getPanaceaVanityUrl(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
try {
    RestApiStringResult result = apiInstance.getPanaceaVanityUrl(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getPanaceaVanityUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSalesforceReferences"></a>
# **getSalesforceReferences**
> AppSalesforceReferences getSalesforceReferences(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
try {
    AppSalesforceReferences result = apiInstance.getSalesforceReferences(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getSalesforceReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**AppSalesforceReferences**](AppSalesforceReferences.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSupportedCountries"></a>
# **getSupportedCountries**
> RestApiArrayResultSupportedCountry getSupportedCountries()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
try {
    RestApiArrayResultSupportedCountry result = apiInstance.getSupportedCountries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getSupportedCountries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiArrayResultSupportedCountry**](RestApiArrayResultSupportedCountry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="isPanaceaVanityUrlAvailable"></a>
# **isPanaceaVanityUrlAvailable**
> RestApiStringResult isPanaceaVanityUrlAvailable(vanityUrl, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String vanityUrl = "vanityUrl_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiStringResult result = apiInstance.isPanaceaVanityUrlAvailable(vanityUrl, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#isPanaceaVanityUrlAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vanityUrl** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppConfig"></a>
# **setAppConfig**
> RestApiResultApp setAppConfig(appId, appConfigUpdate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
AppConfigUpdateModel appConfigUpdate = new AppConfigUpdateModel(); // AppConfigUpdateModel | 
try {
    RestApiResultApp result = apiInstance.setAppConfig(appId, appConfigUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setAppConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appConfigUpdate** | [**AppConfigUpdateModel**](AppConfigUpdateModel.md)|  |

### Return type

[**RestApiResultApp**](RestApiResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppHostname"></a>
# **setAppHostname**
> RestApiStringResult setAppHostname(appId, hostname, isEmbed)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
String hostname = "hostname_example"; // String | 
Boolean isEmbed = true; // Boolean | 
try {
    RestApiStringResult result = apiInstance.setAppHostname(appId, hostname, isEmbed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setAppHostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **hostname** | **String**|  |
 **isEmbed** | **Boolean**|  | [optional]

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppLanguages"></a>
# **setAppLanguages**
> RestApiResultApp setAppLanguages(appId, languages)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
List<Language> languages = Arrays.asList(new Language()); // List<Language> | 
try {
    RestApiResultApp result = apiInstance.setAppLanguages(appId, languages);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setAppLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **languages** | [**List&lt;Language&gt;**](Language.md)|  |

### Return type

[**RestApiResultApp**](RestApiResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppStoreName"></a>
# **setAppStoreName**
> setAppStoreName(appId, appStoreName)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
String appStoreName = "appStoreName_example"; // String | 
try {
    apiInstance.setAppStoreName(appId, appStoreName);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setAppStoreName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setCompliance"></a>
# **setCompliance**
> RestApiResultAppCompliance setCompliance(appId, complianceType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
String complianceType = "complianceType_example"; // String | 
try {
    RestApiResultAppCompliance result = apiInstance.setCompliance(appId, complianceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setCompliance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **complianceType** | **String**|  | [enum: Default, GdprCompliance]

### Return type

[**RestApiResultAppCompliance**](RestApiResultAppCompliance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setPanaceaVanityUrl"></a>
# **setPanaceaVanityUrl**
> RestApiStringResult setPanaceaVanityUrl(appId, vanityUrl)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
String vanityUrl = "vanityUrl_example"; // String | 
try {
    RestApiStringResult result = apiInstance.setPanaceaVanityUrl(appId, vanityUrl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setPanaceaVanityUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **vanityUrl** | **String**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setSalesforceReferences"></a>
# **setSalesforceReferences**
> RestApiStringResult setSalesforceReferences(appId, salesforceReferences)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
AppSalesforceReferences salesforceReferences = new AppSalesforceReferences(); // AppSalesforceReferences | 
try {
    RestApiStringResult result = apiInstance.setSalesforceReferences(appId, salesforceReferences);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setSalesforceReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **salesforceReferences** | [**AppSalesforceReferences**](AppSalesforceReferences.md)|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="toggleNextGenWeb"></a>
# **toggleNextGenWeb**
> RestApiStringResult toggleNextGenWeb(appId, hostname, vanityUrl, isNextGenWeb)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
String hostname = "hostname_example"; // String | 
String vanityUrl = "vanityUrl_example"; // String | 
Boolean isNextGenWeb = true; // Boolean | 
try {
    RestApiStringResult result = apiInstance.toggleNextGenWeb(appId, hostname, vanityUrl, isNextGenWeb);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#toggleNextGenWeb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **hostname** | **String**|  |
 **vanityUrl** | **String**|  |
 **isNextGenWeb** | **Boolean**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadAppLogo"></a>
# **uploadAppLogo**
> uploadAppLogo(appId, image)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | 
File image = new File("/path/to/file.txt"); // File | App Logo
try {
    apiInstance.uploadAppLogo(appId, image);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#uploadAppLogo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **image** | **File**| App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

