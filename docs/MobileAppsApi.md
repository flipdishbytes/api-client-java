# MobileAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editAppConfigSalesChannel**](MobileAppsApi.md#editAppConfigSalesChannel) | **POST** /api/v1.0/mobileapps/{appId}/submission | Submission form mobile apps
[**editAppConfigSalesChannel_0**](MobileAppsApi.md#editAppConfigSalesChannel_0) | **POST** /api/v1.0/mobileapps/{appId}/saleschannel | Set the application sales channel configuration


<a name="editAppConfigSalesChannel"></a>
# **editAppConfigSalesChannel**
> RestApiResultAppConfigSalesChannel editAppConfigSalesChannel(appId, mobileAppsSubmission)

Submission form mobile apps

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
MobileAppsSubmission mobileAppsSubmission = new MobileAppsSubmission(); // MobileAppsSubmission | 
try {
    RestApiResultAppConfigSalesChannel result = apiInstance.editAppConfigSalesChannel(appId, mobileAppsSubmission);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#editAppConfigSalesChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **mobileAppsSubmission** | [**MobileAppsSubmission**](MobileAppsSubmission.md)|  |

### Return type

[**RestApiResultAppConfigSalesChannel**](RestApiResultAppConfigSalesChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editAppConfigSalesChannel_0"></a>
# **editAppConfigSalesChannel_0**
> RestApiResultAppConfigSalesChannel editAppConfigSalesChannel_0(appId, appConfigSalesChannel)

Set the application sales channel configuration

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.MobileAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

MobileAppsApi apiInstance = new MobileAppsApi();
String appId = "appId_example"; // String | 
AppConfigSalesChannel appConfigSalesChannel = new AppConfigSalesChannel(); // AppConfigSalesChannel | 
try {
    RestApiResultAppConfigSalesChannel result = apiInstance.editAppConfigSalesChannel_0(appId, appConfigSalesChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MobileAppsApi#editAppConfigSalesChannel_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **appConfigSalesChannel** | [**AppConfigSalesChannel**](AppConfigSalesChannel.md)|  |

### Return type

[**RestApiResultAppConfigSalesChannel**](RestApiResultAppConfigSalesChannel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml
