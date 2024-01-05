
# OrderVoucherSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voucherId** | **Integer** | Voucher ID |  [optional]
**name** | **String** | Voucher name |  [optional]
**description** | **String** | Voucher description |  [optional]
**code** | **String** | Voucher code |  [optional]
**amount** | **Double** | Voucher amount |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Voucher type |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | Voucher sub type |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PERCENTAGEDISCOUNT | &quot;PercentageDiscount&quot;
LUMPDISCOUNT | &quot;LumpDiscount&quot;
ADDITEM | &quot;AddItem&quot;
CREDITNOTE | &quot;CreditNote&quot;


<a name="SubTypeEnum"></a>
## Enum: SubTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SIGNUP | &quot;SignUp&quot;
LOYALTY | &quot;Loyalty&quot;
LOYALTY25 | &quot;Loyalty25&quot;
RETENTION | &quot;Retention&quot;
SECONDARYRETENTION | &quot;SecondaryRetention&quot;
CUSTOM | &quot;Custom&quot;



