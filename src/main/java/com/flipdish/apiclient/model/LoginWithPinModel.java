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
 * Login with PIN model
 */
@ApiModel(description = "Login with PIN model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-24T11:23:04.718Z")
public class LoginWithPinModel {
  @SerializedName("Email")
  private String email = null;

  @SerializedName("Pin")
  private Integer pin = null;

  public LoginWithPinModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email addres
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email addres")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoginWithPinModel pin(Integer pin) {
    this.pin = pin;
    return this;
  }

   /**
   * PIN code (received via email)
   * @return pin
  **/
  @ApiModelProperty(required = true, value = "PIN code (received via email)")
  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginWithPinModel loginWithPinModel = (LoginWithPinModel) o;
    return Objects.equals(this.email, loginWithPinModel.email) &&
        Objects.equals(this.pin, loginWithPinModel.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, pin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginWithPinModel {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

