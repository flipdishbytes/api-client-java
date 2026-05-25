# MenusApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDraftMenuFromExistingMenu**](MenusApi.md#createDraftMenuFromExistingMenu) | **POST** /api/v1.0/menus/{menuId}/clone/{newName} | 
[**createNewMenuAsync**](MenusApi.md#createNewMenuAsync) | **POST** /api/v1.0/{appId}/menus/async | 
[**createNewMenuForApp**](MenusApi.md#createNewMenuForApp) | **POST** /api/v1.0/{appId}/menus | 
[**deleteMenu**](MenusApi.md#deleteMenu) | **DELETE** /api/v1.0/menus/{menuId} | 
[**deleteMenuImage**](MenusApi.md#deleteMenuImage) | **DELETE** /api/v1.0/menus/{menuId}/image | 
[**deleteMenuItemMetadata**](MenusApi.md#deleteMenuItemMetadata) | **DELETE** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | 
[**deleteTaxRate**](MenusApi.md#deleteTaxRate) | **DELETE** /api/v1.0/menus/{menuId}/tax/{taxId} | 
[**getAllMenuMetadataByMenuIdAndStoreId**](MenusApi.md#getAllMenuMetadataByMenuIdAndStoreId) | **GET** /api/v1.0/menus/{menuId}/metadata/store/{storeId} | Get all menu metadata by menu ID and store ID
[**getMenuBulkShowHide**](MenusApi.md#getMenuBulkShowHide) | **GET** /api/v1.0/menus/{menuId}/bulkshowhide/list | 
[**getMenuById**](MenusApi.md#getMenuById) | **GET** /api/v1.0/menus/{menuId} | Get menu by identifier
[**getMenuItemMetadata**](MenusApi.md#getMenuItemMetadata) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | Get menu item metadata
[**getMenuItemMetadataByKey**](MenusApi.md#getMenuItemMetadataByKey) | **GET** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/{key}/store/{storeId} | Get menu item metadata by key
[**getMenuItemOptionSetItemMetadata**](MenusApi.md#getMenuItemOptionSetItemMetadata) | **GET** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | Get menu item option set item metadata by key
[**getMenuName**](MenusApi.md#getMenuName) | **GET** /api/v1.0/menus/{menuId}/name | Get Menus Name
[**getMenuStoreNames**](MenusApi.md#getMenuStoreNames) | **GET** /api/v1.0/menus/{menuId}/stores | Get menus store names
[**getMenuTaxDetails**](MenusApi.md#getMenuTaxDetails) | **GET** /api/v1.0/menus/{menuId}/tax | Get menus tax details
[**getMenusByAppId**](MenusApi.md#getMenusByAppId) | **GET** /api/v1.0/{appId}/menus | Get menus by appId
[**getMenusCheckpoints**](MenusApi.md#getMenusCheckpoints) | **GET** /api/v1.0/menus/{menuId}/checkpoints | Get a Menus Checkpoints
[**restoreAMenuCheckpoint**](MenusApi.md#restoreAMenuCheckpoint) | **POST** /api/v1.0/menus/{menuId}/checkpoints/{checkpointId}/restore | 
[**setDisplayOnMenuTax**](MenusApi.md#setDisplayOnMenuTax) | **POST** /api/v1.0/menus/{menuId}/tax/show/{show} | 
[**setItemDisplayOrders**](MenusApi.md#setItemDisplayOrders) | **POST** /api/v1.0/menus/{menuId}/sectiondisplayorders | 
[**setMenuItemMetadata**](MenusApi.md#setMenuItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/menuitem/{menuItemId}/metadata/store/{storeId} | 
[**setMenuItemOptionSetItemMetadata**](MenusApi.md#setMenuItemOptionSetItemMetadata) | **PUT** /api/v1.0/menus/{menuId}/optionsetitem/{optionSetItemId}/metadata/store/{storeId} | 
[**setMenuLock**](MenusApi.md#setMenuLock) | **POST** /api/v1.0/menus/{menuId}/lock | 
[**setMenuName**](MenusApi.md#setMenuName) | **POST** /api/v1.0/menus/{menuId}/name | 
[**showHideBulkItems**](MenusApi.md#showHideBulkItems) | **POST** /api/v1.0/menus/{menuId}/bulkshowhide | 
[**updateMenu**](MenusApi.md#updateMenu) | **POST** /api/v1.0/menus/{menuId} | 
[**updateTaxType**](MenusApi.md#updateTaxType) | **POST** /api/v1.0/menus/{menuId}/tax/type/{type} | 
[**uploadMenuImage**](MenusApi.md#uploadMenuImage) | **POST** /api/v1.0/menus/{menuId}/image | 
[**uploadNewMenuForApp**](MenusApi.md#uploadNewMenuForApp) | **POST** /api/v1.0/{appId}/menus/xlsx | 
[**upsertTaxRate**](MenusApi.md#upsertTaxRate) | **POST** /api/v1.0/menus/{menuId}/taxrate | 


<a name="createDraftMenuFromExistingMenu"></a>
# **createDraftMenuFromExistingMenu**
> RestApiResultMenu createDraftMenuFromExistingMenu(menuId, newName)



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
Integer menuId = 56; // Integer | 
String newName = "newName_example"; // String | 
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
 **menuId** | **Integer**|  |
 **newName** | **String**|  |

### Return type

[**RestApiResultMenu**](RestApiResultMenu.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createNewMenuAsync"></a>
# **createNewMenuAsync**
> Object createNewMenuAsync(appId, menu, orgId)



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
String appId = "appId_example"; // String | 
CreateFullMenu menu = new CreateFullMenu(); // CreateFullMenu | 
String orgId = "orgId_example"; // String | 
try {
    Object result = apiInstance.createNewMenuAsync(appId, menu, orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#createNewMenuAsync");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **menu** | [**CreateFullMenu**](CreateFullMenu.md)|  |
 **orgId** | **String**|  | [optional]

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
String appId = "appId_example"; // String | 
CreateFullMenu menu = new CreateFullMenu(); // CreateFullMenu | 
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
 **appId** | **String**|  |
 **menu** | [**CreateFullMenu**](CreateFullMenu.md)|  |

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
Integer menuId = 56; // Integer | 
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
 **menuId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
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
 **menuId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer storeId = 56; // Integer | 
Integer menuItemId = 56; // Integer | 
String key = "key_example"; // String | 
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
 **menuId** | **Integer**|  |
 **storeId** | **Integer**|  |
 **menuItemId** | **Integer**|  |
 **key** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteTaxRate"></a>
# **deleteTaxRate**
> deleteTaxRate(menuId, taxId)



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
Integer menuId = 56; // Integer | 
Integer taxId = 56; // Integer | 
try {
    apiInstance.deleteTaxRate(menuId, taxId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#deleteTaxRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **taxId** | **Integer**|  |

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

<a name="getMenuBulkShowHide"></a>
# **getMenuBulkShowHide**
> RestApiArrayResultMenuElementListResponse getMenuBulkShowHide(menuId, isAvailable)



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
Integer menuId = 56; // Integer | 
Boolean isAvailable = true; // Boolean | 
try {
    RestApiArrayResultMenuElementListResponse result = apiInstance.getMenuBulkShowHide(menuId, isAvailable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#getMenuBulkShowHide");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **isAvailable** | **Boolean**|  |

### Return type

[**RestApiArrayResultMenuElementListResponse**](RestApiArrayResultMenuElementListResponse.md)

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

Get Menus Name

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

Get menus store names

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

Get menus tax details

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

Get menus by appId

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

Get a Menus Checkpoints

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

<a name="restoreAMenuCheckpoint"></a>
# **restoreAMenuCheckpoint**
> restoreAMenuCheckpoint(menuId, checkpointId)



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
Integer menuId = 56; // Integer | 
Integer checkpointId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **checkpointId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setDisplayOnMenuTax"></a>
# **setDisplayOnMenuTax**
> setDisplayOnMenuTax(menuId, show)



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
Integer menuId = 56; // Integer | 
Boolean show = true; // Boolean | 
try {
    apiInstance.setDisplayOnMenuTax(menuId, show);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setDisplayOnMenuTax");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **show** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setItemDisplayOrders"></a>
# **setItemDisplayOrders**
> setItemDisplayOrders(menuId, displayOrders)



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
Integer menuId = 56; // Integer | 
MenuObjectDisplayOrders displayOrders = new MenuObjectDisplayOrders(); // MenuObjectDisplayOrders | 
try {
    apiInstance.setItemDisplayOrders(menuId, displayOrders);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#setItemDisplayOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **displayOrders** | [**MenuObjectDisplayOrders**](MenuObjectDisplayOrders.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuItemMetadata"></a>
# **setMenuItemMetadata**
> setMenuItemMetadata(menuId, storeId, menuItemId, metadata)



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
Integer menuId = 56; // Integer | 
Integer storeId = 56; // Integer | 
Integer menuItemId = 56; // Integer | 
Metadata metadata = new Metadata(); // Metadata | 
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
 **menuId** | **Integer**|  |
 **storeId** | **Integer**|  |
 **menuItemId** | **Integer**|  |
 **metadata** | [**Metadata**](Metadata.md)|  |

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
Integer menuId = 56; // Integer | 
Integer storeId = 56; // Integer | 
Integer optionSetItemId = 56; // Integer | 
Metadata metadata = new Metadata(); // Metadata | 
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
 **menuId** | **Integer**|  |
 **storeId** | **Integer**|  |
 **optionSetItemId** | **Integer**|  |
 **metadata** | [**Metadata**](Metadata.md)|  |

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
Integer menuId = 56; // Integer | 
Boolean locked = true; // Boolean | 
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
 **menuId** | **Integer**|  |
 **locked** | **Boolean**|  |

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
Integer menuId = 56; // Integer | 
String name = "name_example"; // String | 
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
 **menuId** | **Integer**|  |
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="showHideBulkItems"></a>
# **showHideBulkItems**
> RestApiArrayResultMenuElementEditResponse showHideBulkItems(menuId, menuElements, isAvailable)



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
Integer menuId = 56; // Integer | 
List<MenuElementHide> menuElements = Arrays.asList(new MenuElementHide()); // List<MenuElementHide> | 
Boolean isAvailable = true; // Boolean | 
try {
    RestApiArrayResultMenuElementEditResponse result = apiInstance.showHideBulkItems(menuId, menuElements, isAvailable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#showHideBulkItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **menuElements** | [**List&lt;MenuElementHide&gt;**](MenuElementHide.md)|  |
 **isAvailable** | **Boolean**|  |

### Return type

[**RestApiArrayResultMenuElementEditResponse**](RestApiArrayResultMenuElementEditResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenu"></a>
# **updateMenu**
> updateMenu(menuId, menu)



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
Integer menuId = 56; // Integer | 
MenuBase menu = new MenuBase(); // MenuBase | 
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
 **menuId** | **Integer**|  |
 **menu** | [**MenuBase**](MenuBase.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateTaxType"></a>
# **updateTaxType**
> updateTaxType(menuId, type)



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
Integer menuId = 56; // Integer | 
String type = "type_example"; // String | 
try {
    apiInstance.updateTaxType(menuId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#updateTaxType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **type** | **String**|  | [enum: IncludedInBasePrice, ExcludedFromBasePrice]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuImage"></a>
# **uploadMenuImage**
> RestApiStringResult uploadMenuImage(menuId, image)



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
Integer menuId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |
 **menu** | **File**| Uploaded xlsx menu |

### Return type

**Integer**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="upsertTaxRate"></a>
# **upsertTaxRate**
> MenuTaxRate upsertTaxRate(menuId, taxRate)



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
Integer menuId = 56; // Integer | 
MenuTaxRate taxRate = new MenuTaxRate(); // MenuTaxRate | 
try {
    MenuTaxRate result = apiInstance.upsertTaxRate(menuId, taxRate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#upsertTaxRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **taxRate** | [**MenuTaxRate**](MenuTaxRate.md)|  |

### Return type

[**MenuTaxRate**](MenuTaxRate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

