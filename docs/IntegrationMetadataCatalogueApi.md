# IntegrationMetadataCatalogueApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationMetadataCatalogueGetPixelPointProducts**](IntegrationMetadataCatalogueApi.md#integrationMetadataCatalogueGetPixelPointProducts) | **GET** /api/v1.0/integrationmetadatacatalogue/pixelpoint/stores/{storeId}/products | 


<a name="integrationMetadataCatalogueGetPixelPointProducts"></a>
# **integrationMetadataCatalogueGetPixelPointProducts**
> RestApiResultPixelPointProductCatalogue integrationMetadataCatalogueGetPixelPointProducts(storeId, nameContains, page, pageSize)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.IntegrationMetadataCatalogueApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

IntegrationMetadataCatalogueApi apiInstance = new IntegrationMetadataCatalogueApi();
Integer storeId = 56; // Integer | 
String nameContains = "nameContains_example"; // String | 
Integer page = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    RestApiResultPixelPointProductCatalogue result = apiInstance.integrationMetadataCatalogueGetPixelPointProducts(storeId, nameContains, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationMetadataCatalogueApi#integrationMetadataCatalogueGetPixelPointProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **nameContains** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**RestApiResultPixelPointProductCatalogue**](RestApiResultPixelPointProductCatalogue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

