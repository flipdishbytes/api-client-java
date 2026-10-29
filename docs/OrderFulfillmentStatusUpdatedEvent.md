
# OrderFulfillmentStatusUpdatedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | **String** | The event name |  [optional]
**storeId** | **Integer** | Store Id |  [optional]
**description** | **String** | Description |  [optional]
**orderId** | **Integer** | Order Id |  [optional]
**statusName** | **String** | Fulfillment status name |  [optional]
**statusId** | **String** | Fulfillment status ID |  [optional]
**customer** | [**FulfillmentStatusEventCustomer**](FulfillmentStatusEventCustomer.md) | Optional slim customer (Id + language) for push / notification consumers |  [optional]
**store** | [**FulfillmentStatusEventStore**](FulfillmentStatusEventStore.md) | Optional slim store (Name); StoreId remains top-level |  [optional]
**appType** | **String** | Order app type (e.g. Ios, Android) when known |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]
**orgId** | **String** | Org id |  [optional]
**ipAddress** | **String** | Ip Address |  [optional]
**activityId** | **String** | Activity Id |  [optional]
**activityType** | **String** | Activity Type |  [optional]



