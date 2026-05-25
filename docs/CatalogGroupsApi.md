# CatalogGroupsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveGroup**](CatalogGroupsApi.md#archiveGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId}/archive | 
[**createGroup**](CatalogGroupsApi.md#createGroup) | **POST** /api/v1.0/{appId}/catalog/groups | 
[**duplicateGroup**](CatalogGroupsApi.md#duplicateGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId}/duplicate | 
[**getGroupById**](CatalogGroupsApi.md#getGroupById) | **GET** /api/v1.0/{appId}/catalog/groups/{catalogItemId} | 
[**getGroups**](CatalogGroupsApi.md#getGroups) | **GET** /api/v1.0/{appId}/catalog/groups | 
[**updateGroup**](CatalogGroupsApi.md#updateGroup) | **POST** /api/v1.0/{appId}/catalog/groups/{catalogItemId} | 


<a name="archiveGroup"></a>
# **archiveGroup**
> archiveGroup(appId, catalogItemId)



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

<a name="createGroup"></a>
# **createGroup**
> RestApiResultGroup createGroup(appId, createGroup)



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
CreateGroup createGroup = new CreateGroup(); // CreateGroup | 
try {
    RestApiResultGroup result = apiInstance.createGroup(appId, createGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogGroupsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **createGroup** | [**CreateGroup**](CreateGroup.md)|  |

### Return type

[**RestApiResultGroup**](RestApiResultGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="duplicateGroup"></a>
# **duplicateGroup**
> duplicateGroup(appId, catalogItemId)



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
> Group getGroupById(appId, catalogItemId)



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
    Group result = apiInstance.getGroupById(appId, catalogItemId);
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

[**Group**](Group.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getGroups"></a>
# **getGroups**
> RestApiPaginationResultGroup getGroups(appId, groupTypes, searchTerm, page, limit)



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
    RestApiPaginationResultGroup result = apiInstance.getGroups(appId, groupTypes, searchTerm, page, limit);
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

[**RestApiPaginationResultGroup**](RestApiPaginationResultGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(appId, catalogItemId, updateGroup)



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
UpdateGroup updateGroup = new UpdateGroup(); // UpdateGroup | 
try {
    apiInstance.updateGroup(appId, catalogItemId, updateGroup);
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
 **updateGroup** | [**UpdateGroup**](UpdateGroup.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

