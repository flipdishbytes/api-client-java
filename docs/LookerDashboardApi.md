# LookerDashboardApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lookerDashboardGetAll**](LookerDashboardApi.md#lookerDashboardGetAll) | **GET** /api/v1.0/{appId}/looker/dashboards | Get all dashboards


<a name="lookerDashboardGetAll"></a>
# **lookerDashboardGetAll**
> lookerDashboardGetAll(appId)

Get all dashboards

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LookerDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LookerDashboardApi apiInstance = new LookerDashboardApi();
String appId = "appId_example"; // String | 
try {
    apiInstance.lookerDashboardGetAll(appId);
} catch (ApiException e) {
    System.err.println("Exception when calling LookerDashboardApi#lookerDashboardGetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

