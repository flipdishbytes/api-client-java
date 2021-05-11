
# HydraConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimumVersion** | **String** | Minimum version | 
**paymentOptions** | [**List&lt;PaymentOptionsEnum&gt;**](#List&lt;PaymentOptionsEnum&gt;) | Payment options | 
**deviceSettings** | [**DeviceSettings**](DeviceSettings.md) | Device settings | 
**version** | **String** | Version of the device |  [optional]
**buildNumber** | **String** | Build number of the device |  [optional]
**gitSha** | **String** | SHA of the commit |  [optional]
**gitBranch** | **String** | Build branch |  [optional]


<a name="List<PaymentOptionsEnum>"></a>
## Enum: List&lt;PaymentOptionsEnum&gt;
Name | Value
---- | -----
ONLINE | &quot;Online&quot;
EMV | &quot;Emv&quot;
COUNTER | &quot;Counter&quot;



