
# FulfillmentInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dispatchType** | [**DispatchTypeEnum**](#DispatchTypeEnum) | [Required] Dispatch Type (i.e Pickup / Delivery) |  [optional]
**requestedForUtc** | [**OffsetDateTime**](OffsetDateTime.md) | [Required] Time the order is requested for |  [optional]
**location** | [**Location**](Location.md) | Location the order is to be delivered to  [Required] Delivery  [Not Required] Pickup |  [optional]
**dispatchAmount** | [**Price**](Price.md) | Price of the dispatch, normally 0 for collection and a value for delivery  [Required] Delivery  [Not Required] Pickup |  [optional]


<a name="DispatchTypeEnum"></a>
## Enum: DispatchTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;



