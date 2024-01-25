
# OrderDm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userLocation** | [**CoordinatesDm**](CoordinatesDm.md) |  |  [optional]
**requestedDeliveryOrPickupTimeUtc** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tipAmount** | **Double** |  |  [optional]
**deliveryLocationId** | **Integer** |  |  [optional]
**voucherCode** | **String** |  |  [optional]
**orderItemVms** | [**List&lt;OrderItemDm&gt;**](OrderItemDm.md) |  |  [optional]
**virtualRestaurantId** | **Integer** |  |  [optional]
**physicalRestaurantId** | **Integer** |  |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) |  |  [optional]
**pickupLocationType** | [**PickupLocationTypeEnum**](#PickupLocationTypeEnum) |  |  [optional]
**pickupLocationId** | **Integer** |  |  [optional]
**tableServiceCatagory** | [**TableServiceCatagoryEnum**](#TableServiceCatagoryEnum) |  |  [optional]
**paymentAccountId** | **Integer** |  |  [optional]
**isPreOrder** | **Boolean** |  |  [optional]
**isAsapOrder** | **Boolean** |  |  [optional]
**menuId** | **Integer** |  |  [optional]
**menuVersion** | **Integer** |  |  [optional]


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
DELIVERY | &quot;Delivery&quot;
PICKUP | &quot;Pickup&quot;


<a name="PickupLocationTypeEnum"></a>
## Enum: PickupLocationTypeEnum
Name | Value
---- | -----
TAKEOUT | &quot;TakeOut&quot;
TABLESERVICE | &quot;TableService&quot;
DINEIN | &quot;DineIn&quot;


<a name="TableServiceCatagoryEnum"></a>
## Enum: TableServiceCatagoryEnum
Name | Value
---- | -----
GENERIC | &quot;Generic&quot;
VILLA | &quot;Villa&quot;
HOUSE | &quot;House&quot;
ROOM | &quot;Room&quot;
AREA | &quot;Area&quot;
TABLE | &quot;Table&quot;
PARKINGBAY | &quot;ParkingBay&quot;
GATE | &quot;Gate&quot;
DRIVETHROUGH | &quot;DriveThrough&quot;
TEAM | &quot;Team&quot;



