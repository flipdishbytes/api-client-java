# DeliveryTrackingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDriverToOrder**](DeliveryTrackingApi.md#assignDriverToOrder) | **POST** /api/v1.0/{appId}/drivers/{driverId}/orders/{orderId} | 
[**assignDriverToOrders**](DeliveryTrackingApi.md#assignDriverToOrders) | **POST** /api/v1.0/{appId}/drivers/{driverId}/orders | 
[**getDrivers**](DeliveryTrackingApi.md#getDrivers) | **GET** /api/v1.0/{appId}/drivers | 
[**inviteDriverToApp**](DeliveryTrackingApi.md#inviteDriverToApp) | **POST** /api/v1.0/{appId}/drivers | 
[**removeDriverFromApp**](DeliveryTrackingApi.md#removeDriverFromApp) | **DELETE** /api/v1.0/{appId}/drivers/{driverId} | 
[**unassignDriverFromOrder**](DeliveryTrackingApi.md#unassignDriverFromOrder) | **DELETE** /api/v1.0/{appId}/orders/{orderId}/driver | 


<a name="assignDriverToOrder"></a>
# **assignDriverToOrder**
> assignDriverToOrder(appId, orderId, driverId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
Integer orderId = 56; // Integer | 
Integer driverId = 56; // Integer | 
try {
    apiInstance.assignDriverToOrder(appId, orderId, driverId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#assignDriverToOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderId** | **Integer**|  |
 **driverId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="assignDriverToOrders"></a>
# **assignDriverToOrders**
> assignDriverToOrders(appId, driverId, orderIdAndSequenceNumbers)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
Integer driverId = 56; // Integer | 
List<OrderIdAndSequenceNumber> orderIdAndSequenceNumbers = Arrays.asList(new OrderIdAndSequenceNumber()); // List<OrderIdAndSequenceNumber> | 
try {
    apiInstance.assignDriverToOrders(appId, driverId, orderIdAndSequenceNumbers);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#assignDriverToOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **driverId** | **Integer**|  |
 **orderIdAndSequenceNumbers** | [**List&lt;OrderIdAndSequenceNumber&gt;**](OrderIdAndSequenceNumber.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getDrivers"></a>
# **getDrivers**
> RestApiArrayResultDriver getDrivers(appId, name, phoneNumber, storeId, presence)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
String name = "name_example"; // String | 
String phoneNumber = "phoneNumber_example"; // String | 
Integer storeId = 56; // Integer | 
String presence = "presence_example"; // String | 
try {
    RestApiArrayResultDriver result = apiInstance.getDrivers(appId, name, phoneNumber, storeId, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#getDrivers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **name** | **String**|  | [optional]
 **phoneNumber** | **String**|  | [optional]
 **storeId** | **Integer**|  | [optional]
 **presence** | **String**|  | [optional] [enum: Offline, Online]

### Return type

[**RestApiArrayResultDriver**](RestApiArrayResultDriver.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="inviteDriverToApp"></a>
# **inviteDriverToApp**
> RestApiResultDriver inviteDriverToApp(appId, driverInvitation)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
DriverInvitation driverInvitation = new DriverInvitation(); // DriverInvitation | 
try {
    RestApiResultDriver result = apiInstance.inviteDriverToApp(appId, driverInvitation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#inviteDriverToApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **driverInvitation** | [**DriverInvitation**](DriverInvitation.md)|  |

### Return type

[**RestApiResultDriver**](RestApiResultDriver.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeDriverFromApp"></a>
# **removeDriverFromApp**
> removeDriverFromApp(appId, driverId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
Integer driverId = 56; // Integer | 
try {
    apiInstance.removeDriverFromApp(appId, driverId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#removeDriverFromApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **driverId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unassignDriverFromOrder"></a>
# **unassignDriverFromOrder**
> unassignDriverFromOrder(appId, orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeliveryTrackingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeliveryTrackingApi apiInstance = new DeliveryTrackingApi();
String appId = "appId_example"; // String | 
Integer orderId = 56; // Integer | 
try {
    apiInstance.unassignDriverFromOrder(appId, orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryTrackingApi#unassignDriverFromOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

