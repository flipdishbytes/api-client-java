
# MenuSectionItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualPrice** | **Double** | Actual price - the minimum price possible when all required option set items prices are included. |  [optional]
**menuItemOptionSets** | [**List&lt;MenuItemOptionSet&gt;**](MenuItemOptionSet.md) | Menu item option sets |  [optional]
**dailySpecialHours** | [**List&lt;BusinessHoursPeriod&gt;**](BusinessHoursPeriod.md) | Daily special hours |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]
**taxRateName** | **String** | Tax rate name |  [optional]
**taxRateId** | **Integer** | TaxRate |  [optional]
**taxValue** | **Double** | TaxValue - the tax associated with this item, based on TaxRate / TaxType and Currency (currency determines decimal point precision) |  [optional]
**excludeFromVoucherDiscounting** | **Boolean** | If true, the item is excluded from voucher discount calculations |  [optional]
**metadata** | [**List&lt;CreateMetadata&gt;**](CreateMetadata.md) | List of metadata |  [optional]
**catalogItemId** | **String** | Catalog item Id when the Item is associated to a Product |  [optional]
**name** | **String** | Menu item name (like \&quot;Korma\&quot;) |  [optional]
**description** | **String** | Description (like \&quot;A lovely dish from the east\&quot;) |  [optional]
**spicinessRating** | [**SpicinessRatingEnum**](#SpicinessRatingEnum) | Spiciness rating |  [optional]
**price** | **Double** | Price - this is only used when there is no master option set and should be set to 0 if a master option set exists. |  [optional]
**depositReturnFee** | **Double** | An optional fee that can be added to the price of the item. |  [optional]
**displayOrder** | **Integer** | Display order |  [optional]
**alcohol** | **Boolean** | To be set true if the item or an option of the item contains an alcoholic drink. |  [optional]
**isAvailable** | **Boolean** | True if we accept orders for this item still |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]
**disableVouchers** | **Boolean** | If true, then vouchers won&#39;t be applied for this item |  [optional]
**imageName** | **String** | Image url |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**menuItemId** | **Integer** | Menu Item Id |  [optional]


<a name="SpicinessRatingEnum"></a>
## Enum: SpicinessRatingEnum
Name | Value
---- | -----
NOTRATED | &quot;NotRated&quot;
MILD | &quot;Mild&quot;
MEDIUM | &quot;Medium&quot;
HOT | &quot;Hot&quot;


<a name="CellLayoutTypeEnum"></a>
## Enum: CellLayoutTypeEnum
Name | Value
---- | -----
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
HIDDENIMAGE | &quot;HiddenImage&quot;



