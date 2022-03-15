# ChannelsStoreMappingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**channelsGetStoreChannelStoreMapping**](ChannelsStoreMappingApi.md#channelsGetStoreChannelStoreMapping) | **GET** /api/v1.0/{appId}/channels/storemappings | 
[**channelsSetStoreChannelStoreMapping**](ChannelsStoreMappingApi.md#channelsSetStoreChannelStoreMapping) | **POST** /api/v1.0/{appId}/channels/storemappings | 


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
//import com.flipdish.apiclient.api.ChannelsStoreMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsStoreMappingApi apiInstance = new ChannelsStoreMappingApi();
String appId = "appId_example"; // String | 
Integer channelId = 56; // Integer | 
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
//import com.flipdish.apiclient.api.ChannelsStoreMappingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ChannelsStoreMappingApi apiInstance = new ChannelsStoreMappingApi();
String appId = "appId_example"; // String | 
Integer channelId = 56; // Integer | 
List<ChannelStoreMapping> stores = Arrays.asList(new ChannelStoreMapping()); // List<ChannelStoreMapping> | 
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

