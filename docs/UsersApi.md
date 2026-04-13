# UsersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserNote**](UsersApi.md#addUserNote) | **POST** /api/v1.0/users/{userId}/AddUserNote | 
[**addUserToRole**](UsersApi.md#addUserToRole) | **POST** /api/v1.0/users/{userId}/AddUserToRole/{roleName} | 
[**anonymizeUser**](UsersApi.md#anonymizeUser) | **POST** /api/v1.0/users/{userId}/AnonymizeUser | 
[**blockUserPhoneNumber**](UsersApi.md#blockUserPhoneNumber) | **POST** /api/v1.0/users/{userId}/BlockUserPhoneNumber | 
[**createUserDeliveryLocation**](UsersApi.md#createUserDeliveryLocation) | **POST** /api/v1.0/users/{userId}/deliveryLocations | 
[**getPreviousOrderCountForStore**](UsersApi.md#getPreviousOrderCountForStore) | **GET** /api/v1.0/users/{userId}/previousordercount/{storeId} | 
[**getRestaurantUserAccounts**](UsersApi.md#getRestaurantUserAccounts) | **GET** /api/v1.0/users/{userId}/RestaurantUserAccounts | 
[**getRestaurantUserStores**](UsersApi.md#getRestaurantUserStores) | **GET** /api/v1.0/users/{userId}/RestaurantUserStores | 
[**getRoles**](UsersApi.md#getRoles) | **GET** /api/v1.0/users/roles | 
[**getRolesAndUnassignedRoles**](UsersApi.md#getRolesAndUnassignedRoles) | **GET** /api/v1.0/users/{userId}/roles | 
[**getUserById**](UsersApi.md#getUserById) | **GET** /api/v1.0/users/{userId} | 
[**getUserDeliveryLocationsForAdmin**](UsersApi.md#getUserDeliveryLocationsForAdmin) | **GET** /api/v1.0/users/{userId}/deliveryLocations | 
[**getUserNotes**](UsersApi.md#getUserNotes) | **GET** /api/v1.0/users/{userId}/UserNotes | 
[**getUserOrderByIdForAdmin**](UsersApi.md#getUserOrderByIdForAdmin) | **GET** /api/v1.0/users/{userId}/orders/{orderId} | 
[**getUserOrdersForAdmin**](UsersApi.md#getUserOrdersForAdmin) | **GET** /api/v1.0/users/{userId}/orders | 
[**getUserSmsConversationItems**](UsersApi.md#getUserSmsConversationItems) | **GET** /api/v1.0/users/{userId}/smsConversationItems | 
[**hideUserDeliveryLocation**](UsersApi.md#hideUserDeliveryLocation) | **POST** /api/v1.0/users/{userId}/deliveryLocations/{deliveryLocationId}/hide | 
[**markUserAsFraudulent**](UsersApi.md#markUserAsFraudulent) | **POST** /api/v1.0/users/{userId}/MarkUserAsFraudulent | 
[**markUserAsSuspicious**](UsersApi.md#markUserAsSuspicious) | **POST** /api/v1.0/users/{userId}/MarkUserAsSuspicious | 
[**removeFlipdishAccountIdForUser**](UsersApi.md#removeFlipdishAccountIdForUser) | **POST** /api/v1.0/users/{userId}/RemoveFlipdishAccountId/{accountId} | 
[**removeUserFromRole**](UsersApi.md#removeUserFromRole) | **POST** /api/v1.0/users/{userId}/RemoveUserFromRole/{roleName} | 
[**resetMfa**](UsersApi.md#resetMfa) | **POST** /api/v1.0/users/{userId}/ResetMfa | 
[**searchFlipdishAccounts**](UsersApi.md#searchFlipdishAccounts) | **GET** /api/v1.0/users/searchFlipdishAccounts | 
[**searchUsers**](UsersApi.md#searchUsers) | **GET** /api/v1.0/users/search | 
[**sendUserPushNotification**](UsersApi.md#sendUserPushNotification) | **POST** /api/v1.0/users/{userId}/pushNotifications | 
[**sendUserSms**](UsersApi.md#sendUserSms) | **POST** /api/v1.0/users/{userId}/sms | 
[**setCustomerName**](UsersApi.md#setCustomerName) | **POST** /api/v1.0/users/{userId}/SetCustomerName | 
[**setFlipdishAccountIdForUser**](UsersApi.md#setFlipdishAccountIdForUser) | **POST** /api/v1.0/users/{userId}/SetFlipdishAccountId/{accountId} | 
[**setUserDeliveryLocationCoordinates**](UsersApi.md#setUserDeliveryLocationCoordinates) | **POST** /api/v1.0/users/{userId}/deliveryLocations/{deliveryLocationId}/coordinates | 
[**setUserDeliveryLocationField**](UsersApi.md#setUserDeliveryLocationField) | **POST** /api/v1.0/users/{userId}/deliveryLocations/{deliveryLocationId}/fields | 
[**setUserLanguage**](UsersApi.md#setUserLanguage) | **POST** /api/v1.0/users/{userId}/SetLanguage/{languageId} | 
[**unblockUserPhoneNumber**](UsersApi.md#unblockUserPhoneNumber) | **POST** /api/v1.0/users/{userId}/UnblockUserPhoneNumber | 


<a name="addUserNote"></a>
# **addUserNote**
> RestApiDefaultResponse addUserNote(userId, note)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String note = "note_example"; // String | 
try {
    RestApiDefaultResponse result = apiInstance.addUserNote(userId, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addUserNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **note** | **String**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="addUserToRole"></a>
# **addUserToRole**
> RestApiResultUserRole addUserToRole(userId, roleName)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String roleName = "roleName_example"; // String | 
try {
    RestApiResultUserRole result = apiInstance.addUserToRole(userId, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addUserToRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **roleName** | **String**|  |

### Return type

[**RestApiResultUserRole**](RestApiResultUserRole.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="anonymizeUser"></a>
# **anonymizeUser**
> RestApiDefaultResponse anonymizeUser(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.anonymizeUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#anonymizeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="blockUserPhoneNumber"></a>
# **blockUserPhoneNumber**
> RestApiDefaultResponse blockUserPhoneNumber(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.blockUserPhoneNumber(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#blockUserPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createUserDeliveryLocation"></a>
# **createUserDeliveryLocation**
> RestApiDefaultResponse createUserDeliveryLocation(userId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
CreateUserDeliveryLocationRequest request = new CreateUserDeliveryLocationRequest(); // CreateUserDeliveryLocationRequest | 
try {
    RestApiDefaultResponse result = apiInstance.createUserDeliveryLocation(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUserDeliveryLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **request** | [**CreateUserDeliveryLocationRequest**](CreateUserDeliveryLocationRequest.md)|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getPreviousOrderCountForStore"></a>
# **getPreviousOrderCountForStore**
> RestApiStringResult getPreviousOrderCountForStore(userId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer storeId = 56; // Integer | 
try {
    RestApiStringResult result = apiInstance.getPreviousOrderCountForStore(userId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getPreviousOrderCountForStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **storeId** | **Integer**|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRestaurantUserAccounts"></a>
# **getRestaurantUserAccounts**
> RestApiArrayResultUserFlipdishAccount getRestaurantUserAccounts(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiArrayResultUserFlipdishAccount result = apiInstance.getRestaurantUserAccounts(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRestaurantUserAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiArrayResultUserFlipdishAccount**](RestApiArrayResultUserFlipdishAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRestaurantUserStores"></a>
# **getRestaurantUserStores**
> RestApiArrayResultUserStoreInfo getRestaurantUserStores(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiArrayResultUserStoreInfo result = apiInstance.getRestaurantUserStores(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRestaurantUserStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiArrayResultUserStoreInfo**](RestApiArrayResultUserStoreInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRoles"></a>
# **getRoles**
> RestApiStringArrayResult getRoles()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    RestApiStringArrayResult result = apiInstance.getRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiStringArrayResult**](RestApiStringArrayResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getRolesAndUnassignedRoles"></a>
# **getRolesAndUnassignedRoles**
> RestApiResultUserRole getRolesAndUnassignedRoles(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiResultUserRole result = apiInstance.getRolesAndUnassignedRoles(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getRolesAndUnassignedRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiResultUserRole**](RestApiResultUserRole.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserById"></a>
# **getUserById**
> RestApiResultUserInfo getUserById(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiResultUserInfo result = apiInstance.getUserById(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiResultUserInfo**](RestApiResultUserInfo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserDeliveryLocationsForAdmin"></a>
# **getUserDeliveryLocationsForAdmin**
> RestApiArrayResultUserDeliveryLocationAdmin getUserDeliveryLocationsForAdmin(userId, whiteLabelId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer whiteLabelId = 56; // Integer | 
try {
    RestApiArrayResultUserDeliveryLocationAdmin result = apiInstance.getUserDeliveryLocationsForAdmin(userId, whiteLabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDeliveryLocationsForAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **whiteLabelId** | **Integer**|  | [optional]

### Return type

[**RestApiArrayResultUserDeliveryLocationAdmin**](RestApiArrayResultUserDeliveryLocationAdmin.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserNotes"></a>
# **getUserNotes**
> RestApiArrayResultUserNote getUserNotes(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiArrayResultUserNote result = apiInstance.getUserNotes(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiArrayResultUserNote**](RestApiArrayResultUserNote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserOrderByIdForAdmin"></a>
# **getUserOrderByIdForAdmin**
> RestApiResultOrder getUserOrderByIdForAdmin(userId, orderId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer orderId = 56; // Integer | 
try {
    RestApiResultOrder result = apiInstance.getUserOrderByIdForAdmin(userId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserOrderByIdForAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **orderId** | **Integer**|  |

### Return type

[**RestApiResultOrder**](RestApiResultOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserOrdersForAdmin"></a>
# **getUserOrdersForAdmin**
> RestApiArrayResultUserOrderSummary getUserOrdersForAdmin(userId, skip, take, whiteLabelId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer skip = 56; // Integer | 
Integer take = 56; // Integer | 
Integer whiteLabelId = 56; // Integer | 
try {
    RestApiArrayResultUserOrderSummary result = apiInstance.getUserOrdersForAdmin(userId, skip, take, whiteLabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserOrdersForAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **skip** | **Integer**|  | [optional]
 **take** | **Integer**|  | [optional]
 **whiteLabelId** | **Integer**|  | [optional]

### Return type

[**RestApiArrayResultUserOrderSummary**](RestApiArrayResultUserOrderSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getUserSmsConversationItems"></a>
# **getUserSmsConversationItems**
> RestApiArrayResultUserSmsChatItem getUserSmsConversationItems(userId, mostRecentCount)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer mostRecentCount = 56; // Integer | 
try {
    RestApiArrayResultUserSmsChatItem result = apiInstance.getUserSmsConversationItems(userId, mostRecentCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSmsConversationItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mostRecentCount** | **Integer**|  | [optional]

### Return type

[**RestApiArrayResultUserSmsChatItem**](RestApiArrayResultUserSmsChatItem.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="hideUserDeliveryLocation"></a>
# **hideUserDeliveryLocation**
> RestApiDefaultResponse hideUserDeliveryLocation(userId, deliveryLocationId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer deliveryLocationId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.hideUserDeliveryLocation(userId, deliveryLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#hideUserDeliveryLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **deliveryLocationId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="markUserAsFraudulent"></a>
# **markUserAsFraudulent**
> RestApiDefaultResponse markUserAsFraudulent(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.markUserAsFraudulent(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#markUserAsFraudulent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="markUserAsSuspicious"></a>
# **markUserAsSuspicious**
> RestApiDefaultResponse markUserAsSuspicious(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.markUserAsSuspicious(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#markUserAsSuspicious");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeFlipdishAccountIdForUser"></a>
# **removeFlipdishAccountIdForUser**
> RestApiDefaultResponse removeFlipdishAccountIdForUser(userId, accountId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer accountId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.removeFlipdishAccountIdForUser(userId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeFlipdishAccountIdForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **accountId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="removeUserFromRole"></a>
# **removeUserFromRole**
> RestApiResultUserRole removeUserFromRole(userId, roleName)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String roleName = "roleName_example"; // String | 
try {
    RestApiResultUserRole result = apiInstance.removeUserFromRole(userId, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeUserFromRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **roleName** | **String**|  |

### Return type

[**RestApiResultUserRole**](RestApiResultUserRole.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="resetMfa"></a>
# **resetMfa**
> RestApiDefaultResponse resetMfa(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.resetMfa(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#resetMfa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchFlipdishAccounts"></a>
# **searchFlipdishAccounts**
> RestApiArrayResultFlipdishAccountName searchFlipdishAccounts(searchPattern)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String searchPattern = "searchPattern_example"; // String | 
try {
    RestApiArrayResultFlipdishAccountName result = apiInstance.searchFlipdishAccounts(searchPattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#searchFlipdishAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchPattern** | **String**|  |

### Return type

[**RestApiArrayResultFlipdishAccountName**](RestApiArrayResultFlipdishAccountName.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="searchUsers"></a>
# **searchUsers**
> RestApiPaginationResultUserSearch searchUsers(searchQuery, hasUserLoggedIn, userDiscriminator, searchIn, pageIndex, pageSize)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String searchQuery = "searchQuery_example"; // String | 
Boolean hasUserLoggedIn = true; // Boolean | 
String userDiscriminator = "userDiscriminator_example"; // String | 
String searchIn = "searchIn_example"; // String | 
Integer pageIndex = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    RestApiPaginationResultUserSearch result = apiInstance.searchUsers(searchQuery, hasUserLoggedIn, userDiscriminator, searchIn, pageIndex, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchQuery** | **String**|  |
 **hasUserLoggedIn** | **Boolean**|  | [optional]
 **userDiscriminator** | **String**|  | [optional] [enum: All, ApplicationUsers, RestaurantUsers, HydraUsers]
 **searchIn** | **String**|  | [optional] [enum: Generic, Id, Email, Phone, CustomerName, IdOrPhone, IdOrCustomerName]
 **pageIndex** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultUserSearch**](RestApiPaginationResultUserSearch.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="sendUserPushNotification"></a>
# **sendUserPushNotification**
> RestApiResultUserPushNotificationSentResult sendUserPushNotification(userId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
SendUserPushNotificationRequest request = new SendUserPushNotificationRequest(); // SendUserPushNotificationRequest | 
try {
    RestApiResultUserPushNotificationSentResult result = apiInstance.sendUserPushNotification(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#sendUserPushNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **request** | [**SendUserPushNotificationRequest**](SendUserPushNotificationRequest.md)|  |

### Return type

[**RestApiResultUserPushNotificationSentResult**](RestApiResultUserPushNotificationSentResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="sendUserSms"></a>
# **sendUserSms**
> RestApiDefaultResponse sendUserSms(userId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
SendUserSmsRequest request = new SendUserSmsRequest(); // SendUserSmsRequest | 
try {
    RestApiDefaultResponse result = apiInstance.sendUserSms(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#sendUserSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **request** | [**SendUserSmsRequest**](SendUserSmsRequest.md)|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setCustomerName"></a>
# **setCustomerName**
> RestApiDefaultResponse setCustomerName(userId, customerName)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String customerName = "customerName_example"; // String | 
try {
    RestApiDefaultResponse result = apiInstance.setCustomerName(userId, customerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setCustomerName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **customerName** | **String**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setFlipdishAccountIdForUser"></a>
# **setFlipdishAccountIdForUser**
> RestApiDefaultResponse setFlipdishAccountIdForUser(userId, accountId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer accountId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.setFlipdishAccountIdForUser(userId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setFlipdishAccountIdForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **accountId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setUserDeliveryLocationCoordinates"></a>
# **setUserDeliveryLocationCoordinates**
> RestApiDefaultResponse setUserDeliveryLocationCoordinates(userId, deliveryLocationId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer deliveryLocationId = 56; // Integer | 
SetUserDeliveryLocationCoordinatesRequest request = new SetUserDeliveryLocationCoordinatesRequest(); // SetUserDeliveryLocationCoordinatesRequest | 
try {
    RestApiDefaultResponse result = apiInstance.setUserDeliveryLocationCoordinates(userId, deliveryLocationId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setUserDeliveryLocationCoordinates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **deliveryLocationId** | **Integer**|  |
 **request** | [**SetUserDeliveryLocationCoordinatesRequest**](SetUserDeliveryLocationCoordinatesRequest.md)|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setUserDeliveryLocationField"></a>
# **setUserDeliveryLocationField**
> RestApiDefaultResponse setUserDeliveryLocationField(userId, deliveryLocationId, request)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
Integer deliveryLocationId = 56; // Integer | 
SetUserDeliveryLocationFieldRequest request = new SetUserDeliveryLocationFieldRequest(); // SetUserDeliveryLocationFieldRequest | 
try {
    RestApiDefaultResponse result = apiInstance.setUserDeliveryLocationField(userId, deliveryLocationId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setUserDeliveryLocationField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **deliveryLocationId** | **Integer**|  |
 **request** | [**SetUserDeliveryLocationFieldRequest**](SetUserDeliveryLocationFieldRequest.md)|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setUserLanguage"></a>
# **setUserLanguage**
> RestApiDefaultResponse setUserLanguage(userId, languageId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
String languageId = "languageId_example"; // String | 
try {
    RestApiDefaultResponse result = apiInstance.setUserLanguage(userId, languageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#setUserLanguage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **languageId** | **String**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="unblockUserPhoneNumber"></a>
# **unblockUserPhoneNumber**
> RestApiDefaultResponse unblockUserPhoneNumber(userId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Integer userId = 56; // Integer | 
try {
    RestApiDefaultResponse result = apiInstance.unblockUserPhoneNumber(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#unblockUserPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**RestApiDefaultResponse**](RestApiDefaultResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

