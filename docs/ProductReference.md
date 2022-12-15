
# ProductReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | [**Product**](Product.md) | Details of the referenced {Flipdish.Menus.PublicModels.V1.Catalog.Groups.ProductReference.Product} |  [optional]
**product** | [**Product**](Product.md) | Details of the referenced {Flipdish.Menus.PublicModels.V1.Catalog.Groups.ProductReference.Product} |  [optional]
**catalogItemId** | **String** | Identifier of the CatalogItemId to use as SubProduct | 
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Type of the SupProduct | 
**preselectedQuantity** | **Integer** | Quantity of the modifier that will be set when the parent product is placed in the basket |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
PRODUCT | &quot;Product&quot;
MODIFIER | &quot;Modifier&quot;



