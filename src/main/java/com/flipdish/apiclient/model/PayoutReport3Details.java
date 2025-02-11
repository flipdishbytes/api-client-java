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
import com.flipdish.apiclient.model.PayoutReport3DetailsAdjustments;
import com.flipdish.apiclient.model.PayoutReport3DetailsFlipdishFees;
import com.flipdish.apiclient.model.PayoutReport3DetailsRevenue;
import com.flipdish.apiclient.model.PayoutReport3DetailsSummary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutReport3Details
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T16:24:58.787Z")
public class PayoutReport3Details {
  @SerializedName("Amount")
  private Double amount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Summary")
  private PayoutReport3DetailsSummary summary = null;

  @SerializedName("Revenue")
  private PayoutReport3DetailsRevenue revenue = null;

  @SerializedName("FlipdishFees")
  private PayoutReport3DetailsFlipdishFees flipdishFees = null;

  @SerializedName("Adjustments")
  private PayoutReport3DetailsAdjustments adjustments = null;

  public PayoutReport3Details amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PayoutReport3Details currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PayoutReport3Details summary(PayoutReport3DetailsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSummary getSummary() {
    return summary;
  }

  public void setSummary(PayoutReport3DetailsSummary summary) {
    this.summary = summary;
  }

  public PayoutReport3Details revenue(PayoutReport3DetailsRevenue revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsRevenue getRevenue() {
    return revenue;
  }

  public void setRevenue(PayoutReport3DetailsRevenue revenue) {
    this.revenue = revenue;
  }

  public PayoutReport3Details flipdishFees(PayoutReport3DetailsFlipdishFees flipdishFees) {
    this.flipdishFees = flipdishFees;
    return this;
  }

   /**
   * Get flipdishFees
   * @return flipdishFees
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsFlipdishFees getFlipdishFees() {
    return flipdishFees;
  }

  public void setFlipdishFees(PayoutReport3DetailsFlipdishFees flipdishFees) {
    this.flipdishFees = flipdishFees;
  }

  public PayoutReport3Details adjustments(PayoutReport3DetailsAdjustments adjustments) {
    this.adjustments = adjustments;
    return this;
  }

   /**
   * Get adjustments
   * @return adjustments
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsAdjustments getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(PayoutReport3DetailsAdjustments adjustments) {
    this.adjustments = adjustments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3Details payoutReport3Details = (PayoutReport3Details) o;
    return Objects.equals(this.amount, payoutReport3Details.amount) &&
        Objects.equals(this.currency, payoutReport3Details.currency) &&
        Objects.equals(this.summary, payoutReport3Details.summary) &&
        Objects.equals(this.revenue, payoutReport3Details.revenue) &&
        Objects.equals(this.flipdishFees, payoutReport3Details.flipdishFees) &&
        Objects.equals(this.adjustments, payoutReport3Details.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, summary, revenue, flipdishFees, adjustments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3Details {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    flipdishFees: ").append(toIndentedString(flipdishFees)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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

