# FulfillmentStateConfigurationApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#createFulfillmentStatesConfig) | **POST** /api/v1.0/{appId}/fulfillment/configuration/states | 
[**deleteFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#deleteFulfillmentStatesConfig) | **DELETE** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | 
[**getFulfillmentStatesConfiguration**](FulfillmentStateConfigurationApi.md#getFulfillmentStatesConfiguration) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | 
[**getFulfillmentStatesConfigurationTemplate**](FulfillmentStateConfigurationApi.md#getFulfillmentStatesConfigurationTemplate) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states_template | 
[**searchFulfillmentStatesConfigurations**](FulfillmentStateConfigurationApi.md#searchFulfillmentStatesConfigurations) | **GET** /api/v1.0/{appId}/fulfillment/configuration/states | 
[**updateFulfillmentStatesConfig**](FulfillmentStateConfigurationApi.md#updateFulfillmentStatesConfig) | **POST** /api/v1.0/{appId}/fulfillment/configuration/states/{configId} | 


<a name="createFulfillmentStatesConfig"></a>
# **createFulfillmentStatesConfig**
> RestApiResultFulfillmentStatesConfiguration createFulfillmentStatesConfig(appId, fulfillmentStateConfiguration)



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
String appId = "appId_example"; // String | 
CreateFulfillmentStatesConfiguration fulfillmentStateConfiguration = new CreateFulfillmentStatesConfiguration(); // CreateFulfillmentStatesConfiguration | 
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
 **appId** | **String**|  |
 **fulfillmentStateConfiguration** | [**CreateFulfillmentStatesConfiguration**](CreateFulfillmentStatesConfiguration.md)|  |

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
String appId = "appId_example"; // String | 
String configId = "configId_example"; // String | 
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
 **appId** | **String**|  |
 **configId** | **String**|  |

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
String appId = "appId_example"; // String | 
String configId = "configId_example"; // String | 
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
 **appId** | **String**|  |
 **configId** | **String**|  |

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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |

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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |

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
String appId = "appId_example"; // String | 
String configId = "configId_example"; // String | 
UpdateFulfillmentStatesConfiguration updateFulfillmentStatesConfiguration = new UpdateFulfillmentStatesConfiguration(); // UpdateFulfillmentStatesConfiguration | 
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
 **appId** | **String**|  |
 **configId** | **String**|  |
 **updateFulfillmentStatesConfiguration** | [**UpdateFulfillmentStatesConfiguration**](UpdateFulfillmentStatesConfiguration.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

