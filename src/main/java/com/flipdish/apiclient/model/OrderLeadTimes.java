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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * When orders are accepted, and no lead time is specified by the operator, this is the lead time that will be  applied to the order.
 */
@ApiModel(description = "When orders are accepted, and no lead time is specified by the operator, this is the lead time that will be  applied to the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-16T14:31:56.180Z")
public class OrderLeadTimes {
  @SerializedName("LeadTimeMinutes")
  private Map<String, Integer> leadTimeMinutes = null;

  public OrderLeadTimes leadTimeMinutes(Map<String, Integer> leadTimeMinutes) {
    this.leadTimeMinutes = leadTimeMinutes;
    return this;
  }

  public OrderLeadTimes putLeadTimeMinutesItem(String key, Integer leadTimeMinutesItem) {
    if (this.leadTimeMinutes == null) {
      this.leadTimeMinutes = new HashMap<String, Integer>();
    }
    this.leadTimeMinutes.put(key, leadTimeMinutesItem);
    return this;
  }

   /**
   * Mapping from the type of order to, to the default lead time that will be applied to those orders.  The lead time is an integer number of minutes.
   * @return leadTimeMinutes
  **/
  @ApiModelProperty(value = "Mapping from the type of order to, to the default lead time that will be applied to those orders.  The lead time is an integer number of minutes.")
  public Map<String, Integer> getLeadTimeMinutes() {
    return leadTimeMinutes;
  }

  public void setLeadTimeMinutes(Map<String, Integer> leadTimeMinutes) {
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
    OrderLeadTimes orderLeadTimes = (OrderLeadTimes) o;
    return Objects.equals(this.leadTimeMinutes, orderLeadTimes.leadTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadTimeMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLeadTimes {\n");
    
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

