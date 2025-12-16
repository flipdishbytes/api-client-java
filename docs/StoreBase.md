
# StoreBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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
**allowChefNotes** | **Boolean** | True if the customer is allowed enter custom notes with their orders |  [optional]
**etaInPickupConfirmationSmsEnabled** | **Boolean** | True if order confirmation sms includes estimated time when order will be ready for collection |  [optional]
**etaInDeliveryConfirmationSmsEnabled** | **Boolean** | True if order confirmation sms includes estimated time when order will delivered |  [optional]
**isArchived** | **Boolean** | Is the Store Archived |  [optional]
**isPublished** | **Boolean** | Is the Store Published |  [optional]
**name** | **String** | Name |  [optional]
**emailAddress** | **String** | Email address (visible to customers) |  [optional]
**staffLanguage** | **String** | Staff Language (used for communication with the staff)  Emails, Printouts etc |  [optional]
**salesChannelTypes** | [**List&lt;SalesChannelTypesEnum&gt;**](#List&lt;SalesChannelTypesEnum&gt;) | Sales Channel Types |  [optional]
**inheritanceConfigTypes** | [**List&lt;InheritanceConfigTypesEnum&gt;**](#List&lt;InheritanceConfigTypesEnum&gt;) | Inheritance Config Types |  [optional]


<a name="List<SalesChannelTypesEnum>"></a>
## Enum: List&lt;SalesChannelTypesEnum&gt;
Name | Value
---- | -----
WEB | &quot;Web&quot;
APP | &quot;App&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
NONE | &quot;None&quot;


<a name="List<InheritanceConfigTypesEnum>"></a>
## Enum: List&lt;InheritanceConfigTypesEnum&gt;
Name | Value
---- | -----
COLLECTIONSETTINGS | &quot;CollectionSettings&quot;



