# FilesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /api/v1.0/{appId}/files/download/{fileId} | 


<a name="downloadFile"></a>
# **downloadFile**
> String downloadFile(appId, fileId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String appId = "appId_example"; // String | 
String fileId = "fileId_example"; // String | 
try {
    String result = apiInstance.downloadFile(appId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **fileId** | **String**|  |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

