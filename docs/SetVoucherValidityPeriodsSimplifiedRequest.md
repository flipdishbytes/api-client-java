
# SetVoucherValidityPeriodsSimplifiedRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daysOfWeek** | [**List&lt;DaysOfWeekEnum&gt;**](#List&lt;DaysOfWeekEnum&gt;) | Days of week when the voucher is valid |  [optional]
**startTime** | **String** | Start time of the day when the voucher is valid |  [optional]
**endTime** | **String** | End time of the day when the voucher is valid.  If the end time is before the start time, the end time is assumed to be the next day. |  [optional]


<a name="List<DaysOfWeekEnum>"></a>
## Enum: List&lt;DaysOfWeekEnum&gt;
Name | Value
---- | -----
SUNDAY | &quot;Sunday&quot;
MONDAY | &quot;Monday&quot;
TUESDAY | &quot;Tuesday&quot;
WEDNESDAY | &quot;Wednesday&quot;
THURSDAY | &quot;Thursday&quot;
FRIDAY | &quot;Friday&quot;
SATURDAY | &quot;Saturday&quot;



