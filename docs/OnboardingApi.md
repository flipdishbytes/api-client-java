# OnboardingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOnboardingConfig**](OnboardingApi.md#getOnboardingConfig) | **GET** /api/v1.0/clients/{appId}/onboarding/config | 
[**getOnboardingConfigs**](OnboardingApi.md#getOnboardingConfigs) | **GET** /api/v1.0/clients/{appId}/onboarding/configs | 
[**getOnboardingItems**](OnboardingApi.md#getOnboardingItems) | **GET** /api/v1.0/clients/{appId}/onboarding/stores/{storeId} | 
[**getOnboardingItemsV2**](OnboardingApi.md#getOnboardingItemsV2) | **GET** /api/v1.0/clients/{appId}/onboarding/stores | 
[**updateOnboardingConfig**](OnboardingApi.md#updateOnboardingConfig) | **POST** /api/v1.0/clients/{appId}/onboarding/config | 
[**updateOnboardingConfigById**](OnboardingApi.md#updateOnboardingConfigById) | **POST** /api/v1.0/clients/{appId}/onboarding/config/{configId} | 
[**updateOnboardingItem**](OnboardingApi.md#updateOnboardingItem) | **POST** /api/v1.0/clients/{appId}/onboarding/stores/{storeId}/items/{onboardingItemId} | 
[**updateOnboardingItemV2**](OnboardingApi.md#updateOnboardingItemV2) | **POST** /api/v1.0/clients/{appId}/onboarding/stores/items/{onboardingItemId} | 


<a name="getOnboardingConfig"></a>
# **getOnboardingConfig**
> RestApiResultOnboardingConfig getOnboardingConfig(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultOnboardingConfig result = apiInstance.getOnboardingConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultOnboardingConfig**](RestApiResultOnboardingConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOnboardingConfigs"></a>
# **getOnboardingConfigs**
> RestApiArrayResultOnboardingConfig getOnboardingConfigs(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultOnboardingConfig result = apiInstance.getOnboardingConfigs(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultOnboardingConfig**](RestApiArrayResultOnboardingConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOnboardingItems"></a>
# **getOnboardingItems**
> RestApiResultOnboardingProcess getOnboardingItems(appId, storeId, milestoneId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
Integer milestoneId = 56; // Integer | 
try {
    RestApiResultOnboardingProcess result = apiInstance.getOnboardingItems(appId, storeId, milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **milestoneId** | **Integer**|  | [optional]

### Return type

[**RestApiResultOnboardingProcess**](RestApiResultOnboardingProcess.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOnboardingItemsV2"></a>
# **getOnboardingItemsV2**
> RestApiResultOnboardingProcess getOnboardingItemsV2(appId, storeId, milestoneId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
Integer milestoneId = 56; // Integer | 
try {
    RestApiResultOnboardingProcess result = apiInstance.getOnboardingItemsV2(appId, storeId, milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#getOnboardingItemsV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  | [optional]
 **milestoneId** | **Integer**|  | [optional]

### Return type

[**RestApiResultOnboardingProcess**](RestApiResultOnboardingProcess.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateOnboardingConfig"></a>
# **updateOnboardingConfig**
> updateOnboardingConfig(appId, configUpdate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
OnboardingConfigUpdate configUpdate = new OnboardingConfigUpdate(); // OnboardingConfigUpdate | 
try {
    apiInstance.updateOnboardingConfig(appId, configUpdate);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#updateOnboardingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **configUpdate** | [**OnboardingConfigUpdate**](OnboardingConfigUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateOnboardingConfigById"></a>
# **updateOnboardingConfigById**
> updateOnboardingConfigById(appId, configId, configUpdate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer configId = 56; // Integer | 
OnboardingConfigUpdate configUpdate = new OnboardingConfigUpdate(); // OnboardingConfigUpdate | 
try {
    apiInstance.updateOnboardingConfigById(appId, configId, configUpdate);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#updateOnboardingConfigById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **configId** | **Integer**|  |
 **configUpdate** | [**OnboardingConfigUpdate**](OnboardingConfigUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateOnboardingItem"></a>
# **updateOnboardingItem**
> updateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
Integer onboardingItemId = 56; // Integer | 
OnboardingItemUpdate itemUpdate = new OnboardingItemUpdate(); // OnboardingItemUpdate | 
try {
    apiInstance.updateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#updateOnboardingItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **onboardingItemId** | **Integer**|  |
 **itemUpdate** | [**OnboardingItemUpdate**](OnboardingItemUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateOnboardingItemV2"></a>
# **updateOnboardingItemV2**
> updateOnboardingItemV2(appId, onboardingItemId, itemUpdate, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer onboardingItemId = 56; // Integer | 
OnboardingItemUpdate itemUpdate = new OnboardingItemUpdate(); // OnboardingItemUpdate | 
Integer storeId = 56; // Integer | 
try {
    apiInstance.updateOnboardingItemV2(appId, onboardingItemId, itemUpdate, storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#updateOnboardingItemV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **onboardingItemId** | **Integer**|  |
 **itemUpdate** | [**OnboardingItemUpdate**](OnboardingItemUpdate.md)|  |
 **storeId** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

