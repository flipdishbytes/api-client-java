
# HydraStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** |  | 
**storeIds** | **List&lt;Integer&gt;** | Store to assign the hydra |  [optional]
**propertyIds** | **List&lt;String&gt;** | AuthZ Property ids for assigned stores |  [optional]
**isRegistered** | **Boolean** | The device has been already registered | 
**pinCode** | **Integer** | 6 digit PIN code (not starting with zero). |  [optional]
**images** | **List&lt;String&gt;** | Hydra images (covers) |  [optional]
**userType** | [**UserTypeEnum**](#UserTypeEnum) | Hydra User Type as integer. Prefer {Flipdish.PublicModels.V1.Hydra.HydraStatus.DeviceType}. |  [optional]
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) | Hydra device type (Kiosk / Terminal), serialized as string. |  [optional]
**hydraUserId** | **Integer** | Zeus Hydra user id |  [optional]


<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
KIOSK | &quot;Kiosk&quot;
TERMINAL | &quot;Terminal&quot;
LEGACYPRINTER | &quot;LegacyPrinter&quot;


<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
KIOSK | &quot;Kiosk&quot;
TERMINAL | &quot;Terminal&quot;
LEGACYPRINTER | &quot;LegacyPrinter&quot;



