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
 * Chargebacks breakdown
 */
@ApiModel(description = "Chargebacks breakdown")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-21T12:02:55.792+01:00")
public class ChargebackDetails {
  @SerializedName("ChargebackAmount")
  private Double chargebackAmount = null;

  @SerializedName("ChargebackRefundedFees")
  private Double chargebackRefundedFees = null;

  @SerializedName("ChargebacksCount")
  private Integer chargebacksCount = null;

  @SerializedName("TotalChargebackCost")
  private Double totalChargebackCost = null;

  public ChargebackDetails chargebackAmount(Double chargebackAmount) {
    this.chargebackAmount = chargebackAmount;
    return this;
  }

   /**
   * Chargeback amount
   * @return chargebackAmount
  **/
  @ApiModelProperty(value = "Chargeback amount")
  public Double getChargebackAmount() {
    return chargebackAmount;
  }

  public void setChargebackAmount(Double chargebackAmount) {
    this.chargebackAmount = chargebackAmount;
  }

  public ChargebackDetails chargebackRefundedFees(Double chargebackRefundedFees) {
    this.chargebackRefundedFees = chargebackRefundedFees;
    return this;
  }

   /**
   * Chargeback refunded feeds
   * @return chargebackRefundedFees
  **/
  @ApiModelProperty(value = "Chargeback refunded feeds")
  public Double getChargebackRefundedFees() {
    return chargebackRefundedFees;
  }

  public void setChargebackRefundedFees(Double chargebackRefundedFees) {
    this.chargebackRefundedFees = chargebackRefundedFees;
  }

  public ChargebackDetails chargebacksCount(Integer chargebacksCount) {
    this.chargebacksCount = chargebacksCount;
    return this;
  }

   /**
   * Number of chargebacks
   * @return chargebacksCount
  **/
  @ApiModelProperty(value = "Number of chargebacks")
  public Integer getChargebacksCount() {
    return chargebacksCount;
  }

  public void setChargebacksCount(Integer chargebacksCount) {
    this.chargebacksCount = chargebacksCount;
  }

  public ChargebackDetails totalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
    return this;
  }

   /**
   * Total amount
   * @return totalChargebackCost
  **/
  @ApiModelProperty(value = "Total amount")
  public Double getTotalChargebackCost() {
    return totalChargebackCost;
  }

  public void setTotalChargebackCost(Double totalChargebackCost) {
    this.totalChargebackCost = totalChargebackCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackDetails chargebackDetails = (ChargebackDetails) o;
    return Objects.equals(this.chargebackAmount, chargebackDetails.chargebackAmount) &&
        Objects.equals(this.chargebackRefundedFees, chargebackDetails.chargebackRefundedFees) &&
        Objects.equals(this.chargebacksCount, chargebackDetails.chargebacksCount) &&
        Objects.equals(this.totalChargebackCost, chargebackDetails.totalChargebackCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackAmount, chargebackRefundedFees, chargebacksCount, totalChargebackCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackDetails {\n");
    
    sb.append("    chargebackAmount: ").append(toIndentedString(chargebackAmount)).append("\n");
    sb.append("    chargebackRefundedFees: ").append(toIndentedString(chargebackRefundedFees)).append("\n");
    sb.append("    chargebacksCount: ").append(toIndentedString(chargebacksCount)).append("\n");
    sb.append("    totalChargebackCost: ").append(toIndentedString(totalChargebackCost)).append("\n");
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

