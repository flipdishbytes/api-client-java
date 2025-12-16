# CatalogProductsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProduct**](CatalogProductsApi.md#archiveProduct) | **POST** /api/v1.0/{appId}/catalog/products/{catalogItemId}/archive | Archive Product
[**createProduct**](CatalogProductsApi.md#createProduct) | **POST** /api/v1.0/{appId}/catalog/products | Create a Product
[**duplicateProduct**](CatalogProductsApi.md#duplicateProduct) | **POST** /api/v1.0/{appId}/catalog/products/{catalogItemId}/duplicate | Duplicate Product
[**getProductById**](CatalogProductsApi.md#getProductById) | **GET** /api/v1.0/{appId}/catalog/products/{catalogItemId} | Get Product by Id
[**getProducts**](CatalogProductsApi.md#getProducts) | **GET** /api/v1.0/{appId}/catalog/products | Get paginated products by app name id filtered by types
[**updateProduct**](CatalogProductsApi.md#updateProduct) | **POST** /api/v1.0/{appId}/catalog/products/{catalogItemId} | Update Product


<a name="archiveProduct"></a>
# **archiveProduct**
> archiveProduct(appId, catalogItemId)

Archive Product

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.archiveProduct(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#archiveProduct");
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

<a name="createProduct"></a>
# **createProduct**
> RestApiResultProduct createProduct(appId, createProduct)

Create a Product

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
CreateProduct createProduct = new CreateProduct(); // CreateProduct | 
try {
    RestApiResultProduct result = apiInstance.createProduct(appId, createProduct);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#createProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **createProduct** | [**CreateProduct**](CreateProduct.md)|  |

### Return type

[**RestApiResultProduct**](RestApiResultProduct.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="duplicateProduct"></a>
# **duplicateProduct**
> duplicateProduct(appId, catalogItemId)

Duplicate Product

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.duplicateProduct(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#duplicateProduct");
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

<a name="getProductById"></a>
# **getProductById**
> Product getProductById(appId, catalogItemId)

Get Product by Id

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
try {
    Product result = apiInstance.getProductById(appId, catalogItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#getProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |

### Return type

[**Product**](Product.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getProducts"></a>
# **getProducts**
> RestApiPaginationResultProduct getProducts(appId, productTypes, searchTerm, page, limit)

Get paginated products by app name id filtered by types

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
List<String> productTypes = Arrays.asList("productTypes_example"); // List<String> | 
String searchTerm = "searchTerm_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultProduct result = apiInstance.getProducts(appId, productTypes, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **productTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: Product, Modifier]
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

<a name="updateProduct"></a>
# **updateProduct**
> updateProduct(appId, catalogItemId, updateProduct)

Update Product

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogProductsApi apiInstance = new CatalogProductsApi();
String appId = "appId_example"; // String | 
String catalogItemId = "catalogItemId_example"; // String | 
UpdateProduct updateProduct = new UpdateProduct(); // UpdateProduct | 
try {
    apiInstance.updateProduct(appId, catalogItemId, updateProduct);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogProductsApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |
 **updateProduct** | [**UpdateProduct**](UpdateProduct.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

