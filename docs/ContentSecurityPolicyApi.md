# ContentSecurityPolicyApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contentSecurityPolicyReport**](ContentSecurityPolicyApi.md#contentSecurityPolicyReport) | **POST** /api/v1.0/csp/report | 


<a name="contentSecurityPolicyReport"></a>
# **contentSecurityPolicyReport**
> Object contentSecurityPolicyReport(request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ContentSecurityPolicyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ContentSecurityPolicyApi apiInstance = new ContentSecurityPolicyApi();
CspReportRequest request = new CspReportRequest(); // CspReportRequest | 
try {
    Object result = apiInstance.contentSecurityPolicyReport(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentSecurityPolicyApi#contentSecurityPolicyReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CspReportRequest**](CspReportRequest.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

