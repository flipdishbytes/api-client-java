
# OAuthApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**oauthAppId** | **String** | OAuth App Identifier |  [optional]
**oauthAppName** | **String** | OAuth App Name |  [optional]
**ownerUserId** | **Integer** | OAuth App owner user identifier |  [optional]
**logoUri** | **String** | OAuth App logo uri |  [optional]
**flow** | [**FlowEnum**](#FlowEnum) | Supported OpenID Connect flows |  [optional]
**refreshTokenUsage** | [**RefreshTokenUsageEnum**](#RefreshTokenUsageEnum) | ReUse: the refresh token handle will stay the same when refreshing tokens   OneTime: the refresh token handle will be updated when refreshing tokens |  [optional]
**accessTokenLifetime** | **Integer** | Timem it takes for the IdentityToken to expire in seconds |  [optional]
**absoluteRefreshTokenLifetime** | **Integer** | Maximum lifetime of a refresh token in seconds |  [optional]


<a name="FlowEnum"></a>
## Enum: FlowEnum
Name | Value
---- | -----
AUTHORIZATIONCODE | &quot;AuthorizationCode&quot;
IMPLICIT | &quot;Implicit&quot;
HYBRID | &quot;Hybrid&quot;
CLIENTCREDENTIALS | &quot;ClientCredentials&quot;


<a name="RefreshTokenUsageEnum"></a>
## Enum: RefreshTokenUsageEnum
Name | Value
---- | -----
REUSE | &quot;ReUse&quot;
ONETIMEONLY | &quot;OneTimeOnly&quot;



