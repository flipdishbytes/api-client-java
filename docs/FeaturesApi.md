# FeaturesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableFeatures**](FeaturesApi.md#disableFeatures) | **POST** /api/v1.0/{appId}/features/disable | 
[**enableFeatures**](FeaturesApi.md#enableFeatures) | **POST** /api/v1.0/{appId}/features/enable | 


<a name="disableFeatures"></a>
# **disableFeatures**
> RestApiStringArrayResult disableFeatures(appId, features)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FeaturesApi apiInstance = new FeaturesApi();
String appId = "appId_example"; // String | 
List<String> features = Arrays.asList(new List<String>()); // List<String> | 
try {
    RestApiStringArrayResult result = apiInstance.disableFeatures(appId, features);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeaturesApi#disableFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **features** | **List&lt;String&gt;**|  |

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="enableFeatures"></a>
# **enableFeatures**
> RestApiStringArrayResult enableFeatures(appId, features)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FeaturesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FeaturesApi apiInstance = new FeaturesApi();
String appId = "appId_example"; // String | 
List<String> features = Arrays.asList(new List<String>()); // List<String> | 
try {
    RestApiStringArrayResult result = apiInstance.enableFeatures(appId, features);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeaturesApi#enableFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **features** | **List&lt;String&gt;**|  |

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

