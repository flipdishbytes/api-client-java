
# UserInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | The user&#39;s phone number. |  [optional]
**email** | **String** | The user&#39;s email address. |  [optional]
**emailConfirmed** | **Boolean** | Indicates if the user&#39;s email address has been confirmed. |  [optional]
**preventFromUsingCards** | **Boolean** | Indicates if the user is prevented from using cards. |  [optional]
**isUserPhoneNumberBlocked** | **Boolean** | Indicates if the user&#39;s phone number is blocked. |  [optional]
**userWhiteLabels** | [**List&lt;UserWhiteLabelInfo&gt;**](UserWhiteLabelInfo.md) | List of white label information associated with the user. |  [optional]
**userId** | **Integer** | The unique identifier for the user. |  [optional]
**userName** | **String** | The user&#39;s username. |  [optional]
**customerName** | **String** | The customer&#39;s name. |  [optional]
**hasLoggedIn** | **Boolean** | Indicates if the user has logged in. |  [optional]
**disableAppRatingControl** | **Boolean** | Indicates if the app rating control is disabled for the user. |  [optional]
**globallyOptedOut** | **Boolean** | Indicates if the user has globally opted out. |  [optional]
**completedOrderCount** | **Integer** | The number of completed orders by the user. |  [optional]
**cancelledOrderCount** | **Integer** | The number of cancelled orders by the user. |  [optional]
**orderTotalValue** | **Double** | The total value of orders placed by the user. |  [optional]
**tsMostRecentOrder** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the user&#39;s most recent order. |  [optional]
**tsFirstOrder** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the user&#39;s first order. |  [optional]
**isRestaurantUser** | **Boolean** | Indicates if the user is a restaurant user. |  [optional]
**installs** | [**List&lt;AppInstall&gt;**](AppInstall.md) | List of app installs associated with the user. |  [optional]
**deliveryLocations** | [**List&lt;DeliveryLocation&gt;**](DeliveryLocation.md) | List of delivery locations associated with the user. |  [optional]
**paymentAccounts** | [**List&lt;PaymentAccount&gt;**](PaymentAccount.md) | List of payment accounts associated with the user. |  [optional]
**languageId** | **String** | The language identifier for the user. |  [optional]
**currentLanguageName** | **String** | Current language name for the user. |  [optional]
**languages** | [**List&lt;Language&gt;**](Language.md) | Available languages that the user can choose from. |  [optional]
**salesForceContactId** | **String** | The Salesforce contact ID for the user. |  [optional]
**stripeCustomerId** | **String** | The Stripe customer ID for the user. |  [optional]
**userMonthlyCommissions** | [**List&lt;UserMonthlyCommission&gt;**](UserMonthlyCommission.md) | User&#39;s monthly commissions. |  [optional]



