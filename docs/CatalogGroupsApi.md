# CatalogGroupsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveGroup**](CatalogGroupsApi.md#archiveGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId}/archive | Archive Catalog Group
[**createCatalogGroup**](CatalogGroupsApi.md#createCatalogGroup) | **POST** /api/v1.0/{appId}/catalog/groups | Create a Catalog Group
[**duplicateGroup**](CatalogGroupsApi.md#duplicateGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId}/duplicate | Duplicate Catalog Group
[**getGroupById**](CatalogGroupsApi.md#getGroupById) | **GET** /api/v1.0/{appId}/catalog/groups/{catalogItemId} | Get group by Id
[**getGroups**](CatalogGroupsApi.md#getGroups) | **GET** /api/v1.0/{appId}/catalog/groups | Get paginated groups by app name id filtered by types
[**updateGroup**](CatalogGroupsApi.md#updateGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId} | Update Catalog Group


<a name="archiveGroup"></a>
# **archiveGroup**
> archiveGroup(appId, catalogItemId)

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
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.archiveGroup(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#archiveGroup");
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

<a name="duplicateGroup"></a>
# **duplicateGroup**
> duplicateGroup(appId, catalogItemId)

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
String catalogItemId = "catalogItemId_example"; // String | 
try {
    apiInstance.duplicateGroup(appId, catalogItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#duplicateGroup");
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

<a name="getGroupById"></a>
# **getGroupById**
> CatalogGroup getGroupById(appId, catalogItemId)

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
String catalogItemId = "catalogItemId_example"; // String | 
try {
    CatalogGroup result = apiInstance.getGroupById(appId, catalogItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#getGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |

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

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(appId, catalogItemId, updateCatalogGroup)

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
String catalogItemId = "catalogItemId_example"; // String | 
UpdateCatalogGroup updateCatalogGroup = new UpdateCatalogGroup(); // UpdateCatalogGroup | 
try {
    apiInstance.updateGroup(appId, catalogItemId, updateCatalogGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **catalogItemId** | **String**|  |
 **updateCatalogGroup** | [**UpdateCatalogGroup**](UpdateCatalogGroup.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

