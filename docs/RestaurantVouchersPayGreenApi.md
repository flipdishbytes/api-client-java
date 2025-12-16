# RestaurantVouchersPayGreenApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayGreenConfiguration**](RestaurantVouchersPayGreenApi.md#createPayGreenConfiguration) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen | 
[**deletePayGreenConfiguration**](RestaurantVouchersPayGreenApi.md#deletePayGreenConfiguration) | **DELETE** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**getElegibleStores**](RestaurantVouchersPayGreenApi.md#getElegibleStores) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores | 
[**getPayGreenConfigurations**](RestaurantVouchersPayGreenApi.md#getPayGreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen | 
[**getStoreAvailablePayGreenConfigurations**](RestaurantVouchersPayGreenApi.md#getStoreAvailablePayGreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId}/available-configurations | 
[**getStorePayGreenConfiguration_**](RestaurantVouchersPayGreenApi.md#getStorePayGreenConfiguration_) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId} | 
[**listPayGreenConfigurations**](RestaurantVouchersPayGreenApi.md#listPayGreenConfigurations) | **GET** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**updatePayGreenConfiguration**](RestaurantVouchersPayGreenApi.md#updatePayGreenConfiguration) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen/{paygreenConfigurationId} | 
[**updateStorePayGreenConfiguration_**](RestaurantVouchersPayGreenApi.md#updateStorePayGreenConfiguration_) | **POST** /api/v1.0/{appId}/restaurant-vouchers/paygreen/stores/{storeId} | 


<a name="createPayGreenConfiguration"></a>
# **createPayGreenConfiguration**
> RestApiResultRestaurantVoucherPayGreenConfiguration createPayGreenConfiguration(appId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
CreatePayGreenConfigurationRequest request = new CreatePayGreenConfigurationRequest(); // CreatePayGreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPayGreenConfiguration result = apiInstance.createPayGreenConfiguration(appId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#createPayGreenConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **request** | [**CreatePayGreenConfigurationRequest**](CreatePayGreenConfigurationRequest.md)|  |

### Return type

[**RestApiResultRestaurantVoucherPayGreenConfiguration**](RestApiResultRestaurantVoucherPayGreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deletePayGreenConfiguration"></a>
# **deletePayGreenConfiguration**
> Object deletePayGreenConfiguration(appId, paygreenConfigurationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
try {
    Object result = apiInstance.deletePayGreenConfiguration(appId, paygreenConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#deletePayGreenConfiguration");
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

<a name="getElegibleStores"></a>
# **getElegibleStores**
> RestApiArrayResultRestaurantVoucherEligibleStore getElegibleStores(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultRestaurantVoucherEligibleStore result = apiInstance.getElegibleStores(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#getElegibleStores");
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

<a name="getPayGreenConfigurations"></a>
# **getPayGreenConfigurations**
> RestApiArrayResultRestaurantVoucherPayGreenConfiguration getPayGreenConfigurations(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultRestaurantVoucherPayGreenConfiguration result = apiInstance.getPayGreenConfigurations(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#getPayGreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultRestaurantVoucherPayGreenConfiguration**](RestApiArrayResultRestaurantVoucherPayGreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreAvailablePayGreenConfigurations"></a>
# **getStoreAvailablePayGreenConfigurations**
> RestApiArrayResultRestaurantVoucherPayGreenConfigurationSummary getStoreAvailablePayGreenConfigurations(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiArrayResultRestaurantVoucherPayGreenConfigurationSummary result = apiInstance.getStoreAvailablePayGreenConfigurations(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#getStoreAvailablePayGreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiArrayResultRestaurantVoucherPayGreenConfigurationSummary**](RestApiArrayResultRestaurantVoucherPayGreenConfigurationSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStorePayGreenConfiguration_"></a>
# **getStorePayGreenConfiguration_**
> RestApiResultRestaurantVoucherPayGreenStoreConfiguration getStorePayGreenConfiguration_(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultRestaurantVoucherPayGreenStoreConfiguration result = apiInstance.getStorePayGreenConfiguration_(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#getStorePayGreenConfiguration_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultRestaurantVoucherPayGreenStoreConfiguration**](RestApiResultRestaurantVoucherPayGreenStoreConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="listPayGreenConfigurations"></a>
# **listPayGreenConfigurations**
> RestApiResultRestaurantVoucherPayGreenConfiguration listPayGreenConfigurations(appId, paygreenConfigurationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
try {
    RestApiResultRestaurantVoucherPayGreenConfiguration result = apiInstance.listPayGreenConfigurations(appId, paygreenConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#listPayGreenConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **paygreenConfigurationId** | **Integer**|  |

### Return type

[**RestApiResultRestaurantVoucherPayGreenConfiguration**](RestApiResultRestaurantVoucherPayGreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePayGreenConfiguration"></a>
# **updatePayGreenConfiguration**
> RestApiResultRestaurantVoucherPayGreenConfiguration updatePayGreenConfiguration(appId, paygreenConfigurationId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer paygreenConfigurationId = 56; // Integer | 
UpdatePayGreenConfigurationRequest request = new UpdatePayGreenConfigurationRequest(); // UpdatePayGreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPayGreenConfiguration result = apiInstance.updatePayGreenConfiguration(appId, paygreenConfigurationId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#updatePayGreenConfiguration");
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

[**RestApiResultRestaurantVoucherPayGreenConfiguration**](RestApiResultRestaurantVoucherPayGreenConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStorePayGreenConfiguration_"></a>
# **updateStorePayGreenConfiguration_**
> RestApiResultRestaurantVoucherPayGreenStoreConfiguration updateStorePayGreenConfiguration_(appId, storeId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.RestaurantVouchersPayGreenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RestaurantVouchersPayGreenApi apiInstance = new RestaurantVouchersPayGreenApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
UpdateStorePayGreenConfigurationRequest request = new UpdateStorePayGreenConfigurationRequest(); // UpdateStorePayGreenConfigurationRequest | 
try {
    RestApiResultRestaurantVoucherPayGreenStoreConfiguration result = apiInstance.updateStorePayGreenConfiguration_(appId, storeId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RestaurantVouchersPayGreenApi#updateStorePayGreenConfiguration_");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **request** | [**UpdateStorePayGreenConfigurationRequest**](UpdateStorePayGreenConfigurationRequest.md)|  |

### Return type

[**RestApiResultRestaurantVoucherPayGreenStoreConfiguration**](RestApiResultRestaurantVoucherPayGreenStoreConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

