
# UpdateVoucher

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promotionId** | **Integer** | Promotion ID to update |  [optional]
**promotionName** | **String** | The updated name of the promotion |  [optional]
**promotionAwardMenuItemPublicIds** | [**List&lt;UUID&gt;**](UUID.md) | The updated menu items that the promotion awards |  [optional]
**code** | **String** | Voucher Code |  [optional]
**description** | **String** | Voucher Description (Visible on printout) |  [optional]
**stores** | **List&lt;Integer&gt;** | Stores that this voucher applies to |  [optional]
**validOnOrdersOver** | **Double** | Valid on orders on or above |  [optional]
**takesPriority** | **Boolean** | Takes priority |  [optional]
**isEnabled** | **Boolean** | Is voucher enabled |  [optional]
**isAutomaticallyApplied** | **Boolean** | Is voucher automatically applied |  [optional]
**includeDeliveryFee** | **Boolean** | Include delivery fees |  [optional]
**isValidForDeliveryOrders** | **Boolean** | Valid for delivery orders |  [optional]
**isValidForPickupOrders** | **Boolean** | Valid for pickup orders |  [optional]
**isValidForOrdersPayedOnline** | **Boolean** | Valid for orders payed online |  [optional]
**isValidForOrdersPayedByCash** | **Boolean** | Valid for orders payed in cash |  [optional]
**isValidForFirstOrderOnly** | **Boolean** | Valid only on the first order by the customer |  [optional]
**isValidOncePerCustomer** | **Boolean** | Valid once per customer |  [optional]
**isValidOnlyOnce** | **Boolean** | Valid only once, by any customer (once used cannot be used again by any other customer) |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Voucher Starts On (Time in UTC) |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Voucher Expires On (Time in UTC) |  [optional]
**channelRestrictions** | [**List&lt;ChannelRestrictionsEnum&gt;**](#List&lt;ChannelRestrictionsEnum&gt;) | Limit the channels this voucher can be used on |  [optional]
**voucherSubType** | [**VoucherSubTypeEnum**](#VoucherSubTypeEnum) | Voucher Subtype |  [optional]
**customerId** | **Integer** | Customer UserID |  [optional]


<a name="List<ChannelRestrictionsEnum>"></a>
## Enum: List&lt;ChannelRestrictionsEnum&gt;
Name | Value
---- | -----
IOS | &quot;Ios&quot;
ANDROID | &quot;Android&quot;
WEB | &quot;Web&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
GOOGLE | &quot;Google&quot;


<a name="VoucherSubTypeEnum"></a>
## Enum: VoucherSubTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SIGNUP | &quot;SignUp&quot;
LOYALTY | &quot;Loyalty&quot;
LOYALTY25 | &quot;Loyalty25&quot;
RETENTION | &quot;Retention&quot;
SECONDARYRETENTION | &quot;SecondaryRetention&quot;
CUSTOM | &quot;Custom&quot;



