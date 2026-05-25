# MenusNutritionInfoApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateMenuItemNutritionInfo**](MenusNutritionInfoApi.md#addOrUpdateMenuItemNutritionInfo) | **POST** /api/v1.0/menus/{menuId}/menuItem/{publicId}/nutrition | 
[**addOrUpdateMenuItemOptionSetItemNutritionInfo**](MenusNutritionInfoApi.md#addOrUpdateMenuItemOptionSetItemNutritionInfo) | **POST** /api/v1.0/menus/{menuId}/menuItemOption/{publicId}/nutrition | 
[**addOrUpdateMenuNutritionInfoByMenuId**](MenusNutritionInfoApi.md#addOrUpdateMenuNutritionInfoByMenuId) | **POST** /api/v1.0/menus/{menuId}/nutrition | 
[**deleteMenuNutritionInfoByMenuId**](MenusNutritionInfoApi.md#deleteMenuNutritionInfoByMenuId) | **DELETE** /api/v1.0/menus/{menuId}/nutrition | 
[**getAllergens**](MenusNutritionInfoApi.md#getAllergens) | **GET** /api/v1.0/{appId}/menus/nutrition/allergens | 
[**getMenuNutritionInfoByMenuId**](MenusNutritionInfoApi.md#getMenuNutritionInfoByMenuId) | **GET** /api/v1.0/menus/{menuId}/nutrition | 


<a name="addOrUpdateMenuItemNutritionInfo"></a>
# **addOrUpdateMenuItemNutritionInfo**
> RestApiResultMenuNutritionInfoHeader addOrUpdateMenuItemNutritionInfo(menuId, publicId, addOrUpdateModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
Integer menuId = 56; // Integer | 
String publicId = "publicId_example"; // String | 
ItemNutritionInfoAddUpdateModel addOrUpdateModel = new ItemNutritionInfoAddUpdateModel(); // ItemNutritionInfoAddUpdateModel | 
try {
    RestApiResultMenuNutritionInfoHeader result = apiInstance.addOrUpdateMenuItemNutritionInfo(menuId, publicId, addOrUpdateModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#addOrUpdateMenuItemNutritionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **publicId** | **String**|  |
 **addOrUpdateModel** | [**ItemNutritionInfoAddUpdateModel**](ItemNutritionInfoAddUpdateModel.md)|  |

### Return type

[**RestApiResultMenuNutritionInfoHeader**](RestApiResultMenuNutritionInfoHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="addOrUpdateMenuItemOptionSetItemNutritionInfo"></a>
# **addOrUpdateMenuItemOptionSetItemNutritionInfo**
> RestApiResultMenuNutritionInfoHeader addOrUpdateMenuItemOptionSetItemNutritionInfo(menuId, publicId, addOrUpdateModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
Integer menuId = 56; // Integer | 
UUID publicId = new UUID(); // UUID | 
ItemNutritionInfoAddUpdateModel addOrUpdateModel = new ItemNutritionInfoAddUpdateModel(); // ItemNutritionInfoAddUpdateModel | 
try {
    RestApiResultMenuNutritionInfoHeader result = apiInstance.addOrUpdateMenuItemOptionSetItemNutritionInfo(menuId, publicId, addOrUpdateModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#addOrUpdateMenuItemOptionSetItemNutritionInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **publicId** | [**UUID**](.md)|  |
 **addOrUpdateModel** | [**ItemNutritionInfoAddUpdateModel**](ItemNutritionInfoAddUpdateModel.md)|  |

### Return type

[**RestApiResultMenuNutritionInfoHeader**](RestApiResultMenuNutritionInfoHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="addOrUpdateMenuNutritionInfoByMenuId"></a>
# **addOrUpdateMenuNutritionInfoByMenuId**
> RestApiResultMenuNutritionInfoHeader addOrUpdateMenuNutritionInfoByMenuId(menuId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
Integer menuId = 56; // Integer | 
try {
    RestApiResultMenuNutritionInfoHeader result = apiInstance.addOrUpdateMenuNutritionInfoByMenuId(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#addOrUpdateMenuNutritionInfoByMenuId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |

### Return type

[**RestApiResultMenuNutritionInfoHeader**](RestApiResultMenuNutritionInfoHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteMenuNutritionInfoByMenuId"></a>
# **deleteMenuNutritionInfoByMenuId**
> Object deleteMenuNutritionInfoByMenuId(menuId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
Integer menuId = 56; // Integer | 
try {
    Object result = apiInstance.deleteMenuNutritionInfoByMenuId(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#deleteMenuNutritionInfoByMenuId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAllergens"></a>
# **getAllergens**
> RestApiArrayResultAllergen getAllergens(appId, languageId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
String appId = "appId_example"; // String | 
String languageId = "languageId_example"; // String | 
try {
    RestApiArrayResultAllergen result = apiInstance.getAllergens(appId, languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#getAllergens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **languageId** | **String**|  | [optional]

### Return type

[**RestApiArrayResultAllergen**](RestApiArrayResultAllergen.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getMenuNutritionInfoByMenuId"></a>
# **getMenuNutritionInfoByMenuId**
> RestApiResultNutritionInfo getMenuNutritionInfoByMenuId(menuId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoApi apiInstance = new MenusNutritionInfoApi();
Integer menuId = 56; // Integer | 
try {
    RestApiResultNutritionInfo result = apiInstance.getMenuNutritionInfoByMenuId(menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoApi#getMenuNutritionInfoByMenuId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |

### Return type

[**RestApiResultNutritionInfo**](RestApiResultNutritionInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

