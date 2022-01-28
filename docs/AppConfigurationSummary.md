
# AppConfigurationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Application Configuration Public Id | 
**appId** | **String** | Whitelabel App Id | 
**isEnabled** | **Boolean** | Is Enabled | 
**physicalRestaurants** | [**List&lt;ConfiguredPhysicalRestaurant&gt;**](ConfiguredPhysicalRestaurant.md) | List of restaurants | 
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration Type |  [optional]
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store Selector Type |  [optional]
**appStoreAppId** | **String** | AppStore App Id | 
**name** | **String** | Name | 
**description** | **String** | Description | 
**logo** | **String** | Logo |  [optional]
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



