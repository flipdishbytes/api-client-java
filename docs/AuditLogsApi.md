# AuditLogsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrderAuditLog**](AuditLogsApi.md#addOrderAuditLog) | **POST** /api/v1.0/auditlogs/orders/{orderId} | Create an order audit log event
[**addStoreAuditLogEvent**](AuditLogsApi.md#addStoreAuditLogEvent) | **POST** /api/v1.0/auditlogs/stores/{storeId} | Create a store audit log event


<a name="addOrderAuditLog"></a>
# **addOrderAuditLog**
> addOrderAuditLog(orderId, externalEventCreate)

Create an order audit log event

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AuditLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AuditLogsApi apiInstance = new AuditLogsApi();
Integer orderId = 56; // Integer | 
List<ExternalStoreAuditLog> externalEventCreate = Arrays.asList(new ExternalStoreAuditLog()); // List<ExternalStoreAuditLog> | 
try {
    apiInstance.addOrderAuditLog(orderId, externalEventCreate);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#addOrderAuditLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |
 **externalEventCreate** | [**List&lt;ExternalStoreAuditLog&gt;**](ExternalStoreAuditLog.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="addStoreAuditLogEvent"></a>
# **addStoreAuditLogEvent**
> addStoreAuditLogEvent(storeId, externalEventCreate)

Create a store audit log event

[BETA - this endpoint is under development, do not use it in your production system]

### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AuditLogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AuditLogsApi apiInstance = new AuditLogsApi();
Integer storeId = 56; // Integer | 
List<ExternalStoreAuditLog> externalEventCreate = Arrays.asList(new ExternalStoreAuditLog()); // List<ExternalStoreAuditLog> | 
try {
    apiInstance.addStoreAuditLogEvent(storeId, externalEventCreate);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#addStoreAuditLogEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **Integer**|  |
 **externalEventCreate** | [**List&lt;ExternalStoreAuditLog&gt;**](ExternalStoreAuditLog.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

