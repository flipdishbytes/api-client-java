
# HydraDeviceDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hydraConfigId** | **Integer** | Flipdish internal device identifier |  [optional]
**deviceId** | **String** | Device Id |  [optional]
**serialNumber** | **String** | Serial Number |  [optional]
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Type of the device |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the device |  [optional]
**deviceName** | **String** | Device Name |  [optional]
**storeNames** | [**List&lt;HydraStoreData&gt;**](HydraStoreData.md) | Store Names |  [optional]
**lastPollUtc** | [**OffsetDateTime**](OffsetDateTime.md) | Last poll time in UTC |  [optional]
**version** | **String** | Version of the device |  [optional]
**buildNumber** | **String** | Build number of the device |  [optional]
**gitSha** | **String** | SHA of the commit |  [optional]
**gitBranch** | **String** | Build branch |  [optional]


<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
KIOSK | &quot;Kiosk&quot;
TERMINAL | &quot;Terminal&quot;
LEGACYPRINTER | &quot;LegacyPrinter&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ONLINE | &quot;Online&quot;
POSSIBLYOFFLINE | &quot;PossiblyOffline&quot;
OFFLINE | &quot;Offline&quot;



