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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-06T10:26:07.205+01:00")
public class PercentDiscountDetails {
  @SerializedName("PercentageDiscount")
  private Integer percentageDiscount = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PercentDiscountDetails percentDiscountDetails = (PercentDiscountDetails) o;
    return Objects.equals(this.percentageDiscount, percentDiscountDetails.percentageDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageDiscount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PercentDiscountDetails {\n");
    
    sb.append("    percentageDiscount: ").append(toIndentedString(percentageDiscount)).append("\n");
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

