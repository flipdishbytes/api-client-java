# HttpRequestResponseLogsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogs**](HttpRequestResponseLogsApi.md#getLogs) | **GET** /api/v1.0/{appId}/interactions/logs | Get API interaction logs


<a name="getLogs"></a>
# **getLogs**
> RestApiPaginationResultHttpRequestAndResponseLog getLogs(start, end, appId, filterByUserId, guid, page, limit)

Get API interaction logs

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
OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Start date time
OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | End date time
String appId = "appId_example"; // String | 
Integer filterByUserId = 56; // Integer | User id (optional)
String guid = "guid_example"; // String | Id of the log
Integer page = 56; // Integer | Page number
Integer limit = 56; // Integer | Page size
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
 **start** | **OffsetDateTime**| Start date time |
 **end** | **OffsetDateTime**| End date time |
 **appId** | **String**|  |
 **filterByUserId** | **Integer**| User id (optional) | [optional]
 **guid** | **String**| Id of the log | [optional]
 **page** | **Integer**| Page number | [optional]
 **limit** | **Integer**| Page size | [optional]

### Return type

[**RestApiPaginationResultHttpRequestAndResponseLog**](RestApiPaginationResultHttpRequestAndResponseLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

