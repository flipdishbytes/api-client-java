# LocationApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](LocationApi.md#createLocation) | **POST** /api/v1.0/{appId}/stores/{storeId}/location-areas/{locationAreaId}/location | Create a Location i.e: Table, Hotel Room, Car park space


<a name="createLocation"></a>
# **createLocation**
> Object createLocation(createLocationInput, locationAreaId, appId, storeId)

Create a Location i.e: Table, Hotel Room, Car park space

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
CreateLocation createLocationInput = new CreateLocation(); // CreateLocation | Input data for creating the Location
Integer locationAreaId = 56; // Integer | Id of the Location area where the Location belongs
String appId = "appId_example"; // String | AppId i.e: (fd1234)
Integer storeId = 56; // Integer | Id of the Store
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
 **createLocationInput** | [**CreateLocation**](CreateLocation.md)| Input data for creating the Location |
 **locationAreaId** | **Integer**| Id of the Location area where the Location belongs |
 **appId** | **String**| AppId i.e: (fd1234) |
 **storeId** | **Integer**| Id of the Store |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

