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
 * Campaign statistics
 */
@ApiModel(description = "Campaign statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-12T15:58:55.291Z")
public class CampaignStatistics {
  @SerializedName("VouchersIssued")
  private Integer vouchersIssued = null;

  @SerializedName("VouchersRedeemed")
  private Integer vouchersRedeemed = null;

  @SerializedName("Conversion")
  private Double conversion = null;

  @SerializedName("SalesGenerated")
  private Double salesGenerated = null;

  @SerializedName("ReturnOfInvestment")
  private Double returnOfInvestment = null;

  public CampaignStatistics vouchersIssued(Integer vouchersIssued) {
    this.vouchersIssued = vouchersIssued;
    return this;
  }

   /**
   * Deprecated. Number of issued vouchers.  This field is always zero.
   * @return vouchersIssued
  **/
  @ApiModelProperty(value = "Deprecated. Number of issued vouchers.  This field is always zero.")
  public Integer getVouchersIssued() {
    return vouchersIssued;
  }

  public void setVouchersIssued(Integer vouchersIssued) {
    this.vouchersIssued = vouchersIssued;
  }

  public CampaignStatistics vouchersRedeemed(Integer vouchersRedeemed) {
    this.vouchersRedeemed = vouchersRedeemed;
    return this;
  }

   /**
   * Deprecated. Number of redeemed vouchers. This field is always zero.  This field is always zero.
   * @return vouchersRedeemed
  **/
  @ApiModelProperty(value = "Deprecated. Number of redeemed vouchers. This field is always zero.  This field is always zero.")
  public Integer getVouchersRedeemed() {
    return vouchersRedeemed;
  }

  public void setVouchersRedeemed(Integer vouchersRedeemed) {
    this.vouchersRedeemed = vouchersRedeemed;
  }

  public CampaignStatistics conversion(Double conversion) {
    this.conversion = conversion;
    return this;
  }

   /**
   * Deprecated. Conversion of campaign (VouchersIssued / VouchersRedeemed).  This field is always zero.
   * @return conversion
  **/
  @ApiModelProperty(value = "Deprecated. Conversion of campaign (VouchersIssued / VouchersRedeemed).  This field is always zero.")
  public Double getConversion() {
    return conversion;
  }

  public void setConversion(Double conversion) {
    this.conversion = conversion;
  }

  public CampaignStatistics salesGenerated(Double salesGenerated) {
    this.salesGenerated = salesGenerated;
    return this;
  }

   /**
   * Deprecated.  Sales generated by campaign (TotalAmount - FeeChargedToCustomer ie. the discounted sale value).  This field is always zero.
   * @return salesGenerated
  **/
  @ApiModelProperty(value = "Deprecated.  Sales generated by campaign (TotalAmount - FeeChargedToCustomer ie. the discounted sale value).  This field is always zero.")
  public Double getSalesGenerated() {
    return salesGenerated;
  }

  public void setSalesGenerated(Double salesGenerated) {
    this.salesGenerated = salesGenerated;
  }

  public CampaignStatistics returnOfInvestment(Double returnOfInvestment) {
    this.returnOfInvestment = returnOfInvestment;
    return this;
  }

   /**
   * Deprecated.  Return of investment of campaign (TotalAmount / DiscountAmount).  This field is always zero.
   * @return returnOfInvestment
  **/
  @ApiModelProperty(value = "Deprecated.  Return of investment of campaign (TotalAmount / DiscountAmount).  This field is always zero.")
  public Double getReturnOfInvestment() {
    return returnOfInvestment;
  }

  public void setReturnOfInvestment(Double returnOfInvestment) {
    this.returnOfInvestment = returnOfInvestment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignStatistics campaignStatistics = (CampaignStatistics) o;
    return Objects.equals(this.vouchersIssued, campaignStatistics.vouchersIssued) &&
        Objects.equals(this.vouchersRedeemed, campaignStatistics.vouchersRedeemed) &&
        Objects.equals(this.conversion, campaignStatistics.conversion) &&
        Objects.equals(this.salesGenerated, campaignStatistics.salesGenerated) &&
        Objects.equals(this.returnOfInvestment, campaignStatistics.returnOfInvestment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vouchersIssued, vouchersRedeemed, conversion, salesGenerated, returnOfInvestment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignStatistics {\n");
    
    sb.append("    vouchersIssued: ").append(toIndentedString(vouchersIssued)).append("\n");
    sb.append("    vouchersRedeemed: ").append(toIndentedString(vouchersRedeemed)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    salesGenerated: ").append(toIndentedString(salesGenerated)).append("\n");
    sb.append("    returnOfInvestment: ").append(toIndentedString(returnOfInvestment)).append("\n");
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

