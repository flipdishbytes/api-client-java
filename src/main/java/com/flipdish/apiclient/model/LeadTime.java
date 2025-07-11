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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class LeadTime {
  @SerializedName("DispatchType")
  private String dispatchType = null;

  @SerializedName("LeadTimeMinutes")
  private Integer leadTimeMinutes = null;

  public LeadTime dispatchType(String dispatchType) {
    this.dispatchType = dispatchType;
    return this;
  }

   /**
   * There are two valid values for this field - &#x60;collection&#x60; and &#x60;delivery&#x60;.
   * @return dispatchType
  **/
  @ApiModelProperty(required = true, value = "There are two valid values for this field - `collection` and `delivery`.")
  public String getDispatchType() {
    return dispatchType;
  }

  public void setDispatchType(String dispatchType) {
    this.dispatchType = dispatchType;
  }

  public LeadTime leadTimeMinutes(Integer leadTimeMinutes) {
    this.leadTimeMinutes = leadTimeMinutes;
    return this;
  }

   /**
   * This must be a positive integer.
   * @return leadTimeMinutes
  **/
  @ApiModelProperty(required = true, value = "This must be a positive integer.")
  public Integer getLeadTimeMinutes() {
    return leadTimeMinutes;
  }

  public void setLeadTimeMinutes(Integer leadTimeMinutes) {
    this.leadTimeMinutes = leadTimeMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadTime leadTime = (LeadTime) o;
    return Objects.equals(this.dispatchType, leadTime.dispatchType) &&
        Objects.equals(this.leadTimeMinutes, leadTime.leadTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchType, leadTimeMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadTime {\n");
    
    sb.append("    dispatchType: ").append(toIndentedString(dispatchType)).append("\n");
    sb.append("    leadTimeMinutes: ").append(toIndentedString(leadTimeMinutes)).append("\n");
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

