
# PayoutRequestIds

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountIds** | **List&lt;Integer&gt;** | List of bank account ids to search for |  [optional]
**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) | List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for |  [optional]


<a name="List<StatesEnum>"></a>
## Enum: List&lt;StatesEnum&gt;
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
INTRANSIT | &quot;InTransit&quot;
PAID | &quot;Paid&quot;
FAILED | &quot;Failed&quot;
CANCELLED | &quot;Cancelled&quot;



