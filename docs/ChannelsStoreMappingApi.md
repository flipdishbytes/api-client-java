# ChannelsStoreMappingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**channelsGetStoreChannelStoreMapping**](ChannelsStoreMappingApi.md#channelsGetStoreChannelStoreMapping) | **GET** /api/v1.0/{appId}/channels/storemappings | Gets the relationship between Flipdish Store and Channel Store
[**channelsSetStoreChannelStoreMapping**](ChannelsStoreMappingApi.md#channelsSetStoreChannelStoreMapping) | **POST** /api/v1.0/{appId}/channels/storemappings | Sets the relationship between Flipdish Store and Channel Store


<a name="channelsGetStoreChannelStoreMapping"></a>
# **channelsGetStoreChannelStoreMapping**
> RestApiArrayResultStoreChannelStoreMapping channelsGetStoreChannelStoreMapping(appId, channelId)

Gets the relationship between Flipdish Store and Channel Store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsStoreMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsStoreMappingApi apiInstance = new ChannelsStoreMappingApi();
String appId = "appId_example"; // String | Flipdish App Name Id
Integer channelId = 56; // Integer | Flipdish Channel ID
try {
    RestApiArrayResultStoreChannelStoreMapping result = apiInstance.channelsGetStoreChannelStoreMapping(appId, channelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsStoreMappingApi#channelsGetStoreChannelStoreMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Flipdish App Name Id |
 **channelId** | **Integer**| Flipdish Channel ID |

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

Sets the relationship between Flipdish Store and Channel Store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ChannelsStoreMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsStoreMappingApi apiInstance = new ChannelsStoreMappingApi();
String appId = "appId_example"; // String | Flipdish App Name Id
Integer channelId = 56; // Integer | Flipdish Channel ID
List<ChannelStoreMapping> stores = Arrays.asList(new ChannelStoreMapping()); // List<ChannelStoreMapping> | Flipdish and Channel Store configuration
try {
    RestApiArrayResultStoreChannelStoreMapping result = apiInstance.channelsSetStoreChannelStoreMapping(appId, channelId, stores);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelsStoreMappingApi#channelsSetStoreChannelStoreMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| Flipdish App Name Id |
 **channelId** | **Integer**| Flipdish Channel ID |
 **stores** | [**List&lt;ChannelStoreMapping&gt;**](ChannelStoreMapping.md)| Flipdish and Channel Store configuration |

### Return type

[**RestApiArrayResultStoreChannelStoreMapping**](RestApiArrayResultStoreChannelStoreMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

