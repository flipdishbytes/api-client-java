# HttpRequestResponseLogsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogs**](HttpRequestResponseLogsApi.md#getLogs) | **GET** /api/v1.0/{appId}/interactions/logs | 


<a name="getLogs"></a>
# **getLogs**
> RestApiPaginationResultHttpRequestAndResponseLog getLogs(start, end, appId, filterByUserId, guid, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HttpRequestResponseLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HttpRequestResponseLogsApi apiInstance = new HttpRequestResponseLogsApi();
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | 
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | 
String appId = "appId_example"; // String | 
Integer filterByUserId = 56; // Integer | 
String guid = "guid_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultHttpRequestAndResponseLog result = apiInstance.getLogs(start, end, appId, filterByUserId, guid, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HttpRequestResponseLogsApi#getLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **OffsetDateTime**|  |
 **end** | **OffsetDateTime**|  |
 **appId** | **String**|  |
 **filterByUserId** | **Integer**|  | [optional]
 **guid** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultHttpRequestAndResponseLog**](RestApiPaginationResultHttpRequestAndResponseLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

