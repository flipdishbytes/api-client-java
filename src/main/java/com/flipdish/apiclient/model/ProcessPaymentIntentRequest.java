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
 * Initiate card reader Payment process request
 */
@ApiModel(description = "Initiate card reader Payment process request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class ProcessPaymentIntentRequest {
  @SerializedName("PaymentIntentId")
  private String paymentIntentId = null;

  public ProcessPaymentIntentRequest paymentIntentId(String paymentIntentId) {
    this.paymentIntentId = paymentIntentId;
    return this;
  }

   /**
   * Device card paymentIntentId
   * @return paymentIntentId
  **/
  @ApiModelProperty(required = true, value = "Device card paymentIntentId")
  public String getPaymentIntentId() {
    return paymentIntentId;
  }

  public void setPaymentIntentId(String paymentIntentId) {
    this.paymentIntentId = paymentIntentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessPaymentIntentRequest processPaymentIntentRequest = (ProcessPaymentIntentRequest) o;
    return Objects.equals(this.paymentIntentId, processPaymentIntentRequest.paymentIntentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentIntentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessPaymentIntentRequest {\n");
    
    sb.append("    paymentIntentId: ").append(toIndentedString(paymentIntentId)).append("\n");
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

