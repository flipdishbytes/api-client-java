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
 * Sales information
 */
@ApiModel(description = "Sales information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T12:04:25.919Z")
public class RevenueDetail {
  @SerializedName("OnlineSalesAmount")
  private Double onlineSalesAmount = null;

  @SerializedName("OnlineSalesTax")
  private Double onlineSalesTax = null;

  @SerializedName("OnlineSalesIncludingTax")
  private Double onlineSalesIncludingTax = null;

  @SerializedName("OnlineSalesFeesBaseAmount")
  private Double onlineSalesFeesBaseAmount = null;

  @SerializedName("CashSalesAmount")
  private Double cashSalesAmount = null;

  @SerializedName("CashSalesTax")
  private Double cashSalesTax = null;

  @SerializedName("CashSalesIncludingTax")
  private Double cashSalesIncludingTax = null;

  @SerializedName("CashSalesFeesBaseAmount")
  private Double cashSalesFeesBaseAmount = null;

  @SerializedName("TotalSalesIncludingTax")
  private Double totalSalesIncludingTax = null;

  @SerializedName("OnlineSalesDeliveryCharges")
  private Double onlineSalesDeliveryCharges = null;

  @SerializedName("OnlineSalesTips")
  private Double onlineSalesTips = null;

  @SerializedName("TotalOnlineRevenue")
  private Double totalOnlineRevenue = null;

  @SerializedName("OnlineSalesServiceCharges")
  private Double onlineSalesServiceCharges = null;

  public RevenueDetail onlineSalesAmount(Double onlineSalesAmount) {
    this.onlineSalesAmount = onlineSalesAmount;
    return this;
  }

   /**
   * Online sales amount
   * @return onlineSalesAmount
  **/
  @ApiModelProperty(value = "Online sales amount")
  public Double getOnlineSalesAmount() {
    return onlineSalesAmount;
  }

  public void setOnlineSalesAmount(Double onlineSalesAmount) {
    this.onlineSalesAmount = onlineSalesAmount;
  }

  public RevenueDetail onlineSalesTax(Double onlineSalesTax) {
    this.onlineSalesTax = onlineSalesTax;
    return this;
  }

   /**
   * Online sales tax
   * @return onlineSalesTax
  **/
  @ApiModelProperty(value = "Online sales tax")
  public Double getOnlineSalesTax() {
    return onlineSalesTax;
  }

  public void setOnlineSalesTax(Double onlineSalesTax) {
    this.onlineSalesTax = onlineSalesTax;
  }

  public RevenueDetail onlineSalesIncludingTax(Double onlineSalesIncludingTax) {
    this.onlineSalesIncludingTax = onlineSalesIncludingTax;
    return this;
  }

   /**
   * Online sales amount plus online sales tax
   * @return onlineSalesIncludingTax
  **/
  @ApiModelProperty(value = "Online sales amount plus online sales tax")
  public Double getOnlineSalesIncludingTax() {
    return onlineSalesIncludingTax;
  }

  public void setOnlineSalesIncludingTax(Double onlineSalesIncludingTax) {
    this.onlineSalesIncludingTax = onlineSalesIncludingTax;
  }

  public RevenueDetail onlineSalesFeesBaseAmount(Double onlineSalesFeesBaseAmount) {
    this.onlineSalesFeesBaseAmount = onlineSalesFeesBaseAmount;
    return this;
  }

   /**
   * Online sales base amount to calculate fees
   * @return onlineSalesFeesBaseAmount
  **/
  @ApiModelProperty(value = "Online sales base amount to calculate fees")
  public Double getOnlineSalesFeesBaseAmount() {
    return onlineSalesFeesBaseAmount;
  }

  public void setOnlineSalesFeesBaseAmount(Double onlineSalesFeesBaseAmount) {
    this.onlineSalesFeesBaseAmount = onlineSalesFeesBaseAmount;
  }

  public RevenueDetail cashSalesAmount(Double cashSalesAmount) {
    this.cashSalesAmount = cashSalesAmount;
    return this;
  }

   /**
   * Cash sales amount
   * @return cashSalesAmount
  **/
  @ApiModelProperty(value = "Cash sales amount")
  public Double getCashSalesAmount() {
    return cashSalesAmount;
  }

