# WebsiteApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTestimonial**](WebsiteApi.md#addTestimonial) | **POST** /api/v1.0/{appId}/website/testimonial | Add a testimonial
[**deleteTestimonial**](WebsiteApi.md#deleteTestimonial) | **DELETE** /api/v1.0/{appId}/website/testimonial/{testimonialId} | Delete a testimonial
[**deleteWebsiteImage**](WebsiteApi.md#deleteWebsiteImage) | **DELETE** /api/v1.0/{appId}/website/image/{imageId} | Delete Website Image
[**editTestimonial**](WebsiteApi.md#editTestimonial) | **POST** /api/v1.0/{appId}/website/testimonial/{testimonialId} | Edit a testimonial
[**getIndexConfiguration**](WebsiteApi.md#getIndexConfiguration) | **GET** /api/v1.0/{appId}/website/index | Get Index Configuration
[**setIndexConfiguration**](WebsiteApi.md#setIndexConfiguration) | **POST** /api/v1.0/{appId}/website/index | Set Index Configuration
[**uploadWebsiteImage**](WebsiteApi.md#uploadWebsiteImage) | **POST** /api/v1.0/{appId}/website/image/{imageLocation} | Upload Website Image
[**websiteCheckNow**](WebsiteApi.md#websiteCheckNow) | **GET** /api/v1.0/{appId}/website/dnscheck | Triggers a Check DNS Process


<a name="addTestimonial"></a>
# **addTestimonial**
> RestApiResultWebsiteTestimonial addTestimonial(appId, testimonial)

Add a testimonial

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
String appId = "appId_example"; // String | Application identifier
WebsiteTestimonialBase testimonial = new WebsiteTestimonialBase(); // WebsiteTestimonialBase | Testimonial to be added
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
 **appId** | **String**| Application identifier |
 **testimonial** | [**WebsiteTestimonialBase**](WebsiteTestimonialBase.md)| Testimonial to be added |

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

Delete a testimonial

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
String appId = "appId_example"; // String | Application identifier
Integer testimonialId = 56; // Integer | Id of the testimonial to delete
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
 **appId** | **String**| Application identifier |
 **testimonialId** | **Integer**| Id of the testimonial to delete |

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

Delete Website Image

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
String appId = "appId_example"; // String | Application identifier
Integer imageId = 56; // Integer | Id of the image
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
 **appId** | **String**| Application identifier |
 **imageId** | **Integer**| Id of the image |

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

Edit a testimonial

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
String appId = "appId_example"; // String | Application identifier
Integer testimonialId = 56; // Integer | Id of the testimonial to edit
WebsiteTestimonialBase testimonial = new WebsiteTestimonialBase(); // WebsiteTestimonialBase | New values of the testimonial
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
 **appId** | **String**| Application identifier |
 **testimonialId** | **Integer**| Id of the testimonial to edit |
 **testimonial** | [**WebsiteTestimonialBase**](WebsiteTestimonialBase.md)| New values of the testimonial |

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

Get Index Configuration

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
String appId = "appId_example"; // String | Application identifier
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
 **appId** | **String**| Application identifier |

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

Set Index Configuration

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
String appId = "appId_example"; // String | Application identifier
IndexPageBase indexPage = new IndexPageBase(); // IndexPageBase | New index page definition
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
 **appId** | **String**| Application identifier |
 **indexPage** | [**IndexPageBase**](IndexPageBase.md)| New index page definition |

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

Upload Website Image

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
String appId = "appId_example"; // String | Application identifier
String imageLocation = "imageLocation_example"; // String | Section for which to upload the image
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
 **appId** | **String**| Application identifier |
 **imageLocation** | **String**| Section for which to upload the image | [enum: IndexHeader, IndexAboutSectionLeft, IndexAboutSectionRight, IndexGallery, IndexOpeningHoursHeader, IndexTestimonialsHeader]
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

Triggers a Check DNS Process

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

