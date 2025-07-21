
# AppConfigSalesChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailRequestMode** | [**EmailRequestModeEnum**](#EmailRequestModeEnum) | Display a popup to users requesting their email address |  [optional]
**webToAppRedirect** | [**WebToAppRedirectEnum**](#WebToAppRedirectEnum) | Sends users to their native apps or request them to install the pwa |  [optional]
**addressEntryType** | [**AddressEntryTypeEnum**](#AddressEntryTypeEnum) | Address entry type - TextEntryManualDisallowed is the only supported configuration |  [optional]
**displayDeliveryRestaurantListScreen** | **Boolean** | Display Pickup Restaurant List Screen |  [optional]


<a name="EmailRequestModeEnum"></a>
## Enum: EmailRequestModeEnum
Name | Value
---- | -----
DONOTREQUEST | &quot;DoNotRequest&quot;
REQUEST | &quot;Request&quot;
REQUIRE | &quot;Require&quot;


<a name="WebToAppRedirectEnum"></a>
## Enum: WebToAppRedirectEnum
Name | Value
---- | -----
NOREDIRECT | &quot;NoRedirect&quot;
REDIRECTONCE | &quot;RedirectOnce&quot;
REDIRECTALWAYS | &quot;RedirectAlways&quot;
SUGGESTPWA | &quot;SuggestPwa&quot;
FORCEPWA | &quot;ForcePwa&quot;


<a name="AddressEntryTypeEnum"></a>
## Enum: AddressEntryTypeEnum
Name | Value
---- | -----
MAPFIRST | &quot;MapFirst&quot;
TEXTENTRYMANUALALLOWED | &quot;TextEntryManualAllowed&quot;
TEXTENTRYMANUALDISALLOWED | &quot;TextEntryManualDisallowed&quot;