  public void setCashSalesAmount(Double cashSalesAmount) {
    this.cashSalesAmount = cashSalesAmount;
  }

  public RevenueDetail cashSalesTax(Double cashSalesTax) {
    this.cashSalesTax = cashSalesTax;
    return this;
  }

   /**
   * Cash sales tax
   * @return cashSalesTax
  **/
  @ApiModelProperty(value = "Cash sales tax")
  public Double getCashSalesTax() {
    return cashSalesTax;
  }

  public void setCashSalesTax(Double cashSalesTax) {
    this.cashSalesTax = cashSalesTax;
  }

  public RevenueDetail cashSalesIncludingTax(Double cashSalesIncludingTax) {
    this.cashSalesIncludingTax = cashSalesIncludingTax;
    return this;
  }

   /**
   * Cash sales amount plus online sales tax
   * @return cashSalesIncludingTax
  **/
  @ApiModelProperty(value = "Cash sales amount plus online sales tax")
  public Double getCashSalesIncludingTax() {
    return cashSalesIncludingTax;
  }

  public void setCashSalesIncludingTax(Double cashSalesIncludingTax) {
    this.cashSalesIncludingTax = cashSalesIncludingTax;
  }

  public RevenueDetail cashSalesFeesBaseAmount(Double cashSalesFeesBaseAmount) {
    this.cashSalesFeesBaseAmount = cashSalesFeesBaseAmount;
    return this;
  }

   /**
   * Online sales base amount to calculate fees
   * @return cashSalesFeesBaseAmount
  **/
  @ApiModelProperty(value = "Online sales base amount to calculate fees")
  public Double getCashSalesFeesBaseAmount() {
    return cashSalesFeesBaseAmount;
  }

  public void setCashSalesFeesBaseAmount(Double cashSalesFeesBaseAmount) {
    this.cashSalesFeesBaseAmount = cashSalesFeesBaseAmount;
  }

  public RevenueDetail totalSalesIncludingTax(Double totalSalesIncludingTax) {
    this.totalSalesIncludingTax = totalSalesIncludingTax;
    return this;
  }

   /**
   * Total Sales (online and cash) including tax
   * @return totalSalesIncludingTax
  **/
  @ApiModelProperty(value = "Total Sales (online and cash) including tax")
  public Double getTotalSalesIncludingTax() {
    return totalSalesIncludingTax;
  }

  public void setTotalSalesIncludingTax(Double totalSalesIncludingTax) {
    this.totalSalesIncludingTax = totalSalesIncludingTax;
  }

  public RevenueDetail onlineSalesDeliveryCharges(Double onlineSalesDeliveryCharges) {
    this.onlineSalesDeliveryCharges = onlineSalesDeliveryCharges;
    return this;
  }

   /**
   * Delivery charges on online sales
   * @return onlineSalesDeliveryCharges
  **/
  @ApiModelProperty(value = "Delivery charges on online sales")
  public Double getOnlineSalesDeliveryCharges() {
    return onlineSalesDeliveryCharges;
  }

  public void setOnlineSalesDeliveryCharges(Double onlineSalesDeliveryCharges) {
    this.onlineSalesDeliveryCharges = onlineSalesDeliveryCharges;
  }

  public RevenueDetail onlineSalesTips(Double onlineSalesTips) {
    this.onlineSalesTips = onlineSalesTips;
    return this;
  }

   /**
   * Tips for online sales
   * @return onlineSalesTips
  **/
  @ApiModelProperty(value = "Tips for online sales")
  public Double getOnlineSalesTips() {
    return onlineSalesTips;
  }

  public void setOnlineSalesTips(Double onlineSalesTips) {
    this.onlineSalesTips = onlineSalesTips;
  }

  public RevenueDetail totalOnlineRevenue(Double totalOnlineRevenue) {
    this.totalOnlineRevenue = totalOnlineRevenue;
    return this;
  }

   /**
   * Online sales plus online delivery charges and tips
   * @return totalOnlineRevenue
  **/
  @ApiModelProperty(value = "Online sales plus online delivery charges and tips")
  public Double getTotalOnlineRevenue() {
    return totalOnlineRevenue;
  }

