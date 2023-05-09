# DeviceApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDevice**](DeviceApi.md#assignDevice) | **POST** /api/v1.0/{appId}/devices/assign | 
[**enrollDevice**](DeviceApi.md#enrollDevice) | **POST** /api/v1.0/{appId}/devices/enroll | 
[**getDeviceDetails**](DeviceApi.md#getDeviceDetails) | **GET** /api/v1.0/{appId}/devices/device/{deviceModel}/{deviceId} | 
[**searchDevices**](DeviceApi.md#searchDevices) | **GET** /api/v1.0/{appId}/devices/search | 


<a name="assignDevice"></a>
# **assignDevice**
> RestApiResultClientDeviceEnrollmentResult assignDevice(appId, assignDeviceRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeviceApi apiInstance = new DeviceApi();
String appId = "appId_example"; // String | 
ClientDeviceAssignEnrolledDevice assignDeviceRequest = new ClientDeviceAssignEnrolledDevice(); // ClientDeviceAssignEnrolledDevice | 
try {
    RestApiResultClientDeviceEnrollmentResult result = apiInstance.assignDevice(appId, assignDeviceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#assignDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **assignDeviceRequest** | [**ClientDeviceAssignEnrolledDevice**](ClientDeviceAssignEnrolledDevice.md)|  |

### Return type

[**RestApiResultClientDeviceEnrollmentResult**](RestApiResultClientDeviceEnrollmentResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="enrollDevice"></a>
# **enrollDevice**
> RestApiResultClientDeviceEnrollmentResult enrollDevice(appId, deviceEnrollmentRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeviceApi apiInstance = new DeviceApi();
String appId = "appId_example"; // String | 
ClientDeviceEnroll deviceEnrollmentRequest = new ClientDeviceEnroll(); // ClientDeviceEnroll | 
try {
    RestApiResultClientDeviceEnrollmentResult result = apiInstance.enrollDevice(appId, deviceEnrollmentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#enrollDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceEnrollmentRequest** | [**ClientDeviceEnroll**](ClientDeviceEnroll.md)|  |

### Return type

[**RestApiResultClientDeviceEnrollmentResult**](RestApiResultClientDeviceEnrollmentResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getDeviceDetails"></a>
# **getDeviceDetails**
> RestApiResultClientDevice getDeviceDetails(appId, deviceModel, deviceId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeviceApi apiInstance = new DeviceApi();
String appId = "appId_example"; // String | 
String deviceModel = "deviceModel_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiResultClientDevice result = apiInstance.getDeviceDetails(appId, deviceModel, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#getDeviceDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceModel** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiResultClientDevice**](RestApiResultClientDevice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchDevices"></a>
# **searchDevices**
> RestApiArrayResultClientDeviceSummary searchDevices(appId, storeId, deviceModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DeviceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DeviceApi apiInstance = new DeviceApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String deviceModel = "deviceModel_example"; // String | 
try {
    RestApiArrayResultClientDeviceSummary result = apiInstance.searchDevices(appId, storeId, deviceModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#searchDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  | [optional]
 **deviceModel** | **String**|  | [optional]

### Return type

[**RestApiArrayResultClientDeviceSummary**](RestApiArrayResultClientDeviceSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

