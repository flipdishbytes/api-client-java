# KioskIotApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getKioskIotConnection**](KioskIotApi.md#getKioskIotConnection) | **POST** /api/v1.0/kioskiot/connect | 
[**queryTelemetrySeries**](KioskIotApi.md#queryTelemetrySeries) | **POST** /api/v1.0/{appId}/kioskiot/timeseries/query | 


<a name="getKioskIotConnection"></a>
# **getKioskIotConnection**
> RestApiResultKioskIotConnectionParameters getKioskIotConnection()



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

<a name="queryTelemetrySeries"></a>
# **queryTelemetrySeries**
> RestApiResultTelemetrySeriesResult queryTelemetrySeries(appId, queryParams)



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
String appId = "appId_example"; // String | 
TelemetrySeriesQueryParameters queryParams = new TelemetrySeriesQueryParameters(); // TelemetrySeriesQueryParameters | 
try {
    RestApiResultTelemetrySeriesResult result = apiInstance.queryTelemetrySeries(appId, queryParams);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskIotApi#queryTelemetrySeries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **queryParams** | [**TelemetrySeriesQueryParameters**](TelemetrySeriesQueryParameters.md)|  |

### Return type

[**RestApiResultTelemetrySeriesResult**](RestApiResultTelemetrySeriesResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

