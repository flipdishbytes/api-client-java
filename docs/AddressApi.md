# AddressApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressTemplates**](AddressApi.md#addressTemplates) | **POST** /api/v1.0/address/templates | 
[**formByApp**](AddressApi.md#formByApp) | **GET** /api/v1.0/app/{appId}/address/form | 
[**formByCountry**](AddressApi.md#formByCountry) | **GET** /api/v1.0/address/country/{countryCode}/form | 
[**formatGoogleAddress**](AddressApi.md#formatGoogleAddress) | **POST** /api/v1.0/address/google | 
[**getCountries**](AddressApi.md#getCountries) | **GET** /api/v1.0/address/countries | 


<a name="addressTemplates"></a>
# **addressTemplates**
> RestApiStringResult addressTemplates(address)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
StoreAddressForm address = new StoreAddressForm(); // StoreAddressForm | 
try {
    RestApiStringResult result = apiInstance.addressTemplates(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#addressTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**StoreAddressForm**](StoreAddressForm.md)|  |

### Return type

[**RestApiStringResult**](RestApiStringResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="formByApp"></a>
# **formByApp**
> RestApiResultAddressFormResponse formByApp(appId, language)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String appId = "appId_example"; // String | 
String language = "language_example"; // String | 
try {
    RestApiResultAddressFormResponse result = apiInstance.formByApp(appId, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#formByApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **language** | **String**|  | [optional]

### Return type

[**RestApiResultAddressFormResponse**](RestApiResultAddressFormResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="formByCountry"></a>
# **formByCountry**
> RestApiResultAddressFormResponse formByCountry(countryCode, language)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String countryCode = "countryCode_example"; // String | 
String language = "language_example"; // String | 
try {
    RestApiResultAddressFormResponse result = apiInstance.formByCountry(countryCode, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#formByCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**|  |
 **language** | **String**|  | [optional]

### Return type

[**RestApiResultAddressFormResponse**](RestApiResultAddressFormResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="formatGoogleAddress"></a>
# **formatGoogleAddress**
> RestApiResultAddressFormResponse formatGoogleAddress(googleAddress, language)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
GoogleAddress googleAddress = new GoogleAddress(); // GoogleAddress | 
String language = "language_example"; // String | 
try {
    RestApiResultAddressFormResponse result = apiInstance.formatGoogleAddress(googleAddress, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#formatGoogleAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **googleAddress** | [**GoogleAddress**](GoogleAddress.md)|  |
 **language** | **String**|  | [optional]

### Return type

[**RestApiResultAddressFormResponse**](RestApiResultAddressFormResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getCountries"></a>
# **getCountries**
> RestApiResultCountryFormResponse getCountries(language)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AddressApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddressApi apiInstance = new AddressApi();
String language = "language_example"; // String | 
try {
    RestApiResultCountryFormResponse result = apiInstance.getCountries(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressApi#getCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**|  | [optional]

### Return type

[**RestApiResultCountryFormResponse**](RestApiResultCountryFormResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

