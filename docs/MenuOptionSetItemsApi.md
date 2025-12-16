# MenuOptionSetItemsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMenuItemOptionSetItem**](MenuOptionSetItemsApi.md#addMenuItemOptionSetItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems | Create menu item option set item
[**deleteOptionSetItemImage**](MenuOptionSetItemsApi.md#deleteOptionSetItemImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId}/image | Delete menu item option set item image
[**getMenuItemOptionSetItemById**](MenuOptionSetItemsApi.md#getMenuItemOptionSetItemById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId} | Get menu item option set item by identifier
[**getMenuItemOptionSetItems**](MenuOptionSetItemsApi.md#getMenuItemOptionSetItems) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems | Get menu item option set items
[**removeMenuItemOptionSetItem**](MenuOptionSetItemsApi.md#removeMenuItemOptionSetItem) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId} | Delete menu item option set item
[**setOptionSetItemTax**](MenuOptionSetItemsApi.md#setOptionSetItemTax) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId}/taxrate/{taxRateId} | Set Tax Rate on OptionSetItem
[**updateMenuItemOptionSetItem**](MenuOptionSetItemsApi.md#updateMenuItemOptionSetItem) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId} | Update menu item option set item
[**uploadOptionSetItemImage**](MenuOptionSetItemsApi.md#uploadOptionSetItemImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/optionsetitems/{menuItemOptionSetItemId}/image | Upload menu item option set item image


<a name="addMenuItemOptionSetItem"></a>
# **addMenuItemOptionSetItem**
> Object addMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItem)

Create menu item option set item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
MenuItemOptionSetItemBase menuItemOptionSetItem = new MenuItemOptionSetItemBase(); // MenuItemOptionSetItemBase | Option set item
try {
    Object result = apiInstance.addMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#addMenuItemOptionSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItem** | [**MenuItemOptionSetItemBase**](MenuItemOptionSetItemBase.md)| Option set item |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteOptionSetItemImage"></a>
# **deleteOptionSetItemImage**
> deleteOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId)

Delete menu item option set item image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
try {
    apiInstance.deleteOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#deleteOptionSetItemImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemOptionSetItemById"></a>
# **getMenuItemOptionSetItemById**
> RestApiResultMenuItemOptionSetItem getMenuItemOptionSetItemById(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId)

Get menu item option set item by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
try {
    RestApiResultMenuItemOptionSetItem result = apiInstance.getMenuItemOptionSetItemById(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#getMenuItemOptionSetItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |

### Return type

[**RestApiResultMenuItemOptionSetItem**](RestApiResultMenuItemOptionSetItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemOptionSetItems"></a>
# **getMenuItemOptionSetItems**
> RestApiArrayResultMenuItemOptionSetItem getMenuItemOptionSetItems(menuId, menuSectionId, menuSectionItemId, optionSetId)

Get menu item option set items

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
try {
    RestApiArrayResultMenuItemOptionSetItem result = apiInstance.getMenuItemOptionSetItems(menuId, menuSectionId, menuSectionItemId, optionSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#getMenuItemOptionSetItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |

### Return type

[**RestApiArrayResultMenuItemOptionSetItem**](RestApiArrayResultMenuItemOptionSetItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeMenuItemOptionSetItem"></a>
# **removeMenuItemOptionSetItem**
> removeMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId)

Delete menu item option set item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
try {
    apiInstance.removeMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#removeMenuItemOptionSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setOptionSetItemTax"></a>
# **setOptionSetItemTax**
> setOptionSetItemTax(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, taxRateId)

Set Tax Rate on OptionSetItem

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer optionSetId = 56; // Integer | 
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
Integer taxRateId = 56; // Integer | Tax Rate to use
try {
    apiInstance.setOptionSetItemTax(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, taxRateId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#setOptionSetItemTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **optionSetId** | **Integer**|  |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |
 **taxRateId** | **Integer**| Tax Rate to use |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenuItemOptionSetItem"></a>
# **updateMenuItemOptionSetItem**
> updateMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, menuItemOptionSetItem, undoAfter)

Update menu item option set item

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
MenuItemOptionSetItemBase menuItemOptionSetItem = new MenuItemOptionSetItemBase(); // MenuItemOptionSetItemBase | Option set item (delta)
Double undoAfter = 3.4D; // Double | An optional time period, in hours, after which the hide-section operation will be undone.
try {
    apiInstance.updateMenuItemOptionSetItem(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, menuItemOptionSetItem, undoAfter);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#updateMenuItemOptionSetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |
 **menuItemOptionSetItem** | [**MenuItemOptionSetItemBase**](MenuItemOptionSetItemBase.md)| Option set item (delta) |
 **undoAfter** | **Double**| An optional time period, in hours, after which the hide-section operation will be undone. | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadOptionSetItemImage"></a>
# **uploadOptionSetItemImage**
> RestApiStringResult uploadOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, image)

Upload menu item option set item image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetItemsApi apiInstance = new MenuOptionSetItemsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
Integer menuItemOptionSetItemId = 56; // Integer | Option set item identifier
File image = new File("/path/to/file.txt"); // File | Option set item image
try {
    RestApiStringResult result = apiInstance.uploadOptionSetItemImage(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSetItemId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetItemsApi#uploadOptionSetItemImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Option set identifier |
 **menuItemOptionSetItemId** | **Integer**| Option set item identifier |
 **image** | **File**| Option set item image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

