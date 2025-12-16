
# BluetoothTerminalStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serialNumber** | **String** | Serial Number |  [optional]
**softwareVersion** | **String** | Software Version |  [optional]
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Device Type |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Device Status |  [optional]
**batteryLevel** | **Float** | Indication of the battery level from 0 to 1 |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last time the status was updated |  [optional]
**readerId** | **String** | ReaderId for Stripe Terminal |  [optional]


<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
CHIPPER_2X | &quot;CHIPPER_2X&quot;
COTS_DEVICE | &quot;COTS_DEVICE&quot;
VERIFONE_P400 | &quot;VERIFONE_P400&quot;
WISEPAD_3 | &quot;WISEPAD_3&quot;
WISEPOS_E | &quot;WISEPOS_E&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_CONNECTED | &quot;Not_Connected&quot;
CONNECTING | &quot;Connecting&quot;
CONNECTED | &quot;Connected&quot;
ONLINE | &quot;Online&quot;
OFFLINE | &quot;Offline&quot;



