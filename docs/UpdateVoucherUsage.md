
# UpdateVoucherUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isUsed** | **Boolean** | Flag indicating whether the voucher is used |  [optional]
**usedByCustomerId** | **Integer** | Indicates Customer that used the voucher. |  [optional]
**transactionKey** | **String** | An opaque string, to ensure idempotency. This allows for safely retrying requests without accidentally performing the same stamp operation twice.   This will typically contain the the ID of the sale order. |  [optional]



