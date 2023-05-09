# UsersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPreviousOrderCountForStore**](UsersApi.md#getPreviousOrderCountForStore) | **GET** /api/v1.0/users/{userId}/previousordercount/{storeId} | 
[**getRoles**](UsersApi.md#getRoles) | **GET** /api/v1.0/users/roles | 


<a name="getPreviousOrderCountForStore"></a>
# **getPreviousOrderCountForStore**
> RestApiStringResult getPreviousOrderCountForStore(userId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer storeId = 56; // Integer | 
try {
    RestApiStringResult result = apiInstance.getPreviousOrderCountForStore(userId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getPreviousOrderCountForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRoles"></a>
# **getRoles**
> RestApiStringArrayResult getRoles()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    RestApiStringArrayResult result = apiInstance.getRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

