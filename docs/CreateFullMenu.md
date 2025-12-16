
# CreateFullMenu

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of Menu, only shown in portal |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**menuSections** | [**List&lt;CreateFullMenuSection&gt;**](CreateFullMenuSection.md) | Menu sections (starters, main etc) |  [optional]
**taxRates** | [**List&lt;CreateMenuTaxRate&gt;**](CreateMenuTaxRate.md) | Menu tax rates |  [optional]
**displaySectionLinks** | **Boolean** | Display menu section link on UI |  [optional]
**menuSectionBehaviour** | [**MenuSectionBehaviourEnum**](#MenuSectionBehaviourEnum) | Menu section behaviour |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax type |  [optional]
**isIntegrated** | **Boolean** | Flag to indicate if the menu is integrated (contains metadata) |  [optional]


<a name="MenuSectionBehaviourEnum"></a>
## Enum: MenuSectionBehaviourEnum
Name | Value
---- | -----
EXPANDSINGLE | &quot;ExpandSingle&quot;
EXPANDMULTIPLE | &quot;ExpandMultiple&quot;


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
INCLUDEDINBASEPRICE | &quot;IncludedInBasePrice&quot;
EXCLUDEDFROMBASEPRICE | &quot;ExcludedFromBasePrice&quot;



