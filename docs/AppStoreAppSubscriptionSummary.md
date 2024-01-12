
# AppStoreAppSubscriptionSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalSubscriptions** | **Integer** | Total subscriptions (per the AppId subscription setup) |  [optional]
**usedSubscriptions** | **Integer** | Number of subscriptions configured and enabled |  [optional]
**subscriptionAccountIsSetupForClient** | **Boolean** | Is client setup for subscriptions |  [optional]
**subscriptionAccounts** | [**List&lt;AppStoreAppSubscriptionAccount&gt;**](AppStoreAppSubscriptionAccount.md) | Available accounts for subscriptions (only if requesting user has enough permissions to see the list, otherwise empty list or null) |  [optional]



