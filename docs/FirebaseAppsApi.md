# FirebaseAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFirebaseApp**](FirebaseAppsApi.md#addFirebaseApp) | **POST** /api/v1.0/FirebaseApp | 
[**deleteFirebaseApp**](FirebaseAppsApi.md#deleteFirebaseApp) | **DELETE** /api/v1.0/FirebaseApp/{whiteLabelId} | 
[**getFirebaseApp**](FirebaseAppsApi.md#getFirebaseApp) | **GET** /api/v1.0/FirebaseApp/{whitelabelId} | 


<a name="addFirebaseApp"></a>
# **addFirebaseApp**
> Object addFirebaseApp(firebaseApp)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FirebaseAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FirebaseAppsApi apiInstance = new FirebaseAppsApi();
FirebaseApp firebaseApp = new FirebaseApp(); // FirebaseApp | 
try {
    Object result = apiInstance.addFirebaseApp(firebaseApp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#addFirebaseApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firebaseApp** | [**FirebaseApp**](FirebaseApp.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteFirebaseApp"></a>
# **deleteFirebaseApp**
> Object deleteFirebaseApp(whiteLabelId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FirebaseAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FirebaseAppsApi apiInstance = new FirebaseAppsApi();
Integer whiteLabelId = 56; // Integer | 
try {
    Object result = apiInstance.deleteFirebaseApp(whiteLabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#deleteFirebaseApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whiteLabelId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getFirebaseApp"></a>
# **getFirebaseApp**
> getFirebaseApp(whitelabelId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.FirebaseAppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FirebaseAppsApi apiInstance = new FirebaseAppsApi();
Integer whitelabelId = 56; // Integer | 
try {
    apiInstance.getFirebaseApp(whitelabelId);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#getFirebaseApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelabelId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

