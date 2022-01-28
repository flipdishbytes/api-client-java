
# MenuItemOptionSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuItemOptionSetId** | **Integer** | Menu item option set identifier |  [optional]
**imageName** | **String** | Image Name |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**menuItemOptionSetItems** | [**List&lt;MenuItemOptionSetItem&gt;**](MenuItemOptionSetItem.md) | Option set items |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]
**productId** | **String** | Product Id when the OptionSet is associated to a Product |  [optional]
**name** | **String** | Menu item option set name |  [optional]
**isMasterOptionSet** | **Boolean** | Is master option set. This can affect the layout of the options in the menu displayed to the customer. Usually it is true if the option could be considerd a standalone item as opposed to an addition (\&quot;with ketchup\&quot;) or modifier (\&quot;large\&quot;). |  [optional]
**displayOrder** | **Integer** | Display order. Displayed in ascending order. |  [optional]
**minSelectCount** | **Integer** | Minimum items must be selected |  [optional]
**maxSelectCount** | **Integer** | Maximum number of items can be selected |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]


<a name="CellLayoutTypeEnum"></a>
## Enum: CellLayoutTypeEnum
Name | Value
---- | -----
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
HIDDENIMAGE | &quot;HiddenImage&quot;



