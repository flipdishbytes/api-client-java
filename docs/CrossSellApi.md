# CrossSellApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrossSellMenuItems**](CrossSellApi.md#getCrossSellMenuItems) | **GET** /api/v1.0/{appId}/crossSell/menuItems | 


<a name="getCrossSellMenuItems"></a>
# **getCrossSellMenuItems**
> RestApiResultCrossSellMenuItems getCrossSellMenuItems(menuId, menuItemId, limit, totalValue, appId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CrossSellApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CrossSellApi apiInstance = new CrossSellApi();
Integer menuId = 56; // Integer | 
List<Integer> menuItemId = Arrays.asList(56); // List<Integer> | 
Integer limit = 56; // Integer | 
Double totalValue = 3.4D; // Double | 
String appId = "appId_example"; // String | 
try {
    RestApiResultCrossSellMenuItems result = apiInstance.getCrossSellMenuItems(menuId, menuItemId, limit, totalValue, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrossSellApi#getCrossSellMenuItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **menuId** | **Integer**|  |
 **menuItemId** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **limit** | **Integer**|  |
 **totalValue** | **Double**|  |
 **appId** | **String**|  |

### Return type

[**RestApiResultCrossSellMenuItems**](RestApiResultCrossSellMenuItems.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

