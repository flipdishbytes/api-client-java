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
import com.flipdish.apiclient.model.PayoutReport3DetailsSalesLine;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PayoutReport3DetailsRevenue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-16T14:31:56.180Z")
public class PayoutReport3DetailsRevenue {
  @SerializedName("GrossSales")
  private PayoutReport3DetailsSalesLine grossSales = null;

  @SerializedName("SalesTax")
  private PayoutReport3DetailsSalesLine salesTax = null;

  @SerializedName("DeliveryCharges")
  private PayoutReport3DetailsSalesLine deliveryCharges = null;

  @SerializedName("OtherCharges")
  private PayoutReport3DetailsSalesLine otherCharges = null;

  @SerializedName("Tips")
  private PayoutReport3DetailsSalesLine tips = null;

  @SerializedName("TotalRevenue")
  private PayoutReport3DetailsSalesLine totalRevenue = null;

  @SerializedName("RevenueForFeeCalculations")
  private PayoutReport3DetailsSalesLine revenueForFeeCalculations = null;

  @SerializedName("DrsCharges")
  private PayoutReport3DetailsSalesLine drsCharges = null;

  public PayoutReport3DetailsRevenue grossSales(PayoutReport3DetailsSalesLine grossSales) {
    this.grossSales = grossSales;
    return this;
  }

   /**
   * Get grossSales
   * @return grossSales
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getGrossSales() {
    return grossSales;
  }

  public void setGrossSales(PayoutReport3DetailsSalesLine grossSales) {
    this.grossSales = grossSales;
  }

  public PayoutReport3DetailsRevenue salesTax(PayoutReport3DetailsSalesLine salesTax) {
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getSalesTax() {
    return salesTax;
  }

  public void setSalesTax(PayoutReport3DetailsSalesLine salesTax) {
    this.salesTax = salesTax;
  }

  public PayoutReport3DetailsRevenue deliveryCharges(PayoutReport3DetailsSalesLine deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
    return this;
  }

   /**
   * Get deliveryCharges
   * @return deliveryCharges
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getDeliveryCharges() {
    return deliveryCharges;
  }

  public void setDeliveryCharges(PayoutReport3DetailsSalesLine deliveryCharges) {
    this.deliveryCharges = deliveryCharges;
  }

  public PayoutReport3DetailsRevenue otherCharges(PayoutReport3DetailsSalesLine otherCharges) {
    this.otherCharges = otherCharges;
    return this;
  }

   /**
   * Get otherCharges
   * @return otherCharges
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getOtherCharges() {
    return otherCharges;
  }

  public void setOtherCharges(PayoutReport3DetailsSalesLine otherCharges) {
    this.otherCharges = otherCharges;
  }

  public PayoutReport3DetailsRevenue tips(PayoutReport3DetailsSalesLine tips) {
    this.tips = tips;
    return this;
  }

   /**
   * Get tips
   * @return tips
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getTips() {
    return tips;
  }

  public void setTips(PayoutReport3DetailsSalesLine tips) {
    this.tips = tips;
  }

  public PayoutReport3DetailsRevenue totalRevenue(PayoutReport3DetailsSalesLine totalRevenue) {
    this.totalRevenue = totalRevenue;
    return this;
  }

   /**
   * Get totalRevenue
   * @return totalRevenue
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getTotalRevenue() {
    return totalRevenue;
  }

  public void setTotalRevenue(PayoutReport3DetailsSalesLine totalRevenue) {
    this.totalRevenue = totalRevenue;
  }

  public PayoutReport3DetailsRevenue revenueForFeeCalculations(PayoutReport3DetailsSalesLine revenueForFeeCalculations) {
    this.revenueForFeeCalculations = revenueForFeeCalculations;
    return this;
  }

   /**
   * Get revenueForFeeCalculations
   * @return revenueForFeeCalculations
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getRevenueForFeeCalculations() {
    return revenueForFeeCalculations;
  }

  public void setRevenueForFeeCalculations(PayoutReport3DetailsSalesLine revenueForFeeCalculations) {
    this.revenueForFeeCalculations = revenueForFeeCalculations;
  }

  public PayoutReport3DetailsRevenue drsCharges(PayoutReport3DetailsSalesLine drsCharges) {
    this.drsCharges = drsCharges;
    return this;
  }

   /**
   * Get drsCharges
   * @return drsCharges
  **/
  @ApiModelProperty(value = "")
  public PayoutReport3DetailsSalesLine getDrsCharges() {
    return drsCharges;
  }

  public void setDrsCharges(PayoutReport3DetailsSalesLine drsCharges) {
    this.drsCharges = drsCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3DetailsRevenue payoutReport3DetailsRevenue = (PayoutReport3DetailsRevenue) o;
    return Objects.equals(this.grossSales, payoutReport3DetailsRevenue.grossSales) &&
        Objects.equals(this.salesTax, payoutReport3DetailsRevenue.salesTax) &&
        Objects.equals(this.deliveryCharges, payoutReport3DetailsRevenue.deliveryCharges) &&
        Objects.equals(this.otherCharges, payoutReport3DetailsRevenue.otherCharges) &&
        Objects.equals(this.tips, payoutReport3DetailsRevenue.tips) &&
        Objects.equals(this.totalRevenue, payoutReport3DetailsRevenue.totalRevenue) &&
        Objects.equals(this.revenueForFeeCalculations, payoutReport3DetailsRevenue.revenueForFeeCalculations) &&
        Objects.equals(this.drsCharges, payoutReport3DetailsRevenue.drsCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossSales, salesTax, deliveryCharges, otherCharges, tips, totalRevenue, revenueForFeeCalculations, drsCharges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsRevenue {\n");
    
    sb.append("    grossSales: ").append(toIndentedString(grossSales)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    deliveryCharges: ").append(toIndentedString(deliveryCharges)).append("\n");
    sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    revenueForFeeCalculations: ").append(toIndentedString(revenueForFeeCalculations)).append("\n");
    sb.append("    drsCharges: ").append(toIndentedString(drsCharges)).append("\n");
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

