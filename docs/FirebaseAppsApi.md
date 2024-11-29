# FirebaseAppsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**firebaseAppsAddFirebaseApp**](FirebaseAppsApi.md#firebaseAppsAddFirebaseApp) | **POST** /api/v1.0/FirebaseApp | 
[**firebaseAppsDeleteFirebaseApp**](FirebaseAppsApi.md#firebaseAppsDeleteFirebaseApp) | **DELETE** /api/v1.0/FirebaseApp/{whiteLabelId} | 
[**firebaseAppsGetFirebaseApp**](FirebaseAppsApi.md#firebaseAppsGetFirebaseApp) | **GET** /api/v1.0/FirebaseApp/{whitelabelId} | 


<a name="firebaseAppsAddFirebaseApp"></a>
# **firebaseAppsAddFirebaseApp**
> Object firebaseAppsAddFirebaseApp(firebaseApp)



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
    Object result = apiInstance.firebaseAppsAddFirebaseApp(firebaseApp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#firebaseAppsAddFirebaseApp");
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

<a name="firebaseAppsDeleteFirebaseApp"></a>
# **firebaseAppsDeleteFirebaseApp**
> Object firebaseAppsDeleteFirebaseApp(whiteLabelId)



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
    Object result = apiInstance.firebaseAppsDeleteFirebaseApp(whiteLabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#firebaseAppsDeleteFirebaseApp");
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

<a name="firebaseAppsGetFirebaseApp"></a>
# **firebaseAppsGetFirebaseApp**
> Object firebaseAppsGetFirebaseApp(whitelabelId)



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
    Object result = apiInstance.firebaseAppsGetFirebaseApp(whitelabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirebaseAppsApi#firebaseAppsGetFirebaseApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelabelId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

