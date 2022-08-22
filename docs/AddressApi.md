# AddressApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**formByApp**](AddressApi.md#formByApp) | **GET** /api/v1.0/app/{appId}/address/form | Provides a dyamic form definition based for the country of the given appId, with labels localized using the provided language.
[**formByCountry**](AddressApi.md#formByCountry) | **GET** /api/v1.0/address/country/{countryCode}/form | Provides a dyamic form definition for the given country code, with labels localized using the provided language.
[**formatGoogleAddress**](AddressApi.md#formatGoogleAddress) | **POST** /api/v1.0/address/google | Maps a Google Address Object to the values of the dynamic form associated with the address country and returns the dynamic form.


<a name="formByApp"></a>
# **formByApp**
> RestApiResultAddressFormResponse formByApp(appId, language)

Provides a dyamic form definition based for the country of the given appId, with labels localized using the provided language.

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
String appId = "appId_example"; // String | Application (WhiteLabel) Id (WhiteLabelId or AppNameId).
String language = "language_example"; // String | (Optional) ISO culture info code, e.g.: en-IE, the default is en-US.
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
 **appId** | **String**| Application (WhiteLabel) Id (WhiteLabelId or AppNameId). |
 **language** | **String**| (Optional) ISO culture info code, e.g.: en-IE, the default is en-US. | [optional]

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

Provides a dyamic form definition for the given country code, with labels localized using the provided language.

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
String countryCode = "countryCode_example"; // String | The 2 letter ISO country code, e.g.: IE.
String language = "language_example"; // String | (Optional) ISO culture info code, e.g.: en-IE, the default is en-US.
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
 **countryCode** | **String**| The 2 letter ISO country code, e.g.: IE. |
 **language** | **String**| (Optional) ISO culture info code, e.g.: en-IE, the default is en-US. | [optional]

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

Maps a Google Address Object to the values of the dynamic form associated with the address country and returns the dynamic form.

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
GoogleAddress googleAddress = new GoogleAddress(); // GoogleAddress | A Google address object, as it is retuned from the maps API.
String language = "language_example"; // String | (Optional) ISO culture info code, e.g.: en-IE, the default is en-US.
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
 **googleAddress** | [**GoogleAddress**](GoogleAddress.md)| A Google address object, as it is retuned from the maps API. |
 **language** | **String**| (Optional) ISO culture info code, e.g.: en-IE, the default is en-US. | [optional]

### Return type

[**RestApiResultAddressFormResponse**](RestApiResultAddressFormResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

