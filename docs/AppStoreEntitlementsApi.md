# AppStoreEntitlementsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppStoreAppEntitlements**](AppStoreEntitlementsApi.md#getAppStoreAppEntitlements) | **GET** /api/v1.0/{appId}/appstore/apps/{appStoreAppId}/entitlements | 


<a name="getAppStoreAppEntitlements"></a>
# **getAppStoreAppEntitlements**
> RestApiResultAppStoreAppEntitlements getAppStoreAppEntitlements(appId, appStoreAppId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AppStoreEntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AppStoreEntitlementsApi apiInstance = new AppStoreEntitlementsApi();
String appId = "appId_example"; // String | 
String appStoreAppId = "appStoreAppId_example"; // String | 
try {
    RestApiResultAppStoreAppEntitlements result = apiInstance.getAppStoreAppEntitlements(appId, appStoreAppId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppStoreEntitlementsApi#getAppStoreAppEntitlements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appStoreAppId** | **String**|  |

### Return type

[**RestApiResultAppStoreAppEntitlements**](RestApiResultAppStoreAppEntitlements.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

