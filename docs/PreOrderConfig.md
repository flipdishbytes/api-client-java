
# PreOrderConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leadTimeMinutes** | **Integer** | Lead Time in Minutes |  [optional]
**intervalMinutes** | **Integer** | Interval in minutes |  [optional]
**maxOrderAheadDays** | **Integer** | Max Days to order ahead |  [optional]
**includeAsap** | **Boolean** | Show ASAP as option |  [optional]
**includeMoreGranularInitialTime** | **Boolean** | Granual Init&#39; Time |  [optional]
**cutOffTimePreviousDayBasic** | **String** | Cut off time previous day |  [optional]
**cutOffTimeCurrentDayBasic** | **String** | Cut off time current day |  [optional]
**preOrderTimeDisplayType** | [**PreOrderTimeDisplayTypeEnum**](#PreOrderTimeDisplayTypeEnum) | Type of time displayed. |  [optional]
**alwaysAppearOpen** | **Boolean** | Specifies whether a customer can pre-order outside the store opening hours or not. |  [optional]
**requireExplicitSelectAlways** | **Boolean** | Force customer to select collection time. |  [optional]


<a name="PreOrderTimeDisplayTypeEnum"></a>
## Enum: PreOrderTimeDisplayTypeEnum
Name | Value
---- | -----
SINGLETIME | &quot;SingleTime&quot;
STARTANDENDTIME | &quot;StartAndEndTime&quot;
DAYONLY | &quot;DayOnly&quot;



