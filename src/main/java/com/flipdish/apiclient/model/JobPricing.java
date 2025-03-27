/*
 * Flipdish Open API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipdish.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Job Pricing
 */
@ApiModel(description = "Job Pricing")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-27T13:04:47.783Z")
public class JobPricing {
  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("TaxPercentage")
  private Double taxPercentage = null;

  @SerializedName("PriceTaxIncluded")
  private Double priceTaxIncluded = null;

  @SerializedName("PriceTaxExcluded")
  private Double priceTaxExcluded = null;

  @SerializedName("TaxAmount")
  private Double taxAmount = null;

  @SerializedName("InvoiceUrl")
  private String invoiceUrl = null;

  public JobPricing currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @ApiModelProperty(value = "Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public JobPricing taxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * Tax Percentage
   * @return taxPercentage
  **/
  @ApiModelProperty(value = "Tax Percentage")
  public Double getTaxPercentage() {
    return taxPercentage;
  }

  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }

  public JobPricing priceTaxIncluded(Double priceTaxIncluded) {
    this.priceTaxIncluded = priceTaxIncluded;
    return this;
  }

   /**
   * Price Tax Included
   * @return priceTaxIncluded
  **/
  @ApiModelProperty(value = "Price Tax Included")
  public Double getPriceTaxIncluded() {
    return priceTaxIncluded;
  }

  public void setPriceTaxIncluded(Double priceTaxIncluded) {
    this.priceTaxIncluded = priceTaxIncluded;
  }

  public JobPricing priceTaxExcluded(Double priceTaxExcluded) {
    this.priceTaxExcluded = priceTaxExcluded;
    return this;
  }

   /**
   * Price Tax Excluded
   * @return priceTaxExcluded
  **/
  @ApiModelProperty(value = "Price Tax Excluded")
  public Double getPriceTaxExcluded() {
    return priceTaxExcluded;
  }

  public void setPriceTaxExcluded(Double priceTaxExcluded) {
    this.priceTaxExcluded = priceTaxExcluded;
  }

  public JobPricing taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax Amount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Tax Amount")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public JobPricing invoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
    return this;
  }

   /**
   * Invoice Url
   * @return invoiceUrl
  **/
  @ApiModelProperty(value = "Invoice Url")
  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPricing jobPricing = (JobPricing) o;
    return Objects.equals(this.currency, jobPricing.currency) &&
        Objects.equals(this.taxPercentage, jobPricing.taxPercentage) &&
        Objects.equals(this.priceTaxIncluded, jobPricing.priceTaxIncluded) &&
        Objects.equals(this.priceTaxExcluded, jobPricing.priceTaxExcluded) &&
        Objects.equals(this.taxAmount, jobPricing.taxAmount) &&
        Objects.equals(this.invoiceUrl, jobPricing.invoiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, taxPercentage, priceTaxIncluded, priceTaxExcluded, taxAmount, invoiceUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPricing {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    priceTaxIncluded: ").append(toIndentedString(priceTaxIncluded)).append("\n");
    sb.append("    priceTaxExcluded: ").append(toIndentedString(priceTaxExcluded)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    invoiceUrl: ").append(toIndentedString(invoiceUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

