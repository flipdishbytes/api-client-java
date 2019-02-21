# MenusApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMenuImage**](MenusApi.md#deleteMenuImage) | **DELETE** /api/v1.0/menus/{menuId}/image | Delete menu image
[**deleteMenuItemMetadata**](MenusApi.md#deleteMenuItemMetadata) | **DELETE** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | Delete menu item metadata
[**getMenuById**](MenusApi.md#getMenuById) | **GET** /api/v1.0/menus/{menuId} | Get menu by identifier
[**getMenuItemMetadata**](MenusApi.md#getMenuItemMetadata) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | Get menu item metadata
[**getMenuItemMetadata_0**](MenusApi.md#getMenuItemMetadata_0) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | Get menu item metadata by key
[**getMenuItemOptionSetItemMetadata**](MenusApi.md#getMenuItemOptionSetItemMetadata) | **GET** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | Get menu item option set item metadata by key
[**setMenuItemMetadata**](MenusApi.md#setMenuItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | Update menu item metadata
[**setMenuItemOptionSetItemMetadata**](MenusApi.md#setMenuItemOptionSetItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | Update menu item option set item metadata
[**updateMenu**](MenusApi.md#updateMenu) | **POST** /api/v1.0/menus/{menuId} | Update menu
[**uploadMenuImage**](MenusApi.md#uploadMenuImage) | **POST** /api/v1.0/menus/{menuId}/image | Upload menu image


<a name="deleteMenuImage"></a>
# **deleteMenuImage**
> deleteMenuImage(menuId)

Delete menu image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
try {
    apiInstance.deleteMenuImage(menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#deleteMenuImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuItemMetadata"></a>
# **deleteMenuItemMetadata**
> deleteMenuItemMetadata(menuId, storeId, menuItemId, key)

Delete menu item metadata

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer menuItemId = 56; // Integer | Menu item identifier
String key = "key_example"; // String | Metadata key
try {
    apiInstance.deleteMenuItemMetadata(menuId, storeId, menuItemId, key);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#deleteMenuItemMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **menuItemId** | **Integer**| Menu item identifier |
 **key** | **String**| Metadata key |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuById"></a>
# **getMenuById**
> RestApiResultMenu getMenuById(menuId)

Get menu by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
try {
    RestApiResultMenu result = apiInstance.getMenuById(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

[**RestApiResultMenu**](RestApiResultMenu.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemMetadata"></a>
# **getMenuItemMetadata**
> RestApiArrayResultMetadata getMenuItemMetadata(menuId, storeId, menuItemId)

Get menu item metadata

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer menuItemId = 56; // Integer | Menu item identifier
try {
    RestApiArrayResultMetadata result = apiInstance.getMenuItemMetadata(menuId, storeId, menuItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuItemMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **menuItemId** | **Integer**| Menu item identifier |

### Return type

[**RestApiArrayResultMetadata**](RestApiArrayResultMetadata.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemMetadata_0"></a>
# **getMenuItemMetadata_0**
> getMenuItemMetadata_0(menuId, storeId, menuItemId, key)

Get menu item metadata by key

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer menuItemId = 56; // Integer | Menu item identifier
String key = "key_example"; // String | Metadata key
try {
    apiInstance.getMenuItemMetadata_0(menuId, storeId, menuItemId, key);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuItemMetadata_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **menuItemId** | **Integer**| Menu item identifier |
 **key** | **String**| Metadata key |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemOptionSetItemMetadata"></a>
# **getMenuItemOptionSetItemMetadata**
> RestApiResultMetadata getMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId)

Get menu item option set item metadata by key

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer optionSetItemId = 56; // Integer | Menu item option set item identifier
try {
    RestApiResultMetadata result = apiInstance.getMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuItemOptionSetItemMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **optionSetItemId** | **Integer**| Menu item option set item identifier |

### Return type

[**RestApiResultMetadata**](RestApiResultMetadata.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuItemMetadata"></a>
# **setMenuItemMetadata**
> setMenuItemMetadata(menuId, storeId, menuItemId, metadata)

Update menu item metadata

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer menuItemId = 56; // Integer | Menu item identifier
Metadata metadata = new Metadata(); // Metadata | Metadata object
try {
    apiInstance.setMenuItemMetadata(menuId, storeId, menuItemId, metadata);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setMenuItemMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **menuItemId** | **Integer**| Menu item identifier |
 **metadata** | [**Metadata**](Metadata.md)| Metadata object |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuItemOptionSetItemMetadata"></a>
# **setMenuItemOptionSetItemMetadata**
> setMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId, metadata)

Update menu item option set item metadata

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
Integer storeId = 56; // Integer | Store identifier
Integer optionSetItemId = 56; // Integer | Menu item option set item identifier
Metadata metadata = new Metadata(); // Metadata | Metadata object
try {
    apiInstance.setMenuItemOptionSetItemMetadata(menuId, storeId, optionSetItemId, metadata);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setMenuItemOptionSetItemMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |
 **optionSetItemId** | **Integer**| Menu item option set item identifier |
 **metadata** | [**Metadata**](Metadata.md)| Metadata object |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenu"></a>
# **updateMenu**
> updateMenu(menuId, menu)

Update menu

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
MenuBase menu = new MenuBase(); // MenuBase | Menu (delta)
try {
    apiInstance.updateMenu(menuId, menu);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#updateMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menu** | [**MenuBase**](MenuBase.md)| Menu (delta) |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuImage"></a>
# **uploadMenuImage**
> RestApiStringResult uploadMenuImage(menuId, image)

Upload menu image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusApi apiInstance = new MenusApi();
Integer menuId = 56; // Integer | Menu identifier
File image = new File("/path/to/file.txt"); // File | Menu image
try {
    RestApiStringResult result = apiInstance.uploadMenuImage(menuId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#uploadMenuImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **image** | **File**| Menu image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

