
# MobileAppsSubmissionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mobileAppsSubmissionStatusId** | **Integer** | Mobile Apps Submission Status Id |  [optional]
**mobileAppsSubmissionId** | **Integer** | Mobile Apps Submission Id |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Mobile Type |  [optional]
**appStatus** | [**AppStatusEnum**](#AppStatusEnum) | Mobile App Status |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Mobile App Status |  [optional]
**lastUpdateStatusTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile LastUpdateStatusTime |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile CreateTime |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile UpdateTime |  [optional]
**notes** | **String** | Mobile Notes |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ANDROID | &quot;Android&quot;
IOS | &quot;IOS&quot;


<a name="AppStatusEnum"></a>
## Enum: AppStatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
PUBLISHED | &quot;Published&quot;
UNPUBLISHED | &quot;Unpublished&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
INPROGRESS | &quot;InProgress&quot;
SUBMITTED | &quot;Submitted&quot;
APPSTOREREVIEW | &quot;AppStoreReview&quot;
SUCESSFULL | &quot;Sucessfull&quot;
UNSUCCESFUL | &quot;Unsuccesful&quot;



