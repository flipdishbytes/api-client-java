
# Menu

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuId** | **Integer** | Menu identifier |  [optional]
**modifiedTime** | [**OffsetDateTime**](OffsetDateTime.md) | Last modified time |  [optional]
**versionNumber** | **Integer** | Menu version |  [optional]
**imageUrl** | **String** | Image url |  [optional]
**menuSections** | [**List&lt;MenuSection&gt;**](MenuSection.md) | Menu sections (startes, main etc) |  [optional]
**displaySectionLinks** | **Boolean** | Display menu section link on UI |  [optional]
**menuSectionBehaviour** | [**MenuSectionBehaviourEnum**](#MenuSectionBehaviourEnum) | Menu section behaviour |  [optional]


<a name="MenuSectionBehaviourEnum"></a>
## Enum: MenuSectionBehaviourEnum
Name | Value
---- | -----
EXPANDSINGLE | &quot;ExpandSingle&quot;
EXPANDMULTIPLE | &quot;ExpandMultiple&quot;



