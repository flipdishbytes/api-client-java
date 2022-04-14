# CatalogImagesApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadCatalogImage**](CatalogImagesApi.md#uploadCatalogImage) | **POST** /api/v1.0/{appId}/catalog/images | Upload a Catalog Image


<a name="uploadCatalogImage"></a>
# **uploadCatalogImage**
> CatalogImage uploadCatalogImage(appId, image)

Upload a Catalog Image

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CatalogImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CatalogImagesApi apiInstance = new CatalogImagesApi();
String appId = "appId_example"; // String | 
File image = new File("/path/to/file.txt"); // File | Catalog image
try {
    CatalogImage result = apiInstance.uploadCatalogImage(appId, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogImagesApi#uploadCatalogImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **image** | **File**| Catalog image |

### Return type

[**CatalogImage**](CatalogImage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

