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
 * Refund
 */
@ApiModel(description = "Refund")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T11:34:10.106Z")
public class Refund {
  @SerializedName("RefundReason")
  private String refundReason = null;

  @SerializedName("RefundAmount")
  private Double refundAmount = null;

  @SerializedName("NotifyCustomer")
  private Boolean notifyCustomer = null;

  public Refund refundReason(String refundReason) {
    this.refundReason = refundReason;
    return this;
  }

   /**
   * Refund reason
   * @return refundReason
  **/
  @ApiModelProperty(value = "Refund reason")
  public String getRefundReason() {
    return refundReason;
  }

  public void setRefundReason(String refundReason) {
    this.refundReason = refundReason;
  }

  public Refund refundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Refund amount
   * minimum: 0
   * @return refundAmount
  **/
  @ApiModelProperty(required = true, value = "Refund amount")
  public Double getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
  }

  public Refund notifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
    return this;
  }

   /**
   * If true, the system sends notification to the customer about the refund
   * @return notifyCustomer
  **/
  @ApiModelProperty(required = true, value = "If true, the system sends notification to the customer about the refund")
  public Boolean isNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refund refund = (Refund) o;
    return Objects.equals(this.refundReason, refund.refundReason) &&
        Objects.equals(this.refundAmount, refund.refundAmount) &&
        Objects.equals(this.notifyCustomer, refund.notifyCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundReason, refundAmount, notifyCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    
    sb.append("    refundReason: ").append(toIndentedString(refundReason)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    notifyCustomer: ").append(toIndentedString(notifyCustomer)).append("\n");
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

