
# AppInstall

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the installed application. |  [optional]
**firstLogin** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of the user&#39;s first login to the app. |  [optional]
**firstLoginHuman** | **String** | Human-readable representation of the first login date. |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of the user&#39;s last activity in the app. |  [optional]
**lastActivityHuman** | **String** | Human-readable representation of the last activity date. |  [optional]
**googleTokens** | **Integer** | Number of Google push notification tokens associated with the app install. |  [optional]
**appleTokens** | **Integer** | Number of Apple push notification tokens associated with the app install. |  [optional]
**orderCount** | **Integer** | Number of orders placed by the user through this app install. |  [optional]
**userAgentAtSignup** | **String** | User agent string at the time of signup. |  [optional]
**userAgentMostRecent** | **String** | Most recent user agent string used by the user. |  [optional]



