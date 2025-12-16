
# SubscriptionProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Product Identifier | 
**name** | **String** | Name | 
**quantity** | **Long** | Quantity | 
**pricePerUnit** | **Double** | Price Per Unit |  [optional]
**priceTotal** | **Double** | Price Total |  [optional]
**paymentFrequency** | [**PaymentFrequencyEnum**](#PaymentFrequencyEnum) | Payment Frequency | 
**stores** | [**List&lt;SubscriptionStore&gt;**](SubscriptionStore.md) | Stores |  [optional]


<a name="PaymentFrequencyEnum"></a>
## Enum: PaymentFrequencyEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



