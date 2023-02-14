# MetafieldDefinitionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetafieldDefinition**](MetafieldDefinitionsApi.md#createMetafieldDefinition) | **POST** /api/v1.0/{appId}/metafields/definitions/{ownerEntity} | 
[**getMetafieldDefinitionByKey**](MetafieldDefinitionsApi.md#getMetafieldDefinitionByKey) | **GET** /api/v1.0/{appId}/metafields/definitions/{ownerEntity}/{key} | 
[**getMetafieldDefinitions**](MetafieldDefinitionsApi.md#getMetafieldDefinitions) | **GET** /api/v1.0/{appId}/metafields/definitions/{ownerEntity} | 
[**getOwnerEntityConfigurations**](MetafieldDefinitionsApi.md#getOwnerEntityConfigurations) | **GET** /api/v1.0/{appId}/metafields/definitions | 
[**getOwnerEntityRecommendations**](MetafieldDefinitionsApi.md#getOwnerEntityRecommendations) | **GET** /api/v1.0/{appId}/metafields/definitions/recommendations/{ownerEntity} | 
[**updateMetafieldDefinition**](MetafieldDefinitionsApi.md#updateMetafieldDefinition) | **POST** /api/v1.0/{appId}/metafields/definitions/{ownerEntity}/{key} | 


<a name="createMetafieldDefinition"></a>
# **createMetafieldDefinition**
> RestApiResultMetafieldDefinition createMetafieldDefinition(appId, ownerEntity, createMetafieldDefinition)



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
CreateMetafieldDefinition createMetafieldDefinition = new CreateMetafieldDefinition(); // CreateMetafieldDefinition | 
try {
    RestApiResultMetafieldDefinition result = apiInstance.createMetafieldDefinition(appId, ownerEntity, createMetafieldDefinition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#createMetafieldDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **ownerEntity** | **String**|  | [enum: CatalogItem, CatalogGroup, Menu]
 **createMetafieldDefinition** | [**CreateMetafieldDefinition**](CreateMetafieldDefinition.md)|  |

### Return type

[**RestApiResultMetafieldDefinition**](RestApiResultMetafieldDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMetafieldDefinitionByKey"></a>
# **getMetafieldDefinitionByKey**
> RestApiResultMetafieldDefinition getMetafieldDefinitionByKey(appId, ownerEntity, key)



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
String key = "key_example"; // String | 
try {
    RestApiResultMetafieldDefinition result = apiInstance.getMetafieldDefinitionByKey(appId, ownerEntity, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#getMetafieldDefinitionByKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **ownerEntity** | **String**|  | [enum: CatalogItem, CatalogGroup, Menu]
 **key** | **String**|  |

### Return type

[**RestApiResultMetafieldDefinition**](RestApiResultMetafieldDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMetafieldDefinitions"></a>
# **getMetafieldDefinitions**
> RestApiPaginationResultMetafieldDefinition getMetafieldDefinitions(appId, ownerEntity, searchTerm, page, limit)



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

<a name="getOwnerEntityConfigurations"></a>
# **getOwnerEntityConfigurations**
> OwnerEntityConfigurations getOwnerEntityConfigurations(appId)



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
try {
    OwnerEntityConfigurations result = apiInstance.getOwnerEntityConfigurations(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#getOwnerEntityConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**OwnerEntityConfigurations**](OwnerEntityConfigurations.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getOwnerEntityRecommendations"></a>
# **getOwnerEntityRecommendations**
> RestApiPaginationResultMetafieldDefinitionRecommendation getOwnerEntityRecommendations(appId, ownerEntity, searchTerm, page, limit)



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
    RestApiPaginationResultMetafieldDefinitionRecommendation result = apiInstance.getOwnerEntityRecommendations(appId, ownerEntity, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#getOwnerEntityRecommendations");
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

[**RestApiPaginationResultMetafieldDefinitionRecommendation**](RestApiPaginationResultMetafieldDefinitionRecommendation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMetafieldDefinition"></a>
# **updateMetafieldDefinition**
> RestApiResultMetafieldDefinition updateMetafieldDefinition(appId, ownerEntity, key, updateMetafieldDefinition)



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
String key = "key_example"; // String | 
UpdateMetafieldDefinition updateMetafieldDefinition = new UpdateMetafieldDefinition(); // UpdateMetafieldDefinition | 
try {
    RestApiResultMetafieldDefinition result = apiInstance.updateMetafieldDefinition(appId, ownerEntity, key, updateMetafieldDefinition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetafieldDefinitionsApi#updateMetafieldDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **ownerEntity** | **String**|  | [enum: CatalogItem, CatalogGroup, Menu]
 **key** | **String**|  |
 **updateMetafieldDefinition** | [**UpdateMetafieldDefinition**](UpdateMetafieldDefinition.md)|  |

### Return type

[**RestApiResultMetafieldDefinition**](RestApiResultMetafieldDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

