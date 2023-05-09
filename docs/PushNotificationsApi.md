# PushNotificationsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePushNotification**](PushNotificationsApi.md#deletePushNotification) | **DELETE** /api/v1.0/{appId}/pushnotifications/{scheduledPushNotificationId} | 
[**getPushNotifications**](PushNotificationsApi.md#getPushNotifications) | **GET** /api/v1.0/{appId}/pushnotifications | 
[**schedulePushNotification**](PushNotificationsApi.md#schedulePushNotification) | **POST** /api/v1.0/{appId}/pushnotifications | 
[**updatePushNotification**](PushNotificationsApi.md#updatePushNotification) | **POST** /api/v1.0/{appId}/pushnotifications/{scheduledPushNotificationId} | 


<a name="deletePushNotification"></a>
# **deletePushNotification**
> deletePushNotification(appId, scheduledPushNotificationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PushNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PushNotificationsApi apiInstance = new PushNotificationsApi();
String appId = "appId_example"; // String | 
Integer scheduledPushNotificationId = 56; // Integer | 
try {
    apiInstance.deletePushNotification(appId, scheduledPushNotificationId);
} catch (ApiException e) {
    System.err.println("Exception when calling PushNotificationsApi#deletePushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **scheduledPushNotificationId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPushNotifications"></a>
# **getPushNotifications**
> RestApiPaginationResultPushNotificationResponse getPushNotifications(appId, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PushNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PushNotificationsApi apiInstance = new PushNotificationsApi();
String appId = "appId_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultPushNotificationResponse result = apiInstance.getPushNotifications(appId, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushNotificationsApi#getPushNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultPushNotificationResponse**](RestApiPaginationResultPushNotificationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="schedulePushNotification"></a>
# **schedulePushNotification**
> RestApiResultPushNotificationResponse schedulePushNotification(appId, notification)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PushNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PushNotificationsApi apiInstance = new PushNotificationsApi();
String appId = "appId_example"; // String | 
PushNotificationRequest notification = new PushNotificationRequest(); // PushNotificationRequest | 
try {
    RestApiResultPushNotificationResponse result = apiInstance.schedulePushNotification(appId, notification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushNotificationsApi#schedulePushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **notification** | [**PushNotificationRequest**](PushNotificationRequest.md)|  |

### Return type

[**RestApiResultPushNotificationResponse**](RestApiResultPushNotificationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updatePushNotification"></a>
# **updatePushNotification**
> RestApiResultPushNotificationResponse updatePushNotification(appId, scheduledPushNotificationId, notification)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.PushNotificationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PushNotificationsApi apiInstance = new PushNotificationsApi();
String appId = "appId_example"; // String | 
Integer scheduledPushNotificationId = 56; // Integer | 
PushNotificationRequest notification = new PushNotificationRequest(); // PushNotificationRequest | 
try {
    RestApiResultPushNotificationResponse result = apiInstance.updatePushNotification(appId, scheduledPushNotificationId, notification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushNotificationsApi#updatePushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **scheduledPushNotificationId** | **Integer**|  |
 **notification** | [**PushNotificationRequest**](PushNotificationRequest.md)|  |

### Return type

[**RestApiResultPushNotificationResponse**](RestApiResultPushNotificationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

