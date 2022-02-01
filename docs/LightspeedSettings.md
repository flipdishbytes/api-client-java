
# LightspeedSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **String** | Company Id |  [optional]
**useOAuth** | **Boolean** | Use OAuth for authentication |  [optional]
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
**collectionTableId** | **Integer** | Collection Table ID to send orders |  [optional]
**deliveryTableId** | **Integer** | Delivery Table ID to send orders |  [optional]
**collectionTableIds** | **Map&lt;String, String&gt;** | Collection Table IDs to send orders to |  [optional]
**deliveryTableIds** | **Map&lt;String, String&gt;** | Delivery Table IDs to send orders to |  [optional]
**useTaxInclusivePrices** | **Boolean** | Exclude tax |  [optional]
**skipStatusCheckAndAcceptOrderAfterSending** | **Boolean** | WARNING: only use this option if the Liteserver is not synchronizing within max 5 minutes with Lightspeed cloud! |  [optional]
**sendTableNumberToTableId** | **Boolean** | Send Table Number to Table Id |  [optional]
**addChefNoteToProduct** | **Boolean** | Add ChefNote To Product |  [optional]
**chefNoteItemId** | **String** | The Lightspeed Chef Note Item Id to map |  [optional]
**chefNoteModifierId** | **String** | The Lightspeed Chef Note Modifier Id to map |  [optional]


<a name="PriceTypeEnum"></a>
## Enum: PriceTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
TAKEAWAY | &quot;Takeaway&quot;
DELIVERY | &quot;Delivery&quot;



