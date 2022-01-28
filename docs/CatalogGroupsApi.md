# CatalogGroupsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveCatalogGroup**](CatalogGroupsApi.md#archiveCatalogGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogGroupId}/archive | Archive Catalog Group
[**createCatalogGroup**](CatalogGroupsApi.md#createCatalogGroup) | **POST** /api/v1.0/{appId}/catalog/groups | Create a Catalog Group
[**duplicateCatalogGroup**](CatalogGroupsApi.md#duplicateCatalogGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogGroupId}/duplicate | Duplicate Catalog Group
[**getCatalogGroupById**](CatalogGroupsApi.md#getCatalogGroupById) | **GET** /api/v1.0/{appId}/catalog/groups/{catalogGroupId} | Get group by Id
[**getGroups**](CatalogGroupsApi.md#getGroups) | **GET** /api/v1.0/{appId}/catalog/groups | Get paginated groups by app name id filtered by types
[**updateCatalogGroup**](CatalogGroupsApi.md#updateCatalogGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogGroupId} | Update Catalog Group


<a name="archiveCatalogGroup"></a>
# **archiveCatalogGroup**
> archiveCatalogGroup(appId, catalogGroupId)

Archive Catalog Group

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
String catalogGroupId = "catalogGroupId_example"; // String | 
try {
    apiInstance.archiveCatalogGroup(appId, catalogGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#archiveCatalogGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogGroupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createCatalogGroup"></a>
# **createCatalogGroup**
> RestApiResultCatalogGroup createCatalogGroup(appId, createCatalogGroup)

Create a Catalog Group

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
CreateCatalogGroup createCatalogGroup = new CreateCatalogGroup(); // CreateCatalogGroup | 
try {
    RestApiResultCatalogGroup result = apiInstance.createCatalogGroup(appId, createCatalogGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#createCatalogGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **createCatalogGroup** | [**CreateCatalogGroup**](CreateCatalogGroup.md)|  |

### Return type

[**RestApiResultCatalogGroup**](RestApiResultCatalogGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="duplicateCatalogGroup"></a>
# **duplicateCatalogGroup**
> duplicateCatalogGroup(appId, catalogGroupId)

Duplicate Catalog Group

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
String catalogGroupId = "catalogGroupId_example"; // String | 
try {
    apiInstance.duplicateCatalogGroup(appId, catalogGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#duplicateCatalogGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogGroupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCatalogGroupById"></a>
# **getCatalogGroupById**
> CatalogGroup getCatalogGroupById(appId, catalogGroupId)

Get group by Id

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
String catalogGroupId = "catalogGroupId_example"; // String | 
try {
    CatalogGroup result = apiInstance.getCatalogGroupById(appId, catalogGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#getCatalogGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogGroupId** | **String**|  |

### Return type

[**CatalogGroup**](CatalogGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getGroups"></a>
# **getGroups**
> RestApiPaginationResultCatalogGroup getGroups(appId, groupTypes, searchTerm, page, limit)

Get paginated groups by app name id filtered by types

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
List<String> groupTypes = Arrays.asList("groupTypes_example"); // List<String> | 
String searchTerm = "searchTerm_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultCatalogGroup result = apiInstance.getGroups(appId, groupTypes, searchTerm, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#getGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **groupTypes** | [**List&lt;String&gt;**](String.md)|  | [enum: ModifierGroup]
 **searchTerm** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultCatalogGroup**](RestApiPaginationResultCatalogGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateCatalogGroup"></a>
# **updateCatalogGroup**
> updateCatalogGroup(appId, catalogGroupId, updateCatalogGroup)

Update Catalog Group

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogGroupsApi apiInstance = new CatalogGroupsApi();
String appId = "appId_example"; // String | 
String catalogGroupId = "catalogGroupId_example"; // String | 
UpdateCatalogGroup updateCatalogGroup = new UpdateCatalogGroup(); // UpdateCatalogGroup | 
try {
    apiInstance.updateCatalogGroup(appId, catalogGroupId, updateCatalogGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#updateCatalogGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogGroupId** | **String**|  |
 **updateCatalogGroup** | [**UpdateCatalogGroup**](UpdateCatalogGroup.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

