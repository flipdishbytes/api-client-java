# StoresApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStore**](StoresApi.md#archiveStore) | **POST** /api/v1.0/stores/{storeId}/archive | 
[**assignMenu**](StoresApi.md#assignMenu) | **POST** /api/v1.0/stores/{storeId}/menu/{menuId} | 
[**cloneStore**](StoresApi.md#cloneStore) | **POST** /api/v1.0/stores/{storeId}/clone | 
[**configureStoreServiceCharge**](StoresApi.md#configureStoreServiceCharge) | **POST** /api/v1.0/stores/{storeId}/servicecharge | 
[**createBusinessHoursOverrideByStoreId**](StoresApi.md#createBusinessHoursOverrideByStoreId) | **POST** /api/v1.0/stores/{storeId}/businesshoursoverrides | 
[**createStore**](StoresApi.md#createStore) | **POST** /api/v1.0/stores | 
[**deleteBusinessHoursOverride**](StoresApi.md#deleteBusinessHoursOverride) | **DELETE** /api/v1.0/stores/{storeId}/businesshoursoverrides/{businessHoursOverrideId} | 
[**getBankAccountForStore**](StoresApi.md#getBankAccountForStore) | **GET** /api/v1.0/stores/{storeId}/bankaccount | 
[**getBusinessHours**](StoresApi.md#getBusinessHours) | **GET** /api/v1.0/stores/{storeId}/availability/{deliveryType} | 
[**getBusinessHoursOverrideByStoreId**](StoresApi.md#getBusinessHoursOverrideByStoreId) | **GET** /api/v1.0/stores/{storeId}/businesshoursoverrides | 
[**getEndOfDayReport**](StoresApi.md#getEndOfDayReport) | **GET** /api/v1.0/stores/{storeId}/endofdayreport | 
[**getPreOrderConfig**](StoresApi.md#getPreOrderConfig) | **GET** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType} | 
[**getPreOrderPreview**](StoresApi.md#getPreOrderPreview) | **GET** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType}/preview | 
[**getProcessingFeeConfigsByStoreId**](StoresApi.md#getProcessingFeeConfigsByStoreId) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs | 
[**getProcessingFeeConfigsByStoreIdAndPaymentAccountType**](StoresApi.md#getProcessingFeeConfigsByStoreIdAndPaymentAccountType) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs/{paymentAccountType} | 
[**getStoreById**](StoresApi.md#getStoreById) | **GET** /api/v1.0/stores/{storeId} | 
[**getStoreDeliveryFeeConfig**](StoresApi.md#getStoreDeliveryFeeConfig) | **GET** /api/v1.0/stores/{storeId}/feeConfig/deliveryZones | 
[**getStoreFeeConfig**](StoresApi.md#getStoreFeeConfig) | **GET** /api/v1.0/stores/{storeId}/feeConfig | 
[**getStoreHeadersByAppId**](StoresApi.md#getStoreHeadersByAppId) | **GET** /api/v1.0/{appId}/stores/header | 
[**getStoreLeadTimes**](StoresApi.md#getStoreLeadTimes) | **GET** /api/v1.0/stores/{storeId}/leadTimes | 
[**getStoreNetSales**](StoresApi.md#getStoreNetSales) | **GET** /api/v1.0/{appId}/stores/stats | 
[**getStoreServiceCharge**](StoresApi.md#getStoreServiceCharge) | **GET** /api/v1.0/stores/{storeId}/servicecharge | 
[**getStores**](StoresApi.md#getStores) | **GET** /api/v1.0/stores | 
[**getStoresByAppId**](StoresApi.md#getStoresByAppId) | **GET** /api/v1.0/{appId}/stores | 
[**getStoresByStoreIdWithValidations**](StoresApi.md#getStoresByStoreIdWithValidations) | **GET** /api/v1.0/{appId}/storevalidation/kiosk | 
[**publishStore**](StoresApi.md#publishStore) | **POST** /api/v1.0/stores/{storeId}/publish | 
[**putStoreDeliveryFeeConfig**](StoresApi.md#putStoreDeliveryFeeConfig) | **PUT** /api/v1.0/stores/{storeId}/feeConfig/deliveryZones | 
[**setBusinessHours**](StoresApi.md#setBusinessHours) | **POST** /api/v1.0/stores/{storeId}/availability/{deliveryType} | 
[**setPreOrdeEnabled**](StoresApi.md#setPreOrdeEnabled) | **POST** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType}/enabled | 
[**setStoreLeadTimes**](StoresApi.md#setStoreLeadTimes) | **POST** /api/v1.0/stores/{storeId}/leadTimes | 
[**unpublishStore**](StoresApi.md#unpublishStore) | **POST** /api/v1.0/stores/{storeId}/unpublish | 
[**updatePreOrderConfig**](StoresApi.md#updatePreOrderConfig) | **POST** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType} | 
[**updateStore**](StoresApi.md#updateStore) | **POST** /api/v1.0/stores/{storeId} | 
[**updateStoreAddress**](StoresApi.md#updateStoreAddress) | **POST** /api/v1.0/stores/{storeId}/address | 
[**updateStoreAddressCoordinates**](StoresApi.md#updateStoreAddressCoordinates) | **POST** /api/v1.0/stores/{storeId}/address/coordinates | 
[**updateStoreAddressForm**](StoresApi.md#updateStoreAddressForm) | **POST** /api/v1.0/stores/{storeId}/addressform | 


<a name="archiveStore"></a>
# **archiveStore**
> archiveStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    apiInstance.archiveStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#archiveStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="assignMenu"></a>
# **assignMenu**
> RestApiArrayResultRestApiDefaultResponse assignMenu(storeId, menuId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
Integer menuId = 56; // Integer | 
try {
    RestApiArrayResultRestApiDefaultResponse result = apiInstance.assignMenu(storeId, menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#assignMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **menuId** | **Integer**|  |

### Return type

[**RestApiArrayResultRestApiDefaultResponse**](RestApiArrayResultRestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="cloneStore"></a>
# **cloneStore**
> RestApiResultStore cloneStore(storeId, settings)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
StoreCloneSettings settings = new StoreCloneSettings(); // StoreCloneSettings | 
try {
    RestApiResultStore result = apiInstance.cloneStore(storeId, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#cloneStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **settings** | [**StoreCloneSettings**](StoreCloneSettings.md)|  |

### Return type

[**RestApiResultStore**](RestApiResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="configureStoreServiceCharge"></a>
# **configureStoreServiceCharge**
> RestApiResultServiceCharge configureStoreServiceCharge(storeId, serviceCharge)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
ServiceCharge serviceCharge = new ServiceCharge(); // ServiceCharge | 
try {
    RestApiResultServiceCharge result = apiInstance.configureStoreServiceCharge(storeId, serviceCharge);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#configureStoreServiceCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **serviceCharge** | [**ServiceCharge**](ServiceCharge.md)|  |

### Return type

[**RestApiResultServiceCharge**](RestApiResultServiceCharge.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createBusinessHoursOverrideByStoreId"></a>
# **createBusinessHoursOverrideByStoreId**
> RestApiResultBusinessHoursOverride createBusinessHoursOverrideByStoreId(storeId, businessHoursOverride)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
BusinessHoursOverrideBase businessHoursOverride = new BusinessHoursOverrideBase(); // BusinessHoursOverrideBase | 
try {
    RestApiResultBusinessHoursOverride result = apiInstance.createBusinessHoursOverrideByStoreId(storeId, businessHoursOverride);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#createBusinessHoursOverrideByStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **businessHoursOverride** | [**BusinessHoursOverrideBase**](BusinessHoursOverrideBase.md)|  |

### Return type

[**RestApiResultBusinessHoursOverride**](RestApiResultBusinessHoursOverride.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createStore"></a>
# **createStore**
> RestApiResultStore createStore(storeGroupId, store)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeGroupId = 56; // Integer | 
StoreCreateBase store = new StoreCreateBase(); // StoreCreateBase | 
try {
    RestApiResultStore result = apiInstance.createStore(storeGroupId, store);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#createStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeGroupId** | **Integer**|  |
 **store** | [**StoreCreateBase**](StoreCreateBase.md)|  |

### Return type

[**RestApiResultStore**](RestApiResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteBusinessHoursOverride"></a>
# **deleteBusinessHoursOverride**
> RestApiArrayResultRestApiDefaultResponse deleteBusinessHoursOverride(storeId, businessHoursOverrideId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
Integer businessHoursOverrideId = 56; // Integer | 
try {
    RestApiArrayResultRestApiDefaultResponse result = apiInstance.deleteBusinessHoursOverride(storeId, businessHoursOverrideId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#deleteBusinessHoursOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **businessHoursOverrideId** | **Integer**|  |

### Return type

[**RestApiArrayResultRestApiDefaultResponse**](RestApiArrayResultRestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBankAccountForStore"></a>
# **getBankAccountForStore**
> RestApiResultAssignedBankAccount getBankAccountForStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultAssignedBankAccount result = apiInstance.getBankAccountForStore(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getBankAccountForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultAssignedBankAccount**](RestApiResultAssignedBankAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBusinessHours"></a>
# **getBusinessHours**
> RestApiArrayResultBusinessHoursPeriod getBusinessHours(storeId, deliveryType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
try {
    RestApiArrayResultBusinessHoursPeriod result = apiInstance.getBusinessHours(storeId, deliveryType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getBusinessHours");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]

### Return type

[**RestApiArrayResultBusinessHoursPeriod**](RestApiArrayResultBusinessHoursPeriod.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBusinessHoursOverrideByStoreId"></a>
# **getBusinessHoursOverrideByStoreId**
> RestApiPaginationResultBusinessHoursOverride getBusinessHoursOverrideByStoreId(storeId, after, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultBusinessHoursOverride result = apiInstance.getBusinessHoursOverrideByStoreId(storeId, after, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getBusinessHoursOverrideByStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **after** | **OffsetDateTime**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultBusinessHoursOverride**](RestApiPaginationResultBusinessHoursOverride.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getEndOfDayReport"></a>
# **getEndOfDayReport**
> RestApiResultStoreEndOfDayReport getEndOfDayReport(storeId, date)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | 
try {
    RestApiResultStoreEndOfDayReport result = apiInstance.getEndOfDayReport(storeId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getEndOfDayReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **date** | **OffsetDateTime**|  | [optional]

### Return type

[**RestApiResultStoreEndOfDayReport**](RestApiResultStoreEndOfDayReport.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPreOrderConfig"></a>
# **getPreOrderConfig**
> RestApiResultPreOrderConfig getPreOrderConfig(storeId, deliveryType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
try {
    RestApiResultPreOrderConfig result = apiInstance.getPreOrderConfig(storeId, deliveryType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getPreOrderConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]

### Return type

[**RestApiResultPreOrderConfig**](RestApiResultPreOrderConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPreOrderPreview"></a>
# **getPreOrderPreview**
> RestApiArrayResultPreOrderTime getPreOrderPreview(storeId, deliveryType, preOrderConfigLeadTimeMinutes, preOrderConfigIntervalMinutes, preOrderConfigMaxOrderAheadDays, preOrderConfigIncludeAsap, preOrderConfigIncludeMoreGranularInitialTime, preOrderConfigCutOffTimePreviousDayBasic, preOrderConfigCutOffTimeCurrentDayBasic, preOrderConfigPreOrderTimeDisplayType, preOrderConfigAlwaysAppearOpen, preOrderConfigRequireExplicitSelectAlways)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
Integer preOrderConfigLeadTimeMinutes = 56; // Integer | Lead Time in Minutes
Integer preOrderConfigIntervalMinutes = 56; // Integer | Interval in minutes
Integer preOrderConfigMaxOrderAheadDays = 56; // Integer | Max Days to order ahead
Boolean preOrderConfigIncludeAsap = true; // Boolean | Show ASAP as option
Boolean preOrderConfigIncludeMoreGranularInitialTime = true; // Boolean | Granual Init' Time
String preOrderConfigCutOffTimePreviousDayBasic = "preOrderConfigCutOffTimePreviousDayBasic_example"; // String | Cut off time previous day
String preOrderConfigCutOffTimeCurrentDayBasic = "preOrderConfigCutOffTimeCurrentDayBasic_example"; // String | Cut off time current day
String preOrderConfigPreOrderTimeDisplayType = "preOrderConfigPreOrderTimeDisplayType_example"; // String | Type of time displayed.
Boolean preOrderConfigAlwaysAppearOpen = true; // Boolean | Specifies whether a customer can pre-order outside the store opening hours or not.
Boolean preOrderConfigRequireExplicitSelectAlways = true; // Boolean | Force customer to select collection time.
try {
    RestApiArrayResultPreOrderTime result = apiInstance.getPreOrderPreview(storeId, deliveryType, preOrderConfigLeadTimeMinutes, preOrderConfigIntervalMinutes, preOrderConfigMaxOrderAheadDays, preOrderConfigIncludeAsap, preOrderConfigIncludeMoreGranularInitialTime, preOrderConfigCutOffTimePreviousDayBasic, preOrderConfigCutOffTimeCurrentDayBasic, preOrderConfigPreOrderTimeDisplayType, preOrderConfigAlwaysAppearOpen, preOrderConfigRequireExplicitSelectAlways);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getPreOrderPreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **preOrderConfigLeadTimeMinutes** | **Integer**| Lead Time in Minutes | [optional]
 **preOrderConfigIntervalMinutes** | **Integer**| Interval in minutes | [optional]
 **preOrderConfigMaxOrderAheadDays** | **Integer**| Max Days to order ahead | [optional]
 **preOrderConfigIncludeAsap** | **Boolean**| Show ASAP as option | [optional]
 **preOrderConfigIncludeMoreGranularInitialTime** | **Boolean**| Granual Init&#39; Time | [optional]
 **preOrderConfigCutOffTimePreviousDayBasic** | **String**| Cut off time previous day | [optional]
 **preOrderConfigCutOffTimeCurrentDayBasic** | **String**| Cut off time current day | [optional]
 **preOrderConfigPreOrderTimeDisplayType** | **String**| Type of time displayed. | [optional] [enum: SingleTime, StartAndEndTime, DayOnly]
 **preOrderConfigAlwaysAppearOpen** | **Boolean**| Specifies whether a customer can pre-order outside the store opening hours or not. | [optional]
 **preOrderConfigRequireExplicitSelectAlways** | **Boolean**| Force customer to select collection time. | [optional]

### Return type

[**RestApiArrayResultPreOrderTime**](RestApiArrayResultPreOrderTime.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getProcessingFeeConfigsByStoreId"></a>
# **getProcessingFeeConfigsByStoreId**
> RestApiArrayResultProcessingFeeConfig getProcessingFeeConfigsByStoreId(storeId, appNameId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String appNameId = "appNameId_example"; // String | 
try {
    RestApiArrayResultProcessingFeeConfig result = apiInstance.getProcessingFeeConfigsByStoreId(storeId, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getProcessingFeeConfigsByStoreId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **appNameId** | **String**|  | [optional]

### Return type

[**RestApiArrayResultProcessingFeeConfig**](RestApiArrayResultProcessingFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getProcessingFeeConfigsByStoreIdAndPaymentAccountType"></a>
# **getProcessingFeeConfigsByStoreIdAndPaymentAccountType**
> RestApiResultProcessingFeeConfig getProcessingFeeConfigsByStoreIdAndPaymentAccountType(storeId, paymentAccountType, appNameId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String paymentAccountType = "paymentAccountType_example"; // String | 
String appNameId = "appNameId_example"; // String | 
try {
    RestApiResultProcessingFeeConfig result = apiInstance.getProcessingFeeConfigsByStoreIdAndPaymentAccountType(storeId, paymentAccountType, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getProcessingFeeConfigsByStoreIdAndPaymentAccountType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **paymentAccountType** | **String**|  | [enum: Card, Cash, Ideal, Bancontact, Giropay, Eps, Emv, PayPal, PayGreen, GoogleWalletToken]
 **appNameId** | **String**|  | [optional]

### Return type

[**RestApiResultProcessingFeeConfig**](RestApiResultProcessingFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreById"></a>
# **getStoreById**
> RestApiResultStore getStoreById(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultStore result = apiInstance.getStoreById(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultStore**](RestApiResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreDeliveryFeeConfig"></a>
# **getStoreDeliveryFeeConfig**
> RestApiArrayResultStoreDeliveryZoneFeeConfig getStoreDeliveryFeeConfig(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    RestApiArrayResultStoreDeliveryZoneFeeConfig result = apiInstance.getStoreDeliveryFeeConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreDeliveryFeeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiArrayResultStoreDeliveryZoneFeeConfig**](RestApiArrayResultStoreDeliveryZoneFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreFeeConfig"></a>
# **getStoreFeeConfig**
> StoreFeeConfig getStoreFeeConfig(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    StoreFeeConfig result = apiInstance.getStoreFeeConfig(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreFeeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**StoreFeeConfig**](StoreFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreHeadersByAppId"></a>
# **getStoreHeadersByAppId**
> RestApiPaginationResultStoreHeader getStoreHeadersByAppId(appId, storeNameQuery, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
String appId = "appId_example"; // String | 
String storeNameQuery = "storeNameQuery_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultStoreHeader result = apiInstance.getStoreHeadersByAppId(appId, storeNameQuery, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreHeadersByAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeNameQuery** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultStoreHeader**](RestApiPaginationResultStoreHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreLeadTimes"></a>
# **getStoreLeadTimes**
> RestApiResultOrderLeadTimes getStoreLeadTimes(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    RestApiResultOrderLeadTimes result = apiInstance.getStoreLeadTimes(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreLeadTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultOrderLeadTimes**](RestApiResultOrderLeadTimes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreNetSales"></a>
# **getStoreNetSales**
> RestApiArrayResultStoreStatistics getStoreNetSales(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
String appId = "appId_example"; // String | 
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
try {
    RestApiArrayResultStoreStatistics result = apiInstance.getStoreNetSales(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreNetSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  |

### Return type

[**RestApiArrayResultStoreStatistics**](RestApiArrayResultStoreStatistics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreServiceCharge"></a>
# **getStoreServiceCharge**
> ServiceCharge getStoreServiceCharge(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    ServiceCharge result = apiInstance.getStoreServiceCharge(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreServiceCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

[**ServiceCharge**](ServiceCharge.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStores"></a>
# **getStores**
> RestApiPaginationResultStore getStores(searchQuery, page, limit, storeGroupId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
String searchQuery = "searchQuery_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
Integer storeGroupId = 56; // Integer | 
try {
    RestApiPaginationResultStore result = apiInstance.getStores(searchQuery, page, limit, storeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchQuery** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **storeGroupId** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultStore**](RestApiPaginationResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoresByAppId"></a>
# **getStoresByAppId**
> RestApiPaginationResultStore getStoresByAppId(appId, searchQuery, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
String appId = "appId_example"; // String | 
String searchQuery = "searchQuery_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultStore result = apiInstance.getStoresByAppId(appId, searchQuery, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoresByAppId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **searchQuery** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultStore**](RestApiPaginationResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoresByStoreIdWithValidations"></a>
# **getStoresByStoreIdWithValidations**
> RestApiPaginationResultStoreValidationConfig getStoresByStoreIdWithValidations(storeId, appId, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
List<Integer> storeId = Arrays.asList(56); // List<Integer> | 
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultStoreValidationConfig result = apiInstance.getStoresByStoreIdWithValidations(storeId, appId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoresByStoreIdWithValidations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **appId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultStoreValidationConfig**](RestApiPaginationResultStoreValidationConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="publishStore"></a>
# **publishStore**
> publishStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    apiInstance.publishStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#publishStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="putStoreDeliveryFeeConfig"></a>
# **putStoreDeliveryFeeConfig**
> putStoreDeliveryFeeConfig(storeId, feeConfigUpdateRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
StoreDeliveryZoneFeeConfigUpdateRequest feeConfigUpdateRequest = new StoreDeliveryZoneFeeConfigUpdateRequest(); // StoreDeliveryZoneFeeConfigUpdateRequest | 
try {
    apiInstance.putStoreDeliveryFeeConfig(storeId, feeConfigUpdateRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#putStoreDeliveryFeeConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **feeConfigUpdateRequest** | [**StoreDeliveryZoneFeeConfigUpdateRequest**](StoreDeliveryZoneFeeConfigUpdateRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setBusinessHours"></a>
# **setBusinessHours**
> RestApiResultBusinessHoursPeriod setBusinessHours(storeId, deliveryType, businessHoursPeriod)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
BusinessHoursPeriodBase businessHoursPeriod = new BusinessHoursPeriodBase(); // BusinessHoursPeriodBase | 
try {
    RestApiResultBusinessHoursPeriod result = apiInstance.setBusinessHours(storeId, deliveryType, businessHoursPeriod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#setBusinessHours");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **businessHoursPeriod** | [**BusinessHoursPeriodBase**](BusinessHoursPeriodBase.md)|  |

### Return type

[**RestApiResultBusinessHoursPeriod**](RestApiResultBusinessHoursPeriod.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setPreOrdeEnabled"></a>
# **setPreOrdeEnabled**
> RestApiArrayResultRestApiDefaultResponse setPreOrdeEnabled(storeId, deliveryType, enabled)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
Boolean enabled = true; // Boolean | 
try {
    RestApiArrayResultRestApiDefaultResponse result = apiInstance.setPreOrdeEnabled(storeId, deliveryType, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#setPreOrdeEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **enabled** | **Boolean**|  |

### Return type

[**RestApiArrayResultRestApiDefaultResponse**](RestApiArrayResultRestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setStoreLeadTimes"></a>
# **setStoreLeadTimes**
> RestApiResultOrderLeadTimes setStoreLeadTimes(storeId, leadTime)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
LeadTime leadTime = new LeadTime(); // LeadTime | 
try {
    RestApiResultOrderLeadTimes result = apiInstance.setStoreLeadTimes(storeId, leadTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#setStoreLeadTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **leadTime** | [**LeadTime**](LeadTime.md)|  |

### Return type

[**RestApiResultOrderLeadTimes**](RestApiResultOrderLeadTimes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unpublishStore"></a>
# **unpublishStore**
> unpublishStore(storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
try {
    apiInstance.unpublishStore(storeId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#unpublishStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePreOrderConfig"></a>
# **updatePreOrderConfig**
> RestApiArrayResultRestApiDefaultResponse updatePreOrderConfig(storeId, deliveryType, preOrderConfig)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
String deliveryType = "deliveryType_example"; // String | 
PreOrderConfig preOrderConfig = new PreOrderConfig(); // PreOrderConfig | 
try {
    RestApiArrayResultRestApiDefaultResponse result = apiInstance.updatePreOrderConfig(storeId, deliveryType, preOrderConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updatePreOrderConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **deliveryType** | **String**|  | [enum: Delivery, Pickup]
 **preOrderConfig** | [**PreOrderConfig**](PreOrderConfig.md)|  |

### Return type

[**RestApiArrayResultRestApiDefaultResponse**](RestApiArrayResultRestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStore"></a>
# **updateStore**
> RestApiResultStore updateStore(storeId, store)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
StoreBase store = new StoreBase(); // StoreBase | 
try {
    RestApiResultStore result = apiInstance.updateStore(storeId, store);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updateStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **store** | [**StoreBase**](StoreBase.md)|  |

### Return type

[**RestApiResultStore**](RestApiResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStoreAddress"></a>
# **updateStoreAddress**
> RestApiResultStoreAddress updateStoreAddress(storeId, storeAddress)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
StoreAddressBase storeAddress = new StoreAddressBase(); // StoreAddressBase | 
try {
    RestApiResultStoreAddress result = apiInstance.updateStoreAddress(storeId, storeAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updateStoreAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **storeAddress** | [**StoreAddressBase**](StoreAddressBase.md)|  |

### Return type

[**RestApiResultStoreAddress**](RestApiResultStoreAddress.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStoreAddressCoordinates"></a>
# **updateStoreAddressCoordinates**
> RestApiResultCoordinates updateStoreAddressCoordinates(storeId, coordinates, appNameId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
Coordinates coordinates = new Coordinates(); // Coordinates | 
String appNameId = "appNameId_example"; // String | 
try {
    RestApiResultCoordinates result = apiInstance.updateStoreAddressCoordinates(storeId, coordinates, appNameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updateStoreAddressCoordinates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **coordinates** | [**Coordinates**](Coordinates.md)|  |
 **appNameId** | **String**|  | [optional]

### Return type

[**RestApiResultCoordinates**](RestApiResultCoordinates.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateStoreAddressForm"></a>
# **updateStoreAddressForm**
> Object updateStoreAddressForm(storeId, address)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.StoresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

StoresApi apiInstance = new StoresApi();
Integer storeId = 56; // Integer | 
StoreAddressForm address = new StoreAddressForm(); // StoreAddressForm | 
try {
    Object result = apiInstance.updateStoreAddressForm(storeId, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#updateStoreAddressForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **address** | [**StoreAddressForm**](StoreAddressForm.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

