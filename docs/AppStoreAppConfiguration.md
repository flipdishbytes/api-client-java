
# AppStoreAppConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique App store app configuration id | 
**appId** | **String** | App id | 
**appStoreAppId** | **String** | App store app id | 
**isEnabled** | **Boolean** | Is enabled | 
**storeIds** | **List&lt;Integer&gt;** | Stores id&#39;s |  [optional]
**settings** | [**List&lt;Setting&gt;**](Setting.md) | Settings |  [optional]
**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | Application verification status | 
**logo** | **String** | Logo |  [optional]
**oauthAppId** | **String** | OAuth App identifier | 
**internal** | **Boolean** | Internal | 
**details** | **String** | Details | 
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration type  &lt;example&gt;External link&lt;/example&gt;&lt;example&gt;Flipdish hosted&lt;/example&gt; | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store selector type | 
**fieldGroups** | [**List&lt;FieldGroup&gt;**](FieldGroup.md) | Field groups |  [optional]
**setupInstructions** | **String** | Setup instructions |  [optional]
**externalSetupLink** | **String** | External setup link |  [optional]
**teammateAppAccessLevel** | [**TeammateAppAccessLevelEnum**](#TeammateAppAccessLevelEnum) | Teammate app access level |  [optional]
**permissionsType** | [**PermissionsTypeEnum**](#PermissionsTypeEnum) | Permissions type | 
**support** | [**AppStoreAppSupportInfo**](AppStoreAppSupportInfo.md) | Support information |  [optional]
**externalFunctionActionUrl** | **String** | Action URL for external functions, used for handling Portal configuration action buttons |  [optional]
**externalFunctionSignatureKey** | **String** | Signing key for external function action calls |  [optional]
**isPaid** | **Boolean** | Is Paid |  [optional]
**name** | **String** | Name | 
**description** | **String** | Description | 
**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Categories | 
**countries** | [**List&lt;CountriesEnum&gt;**](#List&lt;CountriesEnum&gt;) | Countries | 
**developerName** | **String** | Developer Name |  [optional]


<a name="VerificationStatusEnum"></a>
## Enum: VerificationStatusEnum
Name | Value
---- | -----
DRAFT | &quot;Draft&quot;
SUBMITTED | &quot;Submitted&quot;
VERIFIED | &quot;Verified&quot;


<a name="ConfigurationTypeEnum"></a>
## Enum: ConfigurationTypeEnum
Name | Value
---- | -----
EXTERNALLINK | &quot;ExternalLink&quot;
FLIPDISHHOSTED | &quot;FlipdishHosted&quot;


<a name="StoreSelectorTypeEnum"></a>
## Enum: StoreSelectorTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SINGLE | &quot;Single&quot;
MULTIPLE | &quot;Multiple&quot;


<a name="TeammateAppAccessLevelEnum"></a>
## Enum: TeammateAppAccessLevelEnum
Name | Value
---- | -----
OWNER | &quot;Owner&quot;
STOREOWNER | &quot;StoreOwner&quot;
MANAGEDOWNER | &quot;ManagedOwner&quot;
INTEGRATOR | &quot;Integrator&quot;
STOREMANAGER | &quot;StoreManager&quot;
STORESTAFF | &quot;StoreStaff&quot;
STOREREADONLYACCESS | &quot;StoreReadOnlyAccess&quot;
FINANCEMANGER | &quot;FinanceManger&quot;


<a name="PermissionsTypeEnum"></a>
## Enum: PermissionsTypeEnum
Name | Value
---- | -----
TEAMMATE | &quot;Teammate&quot;


<a name="List<CategoriesEnum>"></a>
## Enum: List&lt;CategoriesEnum&gt;
Name | Value
---- | -----
POINTOFSALE | &quot;PointOfSale&quot;
DELIVERYANDLOGISTICS | &quot;DeliveryAndLogistics&quot;
CRM | &quot;CRM&quot;
GIFTCARD | &quot;GiftCard&quot;
ACCOUNTING | &quot;Accounting&quot;
LOYALTYANDMARKETING | &quot;LoyaltyAndMarketing&quot;
OTHER | &quot;Other&quot;


<a name="List<CountriesEnum>"></a>
## Enum: List&lt;CountriesEnum&gt;
Name | Value
---- | -----
GB | &quot;GB&quot;
IE | &quot;IE&quot;
FR | &quot;FR&quot;
ES | &quot;ES&quot;
PT | &quot;PT&quot;
IT | &quot;IT&quot;
DE | &quot;DE&quot;
PL | &quot;PL&quot;
BE | &quot;BE&quot;
LU | &quot;LU&quot;
NL | &quot;NL&quot;
US | &quot;US&quot;
CA | &quot;CA&quot;
BG | &quot;BG&quot;
MX | &quot;MX&quot;
AU | &quot;AU&quot;
NZ | &quot;NZ&quot;



