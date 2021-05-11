
# OrderCapacityConfigUpdatedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | **String** | The event name |  [optional]
**storeId** | **Integer** | Id of the store whose order capacity configuration has been updated |  [optional]
**user** | [**UserEventInfo**](UserEventInfo.md) | User which updated order capacity configuration for this store |  [optional]
**description** | **String** | Description |  [optional]
**orderCapacityConfig** | [**StoreOrderCapacityConfigEditModel**](StoreOrderCapacityConfigEditModel.md) | Updated order capacity configuration |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]



