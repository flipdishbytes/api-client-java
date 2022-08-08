# StoresApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStore**](StoresApi.md#archiveStore) | **POST** /api/v1.0/stores/{storeId}/archive | Archive store
[**assignMenu**](StoresApi.md#assignMenu) | **POST** /api/v1.0/stores/{storeId}/menu/{menuId} | Assign Menu to Store
[**cloneStore**](StoresApi.md#cloneStore) | **POST** /api/v1.0/stores/{storeId}/clone | Clone store with store clone settings
[**configureStoreServiceCharge**](StoresApi.md#configureStoreServiceCharge) | **POST** /api/v1.0/stores/{storeId}/servicecharge | Configure Store Service Charge; Idempotent Operation
[**createBusinessHoursOverrideByStoreId**](StoresApi.md#createBusinessHoursOverrideByStoreId) | **POST** /api/v1.0/stores/{storeId}/businesshoursoverrides | Create Business Hours Override for a store
[**createStore**](StoresApi.md#createStore) | **POST** /api/v1.0/stores | Create store with Store Group identifier
[**deleteBusinessHoursOverride**](StoresApi.md#deleteBusinessHoursOverride) | **DELETE** /api/v1.0/stores/{storeId}/businesshoursoverrides/{businessHoursOverrideId} | Delete Business Hours Override for a store
[**getBankAccountForStore**](StoresApi.md#getBankAccountForStore) | **GET** /api/v1.0/stores/{storeId}/bankaccount | Get Stores Bank Account Id
[**getBusinessHours**](StoresApi.md#getBusinessHours) | **GET** /api/v1.0/stores/{storeId}/availability/{deliveryType} | Get Business hours
[**getBusinessHoursOverrideByStoreId**](StoresApi.md#getBusinessHoursOverrideByStoreId) | **GET** /api/v1.0/stores/{storeId}/businesshoursoverrides | Get business hours overrides by store identifier
[**getEndOfDayReport**](StoresApi.md#getEndOfDayReport) | **GET** /api/v1.0/stores/{storeId}/endofdayreport | Get store end of day report
[**getPreOrderConfig**](StoresApi.md#getPreOrderConfig) | **GET** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType} | Get the pre order config for a store, by type
[**getPreOrderPreview**](StoresApi.md#getPreOrderPreview) | **GET** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType}/preview | Get the Preview times of the pre-order configuration
[**getProcessingFeeConfigsByStoreId**](StoresApi.md#getProcessingFeeConfigsByStoreId) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs | Get processing fee configs by store identifier
[**getProcessingFeeConfigsByStoreIdAndPaymentAccountType**](StoresApi.md#getProcessingFeeConfigsByStoreIdAndPaymentAccountType) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs/{paymentAccountType} | Get processing fee configs by store identifier
[**getStoreById**](StoresApi.md#getStoreById) | **GET** /api/v1.0/stores/{storeId} | Get store by identifier
[**getStoreHeadersByAppId**](StoresApi.md#getStoreHeadersByAppId) | **GET** /api/v1.0/{appId}/stores/header | Get all stores by app name id
[**getStoreNetSales**](StoresApi.md#getStoreNetSales) | **GET** /api/v1.0/{appId}/stores/stats | Get stores statistics by app name id and storeIds
[**getStoreServiceCharge**](StoresApi.md#getStoreServiceCharge) | **GET** /api/v1.0/stores/{storeId}/feeConfig | Retrieve Store feeConfig
[**getStoreServiceCharge_0**](StoresApi.md#getStoreServiceCharge_0) | **GET** /api/v1.0/stores/{storeId}/servicecharge | Retrieve Store Service Charge
[**getStores**](StoresApi.md#getStores) | **GET** /api/v1.0/stores | Get all stores, excluding archived ones
[**getStoresByAppId**](StoresApi.md#getStoresByAppId) | **GET** /api/v1.0/{appId}/stores | Get all stores by app name id
[**getStoresByStoreIdWithValidations**](StoresApi.md#getStoresByStoreIdWithValidations) | **GET** /api/v1.0/{appId}/storevalidation/kiosk | Get store validation by storeIds
[**publishStore**](StoresApi.md#publishStore) | **POST** /api/v1.0/stores/{storeId}/publish | Publish store
[**setBusinessHours**](StoresApi.md#setBusinessHours) | **POST** /api/v1.0/stores/{storeId}/availability/{deliveryType} | Set Business hours
[**setPreOrdeEnabled**](StoresApi.md#setPreOrdeEnabled) | **POST** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType}/enabled | UPDATE pre order config for a store, by type
[**unpublishStore**](StoresApi.md#unpublishStore) | **POST** /api/v1.0/stores/{storeId}/unpublish | Unpublish store
[**updatePreOrderConfig**](StoresApi.md#updatePreOrderConfig) | **POST** /api/v1.0/stores/{storeId}/preorderconfig/{deliveryType} | UPDATE pre order config for a store, by type
[**updateStore**](StoresApi.md#updateStore) | **POST** /api/v1.0/stores/{storeId} | Update store by identifier
[**updateStoreAddress**](StoresApi.md#updateStoreAddress) | **POST** /api/v1.0/stores/{storeId}/address | Update store address
[**updateStoreAddressCoordinates**](StoresApi.md#updateStoreAddressCoordinates) | **POST** /api/v1.0/stores/{storeId}/address/coordinates | Update store address coordinates
[**updateStoreAddressForm**](StoresApi.md#updateStoreAddressForm) | **POST** /api/v1.0/stores/{storeId}/addressform | Update store address


<a name="archiveStore"></a>
# **archiveStore**
> archiveStore(storeId)

Archive store

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
Integer storeId = 56; // Integer | Store identifier
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
 **storeId** | **Integer**| Store identifier |

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

Assign Menu to Store

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
Integer storeId = 56; // Integer | Store identifier
Integer menuId = 56; // Integer | Id of Menu to assign to store
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
 **storeId** | **Integer**| Store identifier |
 **menuId** | **Integer**| Id of Menu to assign to store |

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

Clone store with store clone settings

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
Integer storeId = 56; // Integer | Store identifier
StoreCloneSettings settings = new StoreCloneSettings(); // StoreCloneSettings | Settings for cloning the store
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
 **storeId** | **Integer**| Store identifier |
 **settings** | [**StoreCloneSettings**](StoreCloneSettings.md)| Settings for cloning the store |

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

Configure Store Service Charge; Idempotent Operation

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
Integer storeId = 56; // Integer | Store identifier
ServiceCharge serviceCharge = new ServiceCharge(); // ServiceCharge | Service charge
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
 **storeId** | **Integer**| Store identifier |
 **serviceCharge** | [**ServiceCharge**](ServiceCharge.md)| Service charge |

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

Create Business Hours Override for a store

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
Integer storeId = 56; // Integer | Store identifier
BusinessHoursOverrideBase businessHoursOverride = new BusinessHoursOverrideBase(); // BusinessHoursOverrideBase | Business Hours Override
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
 **storeId** | **Integer**| Store identifier |
 **businessHoursOverride** | [**BusinessHoursOverrideBase**](BusinessHoursOverrideBase.md)| Business Hours Override |

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

Create store with Store Group identifier

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
Integer storeGroupId = 56; // Integer | Store Group identifier
StoreCreateBase store = new StoreCreateBase(); // StoreCreateBase | Store
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
 **storeGroupId** | **Integer**| Store Group identifier |
 **store** | [**StoreCreateBase**](StoreCreateBase.md)| Store |

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

Delete Business Hours Override for a store

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

Get Stores Bank Account Id

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
Integer storeId = 56; // Integer | Store identifier
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
 **storeId** | **Integer**| Store identifier |

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

Get Business hours

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | Delivery type
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| Delivery type | [enum: Delivery, Pickup]

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

Get business hours overrides by store identifier

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
Integer storeId = 56; // Integer | Store identifier
OffsetDateTime after = OffsetDateTime.now(); // OffsetDateTime | Return results that ended after this datetime. Default value is the current datetime.
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
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
 **storeId** | **Integer**| Store identifier |
 **after** | **OffsetDateTime**| Return results that ended after this datetime. Default value is the current datetime. | [optional]
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

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

Get store end of day report

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
Integer storeId = 56; // Integer | Store identifier
OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | Store identifier
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
 **storeId** | **Integer**| Store identifier |
 **date** | **OffsetDateTime**| Store identifier | [optional]

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

Get the pre order config for a store, by type

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | \"delivery\" or \"pickup\"
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| \&quot;delivery\&quot; or \&quot;pickup\&quot; | [enum: Delivery, Pickup]

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

Get the Preview times of the pre-order configuration

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | \"delivery\" or \"pickup\"
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| \&quot;delivery\&quot; or \&quot;pickup\&quot; | [enum: Delivery, Pickup]
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

Get processing fee configs by store identifier

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
Integer storeId = 56; // Integer | Store identifier
String appNameId = "appNameId_example"; // String | App Name Id(Not used, still here for compatability reasons)
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
 **storeId** | **Integer**| Store identifier |
 **appNameId** | **String**| App Name Id(Not used, still here for compatability reasons) | [optional]

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

Get processing fee configs by store identifier

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
Integer storeId = 56; // Integer | Store identifier
String paymentAccountType = "paymentAccountType_example"; // String | 
String appNameId = "appNameId_example"; // String | App Name Id(Not used, still here for compatability reasons)
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
 **storeId** | **Integer**| Store identifier |
 **paymentAccountType** | **String**|  | [enum: Card, Cash, Ideal, Bancontact, Giropay, Eps, Emv, PayPal]
 **appNameId** | **String**| App Name Id(Not used, still here for compatability reasons) | [optional]

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

Get store by identifier

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
Integer storeId = 56; // Integer | Store identifier
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
 **storeId** | **Integer**| Store identifier |

### Return type

[**RestApiResultStore**](RestApiResultStore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreHeadersByAppId"></a>
# **getStoreHeadersByAppId**
> RestApiPaginationResultStoreHeader getStoreHeadersByAppId(appId, storeNameQuery, page, limit)

Get all stores by app name id

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
String appId = "appId_example"; // String | App Name Id
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
 **appId** | **String**| App Name Id |
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

<a name="getStoreNetSales"></a>
# **getStoreNetSales**
> RestApiArrayResultStoreStatistics getStoreNetSales(appId, storeId)

Get stores statistics by app name id and storeIds

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
String appId = "appId_example"; // String | App Name Id
List<Integer> storeId = Arrays.asList(56); // List<Integer> | Store Ids
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
 **appId** | **String**| App Name Id |
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| Store Ids |

### Return type

[**RestApiArrayResultStoreStatistics**](RestApiArrayResultStoreStatistics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreServiceCharge"></a>
# **getStoreServiceCharge**
> StoreFeeConfig getStoreServiceCharge(storeId)

Retrieve Store feeConfig

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
Integer storeId = 56; // Integer | Store identifier
try {
    StoreFeeConfig result = apiInstance.getStoreServiceCharge(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreServiceCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store identifier |

### Return type

[**StoreFeeConfig**](StoreFeeConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreServiceCharge_0"></a>
# **getStoreServiceCharge_0**
> ServiceCharge getStoreServiceCharge_0(storeId)

Retrieve Store Service Charge

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
Integer storeId = 56; // Integer | Store identifier
try {
    ServiceCharge result = apiInstance.getStoreServiceCharge_0(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoresApi#getStoreServiceCharge_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**| Store identifier |

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

Get all stores, excluding archived ones

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
String searchQuery = "searchQuery_example"; // String | Search query
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
Integer storeGroupId = 56; // Integer | Store Group Id
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
 **searchQuery** | **String**| Search query | [optional]
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]
 **storeGroupId** | **Integer**| Store Group Id | [optional]

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

Get all stores by app name id

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
String appId = "appId_example"; // String | App Name Id
String searchQuery = "searchQuery_example"; // String | Search query
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
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
 **appId** | **String**| App Name Id |
 **searchQuery** | **String**| Search query | [optional]
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

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

Get store validation by storeIds

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
List<Integer> storeId = Arrays.asList(56); // List<Integer> | Store identifier
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | Requested page index
Integer limit = 56; // Integer | Requested page limit
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
 **storeId** | [**List&lt;Integer&gt;**](Integer.md)| Store identifier |
 **appId** | **String**|  |
 **page** | **Integer**| Requested page index | [optional]
 **limit** | **Integer**| Requested page limit | [optional]

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

Publish store

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
Integer storeId = 56; // Integer | Store identifier
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
 **storeId** | **Integer**| Store identifier |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setBusinessHours"></a>
# **setBusinessHours**
> RestApiResultBusinessHoursPeriod setBusinessHours(storeId, deliveryType, businessHoursPeriod)

Set Business hours

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | Delivery type
BusinessHoursPeriodBase businessHoursPeriod = new BusinessHoursPeriodBase(); // BusinessHoursPeriodBase | Business Hours Period
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| Delivery type | [enum: Delivery, Pickup]
 **businessHoursPeriod** | [**BusinessHoursPeriodBase**](BusinessHoursPeriodBase.md)| Business Hours Period |

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

UPDATE pre order config for a store, by type

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | \"delivery\" or \"pickup\"
Boolean enabled = true; // Boolean | Update pre order config values
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| \&quot;delivery\&quot; or \&quot;pickup\&quot; | [enum: Delivery, Pickup]
 **enabled** | **Boolean**| Update pre order config values |

### Return type

[**RestApiArrayResultRestApiDefaultResponse**](RestApiArrayResultRestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unpublishStore"></a>
# **unpublishStore**
> unpublishStore(storeId)

Unpublish store

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
Integer storeId = 56; // Integer | Store identifier
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
 **storeId** | **Integer**| Store identifier |

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

UPDATE pre order config for a store, by type

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
Integer storeId = 56; // Integer | Store identifier
String deliveryType = "deliveryType_example"; // String | \"delivery\" or \"pickup\"
PreOrderConfig preOrderConfig = new PreOrderConfig(); // PreOrderConfig | Update pre order config values
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
 **storeId** | **Integer**| Store identifier |
 **deliveryType** | **String**| \&quot;delivery\&quot; or \&quot;pickup\&quot; | [enum: Delivery, Pickup]
 **preOrderConfig** | [**PreOrderConfig**](PreOrderConfig.md)| Update pre order config values |

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

Update store by identifier

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
Integer storeId = 56; // Integer | Store Group identifier
StoreBase store = new StoreBase(); // StoreBase | Store
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
 **storeId** | **Integer**| Store Group identifier |
 **store** | [**StoreBase**](StoreBase.md)| Store |

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

Update store address

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
Integer storeId = 56; // Integer | Store identifier
StoreAddressBase storeAddress = new StoreAddressBase(); // StoreAddressBase | Store address
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
 **storeId** | **Integer**| Store identifier |
 **storeAddress** | [**StoreAddressBase**](StoreAddressBase.md)| Store address |

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

Update store address coordinates

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
Integer storeId = 56; // Integer | Store identifier
Coordinates coordinates = new Coordinates(); // Coordinates | Store address coordinates
String appNameId = "appNameId_example"; // String | App Name Id(Not used, still here for compatability reasons)
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
 **storeId** | **Integer**| Store identifier |
 **coordinates** | [**Coordinates**](Coordinates.md)| Store address coordinates |
 **appNameId** | **String**| App Name Id(Not used, still here for compatability reasons) | [optional]

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

Update store address

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
Integer storeId = 56; // Integer | Store identifier
StoreAddressForm address = new StoreAddressForm(); // StoreAddressForm | Store address
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
 **storeId** | **Integer**| Store identifier |
 **address** | [**StoreAddressForm**](StoreAddressForm.md)| Store address |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

