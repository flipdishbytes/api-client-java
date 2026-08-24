
# StripeConnectedAccountInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | Stripe connected account status |  [optional]
**stripeId** | **String** | Stripe connected account id |  [optional]
**cardPaymentStatus** | [**CardPaymentStatusEnum**](#CardPaymentStatusEnum) | Current status of the Card Payment capability of the account |  [optional]
**payoutScheduleInterval** | [**PayoutScheduleIntervalEnum**](#PayoutScheduleIntervalEnum) | Payouts Schedule Interval |  [optional]
**payoutsEnabled** | **Boolean** | Payouts Enabled status |  [optional]
**payoutsPaused** | **Boolean** | Flag indicating if payouts are paused |  [optional]
**paymentsEnabled** | **Boolean** | Flag indicating if payments are enabled |  [optional]
**disabledReason** | **String** | If the Stripe connected account is disabled, this is Stripe&#39;s raw  requirements.disabled_reason describing why, as last recorded from a Stripe  connected-account webhook. Known values are requirements.fields_needed,  requirements.past_due, requirements.pending_verification,  rejected.fraud, rejected.terms_of_service, rejected.listed,  rejected.other and platform_paused, but Stripe can introduce new ones, so  the value is passed through unmapped (the same way  CapabilityRequirementsInfo.DisabledReason is). null when the account is  not disabled. Note that {Flipdish.PublicModels.V1.BankAccount.StripeConnectedAccountInfo.AccountStatus} is a deliberately lossy mapping of  this value and the two can legitimately disagree - do not derive one from the other. |  [optional]


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
PLATFORMPAUSED | &quot;PlatformPaused&quot;


<a name="CardPaymentStatusEnum"></a>
## Enum: CardPaymentStatusEnum
Name | Value
---- | -----
INACTIVE | &quot;Inactive&quot;
PENDING | &quot;Pending&quot;
ACTIVE | &quot;Active&quot;
UNREQUESTED | &quot;Unrequested&quot;


<a name="PayoutScheduleIntervalEnum"></a>
## Enum: PayoutScheduleIntervalEnum
Name | Value
---- | -----
MANUAL | &quot;Manual&quot;
DAILY | &quot;Daily&quot;
WEEKLY | &quot;Weekly&quot;
MONTHLY | &quot;Monthly&quot;



