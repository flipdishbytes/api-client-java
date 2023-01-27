# StripeCustomConnectApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankAccountAndConnectedAccount**](StripeCustomConnectApi.md#createBankAccountAndConnectedAccount) | **POST** /api/v1.0/{appId}/customconnect/bank-account | Create a new Bank Account and Stripe connected account
[**createStripeConnectedAccount**](StripeCustomConnectApi.md#createStripeConnectedAccount) | **POST** /api/v1.0/{appId}/customconnect/{bankAccountId}/create-update-account | Create or update a Stripe connected account associated with the bank account of bankAccountId
[**createStripeConnectedAccountLink**](StripeCustomConnectApi.md#createStripeConnectedAccountLink) | **POST** /api/v1.0/{appId}/customconnect/{stripeConnectedAccountId}/create-account-link | Gets a single-use Stripe URL for the given account
[**getCustomConnect**](StripeCustomConnectApi.md#getCustomConnect) | **GET** /api/v1.0/{appId}/customconnect/{storeId} | Gets a list of stripe custom connect ids information
[**getVerificationStatus**](StripeCustomConnectApi.md#getVerificationStatus) | **GET** /api/v1.0/{appId}/customconnect/verification-status | Gets the current verification status of the given connected account
[**setBankAccountBusinessType**](StripeCustomConnectApi.md#setBankAccountBusinessType) | **POST** /api/v1.0/{appId}/customconnect/bank-account/{bankAccountId}/businesstype | Update bank account&#39;s BusinessType and create a Stripe Connected Account
[**stripeCustomConnectRefresh**](StripeCustomConnectApi.md#stripeCustomConnectRefresh) | **GET** /api/v1.0/{appId}/customconnect/refresh-link | 
[**updateBankAccountDetails**](StripeCustomConnectApi.md#updateBankAccountDetails) | **POST** /api/v1.0/{appId}/customconnect/{bankAccountId}/update-bank-account-details | Update bank account details
[**updatePayoutSchedule**](StripeCustomConnectApi.md#updatePayoutSchedule) | **POST** /api/v1.0/{appId}/customconnect/update-payout-schedule/{stripeConnectedAccountId}/{interval} | Update Stripe Connection Account&#39;s payout schedule


<a name="createBankAccountAndConnectedAccount"></a>
# **createBankAccountAndConnectedAccount**
> RestApiResultBankAccountDetail createBankAccountAndConnectedAccount(appId, account)

Create a new Bank Account and Stripe connected account

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
String appId = "appId_example"; // String | App Name
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | Account to be created
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
 **appId** | **String**| App Name |
 **account** | [**BankAccountCreate**](BankAccountCreate.md)| Account to be created |

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

Create or update a Stripe connected account associated with the bank account of bankAccountId

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
String appId = "appId_example"; // String | App Name Id
Integer bankAccountId = 56; // Integer | Bank Account Id
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
 **appId** | **String**| App Name Id |
 **bankAccountId** | **Integer**| Bank Account Id |

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

Gets a single-use Stripe URL for the given account

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
String appId = "appId_example"; // String | App Name
String stripeConnectedAccountId = "stripeConnectedAccountId_example"; // String | Stripe Connected Account Id
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
 **appId** | **String**| App Name |
 **stripeConnectedAccountId** | **String**| Stripe Connected Account Id |
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

Gets a list of stripe custom connect ids information

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

Gets the current verification status of the given connected account

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

Update bank account&#39;s BusinessType and create a Stripe Connected Account

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
String appId = "appId_example"; // String | App Name
Integer bankAccountId = 56; // Integer | Bank Account Id
String businessType = "businessType_example"; // String | Bank Account business type
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
 **appId** | **String**| App Name |
 **bankAccountId** | **Integer**| Bank Account Id |
 **businessType** | **String**| Bank Account business type |

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

Update bank account details

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
String appId = "appId_example"; // String | App Name Id
Integer bankAccountId = 56; // Integer | Bank Account Id
BankAccountDetailsUpdateRequest updateRequest = new BankAccountDetailsUpdateRequest(); // BankAccountDetailsUpdateRequest | fields to be updated
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
 **appId** | **String**| App Name Id |
 **bankAccountId** | **Integer**| Bank Account Id |
 **updateRequest** | [**BankAccountDetailsUpdateRequest**](BankAccountDetailsUpdateRequest.md)| fields to be updated |

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

Update Stripe Connection Account&#39;s payout schedule

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

