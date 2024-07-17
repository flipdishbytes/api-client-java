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
import com.flipdish.apiclient.model.InvoiceDiscount;
import com.flipdish.apiclient.model.InvoiceItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * UpcomingInvoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-17T15:53:22.758Z")
public class UpcomingInvoice {
  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("NextBillingDate")
  private OffsetDateTime nextBillingDate = null;

  @SerializedName("Subtotal")
  private Double subtotal = null;

  @SerializedName("TotalExcludingTax")
  private Double totalExcludingTax = null;

  @SerializedName("AmountDue")
  private Double amountDue = null;

  @SerializedName("Tax")
  private Double tax = null;

  @SerializedName("Items")
  private List<InvoiceItem> items = null;

  @SerializedName("Discounts")
  private List<InvoiceDiscount> discounts = null;

  public UpcomingInvoice amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(value = "Amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public UpcomingInvoice nextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
    return this;
  }

   /**
   * Next billing date
   * @return nextBillingDate
  **/
  @ApiModelProperty(value = "Next billing date")
  public OffsetDateTime getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(OffsetDateTime nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  public UpcomingInvoice subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Subtotal
   * @return subtotal
  **/
  @ApiModelProperty(required = true, value = "Subtotal")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public UpcomingInvoice totalExcludingTax(Double totalExcludingTax) {
    this.totalExcludingTax = totalExcludingTax;
    return this;
  }

   /**
   * Total excluding tax
   * @return totalExcludingTax
  **/
  @ApiModelProperty(value = "Total excluding tax")
  public Double getTotalExcludingTax() {
    return totalExcludingTax;
  }

  public void setTotalExcludingTax(Double totalExcludingTax) {
    this.totalExcludingTax = totalExcludingTax;
  }

  public UpcomingInvoice amountDue(Double amountDue) {
    this.amountDue = amountDue;
    return this;
  }

   /**
   * Amount due
   * @return amountDue
  **/
  @ApiModelProperty(required = true, value = "Amount due")
  public Double getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(Double amountDue) {
    this.amountDue = amountDue;
  }

  public UpcomingInvoice tax(Double tax) {
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

  public UpcomingInvoice items(List<InvoiceItem> items) {
    this.items = items;
    return this;
  }

  public UpcomingInvoice addItemsItem(InvoiceItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<InvoiceItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items
   * @return items
  **/
  @ApiModelProperty(value = "Items")
  public List<InvoiceItem> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
  }

  public UpcomingInvoice discounts(List<InvoiceDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public UpcomingInvoice addDiscountsItem(InvoiceDiscount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<InvoiceDiscount>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Discounts
   * @return discounts
  **/
  @ApiModelProperty(value = "Discounts")
  public List<InvoiceDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<InvoiceDiscount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpcomingInvoice upcomingInvoice = (UpcomingInvoice) o;
    return Objects.equals(this.amount, upcomingInvoice.amount) &&
        Objects.equals(this.nextBillingDate, upcomingInvoice.nextBillingDate) &&
        Objects.equals(this.subtotal, upcomingInvoice.subtotal) &&
        Objects.equals(this.totalExcludingTax, upcomingInvoice.totalExcludingTax) &&
        Objects.equals(this.amountDue, upcomingInvoice.amountDue) &&
        Objects.equals(this.tax, upcomingInvoice.tax) &&
        Objects.equals(this.items, upcomingInvoice.items) &&
        Objects.equals(this.discounts, upcomingInvoice.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, nextBillingDate, subtotal, totalExcludingTax, amountDue, tax, items, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpcomingInvoice {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    nextBillingDate: ").append(toIndentedString(nextBillingDate)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    totalExcludingTax: ").append(toIndentedString(totalExcludingTax)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

