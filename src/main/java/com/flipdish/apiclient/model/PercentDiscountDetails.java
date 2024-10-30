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
 * Percent discount details
 */
@ApiModel(description = "Percent discount details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-30T09:32:52.002Z")
public class PercentDiscountDetails {
  @SerializedName("PercentageDiscount")
  private Integer percentageDiscount = null;

  @SerializedName("MaxDiscountAmount")
  private Double maxDiscountAmount = null;

  public PercentDiscountDetails percentageDiscount(Integer percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
    return this;
  }

   /**
   * Percentage discount
   * @return percentageDiscount
  **/
  @ApiModelProperty(value = "Percentage discount")
  public Integer getPercentageDiscount() {
    return percentageDiscount;
  }

  public void setPercentageDiscount(Integer percentageDiscount) {
    this.percentageDiscount = percentageDiscount;
  }

  public PercentDiscountDetails maxDiscountAmount(Double maxDiscountAmount) {
    this.maxDiscountAmount = maxDiscountAmount;
    return this;
  }

   /**
   * The maximum amount that the percentage discount value can be.  If not set then there is no maximum.  If set to e.g. 20 euro, and the percentage discount is 25%, and the order total is 100 euro, then the discount will be 20 euro (not 25 euro).
   * @return maxDiscountAmount
  **/
  @ApiModelProperty(value = "The maximum amount that the percentage discount value can be.  If not set then there is no maximum.  If set to e.g. 20 euro, and the percentage discount is 25%, and the order total is 100 euro, then the discount will be 20 euro (not 25 euro).")
  public Double getMaxDiscountAmount() {
    return maxDiscountAmount;
  }

  public void setMaxDiscountAmount(Double maxDiscountAmount) {
    this.maxDiscountAmount = maxDiscountAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercentDiscountDetails percentDiscountDetails = (PercentDiscountDetails) o;
    return Objects.equals(this.percentageDiscount, percentDiscountDetails.percentageDiscount) &&
        Objects.equals(this.maxDiscountAmount, percentDiscountDetails.maxDiscountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageDiscount, maxDiscountAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercentDiscountDetails {\n");
    
    sb.append("    percentageDiscount: ").append(toIndentedString(percentageDiscount)).append("\n");
    sb.append("    maxDiscountAmount: ").append(toIndentedString(maxDiscountAmount)).append("\n");
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

