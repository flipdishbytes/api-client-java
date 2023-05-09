# ApmApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApmStatus**](ApmApi.md#getApmStatus) | **GET** /api/v1.0/{appId}/apm/status | 
[**getBasicStatistics**](ApmApi.md#getBasicStatistics) | **GET** /api/v1.0/{appId}/apm/statistics | 
[**getCalendarWeekStatistics**](ApmApi.md#getCalendarWeekStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/calendar | 
[**getCallsStatistics**](ApmApi.md#getCallsStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/calls/{aggregateDataBy} | 
[**getOrderStatistics**](ApmApi.md#getOrderStatistics) | **GET** /api/v1.0/{appId}/apm/statistics/orders/{aggregateDataBy} | 
[**getPaginatedCallList**](ApmApi.md#getPaginatedCallList) | **GET** /api/v1.0/{appId}/apm/calls | 


<a name="getApmStatus"></a>
# **getApmStatus**
> RestApiResultApmStatus getApmStatus(appId)



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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |

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
String appId = "appId_example"; // String | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
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
 **appId** | **String**|  |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

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
String appId = "appId_example"; // String | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
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
 **appId** | **String**|  |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

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
String appId = "appId_example"; // String | 
String aggregateDataBy = "aggregateDataBy_example"; // String | 
Integer dataPointLimit = 56; // Integer | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
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
 **appId** | **String**|  |
 **aggregateDataBy** | **String**|  | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**|  | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

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
String appId = "appId_example"; // String | 
String aggregateDataBy = "aggregateDataBy_example"; // String | 
Integer dataPointLimit = 56; // Integer | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
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
 **appId** | **String**|  |
 **aggregateDataBy** | **String**|  | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**|  | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

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
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
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
 **appId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiPaginationResultPhoneCall**](RestApiPaginationResultPhoneCall.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

