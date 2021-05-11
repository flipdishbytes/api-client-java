# ApmApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApmStatus**](ApmApi.md#getApmStatus) | **GET** /api/v1.0/{appId}/apm/status | [PRIVATE API] Returns true if APM is enabled on at least one store in an application
[**getBasicStatistics**](ApmApi.md#getBasicStatistics) | **GET** /api/v1.0/{appId}/apm/statistics | [PRIVATE API] Get Basic Statistics
[**getCalendarWeekStatistics**](ApmApi.md#getCalendarWeekStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/calendar | [PRIVATE API] Get Calendar statistics
[**getCallsStatistics**](ApmApi.md#getCallsStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/calls/{aggregateDataBy} | [PRIVATE API] Get Calls Statistics
[**getOrderStatistics**](ApmApi.md#getOrderStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/orders/{aggregateDataBy} | [PRIVATE API] Get Order Statistics (Value of Orders)
[**getPaginatedCallList**](ApmApi.md#getPaginatedCallList) | **GET** /api/v1.0/{appId}/apm/calls | [PRIVATE API] Get paginated APM call list


<a name="getApmStatus"></a>
# **getApmStatus**
> RestApiResultApmStatus getApmStatus(appId)

[PRIVATE API] Returns true if APM is enabled on at least one store in an application

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
try {
    RestApiResultApmStatus result = apiInstance.getApmStatus(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getApmStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |

### Return type

[**RestApiResultApmStatus**](RestApiResultApmStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBasicStatistics"></a>
# **getBasicStatistics**
> RestApiResultApmStatistics getBasicStatistics(appId, storeId)

[PRIVATE API] Get Basic Statistics

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of stores to search by
try {
    RestApiResultApmStatistics result = apiInstance.getBasicStatistics(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getBasicStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of stores to search by | [optional]

### Return type

[**RestApiResultApmStatistics**](RestApiResultApmStatistics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCalendarWeekStatistics"></a>
# **getCalendarWeekStatistics**
> RestApiArrayResultApmHourlyDataPoint getCalendarWeekStatistics(appId, storeId)

[PRIVATE API] Get Calendar statistics

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of stores to search by
try {
    RestApiArrayResultApmHourlyDataPoint result = apiInstance.getCalendarWeekStatistics(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getCalendarWeekStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of stores to search by | [optional]

### Return type

[**RestApiArrayResultApmHourlyDataPoint**](RestApiArrayResultApmHourlyDataPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCallsStatistics"></a>
# **getCallsStatistics**
> RestApiArrayResultApmDataPoint getCallsStatistics(appId, aggregateDataBy, dataPointLimit, storeId)

[PRIVATE API] Get Calls Statistics

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
String aggregateDataBy = "aggregateDataBy_example"; // String | Aggregate data by day \\ week
Integer dataPointLimit = 56; // Integer | Amount of data points per request
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of stores to search by
try {
    RestApiArrayResultApmDataPoint result = apiInstance.getCallsStatistics(appId, aggregateDataBy, dataPointLimit, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getCallsStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **aggregateDataBy** | **String**| Aggregate data by day \\ week | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**| Amount of data points per request | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of stores to search by | [optional]

### Return type

[**RestApiArrayResultApmDataPoint**](RestApiArrayResultApmDataPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOrderStatistics"></a>
# **getOrderStatistics**
> RestApiArrayResultApmCurrencyDataPoint getOrderStatistics(appId, aggregateDataBy, dataPointLimit, storeId)

[PRIVATE API] Get Order Statistics (Value of Orders)

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
String aggregateDataBy = "aggregateDataBy_example"; // String | Aggregate data by day \\ week
Integer dataPointLimit = 56; // Integer | Amount of data points per request
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of stores to search by
try {
    RestApiArrayResultApmCurrencyDataPoint result = apiInstance.getOrderStatistics(appId, aggregateDataBy, dataPointLimit, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getOrderStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **aggregateDataBy** | **String**| Aggregate data by day \\ week | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**| Amount of data points per request | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of stores to search by | [optional]

### Return type

[**RestApiArrayResultApmCurrencyDataPoint**](RestApiArrayResultApmCurrencyDataPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPaginatedCallList"></a>
# **getPaginatedCallList**
> RestApiPaginationResultPhoneCall getPaginatedCallList(appId, page, limit, storeId)

[PRIVATE API] Get paginated APM call list

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ApmApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ApmApi apiInstance = new ApmApi();
String appId = "appId_example"; // String | App Id
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of stores to search by
try {
    RestApiPaginationResultPhoneCall result = apiInstance.getPaginatedCallList(appId, page, limit, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApmApi#getPaginatedCallList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of stores to search by | [optional]

### Return type

[**RestApiPaginationResultPhoneCall**](RestApiPaginationResultPhoneCall.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

