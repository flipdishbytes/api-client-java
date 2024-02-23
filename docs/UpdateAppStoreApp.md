
# UpdateAppStoreApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | **String** |  | 
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) |  | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) |  | 
**fieldGroups** | [**List&lt;FieldGroup&gt;**](FieldGroup.md) |  |  [optional]
**setupInstructions** | **String** |  |  [optional]
**externalSetupLink** | **String** |  |  [optional]
**teammateAppAccessLevel** | [**TeammateAppAccessLevelEnum**](#TeammateAppAccessLevelEnum) |  |  [optional]
**permissionsType** | [**PermissionsTypeEnum**](#PermissionsTypeEnum) |  | 
**support** | [**AppStoreAppSupportInfo**](AppStoreAppSupportInfo.md) |  |  [optional]
**externalFunctionActionUrl** | **String** |  |  [optional]
**externalFunctionSignatureKey** | **String** |  |  [optional]
**isPaid** | **Boolean** |  |  [optional]
**name** | **String** |  | 
**description** | **String** |  | 
**isEnabled** | **Boolean** |  |  [optional]
**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) |  | 
**countries** | [**List&lt;CountriesEnum&gt;**](#List&lt;CountriesEnum&gt;) |  | 
**developerName** | **String** |  |  [optional]


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



