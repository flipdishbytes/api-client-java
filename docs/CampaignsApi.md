# CampaignsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLoyaltyCampaign**](CampaignsApi.md#createLoyaltyCampaign) | **POST** /api/v1.0/{appId}/campaigns/loyalty | Creates loyalty campaign
[**createRetentionCampaign**](CampaignsApi.md#createRetentionCampaign) | **POST** /api/v1.0/{appId}/campaigns/retention | Creates retention campaign
[**getLoyaltyCampaignsForApp**](CampaignsApi.md#getLoyaltyCampaignsForApp) | **GET** /api/v1.0/{appId}/campaigns/loyalty | Gets loyalty campaigns for app
[**getLoyaltyCampaignsForStore**](CampaignsApi.md#getLoyaltyCampaignsForStore) | **GET** /api/v1.0/{appId}/campaigns/loyalty/{storeId} | Gets loyalty campaigns for store
[**getRetentionCampaignsForApp**](CampaignsApi.md#getRetentionCampaignsForApp) | **GET** /api/v1.0/{appId}/campaigns/retention | Gets retention campaigns for app
[**getRetentionCampaignsForStore**](CampaignsApi.md#getRetentionCampaignsForStore) | **GET** /api/v1.0/{appId}/campaigns/retention/{storeId} | Gets retention campaigns for store
[**getStoreList**](CampaignsApi.md#getStoreList) | **GET** /api/v1.0/{appId}/campaigns/stores | Gets list of stores for app
[**removeCampaign**](CampaignsApi.md#removeCampaign) | **DELETE** /api/v1.0/{appId}/campaigns/{campaignId} | Deletes a campaign
[**updateLoyaltyCampaign**](CampaignsApi.md#updateLoyaltyCampaign) | **POST** /api/v1.0/{appId}/campaigns/loyalty/{campaignId} | Updates loyalty campaign
[**updateRetentionCampaign**](CampaignsApi.md#updateRetentionCampaign) | **POST** /api/v1.0/{appId}/campaigns/retention/{campaignId} | Updates retention campaign


<a name="createLoyaltyCampaign"></a>
# **createLoyaltyCampaign**
> RestApiResultLoyaltyCampaign createLoyaltyCampaign(appId, campaign)

Creates loyalty campaign

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
LoyaltyCampaignBase campaign = new LoyaltyCampaignBase(); // LoyaltyCampaignBase | Loyalty campaign details
try {
    RestApiResultLoyaltyCampaign result = apiInstance.createLoyaltyCampaign(appId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createLoyaltyCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **campaign** | [**LoyaltyCampaignBase**](LoyaltyCampaignBase.md)| Loyalty campaign details |

### Return type

[**RestApiResultLoyaltyCampaign**](RestApiResultLoyaltyCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createRetentionCampaign"></a>
# **createRetentionCampaign**
> RestApiResultRetentionCampaign createRetentionCampaign(appId, campaign)

Creates retention campaign

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
RetentionCampaignBase campaign = new RetentionCampaignBase(); // RetentionCampaignBase | Retention campaign details
try {
    RestApiResultRetentionCampaign result = apiInstance.createRetentionCampaign(appId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createRetentionCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **campaign** | [**RetentionCampaignBase**](RetentionCampaignBase.md)| Retention campaign details |

### Return type

[**RestApiResultRetentionCampaign**](RestApiResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLoyaltyCampaignsForApp"></a>
# **getLoyaltyCampaignsForApp**
> RestApiArrayResultLoyaltyCampaign getLoyaltyCampaignsForApp(appId)

Gets loyalty campaigns for app

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
try {
    RestApiArrayResultLoyaltyCampaign result = apiInstance.getLoyaltyCampaignsForApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getLoyaltyCampaignsForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |

### Return type

[**RestApiArrayResultLoyaltyCampaign**](RestApiArrayResultLoyaltyCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLoyaltyCampaignsForStore"></a>
# **getLoyaltyCampaignsForStore**
> RestApiArrayResultLoyaltyCampaign getLoyaltyCampaignsForStore(appId, storeId)

Gets loyalty campaigns for store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Integer storeId = 56; // Integer | Store Id
try {
    RestApiArrayResultLoyaltyCampaign result = apiInstance.getLoyaltyCampaignsForStore(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getLoyaltyCampaignsForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **storeId** | **Integer**| Store Id |

### Return type

[**RestApiArrayResultLoyaltyCampaign**](RestApiArrayResultLoyaltyCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRetentionCampaignsForApp"></a>
# **getRetentionCampaignsForApp**
> RestApiArrayResultRetentionCampaign getRetentionCampaignsForApp(appId)

Gets retention campaigns for app

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
try {
    RestApiArrayResultRetentionCampaign result = apiInstance.getRetentionCampaignsForApp(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getRetentionCampaignsForApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |

### Return type

[**RestApiArrayResultRetentionCampaign**](RestApiArrayResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRetentionCampaignsForStore"></a>
# **getRetentionCampaignsForStore**
> RestApiArrayResultRetentionCampaign getRetentionCampaignsForStore(appId, storeId)

Gets retention campaigns for store

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Integer storeId = 56; // Integer | Store Id
try {
    RestApiArrayResultRetentionCampaign result = apiInstance.getRetentionCampaignsForStore(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getRetentionCampaignsForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **storeId** | **Integer**| Store Id |

### Return type

[**RestApiArrayResultRetentionCampaign**](RestApiArrayResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getStoreList"></a>
# **getStoreList**
> RestApiArrayResultStoreListItem getStoreList(appId, onlyPublished)

Gets list of stores for app

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Boolean onlyPublished = true; // Boolean | 
try {
    RestApiArrayResultStoreListItem result = apiInstance.getStoreList(appId, onlyPublished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getStoreList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **onlyPublished** | **Boolean**|  | [optional]

### Return type

[**RestApiArrayResultStoreListItem**](RestApiArrayResultStoreListItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeCampaign"></a>
# **removeCampaign**
> removeCampaign(appId, campaignId)

Deletes a campaign

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Integer campaignId = 56; // Integer | Campaign Id
try {
    apiInstance.removeCampaign(appId, campaignId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#removeCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **campaignId** | **Integer**| Campaign Id |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateLoyaltyCampaign"></a>
# **updateLoyaltyCampaign**
> RestApiResultLoyaltyCampaign updateLoyaltyCampaign(appId, campaignId, campaign)

Updates loyalty campaign

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Integer campaignId = 56; // Integer | Loyalty campaign Id
LoyaltyCampaignBase campaign = new LoyaltyCampaignBase(); // LoyaltyCampaignBase | Loyalty campaign details
try {
    RestApiResultLoyaltyCampaign result = apiInstance.updateLoyaltyCampaign(appId, campaignId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateLoyaltyCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **campaignId** | **Integer**| Loyalty campaign Id |
 **campaign** | [**LoyaltyCampaignBase**](LoyaltyCampaignBase.md)| Loyalty campaign details |

### Return type

[**RestApiResultLoyaltyCampaign**](RestApiResultLoyaltyCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateRetentionCampaign"></a>
# **updateRetentionCampaign**
> RestApiResultRetentionCampaign updateRetentionCampaign(appId, campaignId, campaign)

Updates retention campaign

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CampaignsApi apiInstance = new CampaignsApi();
String appId = "appId_example"; // String | App Name Id
Integer campaignId = 56; // Integer | Retention campaign Id
RetentionCampaignBase campaign = new RetentionCampaignBase(); // RetentionCampaignBase | Retention campaign details
try {
    RestApiResultRetentionCampaign result = apiInstance.updateRetentionCampaign(appId, campaignId, campaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateRetentionCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| App Name Id |
 **campaignId** | **Integer**| Retention campaign Id |
 **campaign** | [**RetentionCampaignBase**](RetentionCampaignBase.md)| Retention campaign details |

### Return type

[**RestApiResultRetentionCampaign**](RestApiResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

