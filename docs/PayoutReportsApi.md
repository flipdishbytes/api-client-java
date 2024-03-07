# PayoutReportsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayoutReport3Details**](PayoutReportsApi.md#getPayoutReport3Details) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/details | 
[**getPayoutReport3Orders**](PayoutReportsApi.md#getPayoutReport3Orders) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/orders | 
[**getPayoutReport3Overview**](PayoutReportsApi.md#getPayoutReport3Overview) | **GET** /api/v1.0/{appId}/reporting/reports/payouts3/{bankAccountId}/{payoutId}/overview | 


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
> RestApiPaginationResultPayoutReport3PayoutOrder getPayoutReport3Orders(appId, bankAccountId, payoutId, storeIds)



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
    RestApiPaginationResultPayoutReport3PayoutOrder result = apiInstance.getPayoutReport3Orders(appId, bankAccountId, payoutId, storeIds);
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

