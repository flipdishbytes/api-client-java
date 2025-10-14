
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | User Id |  [optional]
**phoneNumber** | **String** | Phone Number |  [optional]
**email** | **String** | Email |  [optional]
**customerName** | **String** | Customer Name |  [optional]
**hasLoggedIn** | **Boolean** | Has Logged In |  [optional]
**userDiscriminator** | [**UserDiscriminatorEnum**](#UserDiscriminatorEnum) | User Discriminator |  [optional]
**tsCreate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp Created |  [optional]
**whiteLabelConfigs** | [**List&lt;UserWhiteLabelConfig&gt;**](UserWhiteLabelConfig.md) | WhiteLabel Configs |  [optional]
**userType** | **String** | User Type |  [optional]


<a name="UserDiscriminatorEnum"></a>
## Enum: UserDiscriminatorEnum
Name | Value
---- | -----
ALL | &quot;All&quot;
APPLICATIONUSERS | &quot;ApplicationUsers&quot;
RESTAURANTUSERS | &quot;RestaurantUsers&quot;
HYDRAUSERS | &quot;HydraUsers&quot;



