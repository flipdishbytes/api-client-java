# WhiteLabelContactFormTypeApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppContactFormType**](WhiteLabelContactFormTypeApi.md#getAppContactFormType) | **GET** /api/v1.0/whitelabelconfig/{appId}/contact-form-type | 
[**updateAppContactFormType**](WhiteLabelContactFormTypeApi.md#updateAppContactFormType) | **POST** /api/v1.0/whitelabelconfig/{appId}/contact-form-type | 


<a name="getAppContactFormType"></a>
# **getAppContactFormType**
> RestApiResultContactFormTypeConfigModel getAppContactFormType(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelContactFormTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelContactFormTypeApi apiInstance = new WhiteLabelContactFormTypeApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultContactFormTypeConfigModel result = apiInstance.getAppContactFormType(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelContactFormTypeApi#getAppContactFormType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultContactFormTypeConfigModel**](RestApiResultContactFormTypeConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAppContactFormType"></a>
# **updateAppContactFormType**
> RestApiResultContactFormTypeConfigModel updateAppContactFormType(appId, contactFormTypeConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WhiteLabelContactFormTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WhiteLabelContactFormTypeApi apiInstance = new WhiteLabelContactFormTypeApi();
String appId = "appId_example"; // String | 
ContactFormTypeConfigModel contactFormTypeConfig = new ContactFormTypeConfigModel(); // ContactFormTypeConfigModel | 
try {
    RestApiResultContactFormTypeConfigModel result = apiInstance.updateAppContactFormType(appId, contactFormTypeConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WhiteLabelContactFormTypeApi#updateAppContactFormType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **contactFormTypeConfig** | [**ContactFormTypeConfigModel**](ContactFormTypeConfigModel.md)|  |

### Return type

[**RestApiResultContactFormTypeConfigModel**](RestApiResultContactFormTypeConfigModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

