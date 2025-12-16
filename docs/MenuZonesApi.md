# MenuZonesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMenuZone**](MenuZonesApi.md#addMenuZone) | **POST** /api/v1.0/menus/{menuId}/zones | Adds a new menu zone to a menu.
[**deleteMenuZone**](MenuZonesApi.md#deleteMenuZone) | **DELETE** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | Deletes a menu zone.
[**deleteMenuZoneImage**](MenuZonesApi.md#deleteMenuZoneImage) | **DELETE** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/image | Deletes a menu zone image.
[**flipMenuZones**](MenuZonesApi.md#flipMenuZones) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/flip/{menuZoneI2} | Flips the order of two menu zones.
[**getMenuZone**](MenuZonesApi.md#getMenuZone) | **GET** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | Gets a specific menu zone for a given zone id
[**getMenuZonesForMenuId**](MenuZonesApi.md#getMenuZonesForMenuId) | **GET** /api/v1.0/menus/{menuId}/zones | Gets all the menu zones for a menu
[**setMenuSectionMenuZone**](MenuZonesApi.md#setMenuSectionMenuZone) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/section/{menuSectionId} | Assigns a zone to a menu section.
[**setMenuZoneDescription**](MenuZonesApi.md#setMenuZoneDescription) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/description | Sets the description of a menu zone.
[**setMenuZoneName**](MenuZonesApi.md#setMenuZoneName) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/name/{menuZoneName} | Sets the name of a menu zone.
[**updateMenuZone**](MenuZonesApi.md#updateMenuZone) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | Updates a menu zone.
[**uploadMenuZoneImage**](MenuZonesApi.md#uploadMenuZoneImage) | **POST** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/image | Uploads an image for a menu zone.


<a name="addMenuZone"></a>
# **addMenuZone**
> RestApiResultMenuZone addMenuZone(menuId, menuZone)

Adds a new menu zone to a menu.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuId = 56; // Integer | The menu id.
MenuZone menuZone = new MenuZone(); // MenuZone | The object containing the new zone. This is optional and not supplying it will generate an empty default zone.
try {
    RestApiResultMenuZone result = apiInstance.addMenuZone(menuId, menuZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#addMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| The menu id. |
 **menuZone** | [**MenuZone**](MenuZone.md)| The object containing the new zone. This is optional and not supplying it will generate an empty default zone. |

### Return type

[**RestApiResultMenuZone**](RestApiResultMenuZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuZone"></a>
# **deleteMenuZone**
> deleteMenuZone(menuZoneId, menuId)

Deletes a menu zone.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The menu zone id.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.deleteMenuZone(menuZoneId, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#deleteMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The menu zone id. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuZoneImage"></a>
# **deleteMenuZoneImage**
> deleteMenuZoneImage(menuZoneId, menuId)

Deletes a menu zone image.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The zone Id/
String menuId = "menuId_example"; // String | 
try {
    apiInstance.deleteMenuZoneImage(menuZoneId, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#deleteMenuZoneImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The zone Id/ |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="flipMenuZones"></a>
# **flipMenuZones**
> flipMenuZones(menuZoneId, menuZoneI2, menuId)

Flips the order of two menu zones.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | Source.
Integer menuZoneI2 = 56; // Integer | Destination.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.flipMenuZones(menuZoneId, menuZoneI2, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#flipMenuZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| Source. |
 **menuZoneI2** | **Integer**| Destination. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuZone"></a>
# **getMenuZone**
> RestApiResultMenuZone getMenuZone(menuId, menuZoneId)

Gets a specific menu zone for a given zone id

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuId = 56; // Integer | The menu id.
Integer menuZoneId = 56; // Integer | The menu zone id.
try {
    RestApiResultMenuZone result = apiInstance.getMenuZone(menuId, menuZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#getMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| The menu id. |
 **menuZoneId** | **Integer**| The menu zone id. |

### Return type

[**RestApiResultMenuZone**](RestApiResultMenuZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuZonesForMenuId"></a>
# **getMenuZonesForMenuId**
> RestApiArrayResultMenuZone getMenuZonesForMenuId(menuId)

Gets all the menu zones for a menu

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuId = 56; // Integer | The menu id to load zones for
try {
    RestApiArrayResultMenuZone result = apiInstance.getMenuZonesForMenuId(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#getMenuZonesForMenuId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| The menu id to load zones for |

### Return type

[**RestApiArrayResultMenuZone**](RestApiArrayResultMenuZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuSectionMenuZone"></a>
# **setMenuSectionMenuZone**
> setMenuSectionMenuZone(menuZoneId, menuSectionId, menuId)

Assigns a zone to a menu section.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The menu id.
Integer menuSectionId = 56; // Integer | The menu section id.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.setMenuSectionMenuZone(menuZoneId, menuSectionId, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#setMenuSectionMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The menu id. |
 **menuSectionId** | **Integer**| The menu section id. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuZoneDescription"></a>
# **setMenuZoneDescription**
> setMenuZoneDescription(menuZoneId, description, menuId)

Sets the description of a menu zone.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The zone id.
String description = "description_example"; // String | The new description. Add as a raw string in the request, without any JSON wrapper.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.setMenuZoneDescription(menuZoneId, description, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#setMenuZoneDescription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The zone id. |
 **description** | **String**| The new description. Add as a raw string in the request, without any JSON wrapper. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuZoneName"></a>
# **setMenuZoneName**
> setMenuZoneName(menuZoneId, menuZoneName, menuId)

Sets the name of a menu zone.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The menu zone id.
String menuZoneName = "menuZoneName_example"; // String | The new name.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.setMenuZoneName(menuZoneId, menuZoneName, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#setMenuZoneName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The menu zone id. |
 **menuZoneName** | **String**| The new name. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenuZone"></a>
# **updateMenuZone**
> updateMenuZone(menuId, menuZoneId, menuZone)

Updates a menu zone.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuId = 56; // Integer | The menu id.
Integer menuZoneId = 56; // Integer | The menu zone id.
MenuZone menuZone = new MenuZone(); // MenuZone | The object containing the updated values.
try {
    apiInstance.updateMenuZone(menuId, menuZoneId, menuZone);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#updateMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| The menu id. |
 **menuZoneId** | **Integer**| The menu zone id. |
 **menuZone** | [**MenuZone**](MenuZone.md)| The object containing the updated values. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuZoneImage"></a>
# **uploadMenuZoneImage**
> uploadMenuZoneImage(menuZoneId, file, menuId)

Uploads an image for a menu zone.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuZonesApi apiInstance = new MenuZonesApi();
Integer menuZoneId = 56; // Integer | The zone id.
List<HttpPostedFileBase> file = Arrays.asList(new HttpPostedFileBase()); // List<HttpPostedFileBase> | The file to upload.
String menuId = "menuId_example"; // String | 
try {
    apiInstance.uploadMenuZoneImage(menuZoneId, file, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#uploadMenuZoneImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**| The zone id. |
 **file** | [**List&lt;HttpPostedFileBase&gt;**](HttpPostedFileBase.md)| The file to upload. |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

