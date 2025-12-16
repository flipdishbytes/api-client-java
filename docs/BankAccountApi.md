# BankAccountApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachBankAccountToStore**](BankAccountApi.md#attachBankAccountToStore) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/store/{storeId} | 
[**createBankAccount**](BankAccountApi.md#createBankAccount) | **POST** /api/v1.0/{appId}/bankaccounts | 
[**deleteBankAccount**](BankAccountApi.md#deleteBankAccount) | **DELETE** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | 
[**getBankAccountById**](BankAccountApi.md#getBankAccountById) | **GET** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | 
[**getBankAccounts**](BankAccountApi.md#getBankAccounts) | **GET** /api/v1.0/{appId}/bankaccounts | 
[**getCountriesWithFieldDefinitions**](BankAccountApi.md#getCountriesWithFieldDefinitions) | **GET** /api/v1.0/{appId}/bankaccounts/countries-field-definitions | 
[**getFieldDefinitions**](BankAccountApi.md#getFieldDefinitions) | **GET** /api/v1.0/{appId}/bankaccounts/field-definitions | 
[**updateBankAccount**](BankAccountApi.md#updateBankAccount) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId} | 
[**updateBankAccountState**](BankAccountApi.md#updateBankAccountState) | **POST** /api/v1.0/{appId}/bankaccounts/{bankAccountId}/state/{state} | 


<a name="attachBankAccountToStore"></a>
# **attachBankAccountToStore**
> attachBankAccountToStore(appId, bankAccountId, storeId)



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
Integer bankAccountId = 56; // Integer | 
Integer storeId = 56; // Integer | 
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
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **storeId** | **Integer**|  |

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
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | 
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
 **appId** | **String**|  |
 **account** | [**BankAccountCreate**](BankAccountCreate.md)|  |

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
Integer bankAccountId = 56; // Integer | 
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
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |

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
Integer bankAccountId = 56; // Integer | 
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
 **bankAccountId** | **Integer**|  |
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
 **appId** | **String**|  |

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
Integer bankAccountId = 56; // Integer | 
BankAccountCreate account = new BankAccountCreate(); // BankAccountCreate | 
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
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **account** | [**BankAccountCreate**](BankAccountCreate.md)|  |

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
Integer bankAccountId = 56; // Integer | 
String state = "state_example"; // String | 
String reason = "reason_example"; // String | 
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
 **appId** | **String**|  |
 **bankAccountId** | **Integer**|  |
 **state** | **String**|  |
 **reason** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

