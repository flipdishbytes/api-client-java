# MenusNutritionInfoV2Api

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrUpdateMenuItemNutritionInfoV2**](MenusNutritionInfoV2Api.md#addOrUpdateMenuItemNutritionInfoV2) | **POST** /api/v1.0/{appId}/menus/{menuId}/menuItem/{publicId}/nutritionv2 | Add or update menuitem nutrition info by menu item&#39;s publicId
[**addOrUpdateMenuItemOptionSetItemNutritionInfoV2**](MenusNutritionInfoV2Api.md#addOrUpdateMenuItemOptionSetItemNutritionInfoV2) | **POST** /api/v1.0/{appId}/menus/{menuId}/menuItemOption/{publicId}/nutritionv2 | Add or update menuitem option set item&#39;s nutrition info by its publicId
[**getAllergensV2**](MenusNutritionInfoV2Api.md#getAllergensV2) | **GET** /api/v1.0/{appId}/menus/nutritionv2/allergens | Get allergens
[**getMenuNutritionInfoV2ByMenuId**](MenusNutritionInfoV2Api.md#getMenuNutritionInfoV2ByMenuId) | **GET** /api/v1.0/{appId}/menus/{menuId}/nutritionv2 | Get menu nutrition by menuId


<a name="addOrUpdateMenuItemNutritionInfoV2"></a>
# **addOrUpdateMenuItemNutritionInfoV2**
> Object addOrUpdateMenuItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId)

Add or update menuitem nutrition info by menu item&#39;s publicId

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoV2Api apiInstance = new MenusNutritionInfoV2Api();
Integer menuId = 56; // Integer | Menu identifier
String publicId = "publicId_example"; // String | Menu item's publicId
ItemNutritionInfoV2AddUpdateModel addOrUpdateModel = new ItemNutritionInfoV2AddUpdateModel(); // ItemNutritionInfoV2AddUpdateModel | Allergen ids
String appId = "appId_example"; // String | 
try {
    Object result = apiInstance.addOrUpdateMenuItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoV2Api#addOrUpdateMenuItemNutritionInfoV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **publicId** | **String**| Menu item&#39;s publicId |
 **addOrUpdateModel** | [**ItemNutritionInfoV2AddUpdateModel**](ItemNutritionInfoV2AddUpdateModel.md)| Allergen ids |
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="addOrUpdateMenuItemOptionSetItemNutritionInfoV2"></a>
# **addOrUpdateMenuItemOptionSetItemNutritionInfoV2**
> Object addOrUpdateMenuItemOptionSetItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId)

Add or update menuitem option set item&#39;s nutrition info by its publicId

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoV2Api apiInstance = new MenusNutritionInfoV2Api();
Integer menuId = 56; // Integer | Menu identifier
String publicId = "publicId_example"; // String | Menu item option set item's publicId
ItemNutritionInfoV2AddUpdateModel addOrUpdateModel = new ItemNutritionInfoV2AddUpdateModel(); // ItemNutritionInfoV2AddUpdateModel | Allergen ids
String appId = "appId_example"; // String | 
try {
    Object result = apiInstance.addOrUpdateMenuItemOptionSetItemNutritionInfoV2(menuId, publicId, addOrUpdateModel, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoV2Api#addOrUpdateMenuItemOptionSetItemNutritionInfoV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**| Menu identifier |
 **publicId** | **String**| Menu item option set item&#39;s publicId |
 **addOrUpdateModel** | [**ItemNutritionInfoV2AddUpdateModel**](ItemNutritionInfoV2AddUpdateModel.md)| Allergen ids |
 **appId** | **String**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAllergensV2"></a>
# **getAllergensV2**
> RestApiArrayResultAllergen getAllergensV2(appId, languageId)

Get allergens

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoV2Api apiInstance = new MenusNutritionInfoV2Api();
String appId = "appId_example"; // String | 
String languageId = "languageId_example"; // String | 
try {
    RestApiArrayResultAllergen result = apiInstance.getAllergensV2(appId, languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoV2Api#getAllergensV2");
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

<a name="getMenuNutritionInfoV2ByMenuId"></a>
# **getMenuNutritionInfoV2ByMenuId**
> RestApiResultNutritionInfoV2 getMenuNutritionInfoV2ByMenuId(appId, menuId, languageId)

Get menu nutrition by menuId

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MenusNutritionInfoV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MenusNutritionInfoV2Api apiInstance = new MenusNutritionInfoV2Api();
String appId = "appId_example"; // String | 
Integer menuId = 56; // Integer | Menu identifier
String languageId = "languageId_example"; // String | 
try {
    RestApiResultNutritionInfoV2 result = apiInstance.getMenuNutritionInfoV2ByMenuId(appId, menuId, languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusNutritionInfoV2Api#getMenuNutritionInfoV2ByMenuId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **menuId** | **Integer**| Menu identifier |
 **languageId** | **String**|  | [optional]

### Return type

[**RestApiResultNutritionInfoV2**](RestApiResultNutritionInfoV2.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

