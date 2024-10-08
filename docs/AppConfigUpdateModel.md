
# AppConfigUpdateModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | App name.   This is used in various places on the Apple App Store, Google Play Store, mobile apps and websites. |  [optional]
**hostName** | **String** | HostName on which the web-ordering system is allowed to be hosted or that a Flipdish website is hosted on. |  [optional]
**mainColor** | **String** | Main color of the web / Android / iOS applications |  [optional]
**kioskPrimaryColour** | **String** | Primary colour used on the Kiosk |  [optional]
**applicationCategory** | [**ApplicationCategoryEnum**](#ApplicationCategoryEnum) | Application Category |  [optional]
**isPanaceaEnabled** | **Boolean** | Panacea is the term used for websites that are hosted on the my.flipdish.com domain. This value is true when the App&#39;s website is hosted on this domain.  The aternative to using Panacea websites is to use a custom domain. |  [optional]
**panaceaVanityUrl** | **String** | In case of IsPanaceaEnabled is true, the app can be accessed via https://my.flipdish.com/{PanaceaVanityUrl} |  [optional]
**cookieConsentPromptEnabled** | **Boolean** | Cookie Consent Prompt Enabled |  [optional]
**logoImageUrl** | **String** | Logo image URL |  [optional]
**countryId** | **String** | Country identifier in ISO 3166-1 alpha-2 format. |  [optional]


<a name="ApplicationCategoryEnum"></a>
## Enum: ApplicationCategoryEnum
Name | Value
---- | -----
RESTAURANT | &quot;Restaurant&quot;
CAFE | &quot;Cafe&quot;
CONVENIENCE | &quot;Convenience&quot;



