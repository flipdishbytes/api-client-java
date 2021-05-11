
# BankAccountSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of this account |  [optional]
**storeNames** | **List&lt;String&gt;** | Store Names that are attached to this account |  [optional]
**accountState** | [**AccountStateEnum**](#AccountStateEnum) | Status of Account |  [optional]
**currencyCode** | **String** | Currency of Account |  [optional]
**stripeConnectedAccountInfo** | [**StripeConnectedAccountInfo**](StripeConnectedAccountInfo.md) | Information about the Stripe connected account associated with this bank account (if any) |  [optional]
**accountName** | **String** | Name of this account |  [optional]
**iban** | **String** | IBAN of this account |  [optional]
**swift** | **String** | SWIFT of this bank account |  [optional]
**nationalClearingCode** | **String** | National Clearing Code (BSB in Australia, Routing Number in USA/Canada, NCC in NZ) |  [optional]
**populatedAccountFields** | [**List&lt;AccountFieldKeyValuePair&gt;**](AccountFieldKeyValuePair.md) | A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields will be ignored. |  [optional]
**rejectionReason** | **String** | Reason for Rejection |  [optional]
**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) | Business Type |  [optional]


<a name="AccountStateEnum"></a>
## Enum: AccountStateEnum
Name | Value
---- | -----
UNVERIFIED | &quot;Unverified&quot;
AWATINGVERIFICATION | &quot;AwatingVerification&quot;
VERIFIED | &quot;Verified&quot;
GRANDFATHERED | &quot;Grandfathered&quot;


<a name="BusinessTypeEnum"></a>
## Enum: BusinessTypeEnum
Name | Value
---- | -----
INDIVIDUAL | &quot;Individual&quot;
COMPANY | &quot;Company&quot;
NONPROFIT | &quot;NonProfit&quot;
GOVERNMENTENTITY | &quot;GovernmentEntity&quot;



