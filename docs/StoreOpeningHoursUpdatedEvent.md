
# StoreOpeningHoursUpdatedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | **String** | The event name |  [optional]
**storeId** | **Integer** | Store Id |  [optional]
**storeGroupId** | **Integer** | Store group Id |  [optional]
**user** | [**UserEventInfo**](UserEventInfo.md) | User which updated opening hours for this store |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | Type of opening hours Delivery / Pickup |  [optional]
**businessHoursPeriodOld** | [**BusinessHoursPeriod**](BusinessHoursPeriod.md) | The period that was updated |  [optional]
**businessHoursPeriod** | [**BusinessHoursPeriod**](BusinessHoursPeriod.md) | The new values of the period |  [optional]
**description** | **String** | Description |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;



