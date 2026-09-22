# SmsProviderCredentialsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBrandSmsProviderCredentialByServiceType**](SmsProviderCredentialsApi.md#getBrandSmsProviderCredentialByServiceType) | **GET** /api/v1.0/sms-providers/orgs/{orgId}/brands/{brandId}/provider-credentials/{serviceType} | 
[**getBrandSmsProviderCredentials**](SmsProviderCredentialsApi.md#getBrandSmsProviderCredentials) | **GET** /api/v1.0/sms-providers/orgs/{orgId}/brands/{brandId}/provider-credentials | 
[**smsProviderCredentialDelete**](SmsProviderCredentialsApi.md#smsProviderCredentialDelete) | **DELETE** /api/v1.0/sms-providers/orgs/{orgId}/brands/{brandId}/provider-credentials/{serviceType} | 
[**smsProviderCredentialUpdate**](SmsProviderCredentialsApi.md#smsProviderCredentialUpdate) | **POST** /api/v1.0/sms-providers/orgs/{orgId}/brands/{brandId}/provider-credentials/{serviceType} | 
[**smsProviderCredentialsBulkUpsert**](SmsProviderCredentialsApi.md#smsProviderCredentialsBulkUpsert) | **POST** /api/v1.0/sms-providers/bulk-upsert | 


<a name="getBrandSmsProviderCredentialByServiceType"></a>
# **getBrandSmsProviderCredentialByServiceType**
> RestApiResultSmsProviderCredential getBrandSmsProviderCredentialByServiceType(orgId, brandId, serviceType, withFallback)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SmsProviderCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SmsProviderCredentialsApi apiInstance = new SmsProviderCredentialsApi();
String orgId = "orgId_example"; // String | 
String brandId = "brandId_example"; // String | 
String serviceType = "serviceType_example"; // String | 
Boolean withFallback = true; // Boolean | 
try {
    RestApiResultSmsProviderCredential result = apiInstance.getBrandSmsProviderCredentialByServiceType(orgId, brandId, serviceType, withFallback);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsProviderCredentialsApi#getBrandSmsProviderCredentialByServiceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **String**|  |
 **brandId** | **String**|  |
 **serviceType** | **String**|  | [enum: Nexmo, Twilio, Default, MessageBird]
 **withFallback** | **Boolean**|  | [optional]

### Return type

[**RestApiResultSmsProviderCredential**](RestApiResultSmsProviderCredential.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getBrandSmsProviderCredentials"></a>
# **getBrandSmsProviderCredentials**
> RestApiArrayResultSmsProviderCredential getBrandSmsProviderCredentials(orgId, brandId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SmsProviderCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SmsProviderCredentialsApi apiInstance = new SmsProviderCredentialsApi();
String orgId = "orgId_example"; // String | 
String brandId = "brandId_example"; // String | 
try {
    RestApiArrayResultSmsProviderCredential result = apiInstance.getBrandSmsProviderCredentials(orgId, brandId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsProviderCredentialsApi#getBrandSmsProviderCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **String**|  |
 **brandId** | **String**|  |

### Return type

[**RestApiArrayResultSmsProviderCredential**](RestApiArrayResultSmsProviderCredential.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="smsProviderCredentialDelete"></a>
# **smsProviderCredentialDelete**
> RestApiResultSmsProviderCredential smsProviderCredentialDelete(orgId, brandId, serviceType)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SmsProviderCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SmsProviderCredentialsApi apiInstance = new SmsProviderCredentialsApi();
String orgId = "orgId_example"; // String | 
String brandId = "brandId_example"; // String | 
String serviceType = "serviceType_example"; // String | 
try {
    RestApiResultSmsProviderCredential result = apiInstance.smsProviderCredentialDelete(orgId, brandId, serviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsProviderCredentialsApi#smsProviderCredentialDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **String**|  |
 **brandId** | **String**|  |
 **serviceType** | **String**|  | [enum: Nexmo, Twilio, Default, MessageBird]

### Return type

[**RestApiResultSmsProviderCredential**](RestApiResultSmsProviderCredential.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="smsProviderCredentialUpdate"></a>
# **smsProviderCredentialUpdate**
> RestApiResultSmsProviderCredential smsProviderCredentialUpdate(orgId, brandId, serviceType, credential)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SmsProviderCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SmsProviderCredentialsApi apiInstance = new SmsProviderCredentialsApi();
String orgId = "orgId_example"; // String | 
String brandId = "brandId_example"; // String | 
String serviceType = "serviceType_example"; // String | 
SmsProviderCredentialUpdateRequest credential = new SmsProviderCredentialUpdateRequest(); // SmsProviderCredentialUpdateRequest | 
try {
    RestApiResultSmsProviderCredential result = apiInstance.smsProviderCredentialUpdate(orgId, brandId, serviceType, credential);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsProviderCredentialsApi#smsProviderCredentialUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **String**|  |
 **brandId** | **String**|  |
 **serviceType** | **String**|  | [enum: Nexmo, Twilio, Default, MessageBird]
 **credential** | [**SmsProviderCredentialUpdateRequest**](SmsProviderCredentialUpdateRequest.md)|  |

### Return type

[**RestApiResultSmsProviderCredential**](RestApiResultSmsProviderCredential.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="smsProviderCredentialsBulkUpsert"></a>
# **smsProviderCredentialsBulkUpsert**
> RestApiArrayResultSmsProviderCredential smsProviderCredentialsBulkUpsert(credentials)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SmsProviderCredentialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SmsProviderCredentialsApi apiInstance = new SmsProviderCredentialsApi();
List<SmsProviderCredential> credentials = Arrays.asList(new SmsProviderCredential()); // List<SmsProviderCredential> | 
try {
    RestApiArrayResultSmsProviderCredential result = apiInstance.smsProviderCredentialsBulkUpsert(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsProviderCredentialsApi#smsProviderCredentialsBulkUpsert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | [**List&lt;SmsProviderCredential&gt;**](SmsProviderCredential.md)|  |

### Return type

[**RestApiArrayResultSmsProviderCredential**](RestApiArrayResultSmsProviderCredential.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

