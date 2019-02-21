# DeliveryZoneApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDeliveryZone**](DeliveryZoneApi.md#addDeliveryZone) | **POST** /api/v1.0/stores/{storeId}/deliveryzones | Adds a delivery zone to the store id
[**getDeliveryZones**](DeliveryZoneApi.md#getDeliveryZones) | **GET** /api/v1.0/stores/{storeId}/deliveryzones | Get all the delivery zones associated with a store
[**removeDeliveryZone**](DeliveryZoneApi.md#removeDeliveryZone) | **DELETE** /api/v1.0/stores/{storeId}/deliveryzones/{deliveryZoneId} | Removes the existing delivery zone
[**updateDeliveryZone**](DeliveryZoneApi.md#updateDeliveryZone) | **POST** /api/v1.0/stores/{storeId}/deliveryzones/{deliveryZoneId} | Updates the existing delivery zone


<a name="addDeliveryZone"></a>
# **addDeliveryZone**
> RestApiResultDeliveryZone addDeliveryZone(storeId, deliveryZoneBase)

Adds a delivery zone to the store id

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
Integer storeId = 56; // Integer | Store Id to which the delivery zone will be added
DeliveryZoneBase deliveryZoneBase = new DeliveryZoneBase(); // DeliveryZoneBase | Optional delivery zone, if not supplied will create a default zone
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
 **storeId** | **Integer**| Store Id to which the delivery zone will be added |
 **deliveryZoneBase** | [**DeliveryZoneBase**](DeliveryZoneBase.md)| Optional delivery zone, if not supplied will create a default zone |

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

Get all the delivery zones associated with a store

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
Integer storeId = 56; // Integer | Store Id to which the delivery zones are associated
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
 **storeId** | **Integer**| Store Id to which the delivery zones are associated |

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

Removes the existing delivery zone

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
Integer storeId = 56; // Integer | Store Id to which the delivery zone belongs
Integer deliveryZoneId = 56; // Integer | Delivery zone id to be removed
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
 **storeId** | **Integer**| Store Id to which the delivery zone belongs |
 **deliveryZoneId** | **Integer**| Delivery zone id to be removed |

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

Updates the existing delivery zone

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
Integer storeId = 56; // Integer | Store Id to which the delivery zone belongs
Integer deliveryZoneId = 56; // Integer | Delivery zone id to be updated
DeliveryZoneBase deliveryZone = new DeliveryZoneBase(); // DeliveryZoneBase | Delta of delivery zone parameters that need to be changed
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
 **storeId** | **Integer**| Store Id to which the delivery zone belongs |
 **deliveryZoneId** | **Integer**| Delivery zone id to be updated |
 **deliveryZone** | [**DeliveryZoneBase**](DeliveryZoneBase.md)| Delta of delivery zone parameters that need to be changed |

### Return type

[**RestApiResultDeliveryZone**](RestApiResultDeliveryZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

