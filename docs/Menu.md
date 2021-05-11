
# Menu

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuId** | **Integer** | Menu identifier |  [optional]
**modifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last modified time |  [optional]
**versionNumber** | **Integer** | Menu version |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**name** | **String** | Name of Menu, only shown in portal |  [optional]
**locked** | **Boolean** | Locked: is menu locked against modifcation |  [optional]
**menuSections** | [**List&lt;MenuSection&gt;**](MenuSection.md) | Menu sections (startes, main etc) |  [optional]
**taxRates** | [**List&lt;MenuTaxRate&gt;**](MenuTaxRate.md) | Menu tax rates |  [optional]
**displaySectionLinks** | **Boolean** | Display menu section link on UI |  [optional]
**menuSectionBehaviour** | [**MenuSectionBehaviourEnum**](#MenuSectionBehaviourEnum) | Menu section behaviour |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax type |  [optional]


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



