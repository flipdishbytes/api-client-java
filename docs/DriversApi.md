# DriversApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDriverNotificationToken**](DriversApi.md#addDriverNotificationToken) | **POST** /api/v1.0/drivers/token | 
[**deleteDriverProfileImage**](DriversApi.md#deleteDriverProfileImage) | **DELETE** /api/v1.0/drivers/profile/image | 
[**driverLogin**](DriversApi.md#driverLogin) | **POST** /api/v1.0/drivers/login | 
[**driverRequestLoginCodeSms**](DriversApi.md#driverRequestLoginCodeSms) | **POST** /api/v1.0/drivers/pin | 
[**getDriverProfile**](DriversApi.md#getDriverProfile) | **GET** /api/v1.0/drivers/profile | 
[**getStoresForDriver**](DriversApi.md#getStoresForDriver) | **GET** /api/v1.0/drivers/assignedstores | 
[**removeDriverNotificationToken**](DriversApi.md#removeDriverNotificationToken) | **DELETE** /api/v1.0/drivers/token | 
[**setDriverPresenceForStore**](DriversApi.md#setDriverPresenceForStore) | **POST** /api/v1.0/drivers/stores/{storeId}/presence/{presence} | 
[**setDriverProfileImage**](DriversApi.md#setDriverProfileImage) | **POST** /api/v1.0/drivers/profile/image | 
[**updateDeliveryTrackingStatus**](DriversApi.md#updateDeliveryTrackingStatus) | **POST** /api/v1.0/orders/{orderId}/tracking/{deliveryTrackingStatus} | 
[**updateDriverProfile**](DriversApi.md#updateDriverProfile) | **POST** /api/v1.0/drivers/profile | 


<a name="addDriverNotificationToken"></a>
# **addDriverNotificationToken**
> Object addDriverNotificationToken(updateDriverToken)



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
    Object result = apiInstance.addDriverNotificationToken(updateDriverToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#addDriverNotificationToken");
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

<a name="deleteDriverProfileImage"></a>
# **deleteDriverProfileImage**
> Object deleteDriverProfileImage()



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
    Object result = apiInstance.deleteDriverProfileImage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#deleteDriverProfileImage");
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

<a name="driverLogin"></a>
# **driverLogin**
> Object driverLogin(driverLoginModel)



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
    Object result = apiInstance.driverLogin(driverLoginModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driverLogin");
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

<a name="driverRequestLoginCodeSms"></a>
# **driverRequestLoginCodeSms**
> Object driverRequestLoginCodeSms(driverRequestLoginPinModel)



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
    Object result = apiInstance.driverRequestLoginCodeSms(driverRequestLoginPinModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#driverRequestLoginCodeSms");
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

<a name="getDriverProfile"></a>
# **getDriverProfile**
> Object getDriverProfile()



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
    Object result = apiInstance.getDriverProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#getDriverProfile");
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

<a name="getStoresForDriver"></a>
# **getStoresForDriver**
> Object getStoresForDriver()



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
    Object result = apiInstance.getStoresForDriver();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#getStoresForDriver");
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

<a name="removeDriverNotificationToken"></a>
# **removeDriverNotificationToken**
> Object removeDriverNotificationToken(removeDriverToken)



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
    Object result = apiInstance.removeDriverNotificationToken(removeDriverToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#removeDriverNotificationToken");
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

<a name="setDriverPresenceForStore"></a>
# **setDriverPresenceForStore**
> Object setDriverPresenceForStore(storeId, presence)



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
    Object result = apiInstance.setDriverPresenceForStore(storeId, presence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#setDriverPresenceForStore");
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

<a name="setDriverProfileImage"></a>
# **setDriverProfileImage**
> Object setDriverProfileImage()



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
    Object result = apiInstance.setDriverProfileImage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#setDriverProfileImage");
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

<a name="updateDeliveryTrackingStatus"></a>
# **updateDeliveryTrackingStatus**
> Object updateDeliveryTrackingStatus(orderId, deliveryTrackingStatus)



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
    Object result = apiInstance.updateDeliveryTrackingStatus(orderId, deliveryTrackingStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#updateDeliveryTrackingStatus");
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

<a name="updateDriverProfile"></a>
# **updateDriverProfile**
> Object updateDriverProfile(updateDriverProfile)



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
    Object result = apiInstance.updateDriverProfile(updateDriverProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DriversApi#updateDriverProfile");
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

