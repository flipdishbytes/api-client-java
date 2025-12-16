
# WebhookSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Webhook subscription identifier |  [optional]
**ownerUserId** | **Integer** | Webhook subscription owner user identifier |  [optional]
**version** | **String** | Webhook subscription owner user identifier |  [optional]
**eventNames** | **List&lt;String&gt;** | Webhook subscription event names |  [optional]
**callbackUrl** | **String** | Callback url. Flipdish system POST messages to this url. |  [optional]
**enabled** | **Boolean** | Is webhook subscription enabled. |  [optional]
**verifyToken** | **String** | This is your token which will be in the Header of each POST request from Flipdish with name: X-Verify-Token. |  [optional]



