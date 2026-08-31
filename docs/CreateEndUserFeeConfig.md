
# CreateEndUserFeeConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | [**ChannelEnum**](#ChannelEnum) | The order channel this fee config applies to | 
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method this fee config applies to | 
**minOrderAmount** | **Double** | Order amount below which MinFixedFee is charged instead of the percent/fixed calculation |  [optional]
**minFixedFee** | **Double** | Fixed fee charged for orders at or below MinOrderAmount |  [optional]
**percentFee** | **Double** | Percentage fee applied to the order amount |  [optional]
**fixedFee** | **Double** | Fixed fee compared against the percentage fee - the greater of the two is charged |  [optional]
**cap** | **Double** | Maximum fee that can be charged |  [optional]


<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
WEBAPP | &quot;WebApp&quot;
INSTORE | &quot;InStore&quot;
KIOSK | &quot;Kiosk&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
CASH | &quot;Cash&quot;
CARD | &quot;Card&quot;



