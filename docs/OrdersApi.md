# OrdersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptOrder**](OrdersApi.md#acceptOrder) | **POST** /api/v1.0/orders/{id}/accept | Accept order
[**dispatchOrder**](OrdersApi.md#dispatchOrder) | **POST** /api/v1.0/orders/{id}/dispatch | Dispatch order
[**getOrderById**](OrdersApi.md#getOrderById) | **GET** /api/v1.0/orders/{id} | Get order by ID
[**getOrders**](OrdersApi.md#getOrders) | **GET** /api/v1.0/orders | Get orders by filter
[**getOrdersSummary**](OrdersApi.md#getOrdersSummary) | **GET** /api/v1.0/{appId}/orders/summaries | [PRIVATE API] Get summary of orders by filter
[**refundOrder**](OrdersApi.md#refundOrder) | **POST** /api/v1.0/orders/{id}/refund | Refund order
[**rejectOrder**](OrdersApi.md#rejectOrder) | **POST** /api/v1.0/orders/{id}/reject | Reject order


<a name="acceptOrder"></a>
# **acceptOrder**
> acceptOrder(id, acceptObject)

Accept order

To accept an order, you create an &#x60;accept&#x60; object and send it to Flipdish API using HTTP POST method. &#x60;Id&#x60; path parameter identifies the order.

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
Integer id = 56; // Integer | Order identifier
Accept acceptObject = new Accept(); // Accept | Order accept parameters (eg: EstimatedMinutesForDelivery)
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
 **id** | **Integer**| Order identifier |
 **acceptObject** | [**Accept**](Accept.md)| Order accept parameters (eg: EstimatedMinutesForDelivery) |

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

Dispatch order

To dispatch an order send a POST request with &#x60;Id&#x60; path parameter which identifies the order.

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
Integer id = 56; // Integer | Order identifier
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
 **id** | **Integer**| Order identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderById"></a>
# **getOrderById**
> RestApiResultOrder getOrderById(id)

Get order by ID

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
Integer id = 56; // Integer | Order identifier
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
 **id** | **Integer**| Order identifier |

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

Get orders by filter

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
List<Integer> physicalRestaurantId = Arrays.asList(56); // List<Integer> | Physical restaurant identifiers
List<String> state = Arrays.asList("state_example"); // List<String> | Order states
OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | Order has been placed after this parameter value
OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | Order has been placed before this parameter value
Integer page = 56; // Integer | Requested page number
Integer limit = 56; // Integer | Requested page limit
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
 **physicalRestaurantId** | [**List&lt;Integer&gt;**](Integer.md)| Physical restaurant identifiers | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Order states | [optional] [enum: Created, PlacedCanBeCancelled, ReadyToProcess, AcceptedByRestaurant, Dispatched, Delivered, Cancelled, ManualReview, RejectedByStore, RejectedByFlipdish, RejectedAutomatically, RejectedAfterBeingAccepted, AcceptedAndRefunded]
 **from** | **OffsetDateTime**| Order has been placed after this parameter value | [optional]
 **to** | **OffsetDateTime**| Order has been placed before this parameter value | [optional]
 **page** | **Integer**| Requested page number | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

### Return type

[**RestApiPaginationResultOrder**](RestApiPaginationResultOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrdersSummary"></a>
# **getOrdersSummary**
> RestApiPaginationResultOrderSummary getOrdersSummary(appId, searchQuery, physicalRestaurantId, state, page, limit, orderByRequestedForTime)

[PRIVATE API] Get summary of orders by filter

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
String appId = "appId_example"; // String | App Name Id
String searchQuery = "searchQuery_example"; // String | Query string
List<Integer> physicalRestaurantId = Arrays.asList(56); // List<Integer> | Physical restaurant identifiers
List<String> state = Arrays.asList("state_example"); // List<String> | Order states
Integer page = 56; // Integer | Requested page number
Integer limit = 56; // Integer | Requested page limit
Boolean orderByRequestedForTime = true; // Boolean | 
try {
    RestApiPaginationResultOrderSummary result = apiInstance.getOrdersSummary(appId, searchQuery, physicalRestaurantId, state, page, limit, orderByRequestedForTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#getOrdersSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **searchQuery** | **String**| Query string | [optional]
 **physicalRestaurantId** | [**List&lt;Integer&gt;**](Integer.md)| Physical restaurant identifiers | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Order states | [optional] [enum: Created, PlacedCanBeCancelled, ReadyToProcess, AcceptedByRestaurant, Dispatched, Delivered, Cancelled, ManualReview, RejectedByStore, RejectedByFlipdish, RejectedAutomatically, RejectedAfterBeingAccepted, AcceptedAndRefunded]
 **page** | **Integer**| Requested page number | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **orderByRequestedForTime** | **Boolean**|  | [optional]

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

Refund order

To refund an order, you create a &#x60;refund&#x60; object and send it to Flipdish API using HTTP POST method. &#x60;Id&#x60; path parameter identifies the order.

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
Integer id = 56; // Integer | Order identifier
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
 **id** | **Integer**| Order identifier |
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

Reject order

To reject an order, you create a &#x60;reject&#x60; object and send it to Flipdish API using HTTP POST method. &#x60;Id&#x60; path parameter identifies the order.

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
Integer id = 56; // Integer | Order identifier
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
 **id** | **Integer**| Order identifier |
 **rejectObject** | [**Reject**](Reject.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

