
# VoucherWithStats

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalUsed** | **Integer** | Total times the voucher was used |  [optional]
**totalCustomers** | **Integer** | Total amount of customers who used this voucher |  [optional]
**totalAmountFromOrders** | **Double** | Total amount of money from orders |  [optional]
**totalDiscounted** | **Double** | Total amount of money given away |  [optional]
**averageOrderSize** | **Double** | Average Order Size |  [optional]
**voucherId** | **Integer** | Voucher Id |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Voucher Status |  [optional]
**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | Voucher Type |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency of the voucher |  [optional]
**storeNames** | **List&lt;String&gt;** | Stores that this voucher applies to |  [optional]
**promotionDetails** | [**PromotionDetails**](PromotionDetails.md) | Promotion details |  [optional]
**creditNoteDetails** | [**CreditNoteDetails**](CreditNoteDetails.md) | Credit note details |  [optional]
**lumpDiscountDetails** | [**LumpDiscountDetails**](LumpDiscountDetails.md) | Lump discount details |  [optional]
**percentDiscountDetails** | [**PercentDiscountDetails**](PercentDiscountDetails.md) | Percent discount details |  [optional]
**code** | **String** | Voucher Code |  [optional]
**description** | **String** | Voucher Description (Visible on printout) |  [optional]
**stores** | **List&lt;Integer&gt;** | Stores that this voucher applies to |  [optional]
**validOnOrdersOver** | **Double** | Valid on orders on or above |  [optional]
**takesPriority** | **Boolean** | Takes priority |  [optional]
**isEnabled** | **Boolean** | Is voucher enabled |  [optional]
**isAutomaticallyApplied** | **Boolean** | Is voucher automatically applied |  [optional]
**includeDeliveryFee** | **Boolean** | Include delivery fees |  [optional]
**isValidForDeliveryOrders** | **Boolean** | Valid for delivery orders |  [optional]
**isValidForPickupOrders** | **Boolean** | Valid for pickup orders |  [optional]
**isValidForOrdersPayedOnline** | **Boolean** | Valid for orders payed online |  [optional]
**isValidForOrdersPayedByCash** | **Boolean** | Valid for orders payed in cash |  [optional]
**isValidForFirstOrderOnly** | **Boolean** | Valid only on the first order by the customer |  [optional]
**isValidOncePerCustomer** | **Boolean** | Valid once per customer |  [optional]
**isValidOnlyOnce** | **Boolean** | Valid only once, by any customer (once used cannot be used again by any other customer) |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Voucher Starts On (Time in UTC) |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Voucher Expires On (Time in UTC) |  [optional]
**channelRestrictions** | [**List&lt;ChannelRestrictionsEnum&gt;**](#List&lt;ChannelRestrictionsEnum&gt;) | Limit the channels this voucher can be used on |  [optional]
**voucherSubType** | [**VoucherSubTypeEnum**](#VoucherSubTypeEnum) | Voucher Subtype |  [optional]
**customerId** | **Integer** | Customer UserID |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALID | &quot;Valid&quot;
NOTYETVALID | &quot;NotYetValid&quot;
EXPIRED | &quot;Expired&quot;
USED | &quot;Used&quot;
DISABLED | &quot;Disabled&quot;


<a name="VoucherTypeEnum"></a>
## Enum: VoucherTypeEnum
Name | Value
---- | -----
PERCENTAGEDISCOUNT | &quot;PercentageDiscount&quot;
LUMPDISCOUNT | &quot;LumpDiscount&quot;
ADDITEM | &quot;AddItem&quot;
CREDITNOTE | &quot;CreditNote&quot;


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


<a name="List<ChannelRestrictionsEnum>"></a>
## Enum: List&lt;ChannelRestrictionsEnum&gt;
Name | Value
---- | -----
IOS | &quot;Ios&quot;
ANDROID | &quot;Android&quot;
WEB | &quot;Web&quot;
KIOSK | &quot;Kiosk&quot;
POS | &quot;Pos&quot;
GOOGLE | &quot;Google&quot;


<a name="VoucherSubTypeEnum"></a>
## Enum: VoucherSubTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SIGNUP | &quot;SignUp&quot;
LOYALTY | &quot;Loyalty&quot;
LOYALTY25 | &quot;Loyalty25&quot;
RETENTION | &quot;Retention&quot;
SECONDARYRETENTION | &quot;SecondaryRetention&quot;
CUSTOM | &quot;Custom&quot;



