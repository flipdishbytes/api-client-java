
# MenuItemOptionSetItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuItemOptionSetItemId** | **Integer** | Menu item option set item identifier |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]
**metadata** | [**List&lt;CreateMetadata&gt;**](CreateMetadata.md) | List of metadata |  [optional]
**nextMenuItemOptionSetId** | **Integer** | if null, next option set is next. if -1, this is the final option set |  [optional]
**productId** | **String** | Product Id when the OptionSet is associated to a Product |  [optional]
**name** | **String** | Name |  [optional]
**price** | **Double** | Price |  [optional]
**isAvailable** | **Boolean** | Is available |  [optional]
**displayOrder** | **Integer** | Display order. Displayed in ascending order. |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]
**imageUrl** | **String** | Image url |  [optional]


<a name="CellLayoutTypeEnum"></a>
## Enum: CellLayoutTypeEnum
Name | Value
---- | -----
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
HIDDENIMAGE | &quot;HiddenImage&quot;



