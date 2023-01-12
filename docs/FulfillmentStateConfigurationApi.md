# FulfillmentStateConfigurationApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#createFulfillmentStatesConfig) | **POST** /api/v1.0/{appId}/fulfillment/configuration/states | Create fulfillment configuration
[**deleteFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#deleteFulfillmentStatesConfig) | **DELETE** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | Delete fulfillment states configuration
[**getFulfillmentStatesConfiguration**](FulfillmentStateConfigurationApi.md#getFulfillmentStatesConfiguration) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | Get fulfillment configuration
[**getFulfillmentStatesConfigurationTemplate**](FulfillmentStateConfigurationApi.md#getFulfillmentStatesConfigurationTemplate) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states_template | Get fulfillment configuration template
[**searchFulfillmentStatesConfigurations**](FulfillmentStateConfigurationApi.md#searchFulfillmentStatesConfigurations) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states | List fulfillment configurations for AppId
[**updateFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#updateFulfillmentStatesConfig) | **POST** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | Update fulfillment configuration


<a name="createFulfillmentStatesConfig"></a>
# **createFulfillmentStatesConfig**
> RestApiResultFulfillmentStatesConfiguration createFulfillmentStatesConfig(appId, fulfillmentStateConfiguration)

Create fulfillment configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
CreateFulfillmentStatesConfiguration fulfillmentStateConfiguration = new CreateFulfillmentStatesConfiguration(); // CreateFulfillmentStatesConfiguration | Fulfillment state configuration
try {
    RestApiResultFulfillmentStatesConfiguration result = apiInstance.createFulfillmentStatesConfig(appId, fulfillmentStateConfiguration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#createFulfillmentStatesConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **fulfillmentStateConfiguration** | [**CreateFulfillmentStatesConfiguration**](CreateFulfillmentStatesConfiguration.md)| Fulfillment state configuration |

### Return type

[**RestApiResultFulfillmentStatesConfiguration**](RestApiResultFulfillmentStatesConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteFulfillmentStatesConfig"></a>
# **deleteFulfillmentStatesConfig**
> RestApiStringResult deleteFulfillmentStatesConfig(appId, configId)

Delete fulfillment states configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
String configId = "configId_example"; // String | Fulfillment states configuration id
try {
    RestApiStringResult result = apiInstance.deleteFulfillmentStatesConfig(appId, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#deleteFulfillmentStatesConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **configId** | **String**| Fulfillment states configuration id |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFulfillmentStatesConfiguration"></a>
# **getFulfillmentStatesConfiguration**
> FulfillmentStatesConfiguration getFulfillmentStatesConfiguration(appId, configId)

Get fulfillment configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
String configId = "configId_example"; // String | Fulfillment configuration id
try {
    FulfillmentStatesConfiguration result = apiInstance.getFulfillmentStatesConfiguration(appId, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#getFulfillmentStatesConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **configId** | **String**| Fulfillment configuration id |

### Return type

[**FulfillmentStatesConfiguration**](FulfillmentStatesConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFulfillmentStatesConfigurationTemplate"></a>
# **getFulfillmentStatesConfigurationTemplate**
> FulfillmentStatesConfiguration getFulfillmentStatesConfigurationTemplate(appId)

Get fulfillment configuration template

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
try {
    FulfillmentStatesConfiguration result = apiInstance.getFulfillmentStatesConfigurationTemplate(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#getFulfillmentStatesConfigurationTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |

### Return type

[**FulfillmentStatesConfiguration**](FulfillmentStatesConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchFulfillmentStatesConfigurations"></a>
# **searchFulfillmentStatesConfigurations**
> RestApiArrayResultFulfillmentStatesConfigurationSummary searchFulfillmentStatesConfigurations(appId)

List fulfillment configurations for AppId

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
try {
    RestApiArrayResultFulfillmentStatesConfigurationSummary result = apiInstance.searchFulfillmentStatesConfigurations(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#searchFulfillmentStatesConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |

### Return type

[**RestApiArrayResultFulfillmentStatesConfigurationSummary**](RestApiArrayResultFulfillmentStatesConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateFulfillmentStatesConfig"></a>
# **updateFulfillmentStatesConfig**
> updateFulfillmentStatesConfig(appId, configId, updateFulfillmentStatesConfiguration)

Update fulfillment configuration

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FulfillmentStateConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FulfillmentStateConfigurationApi apiInstance = new FulfillmentStateConfigurationApi();
String appId = "appId_example"; // String | App id
String configId = "configId_example"; // String | Fulfillment states configuration id
UpdateFulfillmentStatesConfiguration updateFulfillmentStatesConfiguration = new UpdateFulfillmentStatesConfiguration(); // UpdateFulfillmentStatesConfiguration | Update fulfillment states configuration
try {
    apiInstance.updateFulfillmentStatesConfig(appId, configId, updateFulfillmentStatesConfiguration);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentStateConfigurationApi#updateFulfillmentStatesConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **configId** | **String**| Fulfillment states configuration id |
 **updateFulfillmentStatesConfiguration** | [**UpdateFulfillmentStatesConfiguration**](UpdateFulfillmentStatesConfiguration.md)| Update fulfillment states configuration |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

