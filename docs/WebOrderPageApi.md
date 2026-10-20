# WebOrderPageApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebOrderPage**](WebOrderPageApi.md#getWebOrderPage) | **GET** /api/v1.0/apps/{appId}/weborderpage | 
[**setWebOrderPage**](WebOrderPageApi.md#setWebOrderPage) | **POST** /api/v1.0/apps/{appId}/weborderpage | 


<a name="getWebOrderPage"></a>
# **getWebOrderPage**
> RestApiResultWebOrderPage getWebOrderPage(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebOrderPageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebOrderPageApi apiInstance = new WebOrderPageApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultWebOrderPage result = apiInstance.getWebOrderPage(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebOrderPageApi#getWebOrderPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultWebOrderPage**](RestApiResultWebOrderPage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setWebOrderPage"></a>
# **setWebOrderPage**
> setWebOrderPage(appId, setWebOrderPage)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebOrderPageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebOrderPageApi apiInstance = new WebOrderPageApi();
String appId = "appId_example"; // String | 
SetWebOrderPage setWebOrderPage = new SetWebOrderPage(); // SetWebOrderPage | 
try {
    apiInstance.setWebOrderPage(appId, setWebOrderPage);
} catch (ApiException e) {
    System.err.println("Exception when calling WebOrderPageApi#setWebOrderPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **setWebOrderPage** | [**SetWebOrderPage**](SetWebOrderPage.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

