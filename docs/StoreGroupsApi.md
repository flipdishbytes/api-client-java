# StoreGroupsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStoreGroup**](StoreGroupsApi.md#createStoreGroup) | **POST** /api/v1.0/{appNameId}/storegroups | 
[**getStoreGroup**](StoreGroupsApi.md#getStoreGroup) | **GET** /api/v1.0/storegroups/{storeGroupId} | 
[**getStoreGroups**](StoreGroupsApi.md#getStoreGroups) | **GET** /api/v1.0/{appNameId}/storegroups | 
[**getStoreGroupsExtended**](StoreGroupsApi.md#getStoreGroupsExtended) | **GET** /api/v1.0/{appNameId}/storegroups/extended | 
[**removeStoreGroup**](StoreGroupsApi.md#removeStoreGroup) | **DELETE** /api/v1.0/storegroups/{storeGroupId} | 
[**setMenuMessagePerDeliveryType**](StoreGroupsApi.md#setMenuMessagePerDeliveryType) | **POST** /api/v1.0/storegroups/{storeGroupId}/{deliveryType}/MenuMessagePerDeliveryType | 
[**updateStoreGroup**](StoreGroupsApi.md#updateStoreGroup) | **POST** /api/v1.0/storegroups/{storeGroupId} | 


<a name="createStoreGroup"></a>
# **createStoreGroup**
> RestApiResultStoreGroup createStoreGroup(appNameId, storeGroup)



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
String appNameId = "appNameId_example"; // String | 
StoreGroupBase storeGroup = new StoreGroupBase(); // StoreGroupBase | 
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
 **appNameId** | **String**|  |
 **storeGroup** | [**StoreGroupBase**](StoreGroupBase.md)|  |

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
 **storeGroupId** | **Integer**|  |

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
String appNameId = "appNameId_example"; // String | 
String searchQuery = "searchQuery_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
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
 **appNameId** | **String**|  |
 **searchQuery** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

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
String appNameId = "appNameId_example"; // String | 
String searchQuery = "searchQuery_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
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
 **appNameId** | **String**|  |
 **searchQuery** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
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
 **storeGroupId** | **Integer**|  |

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
StoreGroupBase storeGroup = new StoreGroupBase(); // StoreGroupBase | 
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
 **storeGroupId** | **Integer**|  |
 **storeGroup** | [**StoreGroupBase**](StoreGroupBase.md)|  |

### Return type

[**RestApiResultStoreGroupBase**](RestApiResultStoreGroupBase.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

