
# Reject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum) | Reject reason. | 
**doNotNotifyCustomer** | **Boolean** | Notify customer. The server will not send and SMS to the customer if the value is true. |  [optional]


<a name="RejectReasonEnum"></a>
## Enum: RejectReasonEnum
Name | Value
---- | -----
TOOBUSY | &quot;TooBusy&quot;
FOODUNAVAILABLE | &quot;FoodUnavailable&quot;
UNABLETODELIVER | &quot;UnableToDeliver&quot;
UNKNOWNADDRESS | &quot;UnknownAddress&quot;
UNKNOWNREASON | &quot;UnknownReason&quot;
TOOSOON | &quot;TooSoon&quot;
TIMEUNAVAILABLE | &quot;TimeUnavailable&quot;
DONTDELIVERTOAREA | &quot;DontDeliverToArea&quot;
STOREUNCONTACTABLE | &quot;StoreUncontactable&quot;



