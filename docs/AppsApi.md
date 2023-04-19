# AppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApp**](AppsApi.md#getApp) | **GET** /api/v1.0/apps/{appId} | Get the application configuration
[**getAppHostnameStatus**](AppsApi.md#getAppHostnameStatus) | **GET** /api/v1.0/apps/{appId}/hostnamestatus | Get the application hostname DNS delegation states for A and CNAME records.
[**getApps**](AppsApi.md#getApps) | **GET** /api/v1.0/apps | Get Apps
[**getCompliance**](AppsApi.md#getCompliance) | **GET** /api/v1.0/apps/{appId}/compliance | Get the application compliance configuration
[**getPanaceaVanityUrl**](AppsApi.md#getPanaceaVanityUrl) | **GET** /api/v1.0/apps/{appId}/panacea/url | Get panacea vanity url. This sets the URL which the Panacea website is available at. ie. my.flipdish.com/[vanityurl]
[**getSupportedCountries**](AppsApi.md#getSupportedCountries) | **GET** /api/v1.0/apps/supportedcountries | Get all supported countries.
[**isPanaceaVanityUrlAvailable**](AppsApi.md#isPanaceaVanityUrlAvailable) | **GET** /api/v1.0/apps/{appId}/panacea/url/available | Is panacea vanity url available
[**setAppConfig**](AppsApi.md#setAppConfig) | **POST** /api/v1.0/apps/{appId}/config | Set the application configuration
[**setAppHostname**](AppsApi.md#setAppHostname) | **POST** /api/v1.0/apps/{appId}/hostname | Set the application hostname.
[**setAppLanguages**](AppsApi.md#setAppLanguages) | **POST** /api/v1.0/apps/{appId}/config/languages | Set the application languages
[**setCompliance**](AppsApi.md#setCompliance) | **POST** /api/v1.0/apps/{appId}/compliance | Set the application compliance configuration
[**setPanaceaVanityUrl**](AppsApi.md#setPanaceaVanityUrl) | **POST** /api/v1.0/apps/{appId}/panacea/url | Set panacea vanity url
[**toggleNextGenWeb**](AppsApi.md#toggleNextGenWeb) | **POST** /api/v1.0/apps/{appId}/nextgenweb | Toggle Next Gen Web
[**uploadAppLogo**](AppsApi.md#uploadAppLogo) | **POST** /api/v1.0/apps/{appId}/logo | Set the application logo \\ icon


<a name="getApp"></a>
# **getApp**
> RestApiResultApp getApp(appId)

Get the application configuration

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
String appId = "appId_example"; // String | Application identifier
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
 **appId** | **String**| Application identifier |

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

Get the application hostname DNS delegation states for A and CNAME records.

A domain might be ready but still need 10 minutes to work properly because of HAProxy.

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
String appId = "appId_example"; // String | Application identifier.
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
 **appId** | **String**| Application identifier. |

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

Get Apps

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

Get the application compliance configuration

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
String appId = "appId_example"; // String | Application identifier
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
 **appId** | **String**| Application identifier |

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

Get panacea vanity url. This sets the URL which the Panacea website is available at. ie. my.flipdish.com/[vanityurl]

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
String appId = "appId_example"; // String | Application identifier.
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
 **appId** | **String**| Application identifier. |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSupportedCountries"></a>
# **getSupportedCountries**
> RestApiArrayResultSupportedCountry getSupportedCountries()

Get all supported countries.

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

Is panacea vanity url available

Minimum length of 3 characters

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
String vanityUrl = "vanityUrl_example"; // String | Vanity url to check
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
 **vanityUrl** | **String**| Vanity url to check |
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

Set the application configuration

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
String appId = "appId_example"; // String | Application identifier
AppConfigUpdateModel appConfigUpdate = new AppConfigUpdateModel(); // AppConfigUpdateModel | Changes to the configuration
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
 **appId** | **String**| Application identifier |
 **appConfigUpdate** | [**AppConfigUpdateModel**](AppConfigUpdateModel.md)| Changes to the configuration |

### Return type

[**RestApiResultApp**](RestApiResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setAppHostname"></a>
# **setAppHostname**
> RestApiStringResult setAppHostname(appId, hostname, isEmbed, isNextGenWeb)

Set the application hostname.

If no subdomain is specified in {hostname} &#39;www&#39; will be prepended.

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
String appId = "appId_example"; // String | Application identifier.
String hostname = "hostname_example"; // String | The new Hostname.
Boolean isEmbed = true; // Boolean | Will the website be embedded
Boolean isNextGenWeb = true; // Boolean | Enables the NextGen web editor
try {
    RestApiStringResult result = apiInstance.setAppHostname(appId, hostname, isEmbed, isNextGenWeb);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#setAppHostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application identifier. |
 **hostname** | **String**| The new Hostname. |
 **isEmbed** | **Boolean**| Will the website be embedded | [optional]
 **isNextGenWeb** | **Boolean**| Enables the NextGen web editor | [optional]

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

Set the application languages

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
String appId = "appId_example"; // String | Application identifier
List<Language> languages = Arrays.asList(new Language()); // List<Language> | New list of languages
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
 **appId** | **String**| Application identifier |
 **languages** | [**List&lt;Language&gt;**](Language.md)| New list of languages |

### Return type

[**RestApiResultApp**](RestApiResultApp.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setCompliance"></a>
# **setCompliance**
> RestApiResultAppCompliance setCompliance(appId, complianceType)

Set the application compliance configuration

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
String appId = "appId_example"; // String | Application identifier
String complianceType = "complianceType_example"; // String | Compliance type
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
 **appId** | **String**| Application identifier |
 **complianceType** | **String**| Compliance type | [enum: Default, GdprCompliance]

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

Set panacea vanity url

Minimum length of 3 characters

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
String appId = "appId_example"; // String | Application identifier.
String vanityUrl = "vanityUrl_example"; // String | Vanity url
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
 **appId** | **String**| Application identifier. |
 **vanityUrl** | **String**| Vanity url |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="toggleNextGenWeb"></a>
# **toggleNextGenWeb**
> RestApiStringResult toggleNextGenWeb(appId, hostname, isNextGenWeb)

Toggle Next Gen Web

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
Boolean isNextGenWeb = true; // Boolean | 
try {
    RestApiStringResult result = apiInstance.toggleNextGenWeb(appId, hostname, isNextGenWeb);
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

Set the application logo \\ icon

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
String appId = "appId_example"; // String | Application identifier
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
 **appId** | **String**| Application identifier |
 **image** | **File**| App Logo |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

