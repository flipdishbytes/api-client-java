# ClientsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClient**](ClientsApi.md#getClient) | **GET** /api/v1.0/clients/{clientId} | 
[**setSalesForceContactId**](ClientsApi.md#setSalesForceContactId) | **POST** /api/v1.0/clients/{clientId}/salesforcecontactid | 
[**setStripeCustomerId**](ClientsApi.md#setStripeCustomerId) | **POST** /api/v1.0/clients/{clientId}/stripecustomerid | 


<a name="getClient"></a>
# **getClient**
> getClient(clientId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | 
try {
    apiInstance.getClient(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setSalesForceContactId"></a>
# **setSalesForceContactId**
> setSalesForceContactId(clientId, salesForceContactId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | 
String salesForceContactId = "salesForceContactId_example"; // String | 
try {
    apiInstance.setSalesForceContactId(clientId, salesForceContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#setSalesForceContactId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**|  |
 **salesForceContactId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setStripeCustomerId"></a>
# **setStripeCustomerId**
> setStripeCustomerId(clientId, stripeCustomerId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | 
String stripeCustomerId = "stripeCustomerId_example"; // String | 
try {
    apiInstance.setStripeCustomerId(clientId, stripeCustomerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#setStripeCustomerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**|  |
 **stripeCustomerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

