# ChannelsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachStoreToSalesChannel**](ChannelsApi.md#attachStoreToSalesChannel) | **POST** /api/v1.0/{appId}/channels/{channelId}/stores/{storeId} | Attachs the specified store to the given sales channel.
[**detachAllStoresFromSalesChannel**](ChannelsApi.md#detachAllStoresFromSalesChannel) | **DELETE** /api/v1.0/{appId}/channels/{channelId}/stores | Detaches all the stores from the given sales channel.
[**detachStoreFromSalesChannel**](ChannelsApi.md#detachStoreFromSalesChannel) | **DELETE** /api/v1.0/{appId}/channels/{channelId}/stores/{storeId} | Detaches the specified store from the given sales channel.
[**getChannel**](ChannelsApi.md#getChannel) | **GET** /api/v1.0/{appId}/channels/{id} | 
[**getChannels**](ChannelsApi.md#getChannels) | **GET** /api/v1.0/{appId}/channels | 
[**getStoresBySalesChannel**](ChannelsApi.md#getStoresBySalesChannel) | **GET** /api/v1.0/{appId}/channels/{channelId}/stores | Returns a list of store ids attached to the given channel type for the specified app.


<a name="attachStoreToSalesChannel"></a>
# **attachStoreToSalesChannel**
> Object attachStoreToSalesChannel(appId, channelId, storeId)

Attachs the specified store to the given sales channel.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
String appId = "appId_example"; // String | Application Id (AppNameId)
Integer channelId = 56; // Integer | Type of sales channel (Android, IOS, Web, etc.)
Integer storeId = 56; // Integer | Store Id (Phyisical Restaurant) to attach.
try {
    Object result = apiInstance.attachStoreToSalesChannel(appId, channelId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#attachStoreToSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameId) |
 **channelId** | **Integer**| Type of sales channel (Android, IOS, Web, etc.) |
 **storeId** | **Integer**| Store Id (Phyisical Restaurant) to attach. |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="detachAllStoresFromSalesChannel"></a>
# **detachAllStoresFromSalesChannel**
> Object detachAllStoresFromSalesChannel(appId, channelId)

Detaches all the stores from the given sales channel.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
String appId = "appId_example"; // String | Application Id (AppNameId)
Integer channelId = 56; // Integer | Type of sales channel (Android, IOS, Web, etc.)
try {
    Object result = apiInstance.detachAllStoresFromSalesChannel(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#detachAllStoresFromSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameId) |
 **channelId** | **Integer**| Type of sales channel (Android, IOS, Web, etc.) |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="detachStoreFromSalesChannel"></a>
# **detachStoreFromSalesChannel**
> Object detachStoreFromSalesChannel(appId, channelId, storeId)

Detaches the specified store from the given sales channel.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
String appId = "appId_example"; // String | Application Id (AppNameId)
Integer channelId = 56; // Integer | Type of sales channel (Android, IOS, Web, etc.)
Integer storeId = 56; // Integer | Store Id (Phyisical Restaurant) to detach.
try {
    Object result = apiInstance.detachStoreFromSalesChannel(appId, channelId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#detachStoreFromSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameId) |
 **channelId** | **Integer**| Type of sales channel (Android, IOS, Web, etc.) |
 **storeId** | **Integer**| Store Id (Phyisical Restaurant) to detach. |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getChannel"></a>
# **getChannel**
> RestApiPaginationResultChannel getChannel(id, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
Integer id = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    RestApiPaginationResultChannel result = apiInstance.getChannel(id, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **appId** | **String**|  |

### Return type

[**RestApiPaginationResultChannel**](RestApiPaginationResultChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getChannels"></a>
# **getChannels**
> RestApiPaginationResultChannel getChannels(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
String appId = "appId_example"; // String | 
try {
    RestApiPaginationResultChannel result = apiInstance.getChannels(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiPaginationResultChannel**](RestApiPaginationResultChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoresBySalesChannel"></a>
# **getStoresBySalesChannel**
> Response getStoresBySalesChannel(appId, channelId)

Returns a list of store ids attached to the given channel type for the specified app.

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsApi apiInstance = new ChannelsApi();
String appId = "appId_example"; // String | Application Id (AppNameId)
Integer channelId = 56; // Integer | Type of sales channel (Android, IOS, Web, etc.)
try {
    Response result = apiInstance.getStoresBySalesChannel(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getStoresBySalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameId) |
 **channelId** | **Integer**| Type of sales channel (Android, IOS, Web, etc.) |

### Return type

[**Response**](Response.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

