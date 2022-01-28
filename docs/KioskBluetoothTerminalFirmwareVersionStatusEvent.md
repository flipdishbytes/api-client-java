
# KioskBluetoothTerminalFirmwareVersionStatusEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | Device Id of the Kiosk |  [optional]
**serialNumber** | **String** | Serial Number of the device |  [optional]
**hasFirmwareUpdate** | **Boolean** | Indicates if Payment Terminal has Firmware Update |  [optional]
**hasConfigUpdate** | **Boolean** | Indicates if Payment Terminal has Config Update |  [optional]
**hasKeyUpdate** | **Boolean** | Indicates if Payment Terminal has Key Update |  [optional]
**updateTimeEstimate** | [**UpdateTimeEstimateEnum**](#UpdateTimeEstimateEnum) | ETA to install the update |  [optional]
**userEventInfo** | [**UserEventInfo**](UserEventInfo.md) | User who made the changes |  [optional]
**eventName** | **String** | The event name |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]


<a name="UpdateTimeEstimateEnum"></a>
## Enum: UpdateTimeEstimateEnum
Name | Value
---- | -----
LESSTHANONEMINUTE | &quot;LessThanOneMinute&quot;
ONETOTWOMINUTES | &quot;OneToTwoMinutes&quot;
TWOTOFIVEMINUTES | &quot;TwoToFiveMinutes&quot;
FIVETOFIFTEENMINUTES | &quot;FiveToFifteenMinutes&quot;



