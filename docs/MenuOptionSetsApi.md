# MenuOptionSetsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMenuItemOptionSet**](MenuOptionSetsApi.md#createMenuItemOptionSet) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets | 
[**deleteMenuItemOptionSet**](MenuOptionSetsApi.md#deleteMenuItemOptionSet) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | 
[**deleteOptionSetImage**](MenuOptionSetsApi.md#deleteOptionSetImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/image | 
[**getMenuItemOptionSetById**](MenuOptionSetsApi.md#getMenuItemOptionSetById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | Get menu item option set by identifier
[**getMenuItemOptionSets**](MenuOptionSetsApi.md#getMenuItemOptionSets) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets | Get menu item option sets
[**updateMenuItemOptionSet**](MenuOptionSetsApi.md#updateMenuItemOptionSet) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId} | 
[**uploadOptionSetImage**](MenuOptionSetsApi.md#uploadOptionSetImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitems/{menuSectionItemId}/optionsets/{optionSetId}/image | 


<a name="createMenuItemOptionSet"></a>
# **createMenuItemOptionSet**
> Object createMenuItemOptionSet(menuId, menuSectionId, menuSectionItemId, menuItemOptionSet)



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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
MenuItemOptionSetBase menuItemOptionSet = new MenuItemOptionSetBase(); // MenuItemOptionSetBase | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **menuItemOptionSet** | [**MenuItemOptionSetBase**](MenuItemOptionSetBase.md)|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer optionSetId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **optionSetId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer optionSetId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **optionSetId** | **Integer**|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer optionSetId = 56; // Integer | 
MenuItemOptionSetBase menuItemOptionSet = new MenuItemOptionSetBase(); // MenuItemOptionSetBase | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **optionSetId** | **Integer**|  |
 **menuItemOptionSet** | [**MenuItemOptionSetBase**](MenuItemOptionSetBase.md)|  |

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
Integer menuId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
Integer menuSectionItemId = 56; // Integer | 
Integer optionSetId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuSectionItemId** | **Integer**|  |
 **optionSetId** | **Integer**|  |
 **image** | **File**| Option set image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

