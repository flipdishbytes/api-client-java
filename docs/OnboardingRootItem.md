
# OnboardingRootItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuId** | **Integer** | Id of the menu associated to the current store. |  [optional]
**bankAccountId** | **Integer** | Id of the bank account, associated to the current store. |  [optional]
**onboardingItemId** | **Integer** | Item internal id. |  [optional]
**title** | **String** | Item title in the items panel. |  [optional]
**description** | **String** | Item detailed information. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Whether the item is pending, completed or was dismissed. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Defines if the item is a global milestone, a category or a simple item. |  [optional]
**items** | [**List&lt;OnboardingItem&gt;**](OnboardingItem.md) | Nested items (subitems). |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
INPROGRESS | &quot;InProgress&quot;
COMPLETED | &quot;Completed&quot;
DISMISSED | &quot;Dismissed&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MILESTONE | &quot;Milestone&quot;
SECTION | &quot;Section&quot;
ITEM | &quot;Item&quot;



