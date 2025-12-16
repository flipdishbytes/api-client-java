
# StoreOrderCapacityConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **Integer** | Store identifier |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | Signifies whether the order capacity configuration is for Delivery / Pickup |  [optional]
**storeIntervalInMinutes** | **Integer** | Store Interval - time between orders, e.g. 10 minutes between each order time available to customer |  [optional]
**orderCapacityPeriods** | [**List&lt;StoreOrderCapacityPeriod&gt;**](StoreOrderCapacityPeriod.md) | Order capacity periods |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;



