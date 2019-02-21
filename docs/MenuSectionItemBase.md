
# MenuSectionItemBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Menu item name (like \&quot;Korma\&quot;) |  [optional]
**description** | **String** | Description (like \&quot;A lovely dish from the east\&quot;) |  [optional]
**spicinessRating** | [**SpicinessRatingEnum**](#SpicinessRatingEnum) | Spiciness rating |  [optional]
**price** | **Double** | Price - this is only used when there is no master option set and should be set to 0 if a master option set exists. |  [optional]
**displayOrder** | **Integer** | Display order |  [optional]
**alcohol** | **Boolean** | To be set true if the item or an option of the item contains an alcoholic drink. |  [optional]
**isAvailable** | **Boolean** | True if we accept orders for this item still |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]
**disableVouchers** | **Boolean** | If true, then vouchers won&#39;t be applied for this item |  [optional]


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



