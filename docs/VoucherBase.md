
# VoucherBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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



