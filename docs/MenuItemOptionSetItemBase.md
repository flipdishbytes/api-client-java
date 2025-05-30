
# MenuItemOptionSetItemBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name |  [optional]
**price** | **Double** | Price |  [optional]
**depositReturnFee** | **Double** | An optional fee that can be added to the price of the item. |  [optional]
**isAvailable** | **Boolean** | Is available |  [optional]
**displayOrder** | **Integer** | Display order. Displayed in ascending order. |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]


<a name="CellLayoutTypeEnum"></a>
## Enum: CellLayoutTypeEnum
Name | Value
---- | -----
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
HIDDENIMAGE | &quot;HiddenImage&quot;



