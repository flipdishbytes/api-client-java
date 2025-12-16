# LocationAreasApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocationArea**](LocationAreasApi.md#createLocationArea) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas | 
[**getLocationArea**](LocationAreasApi.md#getLocationArea) | **GET** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId} | 
[**getLocationAreasForStore**](LocationAreasApi.md#getLocationAreasForStore) | **GET** /api/v1.0/{appId}/stores/{storeId}/location-areas | 
[**updateLocationArea**](LocationAreasApi.md#updateLocationArea) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/update | 


<a name="createLocationArea"></a>
# **createLocationArea**
> Object createLocationArea(locationAreaInput, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationAreasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationAreasApi apiInstance = new LocationAreasApi();
CreateLocationArea locationAreaInput = new CreateLocationArea(); // CreateLocationArea | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.createLocationArea(locationAreaInput, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreasApi#createLocationArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAreaInput** | [**CreateLocationArea**](CreateLocationArea.md)|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLocationArea"></a>
# **getLocationArea**
> RestApiResultLocationAreaWithLocations getLocationArea(locationAreaId, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationAreasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationAreasApi apiInstance = new LocationAreasApi();
Integer locationAreaId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultLocationAreaWithLocations result = apiInstance.getLocationArea(locationAreaId, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreasApi#getLocationArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAreaId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultLocationAreaWithLocations**](RestApiResultLocationAreaWithLocations.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLocationAreasForStore"></a>
# **getLocationAreasForStore**
> RestApiArrayResultLocationAreaWithLocations getLocationAreasForStore(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationAreasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationAreasApi apiInstance = new LocationAreasApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiArrayResultLocationAreaWithLocations result = apiInstance.getLocationAreasForStore(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreasApi#getLocationAreasForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiArrayResultLocationAreaWithLocations**](RestApiArrayResultLocationAreaWithLocations.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateLocationArea"></a>
# **updateLocationArea**
> RestApiResultLocationArea updateLocationArea(locationAreaInput, appId, storeId, locationAreaId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationAreasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationAreasApi apiInstance = new LocationAreasApi();
UpdateLocationArea locationAreaInput = new UpdateLocationArea(); // UpdateLocationArea | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String locationAreaId = "locationAreaId_example"; // String | 
try {
    RestApiResultLocationArea result = apiInstance.updateLocationArea(locationAreaInput, appId, storeId, locationAreaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreasApi#updateLocationArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAreaInput** | [**UpdateLocationArea**](UpdateLocationArea.md)|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **locationAreaId** | **String**|  |

### Return type

[**RestApiResultLocationArea**](RestApiResultLocationArea.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

