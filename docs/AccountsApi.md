# AccountsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**answerSignUpQuestion**](AccountsApi.md#answerSignUpQuestion) | **POST** /api/v1.0/accounts/signupstep/{signupStepAction}/answer | 
[**changePassword**](AccountsApi.md#changePassword) | **PUT** /api/v1.0/accounts/password | 
[**changePasswordWithPin**](AccountsApi.md#changePasswordWithPin) | **PUT** /api/v1.0/accounts/password/pin | 
[**createAccount**](AccountsApi.md#createAccount) | **POST** /api/v1.0/accounts | 
[**getAccountDetails**](AccountsApi.md#getAccountDetails) | **GET** /api/v1.0/accounts | 
[**getLocalisedTimeZones**](AccountsApi.md#getLocalisedTimeZones) | **GET** /api/v1.0/accounts/timezones | 
[**login**](AccountsApi.md#login) | **POST** /api/v1.0/accounts/login | 
[**loginSso**](AccountsApi.md#loginSso) | **POST** /api/v1.0/accounts/login/sso | 
[**loginWithPin**](AccountsApi.md#loginWithPin) | **POST** /api/v1.0/accounts/login/pin | 
[**logout**](AccountsApi.md#logout) | **POST** /api/v1.0/accounts/logout | 
[**passwordResetWithToken**](AccountsApi.md#passwordResetWithToken) | **POST** /api/v1.0/accounts/password | 
[**recaptchaValidate**](AccountsApi.md#recaptchaValidate) | **POST** /api/v1.0/accounts/recaptcha | 
[**requestLoginPin**](AccountsApi.md#requestLoginPin) | **POST** /api/v1.0/accounts/pin | 
[**requestPasswordReset**](AccountsApi.md#requestPasswordReset) | **POST** /api/v1.0/accounts/passwordreset | 
[**sendPinForPasswordReset**](AccountsApi.md#sendPinForPasswordReset) | **POST** /api/v1.0/accounts/password/resetpin | 
[**skipSignupStep**](AccountsApi.md#skipSignupStep) | **POST** /api/v1.0/accounts/signupstep/{signupStepAction}/skip | 
[**updateAccount**](AccountsApi.md#updateAccount) | **PUT** /api/v1.0/accounts | 


<a name="answerSignUpQuestion"></a>
# **answerSignUpQuestion**
> answerSignUpQuestion(signupStepAction, answerId)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String signupStepAction = "signupStepAction_example"; // String | 
Integer answerId = 56; // Integer | 
try {
    apiInstance.answerSignUpQuestion(signupStepAction, answerId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#answerSignUpQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signupStepAction** | **String**|  | [enum: Question, StoreLocation, PaymentSubscription]
 **answerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="changePassword"></a>
# **changePassword**
> changePassword(changePasswordModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
ChangePasswordModel changePasswordModel = new ChangePasswordModel(); // ChangePasswordModel | 
try {
    apiInstance.changePassword(changePasswordModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePasswordModel** | [**ChangePasswordModel**](ChangePasswordModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="changePasswordWithPin"></a>
# **changePasswordWithPin**
> changePasswordWithPin(changePasswordModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
SetPasswordWithPinModel changePasswordModel = new SetPasswordWithPinModel(); // SetPasswordWithPinModel | 
try {
    apiInstance.changePasswordWithPin(changePasswordModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#changePasswordWithPin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePasswordModel** | [**SetPasswordWithPinModel**](SetPasswordWithPinModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="createAccount"></a>
# **createAccount**
> createAccount(createAccountModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
CreateAccountModel createAccountModel = new CreateAccountModel(); // CreateAccountModel | 
try {
    apiInstance.createAccount(createAccountModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAccountModel** | [**CreateAccountModel**](CreateAccountModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getAccountDetails"></a>
# **getAccountDetails**
> RestApiResultAccountDetail getAccountDetails()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    RestApiResultAccountDetail result = apiInstance.getAccountDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiResultAccountDetail**](RestApiResultAccountDetail.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="getLocalisedTimeZones"></a>
# **getLocalisedTimeZones**
> RestApiArrayResultLocalisedTimeZone getLocalisedTimeZones()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    RestApiArrayResultLocalisedTimeZone result = apiInstance.getLocalisedTimeZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getLocalisedTimeZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RestApiArrayResultLocalisedTimeZone**](RestApiArrayResultLocalisedTimeZone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="login"></a>
# **login**
> login(loginModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
LoginModel loginModel = new LoginModel(); // LoginModel | 
try {
    apiInstance.login(loginModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginModel** | [**LoginModel**](LoginModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="loginSso"></a>
# **loginSso**
> loginSso()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.loginSso();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#loginSso");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="loginWithPin"></a>
# **loginWithPin**
> loginWithPin(loginModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
LoginWithPinModel loginModel = new LoginWithPinModel(); // LoginWithPinModel | 
try {
    apiInstance.loginWithPin(loginModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#loginWithPin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginModel** | [**LoginWithPinModel**](LoginWithPinModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="logout"></a>
# **logout**
> logout()



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="passwordResetWithToken"></a>
# **passwordResetWithToken**
> passwordResetWithToken(passwordResetModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
PasswordResetModel passwordResetModel = new PasswordResetModel(); // PasswordResetModel | 
try {
    apiInstance.passwordResetWithToken(passwordResetModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#passwordResetWithToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **passwordResetModel** | [**PasswordResetModel**](PasswordResetModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="recaptchaValidate"></a>
# **recaptchaValidate**
> recaptchaValidate(token)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String token = "token_example"; // String | 
try {
    apiInstance.recaptchaValidate(token);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#recaptchaValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="requestLoginPin"></a>
# **requestLoginPin**
> RequestLoginPinResponse requestLoginPin(requestLoginPinRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
RequestLoginPinModel requestLoginPinRequest = new RequestLoginPinModel(); // RequestLoginPinModel | 
try {
    RequestLoginPinResponse result = apiInstance.requestLoginPin(requestLoginPinRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#requestLoginPin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestLoginPinRequest** | [**RequestLoginPinModel**](RequestLoginPinModel.md)|  |

### Return type

[**RequestLoginPinResponse**](RequestLoginPinResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="requestPasswordReset"></a>
# **requestPasswordReset**
> requestPasswordReset(requestPasswordResetModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
RequestPasswordResetModel requestPasswordResetModel = new RequestPasswordResetModel(); // RequestPasswordResetModel | 
try {
    apiInstance.requestPasswordReset(requestPasswordResetModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#requestPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestPasswordResetModel** | [**RequestPasswordResetModel**](RequestPasswordResetModel.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="sendPinForPasswordReset"></a>
# **sendPinForPasswordReset**
> RequestPasswordResetPinResponse sendPinForPasswordReset(requestPasswordResetRequest)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
RequestPasswordResetModel requestPasswordResetRequest = new RequestPasswordResetModel(); // RequestPasswordResetModel | 
try {
    RequestPasswordResetPinResponse result = apiInstance.sendPinForPasswordReset(requestPasswordResetRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#sendPinForPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestPasswordResetRequest** | [**RequestPasswordResetModel**](RequestPasswordResetModel.md)|  |

### Return type

[**RequestPasswordResetPinResponse**](RequestPasswordResetPinResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="skipSignupStep"></a>
# **skipSignupStep**
> skipSignupStep(signupStepAction)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
String signupStepAction = "signupStepAction_example"; // String | 
try {
    apiInstance.skipSignupStep(signupStepAction);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#skipSignupStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signupStepAction** | **String**|  | [enum: Question, StoreLocation, PaymentSubscription]

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="updateAccount"></a>
# **updateAccount**
> updateAccount(updateAccountModel)



### Example
```java
// Import classes:
//import com.flipdish.apiclient.ApiClient;
//import com.flipdish.apiclient.ApiException;
//import com.flipdish.apiclient.Configuration;
//import com.flipdish.apiclient.auth.*;
//import com.flipdish.apiclient.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AccountsApi apiInstance = new AccountsApi();
AccountDetailBase updateAccountModel = new AccountDetailBase(); // AccountDetailBase | 
try {
    apiInstance.updateAccount(updateAccountModel);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateAccountModel** | [**AccountDetailBase**](AccountDetailBase.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

