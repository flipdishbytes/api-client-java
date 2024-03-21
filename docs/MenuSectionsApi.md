# MenuSectionsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneMenuSection**](MenuSectionsApi.md#cloneMenuSection) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/clone | Clone menu section
[**createMenuAvailabilityForDay**](MenuSectionsApi.md#createMenuAvailabilityForDay) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/availability/times/{dayOfWeek} | Set/update menu section availability hours.
[**createMenuSection**](MenuSectionsApi.md#createMenuSection) | **POST** /api/v1.0/menus/{menuId}/sections | Create menu section
[**createMenuSectionAvailability**](MenuSectionsApi.md#createMenuSectionAvailability) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/availability | Create menu availability type
[**deleteMenuSection**](MenuSectionsApi.md#deleteMenuSection) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId} | Delete menu section
[**deleteMenuSectionImage**](MenuSectionsApi.md#deleteMenuSectionImage) | **DELETE** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/image | Delete menu section image
[**getMenuSectionById**](MenuSectionsApi.md#getMenuSectionById) | **GET** /api/v1.0/menus/{menuId}/sections/{menuSectionId} | Get menu section by identifier
[**getMenuSections**](MenuSectionsApi.md#getMenuSections) | **GET** /api/v1.0/menus/{menuId}/sections | Get menu sections
[**menuSectionsSetItemDisplayOrders**](MenuSectionsApi.md#menuSectionsSetItemDisplayOrders) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/sectionitemdisplayorders | [PRIVATE API] Re-arrange Items within a Section
[**updateMenuSection**](MenuSectionsApi.md#updateMenuSection) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId} | Update menu section
[**uploadMenuSectionImage**](MenuSectionsApi.md#uploadMenuSectionImage) | **POST** /api/v1.0/menus/{menuId}/sections/{menuSectionId}/image | Upload menu section image


<a name="cloneMenuSection"></a>
# **cloneMenuSection**
> RestApiResultMenuSection cloneMenuSection(menuId, menuSectionId)

Clone menu section

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
try {
    RestApiResultMenuSection result = apiInstance.cloneMenuSection(menuId, menuSectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#cloneMenuSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |

### Return type

[**RestApiResultMenuSection**](RestApiResultMenuSection.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createMenuAvailabilityForDay"></a>
# **createMenuAvailabilityForDay**
> Object createMenuAvailabilityForDay(menuId, menuSectionId, dayOfWeek, businessHoursPeriod)

Set/update menu section availability hours.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
String dayOfWeek = "dayOfWeek_example"; // String | Day of the  week
BusinessHoursPeriodBase businessHoursPeriod = new BusinessHoursPeriodBase(); // BusinessHoursPeriodBase | Menu section active hours, note: DayOfWeek property will be overriden by the path parameter.
try {
    Object result = apiInstance.createMenuAvailabilityForDay(menuId, menuSectionId, dayOfWeek, businessHoursPeriod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#createMenuAvailabilityForDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **dayOfWeek** | **String**| Day of the  week | [enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
 **businessHoursPeriod** | [**BusinessHoursPeriodBase**](BusinessHoursPeriodBase.md)| Menu section active hours, note: DayOfWeek property will be overriden by the path parameter. |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createMenuSection"></a>
# **createMenuSection**
> Object createMenuSection(menuId, menuSection)

Create menu section

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
MenuSectionBase menuSection = new MenuSectionBase(); // MenuSectionBase | Menu section
try {
    Object result = apiInstance.createMenuSection(menuId, menuSection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#createMenuSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSection** | [**MenuSectionBase**](MenuSectionBase.md)| Menu section |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createMenuSectionAvailability"></a>
# **createMenuSectionAvailability**
> Object createMenuSectionAvailability(menuId, menuSectionId, menuSectionAvailability)

Create menu availability type

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
MenuSectionAvailabilityBase menuSectionAvailability = new MenuSectionAvailabilityBase(); // MenuSectionAvailabilityBase | DisplayAlways, DisplayBasedOnTimes, DisplayAlwaysStartCollapsed, DisplayAlwaysStartCollapsedBasedOnTimes
try {
    Object result = apiInstance.createMenuSectionAvailability(menuId, menuSectionId, menuSectionAvailability);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#createMenuSectionAvailability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSectionAvailability** | [**MenuSectionAvailabilityBase**](MenuSectionAvailabilityBase.md)| DisplayAlways, DisplayBasedOnTimes, DisplayAlwaysStartCollapsed, DisplayAlwaysStartCollapsedBasedOnTimes |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuSection"></a>
# **deleteMenuSection**
> deleteMenuSection(menuId, menuSectionId)

Delete menu section

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
try {
    apiInstance.deleteMenuSection(menuId, menuSectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#deleteMenuSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuSectionImage"></a>
# **deleteMenuSectionImage**
> deleteMenuSectionImage(menuId, menuSectionId)

Delete menu section image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
try {
    apiInstance.deleteMenuSectionImage(menuId, menuSectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#deleteMenuSectionImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuSectionById"></a>
# **getMenuSectionById**
> RestApiResultMenuSection getMenuSectionById(menuId, menuSectionId)

Get menu section by identifier

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
try {
    RestApiResultMenuSection result = apiInstance.getMenuSectionById(menuId, menuSectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#getMenuSectionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |

### Return type

[**RestApiResultMenuSection**](RestApiResultMenuSection.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuSections"></a>
# **getMenuSections**
> RestApiArrayResultMenuSection getMenuSections(menuId)

Get menu sections

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
try {
    RestApiArrayResultMenuSection result = apiInstance.getMenuSections(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#getMenuSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |

### Return type

[**RestApiArrayResultMenuSection**](RestApiArrayResultMenuSection.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="menuSectionsSetItemDisplayOrders"></a>
# **menuSectionsSetItemDisplayOrders**
> menuSectionsSetItemDisplayOrders(menuId, menuSectionId, displayOrders)

[PRIVATE API] Re-arrange Items within a Section

[PRIVATE API]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
MenuObjectDisplayOrders displayOrders = new MenuObjectDisplayOrders(); // MenuObjectDisplayOrders | Item Ids and their new display order
try {
    apiInstance.menuSectionsSetItemDisplayOrders(menuId, menuSectionId, displayOrders);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#menuSectionsSetItemDisplayOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **displayOrders** | [**MenuObjectDisplayOrders**](MenuObjectDisplayOrders.md)| Item Ids and their new display order |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateMenuSection"></a>
# **updateMenuSection**
> updateMenuSection(menuId, menuSectionId, menuSection, undoAfter)

Update menu section

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
MenuSectionBase menuSection = new MenuSectionBase(); // MenuSectionBase | Menu section changes (delta)
Double undoAfter = 3.4D; // Double | An optional time period, in hours, after which the hide-section operation will be undone.
try {
    apiInstance.updateMenuSection(menuId, menuSectionId, menuSection, undoAfter);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#updateMenuSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **menuSection** | [**MenuSectionBase**](MenuSectionBase.md)| Menu section changes (delta) |
 **undoAfter** | **Double**| An optional time period, in hours, after which the hide-section operation will be undone. | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadMenuSectionImage"></a>
# **uploadMenuSectionImage**
> RestApiStringResult uploadMenuSectionImage(menuId, menuSectionId, image)

Upload menu section image

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenuSectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenuSectionsApi apiInstance = new MenuSectionsApi();
Integer menuId = 56; // Integer | Menu identifier
Integer menuSectionId = 56; // Integer | Menu section identifier
File image = new File("/path/to/file.txt"); // File | Menu section image
try {
    RestApiStringResult result = apiInstance.uploadMenuSectionImage(menuId, menuSectionId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuSectionsApi#uploadMenuSectionImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **menuSectionId** | **Integer**| Menu section identifier |
 **image** | **File**| Menu section image |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

