# DeliveryTrackingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDriverToOrder**](DeliveryTrackingApi.md#assignDriverToOrder) | **POST** /api/v1.0/{appId}/drivers/{driverId}/orders/{orderId} | [PRIVATE] Assign driver to order
[**assignDriverToOrders**](DeliveryTrackingApi.md#assignDriverToOrders) | **POST** /api/v1.0/{appId}/drivers/{driverId}/orders | Assign driver to multiple orders
[**getDrivers**](DeliveryTrackingApi.md#getDrivers) | **GET** /api/v1.0/{appId}/drivers | [PRIVATE] Get drivers by App
[**inviteDriverToApp**](DeliveryTrackingApi.md#inviteDriverToApp) | **POST** /api/v1.0/{appId}/drivers | [PRIVATE] Invite driver
[**removeDriverFromApp**](DeliveryTrackingApi.md#removeDriverFromApp) | **DELETE** /api/v1.0/{appId}/drivers/{driverId} | [PRIVATE] Unassign driver from app
[**unassignDriverFromOrder**](DeliveryTrackingApi.md#unassignDriverFromOrder) | **DELETE** /api/v1.0/{appId}/orders/{orderId}/driver | [PRIVATE] Unassign driver from order


<a name="assignDriverToOrder"></a>
# **assignDriverToOrder**
> assignDriverToOrder(appId, orderId, driverId)

[PRIVATE] Assign driver to order

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
String appId = "appId_example"; // String | Application identifier
Integer orderId = 56; // Integer | Order Id
Integer driverId = 56; // Integer | Driver Id
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
 **appId** | **String**| Application identifier |
 **orderId** | **Integer**| Order Id |
 **driverId** | **Integer**| Driver Id |

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

Assign driver to multiple orders

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
String appId = "appId_example"; // String | Application identifier
Integer driverId = 56; // Integer | Driver Id
List<OrderIdAndSequenceNumber> orderIdAndSequenceNumbers = Arrays.asList(new OrderIdAndSequenceNumber()); // List<OrderIdAndSequenceNumber> | Array of object containing OrderId and Sequence
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
 **appId** | **String**| Application identifier |
 **driverId** | **Integer**| Driver Id |
 **orderIdAndSequenceNumbers** | [**List&lt;OrderIdAndSequenceNumber&gt;**](OrderIdAndSequenceNumber.md)| Array of object containing OrderId and Sequence |

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

[PRIVATE] Get drivers by App

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
String appId = "appId_example"; // String | Application identifier
String name = "name_example"; // String | Driver's username
String phoneNumber = "phoneNumber_example"; // String | Driver's phone number
Integer storeId = 56; // Integer | Store Id
String presence = "presence_example"; // String | Offline/Online
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
 **appId** | **String**| Application identifier |
 **name** | **String**| Driver&#39;s username | [optional]
 **phoneNumber** | **String**| Driver&#39;s phone number | [optional]
 **storeId** | **Integer**| Store Id | [optional]
 **presence** | **String**| Offline/Online | [optional] [enum: Offline, Online]

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

[PRIVATE] Invite driver

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
String appId = "appId_example"; // String | Application identifier
DriverInvitation driverInvitation = new DriverInvitation(); // DriverInvitation | Driver invitation model
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
 **appId** | **String**| Application identifier |
 **driverInvitation** | [**DriverInvitation**](DriverInvitation.md)| Driver invitation model |

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

[PRIVATE] Unassign driver from app

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
String appId = "appId_example"; // String | Application identifier
Integer driverId = 56; // Integer | Driver Id
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
 **appId** | **String**| Application identifier |
 **driverId** | **Integer**| Driver Id |

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

[PRIVATE] Unassign driver from order

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
String appId = "appId_example"; // String | Application identifier
Integer orderId = 56; // Integer | Order Id
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
 **appId** | **String**| Application identifier |
 **orderId** | **Integer**| Order Id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

