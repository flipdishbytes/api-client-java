# VouchersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVoucher**](VouchersApi.md#createVoucher) | **POST** /api/v1.0/vouchers/{appId} | [PRIVATE API] Create voucher
[**getVoucherById**](VouchersApi.md#getVoucherById) | **GET** /api/v1.0/vouchers/{voucherId} | [PRIVATE API] Get voucher by identifier
[**getVoucherStatsById**](VouchersApi.md#getVoucherStatsById) | **GET** /api/v1.0/vouchers/stats/{voucherId} | [PRIVATE API] Get voucher stats by identifier
[**getVouchers**](VouchersApi.md#getVouchers) | **GET** /api/v1.0/{appId}/vouchers/summaries | [PRIVATE API] Get vouchers summaries for App Id
[**updateVoucher**](VouchersApi.md#updateVoucher) | **POST** /api/v1.0/vouchers/{voucherId} | [PRIVATE API] Updates voucher


<a name="createVoucher"></a>
# **createVoucher**
> RestApiResultVoucherWithStats createVoucher(appId, voucher)

[PRIVATE API] Create voucher

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.VouchersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

VouchersApi apiInstance = new VouchersApi();
String appId = "appId_example"; // String | App Name Id
CreateVoucher voucher = new CreateVoucher(); // CreateVoucher | Voucher Details
try {
    RestApiResultVoucherWithStats result = apiInstance.createVoucher(appId, voucher);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#createVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **voucher** | [**CreateVoucher**](CreateVoucher.md)| Voucher Details |

### Return type

[**RestApiResultVoucherWithStats**](RestApiResultVoucherWithStats.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getVoucherById"></a>
# **getVoucherById**
> RestApiResultVoucherWithStats getVoucherById(voucherId)

[PRIVATE API] Get voucher by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.VouchersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

VouchersApi apiInstance = new VouchersApi();
Integer voucherId = 56; // Integer | Id of the voucher
try {
    RestApiResultVoucherWithStats result = apiInstance.getVoucherById(voucherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#getVoucherById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voucherId** | **Integer**| Id of the voucher |

### Return type

[**RestApiResultVoucherWithStats**](RestApiResultVoucherWithStats.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getVoucherStatsById"></a>
# **getVoucherStatsById**
> RestApiArrayResultVoucherDataPoint getVoucherStatsById(voucherId, aggregateDataBy, dataPointLimit)

[PRIVATE API] Get voucher stats by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.VouchersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

VouchersApi apiInstance = new VouchersApi();
Integer voucherId = 56; // Integer | Id of the voucher
String aggregateDataBy = "aggregateDataBy_example"; // String | Aggregate data by day \\ week \\ month
Integer dataPointLimit = 56; // Integer | Amount of data points per request
try {
    RestApiArrayResultVoucherDataPoint result = apiInstance.getVoucherStatsById(voucherId, aggregateDataBy, dataPointLimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#getVoucherStatsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voucherId** | **Integer**| Id of the voucher |
 **aggregateDataBy** | **String**| Aggregate data by day \\ week \\ month | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**| Amount of data points per request | [optional]

### Return type

[**RestApiArrayResultVoucherDataPoint**](RestApiArrayResultVoucherDataPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getVouchers"></a>
# **getVouchers**
> RestApiPaginationResultVoucherSummary getVouchers(appId, pageIndex, pageSize, searchCodes, statusSearch, typeSearch, subTypeSearch, storeIds)

[PRIVATE API] Get vouchers summaries for App Id

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.VouchersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

VouchersApi apiInstance = new VouchersApi();
String appId = "appId_example"; // String | Application Id
Integer pageIndex = 56; // Integer | Page Number
Integer pageSize = 56; // Integer | Page Size
List<String> searchCodes = Arrays.asList("searchCodes_example"); // List<String> | Search by Voucher Code\\s
List<String> statusSearch = Arrays.asList("statusSearch_example"); // List<String> | Search by Status
List<String> typeSearch = Arrays.asList("typeSearch_example"); // List<String> | Search by Type
List<String> subTypeSearch = Arrays.asList("subTypeSearch_example"); // List<String> | Search by Sub Type
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | Search by Store Ids
try {
    RestApiPaginationResultVoucherSummary result = apiInstance.getVouchers(appId, pageIndex, pageSize, searchCodes, statusSearch, typeSearch, subTypeSearch, storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#getVouchers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id |
 **pageIndex** | **Integer**| Page Number | [optional]
 **pageSize** | **Integer**| Page Size | [optional]
 **searchCodes** | [**List&lt;String&gt;**](String.md)| Search by Voucher Code\\s | [optional]
 **statusSearch** | [**List&lt;String&gt;**](String.md)| Search by Status | [optional] [enum: Valid, NotYetValid, Expired, Used, Disabled]
 **typeSearch** | [**List&lt;String&gt;**](String.md)| Search by Type | [optional] [enum: PercentageDiscount, LumpDiscount, AddItem, CreditNote]
 **subTypeSearch** | [**List&lt;String&gt;**](String.md)| Search by Sub Type | [optional] [enum: None, SignUp, Loyalty, Loyalty25, Retention, SecondaryRetention, Custom]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)| Search by Store Ids | [optional]

### Return type

[**RestApiPaginationResultVoucherSummary**](RestApiPaginationResultVoucherSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateVoucher"></a>
# **updateVoucher**
> RestApiResultVoucherWithStats updateVoucher(voucherId, voucher, storeId, percentValue, lumpValue, freeItemId)

[PRIVATE API] Updates voucher

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.VouchersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

VouchersApi apiInstance = new VouchersApi();
Integer voucherId = 56; // Integer | Id of the voucher
VoucherBase voucher = new VoucherBase(); // VoucherBase | Updated details for the voucher
List<Integer> storeId = Arrays.asList(56); // List<Integer> | List of store ids associated
Integer percentValue = 56; // Integer | Percent voucher value (can have 1 of 3)
Double lumpValue = 3.4D; // Double | Lump voucher value (can have 1 of 3)
Integer freeItemId = 56; // Integer | Free Item Id (can have 1 of 3)
try {
    RestApiResultVoucherWithStats result = apiInstance.updateVoucher(voucherId, voucher, storeId, percentValue, lumpValue, freeItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#updateVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voucherId** | **Integer**| Id of the voucher |
 **voucher** | [**VoucherBase**](VoucherBase.md)| Updated details for the voucher |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| List of store ids associated | [optional]
 **percentValue** | **Integer**| Percent voucher value (can have 1 of 3) | [optional]
 **lumpValue** | **Double**| Lump voucher value (can have 1 of 3) | [optional]
 **freeItemId** | **Integer**| Free Item Id (can have 1 of 3) | [optional]

### Return type

[**RestApiResultVoucherWithStats**](RestApiResultVoucherWithStats.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

