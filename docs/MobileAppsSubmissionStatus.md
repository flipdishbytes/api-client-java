
# MobileAppsSubmissionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mobileAppsSubmissionStatusId** | **Integer** | Mobile Apps Submission Status Id |  [optional]
**mobileAppsSubmissionId** | **Integer** | Mobile Apps Submission Id |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Mobile Type |  [optional]
**appStatus** | [**AppStatusEnum**](#AppStatusEnum) | Mobile App Status |  [optional]
**updateStatus** | [**UpdateStatusEnum**](#UpdateStatusEnum) | Mobile App Status |  [optional]
**lastUpdateStatusTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile LastUpdateStatusTime |  [optional]
**createTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile CreateTime |  [optional]
**updateTime** | [**OffsetDateTime**](OffsetDateTime.md) | Mobile UpdateTime |  [optional]
**notes** | **String** | Mobile Notes |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
ANDROID | &quot;Android&quot;
IOS | &quot;IOS&quot;


<a name="AppStatusEnum"></a>
## Enum: AppStatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
PUBLISHED | &quot;Published&quot;
UNPUBLISHED | &quot;Unpublished&quot;


<a name="UpdateStatusEnum"></a>
## Enum: UpdateStatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
SUBMITTED | &quot;Submitted&quot;
INREVIEW | &quot;InReview&quot;
REJECTED | &quot;Rejected&quot;
APPROVED | &quot;Approved&quot;
PUBLISHED | &quot;Published&quot;



