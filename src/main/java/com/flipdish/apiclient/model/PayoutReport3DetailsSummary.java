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
 * PayoutReport3DetailsSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-27T10:30:27.366Z")
public class PayoutReport3DetailsSummary {
  @SerializedName("Revenue")
  private Double revenue = null;

  @SerializedName("RevenueOfWhichCash")
  private Double revenueOfWhichCash = null;

  @SerializedName("RevenueForFeeCalculations")
  private Double revenueForFeeCalculations = null;

  @SerializedName("FlipdishFees")
  private Double flipdishFees = null;

  @SerializedName("Adjustments")
  private Double adjustments = null;

  @SerializedName("ThirdPartyIntegrationFeesAndTips")
  private Double thirdPartyIntegrationFeesAndTips = null;

  @SerializedName("Total")
  private Double total = null;

  public PayoutReport3DetailsSummary revenue(Double revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @ApiModelProperty(value = "")
  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  public PayoutReport3DetailsSummary revenueOfWhichCash(Double revenueOfWhichCash) {
    this.revenueOfWhichCash = revenueOfWhichCash;
    return this;
  }

   /**
   * Get revenueOfWhichCash
   * @return revenueOfWhichCash
  **/
  @ApiModelProperty(value = "")
  public Double getRevenueOfWhichCash() {
    return revenueOfWhichCash;
  }

  public void setRevenueOfWhichCash(Double revenueOfWhichCash) {
    this.revenueOfWhichCash = revenueOfWhichCash;
  }

  public PayoutReport3DetailsSummary revenueForFeeCalculations(Double revenueForFeeCalculations) {
    this.revenueForFeeCalculations = revenueForFeeCalculations;
    return this;
  }

   /**
   * Get revenueForFeeCalculations
   * @return revenueForFeeCalculations
  **/
  @ApiModelProperty(value = "")
  public Double getRevenueForFeeCalculations() {
    return revenueForFeeCalculations;
  }

  public void setRevenueForFeeCalculations(Double revenueForFeeCalculations) {
    this.revenueForFeeCalculations = revenueForFeeCalculations;
  }

  public PayoutReport3DetailsSummary flipdishFees(Double flipdishFees) {
    this.flipdishFees = flipdishFees;
    return this;
  }

   /**
   * Get flipdishFees
   * @return flipdishFees
  **/
  @ApiModelProperty(value = "")
  public Double getFlipdishFees() {
    return flipdishFees;
  }

  public void setFlipdishFees(Double flipdishFees) {
    this.flipdishFees = flipdishFees;
  }

  public PayoutReport3DetailsSummary adjustments(Double adjustments) {
    this.adjustments = adjustments;
    return this;
  }

   /**
   * Get adjustments
   * @return adjustments
  **/
  @ApiModelProperty(value = "")
  public Double getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(Double adjustments) {
    this.adjustments = adjustments;
  }

  public PayoutReport3DetailsSummary thirdPartyIntegrationFeesAndTips(Double thirdPartyIntegrationFeesAndTips) {
    this.thirdPartyIntegrationFeesAndTips = thirdPartyIntegrationFeesAndTips;
    return this;
  }

   /**
   * Get thirdPartyIntegrationFeesAndTips
   * @return thirdPartyIntegrationFeesAndTips
  **/
  @ApiModelProperty(value = "")
  public Double getThirdPartyIntegrationFeesAndTips() {
    return thirdPartyIntegrationFeesAndTips;
  }

  public void setThirdPartyIntegrationFeesAndTips(Double thirdPartyIntegrationFeesAndTips) {
    this.thirdPartyIntegrationFeesAndTips = thirdPartyIntegrationFeesAndTips;
  }

  public PayoutReport3DetailsSummary total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3DetailsSummary payoutReport3DetailsSummary = (PayoutReport3DetailsSummary) o;
    return Objects.equals(this.revenue, payoutReport3DetailsSummary.revenue) &&
        Objects.equals(this.revenueOfWhichCash, payoutReport3DetailsSummary.revenueOfWhichCash) &&
        Objects.equals(this.revenueForFeeCalculations, payoutReport3DetailsSummary.revenueForFeeCalculations) &&
        Objects.equals(this.flipdishFees, payoutReport3DetailsSummary.flipdishFees) &&
        Objects.equals(this.adjustments, payoutReport3DetailsSummary.adjustments) &&
        Objects.equals(this.thirdPartyIntegrationFeesAndTips, payoutReport3DetailsSummary.thirdPartyIntegrationFeesAndTips) &&
        Objects.equals(this.total, payoutReport3DetailsSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revenue, revenueOfWhichCash, revenueForFeeCalculations, flipdishFees, adjustments, thirdPartyIntegrationFeesAndTips, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsSummary {\n");
    
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    revenueOfWhichCash: ").append(toIndentedString(revenueOfWhichCash)).append("\n");
    sb.append("    revenueForFeeCalculations: ").append(toIndentedString(revenueForFeeCalculations)).append("\n");
    sb.append("    flipdishFees: ").append(toIndentedString(flipdishFees)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
    sb.append("    thirdPartyIntegrationFeesAndTips: ").append(toIndentedString(thirdPartyIntegrationFeesAndTips)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

