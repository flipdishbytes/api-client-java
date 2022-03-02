# ChannelsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignAppIdToSalesChannel**](ChannelsApi.md#assignAppIdToSalesChannel) | **POST** /api/v1.0/{appId}/channels/{channelId}/assign-appId | Assign a given AppId to a Sales Channel
[**assignStoreToChannel**](ChannelsApi.md#assignStoreToChannel) | **POST** /api/v1.0/{appId}/channels/assign-store | Assign a Store to a Sales Channel
[**assignStoreToChannel_0**](ChannelsApi.md#assignStoreToChannel_0) | **POST** /api/v1.0/{appId}/channels/unassign-store | Unassign a Store from a Sales Channel
[**attachStoreToSalesChannel**](ChannelsApi.md#attachStoreToSalesChannel) | **POST** /api/v1.0/{appId}/channels/{channelId}/stores/{storeId} | Attachs the specified store to the given sales channel.
[**channelsGetStoreChannelStoreMapping**](ChannelsApi.md#channelsGetStoreChannelStoreMapping) | **GET** /api/v1.0/{appId}/channels/channelstores | 
[**channelsSetStoreChannelStoreMapping**](ChannelsApi.md#channelsSetStoreChannelStoreMapping) | **POST** /api/v1.0/{appId}/channels/channelstores | 
[**detachAllStoresFromSalesChannel**](ChannelsApi.md#detachAllStoresFromSalesChannel) | **DELETE** /api/v1.0/{appId}/channels/{channelId}/stores | Detaches all the stores from the given sales channel.
[**detachStoreFromSalesChannel**](ChannelsApi.md#detachStoreFromSalesChannel) | **DELETE** /api/v1.0/{appId}/channels/{channelId}/stores/{storeId} | Detaches the specified store from the given sales channel.
[**getAssignedChannels**](ChannelsApi.md#getAssignedChannels) | **GET** /api/v1.0/{appId}/channels/assigned-channels | Returns a list of sales channels that are assigned to a given whitelabel
[**getChannel**](ChannelsApi.md#getChannel) | **GET** /api/v1.0/{appId}/channels/{id} | 
[**getChannels**](ChannelsApi.md#getChannels) | **GET** /api/v1.0/{appId}/channels | 
[**getNotAssignedChannels**](ChannelsApi.md#getNotAssignedChannels) | **GET** /api/v1.0/{appId}/channels/available-channels | Returns a list of sales channels that are not yet assigned to a given whitelabel
[**getStoresAssignedToChannel**](ChannelsApi.md#getStoresAssignedToChannel) | **GET** /api/v1.0/{appId}/channels/{channelId}/assigned-stores | Returns a list of store that are assigned to the given sales channel.
[**getStoresBySalesChannel**](ChannelsApi.md#getStoresBySalesChannel) | **GET** /api/v1.0/{appId}/channels/{channelId}/stores | Returns a list of store ids attached to the given channel type for the specified app.


<a name="assignAppIdToSalesChannel"></a>
# **assignAppIdToSalesChannel**
> Object assignAppIdToSalesChannel(appId, channelId)

Assign a given AppId to a Sales Channel

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
String appId = "appId_example"; // String | Application Id (AppNameIdxxx)
Integer channelId = 56; // Integer | Channel Id (123, 456)
try {
    Object result = apiInstance.assignAppIdToSalesChannel(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#assignAppIdToSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameIdxxx) |
 **channelId** | **Integer**| Channel Id (123, 456) |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="assignStoreToChannel"></a>
# **assignStoreToChannel**
> Object assignStoreToChannel(storeId, appId, channelId)

Assign a Store to a Sales Channel

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
Integer storeId = 56; // Integer | Store Id (123, 456)
String appId = "appId_example"; // String | AppId (AppNameIdxxx)
Integer channelId = 56; // Integer | Channel Id (123, 456)
try {
    Object result = apiInstance.assignStoreToChannel(storeId, appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#assignStoreToChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store Id (123, 456) |
 **appId** | **String**| AppId (AppNameIdxxx) |
 **channelId** | **Integer**| Channel Id (123, 456) |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="assignStoreToChannel_0"></a>
# **assignStoreToChannel_0**
> Object assignStoreToChannel_0(storeId, appId, channelId)

Unassign a Store from a Sales Channel

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
Integer storeId = 56; // Integer | Store Id (123, 456)
String appId = "appId_example"; // String | AppId (AppNameIdxxx)
Integer channelId = 56; // Integer | Channel Id (123, 456)
try {
    Object result = apiInstance.assignStoreToChannel_0(storeId, appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#assignStoreToChannel_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store Id (123, 456) |
 **appId** | **String**| AppId (AppNameIdxxx) |
 **channelId** | **Integer**| Channel Id (123, 456) |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

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

<a name="channelsGetStoreChannelStoreMapping"></a>
# **channelsGetStoreChannelStoreMapping**
> RestApiArrayResultStoreChannelStoreMapping channelsGetStoreChannelStoreMapping(appId, channelId)



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
Integer channelId = 56; // Integer | 
try {
    RestApiArrayResultStoreChannelStoreMapping result = apiInstance.channelsGetStoreChannelStoreMapping(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#channelsGetStoreChannelStoreMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **channelId** | **Integer**|  |

### Return type

[**RestApiArrayResultStoreChannelStoreMapping**](RestApiArrayResultStoreChannelStoreMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="channelsSetStoreChannelStoreMapping"></a>
# **channelsSetStoreChannelStoreMapping**
> RestApiArrayResultStoreChannelStoreMapping channelsSetStoreChannelStoreMapping(appId, channelId, stores)



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
Integer channelId = 56; // Integer | 
List<ChannelStoreMapping> stores = Arrays.asList(new ChannelStoreMapping()); // List<ChannelStoreMapping> | 
try {
    RestApiArrayResultStoreChannelStoreMapping result = apiInstance.channelsSetStoreChannelStoreMapping(appId, channelId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#channelsSetStoreChannelStoreMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **channelId** | **Integer**|  |
 **stores** | [**List&lt;ChannelStoreMapping&gt;**](ChannelStoreMapping.md)|  |

### Return type

[**RestApiArrayResultStoreChannelStoreMapping**](RestApiArrayResultStoreChannelStoreMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
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

<a name="getAssignedChannels"></a>
# **getAssignedChannels**
> Object getAssignedChannels(appId)

Returns a list of sales channels that are assigned to a given whitelabel

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
String appId = "appId_example"; // String | Application Id (AppNameIdxxx)
try {
    Object result = apiInstance.getAssignedChannels(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getAssignedChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameIdxxx) |

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

<a name="getNotAssignedChannels"></a>
# **getNotAssignedChannels**
> Object getNotAssignedChannels(appId)

Returns a list of sales channels that are not yet assigned to a given whitelabel

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
String appId = "appId_example"; // String | Application Id (AppNameIdxxx)
try {
    Object result = apiInstance.getNotAssignedChannels(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getNotAssignedChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameIdxxx) |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoresAssignedToChannel"></a>
# **getStoresAssignedToChannel**
> Object getStoresAssignedToChannel(appId, channelId)

Returns a list of store that are assigned to the given sales channel.

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
Integer channelId = 56; // Integer | Sales channel (Android, IOS, Web, etc.)
try {
    Object result = apiInstance.getStoresAssignedToChannel(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsApi#getStoresAssignedToChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Application Id (AppNameId) |
 **channelId** | **Integer**| Sales channel (Android, IOS, Web, etc.) |

### Return type

**Object**

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

