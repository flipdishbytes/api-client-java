# MenusApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDraftMenuFromExistingMenu**](MenusApi.md#createDraftMenuFromExistingMenu) | **POST** /api/v1.0/menus/{menuId}/clone/{newName} | [PRIVATE API] Clone a menu, (without attaching stores)
[**createNewMenuAsync**](MenusApi.md#createNewMenuAsync) | **POST** /api/v1.0/{appId}/menus/async | Create a new menu asynchronously
[**createNewMenuForApp**](MenusApi.md#createNewMenuForApp) | **POST** /api/v1.0/{appId}/menus | Create a new menu
[**deleteMenu**](MenusApi.md#deleteMenu) | **DELETE** /api/v1.0/menus/{menuId} | [PRIVATE API] Mark a Menu as Deleted
[**deleteMenuImage**](MenusApi.md#deleteMenuImage) | **DELETE** /api/v1.0/menus/{menuId}/image | Delete menu image
[**deleteMenuItemMetadata**](MenusApi.md#deleteMenuItemMetadata) | **DELETE** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | Delete menu item metadata
[**getAllMenuMetadataByMenuIdAndStoreId**](MenusApi.md#getAllMenuMetadataByMenuIdAndStoreId) | **GET** /api/v1.0/menus/{menuId}/metadata/store/{storeId} | Get all menu metadata by menu ID and store ID
[**getMenuById**](MenusApi.md#getMenuById) | **GET** /api/v1.0/menus/{menuId} | Get menu by identifier
[**getMenuItemMetadata**](MenusApi.md#getMenuItemMetadata) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | Get menu item metadata
[**getMenuItemMetadataByKey**](MenusApi.md#getMenuItemMetadataByKey) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | Get menu item metadata by key
[**getMenuItemOptionSetItemMetadata**](MenusApi.md#getMenuItemOptionSetItemMetadata) | **GET** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | Get menu item option set item metadata by key
[**getMenuName**](MenusApi.md#getMenuName) | **GET** /api/v1.0/menus/{menuId}/name | [PRIVATE API] Get Menus Name
[**getMenuStoreNames**](MenusApi.md#getMenuStoreNames) | **GET** /api/v1.0/menus/{menuId}/stores | [PRIVATE API] Get menus store names
[**getMenuTaxDetails**](MenusApi.md#getMenuTaxDetails) | **GET** /api/v1.0/menus/{menuId}/tax | [PRIVATE API] Get menus tax details
[**getMenusByAppId**](MenusApi.md#getMenusByAppId) | **GET** /api/v1.0/{appId}/menus | [PRIVATE API] Get menus by appId
[**getMenusCheckpoints**](MenusApi.md#getMenusCheckpoints) | **GET** /api/v1.0/menus/{menuId}/checkpoints | [PRIVATE API]Get a Menus Checkpoints
[**menusDeleteTaxRate**](MenusApi.md#menusDeleteTaxRate) | **DELETE** /api/v1.0/menus/{menuId}/tax/{taxId} | [PRIVATE API] Remove a Menus Tax Rate, can only remove a tax rate that does not have items/optionSetItems attached
[**menusGetMenuBulkShowHide**](MenusApi.md#menusGetMenuBulkShowHide) | **GET** /api/v1.0/menus/{menuId}/bulkshowhide/list | Get bulk show/hide menu items and option set items
[**menusSetDisplayOnMenuTax**](MenusApi.md#menusSetDisplayOnMenuTax) | **POST** /api/v1.0/menus/{menuId}/tax/show/{show} | [PRIVATE API] Set if tax shows for a Menu
[**menusSetItemDisplayOrders**](MenusApi.md#menusSetItemDisplayOrders) | **POST** /api/v1.0/menus/{menuId}/sectiondisplayorders | [PRIVATE API] Re-arrange Sections within a Menu
[**menusShowHideBulkItems**](MenusApi.md#menusShowHideBulkItems) | **POST** /api/v1.0/menus/{menuId}/bulkshowhide | Bulk show/hide menu items or option set items
[**menusUpdateTaxType**](MenusApi.md#menusUpdateTaxType) | **POST** /api/v1.0/menus/{menuId}/tax/type/{type} | [PRIVATE API] Set the type of Tax on a Menu
[**menusUpsertTaxRate**](MenusApi.md#menusUpsertTaxRate) | **POST** /api/v1.0/menus/{menuId}/taxrate | [PRIVATE API] Add/Update a Tax Rate
[**restoreAMenuCheckpoint**](MenusApi.md#restoreAMenuCheckpoint) | **POST** /api/v1.0/menus/{menuId}/checkpoints/{checkpointId}/restore | [PRIVATE API] Restore a Menu to a checkpoint
[**setMenuItemMetadata**](MenusApi.md#setMenuItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | Update menu item metadata
[**setMenuItemOptionSetItemMetadata**](MenusApi.md#setMenuItemOptionSetItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | Update menu item option set item metadata
[**setMenuLock**](MenusApi.md#setMenuLock) | **POST** /api/v1.0/menus/{menuId}/lock | [PRIVATE API] Lock/Unlock a Menu for Editing
[**setMenuName**](MenusApi.md#setMenuName) | **POST** /api/v1.0/menus/{menuId}/name | [PRIVATE API] Set Menus Name
[**updateMenu**](MenusApi.md#updateMenu) | **POST** /api/v1.0/menus/{menuId} | Update menu
[**uploadMenuImage**](MenusApi.md#uploadMenuImage) | **POST** /api/v1.0/menus/{menuId}/image | Upload menu image
[**uploadNewMenuForApp**](MenusApi.md#uploadNewMenuForApp) | **POST** /api/v1.0/{appId}/menus/xlsx | Create a new menu from xlsx file.


<a name="createDraftMenuFromExistingMenu"></a>
# **createDraftMenuFromExistingMenu**
> RestApiResultMenu createDraftMenuFromExistingMenu(menuId, newName)

[PRIVATE API] Clone a menu, (without attaching stores)

[PRIVATE API]

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
String newName = "newName_example"; // String | Name of the new Menu
try {
    RestApiResultMenu result = apiInstance.createDraftMenuFromExistingMenu(menuId, newName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#createDraftMenuFromExistingMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **newName** | **String**| Name of the new Menu |

### Return type

[**RestApiResultMenu**](RestApiResultMenu.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createNewMenuAsync"></a>
# **createNewMenuAsync**
> Object createNewMenuAsync(appId, menu)

Create a new menu asynchronously

You must listen to the webhook menu.async_creation.completed to know when the menu is ready

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
String appId = "appId_example"; // String | App id
CreateFullMenu menu = new CreateFullMenu(); // CreateFullMenu | Menu
try {
    Object result = apiInstance.createNewMenuAsync(appId, menu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#createNewMenuAsync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App id |
 **menu** | [**CreateFullMenu**](CreateFullMenu.md)| Menu |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createNewMenuForApp"></a>
# **createNewMenuForApp**
> Integer createNewMenuForApp(appId, menu)

Create a new menu

[DEPRECATED] - Please use the async version as this endpoint may timeout for large menus

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
String appId = "appId_example"; // String | App identifier
CreateFullMenu menu = new CreateFullMenu(); // CreateFullMenu | Menu. If empty the system will create a menu with default items
try {
    Integer result = apiInstance.createNewMenuForApp(appId, menu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#createNewMenuForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App identifier |
 **menu** | [**CreateFullMenu**](CreateFullMenu.md)| Menu. If empty the system will create a menu with default items |

### Return type

**Integer**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenu"></a>
# **deleteMenu**
> deleteMenu(menuId)

[PRIVATE API] Mark a Menu as Deleted

[PRIVATE API]

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
Integer menuId = 56; // Integer | Menu Identifier
try {
    apiInstance.deleteMenu(menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#deleteMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu Identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="getAllMenuMetadataByMenuIdAndStoreId"></a>
# **getAllMenuMetadataByMenuIdAndStoreId**
> RestApiArrayResultAllMetadataResult getAllMenuMetadataByMenuIdAndStoreId(menuId, storeId)

Get all menu metadata by menu ID and store ID

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
try {
    RestApiArrayResultAllMetadataResult result = apiInstance.getAllMenuMetadataByMenuIdAndStoreId(menuId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getAllMenuMetadataByMenuIdAndStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **storeId** | **Integer**| Store identifier |

### Return type

[**RestApiArrayResultAllMetadataResult**](RestApiArrayResultAllMetadataResult.md)

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

<a name="getMenuItemMetadataByKey"></a>
# **getMenuItemMetadataByKey**
> RestApiResultMetadata getMenuItemMetadataByKey(menuId, storeId, menuItemId, key)

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
    RestApiResultMetadata result = apiInstance.getMenuItemMetadataByKey(menuId, storeId, menuItemId, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuItemMetadataByKey");
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

[**RestApiResultMetadata**](RestApiResultMetadata.md)

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

<a name="getMenuName"></a>
# **getMenuName**
> String getMenuName(menuId)

[PRIVATE API] Get Menus Name

[PRIVATE API]

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
    String result = apiInstance.getMenuName(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuStoreNames"></a>
# **getMenuStoreNames**
> RestApiArrayResultMenuStoreNames getMenuStoreNames(menuId)

[PRIVATE API] Get menus store names

[PRIVATE API]

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
    RestApiArrayResultMenuStoreNames result = apiInstance.getMenuStoreNames(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuStoreNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

[**RestApiArrayResultMenuStoreNames**](RestApiArrayResultMenuStoreNames.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuTaxDetails"></a>
# **getMenuTaxDetails**
> RestApiArrayResultMenuTaxDetails getMenuTaxDetails(menuId)

[PRIVATE API] Get menus tax details

[PRIVATE API]

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
    RestApiArrayResultMenuTaxDetails result = apiInstance.getMenuTaxDetails(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuTaxDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

[**RestApiArrayResultMenuTaxDetails**](RestApiArrayResultMenuTaxDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenusByAppId"></a>
# **getMenusByAppId**
> RestApiArrayResultMenuSummary getMenusByAppId(appId)

[PRIVATE API] Get menus by appId

[PRIVATE API]

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
String appId = "appId_example"; // String | Get Menus for this appId
try {
    RestApiArrayResultMenuSummary result = apiInstance.getMenusByAppId(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenusByAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Get Menus for this appId |

### Return type

[**RestApiArrayResultMenuSummary**](RestApiArrayResultMenuSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenusCheckpoints"></a>
# **getMenusCheckpoints**
> RestApiArrayResultMenuCheckpoint getMenusCheckpoints(menuId)

[PRIVATE API]Get a Menus Checkpoints

[PRIVATE API]

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
    RestApiArrayResultMenuCheckpoint result = apiInstance.getMenusCheckpoints(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenusCheckpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

[**RestApiArrayResultMenuCheckpoint**](RestApiArrayResultMenuCheckpoint.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusDeleteTaxRate"></a>
# **menusDeleteTaxRate**
> menusDeleteTaxRate(menuId, taxId)

[PRIVATE API] Remove a Menus Tax Rate, can only remove a tax rate that does not have items/optionSetItems attached

[PRIVATE API]

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
Integer taxId = 56; // Integer | Id of Menu Tax to be removed
try {
    apiInstance.menusDeleteTaxRate(menuId, taxId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusDeleteTaxRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **taxId** | **Integer**| Id of Menu Tax to be removed |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusGetMenuBulkShowHide"></a>
# **menusGetMenuBulkShowHide**
> RestApiArrayResultMenuElementListResponse menusGetMenuBulkShowHide(menuId, isAvailable)

Get bulk show/hide menu items and option set items

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
Integer menuId = 56; // Integer | Menu id
Boolean isAvailable = true; // Boolean | Is available flag
try {
    RestApiArrayResultMenuElementListResponse result = apiInstance.menusGetMenuBulkShowHide(menuId, isAvailable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusGetMenuBulkShowHide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu id |
 **isAvailable** | **Boolean**| Is available flag |

### Return type

[**RestApiArrayResultMenuElementListResponse**](RestApiArrayResultMenuElementListResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusSetDisplayOnMenuTax"></a>
# **menusSetDisplayOnMenuTax**
> menusSetDisplayOnMenuTax(menuId, show)

[PRIVATE API] Set if tax shows for a Menu

[PRIVATE API]

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
Boolean show = true; // Boolean | Boolean show or dont show tax (Exclusive tax type can only ever be TRUE)
try {
    apiInstance.menusSetDisplayOnMenuTax(menuId, show);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusSetDisplayOnMenuTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **show** | **Boolean**| Boolean show or dont show tax (Exclusive tax type can only ever be TRUE) |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusSetItemDisplayOrders"></a>
# **menusSetItemDisplayOrders**
> menusSetItemDisplayOrders(menuId, displayOrders)

[PRIVATE API] Re-arrange Sections within a Menu

[PRIVATE API]

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
MenuObjectDisplayOrders displayOrders = new MenuObjectDisplayOrders(); // MenuObjectDisplayOrders | Section Ids and their new display order
try {
    apiInstance.menusSetItemDisplayOrders(menuId, displayOrders);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusSetItemDisplayOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **displayOrders** | [**MenuObjectDisplayOrders**](MenuObjectDisplayOrders.md)| Section Ids and their new display order |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusShowHideBulkItems"></a>
# **menusShowHideBulkItems**
> RestApiArrayResultMenuElementEditResponse menusShowHideBulkItems(menuId, menuElements, isAvailable)

Bulk show/hide menu items or option set items

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
Integer menuId = 56; // Integer | Menu id
List<MenuElementHide> menuElements = Arrays.asList(new MenuElementHide()); // List<MenuElementHide> | Elements to be show/hide
Boolean isAvailable = true; // Boolean | Is available flag
try {
    RestApiArrayResultMenuElementEditResponse result = apiInstance.menusShowHideBulkItems(menuId, menuElements, isAvailable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusShowHideBulkItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu id |
 **menuElements** | [**List&lt;MenuElementHide&gt;**](MenuElementHide.md)| Elements to be show/hide |
 **isAvailable** | **Boolean**| Is available flag |

### Return type

[**RestApiArrayResultMenuElementEditResponse**](RestApiArrayResultMenuElementEditResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusUpdateTaxType"></a>
# **menusUpdateTaxType**
> menusUpdateTaxType(menuId, type)

[PRIVATE API] Set the type of Tax on a Menu

[PRIVATE API]

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
String type = "type_example"; // String | Type of Tax
try {
    apiInstance.menusUpdateTaxType(menuId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusUpdateTaxType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **type** | **String**| Type of Tax | [enum: IncludedInBasePrice, ExcludedFromBasePrice]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menusUpsertTaxRate"></a>
# **menusUpsertTaxRate**
> MenuTaxRate menusUpsertTaxRate(menuId, taxRate)

[PRIVATE API] Add/Update a Tax Rate

[PRIVATE API]

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
MenuTaxRate taxRate = new MenuTaxRate(); // MenuTaxRate | Tax rate to add/update
try {
    MenuTaxRate result = apiInstance.menusUpsertTaxRate(menuId, taxRate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#menusUpsertTaxRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **taxRate** | [**MenuTaxRate**](MenuTaxRate.md)| Tax rate to add/update |

### Return type

[**MenuTaxRate**](MenuTaxRate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="restoreAMenuCheckpoint"></a>
# **restoreAMenuCheckpoint**
> restoreAMenuCheckpoint(menuId, checkpointId)

[PRIVATE API] Restore a Menu to a checkpoint

[PRIVATE API]

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
Integer checkpointId = 56; // Integer | Checkpoint to restore menu to
try {
    apiInstance.restoreAMenuCheckpoint(menuId, checkpointId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#restoreAMenuCheckpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **checkpointId** | **Integer**| Checkpoint to restore menu to |

### Return type

null (empty response body)

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

<a name="setMenuLock"></a>
# **setMenuLock**
> setMenuLock(menuId, locked)

[PRIVATE API] Lock/Unlock a Menu for Editing

[PRIVATE API]

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
Boolean locked = true; // Boolean | True: Locks menu for editing, False: Unlocks for editing
try {
    apiInstance.setMenuLock(menuId, locked);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setMenuLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **locked** | **Boolean**| True: Locks menu for editing, False: Unlocks for editing |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuName"></a>
# **setMenuName**
> setMenuName(menuId, name)

[PRIVATE API] Set Menus Name

[PRIVATE API]

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
String name = "name_example"; // String | Name to set for this Menu
try {
    apiInstance.setMenuName(menuId, name);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setMenuName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **name** | **String**| Name to set for this Menu |

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
MenuBase menu = new MenuBase(); // MenuBase | Full menu data
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
 **menu** | [**MenuBase**](MenuBase.md)| Full menu data |

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

<a name="uploadNewMenuForApp"></a>
# **uploadNewMenuForApp**
> Integer uploadNewMenuForApp(appId, menu)

Create a new menu from xlsx file.

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
String appId = "appId_example"; // String | App identifier
File menu = new File("/path/to/file.txt"); // File | Uploaded xlsx menu
try {
    Integer result = apiInstance.uploadNewMenuForApp(appId, menu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#uploadNewMenuForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App identifier |
 **menu** | **File**| Uploaded xlsx menu |

### Return type

**Integer**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

