
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
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency (derived from Store Group) |  [optional]
**preOrderDeliveryEnabled** | **Boolean** | Is PerOrder Enabled for Delivery |  [optional]
**preOrderPickupEnabled** | **Boolean** | Is PerOrder Enabled for Pickup |  [optional]
**logoUrl** | **String** | Url for logo image |  [optional]
**fraudPreventionStrategy** | **String** | Fraud Prevention Strategy |  [optional]
**appIds** | **List&lt;String&gt;** | Store&#39;s app ids |  [optional]
**propertyId** | **String** | Property Id |  [optional]
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


<a name="PrintoutLayoutTypeEnum"></a>
## Enum: PrintoutLayoutTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
CENTRA | &quot;Centra&quot;
SMALLCHEFNOTES | &quot;SmallChefNotes&quot;
SMALLCHEFNOTESANDCENTRA | &quot;SmallChefNotesAndCentra&quot;


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
EUR | &quot;EUR&quot;
USD | &quot;USD&quot;
GBP | &quot;GBP&quot;
CAD | &quot;CAD&quot;
AUD | &quot;AUD&quot;
DJF | &quot;DJF&quot;
ZAR | &quot;ZAR&quot;
ETB | &quot;ETB&quot;
AED | &quot;AED&quot;
BHD | &quot;BHD&quot;
DZD | &quot;DZD&quot;
EGP | &quot;EGP&quot;
IQD | &quot;IQD&quot;
JOD | &quot;JOD&quot;
KWD | &quot;KWD&quot;
LBP | &quot;LBP&quot;
LYD | &quot;LYD&quot;
MAD | &quot;MAD&quot;
OMR | &quot;OMR&quot;
QAR | &quot;QAR&quot;
SAR | &quot;SAR&quot;
SYP | &quot;SYP&quot;
TND | &quot;TND&quot;
YER | &quot;YER&quot;
CLP | &quot;CLP&quot;
INR | &quot;INR&quot;
AZN | &quot;AZN&quot;
RUB | &quot;RUB&quot;
BYN | &quot;BYN&quot;
BGN | &quot;BGN&quot;
NGN | &quot;NGN&quot;
BDT | &quot;BDT&quot;
CNY | &quot;CNY&quot;
BAM | &quot;BAM&quot;
CZK | &quot;CZK&quot;
DKK | &quot;DKK&quot;
CHF | &quot;CHF&quot;
MVR | &quot;MVR&quot;
BTN | &quot;BTN&quot;
XCD | &quot;XCD&quot;
BZD | &quot;BZD&quot;
HKD | &quot;HKD&quot;
IDR | &quot;IDR&quot;
JMD | &quot;JMD&quot;
MYR | &quot;MYR&quot;
NZD | &quot;NZD&quot;
PHP | &quot;PHP&quot;
SGD | &quot;SGD&quot;
TTD | &quot;TTD&quot;
XDR | &quot;XDR&quot;
ARS | &quot;ARS&quot;
BOB | &quot;BOB&quot;
COP | &quot;COP&quot;
CRC | &quot;CRC&quot;
CUP | &quot;CUP&quot;
DOP | &quot;DOP&quot;
GTQ | &quot;GTQ&quot;
HNL | &quot;HNL&quot;
MXN | &quot;MXN&quot;
NIO | &quot;NIO&quot;
PAB | &quot;PAB&quot;
PEN | &quot;PEN&quot;
PYG | &quot;PYG&quot;
UYU | &quot;UYU&quot;
VEF | &quot;VEF&quot;
IRR | &quot;IRR&quot;
XOF | &quot;XOF&quot;
CDF | &quot;CDF&quot;
XAF | &quot;XAF&quot;
HTG | &quot;HTG&quot;
ILS | &quot;ILS&quot;
HRK | &quot;HRK&quot;
HUF | &quot;HUF&quot;
AMD | &quot;AMD&quot;
ISK | &quot;ISK&quot;
JPY | &quot;JPY&quot;
GEL | &quot;GEL&quot;
KZT | &quot;KZT&quot;
KHR | &quot;KHR&quot;
KRW | &quot;KRW&quot;
KGS | &quot;KGS&quot;
LAK | &quot;LAK&quot;
MKD | &quot;MKD&quot;
MNT | &quot;MNT&quot;
BND | &quot;BND&quot;
MMK | &quot;MMK&quot;
NOK | &quot;NOK&quot;
NPR | &quot;NPR&quot;
PKR | &quot;PKR&quot;
PLN | &quot;PLN&quot;
AFN | &quot;AFN&quot;
BRL | &quot;BRL&quot;
MDL | &quot;MDL&quot;
RON | &quot;RON&quot;
RWF | &quot;RWF&quot;
SEK | &quot;SEK&quot;
LKR | &quot;LKR&quot;
SOS | &quot;SOS&quot;
ALL | &quot;ALL&quot;
RSD | &quot;RSD&quot;
KES | &quot;KES&quot;
TJS | &quot;TJS&quot;
THB | &quot;THB&quot;
ERN | &quot;ERN&quot;
TMT | &quot;TMT&quot;
BWP | &quot;BWP&quot;
TRY | &quot;TRY&quot;
UAH | &quot;UAH&quot;
UZS | &quot;UZS&quot;
VND | &quot;VND&quot;
MOP | &quot;MOP&quot;
TWD | &quot;TWD&quot;
BMD | &quot;BMD&quot;


<a name="List<SalesChannelTypesEnum>"></a>
## Enum: List&lt;SalesChannelTypesEnum&gt;
Name | Value
---- | -----
WEB | &quot;Web&quot;
APP | &quot;App&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
NONE | &quot;None&quot;



