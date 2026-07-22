
# HydraCreatedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**UserEventInfo**](UserEventInfo.md) | Optional user who triggered creation (may be null for device self-create). |  [optional]
**deviceId** | **String** | Device id |  [optional]
**hydraUserId** | **Integer** | Zeus Hydra user id |  [optional]
**userType** | [**UserTypeEnum**](#UserTypeEnum) | Hydra user type (Kiosk / Terminal) |  [optional]
**eventName** | **String** | The event name |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]
**orgId** | **String** | Org id |  [optional]
**ipAddress** | **String** | Ip Address |  [optional]
**activityId** | **String** | Activity Id |  [optional]
**activityType** | **String** | Activity Type |  [optional]


<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
KIOSK | &quot;Kiosk&quot;
TERMINAL | &quot;Terminal&quot;
LEGACYPRINTER | &quot;LegacyPrinter&quot;



