
# CatalogItemReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | [**CatalogItem**](CatalogItem.md) | Details of the referenced {Flipdish.PublicModels.V1.Catalog.Items.CatalogItem} |  [optional]
**catalogItemId** | **String** | Identifier of the CatalogItemId to use as SubProduct | 
**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) | Type of the SupProduct | 
**preselectedQuantity** | **Integer** | Quantity of the modifier that will be set when the parent product is placed in the basket |  [optional]


<a name="ItemTypeEnum"></a>
## Enum: ItemTypeEnum
Name | Value
---- | -----
PRODUCT | &quot;Product&quot;
MODIFIER | &quot;Modifier&quot;



