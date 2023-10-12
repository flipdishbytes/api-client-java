# MenuZonesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMenuZone**](MenuZonesApi.md#addMenuZone) | **POST** /api/v1.0/menus/{menuId}/zones | 
[**deleteMenuZone**](MenuZonesApi.md#deleteMenuZone) | **DELETE** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | 
[**flipMenuZones**](MenuZonesApi.md#flipMenuZones) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/flip/{menuZoneI2} | 
[**getMenuZone**](MenuZonesApi.md#getMenuZone) | **GET** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | 
[**getMenuZonesForMenu**](MenuZonesApi.md#getMenuZonesForMenu) | **GET** /api/v1.0/menus/{menuId}/zones | 
[**setMenuSectionMenuZone**](MenuZonesApi.md#setMenuSectionMenuZone) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/description | 
[**setMenuSectionMenuZone_0**](MenuZonesApi.md#setMenuSectionMenuZone_0) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/section/{menuSectionId} | 
[**setMenuZoneName**](MenuZonesApi.md#setMenuZoneName) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/name/{menuZoneName} | 
[**updateMenuZone**](MenuZonesApi.md#updateMenuZone) | **PUT** /api/v1.0/menus/{menuId}/zones/{menuZoneId} | 
[**uploadMenuZoneImage**](MenuZonesApi.md#uploadMenuZoneImage) | **POST** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/image | 
[**uploadMenuZoneImage_0**](MenuZonesApi.md#uploadMenuZoneImage_0) | **DELETE** /api/v1.0/menus/{menuId}/zones/{menuZoneId}/image | 


<a name="addMenuZone"></a>
# **addMenuZone**
> RestApiResultMenuZone addMenuZone(menuId, menuZone)



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
Integer menuId = 56; // Integer | 
MenuZone menuZone = new MenuZone(); // MenuZone | 
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
 **menuId** | **Integer**|  |
 **menuZone** | [**MenuZone**](MenuZone.md)|  |

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
Integer menuZoneId = 56; // Integer | 
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
 **menuZoneId** | **Integer**|  |
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
Integer menuZoneId = 56; // Integer | 
Integer menuZoneI2 = 56; // Integer | 
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
 **menuZoneId** | **Integer**|  |
 **menuZoneI2** | **Integer**|  |
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
Integer menuId = 56; // Integer | 
Integer menuZoneId = 56; // Integer | 
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
 **menuId** | **Integer**|  |
 **menuZoneId** | **Integer**|  |

### Return type

[**RestApiResultMenuZone**](RestApiResultMenuZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuZonesForMenu"></a>
# **getMenuZonesForMenu**
> RestApiArrayResultMenuZone getMenuZonesForMenu(menuId)



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
Integer menuId = 56; // Integer | 
try {
    RestApiArrayResultMenuZone result = apiInstance.getMenuZonesForMenu(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#getMenuZonesForMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |

### Return type

[**RestApiArrayResultMenuZone**](RestApiArrayResultMenuZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuSectionMenuZone"></a>
# **setMenuSectionMenuZone**
> setMenuSectionMenuZone(menuZoneId, description, menuId)



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
Integer menuZoneId = 56; // Integer | 
String description = "description_example"; // String | 
String menuId = "menuId_example"; // String | 
try {
    apiInstance.setMenuSectionMenuZone(menuZoneId, description, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#setMenuSectionMenuZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**|  |
 **description** | **String**|  |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuSectionMenuZone_0"></a>
# **setMenuSectionMenuZone_0**
> setMenuSectionMenuZone_0(menuZoneId, menuSectionId, menuId)



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
Integer menuZoneId = 56; // Integer | 
Integer menuSectionId = 56; // Integer | 
String menuId = "menuId_example"; // String | 
try {
    apiInstance.setMenuSectionMenuZone_0(menuZoneId, menuSectionId, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#setMenuSectionMenuZone_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**|  |
 **menuSectionId** | **Integer**|  |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuZoneName"></a>
# **setMenuZoneName**
> setMenuZoneName(menuZoneId, menuZoneName, menuId)



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
Integer menuZoneId = 56; // Integer | 
String menuZoneName = "menuZoneName_example"; // String | 
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
 **menuZoneId** | **Integer**|  |
 **menuZoneName** | **String**|  |
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
Integer menuId = 56; // Integer | 
Integer menuZoneId = 56; // Integer | 
MenuZone menuZone = new MenuZone(); // MenuZone | 
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
 **menuId** | **Integer**|  |
 **menuZoneId** | **Integer**|  |
 **menuZone** | [**MenuZone**](MenuZone.md)|  |

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
Integer menuZoneId = 56; // Integer | 
List<HttpPostedFileBase> file = Arrays.asList(new HttpPostedFileBase()); // List<HttpPostedFileBase> | 
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
 **menuZoneId** | **Integer**|  |
 **file** | [**List&lt;HttpPostedFileBase&gt;**](HttpPostedFileBase.md)|  |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuZoneImage_0"></a>
# **uploadMenuZoneImage_0**
> uploadMenuZoneImage_0(menuZoneId, menuId)



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
Integer menuZoneId = 56; // Integer | 
String menuId = "menuId_example"; // String | 
try {
    apiInstance.uploadMenuZoneImage_0(menuZoneId, menuId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuZonesApi#uploadMenuZoneImage_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuZoneId** | **Integer**|  |
 **menuId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

