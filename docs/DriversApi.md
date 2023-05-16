# DriversApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**driversAddDriverNotificationToken**](DriversApi.md#driversAddDriverNotificationToken) | **POST** /api/v1.0/drivers/token | 
[**driversDeleteDriverProfileImage**](DriversApi.md#driversDeleteDriverProfileImage) | **DELETE** /api/v1.0/drivers/profile/image | 
[**driversDriverLogin**](DriversApi.md#driversDriverLogin) | **POST** /api/v1.0/drivers/login | 
[**driversDriverRequestLoginCodeSms**](DriversApi.md#driversDriverRequestLoginCodeSms) | **POST** /api/v1.0/drivers/pin | 
[**driversGetDriverProfile**](DriversApi.md#driversGetDriverProfile) | **GET** /api/v1.0/drivers/profile | 
[**driversGetStoresForDriver**](DriversApi.md#driversGetStoresForDriver) | **GET** /api/v1.0/drivers/assignedstores | 
[**driversRemoveDriverNotificationToken**](DriversApi.md#driversRemoveDriverNotificationToken) | **DELETE** /api/v1.0/drivers/token | 
[**driversSetDriverPresenceForStore**](DriversApi.md#driversSetDriverPresenceForStore) | **POST** /api/v1.0/drivers/stores/{storeId}/presence/{presence} | 
[**driversSetDriverProfileImage**](DriversApi.md#driversSetDriverProfileImage) | **POST** /api/v1.0/drivers/profile/image | 
[**driversUpdateDeliveryTrackingStatus**](DriversApi.md#driversUpdateDeliveryTrackingStatus) | **POST** /api/v1.0/orders/{orderId}/tracking/{deliveryTrackingStatus} | 
[**driversUpdateDriverProfile**](DriversApi.md#driversUpdateDriverProfile) | **POST** /api/v1.0/drivers/profile | 


<a name="driversAddDriverNotificationToken"></a>
# **driversAddDriverNotificationToken**
> Object driversAddDriverNotificationToken(updateDriverToken)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
UpdateDriverNotificationToken updateDriverToken = new UpdateDriverNotificationToken(); // UpdateDriverNotificationToken | 
try {
    Object result = apiInstance.driversAddDriverNotificationToken(updateDriverToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversAddDriverNotificationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDriverToken** | [**UpdateDriverNotificationToken**](UpdateDriverNotificationToken.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversDeleteDriverProfileImage"></a>
# **driversDeleteDriverProfileImage**
> Object driversDeleteDriverProfileImage()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
try {
    Object result = apiInstance.driversDeleteDriverProfileImage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversDeleteDriverProfileImage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversDriverLogin"></a>
# **driversDriverLogin**
> Object driversDriverLogin(driverLoginModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
DriverLoginModel driverLoginModel = new DriverLoginModel(); // DriverLoginModel | 
try {
    Object result = apiInstance.driversDriverLogin(driverLoginModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversDriverLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverLoginModel** | [**DriverLoginModel**](DriverLoginModel.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversDriverRequestLoginCodeSms"></a>
# **driversDriverRequestLoginCodeSms**
> Object driversDriverRequestLoginCodeSms(driverRequestLoginPinModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
DriverRequestLoginPinModel driverRequestLoginPinModel = new DriverRequestLoginPinModel(); // DriverRequestLoginPinModel | 
try {
    Object result = apiInstance.driversDriverRequestLoginCodeSms(driverRequestLoginPinModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversDriverRequestLoginCodeSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **driverRequestLoginPinModel** | [**DriverRequestLoginPinModel**](DriverRequestLoginPinModel.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversGetDriverProfile"></a>
# **driversGetDriverProfile**
> Object driversGetDriverProfile()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
try {
    Object result = apiInstance.driversGetDriverProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversGetDriverProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversGetStoresForDriver"></a>
# **driversGetStoresForDriver**
> Object driversGetStoresForDriver()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
try {
    Object result = apiInstance.driversGetStoresForDriver();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversGetStoresForDriver");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversRemoveDriverNotificationToken"></a>
# **driversRemoveDriverNotificationToken**
> Object driversRemoveDriverNotificationToken(removeDriverToken)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
UpdateDriverNotificationToken removeDriverToken = new UpdateDriverNotificationToken(); // UpdateDriverNotificationToken | 
try {
    Object result = apiInstance.driversRemoveDriverNotificationToken(removeDriverToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversRemoveDriverNotificationToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **removeDriverToken** | [**UpdateDriverNotificationToken**](UpdateDriverNotificationToken.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversSetDriverPresenceForStore"></a>
# **driversSetDriverPresenceForStore**
> Object driversSetDriverPresenceForStore(storeId, presence)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
Integer storeId = 56; // Integer | 
String presence = "presence_example"; // String | 
try {
    Object result = apiInstance.driversSetDriverPresenceForStore(storeId, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversSetDriverPresenceForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **presence** | **String**|  | [enum: Offline, Online]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversSetDriverProfileImage"></a>
# **driversSetDriverProfileImage**
> Object driversSetDriverProfileImage()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
try {
    Object result = apiInstance.driversSetDriverProfileImage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversSetDriverProfileImage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversUpdateDeliveryTrackingStatus"></a>
# **driversUpdateDeliveryTrackingStatus**
> Object driversUpdateDeliveryTrackingStatus(orderId, deliveryTrackingStatus)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
Integer orderId = 56; // Integer | 
String deliveryTrackingStatus = "deliveryTrackingStatus_example"; // String | 
try {
    Object result = apiInstance.driversUpdateDeliveryTrackingStatus(orderId, deliveryTrackingStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversUpdateDeliveryTrackingStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **deliveryTrackingStatus** | **String**|  | [enum: Unassigned, Unaccepted, Accepted, Carrying, OnTheWay, ArrivedAtLocation, Delivered, CannotDeliver]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="driversUpdateDriverProfile"></a>
# **driversUpdateDriverProfile**
> Object driversUpdateDriverProfile(updateDriverProfile)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.DriversApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DriversApi apiInstance = new DriversApi();
UpdateDriverProfileModel updateDriverProfile = new UpdateDriverProfileModel(); // UpdateDriverProfileModel | 
try {
    Object result = apiInstance.driversUpdateDriverProfile(updateDriverProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driversUpdateDriverProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDriverProfile** | [**UpdateDriverProfileModel**](UpdateDriverProfileModel.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

