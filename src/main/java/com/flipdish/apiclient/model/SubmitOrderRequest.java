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
 * SubmitOrderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-27T13:36:47.136Z")
public class SubmitOrderRequest {
  @SerializedName("PaymentToken")
  private String paymentToken = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("ChefNote")
  private String chefNote = null;

  public SubmitOrderRequest paymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @ApiModelProperty(value = "")
  public String getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }

  public SubmitOrderRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public SubmitOrderRequest chefNote(String chefNote) {
    this.chefNote = chefNote;
    return this;
  }

   /**
   * Get chefNote
   * @return chefNote
  **/
  @ApiModelProperty(value = "")
  public String getChefNote() {
    return chefNote;
  }

  public void setChefNote(String chefNote) {
    this.chefNote = chefNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitOrderRequest submitOrderRequest = (SubmitOrderRequest) o;
    return Objects.equals(this.paymentToken, submitOrderRequest.paymentToken) &&
        Objects.equals(this.phoneNumber, submitOrderRequest.phoneNumber) &&
        Objects.equals(this.chefNote, submitOrderRequest.chefNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, phoneNumber, chefNote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitOrderRequest {\n");
    
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    chefNote: ").append(toIndentedString(chefNote)).append("\n");
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

