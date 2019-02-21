
# TeammateBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appAccessLevel** | [**AppAccessLevelEnum**](#AppAccessLevelEnum) | App access level |  [optional]
**hasAccessToAllStores** | **Boolean** | The user has access to all stores for the app (including new stores that added later) |  [optional]
**storeIds** | **List&lt;Integer&gt;** | Store IDs the user has access to (if HasAccessToAllStores is false) |  [optional]


<a name="AppAccessLevelEnum"></a>
## Enum: AppAccessLevelEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
OWNER | &quot;Owner&quot;
MANAGEDOWNER | &quot;ManagedOwner&quot;
STOREMANAGER | &quot;StoreManager&quot;
STORESTAFF | &quot;StoreStaff&quot;
STOREREADWRITEACCESS | &quot;StoreReadWriteAccess&quot;
STOREREADONLYACCESS | &quot;StoreReadOnlyAccess&quot;
FINANCEMANGER | &quot;FinanceManger&quot;



