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
 * Accept
 */
@ApiModel(description = "Accept")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-02T09:41:57.654Z")
public class Accept {
  @SerializedName("EstimatedMinutesForDelivery")
  private Integer estimatedMinutesForDelivery = null;

  public Accept estimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
    return this;
  }

   /**
   * Estimated minutes for delivery
   * minimum: 0
   * maximum: 200
   * @return estimatedMinutesForDelivery
  **/
  @ApiModelProperty(value = "Estimated minutes for delivery")
  public Integer getEstimatedMinutesForDelivery() {
    return estimatedMinutesForDelivery;
  }

  public void setEstimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accept accept = (Accept) o;
    return Objects.equals(this.estimatedMinutesForDelivery, accept.estimatedMinutesForDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedMinutesForDelivery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accept {\n");
    
    sb.append("    estimatedMinutesForDelivery: ").append(toIndentedString(estimatedMinutesForDelivery)).append("\n");
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

