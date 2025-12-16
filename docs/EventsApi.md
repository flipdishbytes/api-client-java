# EventsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerEvents**](EventsApi.md#getCustomerEvents) | **GET** /api/v1.0/{appId}/events/customer/{customerId} | 
[**getEvents**](EventsApi.md#getEvents) | **GET** /api/v1.0/{appId}/events | 
[**getEventsById**](EventsApi.md#getEventsById) | **GET** /api/v1.0/{appId}/events/{eventId} | 
[**getMenuEvents**](EventsApi.md#getMenuEvents) | **GET** /api/v1.0/{appId}/events/menu/{menuId} | 
[**getOrderEvents**](EventsApi.md#getOrderEvents) | **GET** /api/v1.0/{appId}/events/order/{orderId} | 
[**getOrderEventsByCustomer**](EventsApi.md#getOrderEventsByCustomer) | **GET** /api/v1.0/{appId}/events/order | 
[**getStoreEvents**](EventsApi.md#getStoreEvents) | **GET** /api/v1.0/{appId}/events/store/{storeId} | 
[**getUserEvents**](EventsApi.md#getUserEvents) | **GET** /api/v1.0/{appId}/events/user/{userId} | 
[**getWhiteLabelEvents**](EventsApi.md#getWhiteLabelEvents) | **GET** /api/v1.0/{appId}/events/whitelabel/{whitelabelId} | 


<a name="getCustomerEvents"></a>
# **getCustomerEvents**
> RestApiEventSearchPaginationResult getCustomerEvents(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer customerId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getCustomerEvents(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getCustomerEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **customerId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEvents"></a>
# **getEvents**
> RestApiEventSearchPaginationResult getEvents(appId, whiteLabelId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer whiteLabelId = 56; // Integer | 
Integer customerId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getEvents(appId, whiteLabelId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **whiteLabelId** | **Integer**|  | [optional]
 **customerId** | **Integer**|  | [optional]
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEventsById"></a>
# **getEventsById**
> EventSearchResult getEventsById(eventId, appId)



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
UUID eventId = new UUID(); // UUID | 
String appId = "appId_example"; // String | 
try {
    EventSearchResult result = apiInstance.getEventsById(eventId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**UUID**](.md)|  |
 **appId** | **String**|  |

### Return type

[**EventSearchResult**](EventSearchResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuEvents"></a>
# **getMenuEvents**
> RestApiEventSearchPaginationResult getMenuEvents(appId, menuId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId2, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer menuId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId2 = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getMenuEvents(appId, menuId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId2, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getMenuEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **menuId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId2** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderEvents"></a>
# **getOrderEvents**
> RestApiEventSearchPaginationResult getOrderEvents(appId, orderId, limit, page, start, end, orderId2, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer orderId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId2 = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getOrderEvents(appId, orderId, limit, page, start, end, orderId2, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getOrderEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **orderId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId2** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderEventsByCustomer"></a>
# **getOrderEventsByCustomer**
> RestApiEventSearchPaginationResult getOrderEventsByCustomer(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer customerId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getOrderEventsByCustomer(appId, customerId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getOrderEventsByCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **customerId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreEvents"></a>
# **getStoreEvents**
> RestApiEventSearchPaginationResult getStoreEvents(appId, storeId, limit, page, start, end, orderId, storeId2, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId2 = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getStoreEvents(appId, storeId, limit, page, start, end, orderId, storeId2, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getStoreEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId2** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserEvents"></a>
# **getUserEvents**
> RestApiEventSearchPaginationResult getUserEvents(appId, userId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId2, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer userId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId2 = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getUserEvents(appId, userId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId2, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getUserEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **userId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId2** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getWhiteLabelEvents"></a>
# **getWhiteLabelEvents**
> RestApiEventSearchPaginationResult getWhiteLabelEvents(appId, whitelabelId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId)



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
String appId = "appId_example"; // String | 
Integer whitelabelId = 56; // Integer | 
Integer limit = 56; // Integer | The maximum elements to return
Integer page = 56; // Integer | The index of the page to return, starting by 1
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date
Integer orderId = 56; // Integer | Events that have Order Id
Integer storeId = 56; // Integer | Events that have Store Id
List<Integer> storeIdList = Arrays.asList(56); // List<Integer> | Events that have Store Id List
Integer storeGroupId = 56; // Integer | Events that have Store Group Id
Integer userId = 56; // Integer | Events that have User Id
Integer menuId = 56; // Integer | Events that have Menu Id
Integer campaignId = 56; // Integer | Events that have Campaign Id
String userEmail = "userEmail_example"; // String | Events that have User Email
String userName = "userName_example"; // String | Events that have User Name
String voucherCode = "voucherCode_example"; // String | Events that have voucher code
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Events that have event type\\s
String flipdishEventId = "flipdishEventId_example"; // String | Unique Identifier of Event, if this is specified, all other criteria are ignored.
try {
    RestApiEventSearchPaginationResult result = apiInstance.getWhiteLabelEvents(appId, whitelabelId, limit, page, start, end, orderId, storeId, storeIdList, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getWhiteLabelEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **whitelabelId** | **Integer**|  |
 **limit** | **Integer**| The maximum elements to return | [optional]
 **page** | **Integer**| The index of the page to return, starting by 1 | [optional]
 **start** | **OffsetDateTime**| Start date | [optional]
 **end** | **OffsetDateTime**| End date | [optional]
 **orderId** | **Integer**| Events that have Order Id | [optional]
 **storeId** | **Integer**| Events that have Store Id | [optional]
 **storeIdList** | [**List&lt;Integer&gt;**](Integer.md)| Events that have Store Id List | [optional]
 **storeGroupId** | **Integer**| Events that have Store Group Id | [optional]
 **userId** | **Integer**| Events that have User Id | [optional]
 **menuId** | **Integer**| Events that have Menu Id | [optional]
 **campaignId** | **Integer**| Events that have Campaign Id | [optional]
 **userEmail** | **String**| Events that have User Email | [optional]
 **userName** | **String**| Events that have User Name | [optional]
 **voucherCode** | **String**| Events that have voucher code | [optional]
 **eventType** | [**List&lt;String&gt;**](String.md)| Events that have event type\\s | [optional]
 **flipdishEventId** | **String**| Unique Identifier of Event, if this is specified, all other criteria are ignored. | [optional]

### Return type

[**RestApiEventSearchPaginationResult**](RestApiEventSearchPaginationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

