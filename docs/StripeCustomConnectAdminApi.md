# StripeCustomConnectAdminApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**initializeBankAccountConnectedAccount**](StripeCustomConnectAdminApi.md#initializeBankAccountConnectedAccount) | **POST** /api/v1.0/customconnect/initialize-bank-account | Create a new Bank Account and Stripe connected account


<a name="initializeBankAccountConnectedAccount"></a>
# **initializeBankAccountConnectedAccount**
> RestApiResultBankAccountDetail initializeBankAccountConnectedAccount(accounts)

Create a new Bank Account and Stripe connected account

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StripeCustomConnectAdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StripeCustomConnectAdminApi apiInstance = new StripeCustomConnectAdminApi();
List<Integer> accounts = Arrays.asList(new List<Integer>()); // List<Integer> | Accounts to be initialized in stripe
try {
    RestApiResultBankAccountDetail result = apiInstance.initializeBankAccountConnectedAccount(accounts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StripeCustomConnectAdminApi#initializeBankAccountConnectedAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounts** | **List&lt;Integer&gt;**| Accounts to be initialized in stripe |

### Return type

[**RestApiResultBankAccountDetail**](RestApiResultBankAccountDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

