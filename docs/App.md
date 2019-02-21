
# App

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** | App Identifier |  [optional]
**name** | **String** | App name |  [optional]
**mapCenter** | [**Coordinates**](Coordinates.md) | Center of the map coordinates |  [optional]
**mapNorthEast** | [**Coordinates**](Coordinates.md) | North East(Top Right) Corner of the map coordinates |  [optional]
**mapSouthWest** | [**Coordinates**](Coordinates.md) | South West (Bottom Left) Corner of the map coordinates |  [optional]
**appAccessLevel** | [**AppAccessLevelEnum**](#AppAccessLevelEnum) | App access level for the logged in user |  [optional]
**iconUrl** | **String** | Icon url |  [optional]
**iconThumbnailUrl** | **String** | Icon thumbnail url |  [optional]
**countryId** | **String** | Country identifier |  [optional]
**availableAppLanguages** | [**List&lt;Language&gt;**](Language.md) | Available Languages for Apps\\Staff |  [optional]


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



