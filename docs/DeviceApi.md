# DeviceApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignDevice**](DeviceApi.md#assignDevice) | **POST** /api/v1.0/{appId}/devices/assign | Assign device to AppId. Device must have been enrolled before
[**enrollDevice**](DeviceApi.md#enrollDevice) | **POST** /api/v1.0/{appId}/devices/enroll | Enroll a new device - this returns a PIN code for actually assigning it later
[**getDeviceDetails**](DeviceApi.md#getDeviceDetails) | **GET** /api/v1.0/{appId}/devices/device/{deviceModel}/{deviceId} | Get details for a device by model and deviceid
[**searchDevices**](DeviceApi.md#searchDevices) | **GET** /api/v1.0/{appId}/devices/search | Search devices by AppId and optionally storeId


<a name="assignDevice"></a>
# **assignDevice**
> RestApiResultClientDeviceEnrollmentResult assignDevice(appId, assignDeviceRequest)

Assign device to AppId. Device must have been enrolled before

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id
ClientDeviceAssignEnrolledDevice assignDeviceRequest = new ClientDeviceAssignEnrolledDevice(); // ClientDeviceAssignEnrolledDevice | Assign request
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
 **appId** | **String**| App Id |
 **assignDeviceRequest** | [**ClientDeviceAssignEnrolledDevice**](ClientDeviceAssignEnrolledDevice.md)| Assign request |

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

Enroll a new device - this returns a PIN code for actually assigning it later

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id - not for the device, only for permission checking
ClientDeviceEnroll deviceEnrollmentRequest = new ClientDeviceEnroll(); // ClientDeviceEnroll | Request object for enrolling device
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
 **appId** | **String**| App Id - not for the device, only for permission checking |
 **deviceEnrollmentRequest** | [**ClientDeviceEnroll**](ClientDeviceEnroll.md)| Request object for enrolling device |

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

Get details for a device by model and deviceid

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id
String deviceModel = "deviceModel_example"; // String | Device Model
String deviceId = "deviceId_example"; // String | Device Id
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
 **appId** | **String**| App Id |
 **deviceModel** | **String**| Device Model |
 **deviceId** | **String**| Device Id |

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

Search devices by AppId and optionally storeId

[BETA - this endpoint is under development, do not use it in your production system]

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
String appId = "appId_example"; // String | App Id
Integer storeId = 56; // Integer | Store Id (optional)
String deviceModel = "deviceModel_example"; // String | Device Model (optional)
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
 **appId** | **String**| App Id |
 **storeId** | **Integer**| Store Id (optional) | [optional]
 **deviceModel** | **String**| Device Model (optional) | [optional]

### Return type

[**RestApiArrayResultClientDeviceSummary**](RestApiArrayResultClientDeviceSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

