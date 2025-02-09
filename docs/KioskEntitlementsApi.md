# KioskEntitlementsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryKioskEntitlementsByOrgId**](KioskEntitlementsApi.md#queryKioskEntitlementsByOrgId) | **GET** /api/v1.0/orgs/{orgId}/kiosk/entitlements | 


<a name="queryKioskEntitlementsByOrgId"></a>
# **queryKioskEntitlementsByOrgId**
> RestApiResultKioskEntitlementsResult queryKioskEntitlementsByOrgId(orgId)



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
String orgId = "orgId_example"; // String | 
try {
    RestApiResultKioskEntitlementsResult result = apiInstance.queryKioskEntitlementsByOrgId(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskEntitlementsApi#queryKioskEntitlementsByOrgId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **String**|  |

### Return type

[**RestApiResultKioskEntitlementsResult**](RestApiResultKioskEntitlementsResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

