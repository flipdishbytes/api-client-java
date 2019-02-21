
# ProcessingFeeConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storeId** | **Integer** | Store Id |  [optional]
**paymentAccountType** | [**PaymentAccountTypeEnum**](#PaymentAccountTypeEnum) | Payment account type |  [optional]
**percentFee** | **Double** | Percent fee to customer, including VAT |  [optional]
**fixedFee** | **Double** | Fixed fee to customer, including VAT |  [optional]


<a name="PaymentAccountTypeEnum"></a>
## Enum: PaymentAccountTypeEnum
Name | Value
---- | -----
CARD | &quot;Card&quot;
CASH | &quot;Cash&quot;
IDEAL | &quot;Ideal&quot;
BANCONTACT | &quot;Bancontact&quot;
GIROPAY | &quot;Giropay&quot;
EPS | &quot;Eps&quot;



