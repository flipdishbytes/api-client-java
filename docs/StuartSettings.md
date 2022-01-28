
# StuartSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | Client Id |  [optional]
**clientSecret** | **String** | Client Secret |  [optional]
**enabled** | **Boolean** | Enabled |  [optional]
**webhookUrlBasicAuthentication** | **String** | Webhook url to settle in the Stuart portal |  [optional]
**minutesToPickupBeforeThanDeliveryTime** | **Integer** | MinutesToPickupBeforeThanDeliveryTime |  [optional]
**packageType** | [**PackageTypeEnum**](#PackageTypeEnum) | Package type |  [optional]
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | Transport type |  [optional]
**cancelOrderIfStuartCancelDelivery** | **Boolean** | Determines if Flipdish order should be cancel when Stuart cancels delivery |  [optional]
**transportPrices** | [**StuartSettingsTransportPrices**](StuartSettingsTransportPrices.md) |  |  [optional]


<a name="PackageTypeEnum"></a>
## Enum: PackageTypeEnum
Name | Value
---- | -----
XSMALL | &quot;Xsmall&quot;
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
XLARGE | &quot;Xlarge&quot;


<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
BIKE | &quot;Bike&quot;
CARGOBIKE | &quot;Cargobike&quot;
CARGOBIKEXL | &quot;Cargobikexl&quot;
MOTORBIKE | &quot;Motorbike&quot;
MOTORBIKEXL | &quot;Motorbikexl&quot;
CAR | &quot;Car&quot;
VAN | &quot;Van&quot;



