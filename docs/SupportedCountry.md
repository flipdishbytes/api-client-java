
# SupportedCountry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryCode** | **String** | Country code |  [optional]
**name** | **String** | Nice display name for a country |  [optional]
**phoneCode** | **Integer** | Country internatinoal phone code prefix |  [optional]
**languageCode** | **String** | Language code |  [optional]
**languageName** | **String** | Language name |  [optional]
**otpNumber** | **String** | The phone number provided to Store staff which, in conjunction with a one-time-code, will connect them to the customer. |  [optional]
**supportNumber** | **String** | The store&#39;s support phone number, displayed to customers. |  [optional]
**addressLayout** | [**AddressLayoutEnum**](#AddressLayoutEnum) | Address layout format. This changes the layout of address entry forms on the web app, iOS and Android app and should be set based on local custom. |  [optional]
**postCodeType** | [**PostCodeTypeEnum**](#PostCodeTypeEnum) | Post code type |  [optional]
**supportRegion** | [**SupportRegionEnum**](#SupportRegionEnum) | Supported region. This is not used. |  [optional]


<a name="AddressLayoutEnum"></a>
## Enum: AddressLayoutEnum
Name | Value
---- | -----
BUILDINGFIRST | &quot;BuildingFirst&quot;
ADDRESSFIRST | &quot;AddressFirst&quot;
FULLSTREETADDRESSFIRST | &quot;FullStreetAddressFirst&quot;


<a name="PostCodeTypeEnum"></a>
## Enum: PostCodeTypeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
POSTCODE | &quot;PostCode&quot;
ZIP | &quot;Zip&quot;


<a name="SupportRegionEnum"></a>
## Enum: SupportRegionEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
SPAIN | &quot;Spain&quot;
BENELUX | &quot;Benelux&quot;



