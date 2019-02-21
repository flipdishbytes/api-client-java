# EventsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerEvents**](EventsApi.md#getCustomerEvents) | **GET** /api/v1.0/events/customer/{customerId} | Get customer events  For technical reasons, the number of records returned is limited to 100.
[**getEvents**](EventsApi.md#getEvents) | **GET** /api/v1.0/events | Get events  For technical reasons, the number of records returned is limited to 100.
[**getEventsById**](EventsApi.md#getEventsById) | **GET** /api/v1.0/events/{eventId} | Get event by Id  For technical reasons, the number of records returned is limited to 100.
[**getMenuEvents**](EventsApi.md#getMenuEvents) | **GET** /api/v1.0/events/menu/{menuId} | Get menu events  For technical reasons, the number of records returned is limited to 100.
[**getOrderEvents**](EventsApi.md#getOrderEvents) | **GET** /api/v1.0/events/order/{orderId} | Get order events  For technical reasons, the number of records returned is limited to 100.
[**getOrderEventsByCustomer**](EventsApi.md#getOrderEventsByCustomer) | **GET** /api/v1.0/events/order | Get order events by customer  For technical reasons, the number of records returned is limited to 100.
[**getStoreEvents**](EventsApi.md#getStoreEvents) | **GET** /api/v1.0/events/store/{storeId} | Get store events  For technical reasons, the number of records returned is limited to 100.
[**getUserEvents**](EventsApi.md#getUserEvents) | **GET** /api/v1.0/events/user/{userId} | Get user events  For technical reasons, the number of records returned is limited to 100.
[**getWhiteLabelEvents**](EventsApi.md#getWhiteLabelEvents) | **GET** /api/v1.0/events/whitelabel/{whitelabelId} | Get WhiteLabel events  For technical reasons, the number of records returned is limited to 100.


<a name="getCustomerEvents"></a>
# **getCustomerEvents**
> RestApiEventSearchPaginationResult getCustomerEvents(customerId, limit, page, start, end, name)

Get customer events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer customerId = 56; // Integer | Customer identifier identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getCustomerEvents(customerId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getCustomerEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Customer identifier identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEvents"></a>
# **getEvents**
> RestApiEventSearchPaginationResult getEvents(storeId, whiteLabelId, customerId, limit, page, start, end, name)

Get events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer storeId = 56; // Integer | Store Id
Integer whiteLabelId = 56; // Integer | White Label Id
Integer customerId = 56; // Integer | Customer Id
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getEvents(storeId, whiteLabelId, customerId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store Id | [optional]
 **whiteLabelId** | **Integer**| White Label Id | [optional]
 **customerId** | **Integer**| Customer Id | [optional]
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEventsById"></a>
# **getEventsById**
> EventSearchResult getEventsById(eventId)

Get event by Id  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
UUID eventId = new UUID(); // UUID | Event identifier (Guid)
try {
    EventSearchResult result = apiInstance.getEventsById(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**UUID**](.md)| Event identifier (Guid) |

### Return type

[**EventSearchResult**](EventSearchResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuEvents"></a>
# **getMenuEvents**
> RestApiEventSearchPaginationResult getMenuEvents(menuId, limit, page, start, end, name)

Get menu events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer menuId = 56; // Integer | Menu Identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getMenuEvents(menuId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getMenuEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu Identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderEvents"></a>
# **getOrderEvents**
> RestApiEventSearchPaginationResult getOrderEvents(orderId, limit, page, start, end, name)

Get order events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer orderId = 56; // Integer | Order identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getOrderEvents(orderId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getOrderEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**| Order identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderEventsByCustomer"></a>
# **getOrderEventsByCustomer**
> RestApiEventSearchPaginationResult getOrderEventsByCustomer(customerId, limit, page, start, end, name)

Get order events by customer  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer customerId = 56; // Integer | Customer identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getOrderEventsByCustomer(customerId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getOrderEventsByCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Customer identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreEvents"></a>
# **getStoreEvents**
> RestApiEventSearchPaginationResult getStoreEvents(storeId, limit, page, start, end, name)

Get store events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer storeId = 56; // Integer | Id of the store
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getStoreEvents(storeId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getStoreEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Id of the store |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserEvents"></a>
# **getUserEvents**
> RestApiEventSearchPaginationResult getUserEvents(userId, limit, page, start, end, name)

Get user events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer userId = 56; // Integer | User identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getUserEvents(userId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getUserEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| User identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWhiteLabelEvents"></a>
# **getWhiteLabelEvents**
> RestApiEventSearchPaginationResult getWhiteLabelEvents(whitelabelId, limit, page, start, end, name)

Get WhiteLabel events  For technical reasons, the number of records returned is limited to 100.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer whitelabelId = 56; // Integer | White Label Identifier
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
List<String> name = Arrays.asList("name_example"); // List<String> | Event names to filter in
try {
    RestApiEventSearchPaginationResult result = apiInstance.getWhiteLabelEvents(whitelabelId, limit, page, start, end, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getWhiteLabelEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelabelId** | **Integer**| White Label Identifier |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Event names to filter in | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

