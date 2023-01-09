# HydraApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignEmv**](HydraApi.md#assignEmv) | **POST** /api/v1.0/{appId}/hydra/emvterminal/assign/{hydraConfigId}/{emvTerminalId} | Assign an EMV terminal to a kiosk
[**attachStoreToKiosk**](HydraApi.md#attachStoreToKiosk) | **POST** /api/v1.0/{appId}/AttachStoreToKiosk/{deviceId}/store/{storeId} | [Private]
[**attachStoreToTerminal**](HydraApi.md#attachStoreToTerminal) | **POST** /api/v1.0/{appId}/hydra/{deviceId}/attach/{storeId} | [Private]
[**cancelEmvPayment**](HydraApi.md#cancelEmvPayment) | **POST** /api/v1.0/{appId}/hydra/cancelemvpayment/{orderId} | 
[**detachStoreFromTerminal**](HydraApi.md#detachStoreFromTerminal) | **POST** /api/v1.0/{appId}/hydra/{deviceId}/detach/{storeId} | [Private]
[**getAttachedDevice**](HydraApi.md#getAttachedDevice) | **GET** /api/v1.0/{appId}/hydra/{deviceType}/{deviceId} | [Private]
[**getAttachedDevices**](HydraApi.md#getAttachedDevices) | **GET** /api/v1.0/{appId}/hydra/{deviceType}/list | [Private]
[**getEMVTerminalDetails**](HydraApi.md#getEMVTerminalDetails) | **GET** /api/v1.0/{appId}/hydra/emvterminal | [Private]
[**getEmvOrderState**](HydraApi.md#getEmvOrderState) | **GET** /api/v1.0/{appId}/hydra/emvorderstate/{orderId} | [Private]
[**getKioskCashPaymentSettings**](HydraApi.md#getKioskCashPaymentSettings) | **GET** /api/v1.0/{appId}/kioskcashsettings/{deviceId} | Get the status of Cash Payment Method on Kiosk
[**getRegistration**](HydraApi.md#getRegistration) | **GET** /api/v1.0/hydra/registration | 
[**getSettings**](HydraApi.md#getSettings) | **GET** /api/v1.0/hydra/settings | [Private]
[**hydraCreateEmv**](HydraApi.md#hydraCreateEmv) | **POST** /api/v1.0/{appId}/emvterminals | [Private]
[**hydraDeleteEmv**](HydraApi.md#hydraDeleteEmv) | **DELETE** /api/v1.0/{appId}/emvterminals/{id} | [Private]
[**hydraDetachStoreFromKiosk**](HydraApi.md#hydraDetachStoreFromKiosk) | **DELETE** /api/v1.0/{appId}/DetachStoreFromKiosk/{deviceId}/store/{storeId} | [Private]
[**hydraGetEmvsForAppId**](HydraApi.md#hydraGetEmvsForAppId) | **GET** /api/v1.0/{appId}/emvterminals | List EMV terminals belonging to the given AppNameId
[**loginWithDeviceId**](HydraApi.md#loginWithDeviceId) | **POST** /api/v1.0/hydra/{deviceId}/login | [Private]
[**register**](HydraApi.md#register) | **POST** /api/v1.0/{appId}/hydra/registration | [Private]
[**unAssign**](HydraApi.md#unAssign) | **DELETE** /api/v1.0/{appId}/hydra/{deviceId}/registration | [Private]
[**unassignEmv**](HydraApi.md#unassignEmv) | **POST** /api/v1.0/{appId}/hydra/emvterminal/unassign/{hydraConfigId} | Unassign the currently assigned EMV terminal from a kiosk
[**updateKioskCashVisibilitySettings**](HydraApi.md#updateKioskCashVisibilitySettings) | **POST** /api/v1.0/{appId}/kioskupdatecashsettings | Update the Cash Payment Method Visibility on Kiosk


<a name="assignEmv"></a>
# **assignEmv**
> assignEmv(appId, hydraConfigId, emvTerminalId)

Assign an EMV terminal to a kiosk

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
Integer hydraConfigId = 56; // Integer | 
Integer emvTerminalId = 56; // Integer | 
try {
    apiInstance.assignEmv(appId, hydraConfigId, emvTerminalId);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#assignEmv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **hydraConfigId** | **Integer**|  |
 **emvTerminalId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="attachStoreToKiosk"></a>
# **attachStoreToKiosk**
> RestApiResultHydraStatus attachStoreToKiosk(appId, storeId, deviceId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiResultHydraStatus result = apiInstance.attachStoreToKiosk(appId, storeId, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#attachStoreToKiosk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="attachStoreToTerminal"></a>
# **attachStoreToTerminal**
> RestApiResultHydraStatus attachStoreToTerminal(appId, deviceId, storeId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultHydraStatus result = apiInstance.attachStoreToTerminal(appId, deviceId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#attachStoreToTerminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cancelEmvPayment"></a>
# **cancelEmvPayment**
> cancelEmvPayment(orderId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
Integer orderId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    apiInstance.cancelEmvPayment(orderId, appId);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#cancelEmvPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="detachStoreFromTerminal"></a>
# **detachStoreFromTerminal**
> RestApiResultHydraStatus detachStoreFromTerminal(appId, deviceId, storeId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultHydraStatus result = apiInstance.detachStoreFromTerminal(appId, deviceId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#detachStoreFromTerminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAttachedDevice"></a>
# **getAttachedDevice**
> RestApiResultHydraDeviceDetails getAttachedDevice(appId, deviceType, deviceId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceType = "deviceType_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiResultHydraDeviceDetails result = apiInstance.getAttachedDevice(appId, deviceType, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getAttachedDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceType** | **String**|  | [enum: Kiosk, Terminal, LegacyPrinter]
 **deviceId** | **String**|  |

### Return type

[**RestApiResultHydraDeviceDetails**](RestApiResultHydraDeviceDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAttachedDevices"></a>
# **getAttachedDevices**
> RestApiPaginationResultHydraDeviceDetails getAttachedDevices(appId, deviceType, pageIndex, pageSize, storeId, deviceName, deviceSerial)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceType = "deviceType_example"; // String | 
Integer pageIndex = 56; // Integer | 
Integer pageSize = 56; // Integer | 
Integer storeId = 56; // Integer | 
String deviceName = "deviceName_example"; // String | 
String deviceSerial = "deviceSerial_example"; // String | 
try {
    RestApiPaginationResultHydraDeviceDetails result = apiInstance.getAttachedDevices(appId, deviceType, pageIndex, pageSize, storeId, deviceName, deviceSerial);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getAttachedDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceType** | **String**|  | [enum: Kiosk, Terminal, LegacyPrinter]
 **pageIndex** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **storeId** | **Integer**|  | [optional]
 **deviceName** | **String**|  | [optional]
 **deviceSerial** | **String**|  | [optional]

### Return type

[**RestApiPaginationResultHydraDeviceDetails**](RestApiPaginationResultHydraDeviceDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEMVTerminalDetails"></a>
# **getEMVTerminalDetails**
> RestApiResultPaymentTerminalDetails getEMVTerminalDetails(appId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultPaymentTerminalDetails result = apiInstance.getEMVTerminalDetails(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getEMVTerminalDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultPaymentTerminalDetails**](RestApiResultPaymentTerminalDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEmvOrderState"></a>
# **getEmvOrderState**
> RestApiResultPaymentTerminalTransactionDetails getEmvOrderState(orderId, appId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
Integer orderId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    RestApiResultPaymentTerminalTransactionDetails result = apiInstance.getEmvOrderState(orderId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getEmvOrderState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultPaymentTerminalTransactionDetails**](RestApiResultPaymentTerminalTransactionDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getKioskCashPaymentSettings"></a>
# **getKioskCashPaymentSettings**
> RestApiArrayResultKioskCashPaymentSettings getKioskCashPaymentSettings(appId, deviceId)

Get the status of Cash Payment Method on Kiosk

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiArrayResultKioskCashPaymentSettings result = apiInstance.getKioskCashPaymentSettings(appId, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getKioskCashPaymentSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiArrayResultKioskCashPaymentSettings**](RestApiArrayResultKioskCashPaymentSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRegistration"></a>
# **getRegistration**
> RestApiResultHydraStatus getRegistration()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
try {
    RestApiResultHydraStatus result = apiInstance.getRegistration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getRegistration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getSettings"></a>
# **getSettings**
> RestApiResultHydraConfig getSettings()

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
try {
    RestApiResultHydraConfig result = apiInstance.getSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultHydraConfig**](RestApiResultHydraConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="hydraCreateEmv"></a>
# **hydraCreateEmv**
> Object hydraCreateEmv(appId, emv)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
EmvTerminal emv = new EmvTerminal(); // EmvTerminal | 
try {
    Object result = apiInstance.hydraCreateEmv(appId, emv);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#hydraCreateEmv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **emv** | [**EmvTerminal**](EmvTerminal.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="hydraDeleteEmv"></a>
# **hydraDeleteEmv**
> Object hydraDeleteEmv(appId, id)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
Integer id = 56; // Integer | 
try {
    Object result = apiInstance.hydraDeleteEmv(appId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#hydraDeleteEmv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="hydraDetachStoreFromKiosk"></a>
# **hydraDetachStoreFromKiosk**
> RestApiResultHydraStatus hydraDetachStoreFromKiosk(appId, storeId, deviceId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiResultHydraStatus result = apiInstance.hydraDetachStoreFromKiosk(appId, storeId, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#hydraDetachStoreFromKiosk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="hydraGetEmvsForAppId"></a>
# **hydraGetEmvsForAppId**
> RestApiArrayResultEmvTerminalWithAssignments hydraGetEmvsForAppId(appId)

List EMV terminals belonging to the given AppNameId

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
try {
    RestApiArrayResultEmvTerminalWithAssignments result = apiInstance.hydraGetEmvsForAppId(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#hydraGetEmvsForAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiArrayResultEmvTerminalWithAssignments**](RestApiArrayResultEmvTerminalWithAssignments.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="loginWithDeviceId"></a>
# **loginWithDeviceId**
> loginWithDeviceId(deviceId, hydraUserType, serialNumber)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String deviceId = "deviceId_example"; // String | 
String hydraUserType = "hydraUserType_example"; // String | 
String serialNumber = "serialNumber_example"; // String | 
try {
    apiInstance.loginWithDeviceId(deviceId, hydraUserType, serialNumber);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#loginWithDeviceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  |
 **hydraUserType** | **String**|  | [optional] [enum: Kiosk, Terminal, LegacyPrinter]
 **serialNumber** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="register"></a>
# **register**
> RestApiResultHydraStatus register(appId, hydraRegistration)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
HydraRegistrationRequest hydraRegistration = new HydraRegistrationRequest(); // HydraRegistrationRequest | 
try {
    RestApiResultHydraStatus result = apiInstance.register(appId, hydraRegistration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **hydraRegistration** | [**HydraRegistrationRequest**](HydraRegistrationRequest.md)|  |

### Return type

[**RestApiResultHydraStatus**](RestApiResultHydraStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unAssign"></a>
# **unAssign**
> unAssign(appId, deviceId)

[Private]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.unAssign(appId, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#unAssign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unassignEmv"></a>
# **unassignEmv**
> unassignEmv(appId, hydraConfigId)

Unassign the currently assigned EMV terminal from a kiosk

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
Integer hydraConfigId = 56; // Integer | 
try {
    apiInstance.unassignEmv(appId, hydraConfigId);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#unassignEmv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **hydraConfigId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateKioskCashVisibilitySettings"></a>
# **updateKioskCashVisibilitySettings**
> updateKioskCashVisibilitySettings(appId, deviceId, isCashEnabled)

Update the Cash Payment Method Visibility on Kiosk

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.HydraApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

HydraApi apiInstance = new HydraApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
Boolean isCashEnabled = true; // Boolean | 
try {
    apiInstance.updateKioskCashVisibilitySettings(appId, deviceId, isCashEnabled);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#updateKioskCashVisibilitySettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **isCashEnabled** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

