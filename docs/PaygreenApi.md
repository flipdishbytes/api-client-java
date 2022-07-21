# PaygreenApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayGreenConfiguration**](PaygreenApi.md#createPayGreenConfiguration) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen | 
[**deletePaygreenConfiguration**](PaygreenApi.md#deletePaygreenConfiguration) | **DELETE** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**getPaygreenConfigurations**](PaygreenApi.md#getPaygreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen | 
[**getStoreAvailablePayGreenConfigurations**](PaygreenApi.md#getStoreAvailablePayGreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId}/available-configurations | 
[**getStorePayGreenConfiguration**](PaygreenApi.md#getStorePayGreenConfiguration) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores | 
[**getStorePayGreenConfiguration_**](PaygreenApi.md#getStorePayGreenConfiguration_) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId} | 
[**listPayGreenConfigurations**](PaygreenApi.md#listPayGreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**updatePayGreenConfiguration**](PaygreenApi.md#updatePayGreenConfiguration) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**updateStorePayGreenConfiguration_**](PaygreenApi.md#updateStorePayGreenConfiguration_) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId} | 


<a name="createPayGreenConfiguration"></a>
# **createPayGreenConfiguration**
> RestApiResultRestaurantVoucherPaygreenConfiguration createPayGreenConfiguration(appId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
CreatePayGreenConfigurationRequest request = new CreatePayGreenConfigurationRequest(); // CreatePayGreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPaygreenConfiguration result = apiInstance.createPayGreenConfiguration(appId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#createPayGreenConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **request** | [**CreatePayGreenConfigurationRequest**](CreatePayGreenConfigurationRequest.md)|  |

### Return type

[**RestApiResultRestaurantVoucherPaygreenConfiguration**](RestApiResultRestaurantVoucherPaygreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deletePaygreenConfiguration"></a>
# **deletePaygreenConfiguration**
> Object deletePaygreenConfiguration(appId, paygreenConfigurationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
try {
    Object result = apiInstance.deletePaygreenConfiguration(appId, paygreenConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#deletePaygreenConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **paygreenConfigurationId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPaygreenConfigurations"></a>
# **getPaygreenConfigurations**
> RestApiArrayResultRestaurantVoucherPaygreenConfiguration getPaygreenConfigurations(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultRestaurantVoucherPaygreenConfiguration result = apiInstance.getPaygreenConfigurations(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#getPaygreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultRestaurantVoucherPaygreenConfiguration**](RestApiArrayResultRestaurantVoucherPaygreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreAvailablePayGreenConfigurations"></a>
# **getStoreAvailablePayGreenConfigurations**
> RestApiArrayResultRestaurantVoucherPaygreenConfigurationSummary getStoreAvailablePayGreenConfigurations(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiArrayResultRestaurantVoucherPaygreenConfigurationSummary result = apiInstance.getStoreAvailablePayGreenConfigurations(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#getStoreAvailablePayGreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiArrayResultRestaurantVoucherPaygreenConfigurationSummary**](RestApiArrayResultRestaurantVoucherPaygreenConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStorePayGreenConfiguration"></a>
# **getStorePayGreenConfiguration**
> RestApiArrayResultRestaurantVoucherEligibleStore getStorePayGreenConfiguration(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultRestaurantVoucherEligibleStore result = apiInstance.getStorePayGreenConfiguration(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#getStorePayGreenConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultRestaurantVoucherEligibleStore**](RestApiArrayResultRestaurantVoucherEligibleStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStorePayGreenConfiguration_"></a>
# **getStorePayGreenConfiguration_**
> RestApiResultRestaurantVoucherPaygreenStoreConfiguration getStorePayGreenConfiguration_(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultRestaurantVoucherPaygreenStoreConfiguration result = apiInstance.getStorePayGreenConfiguration_(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#getStorePayGreenConfiguration_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultRestaurantVoucherPaygreenStoreConfiguration**](RestApiResultRestaurantVoucherPaygreenStoreConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="listPayGreenConfigurations"></a>
# **listPayGreenConfigurations**
> RestApiResultRestaurantVoucherPaygreenConfiguration listPayGreenConfigurations(appId, paygreenConfigurationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
try {
    RestApiResultRestaurantVoucherPaygreenConfiguration result = apiInstance.listPayGreenConfigurations(appId, paygreenConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#listPayGreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **paygreenConfigurationId** | **Integer**|  |

### Return type

[**RestApiResultRestaurantVoucherPaygreenConfiguration**](RestApiResultRestaurantVoucherPaygreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePayGreenConfiguration"></a>
# **updatePayGreenConfiguration**
> RestApiResultRestaurantVoucherPaygreenConfiguration updatePayGreenConfiguration(appId, paygreenConfigurationId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
UpdatePayGreenConfigurationRequest request = new UpdatePayGreenConfigurationRequest(); // UpdatePayGreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPaygreenConfiguration result = apiInstance.updatePayGreenConfiguration(appId, paygreenConfigurationId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#updatePayGreenConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **paygreenConfigurationId** | **Integer**|  |
 **request** | [**UpdatePayGreenConfigurationRequest**](UpdatePayGreenConfigurationRequest.md)|  |

### Return type

[**RestApiResultRestaurantVoucherPaygreenConfiguration**](RestApiResultRestaurantVoucherPaygreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStorePayGreenConfiguration_"></a>
# **updateStorePayGreenConfiguration_**
> RestApiResultRestaurantVoucherPaygreenStoreConfiguration updateStorePayGreenConfiguration_(appId, storeId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PaygreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PaygreenApi apiInstance = new PaygreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
UpdateStorePaygreenConfigurationRequest request = new UpdateStorePaygreenConfigurationRequest(); // UpdateStorePaygreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPaygreenStoreConfiguration result = apiInstance.updateStorePayGreenConfiguration_(appId, storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaygreenApi#updateStorePayGreenConfiguration_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **request** | [**UpdateStorePaygreenConfigurationRequest**](UpdateStorePaygreenConfigurationRequest.md)|  |

### Return type

[**RestApiResultRestaurantVoucherPaygreenStoreConfiguration**](RestApiResultRestaurantVoucherPaygreenStoreConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

