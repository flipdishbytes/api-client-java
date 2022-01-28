
# StripeConnectedAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flipdishConnectedAccountId** | **Integer** | Flipdish connected account identifier |  [optional]
**stripeId** | **String** | Stripe&#39;s own connected account identifier |  [optional]
**whitelabelConfigId** | **Integer** | Id of the WhitelabelConfig the connected account is assigned to |  [optional]
**cardPaymentsStatus** | [**CardPaymentsStatusEnum**](#CardPaymentsStatusEnum) | Card payments capability status (Inactive, Pending, Active, Unrequested) |  [optional]
**transfersStatus** | [**TransfersStatusEnum**](#TransfersStatusEnum) | Transfers capability status (Inactive, Pending, Active, Unrequested) |  [optional]
**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Current status of the account |  [optional]


<a name="CardPaymentsStatusEnum"></a>
## Enum: CardPaymentsStatusEnum
Name | Value
---- | -----
INACTIVE | &quot;Inactive&quot;
PENDING | &quot;Pending&quot;
ACTIVE | &quot;Active&quot;
UNREQUESTED | &quot;Unrequested&quot;


<a name="TransfersStatusEnum"></a>
## Enum: TransfersStatusEnum
Name | Value
---- | -----
INACTIVE | &quot;Inactive&quot;
PENDING | &quot;Pending&quot;
ACTIVE | &quot;Active&quot;
UNREQUESTED | &quot;Unrequested&quot;


<a name="AccountStatusEnum"></a>
## Enum: AccountStatusEnum
Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
ENABLED | &quot;Enabled&quot;
ADDITIONALINFORMATIONREQUIRED | &quot;AdditionalInformationRequired&quot;
PENDINGVERIFICATION | &quot;PendingVerification&quot;
UNVERIFIED | &quot;Unverified&quot;
REJECTED | &quot;Rejected&quot;
UPDATEEXTERNALACCOUNT | &quot;UpdateExternalAccount&quot;



