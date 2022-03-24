# PendingMenuChangesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPendingMenuChanges**](PendingMenuChangesApi.md#getPendingMenuChanges) | **GET** /api/v1.0/{appId}/menus/pendingmenuchanges | Get menu pending changes from Catalog groups and items


<a name="getPendingMenuChanges"></a>
# **getPendingMenuChanges**
> RestApiPaginationResultPendingMenuChanges getPendingMenuChanges(appId, menuId, catalogElementId, page, limit)

Get menu pending changes from Catalog groups and items

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PendingMenuChangesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PendingMenuChangesApi apiInstance = new PendingMenuChangesApi();
String appId = "appId_example"; // String | 
Integer menuId = 56; // Integer | 
String catalogElementId = "catalogElementId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultPendingMenuChanges result = apiInstance.getPendingMenuChanges(appId, menuId, catalogElementId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PendingMenuChangesApi#getPendingMenuChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **menuId** | **Integer**|  | [optional]
 **catalogElementId** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultPendingMenuChanges**](RestApiPaginationResultPendingMenuChanges.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

