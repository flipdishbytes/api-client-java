
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogItemId** | **String** | Unique catalog Item id |  [optional]
**isArchived** | **Boolean** | Returns true if the item is archived |  [optional]
**groups** | [**List&lt;GroupReference&gt;**](GroupReference.md) | Collection of groups associated with this item |  [optional]
**metafields** | [**List&lt;Metafield&gt;**](Metafield.md) | Collection of metafields |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Type of item (Product, Modifier, etc) | 
**sku** | **String** | Stock Keeping Unit (SKU) | 
**name** | **String** | Item name | 
**description** | **String** | Item description |  [optional]
**price** | **Double** | Item price | 
**imageFileName** | **String** | Image File Name |  [optional]
**alcohol** | **Boolean** | item contains alcohol |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
PRODUCT | &quot;Product&quot;
MODIFIER | &quot;Modifier&quot;



