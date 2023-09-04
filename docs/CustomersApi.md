# CustomersApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerById**](CustomersApi.md#getCustomerById) | **GET** /api/v1.0/{appId}/customers/{customerId} | 
[**updateCustomerById**](CustomersApi.md#updateCustomerById) | **POST** /api/v1.0/{appId}/customers/{customerId} | 


<a name="getCustomerById"></a>
# **getCustomerById**
> RestApiResultCustomer getCustomerById(appId, customerId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CustomersApi apiInstance = new CustomersApi();
String appId = "appId_example"; // String | 
Integer customerId = 56; // Integer | 
try {
    RestApiResultCustomer result = apiInstance.getCustomerById(appId, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **customerId** | **Integer**|  |

### Return type

[**RestApiResultCustomer**](RestApiResultCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateCustomerById"></a>
# **updateCustomerById**
> RestApiResultCustomer updateCustomerById(appId, customerId, updateCustomer)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.CustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CustomersApi apiInstance = new CustomersApi();
String appId = "appId_example"; // String | 
Integer customerId = 56; // Integer | 
CustomerUpdateModel updateCustomer = new CustomerUpdateModel(); // CustomerUpdateModel | 
try {
    RestApiResultCustomer result = apiInstance.updateCustomerById(appId, customerId, updateCustomer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#updateCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**|  |
 **customerId** | **Integer**|  |
 **updateCustomer** | [**CustomerUpdateModel**](CustomerUpdateModel.md)|  |

### Return type

[**RestApiResultCustomer**](RestApiResultCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

