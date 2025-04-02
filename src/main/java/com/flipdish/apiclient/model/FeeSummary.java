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
 * Fee Summary
 */
@ApiModel(description = "Fee Summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T09:34:05.773Z")
public class FeeSummary {
  @SerializedName("FeeAmount")
  private Double feeAmount = null;

  @SerializedName("PercentageRate")
  private Double percentageRate = null;

  @SerializedName("PerTransactionFee")
  private Double perTransactionFee = null;

  public FeeSummary feeAmount(Double feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Fee amount
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee amount")
  public Double getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(Double feeAmount) {
    this.feeAmount = feeAmount;
  }

  public FeeSummary percentageRate(Double percentageRate) {
    this.percentageRate = percentageRate;
    return this;
  }

   /**
   * Percentage rate
   * @return percentageRate
  **/
  @ApiModelProperty(value = "Percentage rate")
  public Double getPercentageRate() {
    return percentageRate;
  }

  public void setPercentageRate(Double percentageRate) {
    this.percentageRate = percentageRate;
  }

  public FeeSummary perTransactionFee(Double perTransactionFee) {
    this.perTransactionFee = perTransactionFee;
    return this;
  }

   /**
   * Per transaction fee
   * @return perTransactionFee
  **/
  @ApiModelProperty(value = "Per transaction fee")
  public Double getPerTransactionFee() {
    return perTransactionFee;
  }

  public void setPerTransactionFee(Double perTransactionFee) {
    this.perTransactionFee = perTransactionFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeSummary feeSummary = (FeeSummary) o;
    return Objects.equals(this.feeAmount, feeSummary.feeAmount) &&
        Objects.equals(this.percentageRate, feeSummary.percentageRate) &&
        Objects.equals(this.perTransactionFee, feeSummary.perTransactionFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeAmount, percentageRate, perTransactionFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeSummary {\n");
    
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    percentageRate: ").append(toIndentedString(percentageRate)).append("\n");
    sb.append("    perTransactionFee: ").append(toIndentedString(perTransactionFee)).append("\n");
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

