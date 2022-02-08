# CardReadersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeStripeTerminal**](CardReadersApi.md#authorizeStripeTerminal) | **POST** /api/v1.0/{appId}/stripeterminal/authorize | Get Authorization Key for Stripe Terminal
[**cancelCurrentlyInitiatedBluetoothDeviceUpdate**](CardReadersApi.md#cancelCurrentlyInitiatedBluetoothDeviceUpdate) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/cancelUpdate | Cancel currently initiated install update for bluetooth terminal
[**getBluetoothTerminalStatus**](CardReadersApi.md#getBluetoothTerminalStatus) | **GET** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/status | Get the status of the bluetooth terminal
[**initiateBluetoothTerminalDeviceUpdateCheck**](CardReadersApi.md#initiateBluetoothTerminalDeviceUpdateCheck) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/checkForUpdate | Trigger check for Bluetooth device update on Kiosk
[**initiateKioskBluetoothPairingMode**](CardReadersApi.md#initiateKioskBluetoothPairingMode) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/pair | Initiate stripe terminal pairing mode
[**initiateKioskBluetoothUpdateInstall**](CardReadersApi.md#initiateKioskBluetoothUpdateInstall) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/installUpdate | Initiate Kiosk Update Install for bluetooth terminal
[**unpairCurrentlyPairedBluetoothDevice**](CardReadersApi.md#unpairCurrentlyPairedBluetoothDevice) | **DELETE** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/unpair | Unpair the currently paired stripe terminal


<a name="authorizeStripeTerminal"></a>
# **authorizeStripeTerminal**
> RestApiResultStripeTerminalPrivateKey authorizeStripeTerminal(appId)

Get Authorization Key for Stripe Terminal

Can only be called by Kiosk  [BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultStripeTerminalPrivateKey result = apiInstance.authorizeStripeTerminal(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#authorizeStripeTerminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultStripeTerminalPrivateKey**](RestApiResultStripeTerminalPrivateKey.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cancelCurrentlyInitiatedBluetoothDeviceUpdate"></a>
# **cancelCurrentlyInitiatedBluetoothDeviceUpdate**
> cancelCurrentlyInitiatedBluetoothDeviceUpdate(appId, deviceId, terminalType)

Cancel currently initiated install update for bluetooth terminal

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
String terminalType = "terminalType_example"; // String | 
try {
    apiInstance.cancelCurrentlyInitiatedBluetoothDeviceUpdate(appId, deviceId, terminalType);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#cancelCurrentlyInitiatedBluetoothDeviceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBluetoothTerminalStatus"></a>
# **getBluetoothTerminalStatus**
> RestApiResultBluetoothTerminalStatus getBluetoothTerminalStatus(appId, deviceId)

Get the status of the bluetooth terminal

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    RestApiResultBluetoothTerminalStatus result = apiInstance.getBluetoothTerminalStatus(appId, deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#getBluetoothTerminalStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**RestApiResultBluetoothTerminalStatus**](RestApiResultBluetoothTerminalStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="initiateBluetoothTerminalDeviceUpdateCheck"></a>
# **initiateBluetoothTerminalDeviceUpdateCheck**
> initiateBluetoothTerminalDeviceUpdateCheck(appId, deviceId, terminalType)

Trigger check for Bluetooth device update on Kiosk

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
String terminalType = "terminalType_example"; // String | 
try {
    apiInstance.initiateBluetoothTerminalDeviceUpdateCheck(appId, deviceId, terminalType);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#initiateBluetoothTerminalDeviceUpdateCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **terminalType** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="initiateKioskBluetoothPairingMode"></a>
# **initiateKioskBluetoothPairingMode**
> initiateKioskBluetoothPairingMode(appId, deviceId, terminalType)

Initiate stripe terminal pairing mode

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
String terminalType = "terminalType_example"; // String | 
try {
    apiInstance.initiateKioskBluetoothPairingMode(appId, deviceId, terminalType);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#initiateKioskBluetoothPairingMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="initiateKioskBluetoothUpdateInstall"></a>
# **initiateKioskBluetoothUpdateInstall**
> initiateKioskBluetoothUpdateInstall(appId, deviceId, terminalType)

Initiate Kiosk Update Install for bluetooth terminal

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
String terminalType = "terminalType_example"; // String | 
try {
    apiInstance.initiateKioskBluetoothUpdateInstall(appId, deviceId, terminalType);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#initiateKioskBluetoothUpdateInstall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **deviceId** | **String**|  |
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unpairCurrentlyPairedBluetoothDevice"></a>
# **unpairCurrentlyPairedBluetoothDevice**
> unpairCurrentlyPairedBluetoothDevice(appId, deviceId)

Unpair the currently paired stripe terminal

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CardReadersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CardReadersApi apiInstance = new CardReadersApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.unpairCurrentlyPairedBluetoothDevice(appId, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#unpairCurrentlyPairedBluetoothDevice");
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
