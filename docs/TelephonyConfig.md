
# TelephonyConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**telephonyConfigId** | **Integer** | ID of the phone call |  [optional]
**apmEnabled** | **Boolean** | APM enabled flag |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of telephony service |  [optional]
**consentEnabled** | **Boolean** | Consent enabled flag |  [optional]
**phoneNumber** | **String** | APM phone number of the store |  [optional]
**sendAppLinkSms** | **Boolean** | Send app link SMS flag |  [optional]
**useCustomAppLinkSmsMessage** | **Boolean** | Use custom app link SMS message flag |  [optional]
**useCustomVoiceMessage** | **Boolean** | Use custom voice message flag |  [optional]
**appLinkSmsMessage** | **String** | App link SMS message |  [optional]
**resendApmMessageAfterDays** | **Integer** | Amount of days to resend APM message |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PRERECORDED | &quot;PreRecorded&quot;
VOICEAI | &quot;VoiceAI&quot;



