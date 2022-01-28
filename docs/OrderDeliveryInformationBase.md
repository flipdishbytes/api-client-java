
# OrderDeliveryInformationBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalReferenceId** | **String** | External Reference Id |  [optional]
**trackUrl** | **String** | Tracking Url |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Delivery Status |  [optional]
**deliveryStatusNotes** | **String** | Delivery Status Notes |  [optional]
**errorMessage** | **String** | Error Message |  [optional]
**integrationCode** | **String** | Integration Code |  [optional]
**integrationName** | **String** | Integration Name |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
UNASSIGNED | &quot;Unassigned&quot;
UNACCEPTED | &quot;Unaccepted&quot;
ACCEPTED | &quot;Accepted&quot;
CARRYING | &quot;Carrying&quot;
ONTHEWAY | &quot;OnTheWay&quot;
ARRIVEDATLOCATION | &quot;ArrivedAtLocation&quot;
DELIVERED | &quot;Delivered&quot;
CANNOTDELIVER | &quot;CannotDeliver&quot;



