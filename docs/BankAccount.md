
# BankAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Id of this account |  [optional]
**accountName** | **String** | Name of this account |  [optional]
**iban** | **String** | IBAN of this account |  [optional]
**swift** | **String** | SWIFT of this bank account |  [optional]
**populatedAccountFields** | [**List&lt;AccountFieldKeyValuePair&gt;**](AccountFieldKeyValuePair.md) | A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields should be ignored. |  [optional]
**accountState** | [**AccountStateEnum**](#AccountStateEnum) | Status of Account |  [optional]
**storeNames** | **List&lt;String&gt;** | Store Names that are attached to this account |  [optional]
**bankAddress** | **String** | Address lf the bank |  [optional]
**bankCountryCode** | **String** | CountryCode of the Bank Account |  [optional]
**accountHolderAddress** | **String** | Account Holders Address |  [optional]
**accountHolderCountryCode** | **String** | Account Holders Country Code |  [optional]
**vatNumber** | **String** | Account Holders Vat Number |  [optional]
**stripeAccountId** | **String** | Stripe Id of the connected account |  [optional]


<a name="AccountStateEnum"></a>
## Enum: AccountStateEnum
Name | Value
---- | -----
UNVERIFIED | &quot;Unverified&quot;
AWATINGVERIFICATION | &quot;AwatingVerification&quot;
VERIFIED | &quot;Verified&quot;
GRANDFATHERED | &quot;Grandfathered&quot;



