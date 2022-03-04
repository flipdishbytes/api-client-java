# OnboardingApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onboardingGetOnboardingItems**](OnboardingApi.md#onboardingGetOnboardingItems) | **GET** /api/v1.0/clients/{appId}/onboarding/stores/{storeId} | 
[**onboardingUpdateOnboardingItem**](OnboardingApi.md#onboardingUpdateOnboardingItem) | **POST** /api/v1.0/clients/{appId}/onboarding/stores/{storeId}/items/{onboardingItemId} | 


<a name="onboardingGetOnboardingItems"></a>
# **onboardingGetOnboardingItems**
> Object onboardingGetOnboardingItems(appId, storeId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
try {
    Object result = apiInstance.onboardingGetOnboardingItems(appId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingGetOnboardingItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="onboardingUpdateOnboardingItem"></a>
# **onboardingUpdateOnboardingItem**
> Object onboardingUpdateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.OnboardingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OnboardingApi apiInstance = new OnboardingApi();
String appId = "appId_example"; // String | 
Integer storeId = 56; // Integer | 
Integer onboardingItemId = 56; // Integer | 
OnboardingItemUpdate itemUpdate = new OnboardingItemUpdate(); // OnboardingItemUpdate | 
try {
    Object result = apiInstance.onboardingUpdateOnboardingItem(appId, storeId, onboardingItemId, itemUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnboardingApi#onboardingUpdateOnboardingItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **storeId** | **Integer**|  |
 **onboardingItemId** | **Integer**|  |
 **itemUpdate** | [**OnboardingItemUpdate**](OnboardingItemUpdate.md)|  |

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

