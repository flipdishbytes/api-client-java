# InvoicesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /api/v1.0/{appId}/invoices | Get list of invoices


<a name="getInvoices"></a>
# **getInvoices**
> RestApiFinanceSearchPaginationResultInvoice getInvoices(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber)

Get list of invoices

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.InvoicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InvoicesApi apiInstance = new InvoicesApi();
String appId = "appId_example"; // String | App Id
String subscriptionId = "subscriptionId_example"; // String | Subscription Id (optional)
Integer limit = 56; // Integer | Limit of invoices to return (optional)
String pageId = "pageId_example"; // String | Id for use in pagination. Use the next_page value returned in a previous response to request subsequent results. Do not include this on the first call (optional)
Boolean excludeNotOwnedInvoices = true; // Boolean | Exclude not owned invoices. Set to true to only view your invoices (optional)
OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | Filter starting from this date (optional)
OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | Filter ending from this date (optional)
String invoiceNumber = "invoiceNumber_example"; // String | Invoice number (optional)
try {
    RestApiFinanceSearchPaginationResultInvoice result = apiInstance.getInvoices(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Id |
 **subscriptionId** | **String**| Subscription Id (optional) | [optional]
 **limit** | **Integer**| Limit of invoices to return (optional) | [optional]
 **pageId** | **String**| Id for use in pagination. Use the next_page value returned in a previous response to request subsequent results. Do not include this on the first call (optional) | [optional]
 **excludeNotOwnedInvoices** | **Boolean**| Exclude not owned invoices. Set to true to only view your invoices (optional) | [optional]
 **dateFrom** | **OffsetDateTime**| Filter starting from this date (optional) | [optional]
 **dateTo** | **OffsetDateTime**| Filter ending from this date (optional) | [optional]
 **invoiceNumber** | **String**| Invoice number (optional) | [optional]

### Return type

[**RestApiFinanceSearchPaginationResultInvoice**](RestApiFinanceSearchPaginationResultInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

