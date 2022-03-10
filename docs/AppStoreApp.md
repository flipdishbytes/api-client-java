
# AppStoreApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique App store app id | 
**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | Application verification status | 
**logo** | **String** | Logo |  [optional]
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration type  &lt;example&gt;External link&lt;/example&gt;&lt;example&gt;Flipdish hosted&lt;/example&gt; | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store selector type | 
**fieldGroups** | [**List&lt;FieldGroup&gt;**](FieldGroup.md) | Field groups |  [optional]
**setupInstructions** | **String** | Setup instructions |  [optional]
**externalSetupLink** | **String** | External setup link |  [optional]
**oauthAppId** | **String** | OAuth app id | 
**teammateAppAccessLevel** | [**TeammateAppAccessLevelEnum**](#TeammateAppAccessLevelEnum) | Teammate app access level |  [optional]
**permissionsType** | [**PermissionsTypeEnum**](#PermissionsTypeEnum) | Permissions type | 
**name** | **String** | Name | 
**description** | **String** | Description | 
**isEnabled** | **Boolean** | Is application enabled |  [optional]
**tags** | **List&lt;String&gt;** | Tags | 
**regions** | **List&lt;String&gt;** | Regions | 
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



