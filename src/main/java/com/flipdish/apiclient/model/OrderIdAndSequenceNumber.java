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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-04T14:54:54.478+01:00")
public class OrderIdAndSequenceNumber {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("Sequence")
  private Integer sequence = null;

  public OrderIdAndSequenceNumber orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order identifier
   * @return orderId
  **/
  @ApiModelProperty(value = "Order identifier")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderIdAndSequenceNumber sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Sequence for delivery
   * @return sequence
  **/
  @ApiModelProperty(value = "Sequence for delivery")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIdAndSequenceNumber orderIdAndSequenceNumber = (OrderIdAndSequenceNumber) o;
    return Objects.equals(this.orderId, orderIdAndSequenceNumber.orderId) &&
        Objects.equals(this.sequence, orderIdAndSequenceNumber.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, sequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIdAndSequenceNumber {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

