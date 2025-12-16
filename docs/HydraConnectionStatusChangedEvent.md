
# HydraConnectionStatusChangedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | Hydra Device Id |  [optional]
**hydraDeviceStatus** | [**HydraDeviceStatusEnum**](#HydraDeviceStatusEnum) | Hydra Device Status |  [optional]
**pollTime** | [**OffsetDateTime**](OffsetDateTime.md) | Hydra Last Poll Time |  [optional]
**eventName** | **String** | The event name |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]
**orgId** | **String** | Org id |  [optional]
**ipAddress** | **String** | Ip Address |  [optional]


<a name="HydraDeviceStatusEnum"></a>
## Enum: HydraDeviceStatusEnum
Name | Value
---- | -----
ONLINE | &quot;Online&quot;
POSSIBLYOFFLINE | &quot;PossiblyOffline&quot;
OFFLINE | &quot;Offline&quot;



