
# MenuItemOptionSetBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Menu item option set name |  [optional]
**isMasterOptionSet** | **Boolean** | Is master option set. This can affect the layout of the options in the menu displayed to the customer. Usually it is true if the option could be considerd a standalone item as opposed to an addition (\&quot;with ketchup\&quot;) or modifier (\&quot;large\&quot;). |  [optional]
**displayOrder** | **Integer** | Display order. Displayed in ascending order. |  [optional]
**minSelectCount** | **Integer** | Minimum items must be selected |  [optional]
**maxSelectCount** | **Integer** | Maximum number of items can be selected |  [optional]
**cellLayoutType** | [**CellLayoutTypeEnum**](#CellLayoutTypeEnum) | Small | Medium | Large  Affects the layout of the menu. |  [optional]
**publicId** | [**UUID**](UUID.md) | Permanent reference to the item. |  [optional]


<a name="CellLayoutTypeEnum"></a>
## Enum: CellLayoutTypeEnum
Name | Value
---- | -----
SMALL | &quot;Small&quot;
MEDIUM | &quot;Medium&quot;
LARGE | &quot;Large&quot;
HIDDENIMAGE | &quot;HiddenImage&quot;



