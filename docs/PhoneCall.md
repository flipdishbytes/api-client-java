
# PhoneCall

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneCallId** | **Integer** | Phone call id |  [optional]
**timeOfCall** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the call |  [optional]
**timeOfCallLocal** | [**OffsetDateTime**](OffsetDateTime.md) | Time of the call, local to the store to which the call was made |  [optional]
**storeId** | **Integer** | ID of the store that the call was TO |  [optional]
**storeName** | **String** | Name of the store that the call was TO |  [optional]
**callerName** | **String** | Name of the caller |  [optional]
**callerUserId** | **Integer** | UserID of the caller |  [optional]
**callerNumber** | **String** | Phone number of the caller |  [optional]
**callLengthInSeconds** | **Integer** | The amount of time the call took |  [optional]
**callStatus** | [**CallStatusEnum**](#CallStatusEnum) | The status of the call |  [optional]


<a name="CallStatusEnum"></a>
## Enum: CallStatusEnum
Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
RINGING | &quot;Ringing&quot;
INPROGRESS | &quot;InProgress&quot;
COMPLETED | &quot;Completed&quot;
FAILED | &quot;Failed&quot;
BUSY | &quot;Busy&quot;
NOANSWER | &quot;NoAnswer&quot;
UNKNOWN | &quot;Unknown&quot;
CANCELED | &quot;Canceled&quot;



