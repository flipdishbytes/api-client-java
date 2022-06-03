
# CreateProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | [**List&lt;CreateGroupReference&gt;**](CreateGroupReference.md) | Collection of groups associated with this item |  [optional]
**metafields** | [**List&lt;Metafield&gt;**](Metafield.md) | Collection of metafields |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Type of item (Product, Modifier, etc) | 
**sku** | **String** | Stock Keeping Unit (SKU) | 
**name** | **String** | Product name | 
**description** | **String** | Product description |  [optional]
**price** | **Double** | Product price | 
**imageFileName** | **String** | Image File Name |  [optional]
**alcohol** | **Boolean** | Product contains alcohol |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
PRODUCT | &quot;Product&quot;
MODIFIER | &quot;Modifier&quot;



