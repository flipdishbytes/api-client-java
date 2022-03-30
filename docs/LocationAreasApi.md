# LocationAreasApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocationArea**](LocationAreasApi.md#createLocationArea) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas | Create a Location Area, i.e: Room, Floor, Parking lot
[**getLocationArea**](LocationAreasApi.md#getLocationArea) | **GET** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId} | Retrieve a Location Area
[**getLocationAreasForStore**](LocationAreasApi.md#getLocationAreasForStore) | **GET** /api/v1.0/{appId}/stores/{storeId}/location-areas | Retrieve all Location Areas for a Store
[**updateLocationArea**](LocationAreasApi.md#updateLocationArea) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/update | Update a Location Area, i.e: Room, Floor, Car park space


<a name="createLocationArea"></a>
# **createLocationArea**
> Object createLocationArea(locationAreaInput, appId, storeId)

Create a Location Area, i.e: Room, Floor, Parking lot

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
CreateLocationArea locationAreaInput = new CreateLocationArea(); // CreateLocationArea | Input data for creating the Location Area
String appId = "appId_example"; // String | AppId i.e: (fd1234)
Integer storeId = 56; // Integer | Id of the Store
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
 **locationAreaInput** | [**CreateLocationArea**](CreateLocationArea.md)| Input data for creating the Location Area |
 **appId** | **String**| AppId i.e: (fd1234) |
 **storeId** | **Integer**| Id of the Store |

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

Retrieve a Location Area

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
Integer locationAreaId = 56; // Integer | Id of the Location Area
String appId = "appId_example"; // String | AppId i.e: (fd1234)
Integer storeId = 56; // Integer | Id of the Store
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
 **locationAreaId** | **Integer**| Id of the Location Area |
 **appId** | **String**| AppId i.e: (fd1234) |
 **storeId** | **Integer**| Id of the Store |

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

Retrieve all Location Areas for a Store

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
String appId = "appId_example"; // String | AppId i.e: (fd1234)
Integer storeId = 56; // Integer | Id of the Store
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
 **appId** | **String**| AppId i.e: (fd1234) |
 **storeId** | **Integer**| Id of the Store |

### Return type

[**RestApiArrayResultLocationAreaWithLocations**](RestApiArrayResultLocationAreaWithLocations.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateLocationArea"></a>
# **updateLocationArea**
> LocationArea updateLocationArea(locationAreaInput, appId, storeId, locationAreaId)

Update a Location Area, i.e: Room, Floor, Car park space

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
UpdateLocationArea locationAreaInput = new UpdateLocationArea(); // UpdateLocationArea | Input data for updating the Location Area
String appId = "appId_example"; // String | AppId i.e: (fd1234)
Integer storeId = 56; // Integer | Id of the Store
String locationAreaId = "locationAreaId_example"; // String | 
try {
    LocationArea result = apiInstance.updateLocationArea(locationAreaInput, appId, storeId, locationAreaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationAreasApi#updateLocationArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationAreaInput** | [**UpdateLocationArea**](UpdateLocationArea.md)| Input data for updating the Location Area |
 **appId** | **String**| AppId i.e: (fd1234) |
 **storeId** | **Integer**| Id of the Store |
 **locationAreaId** | **String**|  |

### Return type

[**LocationArea**](LocationArea.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

