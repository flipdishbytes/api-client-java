
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | **String** | Unique product id |  [optional]
**sku** | **String** | Stock Keeping Unit (SKU) |  [optional]
**name** | **String** | Product name |  [optional]
**description** | **String** | Product description |  [optional]
**price** | **Double** | Product price |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Product Type (SimpleProduct, Modifier, ModifierGroup, etc) |  [optional]
**imageFileName** | **String** | Image File Name |  [optional]
**isArchived** | **Boolean** | Returns true if the product is archived |  [optional]
**alcohol** | **Boolean** | Product contains alcohol |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
SIMPLEPRODUCT | &quot;SimpleProduct&quot;
MODIFIER | &quot;Modifier&quot;
MODIFIERGROUP | &quot;ModifierGroup&quot;



