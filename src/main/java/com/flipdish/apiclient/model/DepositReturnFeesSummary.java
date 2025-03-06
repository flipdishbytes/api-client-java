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
 * DepositReturnFeesSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-06T15:29:18.975Z")
public class DepositReturnFeesSummary {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("Fee")
  private Double fee = null;

  @SerializedName("Total")
  private Double total = null;

  public DepositReturnFeesSummary count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DepositReturnFeesSummary fee(Double fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }

  public DepositReturnFeesSummary total(Double total) {
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
    DepositReturnFeesSummary depositReturnFeesSummary = (DepositReturnFeesSummary) o;
    return Objects.equals(this.count, depositReturnFeesSummary.count) &&
        Objects.equals(this.fee, depositReturnFeesSummary.fee) &&
        Objects.equals(this.total, depositReturnFeesSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, fee, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositReturnFeesSummary {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

