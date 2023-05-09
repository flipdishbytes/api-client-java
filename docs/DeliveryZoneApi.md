# DeliveryZoneApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeliveryZone**](DeliveryZoneApi.md#addDeliveryZone) | **POST** /api/v1.0/stores/{storeId}/deliveryzones | 
[**getDeliveryZones**](DeliveryZoneApi.md#getDeliveryZones) | **GET** /api/v1.0/stores/{storeId}/deliveryzones | 
[**removeDeliveryZone**](DeliveryZoneApi.md#removeDeliveryZone) | **DELETE** /api/v1.0/stores/{storeId}/deliveryzones/{deliveryZoneId} | 
[**updateDeliveryZone**](DeliveryZoneApi.md#updateDeliveryZone) | **POST** /api/v1.0/stores/{storeId}/deliveryzones/{deliveryZoneId} | 


<a name="addDeliveryZone"></a>
# **addDeliveryZone**
> RestApiResultDeliveryZone addDeliveryZone(storeId, deliveryZoneBase)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryZoneApi apiInstance = new DeliveryZoneApi();
Integer storeId = 56; // Integer | 
DeliveryZoneBase deliveryZoneBase = new DeliveryZoneBase(); // DeliveryZoneBase | 
try {
    RestApiResultDeliveryZone result = apiInstance.addDeliveryZone(storeId, deliveryZoneBase);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryZoneApi#addDeliveryZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryZoneBase** | [**DeliveryZoneBase**](DeliveryZoneBase.md)|  |

### Return type

[**RestApiResultDeliveryZone**](RestApiResultDeliveryZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getDeliveryZones"></a>
# **getDeliveryZones**
> RestApiArrayResultDeliveryZone getDeliveryZones(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryZoneApi apiInstance = new DeliveryZoneApi();
Integer storeId = 56; // Integer | 
try {
    RestApiArrayResultDeliveryZone result = apiInstance.getDeliveryZones(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryZoneApi#getDeliveryZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiArrayResultDeliveryZone**](RestApiArrayResultDeliveryZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeDeliveryZone"></a>
# **removeDeliveryZone**
> removeDeliveryZone(storeId, deliveryZoneId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryZoneApi apiInstance = new DeliveryZoneApi();
Integer storeId = 56; // Integer | 
Integer deliveryZoneId = 56; // Integer | 
try {
    apiInstance.removeDeliveryZone(storeId, deliveryZoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryZoneApi#removeDeliveryZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryZoneId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateDeliveryZone"></a>
# **updateDeliveryZone**
> RestApiResultDeliveryZone updateDeliveryZone(storeId, deliveryZoneId, deliveryZone)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryZoneApi apiInstance = new DeliveryZoneApi();
Integer storeId = 56; // Integer | 
Integer deliveryZoneId = 56; // Integer | 
DeliveryZoneBase deliveryZone = new DeliveryZoneBase(); // DeliveryZoneBase | 
try {
    RestApiResultDeliveryZone result = apiInstance.updateDeliveryZone(storeId, deliveryZoneId, deliveryZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryZoneApi#updateDeliveryZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryZoneId** | **Integer**|  |
 **deliveryZone** | [**DeliveryZoneBase**](DeliveryZoneBase.md)|  |

### Return type

[**RestApiResultDeliveryZone**](RestApiResultDeliveryZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

