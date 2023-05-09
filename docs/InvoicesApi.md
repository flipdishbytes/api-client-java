# InvoicesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /api/v1.0/{appId}/invoices | 


<a name="getInvoices"></a>
# **getInvoices**
> RestApiFinanceSearchPaginationResultInvoice getInvoices(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId)



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
String appId = "appId_example"; // String | 
String subscriptionId = "subscriptionId_example"; // String | 
Integer limit = 56; // Integer | 
String pageId = "pageId_example"; // String | 
Boolean excludeNotOwnedInvoices = true; // Boolean | 
OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
String invoiceNumber = "invoiceNumber_example"; // String | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
try {
    RestApiFinanceSearchPaginationResultInvoice result = apiInstance.getInvoices(appId, subscriptionId, limit, pageId, excludeNotOwnedInvoices, dateFrom, dateTo, invoiceNumber, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoicesApi#getInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **subscriptionId** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **pageId** | **String**|  | [optional]
 **excludeNotOwnedInvoices** | **Boolean**|  | [optional]
 **dateFrom** | **OffsetDateTime**|  | [optional]
 **dateTo** | **OffsetDateTime**|  | [optional]
 **invoiceNumber** | **String**|  | [optional]
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**RestApiFinanceSearchPaginationResultInvoice**](RestApiFinanceSearchPaginationResultInvoice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

