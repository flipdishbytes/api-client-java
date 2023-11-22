
# LoyaltyCampaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **Integer** | Id of campaign |  [optional]
**statistics** | [**CampaignStatistics**](CampaignStatistics.md) | Statistics of campaign |  [optional]
**stores** | [**List&lt;StoreCampaignStartTime&gt;**](StoreCampaignStartTime.md) | Stores this campaign applies to with campaign start time in Utc |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]
**ordersBeforeReceivingVoucher** | **Integer** | Number of orders customer needs to make, before receiving voucher |  [optional]
**percentDiscountAmount** | **Integer** | Discount amount in percents |  [optional]
**roundingStrategy** | **Integer** | Controls how the loyalty voucher&#39;s amount is rounded |  [optional]
**shouldIncludeOrdersWithLoyaltyVoucher** | **Boolean** | Controls whether we should include orders with loyalty vouchers in the campaign calculation |  [optional]
**voucherValidPeriodDays** | **Integer** | Number of days for which the voucher will be valid. |  [optional]
**includeDeliveryFee** | **Boolean** | Discount will include delivery fee |  [optional]
**autoApplyResultingVouchers** | **Boolean** | Automatically apply resulting vouchers |  [optional]
**includeExistingOrders** | **Boolean** | Campaign will apply to existing orders |  [optional]
**isEnabled** | **Boolean** | Is campaign enabled |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Ids of stores this campaign applies to |  [optional]



