# AccountsApi

All URIs are relative to *https://api.flipdish.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**answerSignUpQuestion**](AccountsApi.md#answerSignUpQuestion) | **POST** /api/v1.0/accounts/signupstep/{signupStepAction}/answer | Answer a signup question
[**changePassword**](AccountsApi.md#changePassword) | **PUT** /api/v1.0/accounts/password | Change password
[**changePasswordWithPin**](AccountsApi.md#changePasswordWithPin) | **PUT** /api/v1.0/accounts/password/pin | Change password
[**createAccount**](AccountsApi.md#createAccount) | **POST** /api/v1.0/accounts | Create account with email address and store name
[**getAccountDetails**](AccountsApi.md#getAccountDetails) | **GET** /api/v1.0/accounts | Gets the current account detail
[**getLocalisedTimeZones**](AccountsApi.md#getLocalisedTimeZones) | **GET** /api/v1.0/accounts/timezones | [PRIVATE API] Get timezones localised to users language
[**login**](AccountsApi.md#login) | **POST** /api/v1.0/accounts/login | Login with username and password
[**loginSso**](AccountsApi.md#loginSso) | **POST** /api/v1.0/accounts/login/sso | Login with SSO token
[**loginWithPin**](AccountsApi.md#loginWithPin) | **POST** /api/v1.0/accounts/login/pin | Login with email and pin
[**logout**](AccountsApi.md#logout) | **POST** /api/v1.0/accounts/logout | Log out. It removes Flipdish authorization Cookie.
[**passwordResetWithToken**](AccountsApi.md#passwordResetWithToken) | **POST** /api/v1.0/accounts/password | Reset password with token.
[**recaptchaValidate**](AccountsApi.md#recaptchaValidate) | **POST** /api/v1.0/accounts/recaptcha | Validate recaptcha from flipdish portal
[**requestLoginPin**](AccountsApi.md#requestLoginPin) | **POST** /api/v1.0/accounts/pin | Request login PIN. The server sends the PIN to the email address.
[**requestPasswordReset**](AccountsApi.md#requestPasswordReset) | **POST** /api/v1.0/accounts/passwordreset | Request password reset. Flipdish system will send a token via email.
[**sendPinForPasswordReset**](AccountsApi.md#sendPinForPasswordReset) | **POST** /api/v1.0/accounts/password/resetpin | Request Password Reset PIN. The server sends the PIN to the email address.
[**skipSignupStep**](AccountsApi.md#skipSignupStep) | **POST** /api/v1.0/accounts/signupstep/{signupStepAction}/skip | Skip a signup question
[**updateAccount**](AccountsApi.md#updateAccount) | **PUT** /api/v1.0/accounts | Update account with name and language


<a name="answerSignUpQuestion"></a>
# **answerSignUpQuestion**
> answerSignUpQuestion(signupStepAction, answerId)

Answer a signup question

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
String signupStepAction = "signupStepAction_example"; // String | Signup step action
Integer answerId = 56; // Integer | Identifier of the answer
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
 **signupStepAction** | **String**| Signup step action | [enum: Question, StoreLocation, PaymentSubscription]
 **answerId** | **Integer**| Identifier of the answer |

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

Change password

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
ChangePasswordModel changePasswordModel = new ChangePasswordModel(); // ChangePasswordModel | Change password model
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
 **changePasswordModel** | [**ChangePasswordModel**](ChangePasswordModel.md)| Change password model |

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

Change password

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
SetPasswordWithPinModel changePasswordModel = new SetPasswordWithPinModel(); // SetPasswordWithPinModel | Change password model
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
 **changePasswordModel** | [**SetPasswordWithPinModel**](SetPasswordWithPinModel.md)| Change password model |

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

Create account with email address and store name

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
CreateAccountModel createAccountModel = new CreateAccountModel(); // CreateAccountModel | Create account model
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
 **createAccountModel** | [**CreateAccountModel**](CreateAccountModel.md)| Create account model |

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

Gets the current account detail

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

[PRIVATE API] Get timezones localised to users language

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

Login with username and password

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
LoginModel loginModel = new LoginModel(); // LoginModel | Login model
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
 **loginModel** | [**LoginModel**](LoginModel.md)| Login model |

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

Login with SSO token

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

Login with email and pin

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
LoginWithPinModel loginModel = new LoginWithPinModel(); // LoginWithPinModel | Login with pin model
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
 **loginModel** | [**LoginWithPinModel**](LoginWithPinModel.md)| Login with pin model |

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

Log out. It removes Flipdish authorization Cookie.

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

Reset password with token.

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
PasswordResetModel passwordResetModel = new PasswordResetModel(); // PasswordResetModel | Password reset model
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
 **passwordResetModel** | [**PasswordResetModel**](PasswordResetModel.md)| Password reset model |

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

Validate recaptcha from flipdish portal

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
String token = "token_example"; // String | Request token
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
 **token** | **String**| Request token |

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

Request login PIN. The server sends the PIN to the email address.

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
RequestLoginPinModel requestLoginPinRequest = new RequestLoginPinModel(); // RequestLoginPinModel | Request login PIN request
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
 **requestLoginPinRequest** | [**RequestLoginPinModel**](RequestLoginPinModel.md)| Request login PIN request |

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

Request password reset. Flipdish system will send a token via email.

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
RequestPasswordResetModel requestPasswordResetModel = new RequestPasswordResetModel(); // RequestPasswordResetModel | Request password reset model
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
 **requestPasswordResetModel** | [**RequestPasswordResetModel**](RequestPasswordResetModel.md)| Request password reset model |

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

Request Password Reset PIN. The server sends the PIN to the email address.

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

Skip a signup question

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
String signupStepAction = "signupStepAction_example"; // String | Signup step action
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
 **signupStepAction** | **String**| Signup step action | [enum: Question, StoreLocation, PaymentSubscription]

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

Update account with name and language

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
AccountDetailBase updateAccountModel = new AccountDetailBase(); // AccountDetailBase | Update account model
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
 **updateAccountModel** | [**AccountDetailBase**](AccountDetailBase.md)| Update account model |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

