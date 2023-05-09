# PayoutsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayout**](PayoutsApi.md#getPayout) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId} | 
[**getPayoutChargebacks**](PayoutsApi.md#getPayoutChargebacks) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/chargebacks | 
[**getPayoutOrders**](PayoutsApi.md#getPayoutOrders) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/orders | 
[**getPayoutOtherCharges**](PayoutsApi.md#getPayoutOtherCharges) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/othercharges | 
[**getPayoutRefunds**](PayoutsApi.md#getPayoutRefunds) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/refunds | 
[**getPayoutSummaries**](PayoutsApi.md#getPayoutSummaries) | **GET** /api/v1.0/{appId}/payouts/summaries | 
[**getPayouts**](PayoutsApi.md#getPayouts) | **GET** /api/v1.0/{appId}/payouts | 


<a name="getPayout"></a>
# **getPayout**
> PayoutDetail getPayout(appId, bankAccountId, payoutId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
try {
    PayoutDetail result = apiInstance.getPayout(appId, bankAccountId, payoutId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayout");
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

[**PayoutDetail**](PayoutDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutChargebacks"></a>
# **getPayoutChargebacks**
> RestApiPaginationResultPayoutChargeback getPayoutChargebacks(appId, bankAccountId, payoutId, page, limit, storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiPaginationResultPayoutChargeback result = apiInstance.getPayoutChargebacks(appId, bankAccountId, payoutId, page, limit, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayoutChargebacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiPaginationResultPayoutChargeback**](RestApiPaginationResultPayoutChargeback.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutOrders"></a>
# **getPayoutOrders**
> RestApiPaginationResultPayoutOrder getPayoutOrders(appId, bankAccountId, payoutId, page, limit, storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiPaginationResultPayoutOrder result = apiInstance.getPayoutOrders(appId, bankAccountId, payoutId, page, limit, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayoutOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiPaginationResultPayoutOrder**](RestApiPaginationResultPayoutOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutOtherCharges"></a>
# **getPayoutOtherCharges**
> RestApiPaginationResultPayoutOtherCharge getPayoutOtherCharges(appId, bankAccountId, payoutId, page, limit, storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiPaginationResultPayoutOtherCharge result = apiInstance.getPayoutOtherCharges(appId, bankAccountId, payoutId, page, limit, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayoutOtherCharges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiPaginationResultPayoutOtherCharge**](RestApiPaginationResultPayoutOtherCharge.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutRefunds"></a>
# **getPayoutRefunds**
> RestApiPaginationResultPayoutRefund getPayoutRefunds(appId, bankAccountId, payoutId, page, limit, storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiPaginationResultPayoutRefund result = apiInstance.getPayoutRefunds(appId, bankAccountId, payoutId, page, limit, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayoutRefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **payoutId** | **Integer**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiPaginationResultPayoutRefund**](RestApiPaginationResultPayoutRefund.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayoutSummaries"></a>
# **getPayoutSummaries**
> RestApiArrayResultPayoutSummary getPayoutSummaries(appId, startDate, endDate, payoutRequestIdsBankAccountIds, payoutRequestIdsStates)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
List<Integer> payoutRequestIdsBankAccountIds = Arrays.asList(56); // List<Integer> | List of bank account ids to search for
List<String> payoutRequestIdsStates = Arrays.asList("payoutRequestIdsStates_example"); // List<String> | List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for
try {
    RestApiArrayResultPayoutSummary result = apiInstance.getPayoutSummaries(appId, startDate, endDate, payoutRequestIdsBankAccountIds, payoutRequestIdsStates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayoutSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **payoutRequestIdsBankAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| List of bank account ids to search for | [optional]
 **payoutRequestIdsStates** | [**List&lt;String&gt;**](String.md)| List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for | [optional] [enum: Pending, InTransit, Paid, Failed, Cancelled]

### Return type

[**RestApiArrayResultPayoutSummary**](RestApiArrayResultPayoutSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPayouts"></a>
# **getPayouts**
> RestApiPaginationResultPayout getPayouts(appId, startDate, endDate, page, limit, payoutRequestIdsBankAccountIds, payoutRequestIdsStates)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsApi apiInstance = new PayoutsApi();
String appId = "appId_example"; // String | 
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
List<Integer> payoutRequestIdsBankAccountIds = Arrays.asList(56); // List<Integer> | List of bank account ids to search for
List<String> payoutRequestIdsStates = Arrays.asList("payoutRequestIdsStates_example"); // List<String> | List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for
try {
    RestApiPaginationResultPayout result = apiInstance.getPayouts(appId, startDate, endDate, page, limit, payoutRequestIdsBankAccountIds, payoutRequestIdsStates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsApi#getPayouts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **payoutRequestIdsBankAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| List of bank account ids to search for | [optional]
 **payoutRequestIdsStates** | [**List&lt;String&gt;**](String.md)| List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for | [optional] [enum: Pending, InTransit, Paid, Failed, Cancelled]

### Return type

[**RestApiPaginationResultPayout**](RestApiPaginationResultPayout.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

