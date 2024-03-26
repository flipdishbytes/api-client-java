# VouchersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVoucher**](VouchersApi.md#createVoucher) | **POST** /api/v1.0/vouchers/{appId} | 
[**getVoucherById**](VouchersApi.md#getVoucherById) | **GET** /api/v1.0/vouchers/{voucherId} | 
[**getVoucherStatsById**](VouchersApi.md#getVoucherStatsById) | **GET** /api/v1.0/vouchers/stats/{voucherId} | 
[**getVouchers**](VouchersApi.md#getVouchers) | **GET** /api/v1.0/{appId}/vouchers/summaries | 
[**updateVoucher**](VouchersApi.md#updateVoucher) | **POST** /api/v1.0/vouchers/{voucherId} | 
[**updateVoucherUsage**](VouchersApi.md#updateVoucherUsage) | **POST** /api/v1.0/{appId}/vouchers/{voucherId}/usage | 


<a name="createVoucher"></a>
# **createVoucher**
> RestApiResultVoucherWithStats createVoucher(appId, voucher)



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
String appId = "appId_example"; // String | 
CreateVoucher voucher = new CreateVoucher(); // CreateVoucher | 
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
 **appId** | **String**|  |
 **voucher** | [**CreateVoucher**](CreateVoucher.md)|  |

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
Integer voucherId = 56; // Integer | 
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
 **voucherId** | **Integer**|  |

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
Integer voucherId = 56; // Integer | 
String aggregateDataBy = "aggregateDataBy_example"; // String | 
Integer dataPointLimit = 56; // Integer | 
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
 **voucherId** | **Integer**|  |
 **aggregateDataBy** | **String**|  | [enum: Daily, Weekly, Monthly]
 **dataPointLimit** | **Integer**|  | [optional]

### Return type

[**RestApiArrayResultVoucherDataPoint**](RestApiArrayResultVoucherDataPoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getVouchers"></a>
# **getVouchers**
> RestApiPaginationResultVoucherSummary getVouchers(appId, pageIndex, pageSize, searchCodes, statusSearch, typeSearch, subTypeSearch, storeIds, channelRestrictions)



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
String appId = "appId_example"; // String | 
Integer pageIndex = 56; // Integer | 
Integer pageSize = 56; // Integer | 
List<String> searchCodes = Arrays.asList("searchCodes_example"); // List<String> | 
List<String> statusSearch = Arrays.asList("statusSearch_example"); // List<String> | 
List<String> typeSearch = Arrays.asList("typeSearch_example"); // List<String> | 
List<String> subTypeSearch = Arrays.asList("subTypeSearch_example"); // List<String> | 
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
List<String> channelRestrictions = Arrays.asList("channelRestrictions_example"); // List<String> | 
try {
    RestApiPaginationResultVoucherSummary result = apiInstance.getVouchers(appId, pageIndex, pageSize, searchCodes, statusSearch, typeSearch, subTypeSearch, storeIds, channelRestrictions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#getVouchers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **pageIndex** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **searchCodes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **statusSearch** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Valid, NotYetValid, Expired, Used, Disabled]
 **typeSearch** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: PercentageDiscount, LumpDiscount, AddItem, CreditNote, FreeDelivery]
 **subTypeSearch** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: None, SignUp, Loyalty, Loyalty25, Retention, SecondaryRetention, Custom]
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **channelRestrictions** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Ios, Android, Web, Kiosk, Pos, Google]

### Return type

[**RestApiPaginationResultVoucherSummary**](RestApiPaginationResultVoucherSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateVoucher"></a>
# **updateVoucher**
> RestApiResultVoucherWithStats updateVoucher(voucherId, voucher, storeId, percentValue, lumpValue, maxDiscountAmount)



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
Integer voucherId = 56; // Integer | 
UpdateVoucher voucher = new UpdateVoucher(); // UpdateVoucher | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
Integer percentValue = 56; // Integer | 
Double lumpValue = 3.4D; // Double | 
Double maxDiscountAmount = 3.4D; // Double | 
try {
    RestApiResultVoucherWithStats result = apiInstance.updateVoucher(voucherId, voucher, storeId, percentValue, lumpValue, maxDiscountAmount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#updateVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voucherId** | **Integer**|  |
 **voucher** | [**UpdateVoucher**](UpdateVoucher.md)|  |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **percentValue** | **Integer**|  | [optional]
 **lumpValue** | **Double**|  | [optional]
 **maxDiscountAmount** | **Double**|  | [optional]

### Return type

[**RestApiResultVoucherWithStats**](RestApiResultVoucherWithStats.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateVoucherUsage"></a>
# **updateVoucherUsage**
> updateVoucherUsage(appId, voucherId, voucherUsage)



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
String appId = "appId_example"; // String | 
Integer voucherId = 56; // Integer | 
UpdateVoucherUsage voucherUsage = new UpdateVoucherUsage(); // UpdateVoucherUsage | 
try {
    apiInstance.updateVoucherUsage(appId, voucherId, voucherUsage);
} catch (ApiException e) {
    System.err.println("Exception when calling VouchersApi#updateVoucherUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **voucherId** | **Integer**|  |
 **voucherUsage** | [**UpdateVoucherUsage**](UpdateVoucherUsage.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

