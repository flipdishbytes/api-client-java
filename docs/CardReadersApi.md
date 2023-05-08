# CardReadersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCurrentlyInitiatedBluetoothDeviceUpdate**](CardReadersApi.md#cancelCurrentlyInitiatedBluetoothDeviceUpdate) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/cancelUpdate | Cancel currently initiated install update for bluetooth terminal
[**cancelReaderAction**](CardReadersApi.md#cancelReaderAction) | **POST** /api/v1.0/{appId}/payments/terminals/stripe/{readerId}/cancel_action | Cancel terminals action
[**cardReadersGetReader**](CardReadersApi.md#cardReadersGetReader) | **GET** /api/v1.0/{appId}/payments/terminals/stripe/{readerId} | Get reader
[**generateStripeTerminalLocation**](CardReadersApi.md#generateStripeTerminalLocation) | **POST** /api/v1.0/{appId}/stripeterminal/location | Get Location ID for Stripe Terminal
[**getBluetoothTerminalStatus**](CardReadersApi.md#getBluetoothTerminalStatus) | **GET** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/status | Get the status of the bluetooth terminal
[**getStripeConnectionToken**](CardReadersApi.md#getStripeConnectionToken) | **GET** /api/v1.0/{appId}/stripeterminal/connectiontoken | Get Connection Token For a Stripe Terminal
[**initiateBluetoothTerminalDeviceUpdateCheck**](CardReadersApi.md#initiateBluetoothTerminalDeviceUpdateCheck) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/checkForUpdate | Trigger check for Bluetooth device update on Kiosk
[**initiateKioskBluetoothPairingMode**](CardReadersApi.md#initiateKioskBluetoothPairingMode) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/pair | Initiate stripe terminal pairing mode
[**initiateKioskBluetoothUpdateInstall**](CardReadersApi.md#initiateKioskBluetoothUpdateInstall) | **POST** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/{terminalType}/installUpdate | Initiate Kiosk Update Install for bluetooth terminal
[**initiateReaderProcessPaymentIntent**](CardReadersApi.md#initiateReaderProcessPaymentIntent) | **POST** /api/v1.0/{appId}/payments/terminals/stripe/{readerId}/processPaymentIntent | Initiate Stripe terminal to Process Payment Intent
[**registerStripeTerminal**](CardReadersApi.md#registerStripeTerminal) | **POST** /api/v1.0/{appId}/payments/terminals/stripe/register | 
[**unRegisterTerminal**](CardReadersApi.md#unRegisterTerminal) | **DELETE** /api/v1.0/{appId}/payments/terminals/stripe/unregister | Un-register terminal by deleting it from stripe
[**unpairCurrentlyPairedBluetoothDevice**](CardReadersApi.md#unpairCurrentlyPairedBluetoothDevice) | **DELETE** /api/v1.0/{appId}/cardreaders/kiosk/{deviceId}/bluetooth/unpair | Unpair the currently paired stripe terminal


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
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3, WISEPOS_E]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cancelReaderAction"></a>
# **cancelReaderAction**
> RestApiResultCardReader cancelReaderAction(readerId, appId)

Cancel terminals action

Can only be called by Kiosk

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
String readerId = "readerId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCardReader result = apiInstance.cancelReaderAction(readerId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#cancelReaderAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **readerId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCardReader**](RestApiResultCardReader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cardReadersGetReader"></a>
# **cardReadersGetReader**
> RestApiResultCardReader cardReadersGetReader(readerId, appId)

Get reader

Can only be called by Kiosk

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
String readerId = "readerId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCardReader result = apiInstance.cardReadersGetReader(readerId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#cardReadersGetReader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **readerId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCardReader**](RestApiResultCardReader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="generateStripeTerminalLocation"></a>
# **generateStripeTerminalLocation**
> RestApiResultStripeTerminalLocation generateStripeTerminalLocation(geoPointRequest, appId)

Get Location ID for Stripe Terminal

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
GeoPointRequest geoPointRequest = new GeoPointRequest(); // GeoPointRequest | 
String appId = "appId_example"; // String | 
try {
    RestApiResultStripeTerminalLocation result = apiInstance.generateStripeTerminalLocation(geoPointRequest, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#generateStripeTerminalLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geoPointRequest** | [**GeoPointRequest**](GeoPointRequest.md)|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultStripeTerminalLocation**](RestApiResultStripeTerminalLocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
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

<a name="getStripeConnectionToken"></a>
# **getStripeConnectionToken**
> RestApiResultStripeTerminalConnectionToken getStripeConnectionToken(appId)

Get Connection Token For a Stripe Terminal

Can only be called by Kiosk

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
    RestApiResultStripeTerminalConnectionToken result = apiInstance.getStripeConnectionToken(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#getStripeConnectionToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultStripeTerminalConnectionToken**](RestApiResultStripeTerminalConnectionToken.md)

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
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3, WISEPOS_E]

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
 **terminalType** | **String**|  | [enum: CHIPPER_2X, COTS_DEVICE, VERIFONE_P400, WISEPAD_3, WISEPOS_E]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="initiateReaderProcessPaymentIntent"></a>
# **initiateReaderProcessPaymentIntent**
> RestApiResultCardReader initiateReaderProcessPaymentIntent(request, readerId, appId)

Initiate Stripe terminal to Process Payment Intent

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
ProcessPaymentIntentRequest request = new ProcessPaymentIntentRequest(); // ProcessPaymentIntentRequest | 
String readerId = "readerId_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCardReader result = apiInstance.initiateReaderProcessPaymentIntent(request, readerId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#initiateReaderProcessPaymentIntent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ProcessPaymentIntentRequest**](ProcessPaymentIntentRequest.md)|  |
 **readerId** | **String**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCardReader**](RestApiResultCardReader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="registerStripeTerminal"></a>
# **registerStripeTerminal**
> RestApiResultCardReader registerStripeTerminal(request, appId)



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
CardReaderRegistrationRequest request = new CardReaderRegistrationRequest(); // CardReaderRegistrationRequest | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCardReader result = apiInstance.registerStripeTerminal(request, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#registerStripeTerminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardReaderRegistrationRequest**](CardReaderRegistrationRequest.md)|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCardReader**](RestApiResultCardReader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unRegisterTerminal"></a>
# **unRegisterTerminal**
> RestApiResultCardReader unRegisterTerminal(request, appId)

Un-register terminal by deleting it from stripe

Can only be called by Kiosk

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
UnRegisterCardReaderRequest request = new UnRegisterCardReaderRequest(); // UnRegisterCardReaderRequest | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCardReader result = apiInstance.unRegisterTerminal(request, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardReadersApi#unRegisterTerminal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UnRegisterCardReaderRequest**](UnRegisterCardReaderRequest.md)|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCardReader**](RestApiResultCardReader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
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

