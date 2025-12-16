
# AppStoreAppConfigurationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**appId** | **String** |  | 
**isEnabled** | **Boolean** |  | 
**stores** | [**List&lt;ConfiguredStore&gt;**](ConfiguredStore.md) |  | 
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) |  | 
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) |  | 
**internal** | **Boolean** |  | 
**appStoreAppId** | **String** |  | 
**name** | **String** |  | 
**description** | **String** |  | 
**logo** | **String** |  |  [optional]
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



