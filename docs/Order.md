
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**store** | [**StoreSummary**](StoreSummary.md) | Store summary |  [optional]
**customer** | [**CustomerSummary**](CustomerSummary.md) | Customer summary |  [optional]
**voucher** | [**OrderVoucherSummary**](OrderVoucherSummary.md) | Voucher summary |  [optional]
**fees** | [**FeeSummary**](FeeSummary.md) | Fee summary |  [optional]
**orderItems** | [**List&lt;OrderItem&gt;**](OrderItem.md) | Ordered items |  [optional]
**deliveryLocation** | [**DeliveryLocation**](DeliveryLocation.md) | Delivery location for delivery orders |  [optional]
**customerLocation** | [**Coordinates**](Coordinates.md) | Customer location |  [optional]
**orderId** | **Integer** | Order identifier |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | Delivery type |  [optional]
**pickupLocationType** | [**PickupLocationTypeEnum**](#PickupLocationTypeEnum) | Pickup location type |  [optional]
**tipAmount** | **Double** | Tip amount |  [optional]
**deliveryAmount** | **Double** | Delivery amount |  [optional]
**orderItemsAmount** | **Double** | Ordered items amount |  [optional]
**amount** | **Double** | This is the sum of the OrderItemsAmount, DeliveryAmount, TipAmount and Voucher.Amount (which is usually negative) and OnlineOrderingFee for cash orders.  It does not include the OnlineOrderingFee in the case of card orders as this fee is charged by Flipdish directly to the customer. |  [optional]
**processingFee** | **Double** | This contains the online ordering processing fee. For card payments this is charged directly to the customer and for cash orders it is paid by the customer to the store. It is tax inclusive. |  [optional]
**paymentAccountType** | [**PaymentAccountTypeEnum**](#PaymentAccountTypeEnum) | Payment account type |  [optional]
**paymentAccountDescription** | **String** | Payment account description (like Visa ****2371 or Apple Pay. or Cash) |  [optional]
**orderState** | [**OrderStateEnum**](#OrderStateEnum) | Order state |  [optional]
**isPreOrder** | **Boolean** | Is pre-order |  [optional]
**placedTime** | [**OffsetDateTime**](OffsetDateTime.md) | Order placed time |  [optional]
**requestedForTime** | [**OffsetDateTime**](OffsetDateTime.md) | Order requested for |  [optional]
**chefNote** | **String** | Chef note |  [optional]
**appType** | [**AppTypeEnum**](#AppTypeEnum) | Used app type |  [optional]
**userRating** | **Integer** | User rating |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Status of the payment |  [optional]
**rejectionReason** | [**RejectionReasonEnum**](#RejectionReasonEnum) | Rejection reason. Can have value if the order is rejected. |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;


<a name="PickupLocationTypeEnum"></a>
## Enum: PickupLocationTypeEnum
Name | Value
---- | -----
TAKEOUT | &quot;TakeOut&quot;
TABLESERVICE | &quot;TableService&quot;
DINEIN | &quot;DineIn&quot;


<a name="PaymentAccountTypeEnum"></a>
## Enum: PaymentAccountTypeEnum
Name | Value
---- | -----
CARD | &quot;Card&quot;
CASH | &quot;Cash&quot;
IDEAL | &quot;Ideal&quot;
BANCONTACT | &quot;Bancontact&quot;
GIROPAY | &quot;Giropay&quot;
EPS | &quot;Eps&quot;


<a name="OrderStateEnum"></a>
## Enum: OrderStateEnum
Name | Value
---- | -----
CREATED | &quot;Created&quot;
PLACEDCANBECANCELLED | &quot;PlacedCanBeCancelled&quot;
READYTOPROCESS | &quot;ReadyToProcess&quot;
ACCEPTEDBYRESTAURANT | &quot;AcceptedByRestaurant&quot;
DISPATCHED | &quot;Dispatched&quot;
DELIVERED | &quot;Delivered&quot;
CANCELLED | &quot;Cancelled&quot;
MANUALREVIEW | &quot;ManualReview&quot;
REJECTEDBYSTORE | &quot;RejectedByStore&quot;
REJECTEDBYFLIPDISH | &quot;RejectedByFlipdish&quot;
REJECTEDAUTOMATICALLY | &quot;RejectedAutomatically&quot;
REJECTEDAFTERBEINGACCEPTED | &quot;RejectedAfterBeingAccepted&quot;
ACCEPTEDANDREFUNDED | &quot;AcceptedAndRefunded&quot;


<a name="AppTypeEnum"></a>
## Enum: AppTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;Ios&quot;
ANDROID | &quot;Android&quot;
WEB | &quot;Web&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
TELEPHONECALL | &quot;TelephoneCall&quot;
SMS | &quot;Sms&quot;
PWAANDROID | &quot;PwaAndroid&quot;
PWAIOS | &quot;PwaIos&quot;


<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
PAID | &quot;Paid&quot;
UNPAID | &quot;Unpaid&quot;
REFUNDED | &quot;Refunded&quot;
PARTIALLYREFUNDED | &quot;PartiallyRefunded&quot;
DISPUTED | &quot;Disputed&quot;


<a name="RejectionReasonEnum"></a>
## Enum: RejectionReasonEnum
Name | Value
---- | -----
TOOBUSY | &quot;TooBusy&quot;
FOODUNAVAILABLE | &quot;FoodUnavailable&quot;
UNABLETODELIVER | &quot;UnableToDeliver&quot;
UNKNOWNADDRESS | &quot;UnknownAddress&quot;
UNKNOWNREASON | &quot;UnknownReason&quot;
TOOSOON | &quot;TooSoon&quot;
TIMEUNAVAILABLE | &quot;TimeUnavailable&quot;
DONTDELIVERTOAREA | &quot;DontDeliverToArea&quot;
STOREUNCONTACTABLE | &quot;StoreUncontactable&quot;



