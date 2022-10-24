
# AppCompliance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appId** | **String** | App ID |  [optional]
**complianceType** | [**ComplianceTypeEnum**](#ComplianceTypeEnum) | Type of compliance.  This controls if the Flipdish websites and apps display cookie consent banners and adjust cookies to be inline with various regulations.   You should set this correctly based on your region. |  [optional]
**allowDisablingOfGdpr** | **Boolean** | For EU countries, we should not allow to change the option to “Default banner”, but all other countries should be able to do so. |  [optional]


<a name="ComplianceTypeEnum"></a>
## Enum: ComplianceTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
GDPRCOMPLIANCE | &quot;GdprCompliance&quot;



