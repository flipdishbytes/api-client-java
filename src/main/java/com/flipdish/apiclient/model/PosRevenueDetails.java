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
 * Breakdown of POS charges
 */
@ApiModel(description = "Breakdown of POS charges")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-06T12:18:31.729Z")
public class PosRevenueDetails {
  @SerializedName("PosSalesAmount")
  private Double posSalesAmount = null;

  @SerializedName("PosSalesTax")
  private Double posSalesTax = null;

  @SerializedName("PosSalesTips")
  private Double posSalesTips = null;

  @SerializedName("TotalPosRevenue")
  private Double totalPosRevenue = null;

  public PosRevenueDetails posSalesAmount(Double posSalesAmount) {
    this.posSalesAmount = posSalesAmount;
    return this;
  }

   /**
   * POS sale amount for the store
   * @return posSalesAmount
  **/
  @ApiModelProperty(value = "POS sale amount for the store")
  public Double getPosSalesAmount() {
    return posSalesAmount;
  }

  public void setPosSalesAmount(Double posSalesAmount) {
    this.posSalesAmount = posSalesAmount;
  }

  public PosRevenueDetails posSalesTax(Double posSalesTax) {
    this.posSalesTax = posSalesTax;
    return this;
  }

   /**
   * POS sale Tax for the store
   * @return posSalesTax
  **/
  @ApiModelProperty(value = "POS sale Tax for the store")
  public Double getPosSalesTax() {
    return posSalesTax;
  }

  public void setPosSalesTax(Double posSalesTax) {
    this.posSalesTax = posSalesTax;
  }

  public PosRevenueDetails posSalesTips(Double posSalesTips) {
    this.posSalesTips = posSalesTips;
    return this;
  }

   /**
   * POS sale tips for the store
   * @return posSalesTips
  **/
  @ApiModelProperty(value = "POS sale tips for the store")
  public Double getPosSalesTips() {
    return posSalesTips;
  }

  public void setPosSalesTips(Double posSalesTips) {
    this.posSalesTips = posSalesTips;
  }

  public PosRevenueDetails totalPosRevenue(Double totalPosRevenue) {
    this.totalPosRevenue = totalPosRevenue;
    return this;
  }

   /**
   * POS Total Revenue for the store
   * @return totalPosRevenue
  **/
  @ApiModelProperty(value = "POS Total Revenue for the store")
  public Double getTotalPosRevenue() {
    return totalPosRevenue;
  }

  public void setTotalPosRevenue(Double totalPosRevenue) {
    this.totalPosRevenue = totalPosRevenue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosRevenueDetails posRevenueDetails = (PosRevenueDetails) o;
    return Objects.equals(this.posSalesAmount, posRevenueDetails.posSalesAmount) &&
        Objects.equals(this.posSalesTax, posRevenueDetails.posSalesTax) &&
        Objects.equals(this.posSalesTips, posRevenueDetails.posSalesTips) &&
        Objects.equals(this.totalPosRevenue, posRevenueDetails.totalPosRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posSalesAmount, posSalesTax, posSalesTips, totalPosRevenue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosRevenueDetails {\n");
    
    sb.append("    posSalesAmount: ").append(toIndentedString(posSalesAmount)).append("\n");
    sb.append("    posSalesTax: ").append(toIndentedString(posSalesTax)).append("\n");
    sb.append("    posSalesTips: ").append(toIndentedString(posSalesTips)).append("\n");
    sb.append("    totalPosRevenue: ").append(toIndentedString(totalPosRevenue)).append("\n");
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

