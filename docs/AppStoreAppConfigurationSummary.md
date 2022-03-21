
# AppStoreAppConfigurationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique App store app configuration id | 
**appId** | **String** | App Id | 
**isEnabled** | **Boolean** | Is enabled | 
**physicalRestaurants** | [**List&lt;ConfiguredPhysicalRestaurant&gt;**](ConfiguredPhysicalRestaurant.md) | List of stores | 
**configurationType** | [**ConfigurationTypeEnum**](#ConfigurationTypeEnum) | Configuration type |  [optional]
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store selector type |  [optional]
**appStoreAppId** | **String** | Unique App store app id | 
**name** | **String** | Name of Appstore app | 
**description** | **String** | Description | 
**logo** | **String** | Logo |  [optional]
**developerName** | **String** | Developer name |  [optional]


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


