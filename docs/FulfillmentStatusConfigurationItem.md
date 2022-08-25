
# FulfillmentStatusConfigurationItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statusId** | **String** | Status Id (no whitespaces) |  [optional]
**statusName** | **String** | Status name |  [optional]
**enabled** | **Boolean** | Is status enabled |  [optional]
**displayName** | **String** | The short status string that is displayed to users in apps, portal. If empty then Order Status Name is displayed instead |  [optional]
**icon** | **String** | Icon/Image that represents that status visual |  [optional]
**publicDescription** | **String** | A string which could be used in notification templates with a placeholder (SMS, email, push, web page with status) |  [optional]
**internal** | **Boolean** | Is internal state (internal states not shown to customers) |  [optional]
**nextStatuses** | **List&lt;String&gt;** | list of statuses that this status can move to (can be back or forth) |  [optional]
**defaultNextStatus** | [**List&lt;NextStatusWithOrderType&gt;**](NextStatusWithOrderType.md) | The default next status (on a dropdown or quick button on terminal or portal) |  [optional]
**changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum) | How will state change (manually or automated, including timed) |  [optional]
**includeInReports** | **Boolean** | Include in reports |  [optional]
**isCustom** | **Boolean** | Is custom state. If not, then it&#39;s a system state |  [optional]
**orderTypes** | [**List&lt;OrderTypesEnum&gt;**](#List&lt;OrderTypesEnum&gt;) | If empty then applies to all ordertypes, otherwise a list of order types this state applies to |  [optional]
**communication** | **Boolean** | Whether state should fire off a notification to the customer |  [optional]
**visualOrder** | **Integer** | Integer for ordering results in choices (eg. dropdowns) |  [optional]


<a name="ChangeTypeEnum"></a>
## Enum: ChangeTypeEnum
Name | Value
---- | -----
MANUAL | &quot;Manual&quot;
AUTOMATED | &quot;Automated&quot;
INTEGRATED | &quot;Integrated&quot;


<a name="List<OrderTypesEnum>"></a>
## Enum: List&lt;OrderTypesEnum&gt;
Name | Value
---- | -----
ALL | &quot;All&quot;
DELIVERY | &quot;Delivery&quot;
COLLECTION | &quot;Collection&quot;
DINEIN | &quot;DineIn&quot;



