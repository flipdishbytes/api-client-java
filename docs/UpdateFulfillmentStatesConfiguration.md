
# UpdateFulfillmentStatesConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overwriteSystemTemplate** | **Boolean** | Set to true if a system configuration template is to be updated (permissions also needed) |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Stores id&#39;s |  [optional]
**storeSelectorType** | [**StoreSelectorTypeEnum**](#StoreSelectorTypeEnum) | Store Selector Type |  [optional]
**states** | [**List&lt;FulfillmentStatusConfigurationItem&gt;**](FulfillmentStatusConfigurationItem.md) | Settings |  [optional]
**automaticTransitionsEnabled** | **Boolean** | Enable automatic transitions |  [optional]
**name** | **String** | Name |  [optional]


<a name="StoreSelectorTypeEnum"></a>
## Enum: StoreSelectorTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SINGLE | &quot;Single&quot;
MULTIPLE | &quot;Multiple&quot;



