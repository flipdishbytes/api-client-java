# LookerSingleSignOnApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSSOEndpoint**](LookerSingleSignOnApi.md#getSSOEndpoint) | **GET** /api/v1.0/{appId}/looker/sso | 


<a name="getSSOEndpoint"></a>
# **getSSOEndpoint**
> DashboardEmbed getSSOEndpoint(appId, embedPath, filters)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LookerSingleSignOnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LookerSingleSignOnApi apiInstance = new LookerSingleSignOnApi();
String appId = "appId_example"; // String | 
String embedPath = "embedPath_example"; // String | 
String filters = "filters_example"; // String | 
try {
    DashboardEmbed result = apiInstance.getSSOEndpoint(appId, embedPath, filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookerSingleSignOnApi#getSSOEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **embedPath** | **String**|  |
 **filters** | **String**|  | [optional]

### Return type

[**DashboardEmbed**](DashboardEmbed.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

