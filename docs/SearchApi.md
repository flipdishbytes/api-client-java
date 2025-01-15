# SearchApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchRestaurants**](SearchApi.md#searchRestaurants) | **GET** /api/v1.0/search/restaurants | 


<a name="searchRestaurants"></a>
# **searchRestaurants**
> RestApiPaginationResultRestaurant searchRestaurants(query, countryId, includeArchivedStores, searchType, publishedStatus, page, limit)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String query = "query_example"; // String | 
String countryId = "countryId_example"; // String | 
String includeArchivedStores = "includeArchivedStores_example"; // String | 
String searchType = "searchType_example"; // String | 
String publishedStatus = "publishedStatus_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    RestApiPaginationResultRestaurant result = apiInstance.searchRestaurants(query, countryId, includeArchivedStores, searchType, publishedStatus, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchRestaurants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **countryId** | **String**|  |
 **includeArchivedStores** | **String**|  | [optional] [enum: NonArchivedOnly, ArchivedOnly, Both]
 **searchType** | **String**|  | [optional] [enum: WhiteLabelConfigInfo, WhiteLabelConfigVirtualRestaurantInfo, WhiteLabelConfigPhysicalRestaurantInfo, WhiteLabelConfigPhysicalRestaurantAddressInfo]
 **publishedStatus** | **String**|  | [optional] [enum: AllStores, Published, Unpublished]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**RestApiPaginationResultRestaurant**](RestApiPaginationResultRestaurant.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

