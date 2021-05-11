
# MenuTaxDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxRates** | [**List&lt;MenuTaxRate&gt;**](MenuTaxRate.md) | Tax Rates |  [optional]
**displayTax** | **Boolean** | Display tax for Menu |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | TaxType |  [optional]
**itemTaxes** | **Map&lt;String, Integer&gt;** | ItemIds and TaxIds |  [optional]
**setItemTaxes** | **Map&lt;String, Integer&gt;** | SetItemIds and TaxIds |  [optional]


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
INCLUDEDINBASEPRICE | &quot;IncludedInBasePrice&quot;
EXCLUDEDFROMBASEPRICE | &quot;ExcludedFromBasePrice&quot;



