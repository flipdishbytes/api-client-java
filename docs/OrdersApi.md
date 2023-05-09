# OrdersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptOrder**](OrdersApi.md#acceptOrder) | **POST** /api/v1.0/orders/{id}/accept | 
[**dispatchOrder**](OrdersApi.md#dispatchOrder) | **POST** /api/v1.0/orders/{id}/dispatch | 
[**getDeliveryInformation**](OrdersApi.md#getDeliveryInformation) | **GET** /api/v1.0/orders/{orderId}/deliveryinfo | 
[**getFulfillmentState**](OrdersApi.md#getFulfillmentState) | **GET** /api/v1.0/orders/{orderId}/fulfillment/state | 
[**getFulfillmentStatusWithDetailsAndActions**](OrdersApi.md#getFulfillmentStatusWithDetailsAndActions) | **GET** /api/v1.0/orders/{orderId}/fulfillment/state/details | 
[**getOrderById**](OrdersApi.md#getOrderById) | **GET** /api/v1.0/orders/{id} | 
[**getOrders**](OrdersApi.md#getOrders) | **GET** /api/v1.0/orders | 
[**getOrdersSummary**](OrdersApi.md#getOrdersSummary) | **GET** /api/v1.0/{appId}/orders/summaries | 
[**refundOrder**](OrdersApi.md#refundOrder) | **POST** /api/v1.0/orders/{id}/refund | 
[**rejectOrder**](OrdersApi.md#rejectOrder) | **POST** /api/v1.0/orders/{id}/reject | 
[**searchFulfillmentStatuses**](OrdersApi.md#searchFulfillmentStatuses) | **GET** /api/v1.0/{appId}/orders/fulfillmentstatuses | 
[**updateDeliveryInformation**](OrdersApi.md#updateDeliveryInformation) | **POST** /api/v1.0/orders/{orderId}/deliveryinfo | 
[**updateFulfillmentState**](OrdersApi.md#updateFulfillmentState) | **POST** /api/v1.0/orders/{orderId}/fulfillment/state | 


<a name="acceptOrder"></a>
# **acceptOrder**
> acceptOrder(id, acceptObject)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | 
Accept acceptObject = new Accept(); // Accept | 
try {
    apiInstance.acceptOrder(id, acceptObject);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#acceptOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **acceptObject** | [**Accept**](Accept.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="dispatchOrder"></a>
# **dispatchOrder**
> dispatchOrder(id)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | 
try {
    apiInstance.dispatchOrder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#dispatchOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getDeliveryInformation"></a>
# **getDeliveryInformation**
> RestApiResultOrderDeliveryInformation getDeliveryInformation(orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    RestApiResultOrderDeliveryInformation result = apiInstance.getDeliveryInformation(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getDeliveryInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**RestApiResultOrderDeliveryInformation**](RestApiResultOrderDeliveryInformation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFulfillmentState"></a>
# **getFulfillmentState**
> RestApiResultOrderFulfillmentStatus getFulfillmentState(orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    RestApiResultOrderFulfillmentStatus result = apiInstance.getFulfillmentState(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getFulfillmentState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**RestApiResultOrderFulfillmentStatus**](RestApiResultOrderFulfillmentStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFulfillmentStatusWithDetailsAndActions"></a>
# **getFulfillmentStatusWithDetailsAndActions**
> RestApiResultOrderFulfillmentStatusWithConfigurationActions getFulfillmentStatusWithDetailsAndActions(orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
try {
    RestApiResultOrderFulfillmentStatusWithConfigurationActions result = apiInstance.getFulfillmentStatusWithDetailsAndActions(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getFulfillmentStatusWithDetailsAndActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**RestApiResultOrderFulfillmentStatusWithConfigurationActions**](RestApiResultOrderFulfillmentStatusWithConfigurationActions.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderById"></a>
# **getOrderById**
> RestApiResultOrder getOrderById(id)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | 
try {
    RestApiResultOrder result = apiInstance.getOrderById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**RestApiResultOrder**](RestApiResultOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrders"></a>
# **getOrders**
> RestApiPaginationResultOrder getOrders(physicalRestaurantId, state, from, to, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
List<Integer> physicalRestaurantId = Arrays.asList(56); // List<Integer> | 
List<String> state = Arrays.asList("state_example"); // List<String> | 
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultOrder result = apiInstance.getOrders(physicalRestaurantId, state, from, to, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **physicalRestaurantId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **state** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Created, PlacedCanBeCancelled, ReadyToProcess, AcceptedByRestaurant, Dispatched, Delivered, Cancelled, ManualReview, RejectedByStore, RejectedByFlipdish, RejectedAutomatically, RejectedAfterBeingAccepted, AcceptedAndRefunded]
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultOrder**](RestApiPaginationResultOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrdersSummary"></a>
# **getOrdersSummary**
> RestApiPaginationResultOrderSummary getOrdersSummary(appId, searchQuery, physicalRestaurantId, state, page, limit, orderByRequestedForTime, channels, orderIds, from, to)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String appId = "appId_example"; // String | 
String searchQuery = "searchQuery_example"; // String | 
List<Integer> physicalRestaurantId = Arrays.asList(56); // List<Integer> | 
List<String> state = Arrays.asList("state_example"); // List<String> | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
Boolean orderByRequestedForTime = true; // Boolean | 
List<String> channels = Arrays.asList("channels_example"); // List<String> | 
List<Integer> orderIds = Arrays.asList(56); // List<Integer> | 
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
try {
    RestApiPaginationResultOrderSummary result = apiInstance.getOrdersSummary(appId, searchQuery, physicalRestaurantId, state, page, limit, orderByRequestedForTime, channels, orderIds, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrdersSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **searchQuery** | **String**|  | [optional]
 **physicalRestaurantId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **state** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Created, PlacedCanBeCancelled, ReadyToProcess, AcceptedByRestaurant, Dispatched, Delivered, Cancelled, ManualReview, RejectedByStore, RejectedByFlipdish, RejectedAutomatically, RejectedAfterBeingAccepted, AcceptedAndRefunded]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderByRequestedForTime** | **Boolean**|  | [optional]
 **channels** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Unknown, Ios, Android, Web, Kiosk, Pos, TelephoneCall, Sms, PwaAndroid, PwaIos, Google]
 **orderIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

[**RestApiPaginationResultOrderSummary**](RestApiPaginationResultOrderSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="refundOrder"></a>
# **refundOrder**
> refundOrder(id, refundObject)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | 
Refund refundObject = new Refund(); // Refund | 
try {
    apiInstance.refundOrder(id, refundObject);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#refundOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **refundObject** | [**Refund**](Refund.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="rejectOrder"></a>
# **rejectOrder**
> rejectOrder(id, rejectObject)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer id = 56; // Integer | 
Reject rejectObject = new Reject(); // Reject | 
try {
    apiInstance.rejectOrder(id, rejectObject);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#rejectOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **rejectObject** | [**Reject**](Reject.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchFulfillmentStatuses"></a>
# **searchFulfillmentStatuses**
> RestApiArrayResultOrderFulfillmentStatus searchFulfillmentStatuses(appId, orderIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String appId = "appId_example"; // String | 
String orderIds = "orderIds_example"; // String | 
try {
    RestApiArrayResultOrderFulfillmentStatus result = apiInstance.searchFulfillmentStatuses(appId, orderIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#searchFulfillmentStatuses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderIds** | **String**|  |

### Return type

[**RestApiArrayResultOrderFulfillmentStatus**](RestApiArrayResultOrderFulfillmentStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateDeliveryInformation"></a>
# **updateDeliveryInformation**
> updateDeliveryInformation(orderId, deliveryInformation)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
OrderDeliveryInformationBase deliveryInformation = new OrderDeliveryInformationBase(); // OrderDeliveryInformationBase | 
try {
    apiInstance.updateDeliveryInformation(orderId, deliveryInformation);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateDeliveryInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **deliveryInformation** | [**OrderDeliveryInformationBase**](OrderDeliveryInformationBase.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateFulfillmentState"></a>
# **updateFulfillmentState**
> updateFulfillmentState(orderId, fulfillmentStatusRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
Integer orderId = 56; // Integer | 
OrderFulfillmentStatusUpdate fulfillmentStatusRequest = new OrderFulfillmentStatusUpdate(); // OrderFulfillmentStatusUpdate | 
try {
    apiInstance.updateFulfillmentState(orderId, fulfillmentStatusRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#updateFulfillmentState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **fulfillmentStatusRequest** | [**OrderFulfillmentStatusUpdate**](OrderFulfillmentStatusUpdate.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

