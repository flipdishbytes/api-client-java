
# StripeAccountLinkRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stripeId** | **String** | Stripe&#39;s own connected account identifier |  [optional]
**returnUrl** | **String** | URL to be hit if link creation succeeds |  [optional]
**collect** | [**CollectEnum**](#CollectEnum) | Which information to collect from users at this stage |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Either onboarding or edit user information |  [optional]


<a name="CollectEnum"></a>
## Enum: CollectEnum
Name | Value
---- | -----
CURRENTLYDUE | &quot;CurrentlyDue&quot;
EVENTUALLYDUE | &quot;EventuallyDue&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ONBOARDING | &quot;Onboarding&quot;
UPDATE | &quot;Update&quot;



