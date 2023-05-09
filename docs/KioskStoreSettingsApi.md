# KioskStoreSettingsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllKioskSettingsForStore**](KioskStoreSettingsApi.md#getAllKioskSettingsForStore) | **GET** /api/v1.0/{appId}/kiosksettings/store/{storeId} | 
[**getAllStoreSettingsForKioskHydra**](KioskStoreSettingsApi.md#getAllStoreSettingsForKioskHydra) | **GET** /api/v1.0/kioskstoresettings | 
[**updateCashSettingForKiosk**](KioskStoreSettingsApi.md#updateCashSettingForKiosk) | **POST** /api/v1.0/{appId}/kiosksettings/cash | 


<a name="getAllKioskSettingsForStore"></a>
# **getAllKioskSettingsForStore**
> RestApiResultStoreKioskSettings getAllKioskSettingsForStore(storeId, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.KioskStoreSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

KioskStoreSettingsApi apiInstance = new KioskStoreSettingsApi();
Integer storeId = 56; // Integer | 
String appId = "appId_example"; // String | 
try {
    RestApiResultStoreKioskSettings result = apiInstance.getAllKioskSettingsForStore(storeId, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskStoreSettingsApi#getAllKioskSettingsForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultStoreKioskSettings**](RestApiResultStoreKioskSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAllStoreSettingsForKioskHydra"></a>
# **getAllStoreSettingsForKioskHydra**
> RestApiResultKioskStoreSettings getAllStoreSettingsForKioskHydra()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.KioskStoreSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

KioskStoreSettingsApi apiInstance = new KioskStoreSettingsApi();
try {
    RestApiResultKioskStoreSettings result = apiInstance.getAllStoreSettingsForKioskHydra();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskStoreSettingsApi#getAllStoreSettingsForKioskHydra");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultKioskStoreSettings**](RestApiResultKioskStoreSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateCashSettingForKiosk"></a>
# **updateCashSettingForKiosk**
> RestApiResultKioskCashSetting updateCashSettingForKiosk(appId, deviceId, isCashEnabled)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.KioskStoreSettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

KioskStoreSettingsApi apiInstance = new KioskStoreSettingsApi();
String appId = "appId_example"; // String | 
String deviceId = "deviceId_example"; // String | 
Boolean isCashEnabled = true; // Boolean | 
try {
    RestApiResultKioskCashSetting result = apiInstance.updateCashSettingForKiosk(appId, deviceId, isCashEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KioskStoreSettingsApi#updateCashSettingForKiosk");
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

[**RestApiResultKioskCashSetting**](RestApiResultKioskCashSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

