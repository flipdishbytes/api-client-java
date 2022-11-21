# IntercomApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userHash**](IntercomApi.md#userHash) | **GET** /api/v1.0/intercom/userHash | 


<a name="userHash"></a>
# **userHash**
> RestApiResultIntercomUserHash userHash()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.IntercomApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntercomApi apiInstance = new IntercomApi();
try {
    RestApiResultIntercomUserHash result = apiInstance.userHash();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntercomApi#userHash");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultIntercomUserHash**](RestApiResultIntercomUserHash.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

