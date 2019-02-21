
# LightspeedSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **String** | Company Id |  [optional]
**enabled** | **Boolean** | Enabled |  [optional]
**estimatedMinutesForDelivery** | **Integer** | Estimated minutes for delivery |  [optional]
**estimatedMinutesForCollection** | **Integer** | Estimated minutes for collection |  [optional]
**geographicLocation** | **String** | Geographic location (euc1, nae1, euw2, ....)) |  [optional]
**establishment** | **Boolean** | Is the CompanyId an establishment (kind of the store of a group of store) |  [optional]
**voucherId** | **String** | The Lightspeed voucher identifier to map with our |  [optional]
**deliveryFeeId** | **String** | The Lightspeed delivery fee identifier to map with our |  [optional]
**processingFeeId** | **String** | The Lightspeed processing fee identifier to map with our |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Which price to choose from Lightspeed menu |  [optional]
**menuId** | **Integer** | The menu id of the store |  [optional]


<a name="PriceTypeEnum"></a>
## Enum: PriceTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
TAKEAWAY | &quot;Takeaway&quot;
DELIVERY | &quot;Delivery&quot;



