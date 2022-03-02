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
 * Request login PIN response
 */
@ApiModel(description = "Request login PIN response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T12:21:08.098Z")
public class RequestLoginPinResposne {
  @SerializedName("LoginPinSentViaEmail")
  private Boolean loginPinSentViaEmail = null;

  public RequestLoginPinResposne loginPinSentViaEmail(Boolean loginPinSentViaEmail) {
    this.loginPinSentViaEmail = loginPinSentViaEmail;
    return this;
  }

   /**
   * Login PIN sent via email to user
   * @return loginPinSentViaEmail
  **/
  @ApiModelProperty(value = "Login PIN sent via email to user")
  public Boolean isLoginPinSentViaEmail() {
    return loginPinSentViaEmail;
  }

  public void setLoginPinSentViaEmail(Boolean loginPinSentViaEmail) {
    this.loginPinSentViaEmail = loginPinSentViaEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestLoginPinResposne requestLoginPinResposne = (RequestLoginPinResposne) o;
    return Objects.equals(this.loginPinSentViaEmail, requestLoginPinResposne.loginPinSentViaEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginPinSentViaEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestLoginPinResposne {\n");
    
    sb.append("    loginPinSentViaEmail: ").append(toIndentedString(loginPinSentViaEmail)).append("\n");
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

