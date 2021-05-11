
# MenuElementEditResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**menuElementId** | **Integer** | Holds the information for the A and CNAME Records of a domain. |  [optional]
**menuElementType** | [**MenuElementTypeEnum**](#MenuElementTypeEnum) | Type of menu element |  [optional]
**validationCode** | [**ValidationCodeEnum**](#ValidationCodeEnum) | Validation message for menu element issue |  [optional]


<a name="MenuElementTypeEnum"></a>
## Enum: MenuElementTypeEnum
Name | Value
---- | -----
MENUITEM | &quot;MenuItem&quot;
MENUOPTIONSETITEM | &quot;MenuOptionSetItem&quot;


<a name="ValidationCodeEnum"></a>
## Enum: ValidationCodeEnum
Name | Value
---- | -----
SUCCESS | &quot;Success&quot;
MINIMUMCOUNTVIOLATION | &quot;MinimumCountViolation&quot;



