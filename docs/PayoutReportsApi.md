# PayoutReportsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayoutReport3Details**](PayoutReportsApi.md#getPayoutReport3Details) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/details | 
[**getPayoutReport3Orders**](PayoutReportsApi.md#getPayoutReport3Orders) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/orders | 
[**getPayoutReport3Overview**](PayoutReportsApi.md#getPayoutReport3Overview) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/overview | 
[**payoutReport3ExportPayoutChargebacks**](PayoutReportsApi.md#payoutReport3ExportPayoutChargebacks) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/export/chargebacks | 
[**payoutReport3ExportPayoutLedgerEntries**](PayoutReportsApi.md#payoutReport3ExportPayoutLedgerEntries) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/export/ledgerentries | 
[**payoutReport3ExportPayoutOrders**](PayoutReportsApi.md#payoutReport3ExportPayoutOrders) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/export/orders | 
[**payoutReport3ExportPayoutPosSales**](PayoutReportsApi.md#payoutReport3ExportPayoutPosSales) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/export/possales | 
[**payoutReport3ExportPayoutRefundedRejected**](PayoutReportsApi.md#payoutReport3ExportPayoutRefundedRejected) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/export/refundedrejected | 


<a name="getPayoutReport3Details"></a>
# **getPayoutReport3Details**
> RestApiResultPayoutReport3Details getPayoutReport3Details(appId, bankAccountId, payoutId, storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultPayoutReport3Details result = apiInstance.getPayoutReport3Details(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#getPayoutReport3Details");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultPayoutReport3Details**](RestApiResultPayoutReport3Details.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutReport3Orders"></a>
# **getPayoutReport3Orders**
> RestApiPaginationResultPayoutReport3PayoutOrder getPayoutReport3Orders(appId, bankAccountId, payoutId, storeIds, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultPayoutReport3PayoutOrder result = apiInstance.getPayoutReport3Orders(appId, bankAccountId, payoutId, storeIds, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#getPayoutReport3Orders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultPayoutReport3PayoutOrder**](RestApiPaginationResultPayoutReport3PayoutOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutReport3Overview"></a>
# **getPayoutReport3Overview**
> RestApiResultPayoutReport3Overview getPayoutReport3Overview(appId, bankAccountId, payoutId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
try {
    RestApiResultPayoutReport3Overview result = apiInstance.getPayoutReport3Overview(appId, bankAccountId, payoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#getPayoutReport3Overview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |

### Return type

[**RestApiResultPayoutReport3Overview**](RestApiResultPayoutReport3Overview.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="payoutReport3ExportPayoutChargebacks"></a>
# **payoutReport3ExportPayoutChargebacks**
> RestApiResultFileCreationResult payoutReport3ExportPayoutChargebacks(appId, bankAccountId, payoutId, stores)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> stores = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultFileCreationResult result = apiInstance.payoutReport3ExportPayoutChargebacks(appId, bankAccountId, payoutId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#payoutReport3ExportPayoutChargebacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **stores** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultFileCreationResult**](RestApiResultFileCreationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="payoutReport3ExportPayoutLedgerEntries"></a>
# **payoutReport3ExportPayoutLedgerEntries**
> RestApiResultFileCreationResult payoutReport3ExportPayoutLedgerEntries(appId, bankAccountId, payoutId, stores)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> stores = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultFileCreationResult result = apiInstance.payoutReport3ExportPayoutLedgerEntries(appId, bankAccountId, payoutId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#payoutReport3ExportPayoutLedgerEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **stores** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultFileCreationResult**](RestApiResultFileCreationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="payoutReport3ExportPayoutOrders"></a>
# **payoutReport3ExportPayoutOrders**
> RestApiResultFileCreationResult payoutReport3ExportPayoutOrders(appId, bankAccountId, payoutId, stores)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> stores = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultFileCreationResult result = apiInstance.payoutReport3ExportPayoutOrders(appId, bankAccountId, payoutId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#payoutReport3ExportPayoutOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **stores** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultFileCreationResult**](RestApiResultFileCreationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="payoutReport3ExportPayoutPosSales"></a>
# **payoutReport3ExportPayoutPosSales**
> RestApiResultFileCreationResult payoutReport3ExportPayoutPosSales(appId, bankAccountId, payoutId, stores)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> stores = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultFileCreationResult result = apiInstance.payoutReport3ExportPayoutPosSales(appId, bankAccountId, payoutId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#payoutReport3ExportPayoutPosSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **stores** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultFileCreationResult**](RestApiResultFileCreationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="payoutReport3ExportPayoutRefundedRejected"></a>
# **payoutReport3ExportPayoutRefundedRejected**
> RestApiResultFileCreationResult payoutReport3ExportPayoutRefundedRejected(appId, bankAccountId, payoutId, stores)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutReportsApi apiInstance = new PayoutReportsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> stores = Arrays.asList(56); // List<Integer> | 
try {
    RestApiResultFileCreationResult result = apiInstance.payoutReport3ExportPayoutRefundedRejected(appId, bankAccountId, payoutId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutReportsApi#payoutReport3ExportPayoutRefundedRejected");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **stores** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiResultFileCreationResult**](RestApiResultFileCreationResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

