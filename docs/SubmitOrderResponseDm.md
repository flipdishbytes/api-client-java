
# SubmitOrderResponseDm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** |  |  [optional]
**localOrderId** | **String** |  |  [optional]
**deliveryTimeEstimateMinutes** | **Integer** |  |  [optional]
**orderPlacedMessage** | **String** |  |  [optional]
**displayTipControl** | **Boolean** |  |  [optional]
**displayRateAppControl** | **Boolean** |  |  [optional]
**cancelOrderPeriodSeconds** | **Integer** |  |  [optional]
**restaurantName** | **String** |  |  [optional]
**linkText** | **String** |  |  [optional]
**linkUrl** | **String** |  |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) |  |  [optional]
**duringOrderPromotionOptions** | [**DuringOrderPromotionOptionsDm**](DuringOrderPromotionOptionsDm.md) |  |  [optional]
**redirectUri** | **String** |  |  [optional]
**pickupCode** | **String** |  |  [optional]
**restaurantAddress** | **String** |  |  [optional]
**paymentIntentClientSecret** | **String** |  |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;



