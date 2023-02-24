
# OrderSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** | Order identifier |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | Delivery type |  [optional]
**pickupLocationType** | [**PickupLocationTypeEnum**](#PickupLocationTypeEnum) | Pickup location type |  [optional]
**tableServiceCatagory** | [**TableServiceCatagoryEnum**](#TableServiceCatagoryEnum) | Table service category |  [optional]
**orderState** | [**OrderStateEnum**](#OrderStateEnum) | Order state |  [optional]
**requestedForTime** | [**OffsetDateTime**](OffsetDateTime.md) | Order requested for |  [optional]
**storeName** | **String** | Name of the store |  [optional]
**storeIanaTimeZone** | **String** | Store IANA time zone |  [optional]
**customerName** | **String** | Name of the customer |  [optional]
**customerPhoneNumber** | **String** | Phone number of customer |  [optional]
**amount** | **Double** | This is the sum of the OrderItemsAmount, DeliveryAmount, TipAmount and Voucher.Amount (which is usually negative) and OnlineOrderingFee  It does include the OnlineOrderingFee |  [optional]
**refundedAmount** | **Double** | Refunded amount |  [optional]
**paymentAccountType** | [**PaymentAccountTypeEnum**](#PaymentAccountTypeEnum) | Payment Account |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Status of the payment |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency of payment |  [optional]
**appType** | [**AppTypeEnum**](#AppTypeEnum) | Type of app end user is on |  [optional]
**localOrderId** | **String** | Local order Id. This is used for displaying a \&quot;shorter\&quot; order ID for customers (eg. Kiosk orders) |  [optional]
**dropOffLocationId** | **Integer** | id of the collection/drop off location |  [optional]
**dropOffLocation** | **String** | Represents table service drop off location |  [optional]
**acceptedFor** | [**OffsetDateTime**](OffsetDateTime.md) | Time store has accepted the order for |  [optional]
**channel** | [**Channel**](Channel.md) | Channel where the Order comes from |  [optional]
**inFraudZone** | **Boolean** | Was order made within a fraud zone |  [optional]
**unusualHighValueOrder** | **Boolean** | Is order of unusually high value |  [optional]
**channelOrderId** | **String** | ChannelOrderId from external channel |  [optional]
**channelOrderDisplayId** | **String** | ChannelOrderDisplayId from external channel |  [optional]
**orderDropOffLocation** | [**OrderDropOffLocation**](OrderDropOffLocation.md) | DropOffLocation selected for this order |  [optional]
**orderBatchInfo** | [**OrderBatchSummary**](OrderBatchSummary.md) | OrderBatch information |  [optional]
**deliveryLocation** | [**DeliveryLocation**](DeliveryLocation.md) |  |  [optional]


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


<a name="OrderStateEnum"></a>
## Enum: OrderStateEnum
Name | Value
---- | -----
CREATED | &quot;Created&quot;
PLACEDCANBECANCELLED | &quot;PlacedCanBeCancelled&quot;
READYTOPROCESS | &quot;ReadyToProcess&quot;
ACCEPTEDBYRESTAURANT | &quot;AcceptedByRestaurant&quot;
DISPATCHED | &quot;Dispatched&quot;
DELIVERED | &quot;Delivered&quot;
CANCELLED | &quot;Cancelled&quot;
MANUALREVIEW | &quot;ManualReview&quot;
REJECTEDBYSTORE | &quot;RejectedByStore&quot;
REJECTEDBYFLIPDISH | &quot;RejectedByFlipdish&quot;
REJECTEDAUTOMATICALLY | &quot;RejectedAutomatically&quot;
REJECTEDAFTERBEINGACCEPTED | &quot;RejectedAfterBeingAccepted&quot;
ACCEPTEDANDREFUNDED | &quot;AcceptedAndRefunded&quot;


<a name="PaymentAccountTypeEnum"></a>
## Enum: PaymentAccountTypeEnum
Name | Value
---- | -----
CARD | &quot;Card&quot;
CASH | &quot;Cash&quot;
IDEAL | &quot;Ideal&quot;
BANCONTACT | &quot;Bancontact&quot;
GIROPAY | &quot;Giropay&quot;
EPS | &quot;Eps&quot;
EMV | &quot;Emv&quot;
PAYPAL | &quot;PayPal&quot;
PAYGREEN | &quot;PayGreen&quot;


<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
PAID | &quot;Paid&quot;
UNPAID | &quot;Unpaid&quot;
REFUNDED | &quot;Refunded&quot;
PARTIALLYREFUNDED | &quot;PartiallyRefunded&quot;
DISPUTED | &quot;Disputed&quot;


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


<a name="AppTypeEnum"></a>
## Enum: AppTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
IOS | &quot;Ios&quot;
ANDROID | &quot;Android&quot;
WEB | &quot;Web&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
TELEPHONECALL | &quot;TelephoneCall&quot;
SMS | &quot;Sms&quot;
PWAANDROID | &quot;PwaAndroid&quot;
PWAIOS | &quot;PwaIos&quot;
GOOGLE | &quot;Google&quot;



