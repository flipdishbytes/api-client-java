
# Teammate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**teammateId** | **String** | Unique indentifier |  [optional]
**name** | **String** | Name |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Last activity |  [optional]
**appId** | **String** | Access level is for this App |  [optional]
**invitationStatus** | [**InvitationStatusEnum**](#InvitationStatusEnum) | Invitation status |  [optional]
**email** | **String** | Email address |  [optional]
**appAccessLevel** | [**AppAccessLevelEnum**](#AppAccessLevelEnum) | App access level |  [optional]
**hasAccessToAllStores** | **Boolean** | The user has access to all stores for the app (including new stores that added later) |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Store IDs the user has access to (if HasAccessToAllStores is false) |  [optional]
**propertyIds** | **List&lt;String&gt;** | Property Ids the user has access to (if HasAccessToAllStores is false) |  [optional]


<a name="InvitationStatusEnum"></a>
## Enum: InvitationStatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
ACCEPTED | &quot;Accepted&quot;
EXPIRED | &quot;Expired&quot;


<a name="AppAccessLevelEnum"></a>
## Enum: AppAccessLevelEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
OWNER | &quot;Owner&quot;
STOREOWNER | &quot;StoreOwner&quot;
PROPERTYOWNER | &quot;PropertyOwner&quot;
MANAGEDOWNER | &quot;ManagedOwner&quot;
INTEGRATOR | &quot;Integrator&quot;
PROPERTYMANAGER | &quot;PropertyManager&quot;
STOREMANAGER | &quot;StoreManager&quot;
STORESTAFF | &quot;StoreStaff&quot;
STOREREADONLYACCESS | &quot;StoreReadOnlyAccess&quot;
FINANCEMANGER | &quot;FinanceManger&quot;
ONBOARDING | &quot;Onboarding&quot;
SUPPORT | &quot;Support&quot;



