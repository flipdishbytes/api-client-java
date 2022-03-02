
# AppConfigurationDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Application Configuration Public Id | 
**appId** | **String** | Whitelabel App Id | 
**appStoreAppId** | **String** | App Store App Id | 
**isEnabled** | **Boolean** | Is Enabled | 
**physicalRestaurants** | **List&lt;Integer&gt;** | Physical Restaurant Id&#39;s |  [optional]
**settings** | [**List&lt;Setting&gt;**](Setting.md) | Settings |  [optional]
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration Type  &lt;example&gt;ExternalLink&lt;/example&gt;&lt;example&gt;FlipdishHosted&lt;/example&gt; | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store Selector Type | 
**fieldGroups** | [**List&lt;FieldGroup&gt;**](FieldGroup.md) | Field Groups |  [optional]
**setupInstructions** | **String** | Setup Instructions |  [optional]
**externalSetupLink** | **String** | External Setup Link |  [optional]
**oauthAppId** | **String** | OAuth App Id | 
**teammateAppAccessLevel** | [**TeammateAppAccessLevelEnum**](#TeammateAppAccessLevelEnum) | Teammate App Access Level |  [optional]
**permissionsType** | [**PermissionsTypeEnum**](#PermissionsTypeEnum) | Permissions Type | 
**name** | **String** | Name | 
**description** | **String** | Description | 
**logo** | **String** | Logo |  [optional]
**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | Application verification status | 
**tags** | **List&lt;String&gt;** | Tags | 
**regions** | **List&lt;String&gt;** | Regions | 
**developerName** | **String** | Developer Name |  [optional]


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


<a name="VerificationStatusEnum"></a>
## Enum: VerificationStatusEnum
Name | Value
---- | -----
DRAFT | &quot;Draft&quot;
SUBMITTED | &quot;Submitted&quot;
VERIFIED | &quot;Verified&quot;



