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
 * Request Password Reset PIN response
 */
@ApiModel(description = "Request Password Reset PIN response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-23T10:58:00.815Z")
public class RequestPasswordResetPinResponse {
  @SerializedName("PasswordResetPinSentViaEmail")
  private Boolean passwordResetPinSentViaEmail = null;

  public RequestPasswordResetPinResponse passwordResetPinSentViaEmail(Boolean passwordResetPinSentViaEmail) {
    this.passwordResetPinSentViaEmail = passwordResetPinSentViaEmail;
    return this;
  }

   /**
   * Password Reset PIN sent via email to user
   * @return passwordResetPinSentViaEmail
  **/
  @ApiModelProperty(value = "Password Reset PIN sent via email to user")
  public Boolean isPasswordResetPinSentViaEmail() {
    return passwordResetPinSentViaEmail;
  }

  public void setPasswordResetPinSentViaEmail(Boolean passwordResetPinSentViaEmail) {
    this.passwordResetPinSentViaEmail = passwordResetPinSentViaEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPasswordResetPinResponse requestPasswordResetPinResponse = (RequestPasswordResetPinResponse) o;
    return Objects.equals(this.passwordResetPinSentViaEmail, requestPasswordResetPinResponse.passwordResetPinSentViaEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordResetPinSentViaEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPasswordResetPinResponse {\n");
    
    sb.append("    passwordResetPinSentViaEmail: ").append(toIndentedString(passwordResetPinSentViaEmail)).append("\n");
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

