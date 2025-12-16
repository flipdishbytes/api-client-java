# OrderBatchingConfigurationApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](OrderBatchingConfigurationApi.md#get) | **GET** /api/v1.0/stores/{storeId}/order-batching-configuration | 
[**post**](OrderBatchingConfigurationApi.md#post) | **POST** /api/v1.0/stores/{storeId}/order-batching-configuration | 


<a name="get"></a>
# **get**
> RestApiResultOrderBatchingConfiguration get(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderBatchingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderBatchingConfigurationApi apiInstance = new OrderBatchingConfigurationApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultOrderBatchingConfiguration result = apiInstance.get(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBatchingConfigurationApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultOrderBatchingConfiguration**](RestApiResultOrderBatchingConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="post"></a>
# **post**
> post(storeId, setOrderBatchingConfiguration)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrderBatchingConfigurationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrderBatchingConfigurationApi apiInstance = new OrderBatchingConfigurationApi();
Integer storeId = 56; // Integer | 
SetOrderBatchingConfiguration setOrderBatchingConfiguration = new SetOrderBatchingConfiguration(); // SetOrderBatchingConfiguration | 
try {
    apiInstance.post(storeId, setOrderBatchingConfiguration);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBatchingConfigurationApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **setOrderBatchingConfiguration** | [**SetOrderBatchingConfiguration**](SetOrderBatchingConfiguration.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

