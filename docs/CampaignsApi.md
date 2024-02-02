# CampaignsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLoyaltyCampaign**](CampaignsApi.md#createLoyaltyCampaign) | **POST** /api/v1.0/{appId}/campaigns/loyalty | 
[**createRetentionCampaign**](CampaignsApi.md#createRetentionCampaign) | **POST** /api/v1.0/{appId}/campaigns/retention | 
[**fetchLoyaltyCampaignByPublicId**](CampaignsApi.md#fetchLoyaltyCampaignByPublicId) | **GET** /api/v1.0/{appId}/campaigns/loyalty/publicId/{campaignPublicId} | 
[**getLoyaltyCampaignsForApp**](CampaignsApi.md#getLoyaltyCampaignsForApp) | **GET** /api/v1.0/{appId}/campaigns/loyalty | 
[**getLoyaltyCampaignsForStore**](CampaignsApi.md#getLoyaltyCampaignsForStore) | **GET** /api/v1.0/{appId}/campaigns/loyalty/{storeId} | 
[**getRetentionCampaignsForApp**](CampaignsApi.md#getRetentionCampaignsForApp) | **GET** /api/v1.0/{appId}/campaigns/retention | 
[**getRetentionCampaignsForStore**](CampaignsApi.md#getRetentionCampaignsForStore) | **GET** /api/v1.0/{appId}/campaigns/retention/{storeId} | 
[**getStoreList**](CampaignsApi.md#getStoreList) | **GET** /api/v1.0/{appId}/campaigns/stores | 
[**removeCampaign**](CampaignsApi.md#removeCampaign) | **DELETE** /api/v1.0/{appId}/campaigns/{campaignId} | 
[**updateLoyaltyCampaign**](CampaignsApi.md#updateLoyaltyCampaign) | **POST** /api/v1.0/{appId}/campaigns/loyalty/{campaignId} | 
[**updateRetentionCampaign**](CampaignsApi.md#updateRetentionCampaign) | **POST** /api/v1.0/{appId}/campaigns/retention/{campaignId} | 


<a name="createLoyaltyCampaign"></a>
# **createLoyaltyCampaign**
> RestApiResultLoyaltyCampaign createLoyaltyCampaign(appId, campaign)



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
String appId = "appId_example"; // String | 
LoyaltyCampaignBase campaign = new LoyaltyCampaignBase(); // LoyaltyCampaignBase | 
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
 **appId** | **String**|  |
 **campaign** | [**LoyaltyCampaignBase**](LoyaltyCampaignBase.md)|  |

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
String appId = "appId_example"; // String | 
RetentionCampaignBase campaign = new RetentionCampaignBase(); // RetentionCampaignBase | 
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
 **appId** | **String**|  |
 **campaign** | [**RetentionCampaignBase**](RetentionCampaignBase.md)|  |

### Return type

[**RestApiResultRetentionCampaign**](RestApiResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="fetchLoyaltyCampaignByPublicId"></a>
# **fetchLoyaltyCampaignByPublicId**
> RestApiArrayResultLoyaltyCampaign fetchLoyaltyCampaignByPublicId(appId, campaignPublicId)



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
String appId = "appId_example"; // String | 
UUID campaignPublicId = new UUID(); // UUID | 
try {
    RestApiArrayResultLoyaltyCampaign result = apiInstance.fetchLoyaltyCampaignByPublicId(appId, campaignPublicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#fetchLoyaltyCampaignByPublicId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **campaignPublicId** | [**UUID**](.md)|  |

### Return type

[**RestApiArrayResultLoyaltyCampaign**](RestApiArrayResultLoyaltyCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLoyaltyCampaignsForApp"></a>
# **getLoyaltyCampaignsForApp**
> RestApiArrayResultLoyaltyCampaign getLoyaltyCampaignsForApp(appId)



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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |

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
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
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
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |

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
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
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
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

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
String appId = "appId_example"; // String | 
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
 **appId** | **String**|  |
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
String appId = "appId_example"; // String | 
Integer campaignId = 56; // Integer | 
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
 **appId** | **String**|  |
 **campaignId** | **Integer**|  |

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
String appId = "appId_example"; // String | 
Integer campaignId = 56; // Integer | 
LoyaltyCampaignBase campaign = new LoyaltyCampaignBase(); // LoyaltyCampaignBase | 
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
 **appId** | **String**|  |
 **campaignId** | **Integer**|  |
 **campaign** | [**LoyaltyCampaignBase**](LoyaltyCampaignBase.md)|  |

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
String appId = "appId_example"; // String | 
Integer campaignId = 56; // Integer | 
RetentionCampaignBase campaign = new RetentionCampaignBase(); // RetentionCampaignBase | 
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
 **appId** | **String**|  |
 **campaignId** | **Integer**|  |
 **campaign** | [**RetentionCampaignBase**](RetentionCampaignBase.md)|  |

### Return type

[**RestApiResultRetentionCampaign**](RestApiResultRetentionCampaign.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

