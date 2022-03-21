# CatalogItemsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveCatalogItem**](CatalogItemsApi.md#archiveCatalogItem) | **POST** /api/v1.0/{appId}/catalog/items/{catalogItemId}/archive | Archive Catalog Item
[**createCatalogItem**](CatalogItemsApi.md#createCatalogItem) | **POST** /api/v1.0/{appId}/catalog/items | Create a Catalog Item
[**duplicateCatalogItem**](CatalogItemsApi.md#duplicateCatalogItem) | **POST** /api/v1.0/{appId}/catalog/items/{catalogItemId}/duplicate | Duplicate Catalog Item
[**getCatalogItemById**](CatalogItemsApi.md#getCatalogItemById) | **GET** /api/v1.0/{appId}/catalog/items/{catalogItemId} | Get item by Id
[**getItems**](CatalogItemsApi.md#getItems) | **GET** /api/v1.0/{appId}/catalog/items | Get paginated items by app name id filtered by types
[**updateCatalogItem**](CatalogItemsApi.md#updateCatalogItem) | **POST** /api/v1.0/{appId}/catalog/items/{catalogItemId} | Update Catalog Item


<a name="archiveCatalogItem"></a>
# **archiveCatalogItem**
> archiveCatalogItem(appId, catalogItemId)

Archive Catalog Item

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.archiveCatalogItem(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#archiveCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createCatalogItem"></a>
# **createCatalogItem**
> RestApiResultCatalogItem createCatalogItem(appId, createCatalogItem)

Create a Catalog Item

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
CreateCatalogItem createCatalogItem = new CreateCatalogItem(); // CreateCatalogItem | 
try {
    RestApiResultCatalogItem result = apiInstance.createCatalogItem(appId, createCatalogItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#createCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **createCatalogItem** | [**CreateCatalogItem**](CreateCatalogItem.md)|  |

### Return type

[**RestApiResultCatalogItem**](RestApiResultCatalogItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="duplicateCatalogItem"></a>
# **duplicateCatalogItem**
> duplicateCatalogItem(appId, catalogItemId)

Duplicate Catalog Item

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.duplicateCatalogItem(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#duplicateCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCatalogItemById"></a>
# **getCatalogItemById**
> CatalogItem getCatalogItemById(appId, catalogItemId)

Get item by Id

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    CatalogItem result = apiInstance.getCatalogItemById(appId, catalogItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#getCatalogItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |

### Return type

[**CatalogItem**](CatalogItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getItems"></a>
# **getItems**
> RestApiPaginationResultCatalogItem getItems(appId, itemTypes, searchTerm, page, limit)

Get paginated items by app name id filtered by types

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
List<String> itemTypes = Arrays.asList("itemTypes_example"); // List<String> | 
String searchTerm = "searchTerm_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultCatalogItem result = apiInstance.getItems(appId, itemTypes, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#getItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **itemTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: Product, Modifier]
 **searchTerm** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultCatalogItem**](RestApiPaginationResultCatalogItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateCatalogItem"></a>
# **updateCatalogItem**
> updateCatalogItem(appId, catalogItemId, updateCatalogItem)

Update Catalog Item

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogItemsApi apiInstance = new CatalogItemsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
UpdateCatalogItem updateCatalogItem = new UpdateCatalogItem(); // UpdateCatalogItem | 
try {
    apiInstance.updateCatalogItem(appId, catalogItemId, updateCatalogItem);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogItemsApi#updateCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |
 **updateCatalogItem** | [**UpdateCatalogItem**](UpdateCatalogItem.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

