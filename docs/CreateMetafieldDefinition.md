
# CreateMetafieldDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isReadOnly** | **Boolean** | Indicates if a definition can be edited or not |  [optional]
**ownerEntity** | [**OwnerEntityEnum**](#OwnerEntityEnum) | The Metafield will extend the specified {Flipdish.Metafields.PublicModels.V1.MetafieldDefinitionBase.OwnerEntity} |  [optional]
**key** | **String** | Key of the metafield.  The key must have two parts, separated by a dot. The first part acts as a category, for organizational purposes.  The parts can be composed of lowercase letters, numbers, hyphen and underscore | 
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The excepted type for the Value field |  [optional]
**name** | **String** | Field Name | 
**description** | **String** | Field Description |  [optional]
**behaviors** | [**List&lt;BehaviorsEnum&gt;**](#List&lt;BehaviorsEnum&gt;) | Enable Metafield Behaviors |  [optional]
**metafieldDefinitionRecommendationId** | **Integer** | Metafield Recommendation Id |  [optional]


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
BOOLEAN | &quot;Boolean&quot;
JSON | &quot;Json&quot;
SINGLELINESTRING | &quot;SingleLineString&quot;
MULTILINESTRING | &quot;MultiLineString&quot;


<a name="List<BehaviorsEnum>"></a>
## Enum: List&lt;BehaviorsEnum&gt;
Name | Value
---- | -----
SENDTOORDER | &quot;SendToOrder&quot;
SENDTOMENU | &quot;SendToMenu&quot;



