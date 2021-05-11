# MenuSectionItemsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneMenuSectionItem**](MenuSectionItemsApi.md#cloneMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/clone | Clone menu section item
[**createMenuSectionItem**](MenuSectionItemsApi.md#createMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems | Create menu section item
[**deleteMenuSectionItem**](MenuSectionItemsApi.md#deleteMenuSectionItem) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | Delete menu section item
[**deleteMenuSectionItemImage**](MenuSectionItemsApi.md#deleteMenuSectionItemImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/image | Delete menu section item image
[**getMenuItemById**](MenuSectionItemsApi.md#getMenuItemById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | Get menu item by identifier
[**getMenuItems**](MenuSectionItemsApi.md#getMenuItems) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems | Get menu items
[**moveMenuItem**](MenuSectionItemsApi.md#moveMenuItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/setorder/{destinationDisplayOrder} | [PRIVATE API]Move an Item within a menu
[**setSectionItemTax**](MenuSectionItemsApi.md#setSectionItemTax) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/taxrate/{taxRateId} | [PRIVATE API]Move an Item within a menu
[**updateMenuSectionItem**](MenuSectionItemsApi.md#updateMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | Update menu section item
[**uploadMenuSectionItemImage**](MenuSectionItemsApi.md#uploadMenuSectionItemImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/image | Upload menu section item image


<a name="cloneMenuSectionItem"></a>
# **cloneMenuSectionItem**
> RestApiResultMenuSectionItem cloneMenuSectionItem(menuId, menuSectionId, menuSectionItemId)

Clone menu section item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
try {
    RestApiResultMenuSectionItem result = apiInstance.cloneMenuSectionItem(menuId, menuSectionId, menuSectionItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#cloneMenuSectionItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |

### Return type

[**RestApiResultMenuSectionItem**](RestApiResultMenuSectionItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createMenuSectionItem"></a>
# **createMenuSectionItem**
> Object createMenuSectionItem(menuId, menuSectionId, menuSectionItem)

Create menu section item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
MenuSectionItemBase menuSectionItem = new MenuSectionItemBase(); // MenuSectionItemBase | Menu section item
try {
    Object result = apiInstance.createMenuSectionItem(menuId, menuSectionId, menuSectionItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#createMenuSectionItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItem** | [**MenuSectionItemBase**](MenuSectionItemBase.md)| Menu section item |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuSectionItem"></a>
# **deleteMenuSectionItem**
> deleteMenuSectionItem(menuId, menuSectionId, menuSectionItemId)

Delete menu section item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
try {
    apiInstance.deleteMenuSectionItem(menuId, menuSectionId, menuSectionItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#deleteMenuSectionItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuSectionItemImage"></a>
# **deleteMenuSectionItemImage**
> deleteMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId)

Delete menu section item image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
try {
    apiInstance.deleteMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#deleteMenuSectionItemImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemById"></a>
# **getMenuItemById**
> RestApiResultMenuSectionItem getMenuItemById(menuId, menuSectionId, menuSectionItemId)

Get menu item by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu item identifier
try {
    RestApiResultMenuSectionItem result = apiInstance.getMenuItemById(menuId, menuSectionId, menuSectionItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#getMenuItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu item identifier |

### Return type

[**RestApiResultMenuSectionItem**](RestApiResultMenuSectionItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItems"></a>
# **getMenuItems**
> RestApiArrayResultMenuSectionItem getMenuItems(menuId, menuSectionId)

Get menu items

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
try {
    RestApiArrayResultMenuSectionItem result = apiInstance.getMenuItems(menuId, menuSectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#getMenuItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |

### Return type

[**RestApiArrayResultMenuSectionItem**](RestApiArrayResultMenuSectionItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="moveMenuItem"></a>
# **moveMenuItem**
> moveMenuItem(menuId, menuSectionId, menuSectionItemId, destinationDisplayOrder)

[PRIVATE API]Move an Item within a menu

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Section to put item in (will usually be original section)
Integer menuSectionItemId = 56; // Integer | ID of Item to be moved
Integer destinationDisplayOrder = 56; // Integer | New Display Order of item
try {
    apiInstance.moveMenuItem(menuId, menuSectionId, menuSectionItemId, destinationDisplayOrder);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#moveMenuItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Section to put item in (will usually be original section) |
 **menuSectionItemId** | **Integer**| ID of Item to be moved |
 **destinationDisplayOrder** | **Integer**| New Display Order of item |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setSectionItemTax"></a>
# **setSectionItemTax**
> setSectionItemTax(menuId, menuSectionId, menuSectionItemId, taxRateId)

[PRIVATE API]Move an Item within a menu

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Section to put item in (will usually be original section)
Integer menuSectionItemId = 56; // Integer | ID of Item to be moved
Integer taxRateId = 56; // Integer | tax rate to be set against item
try {
    apiInstance.setSectionItemTax(menuId, menuSectionId, menuSectionItemId, taxRateId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#setSectionItemTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Section to put item in (will usually be original section) |
 **menuSectionItemId** | **Integer**| ID of Item to be moved |
 **taxRateId** | **Integer**| tax rate to be set against item |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenuSectionItem"></a>
# **updateMenuSectionItem**
> updateMenuSectionItem(menuId, menuSectionId, menuSectionItemId, menuSectionItem, undoAfter)

Update menu section item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
MenuSectionItemBase menuSectionItem = new MenuSectionItemBase(); // MenuSectionItemBase | Menu section item (delta)
Double undoAfter = 3.4D; // Double | An optional time period, in hours, after which the hide-section operaton will be undone.
try {
    apiInstance.updateMenuSectionItem(menuId, menuSectionId, menuSectionItemId, menuSectionItem, undoAfter);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#updateMenuSectionItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **menuSectionItem** | [**MenuSectionItemBase**](MenuSectionItemBase.md)| Menu section item (delta) |
 **undoAfter** | **Double**| An optional time period, in hours, after which the hide-section operaton will be undone. | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuSectionItemImage"></a>
# **uploadMenuSectionItemImage**
> RestApiStringResult uploadMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId, image)

Upload menu section item image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionItemsApi apiInstance = new MenuSectionItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
File image = new File("/path/to/file.txt"); // File | Menu section item image
try {
    RestApiStringResult result = apiInstance.uploadMenuSectionItemImage(menuId, menuSectionId, menuSectionItemId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#uploadMenuSectionItemImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **image** | **File**| Menu section item image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

