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
import com.flipdish.apiclient.model.InvoicePeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Invoice Item
 */
@ApiModel(description = "Invoice Item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-14T11:38:28.696Z")
public class InvoiceItem {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Quantity")
  private Long quantity = null;

  @SerializedName("UnitAmountExcludingTax")
  private Double unitAmountExcludingTax = null;

  @SerializedName("Tax")
  private Double tax = null;

  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Period")
  private InvoicePeriod period = null;

  public InvoiceItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public InvoiceItem unitAmountExcludingTax(Double unitAmountExcludingTax) {
    this.unitAmountExcludingTax = unitAmountExcludingTax;
    return this;
  }

   /**
   * Unit Amount Excluding Tax
   * @return unitAmountExcludingTax
  **/
  @ApiModelProperty(required = true, value = "Unit Amount Excluding Tax")
  public Double getUnitAmountExcludingTax() {
    return unitAmountExcludingTax;
  }

  public void setUnitAmountExcludingTax(Double unitAmountExcludingTax) {
    this.unitAmountExcludingTax = unitAmountExcludingTax;
  }

  public InvoiceItem tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax
   * @return tax
  **/
  @ApiModelProperty(required = true, value = "Tax")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public InvoiceItem amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InvoiceItem period(InvoicePeriod period) {
    this.period = period;
    return this;
  }

   /**
   * Period
   * @return period
  **/
  @ApiModelProperty(required = true, value = "Period")
  public InvoicePeriod getPeriod() {
    return period;
  }

  public void setPeriod(InvoicePeriod period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItem invoiceItem = (InvoiceItem) o;
    return Objects.equals(this.description, invoiceItem.description) &&
        Objects.equals(this.quantity, invoiceItem.quantity) &&
        Objects.equals(this.unitAmountExcludingTax, invoiceItem.unitAmountExcludingTax) &&
        Objects.equals(this.tax, invoiceItem.tax) &&
        Objects.equals(this.amount, invoiceItem.amount) &&
        Objects.equals(this.period, invoiceItem.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, quantity, unitAmountExcludingTax, tax, amount, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitAmountExcludingTax: ").append(toIndentedString(unitAmountExcludingTax)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

