
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionId** | **Integer** | The subscription identifier |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Starting date of the subscription |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the subscription (TrialPeriod, Ongoing, Unpaid, Canceled) |  [optional]
**userId** | **Integer** | Flipdish user identifier |  [optional]
**subscriptionPlan** | [**SubscriptionPlan**](SubscriptionPlan.md) | Subscription Plan |  [optional]
**card** | [**Card**](Card.md) | Card |  [optional]
**appId** | **String** | App name Id of the subscription | 
**vatNumber** | **String** | Last 4 digits of the card |  [optional]
**vatCountryCode** | **String** | Expiry date of the card | 
**quantity** | **Integer** | Number of physical restaurants |  [optional]
**subscriptionPlanId** | **Integer** | Subscription plan identifier |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
TRIALPERIOD | &quot;TrialPeriod&quot;
ONGOING | &quot;Ongoing&quot;
UNPAID | &quot;Unpaid&quot;
CANCELED | &quot;Canceled&quot;



