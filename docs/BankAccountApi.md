# BankAccountApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachBankAccountToStore**](BankAccountApi.md#attachBankAccountToStore) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/store/{storeId} | [PRIVATE API] Attach Bank Account to Store
[**createBankAccount**](BankAccountApi.md#createBankAccount) | **POST** /api/v1.0/{appId}/bankaccounts | Create a new Bank Account and attach to this App
[**deleteBankAccount**](BankAccountApi.md#deleteBankAccount) | **DELETE** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | Delete BankAccount
[**getBankAccountById**](BankAccountApi.md#getBankAccountById) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | Get BankAccount Detail by Id
[**getBankAccounts**](BankAccountApi.md#getBankAccounts) | **GET** /api/v1.0/{appId}/bankaccounts | Get List of BankAccounts for WL
[**getCountriesWithFieldDefinitions**](BankAccountApi.md#getCountriesWithFieldDefinitions) | **GET** /api/v1.0/{appId}/bankaccounts/countries-field-definitions | Get bank account fields definitions
[**getFieldDefinitions**](BankAccountApi.md#getFieldDefinitions) | **GET** /api/v1.0/{appId}/bankaccounts/field-definitions | Get bank account fields definitions
[**updateBankAccount**](BankAccountApi.md#updateBankAccount) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | Update BankAccount
[**updateBankAccountState**](BankAccountApi.md#updateBankAccountState) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/state/{state} | [PRIVATE API] Update State of Bank Account


<a name="attachBankAccountToStore"></a>
# **attachBankAccountToStore**
> attachBankAccountToStore(appId, bankAccountId, storeId)

[PRIVATE API] Attach Bank Account to Store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
Integer bankAccountId = 56; // Integer | Id of account to be updated
Integer storeId = 56; // Integer | Store to be attached to Bank account
try {
    apiInstance.attachBankAccountToStore(appId, bankAccountId, storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#attachBankAccountToStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name |
 **bankAccountId** | **Integer**| Id of account to be updated |
 **storeId** | **Integer**| Store to be attached to Bank account |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createBankAccount"></a>
# **createBankAccount**
> RestApiResultBankAccountDetail createBankAccount(appId, account)

Create a new Bank Account and attach to this App

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | Account to be created
try {
    RestApiResultBankAccountDetail result = apiInstance.createBankAccount(appId, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#createBankAccount");
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

<a name="deleteBankAccount"></a>
# **deleteBankAccount**
> deleteBankAccount(appId, bankAccountId)

Delete BankAccount

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
Integer bankAccountId = 56; // Integer | Id of account to be marked as deleted
try {
    apiInstance.deleteBankAccount(appId, bankAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#deleteBankAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name |
 **bankAccountId** | **Integer**| Id of account to be marked as deleted |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBankAccountById"></a>
# **getBankAccountById**
> RestApiResultBankAccountDetail getBankAccountById(bankAccountId, appId)

Get BankAccount Detail by Id

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
Integer bankAccountId = 56; // Integer | Id of account
String appId = "appId_example"; // String | 
try {
    RestApiResultBankAccountDetail result = apiInstance.getBankAccountById(bankAccountId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#getBankAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccountId** | **Integer**| Id of account |
 **appId** | **String**|  |

### Return type

[**RestApiResultBankAccountDetail**](RestApiResultBankAccountDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBankAccounts"></a>
# **getBankAccounts**
> RestApiArrayResultBankAccountSummary getBankAccounts(appId)

Get List of BankAccounts for WL

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
try {
    RestApiArrayResultBankAccountSummary result = apiInstance.getBankAccounts(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#getBankAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name |

### Return type

[**RestApiArrayResultBankAccountSummary**](RestApiArrayResultBankAccountSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCountriesWithFieldDefinitions"></a>
# **getCountriesWithFieldDefinitions**
> RestApiArrayResultCountryWithAccountFieldsDefinitions getCountriesWithFieldDefinitions(appId)

Get bank account fields definitions

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultCountryWithAccountFieldsDefinitions result = apiInstance.getCountriesWithFieldDefinitions(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#getCountriesWithFieldDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultCountryWithAccountFieldsDefinitions**](RestApiArrayResultCountryWithAccountFieldsDefinitions.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFieldDefinitions"></a>
# **getFieldDefinitions**
> RestApiResultAccountFieldsDefinitions getFieldDefinitions(appId)

Get bank account fields definitions

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultAccountFieldsDefinitions result = apiInstance.getFieldDefinitions(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#getFieldDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultAccountFieldsDefinitions**](RestApiResultAccountFieldsDefinitions.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateBankAccount"></a>
# **updateBankAccount**
> updateBankAccount(appId, bankAccountId, account)

Update BankAccount

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
Integer bankAccountId = 56; // Integer | Id of account to be updated
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | Details to update account with
try {
    apiInstance.updateBankAccount(appId, bankAccountId, account);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#updateBankAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name |
 **bankAccountId** | **Integer**| Id of account to be updated |
 **account** | [**BankAccountCreate**](BankAccountCreate.md)| Details to update account with |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateBankAccountState"></a>
# **updateBankAccountState**
> updateBankAccountState(appId, bankAccountId, state, reason)

[PRIVATE API] Update State of Bank Account

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.BankAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BankAccountApi apiInstance = new BankAccountApi();
String appId = "appId_example"; // String | App Name
Integer bankAccountId = 56; // Integer | Id of account to be updated
String state = "state_example"; // String | New state
String reason = "reason_example"; // String | Reason for state change, Mandatory for rejections
try {
    apiInstance.updateBankAccountState(appId, bankAccountId, state, reason);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountApi#updateBankAccountState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name |
 **bankAccountId** | **Integer**| Id of account to be updated |
 **state** | **String**| New state |
 **reason** | **String**| Reason for state change, Mandatory for rejections |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

