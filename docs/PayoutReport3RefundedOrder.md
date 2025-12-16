
# PayoutReport3RefundedOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** |  |  [optional]
**placedAtTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedAtTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**storeName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**refundedAmount** | **Double** |  |  [optional]
**refundedFees** | **Double** |  |  [optional]
**refundType** | **String** |  |  [optional]
**cashFeeRefundedToCustomer** | **Double** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CASH | &quot;Cash&quot;
CARD | &quot;Card&quot;



