
# KioskBluetoothTerminalUnpairedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | Device Id of the Kiosk |  [optional]
**bluetoothTerminalType** | [**BluetoothTerminalTypeEnum**](#BluetoothTerminalTypeEnum) | Terminal Type |  [optional]
**user** | [**UserEventInfo**](UserEventInfo.md) | User who made the change |  [optional]
**eventName** | **String** | The event name |  [optional]
**flipdishEventId** | [**UUID**](UUID.md) | The identitfier of the event |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of creation of the event |  [optional]
**position** | **Integer** | Position |  [optional]
**appId** | **String** | App id |  [optional]
**ipAddress** | **String** | Ip Address |  [optional]


<a name="BluetoothTerminalTypeEnum"></a>
## Enum: BluetoothTerminalTypeEnum
Name | Value
---- | -----
CHIPPER_2X | &quot;CHIPPER_2X&quot;
COTS_DEVICE | &quot;COTS_DEVICE&quot;
VERIFONE_P400 | &quot;VERIFONE_P400&quot;
WISEPAD_3 | &quot;WISEPAD_3&quot;



