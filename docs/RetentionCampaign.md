
# RetentionCampaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** | Id of campaign |  [optional]
**statistics** | [**CampaignStatistics**](CampaignStatistics.md) | Statistics of campaign |  [optional]
**stores** | [**List&lt;StoreCampaignStartTime&gt;**](StoreCampaignStartTime.md) | Stores this campaign applies to with campaign start time in Utc |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]
**notifyCustomerAfterMinutes** | **Integer** | Time in minutes, after which customer will receive retention voucher if he/she does not order |  [optional]
**percentDiscountAmount** | **Integer** | Discount amount in percents |  [optional]
**lumpDiscountAmount** | **Double** | Discount amount in sum of money |  [optional]
**voucherValidPeriodDays** | **Integer** | Number of days for which the voucher will be valid. |  [optional]
**includeDeliveryFee** | **Boolean** | Discount will include delivery fee |  [optional]
**autoApplyResultingVouchers** | **Boolean** | Automatically apply resulting vouchers |  [optional]
**includeExistingOrders** | **Boolean** | Campaign will apply to existing orders |  [optional]
**isEnabled** | **Boolean** | Is campaign enabled |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Ids of stores this campaign applies to |  [optional]
**appId** | **String** | The app that this campaign belongs to. |  [optional]
**forceDiscount** | **Boolean** | Controls whether the voucher generated from this campaign will override discount exclusions |  [optional]



