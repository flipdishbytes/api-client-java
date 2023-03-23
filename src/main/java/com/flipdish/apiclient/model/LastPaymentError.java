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
 * List&#39;s the issues with the last failed payment intent
 */
@ApiModel(description = "List's the issues with the last failed payment intent")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-23T12:28:13.209Z")
public class LastPaymentError {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("DeclineCode")
  private String declineCode = null;

  @SerializedName("Message")
  private String message = null;

  public LastPaymentError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * For some errors that could be handled programmatically, a short string indicating the error code reported.
   * @return code
  **/
  @ApiModelProperty(value = "For some errors that could be handled programmatically, a short string indicating the error code reported.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LastPaymentError declineCode(String declineCode) {
    this.declineCode = declineCode;
    return this;
  }

   /**
   * For card errors resulting from a card issuer decline, a short string indicating the card issuer’s reason for the decline if they provide one.
   * @return declineCode
  **/
  @ApiModelProperty(value = "For card errors resulting from a card issuer decline, a short string indicating the card issuer’s reason for the decline if they provide one.")
  public String getDeclineCode() {
    return declineCode;
  }

  public void setDeclineCode(String declineCode) {
    this.declineCode = declineCode;
  }

  public LastPaymentError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable message providing more details about the error. For card errors, these messages can be shown to your users.
   * @return message
  **/
  @ApiModelProperty(value = "A human-readable message providing more details about the error. For card errors, these messages can be shown to your users.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastPaymentError lastPaymentError = (LastPaymentError) o;
    return Objects.equals(this.code, lastPaymentError.code) &&
        Objects.equals(this.declineCode, lastPaymentError.declineCode) &&
        Objects.equals(this.message, lastPaymentError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, declineCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastPaymentError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    declineCode: ").append(toIndentedString(declineCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

