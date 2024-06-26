# KioskEntitlementsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryKioskEntitlements**](KioskEntitlementsApi.md#queryKioskEntitlements) | **GET** /api/v1.0/{appId}/kiosk/entitlements | 


<a name="queryKioskEntitlements"></a>
# **queryKioskEntitlements**
> RestApiResultKioskEntitlementsResult queryKioskEntitlements(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.KioskEntitlementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

KioskEntitlementsApi apiInstance = new KioskEntitlementsApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultKioskEntitlementsResult result = apiInstance.queryKioskEntitlements(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskEntitlementsApi#queryKioskEntitlements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultKioskEntitlementsResult**](RestApiResultKioskEntitlementsResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

