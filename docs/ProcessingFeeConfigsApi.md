# ProcessingFeeConfigsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessingFeeConfigsByStoreIds**](ProcessingFeeConfigsApi.md#getProcessingFeeConfigsByStoreIds) | **GET** /api/v1.0/processingfeeconfigs | 


<a name="getProcessingFeeConfigsByStoreIds"></a>
# **getProcessingFeeConfigsByStoreIds**
> RestApiArrayResultProcessingFeeConfig getProcessingFeeConfigsByStoreIds(storeIds)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ProcessingFeeConfigsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ProcessingFeeConfigsApi apiInstance = new ProcessingFeeConfigsApi();
List<Integer> storeIds = Arrays.asList(56); // List<Integer> | 
try {
    RestApiArrayResultProcessingFeeConfig result = apiInstance.getProcessingFeeConfigsByStoreIds(storeIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessingFeeConfigsApi#getProcessingFeeConfigsByStoreIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeIds** | [**List&lt;Integer&gt;**](Integer.md)|  |

### Return type

[**RestApiArrayResultProcessingFeeConfig**](RestApiArrayResultProcessingFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

