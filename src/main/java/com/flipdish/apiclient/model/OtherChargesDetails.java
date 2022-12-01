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
 * Breakdown of other charges
 */
@ApiModel(description = "Breakdown of other charges")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-01T13:41:14.796Z")
public class OtherChargesDetails {
  @SerializedName("TotalOtherCharges")
  private Double totalOtherCharges = null;

  @SerializedName("ChargesCount")
  private Integer chargesCount = null;

  public OtherChargesDetails totalOtherCharges(Double totalOtherCharges) {
    this.totalOtherCharges = totalOtherCharges;
    return this;
  }

   /**
   * Total amount of other charges
   * @return totalOtherCharges
  **/
  @ApiModelProperty(value = "Total amount of other charges")
  public Double getTotalOtherCharges() {
    return totalOtherCharges;
  }

  public void setTotalOtherCharges(Double totalOtherCharges) {
    this.totalOtherCharges = totalOtherCharges;
  }

  public OtherChargesDetails chargesCount(Integer chargesCount) {
    this.chargesCount = chargesCount;
    return this;
  }

   /**
   * Number of other charges
   * @return chargesCount
  **/
  @ApiModelProperty(value = "Number of other charges")
  public Integer getChargesCount() {
    return chargesCount;
  }

  public void setChargesCount(Integer chargesCount) {
    this.chargesCount = chargesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherChargesDetails otherChargesDetails = (OtherChargesDetails) o;
    return Objects.equals(this.totalOtherCharges, otherChargesDetails.totalOtherCharges) &&
        Objects.equals(this.chargesCount, otherChargesDetails.chargesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOtherCharges, chargesCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherChargesDetails {\n");
    
    sb.append("    totalOtherCharges: ").append(toIndentedString(totalOtherCharges)).append("\n");
    sb.append("    chargesCount: ").append(toIndentedString(chargesCount)).append("\n");
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

