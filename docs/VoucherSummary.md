
# VoucherSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voucherId** | **Integer** | Voucher Id |  [optional]
**code** | **String** | Voucher Code |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Voucher Status |  [optional]
**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | Voucher Type |  [optional]
**voucherSubType** | [**VoucherSubTypeEnum**](#VoucherSubTypeEnum) | Voucher Sub Type |  [optional]
**description** | **String** | Voucher Description (Visible on printout) |  [optional]
**isEnabled** | **Boolean** | Is voucher enabled |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALID | &quot;Valid&quot;
NOTYETVALID | &quot;NotYetValid&quot;
EXPIRED | &quot;Expired&quot;
USED | &quot;Used&quot;
DISABLED | &quot;Disabled&quot;


<a name="VoucherTypeEnum"></a>
## Enum: VoucherTypeEnum
Name | Value
---- | -----
PERCENTAGEDISCOUNT | &quot;PercentageDiscount&quot;
LUMPDISCOUNT | &quot;LumpDiscount&quot;
ADDITEM | &quot;AddItem&quot;
CREDITNOTE | &quot;CreditNote&quot;
FREEDELIVERY | &quot;FreeDelivery&quot;


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



