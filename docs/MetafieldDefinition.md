
# MetafieldDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ownerEntity** | [**OwnerEntityEnum**](#OwnerEntityEnum) | The Metafield will extend the specified {Flipdish.PublicModels.V1.Metafields.MetafieldDefinition.OwnerEntity} |  [optional]
**key** | **String** | Key of the metafield.  Allowed characters: lowercase letters, numbers, hyphen, underscore and dot | 
**isReadOnly** | **Boolean** | Indicates if a definition can be edited or not |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The excepted type for the Value field |  [optional]
**name** | **String** | Field Name | 
**description** | **String** | Field Description |  [optional]
**behaviors** | [**List&lt;BehaviorsEnum&gt;**](#List&lt;BehaviorsEnum&gt;) | Enable Metafield Behaviors |  [optional]


<a name="OwnerEntityEnum"></a>
## Enum: OwnerEntityEnum
Name | Value
---- | -----
CATALOGITEM | &quot;CatalogItem&quot;
CATALOGGROUP | &quot;CatalogGroup&quot;
MENU | &quot;Menu&quot;


<a name="ValueTypeEnum"></a>
## Enum: ValueTypeEnum
Name | Value
---- | -----
JSON | &quot;Json&quot;
SINGLELINESTRING | &quot;SingleLineString&quot;
MULTILINESTRING | &quot;MultiLineString&quot;


<a name="List<BehaviorsEnum>"></a>
## Enum: List&lt;BehaviorsEnum&gt;
Name | Value
---- | -----
SENDTOORDER | &quot;SendToOrder&quot;
SENDTOMENU | &quot;SendToMenu&quot;



