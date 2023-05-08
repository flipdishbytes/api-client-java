# StoreGroupsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStoreGroup**](StoreGroupsApi.md#createStoreGroup) | **POST** /api/v1.0/{appNameId}/storegroups | Creates a Store Group  It will be attached to an existing App
[**getStoreGroup**](StoreGroupsApi.md#getStoreGroup) | **GET** /api/v1.0/storegroups/{storeGroupId} | Returns a Store Groups
[**getStoreGroups**](StoreGroupsApi.md#getStoreGroups) | **GET** /api/v1.0/{appNameId}/storegroups | Returns a paginated list of Store Groups
[**getStoreGroupsExtended**](StoreGroupsApi.md#getStoreGroupsExtended) | **GET** /api/v1.0/{appNameId}/storegroups/extended | [PRIVATE API] Returns a paginated list of Extended Store Groups
[**removeStoreGroup**](StoreGroupsApi.md#removeStoreGroup) | **DELETE** /api/v1.0/storegroups/{storeGroupId} | Deletes a Store Group  Can only remove a store group if there is no stores attached to the group
[**setMenuMessagePerDeliveryType**](StoreGroupsApi.md#setMenuMessagePerDeliveryType) | **POST** /api/v1.0/storegroups/{storeGroupId}/{deliveryType}/MenuMessagePerDeliveryType | 
[**updateStoreGroup**](StoreGroupsApi.md#updateStoreGroup) | **POST** /api/v1.0/storegroups/{storeGroupId} | Updates Store Group


<a name="createStoreGroup"></a>
# **createStoreGroup**
> RestApiResultStoreGroup createStoreGroup(appNameId, storeGroup)

Creates a Store Group  It will be attached to an existing App

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
String appNameId = "appNameId_example"; // String | App Name Id
StoreGroupBase storeGroup = new StoreGroupBase(); // StoreGroupBase | Store group definition
try {
    RestApiResultStoreGroup result = apiInstance.createStoreGroup(appNameId, storeGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#createStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appNameId** | **String**| App Name Id |
 **storeGroup** | [**StoreGroupBase**](StoreGroupBase.md)| Store group definition |

### Return type

[**RestApiResultStoreGroup**](RestApiResultStoreGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreGroup"></a>
# **getStoreGroup**
> RestApiResultStoreGroup getStoreGroup(storeGroupId)

Returns a Store Groups

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
Integer storeGroupId = 56; // Integer | Store Group Id
try {
    RestApiResultStoreGroup result = apiInstance.getStoreGroup(storeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#getStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeGroupId** | **Integer**| Store Group Id |

### Return type

[**RestApiResultStoreGroup**](RestApiResultStoreGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreGroups"></a>
# **getStoreGroups**
> RestApiPaginationResultStoreGroup getStoreGroups(appNameId, searchQuery, page, limit)

Returns a paginated list of Store Groups

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
String appNameId = "appNameId_example"; // String | App Name Id
String searchQuery = "searchQuery_example"; // String | Search query
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
try {
    RestApiPaginationResultStoreGroup result = apiInstance.getStoreGroups(appNameId, searchQuery, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#getStoreGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appNameId** | **String**| App Name Id |
 **searchQuery** | **String**| Search query | [optional]
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

### Return type

[**RestApiPaginationResultStoreGroup**](RestApiPaginationResultStoreGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreGroupsExtended"></a>
# **getStoreGroupsExtended**
> RestApiPaginationResultStoreGroupExtended getStoreGroupsExtended(appNameId, searchQuery, page, limit, groupingRadius)

[PRIVATE API] Returns a paginated list of Extended Store Groups

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
String appNameId = "appNameId_example"; // String | App Name Id
String searchQuery = "searchQuery_example"; // String | Search query
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
Integer groupingRadius = 56; // Integer | 
try {
    RestApiPaginationResultStoreGroupExtended result = apiInstance.getStoreGroupsExtended(appNameId, searchQuery, page, limit, groupingRadius);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#getStoreGroupsExtended");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appNameId** | **String**| App Name Id |
 **searchQuery** | **String**| Search query | [optional]
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **groupingRadius** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultStoreGroupExtended**](RestApiPaginationResultStoreGroupExtended.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeStoreGroup"></a>
# **removeStoreGroup**
> removeStoreGroup(storeGroupId)

Deletes a Store Group  Can only remove a store group if there is no stores attached to the group

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
Integer storeGroupId = 56; // Integer | Store Group Id
try {
    apiInstance.removeStoreGroup(storeGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#removeStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeGroupId** | **Integer**| Store Group Id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setMenuMessagePerDeliveryType"></a>
# **setMenuMessagePerDeliveryType**
> setMenuMessagePerDeliveryType(storeGroupId, deliveryType, menuMessage)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
Integer storeGroupId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
String menuMessage = "menuMessage_example"; // String | 
try {
    apiInstance.setMenuMessagePerDeliveryType(storeGroupId, deliveryType, menuMessage);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#setMenuMessagePerDeliveryType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeGroupId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **menuMessage** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStoreGroup"></a>
# **updateStoreGroup**
> RestApiResultStoreGroupBase updateStoreGroup(storeGroupId, storeGroup)

Updates Store Group

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoreGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoreGroupsApi apiInstance = new StoreGroupsApi();
Integer storeGroupId = 56; // Integer | Store Group Id
StoreGroupBase storeGroup = new StoreGroupBase(); // StoreGroupBase | Store Group Delta
try {
    RestApiResultStoreGroupBase result = apiInstance.updateStoreGroup(storeGroupId, storeGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreGroupsApi#updateStoreGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeGroupId** | **Integer**| Store Group Id |
 **storeGroup** | [**StoreGroupBase**](StoreGroupBase.md)| Store Group Delta |

### Return type

[**RestApiResultStoreGroupBase**](RestApiResultStoreGroupBase.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

