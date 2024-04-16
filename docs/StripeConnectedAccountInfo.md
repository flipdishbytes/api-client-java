
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



