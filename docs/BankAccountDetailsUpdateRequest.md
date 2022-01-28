
# BankAccountDetailsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAddress** | **String** | Address of the bank account |  [optional]
**accountHolderAddress** | **String** | Address of the payee |  [optional]
**vatNumber** | **String** | Account Holders Vat Number |  [optional]
**storeIds** | **List&lt;Integer&gt;** | List of stores to attach to Account |  [optional]
**bankName** | **String** | Name of Bank |  [optional]
**accountName** | **String** | Name of this account |  [optional]
**iban** | **String** | IBAN of this account |  [optional]
**swift** | **String** | SWIFT of this bank account |  [optional]
**nationalClearingCode** | **String** | National Clearing Code (BSB in Australia, Routing Number in USA/Canada, NCC in NZ) |  [optional]
**populatedAccountFields** | [**List&lt;AccountFieldKeyValuePair&gt;**](AccountFieldKeyValuePair.md) | A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields will be ignored. |  [optional]
**rejectionReason** | **String** | Reason for Rejection |  [optional]
**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) | Business Type |  [optional]


<a name="BusinessTypeEnum"></a>
## Enum: BusinessTypeEnum
Name | Value
---- | -----
INDIVIDUAL | &quot;Individual&quot;
COMPANY | &quot;Company&quot;
NONPROFIT | &quot;NonProfit&quot;
GOVERNMENTENTITY | &quot;GovernmentEntity&quot;