  public void setTotalOnlineRevenue(Double totalOnlineRevenue) {
    this.totalOnlineRevenue = totalOnlineRevenue;
  }

  public RevenueDetail onlineSalesServiceCharges(Double onlineSalesServiceCharges) {
    this.onlineSalesServiceCharges = onlineSalesServiceCharges;
    return this;
  }

   /**
   * Service charge on online sales
   * @return onlineSalesServiceCharges
  **/
  @ApiModelProperty(value = "Service charge on online sales")
  public Double getOnlineSalesServiceCharges() {
    return onlineSalesServiceCharges;
  }

  public void setOnlineSalesServiceCharges(Double onlineSalesServiceCharges) {
    this.onlineSalesServiceCharges = onlineSalesServiceCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueDetail revenueDetail = (RevenueDetail) o;
    return Objects.equals(this.onlineSalesAmount, revenueDetail.onlineSalesAmount) &&
        Objects.equals(this.onlineSalesTax, revenueDetail.onlineSalesTax) &&
        Objects.equals(this.onlineSalesIncludingTax, revenueDetail.onlineSalesIncludingTax) &&
        Objects.equals(this.onlineSalesFeesBaseAmount, revenueDetail.onlineSalesFeesBaseAmount) &&
        Objects.equals(this.cashSalesAmount, revenueDetail.cashSalesAmount) &&
        Objects.equals(this.cashSalesTax, revenueDetail.cashSalesTax) &&
        Objects.equals(this.cashSalesIncludingTax, revenueDetail.cashSalesIncludingTax) &&
        Objects.equals(this.cashSalesFeesBaseAmount, revenueDetail.cashSalesFeesBaseAmount) &&
        Objects.equals(this.totalSalesIncludingTax, revenueDetail.totalSalesIncludingTax) &&
        Objects.equals(this.onlineSalesDeliveryCharges, revenueDetail.onlineSalesDeliveryCharges) &&
        Objects.equals(this.onlineSalesTips, revenueDetail.onlineSalesTips) &&
        Objects.equals(this.totalOnlineRevenue, revenueDetail.totalOnlineRevenue) &&
        Objects.equals(this.onlineSalesServiceCharges, revenueDetail.onlineSalesServiceCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineSalesAmount, onlineSalesTax, onlineSalesIncludingTax, onlineSalesFeesBaseAmount, cashSalesAmount, cashSalesTax, cashSalesIncludingTax, cashSalesFeesBaseAmount, totalSalesIncludingTax, onlineSalesDeliveryCharges, onlineSalesTips, totalOnlineRevenue, onlineSalesServiceCharges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueDetail {\n");
    
    sb.append("    onlineSalesAmount: ").append(toIndentedString(onlineSalesAmount)).append("\n");
    sb.append("    onlineSalesTax: ").append(toIndentedString(onlineSalesTax)).append("\n");
    sb.append("    onlineSalesIncludingTax: ").append(toIndentedString(onlineSalesIncludingTax)).append("\n");
    sb.append("    onlineSalesFeesBaseAmount: ").append(toIndentedString(onlineSalesFeesBaseAmount)).append("\n");
    sb.append("    cashSalesAmount: ").append(toIndentedString(cashSalesAmount)).append("\n");
    sb.append("    cashSalesTax: ").append(toIndentedString(cashSalesTax)).append("\n");
    sb.append("    cashSalesIncludingTax: ").append(toIndentedString(cashSalesIncludingTax)).append("\n");
    sb.append("    cashSalesFeesBaseAmount: ").append(toIndentedString(cashSalesFeesBaseAmount)).append("\n");
    sb.append("    totalSalesIncludingTax: ").append(toIndentedString(totalSalesIncludingTax)).append("\n");
    sb.append("    onlineSalesDeliveryCharges: ").append(toIndentedString(onlineSalesDeliveryCharges)).append("\n");
    sb.append("    onlineSalesTips: ").append(toIndentedString(onlineSalesTips)).append("\n");
    sb.append("    totalOnlineRevenue: ").append(toIndentedString(totalOnlineRevenue)).append("\n");
    sb.append("    onlineSalesServiceCharges: ").append(toIndentedString(onlineSalesServiceCharges)).append("\n");
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

