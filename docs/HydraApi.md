# HydraApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignEmv**](HydraApi.md#assignEmv) | **POST** /api/v1.0/{appId}/hydra/emvterminal/assign/{hydraConfigId}/{emvTerminalId} | 
[**attachStoreToKiosk**](HydraApi.md#attachStoreToKiosk) | **POST** /api/v1.0/{appId}/AttachStoreToKiosk/{deviceId}/store/{storeId} | 
[**attachStoreToTerminal**](HydraApi.md#attachStoreToTerminal) | **POST** /api/v1.0/{appId}/hydra/{deviceId}/attach/{storeId} | 
[**cancelEmvPayment**](HydraApi.md#cancelEmvPayment) | **POST** /api/v1.0/{appId}/hydra/cancelemvpayment/{orderId} | 
[**detachStoreFromTerminal**](HydraApi.md#detachStoreFromTerminal) | **POST** /api/v1.0/{appId}/hydra/{deviceId}/detach/{storeId} | 
[**getAblyToken**](HydraApi.md#getAblyToken) | **GET** /api/v1.0/hydra/ably_token | 
[**getAttachedDevice**](HydraApi.md#getAttachedDevice) | **GET** /api/v1.0/{appId}/hydra/{deviceType}/{deviceId} | 
[**getAttachedDevices**](HydraApi.md#getAttachedDevices) | **GET** /api/v1.0/{appId}/hydra/{deviceType}/list | 
[**getEMVTerminalDetails**](HydraApi.md#getEMVTerminalDetails) | **GET** /api/v1.0/{appId}/hydra/emvterminal | 
[**getEmvOrderState**](HydraApi.md#getEmvOrderState) | **GET** /api/v1.0/{appId}/hydra/emvorderstate/{orderId} | 
[**getKioskCashPaymentSettings**](HydraApi.md#getKioskCashPaymentSettings) | **GET** /api/v1.0/{appId}/kioskcashsettings/{deviceId} | 
[**getKioskSettings**](HydraApi.md#getKioskSettings) | **GET** /api/v1.0/{appId}/kiosksettings/{deviceId} | 
[**getRegistration**](HydraApi.md#getRegistration) | **GET** /api/v1.0/hydra/registration | 
[**getSettings**](HydraApi.md#getSettings) | **GET** /api/v1.0/hydra/settings | 
[**hydraCreateEmv**](HydraApi.md#hydraCreateEmv) | **POST** /api/v1.0/{appId}/emvterminals | 
[**hydraDeleteEmv**](HydraApi.md#hydraDeleteEmv) | **DELETE** /api/v1.0/{appId}/emvterminals/{id} | 
[**hydraDetachStoreFromKiosk**](HydraApi.md#hydraDetachStoreFromKiosk) | **DELETE** /api/v1.0/{appId}/DetachStoreFromKiosk/{deviceId}/store/{storeId} | 
[**hydraGetEmvsForAppId**](HydraApi.md#hydraGetEmvsForAppId) | **GET** /api/v1.0/{appId}/emvterminals | 
[**loginWithDeviceId**](HydraApi.md#loginWithDeviceId) | **POST** /api/v1.0/hydra/{deviceId}/login | 
[**register**](HydraApi.md#register) | **POST** /api/v1.0/{appId}/hydra/registration | 
[**unAssign**](HydraApi.md#unAssign) | **DELETE** /api/v1.0/{appId}/hydra/{deviceId}/registration | 
[**unassignEmv**](HydraApi.md#unassignEmv) | **POST** /api/v1.0/{appId}/hydra/emvterminal/unassign/{hydraConfigId} | 
[**updateKioskCashVisibilitySettings**](HydraApi.md#updateKioskCashVisibilitySettings) | **POST** /api/v1.0/{appId}/kioskupdatecashsettings | 
[**updateKioskSettings**](HydraApi.md#updateKioskSettings) | **POST** /api/v1.0/{appId}/kiosksettings/{deviceId} | 


<a name="assignEmv"></a>
# **assignEmv**
> assignEmv(appId, hydraConfigId, emvTerminalId)



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

<a name="getAblyToken"></a>
# **getAblyToken**
> getAblyToken()



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
    apiInstance.getAblyToken();
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getAblyToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAttachedDevice"></a>
# **getAttachedDevice**
> RestApiResultHydraDeviceDetails getAttachedDevice(appId, deviceType, deviceId)



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

<a name="getKioskSettings"></a>
# **getKioskSettings**
> RestApiResultKioskSettings getKioskSettings(appId, deviceId)



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
    RestApiResultKioskSettings result = apiInstance.getKioskSettings(appId, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#getKioskSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiResultKioskSettings**](RestApiResultKioskSettings.md)

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

<a name="updateKioskSettings"></a>
# **updateKioskSettings**
> updateKioskSettings(appId, deviceId, settings)



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
KioskSettings settings = new KioskSettings(); // KioskSettings | 
try {
    apiInstance.updateKioskSettings(appId, deviceId, settings);
} catch (ApiException e) {
    System.err.println("Exception when calling HydraApi#updateKioskSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **settings** | [**KioskSettings**](KioskSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

