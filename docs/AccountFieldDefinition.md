
# AccountFieldDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | [**KeyEnum**](#KeyEnum) | Depending on the Key, the field&#39;s value will be stored in a different field in PayeeBankAccountData |  [optional]
**displayName** | **String** | Display name of the field |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | There are some fields that are of type known to the frontend (IBAN, Swift) -- for those frontend should use its own validation library, e.g. ibantools |  [optional]
**minLength** | **Integer** | Minimum length of the field |  [optional]
**maxLength** | **Integer** | Maximum length of the field |  [optional]
**digitsOnly** | **Boolean** | Is the field digits (numeric) only |  [optional]
**regex** | **String** | Regex for validating the field (if specified) |  [optional]


<a name="KeyEnum"></a>
## Enum: KeyEnum
Name | Value
---- | -----
IBAN | &quot;Iban&quot;
ACCOUNTNUMBER | &quot;AccountNumber&quot;
ROUTINGNUMBER | &quot;RoutingNumber&quot;
BSB | &quot;BSB&quot;
BRANCHCODE | &quot;BranchCode&quot;
BANKCODE | &quot;BankCode&quot;
INSTITUTIONNUMBER | &quot;InstitutionNumber&quot;
TRANSITNUMBER | &quot;TransitNumber&quot;
CLEARINGCODE | &quot;ClearingCode&quot;
IFSCCODE | &quot;IfscCode&quot;
CLABE | &quot;Clabe&quot;
SORTCODE | &quot;SortCode&quot;
SWIFT | &quot;Swift&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
IBAN | &quot;Iban&quot;



