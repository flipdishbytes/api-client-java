# StoresApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneStore**](StoresApi.md#cloneStore) | **POST** /api/v1.0/stores/{storeId}/clone | Clone store with store clone settings
[**createBusinessHoursOverrideByStoreId**](StoresApi.md#createBusinessHoursOverrideByStoreId) | **POST** /api/v1.0/stores/{storeId}/businesshoursoverrides | Create Business Hours Override for a store
[**createStore**](StoresApi.md#createStore) | **POST** /api/v1.0/stores | Create store with Store Group identifier
[**deleteBusinessHoursOverride**](StoresApi.md#deleteBusinessHoursOverride) | **DELETE** /api/v1.0/stores/{storeId}/businesshoursoverrides/{businessHoursOverrideId} | Delete Business Hours Override for a store
[**getBusinessHours**](StoresApi.md#getBusinessHours) | **GET** /api/v1.0/stores/{storeId}/availability/{deliveryType} | Get Bussiness hours
[**getBusinessHoursOverrideByStoreId**](StoresApi.md#getBusinessHoursOverrideByStoreId) | **GET** /api/v1.0/stores/{storeId}/businesshoursoverrides | Get business hours overrides by store identifier
[**getProcessingFeeConfigsByStoreId**](StoresApi.md#getProcessingFeeConfigsByStoreId) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs | Get processing fee configs by store identifier
[**getProcessingFeeConfigsByStoreIdAndPaymentAccountType**](StoresApi.md#getProcessingFeeConfigsByStoreIdAndPaymentAccountType) | **GET** /api/v1.0/stores/{storeId}/processingfeeconfigs/{paymentAccountType} | Get processing fee configs by store identifier
[**getStoreById**](StoresApi.md#getStoreById) | **GET** /api/v1.0/stores/{storeId} | Get store by identifier
[**getStores**](StoresApi.md#getStores) | **GET** /api/v1.0/stores | Get all stores
[**getStoresByAppId**](StoresApi.md#getStoresByAppId) | **GET** /api/v1.0/{appId}/stores | Get all stores by app name id
[**setBusinessHours**](StoresApi.md#setBusinessHours) | **POST** /api/v1.0/stores/{storeId}/availability/{deliveryType} | Set Bussiness hours
[**updateStore**](StoresApi.md#updateStore) | **POST** /api/v1.0/stores/{storeId} | Update store by identifier
[**updateStoreAddress**](StoresApi.md#updateStoreAddress) | **POST** /api/v1.0/stores/{storeId}/address | Update store address
[**updateStoreAddressCoordinates**](StoresApi.md#updateStoreAddressCoordinates) | **POST** /api/v1.0/stores/{storeId}/address/coordinates | Update store address coordinates


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

<a name="getBusinessHours"></a>
# **getBusinessHours**
> RestApiArrayResultBusinessHoursPeriod getBusinessHours(storeId, deliveryType)

Get Bussiness hours

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
String deliveryType = "deliveryType_example"; // String | Deliery type
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
 **deliveryType** | **String**| Deliery type | [enum: Delivery, Pickup]

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
 **paymentAccountType** | **String**|  | [enum: Card, Cash, Ideal, Bancontact, Giropay, Eps]
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

<a name="getStores"></a>
# **getStores**
> RestApiPaginationResultStore getStores(searchQuery, page, limit, storeGroupId)

Get all stores

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

<a name="setBusinessHours"></a>
# **setBusinessHours**
> RestApiResultBusinessHoursPeriod setBusinessHours(storeId, deliveryType, businessHoursPeriod)

Set Bussiness hours

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
String deliveryType = "deliveryType_example"; // String | Deliery type
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
 **deliveryType** | **String**| Deliery type | [enum: Delivery, Pickup]
 **businessHoursPeriod** | [**BusinessHoursPeriodBase**](BusinessHoursPeriodBase.md)| Business Hours Period |

### Return type

[**RestApiResultBusinessHoursPeriod**](RestApiResultBusinessHoursPeriod.md)

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

