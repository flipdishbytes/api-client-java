
# CatalogGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogGroupId** | **String** | Unique catalog group id |  [optional]
**isArchived** | **Boolean** | Returns true if the group is archived |  [optional]
**minSelectCount** | **Integer** | Minimum number of items that the user has to select |  [optional]
**maxSelectCount** | **Integer** | Maximum number of items that the user has to select |  [optional]
**items** | [**List&lt;CatalogItemReference&gt;**](CatalogItemReference.md) | Collection of items associated with this product |  [optional]
**groupType** | [**GroupTypeEnum**](#GroupTypeEnum) | Type of group (ModifierGroup, etc) | 
**sku** | **String** | Stock Keeping Unit (SKU) | 
**name** | **String** | Group name | 
**imageFileName** | **String** | Image File Name |  [optional]


<a name="GroupTypeEnum"></a>
## Enum: GroupTypeEnum
Name | Value
---- | -----
MODIFIERGROUP | &quot;ModifierGroup&quot;



