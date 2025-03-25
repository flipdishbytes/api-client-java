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
 * PreviousOrderItemOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-25T09:00:30.301Z")
public class PreviousOrderItemOption {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("DepositReturnFee")
  private Double depositReturnFee = null;

  public PreviousOrderItemOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PreviousOrderItemOption depositReturnFee(Double depositReturnFee) {
    this.depositReturnFee = depositReturnFee;
    return this;
  }

   /**
   * Get depositReturnFee
   * @return depositReturnFee
  **/
  @ApiModelProperty(value = "")
  public Double getDepositReturnFee() {
    return depositReturnFee;
  }

  public void setDepositReturnFee(Double depositReturnFee) {
    this.depositReturnFee = depositReturnFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousOrderItemOption previousOrderItemOption = (PreviousOrderItemOption) o;
    return Objects.equals(this.name, previousOrderItemOption.name) &&
        Objects.equals(this.depositReturnFee, previousOrderItemOption.depositReturnFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, depositReturnFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousOrderItemOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    depositReturnFee: ").append(toIndentedString(depositReturnFee)).append("\n");
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

