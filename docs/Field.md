
# Field

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name | 
**description** | **String** | Description | 
**key** | **String** | Key | 
**tooltip** | **String** | Tooltip |  [optional]
**position** | **Integer** | Position  &lt;remarks&gt;Position order in the fields list to display&lt;/remarks&gt; | 
**defaultValue** | **String** | Default Value  &lt;example&gt;10&lt;/example&gt;&lt;example&gt;true&lt;/example&gt; |  [optional]
**validValues** | [**List&lt;ValidValue&gt;**](ValidValue.md) | Valid Values  &lt;remarks&gt;Used typically for dropdown/select&lt;/remarks&gt; |  [optional]
**validationRegex** | **String** | Validation Regex |  [optional]
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | Field Type | 


<a name="FieldTypeEnum"></a>
## Enum: FieldTypeEnum
Name | Value
---- | -----
TEXT | &quot;Text&quot;
TEXTAREA | &quot;TextArea&quot;
INTEGER | &quot;Integer&quot;
DECIMAL | &quot;Decimal&quot;
DATE | &quot;Date&quot;
DATETIME | &quot;DateTime&quot;
TIME | &quot;Time&quot;
SELECT | &quot;Select&quot;
BOOLEAN | &quot;Boolean&quot;


