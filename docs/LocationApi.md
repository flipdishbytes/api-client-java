# LocationApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](LocationApi.md#createLocation) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location | 
[**deleteLocation**](LocationApi.md#deleteLocation) | **DELETE** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/delete | 
[**mapLocationToExternalId**](LocationApi.md#mapLocationToExternalId) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/map-external | 
[**moveLocation**](LocationApi.md#moveLocation) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/move | 
[**updateLocation**](LocationApi.md#updateLocation) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location/{locationId}/update | 


<a name="createLocation"></a>
# **createLocation**
> Object createLocation(createLocationInput, locationAreaId, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationApi apiInstance = new LocationApi();
List<CreateLocation> createLocationInput = Arrays.asList(new CreateLocation()); // List<CreateLocation> | 
Integer locationAreaId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.createLocation(createLocationInput, locationAreaId, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#createLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createLocationInput** | [**List&lt;CreateLocation&gt;**](CreateLocation.md)|  |
 **locationAreaId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteLocation"></a>
# **deleteLocation**
> Object deleteLocation(locationId, locationAreaId, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | 
Integer locationAreaId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.deleteLocation(locationId, locationAreaId, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**|  |
 **locationAreaId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="mapLocationToExternalId"></a>
# **mapLocationToExternalId**
> RestApiResultMappedLocation mapLocationToExternalId(locationId, locationAreaId, appId, storeId, externalLocationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | 
Integer locationAreaId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
String externalLocationId = "externalLocationId_example"; // String | 
try {
    RestApiResultMappedLocation result = apiInstance.mapLocationToExternalId(locationId, locationAreaId, appId, storeId, externalLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#mapLocationToExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**|  |
 **locationAreaId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **externalLocationId** | **String**|  | [optional]

### Return type

[**RestApiResultMappedLocation**](RestApiResultMappedLocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="moveLocation"></a>
# **moveLocation**
> Object moveLocation(locationId, locationAreaId, newLocationAreaId, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationApi apiInstance = new LocationApi();
Integer locationId = 56; // Integer | 
Integer locationAreaId = 56; // Integer | 
Integer newLocationAreaId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.moveLocation(locationId, locationAreaId, newLocationAreaId, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#moveLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Integer**|  |
 **locationAreaId** | **Integer**|  |
 **newLocationAreaId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateLocation"></a>
# **updateLocation**
> RestApiResultLocationAreaLocation updateLocation(updateLocationInput, locationAreaId, locationId, appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.LocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

LocationApi apiInstance = new LocationApi();
CreateLocation updateLocationInput = new CreateLocation(); // CreateLocation | 
Integer locationAreaId = 56; // Integer | 
Integer locationId = 56; // Integer | 
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    RestApiResultLocationAreaLocation result = apiInstance.updateLocation(updateLocationInput, locationAreaId, locationId, appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateLocationInput** | [**CreateLocation**](CreateLocation.md)|  |
 **locationAreaId** | **Integer**|  |
 **locationId** | **Integer**|  |
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiResultLocationAreaLocation**](RestApiResultLocationAreaLocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

