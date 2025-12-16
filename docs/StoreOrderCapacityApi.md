# StoreOrderCapacityApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStoreOrderCapacity**](StoreOrderCapacityApi.md#getStoreOrderCapacity) | **GET** /api/v1.0/{appId}/storeordercapacity/{storeId}/{deliveryType} | 
[**updateStoreOrderCapacityConfig**](StoreOrderCapacityApi.md#updateStoreOrderCapacityConfig) | **POST** /api/v1.0/{appId}/storeordercapacity/{storeId} | 


<a name="getStoreOrderCapacity"></a>
# **getStoreOrderCapacity**
> RestApiResultStoreOrderCapacityConfig getStoreOrderCapacity(appId, storeId, deliveryType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreOrderCapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreOrderCapacityApi apiInstance = new StoreOrderCapacityApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
try {
    RestApiResultStoreOrderCapacityConfig result = apiInstance.getStoreOrderCapacity(appId, storeId, deliveryType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreOrderCapacityApi#getStoreOrderCapacity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]

### Return type

[**RestApiResultStoreOrderCapacityConfig**](RestApiResultStoreOrderCapacityConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStoreOrderCapacityConfig"></a>
# **updateStoreOrderCapacityConfig**
> updateStoreOrderCapacityConfig(storeId, deliveryType, newOrderCapacityConfig, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreOrderCapacityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreOrderCapacityApi apiInstance = new StoreOrderCapacityApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
StoreOrderCapacityConfigEditModel newOrderCapacityConfig = new StoreOrderCapacityConfigEditModel(); // StoreOrderCapacityConfigEditModel | 
String appId = "appId_example"; // String | 
try {
    apiInstance.updateStoreOrderCapacityConfig(storeId, deliveryType, newOrderCapacityConfig, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreOrderCapacityApi#updateStoreOrderCapacityConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **newOrderCapacityConfig** | [**StoreOrderCapacityConfigEditModel**](StoreOrderCapacityConfigEditModel.md)|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

