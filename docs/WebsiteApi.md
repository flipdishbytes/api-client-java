# WebsiteApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTestimonial**](WebsiteApi.md#addTestimonial) | **POST** /api/v1.0/{appId}/website/testimonial | 
[**deleteTestimonial**](WebsiteApi.md#deleteTestimonial) | **DELETE** /api/v1.0/{appId}/website/testimonial/{testimonialId} | 
[**deleteWebsiteImage**](WebsiteApi.md#deleteWebsiteImage) | **DELETE** /api/v1.0/{appId}/website/image/{imageId} | 
[**editTestimonial**](WebsiteApi.md#editTestimonial) | **POST** /api/v1.0/{appId}/website/testimonial/{testimonialId} | 
[**getIndexConfiguration**](WebsiteApi.md#getIndexConfiguration) | **GET** /api/v1.0/{appId}/website/index | 
[**setIndexConfiguration**](WebsiteApi.md#setIndexConfiguration) | **POST** /api/v1.0/{appId}/website/index | 
[**uploadWebsiteImage**](WebsiteApi.md#uploadWebsiteImage) | **POST** /api/v1.0/{appId}/website/image/{imageLocation} | 
[**websiteCheckNow**](WebsiteApi.md#websiteCheckNow) | **GET** /api/v1.0/{appId}/website/dnscheck | 


<a name="addTestimonial"></a>
# **addTestimonial**
> RestApiResultWebsiteTestimonial addTestimonial(appId, testimonial)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
WebsiteTestimonialBase testimonial = new WebsiteTestimonialBase(); // WebsiteTestimonialBase | 
try {
    RestApiResultWebsiteTestimonial result = apiInstance.addTestimonial(appId, testimonial);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#addTestimonial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **testimonial** | [**WebsiteTestimonialBase**](WebsiteTestimonialBase.md)|  |

### Return type

[**RestApiResultWebsiteTestimonial**](RestApiResultWebsiteTestimonial.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteTestimonial"></a>
# **deleteTestimonial**
> deleteTestimonial(appId, testimonialId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
Integer testimonialId = 56; // Integer | 
try {
    apiInstance.deleteTestimonial(appId, testimonialId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#deleteTestimonial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **testimonialId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="deleteWebsiteImage"></a>
# **deleteWebsiteImage**
> deleteWebsiteImage(appId, imageId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
Integer imageId = 56; // Integer | 
try {
    apiInstance.deleteWebsiteImage(appId, imageId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#deleteWebsiteImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **imageId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editTestimonial"></a>
# **editTestimonial**
> RestApiResultWebsiteTestimonial editTestimonial(appId, testimonialId, testimonial)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
Integer testimonialId = 56; // Integer | 
WebsiteTestimonialBase testimonial = new WebsiteTestimonialBase(); // WebsiteTestimonialBase | 
try {
    RestApiResultWebsiteTestimonial result = apiInstance.editTestimonial(appId, testimonialId, testimonial);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#editTestimonial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **testimonialId** | **Integer**|  |
 **testimonial** | [**WebsiteTestimonialBase**](WebsiteTestimonialBase.md)|  |

### Return type

[**RestApiResultWebsiteTestimonial**](RestApiResultWebsiteTestimonial.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getIndexConfiguration"></a>
# **getIndexConfiguration**
> RestApiResultIndexPage getIndexConfiguration(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
try {
    RestApiResultIndexPage result = apiInstance.getIndexConfiguration(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#getIndexConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

[**RestApiResultIndexPage**](RestApiResultIndexPage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="setIndexConfiguration"></a>
# **setIndexConfiguration**
> RestApiResultIndexPageBase setIndexConfiguration(appId, indexPage)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
IndexPageBase indexPage = new IndexPageBase(); // IndexPageBase | 
try {
    RestApiResultIndexPageBase result = apiInstance.setIndexConfiguration(appId, indexPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#setIndexConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **indexPage** | [**IndexPageBase**](IndexPageBase.md)|  |

### Return type

[**RestApiResultIndexPageBase**](RestApiResultIndexPageBase.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="uploadWebsiteImage"></a>
# **uploadWebsiteImage**
> RestApiResultWebsiteImage uploadWebsiteImage(appId, imageLocation, image)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
String imageLocation = "imageLocation_example"; // String | 
File image = new File("/path/to/file.txt"); // File | App Logo
try {
    RestApiResultWebsiteImage result = apiInstance.uploadWebsiteImage(appId, imageLocation, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#uploadWebsiteImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **imageLocation** | **String**|  | [enum: IndexHeader, IndexAboutSectionLeft, IndexAboutSectionRight, IndexGallery, IndexOpeningHoursHeader, IndexTestimonialsHeader]
 **image** | **File**| App Logo |

### Return type

[**RestApiResultWebsiteImage**](RestApiResultWebsiteImage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="websiteCheckNow"></a>
# **websiteCheckNow**
> websiteCheckNow(appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.WebsiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

WebsiteApi apiInstance = new WebsiteApi();
String appId = "appId_example"; // String | 
try {
    apiInstance.websiteCheckNow(appId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebsiteApi#websiteCheckNow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

