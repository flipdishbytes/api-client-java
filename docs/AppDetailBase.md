
# AppDetailBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration Type  &lt;example&gt;ExternalLink&lt;/example&gt;&lt;example&gt;FlipdishHosted&lt;/example&gt; | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store Selector Type | 
**fieldGroups** | [**List&lt;FieldGroup&gt;**](FieldGroup.md) | Field Groups |  [optional]
**setupInstructions** | **String** | Setup Instructions |  [optional]
**externalSetupLink** | **String** | External Setup Link |  [optional]
**oauthAppId** | **String** | OAuth App Id | 
**name** | **String** | Name | 
**description** | **String** | Description | 
**logo** | **String** | Logo |  [optional]
**isEnabled** | **Boolean** | Is application enabled |  [optional]
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


<a name="VerificationStatusEnum"></a>
## Enum: VerificationStatusEnum
Name | Value
---- | -----
DRAFT | &quot;Draft&quot;
SUBMITTED | &quot;Submitted&quot;
VERIFIED | &quot;Verified&quot;



