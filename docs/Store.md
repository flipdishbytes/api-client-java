
# Store

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **Integer** | Store identifier |  [optional]
**storeGroupId** | **Integer** | Store group id to which this store belongs |  [optional]
**address** | [**StoreAddress**](StoreAddress.md) | Store address |  [optional]
**deliveryZones** | [**List&lt;DeliveryZone&gt;**](DeliveryZone.md) | Delivery zones |  [optional]
**apmPhoneNumber** | **String** | Automated Phone Marketing number |  [optional]
**pickupHours** | [**List&lt;BusinessHoursPeriod&gt;**](BusinessHoursPeriod.md) | Pickup hours |  [optional]
**deliveryHours** | [**List&lt;BusinessHoursPeriod&gt;**](BusinessHoursPeriod.md) | Delivery hours |  [optional]
**menuId** | **Integer** | Menu identifier |  [optional]
**orderConfirmationMessageOverrideDelivery** | **String** | Overridden confirmation message for delivery orders |  [optional]
**orderConfirmationMessageOverridePickup** | **String** | Overridden confirmation message for pickup orders |  [optional]
**printoutLayoutType** | [**PrintoutLayoutTypeEnum**](#PrintoutLayoutTypeEnum) | Printout layout |  [optional]
**storeNotes** | [**List&lt;StoreNote&gt;**](StoreNote.md) | Store notes |  [optional]
**microsoftTimeZone** | **String** | Microsoft Time Zone Index Values (https://msdn.microsoft.com/en-us/library/ms912391)  (Editable through store coordinate change) |  [optional]
**ianaTimeZone** | **String** | IANA Time Zone (https://www.iana.org/time-zones)  (Editable through store coordinate change) |  [optional]
**phoneNumber** | **String** | Phone number |  [optional]
**alwaysAppearOpen** | **Boolean** | True if the store always appears open |  [optional]
**preOrderEnabled** | **Boolean** | True if the store accepts pre-orders |  [optional]
**takeOutEnabled** | **Boolean** | True if the store accepts take-out orders |  [optional]
**tableServiceEnabled** | **Boolean** | True if the store has table service |  [optional]
**dineInEnabled** | **Boolean** | True if the store accepts dine-in orders |  [optional]
**allowPreOrdersAndTableService** | **Boolean** | True if both pre-orders and talbe service can be enabled |  [optional]
**pickupEnabled** | **Boolean** | True if the store accepts pickup orders |  [optional]
**deliveryEnabled** | **Boolean** | True if the store accepts delivery orders |  [optional]
**cardOrderDeliveryEnabled** | **Boolean** | True if the store accepts card payment for delivery orders |  [optional]
**cashOrdersDeliveryEnabled** | **Boolean** | True if the store accepts cash payment for delivery orders |  [optional]
**cardOrdersPickupEnabled** | **Boolean** | True if the store accepts card payment for pickup orders |  [optional]
**cashOrdersPickupEnabled** | **Boolean** | True if the store accepts cash payment for pickup orders |  [optional]
**tipsEnabled** | **Boolean** | True if the store accepts tips |  [optional]
**automaticallyAcceptOrders** | **Boolean** | True if the stores orders are automatically accepted in Flipdish |  [optional]
**openForDelivery** | **Boolean** | True if the store is open for delivery |  [optional]
**openForPickup** | **Boolean** | True if the store is open for pickup |  [optional]
**minimumPickupOrderAmount** | **Double** | Minimum pickup order amount |  [optional]
**requireCustomerNameForPickup** | **Boolean** | True if customer name required for pickup orders |  [optional]
**gdprCustomerPhoneNumbers** | **Boolean** | Mask your customers phone numbers printed on receipts and reduce the amout of personally identifiable customer information that is exposed. |  [optional]
**requireCustomerNameForDelivery** | **Boolean** | True if customer name required for delivery orders |  [optional]
**etaInPickupConfirmationSmsEnabled** | **Boolean** | True if order confirmation sms includes estimated time when order will be ready for collection |  [optional]
**etaInDeliveryConfirmationSmsEnabled** | **Boolean** | True if order confirmation sms includes estimated time when order will delivered |  [optional]
**name** | **String** | Name |  [optional]
**emailAddress** | **String** | Email address (visible to customers) |  [optional]
**staffLanguage** | **String** | Staff Language (used for communcation with the staff)  Emails, Printouts etc |  [optional]


<a name="PrintoutLayoutTypeEnum"></a>
## Enum: PrintoutLayoutTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
CENTRA | &quot;Centra&quot;



