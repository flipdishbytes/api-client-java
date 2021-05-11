
# HydraStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** |  | 
**storeIds** | **List&lt;Integer&gt;** | Store to assign the hydra |  [optional]
**isRegistered** | **Boolean** | The device has been already registered | 
**pinCode** | **Integer** | 6 digit PIN code (not starting with zero). |  [optional]
**images** | **List&lt;String&gt;** | Hydra images (covers) |  [optional]
**userType** | [**UserTypeEnum**](#UserTypeEnum) | Hydra User Type |  [optional]


<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
KIOSK | &quot;Kiosk&quot;
TERMINAL | &quot;Terminal&quot;
LEGACYPRINTER | &quot;LegacyPrinter&quot;



