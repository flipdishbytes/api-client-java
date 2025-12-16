
# FulfillmentStatesConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**states** | [**List&lt;FulfillmentStatusConfigurationItem&gt;**](FulfillmentStatusConfigurationItem.md) | States |  [optional]
**automaticTransitionsEnabled** | **Boolean** | Enable automatic transitions |  [optional]
**appId** | **String** | AppId |  [optional]
**configurationUid** | **String** | Configuration Uid |  [optional]
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store Selector Type |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Store Ids |  [optional]
**name** | **String** | Name |  [optional]


<a name="StoreSelectorTypeEnum"></a>
## Enum: StoreSelectorTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SINGLE | &quot;Single&quot;
MULTIPLE | &quot;Multiple&quot;



