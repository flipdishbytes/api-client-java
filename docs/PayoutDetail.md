
# PayoutDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payoutId** | **Integer** | The id of the payout. |  [optional]
**bankAccountId** | **Integer** | Bank account identifier |  [optional]
**accountName** | **String** | Account name of the payout destination |  [optional]
**payoutStatus** | [**PayoutStatusEnum**](#PayoutStatusEnum) | Status of the payout |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date payout was created |  [optional]
**periodStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | This payout includes operations after at this date (inclusive) |  [optional]
**periodEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | This payout includes operations before at this date (exclusive) |  [optional]
**destinationBank** | **String** | Destination bank name |  [optional]
**destinationAccount** | **String** | Last 4 digits of the destination bank IBAN |  [optional]
**payoutType** | [**PayoutTypeEnum**](#PayoutTypeEnum) | Type of payout source |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Payout currency |  [optional]
**payoutStores** | [**List&lt;PayoutStore&gt;**](PayoutStore.md) | Payout information broken down by Store |  [optional]
**amount** | **Double** | Payout amount |  [optional]
**cutoffDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payouts before this date do not have a details breakdown |  [optional]


<a name="PayoutStatusEnum"></a>
## Enum: PayoutStatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
INTRANSIT | &quot;InTransit&quot;
PAID | &quot;Paid&quot;
FAILED | &quot;Failed&quot;
CANCELLED | &quot;Cancelled&quot;


<a name="PayoutTypeEnum"></a>
## Enum: PayoutTypeEnum
Name | Value
---- | -----
INTERNAL | &quot;Internal&quot;
STRIPE | &quot;Stripe&quot;


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



