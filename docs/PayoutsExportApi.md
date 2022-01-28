# PayoutsExportApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportPayoutChargebacks**](PayoutsExportApi.md#exportPayoutChargebacks) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/chargebacks/export | Export a list of payout&#39;s chargebacks as CSV
[**exportPayoutOrders**](PayoutsExportApi.md#exportPayoutOrders) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/orders/export | Export a list of payout&#39;s orders as CSV
[**exportPayoutOtherCharges**](PayoutsExportApi.md#exportPayoutOtherCharges) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/othercharges/export | Export a list of payout&#39;s other charges as CSV
[**exportPayoutRefunds**](PayoutsExportApi.md#exportPayoutRefunds) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/refunds/export | Export a list of payout&#39;s refunds as CSV
[**exportPayoutStores**](PayoutsExportApi.md#exportPayoutStores) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/payouts/{payoutId}/export | Export payout&#39;s details as CSV
[**exportPayouts**](PayoutsExportApi.md#exportPayouts) | **GET** /api/v1.0/{appId}/payouts/export | Export payouts as CSV


<a name="exportPayoutChargebacks"></a>
# **exportPayoutChargebacks**
> String exportPayoutChargebacks(appId, bankAccountId, payoutId, storeIds)

Export a list of payout&#39;s chargebacks as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.exportPayoutChargebacks(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayoutChargebacks");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="exportPayoutOrders"></a>
# **exportPayoutOrders**
> String exportPayoutOrders(appId, bankAccountId, payoutId, storeIds)

Export a list of payout&#39;s orders as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.exportPayoutOrders(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayoutOrders");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="exportPayoutOtherCharges"></a>
# **exportPayoutOtherCharges**
> String exportPayoutOtherCharges(appId, bankAccountId, payoutId, storeIds)

Export a list of payout&#39;s other charges as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.exportPayoutOtherCharges(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayoutOtherCharges");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="exportPayoutRefunds"></a>
# **exportPayoutRefunds**
> String exportPayoutRefunds(appId, bankAccountId, payoutId, storeIds)

Export a list of payout&#39;s refunds as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.exportPayoutRefunds(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayoutRefunds");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="exportPayoutStores"></a>
# **exportPayoutStores**
> String exportPayoutStores(appId, bankAccountId, payoutId, storeIds)

Export payout&#39;s details as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
Integer payoutId = 56; // Integer | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.exportPayoutStores(appId, bankAccountId, payoutId, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayoutStores");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="exportPayouts"></a>
# **exportPayouts**
> String exportPayouts(appId, startDate, endDate, payoutRequestIdsBankAccountIds, payoutRequestIdsStates)

Export payouts as CSV

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PayoutsExportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PayoutsExportApi apiInstance = new PayoutsExportApi();
String appId = "appId_example"; // String | 
OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
List<Integer> payoutRequestIdsBankAccountIds = Arrays.asList(56); // List<Integer> | List of bank account ids to search for
List<String> payoutRequestIdsStates = Arrays.asList("payoutRequestIdsStates_example"); // List<String> | List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for
try {
    String result = apiInstance.exportPayouts(appId, startDate, endDate, payoutRequestIdsBankAccountIds, payoutRequestIdsStates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayoutsExportApi#exportPayouts");
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

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

