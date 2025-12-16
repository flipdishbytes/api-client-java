
# BusinessHoursOverride

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessHoursOverrideId** | **Integer** | Unique identifier |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | Delivery or Pickup |  [optional]
**startTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time in ISO 8601 format. | 
**endTime** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time in ISO 8601 format. | 
**type** | [**TypeEnum**](#TypeEnum) | Open, Closed or ClosedAllowPreOrders |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLOSED | &quot;Closed&quot;
CLOSEDALLOWPREORDERS | &quot;ClosedAllowPreOrders&quot;



