# OnboardingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onboardingGetOnboardingConfig**](OnboardingApi.md#onboardingGetOnboardingConfig) | **GET** /api/v1.0/clients/{appId}/onboarding/config | 
[**onboardingGetOnboardingConfigs**](OnboardingApi.md#onboardingGetOnboardingConfigs) | **GET** /api/v1.0/clients/{appId}/onboarding/configs | 
[**onboardingGetOnboardingItems**](OnboardingApi.md#onboardingGetOnboardingItems) | **GET** /api/v1.0/clients/{appId}/onboarding/stores/{storeId} | 
[**onboardingUpdateOnboardingConfig**](OnboardingApi.md#onboardingUpdateOnboardingConfig) | **POST** /api/v1.0/clients/{appId}/onboarding/config | 
[**onboardingUpdateOnboardingConfigById**](OnboardingApi.md#onboardingUpdateOnboardingConfigById) | **POST** /api/v1.0/clients/{appId}/onboarding/config/{configId} | 
[**onboardingUpdateOnboardingItem**](OnboardingApi.md#onboardingUpdateOnboardingItem) | **POST** /api/v1.0/clients/{appId}/onboarding/stores/{storeId}/items/{onboardingItemId} | 


<a name="onboardingGetOnboardingConfig"></a>
# **onboardingGetOnboardingConfig**
> Object onboardingGetOnboardingConfig(appId)



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
    Object result = apiInstance.onboardingGetOnboardingConfig(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingGetOnboardingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingGetOnboardingConfigs"></a>
# **onboardingGetOnboardingConfigs**
> Object onboardingGetOnboardingConfigs(appId)



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
    Object result = apiInstance.onboardingGetOnboardingConfigs(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingGetOnboardingConfigs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingGetOnboardingItems"></a>
# **onboardingGetOnboardingItems**
> Object onboardingGetOnboardingItems(appId, storeId, milestoneId)



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
    Object result = apiInstance.onboardingGetOnboardingItems(appId, storeId, milestoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingGetOnboardingItems");
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

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingUpdateOnboardingConfig"></a>
# **onboardingUpdateOnboardingConfig**
> Object onboardingUpdateOnboardingConfig(appId, configUpdate)



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
    Object result = apiInstance.onboardingUpdateOnboardingConfig(appId, configUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingUpdateOnboardingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **configUpdate** | [**OnboardingConfigUpdate**](OnboardingConfigUpdate.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingUpdateOnboardingConfigById"></a>
# **onboardingUpdateOnboardingConfigById**
> Object onboardingUpdateOnboardingConfigById(appId, configId, configUpdate)



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
    Object result = apiInstance.onboardingUpdateOnboardingConfigById(appId, configId, configUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingUpdateOnboardingConfigById");
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

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingUpdateOnboardingItem"></a>
# **onboardingUpdateOnboardingItem**
> Object onboardingUpdateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate)



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
    Object result = apiInstance.onboardingUpdateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingUpdateOnboardingItem");
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

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

