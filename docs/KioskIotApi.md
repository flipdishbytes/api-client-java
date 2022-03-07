# KioskIotApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getKioskIotConnection**](KioskIotApi.md#getKioskIotConnection) | **POST** /api/v1.0/kioskiot/connect | Get the IoT connection parameters for telemetry and commands  No input parameters since authenticated hydra user defines context


<a name="getKioskIotConnection"></a>
# **getKioskIotConnection**
> RestApiResultKioskIotConnectionParameters getKioskIotConnection()

Get the IoT connection parameters for telemetry and commands  No input parameters since authenticated hydra user defines context

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.KioskIotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

KioskIotApi apiInstance = new KioskIotApi();
try {
    RestApiResultKioskIotConnectionParameters result = apiInstance.getKioskIotConnection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskIotApi#getKioskIotConnection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultKioskIotConnectionParameters**](RestApiResultKioskIotConnectionParameters.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

