# ProductsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProduct**](ProductsApi.md#archiveProduct) | **POST** /api/v1.0/{appId}/catalog/products/{productId}/archive | Archive a product. If the product is used in Menus, the related MenuItems will be marked as deleted
[**duplicateProduct**](ProductsApi.md#duplicateProduct) | **POST** /api/v1.0/{appId}/catalog/products/{productId}/duplicate | Duplicate a product
[**getProducts**](ProductsApi.md#getProducts) | **GET** /api/v1.0/{appId}/catalog/products | Get paginated products by app name id filtered by product types


<a name="archiveProduct"></a>
# **archiveProduct**
> archiveProduct(appId, productId)

Archive a product. If the product is used in Menus, the related MenuItems will be marked as deleted

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
String appId = "appId_example"; // String | 
String productId = "productId_example"; // String | 
try {
    apiInstance.archiveProduct(appId, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#archiveProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **productId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="duplicateProduct"></a>
# **duplicateProduct**
> RestApiResultProduct duplicateProduct(appId, productId)

Duplicate a product

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
String appId = "appId_example"; // String | 
String productId = "productId_example"; // String | 
try {
    RestApiResultProduct result = apiInstance.duplicateProduct(appId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#duplicateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **productId** | **String**|  |

### Return type

[**RestApiResultProduct**](RestApiResultProduct.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getProducts"></a>
# **getProducts**
> RestApiPaginationResultProduct getProducts(appId, productTypes, searchTerm, page, limit)

Get paginated products by app name id filtered by product types

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
String appId = "appId_example"; // String | 
List<String> productTypes = Arrays.asList("productTypes_example"); // List<String> | 
String searchTerm = "searchTerm_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultProduct result = apiInstance.getProducts(appId, productTypes, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **productTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: Unknown, SimpleProduct, Modifier, ModifierGroup]
 **searchTerm** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultProduct**](RestApiPaginationResultProduct.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

