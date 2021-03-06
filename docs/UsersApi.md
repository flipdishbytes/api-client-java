# UsersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRoles**](UsersApi.md#getRoles) | **GET** /api/v1.0/users/roles | Get role names


<a name="getRoles"></a>
# **getRoles**
> RestApiStringArrayResult getRoles()

Get role names

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

