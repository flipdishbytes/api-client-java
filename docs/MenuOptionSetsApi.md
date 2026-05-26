# MenuOptionSetsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMenuItemOptionSet**](MenuOptionSetsApi.md#createMenuItemOptionSet) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets | Create menu item option set
[**deleteMenuItemOptionSet**](MenuOptionSetsApi.md#deleteMenuItemOptionSet) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | Delete menu item option set
[**deleteOptionSetImage**](MenuOptionSetsApi.md#deleteOptionSetImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/image | Delete option set image
[**getMenuItemOptionSetById**](MenuOptionSetsApi.md#getMenuItemOptionSetById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | Get menu item option set by identifier
[**getMenuItemOptionSets**](MenuOptionSetsApi.md#getMenuItemOptionSets) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets | Get menu item option sets
[**updateMenuItemOptionSet**](MenuOptionSetsApi.md#updateMenuItemOptionSet) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | Update menu item option set
[**uploadOptionSetImage**](MenuOptionSetsApi.md#uploadOptionSetImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/image | Upload menu item option set image


<a name="createMenuItemOptionSet"></a>
# **createMenuItemOptionSet**
> Object createMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, menuItemOptionSet)

Create menu item option set

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
MenuItemOptionSetBase menuItemOptionSet = new MenuItemOptionSetBase(); // MenuItemOptionSetBase | Menu item option set
try {
    Object result = apiInstance.createMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, menuItemOptionSet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#createMenuItemOptionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **menuItemOptionSet** | [**MenuItemOptionSetBase**](MenuItemOptionSetBase.md)| Menu item option set |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuItemOptionSet"></a>
# **deleteMenuItemOptionSet**
> deleteMenuItemOptionSet(menuId, menuSectionItemId, menuSectionId, optionSetId)

Delete menu item option set

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer optionSetId = 56; // Integer | Option set identifier
try {
    apiInstance.deleteMenuItemOptionSet(menuId, menuSectionItemId, menuSectionId, optionSetId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#deleteMenuItemOptionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **optionSetId** | **Integer**| Option set identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteOptionSetImage"></a>
# **deleteOptionSetImage**
> deleteOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId)

Delete option set image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
try {
    apiInstance.deleteOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#deleteOptionSetImage");
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

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemOptionSetById"></a>
# **getMenuItemOptionSetById**
> RestApiResultMenuItemOptionSet getMenuItemOptionSetById(menuId, menuSectionId, menuSectionItemId, optionSetId)

Get menu item option set by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Menu item option set identifier
try {
    RestApiResultMenuItemOptionSet result = apiInstance.getMenuItemOptionSetById(menuId, menuSectionId, menuSectionItemId, optionSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#getMenuItemOptionSetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionItemId** | **Integer**| Menu section item identifier |
 **optionSetId** | **Integer**| Menu item option set identifier |

### Return type

[**RestApiResultMenuItemOptionSet**](RestApiResultMenuItemOptionSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuItemOptionSets"></a>
# **getMenuItemOptionSets**
> RestApiArrayResultMenuItemOptionSet getMenuItemOptionSets(menuId, menuSectionId, menuSectionItemId)

Get menu item option sets

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
try {
    RestApiArrayResultMenuItemOptionSet result = apiInstance.getMenuItemOptionSets(menuId, menuSectionId, menuSectionItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#getMenuItemOptionSets");
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

[**RestApiArrayResultMenuItemOptionSet**](RestApiArrayResultMenuItemOptionSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenuItemOptionSet"></a>
# **updateMenuItemOptionSet**
> updateMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSet)

Update menu item option set

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
MenuItemOptionSetBase menuItemOptionSet = new MenuItemOptionSetBase(); // MenuItemOptionSetBase | Menu item option set (delta)
try {
    apiInstance.updateMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, optionSetId, menuItemOptionSet);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#updateMenuItemOptionSet");
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
 **menuItemOptionSet** | [**MenuItemOptionSetBase**](MenuItemOptionSetBase.md)| Menu item option set (delta) |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadOptionSetImage"></a>
# **uploadOptionSetImage**
> RestApiStringResult uploadOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId, image)

Upload menu item option set image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuOptionSetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuOptionSetsApi apiInstance = new MenuOptionSetsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
Integer menuSectionItemId = 56; // Integer | Menu section item identifier
Integer optionSetId = 56; // Integer | Option set identifier
File image = new File("/path/to/file.txt"); // File | Option set image
try {
    RestApiStringResult result = apiInstance.uploadOptionSetImage(menuId, menuSectionId, menuSectionItemId, optionSetId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuOptionSetsApi#uploadOptionSetImage");
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
 **image** | **File**| Option set image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

