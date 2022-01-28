# MetafieldDefinitionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetafieldDefinitions**](MetafieldDefinitionsApi.md#getMetafieldDefinitions) | **GET** /api/v1.0/{appId}/metafields/definitions/{ownerEntity} | Get paginated groups by app name id filtered by types


<a name="getMetafieldDefinitions"></a>
# **getMetafieldDefinitions**
> RestApiPaginationResultMetafieldDefinition getMetafieldDefinitions(appId, ownerEntity, searchTerm, page, limit)

Get paginated groups by app name id filtered by types

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MetafieldDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MetafieldDefinitionsApi apiInstance = new MetafieldDefinitionsApi();
String appId = "appId_example"; // String | 
String ownerEntity = "ownerEntity_example"; // String | 
String searchTerm = "searchTerm_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultMetafieldDefinition result = apiInstance.getMetafieldDefinitions(appId, ownerEntity, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#getMetafieldDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **ownerEntity** | **String**|  | [enum: CatalogItem, CatalogGroup, Menu]
 **searchTerm** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultMetafieldDefinition**](RestApiPaginationResultMetafieldDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

