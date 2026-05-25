# MenuSectionItemsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneMenuSectionItem**](MenuSectionItemsApi.md#cloneMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/clone | 
[**createMenuSectionItem**](MenuSectionItemsApi.md#createMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems | 
[**createMenuSectionItemFromCatalogItems**](MenuSectionItemsApi.md#createMenuSectionItemFromCatalogItems) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/add-catalogitems | 
[**deleteMenuSectionItem**](MenuSectionItemsApi.md#deleteMenuSectionItem) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | 
[**deleteMenuSectionItemImage**](MenuSectionItemsApi.md#deleteMenuSectionItemImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/image | 
[**getMenuItemById**](MenuSectionItemsApi.md#getMenuItemById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | Get menu item by identifier
[**getMenuItems**](MenuSectionItemsApi.md#getMenuItems) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems | Get menu items
[**moveMenuItem**](MenuSectionItemsApi.md#moveMenuItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/setorder/{destinationDisplayOrder} | 
[**setSectionItemTax**](MenuSectionItemsApi.md#setSectionItemTax) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/taxrate/{taxRateId} | 
[**updateMenuSectionItem**](MenuSectionItemsApi.md#updateMenuSectionItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId} | 
[**uploadMenuSectionItemImage**](MenuSectionItemsApi.md#uploadMenuSectionItemImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/image | 


<a name="cloneMenuSectionItem"></a>
# **cloneMenuSectionItem**
> RestApiResultMenuSectionItem cloneMenuSectionItem(menuId, menuSectionId, menuSectionItemId)



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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
MenuSectionItemBase menuSectionItem = new MenuSectionItemBase(); // MenuSectionItemBase | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItem** | [**MenuSectionItemBase**](MenuSectionItemBase.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createMenuSectionItemFromCatalogItems"></a>
# **createMenuSectionItemFromCatalogItems**
> Object createMenuSectionItemFromCatalogItems(menuId, menuSectionId, createFromCatalogItems)



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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
CreateMenuSectionItemFromCatalogItems createFromCatalogItems = new CreateMenuSectionItemFromCatalogItems(); // CreateMenuSectionItemFromCatalogItems | 
try {
    Object result = apiInstance.createMenuSectionItemFromCatalogItems(menuId, menuSectionId, createFromCatalogItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionItemsApi#createMenuSectionItemFromCatalogItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **createFromCatalogItems** | [**CreateMenuSectionItemFromCatalogItems**](CreateMenuSectionItemFromCatalogItems.md)|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer destinationDisplayOrder = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **destinationDisplayOrder** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer taxRateId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **taxRateId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
MenuSectionItemBase menuSectionItem = new MenuSectionItemBase(); // MenuSectionItemBase | 
Double undoAfter = 3.4D; // Double | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **menuSectionItem** | [**MenuSectionItemBase**](MenuSectionItemBase.md)|  |
 **undoAfter** | **Double**|  | [optional]

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **image** | **File**| Menu section item image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

