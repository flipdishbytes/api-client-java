# StripeCustomConnectApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankAccountAndConnectedAccount**](StripeCustomConnectApi.md#createBankAccountAndConnectedAccount) | **POST** /api/v1.0/{appId}/customconnect/bank-account | 
[**createStripeConnectedAccount**](StripeCustomConnectApi.md#createStripeConnectedAccount) | **POST** /api/v1.0/{appId}/customconnect/{bankAccountId}/create-update-account | 
[**createStripeConnectedAccountLink**](StripeCustomConnectApi.md#createStripeConnectedAccountLink) | **POST** /api/v1.0/{appId}/customconnect/{stripeConnectedAccountId}/create-account-link | 
[**getCustomConnect**](StripeCustomConnectApi.md#getCustomConnect) | **GET** /api/v1.0/{appId}/customconnect/{storeId} | 
[**getVerificationStatus**](StripeCustomConnectApi.md#getVerificationStatus) | **GET** /api/v1.0/{appId}/customconnect/verification-status | 
[**setBankAccountBusinessType**](StripeCustomConnectApi.md#setBankAccountBusinessType) | **POST** /api/v1.0/{appId}/customconnect/bank-account/{bankAccountId}/businesstype | 
[**stripeCustomConnectRefresh**](StripeCustomConnectApi.md#stripeCustomConnectRefresh) | **GET** /api/v1.0/{appId}/customconnect/refresh-link | 
[**updateBankAccountDetails**](StripeCustomConnectApi.md#updateBankAccountDetails) | **POST** /api/v1.0/{appId}/customconnect/{bankAccountId}/update-bank-account-details | 
[**updatePayoutSchedule**](StripeCustomConnectApi.md#updatePayoutSchedule) | **POST** /api/v1.0/{appId}/customconnect/update-payout-schedule/{stripeConnectedAccountId}/{interval} | 


<a name="createBankAccountAndConnectedAccount"></a>
# **createBankAccountAndConnectedAccount**
> RestApiResultBankAccountDetail createBankAccountAndConnectedAccount(appId, account)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | 
try {
    RestApiResultBankAccountDetail result = apiInstance.createBankAccountAndConnectedAccount(appId, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#createBankAccountAndConnectedAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **account** | [**BankAccountCreate**](BankAccountCreate.md)|  |

### Return type

[**RestApiResultBankAccountDetail**](RestApiResultBankAccountDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createStripeConnectedAccount"></a>
# **createStripeConnectedAccount**
> RestApiResultStripeConnectedAccount createStripeConnectedAccount(appId, bankAccountId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
try {
    RestApiResultStripeConnectedAccount result = apiInstance.createStripeConnectedAccount(appId, bankAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#createStripeConnectedAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |

### Return type

[**RestApiResultStripeConnectedAccount**](RestApiResultStripeConnectedAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createStripeConnectedAccountLink"></a>
# **createStripeConnectedAccountLink**
> RestApiResultStripeConnectedAccount createStripeConnectedAccountLink(appId, stripeConnectedAccountId, stripeAccountLinkRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
String stripeConnectedAccountId = "stripeConnectedAccountId_example"; // String | 
StripeAccountLinkRequest stripeAccountLinkRequest = new StripeAccountLinkRequest(); // StripeAccountLinkRequest | 
try {
    RestApiResultStripeConnectedAccount result = apiInstance.createStripeConnectedAccountLink(appId, stripeConnectedAccountId, stripeAccountLinkRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#createStripeConnectedAccountLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **stripeConnectedAccountId** | **String**|  |
 **stripeAccountLinkRequest** | [**StripeAccountLinkRequest**](StripeAccountLinkRequest.md)|  |

### Return type

[**RestApiResultStripeConnectedAccount**](RestApiResultStripeConnectedAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCustomConnect"></a>
# **getCustomConnect**
> RestApiArrayResultStripeCustomConnectedAccount getCustomConnect(storeId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
Integer storeId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultStripeCustomConnectedAccount result = apiInstance.getCustomConnect(storeId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#getCustomConnect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultStripeCustomConnectedAccount**](RestApiArrayResultStripeCustomConnectedAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getVerificationStatus"></a>
# **getVerificationStatus**
> RestApiResultStripeConnectedAccount getVerificationStatus(appId, stripeConnectedAccountId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
String stripeConnectedAccountId = "stripeConnectedAccountId_example"; // String | 
try {
    RestApiResultStripeConnectedAccount result = apiInstance.getVerificationStatus(appId, stripeConnectedAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#getVerificationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **stripeConnectedAccountId** | **String**|  |

### Return type

[**RestApiResultStripeConnectedAccount**](RestApiResultStripeConnectedAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setBankAccountBusinessType"></a>
# **setBankAccountBusinessType**
> RestApiResultBankAccountDetail setBankAccountBusinessType(appId, bankAccountId, businessType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
String businessType = "businessType_example"; // String | 
try {
    RestApiResultBankAccountDetail result = apiInstance.setBankAccountBusinessType(appId, bankAccountId, businessType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#setBankAccountBusinessType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **businessType** | **String**|  |

### Return type

[**RestApiResultBankAccountDetail**](RestApiResultBankAccountDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="stripeCustomConnectRefresh"></a>
# **stripeCustomConnectRefresh**
> Object stripeCustomConnectRefresh(linkRequestId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
Integer linkRequestId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    Object result = apiInstance.stripeCustomConnectRefresh(linkRequestId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#stripeCustomConnectRefresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkRequestId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateBankAccountDetails"></a>
# **updateBankAccountDetails**
> RestApiResultStripeConnectedAccount updateBankAccountDetails(appId, bankAccountId, updateRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
Integer bankAccountId = 56; // Integer | 
BankAccountDetailsUpdateRequest updateRequest = new BankAccountDetailsUpdateRequest(); // BankAccountDetailsUpdateRequest | 
try {
    RestApiResultStripeConnectedAccount result = apiInstance.updateBankAccountDetails(appId, bankAccountId, updateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#updateBankAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **updateRequest** | [**BankAccountDetailsUpdateRequest**](BankAccountDetailsUpdateRequest.md)|  |

### Return type

[**RestApiResultStripeConnectedAccount**](RestApiResultStripeConnectedAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePayoutSchedule"></a>
# **updatePayoutSchedule**
> RestApiResultModelBase updatePayoutSchedule(appId, stripeConnectedAccountId, interval)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectApi apiInstance = new StripeCustomConnectApi();
String appId = "appId_example"; // String | 
String stripeConnectedAccountId = "stripeConnectedAccountId_example"; // String | 
String interval = "interval_example"; // String | 
try {
    RestApiResultModelBase result = apiInstance.updatePayoutSchedule(appId, stripeConnectedAccountId, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectApi#updatePayoutSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **stripeConnectedAccountId** | **String**|  |
 **interval** | **String**|  |

### Return type

[**RestApiResultModelBase**](RestApiResultModelBase.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

