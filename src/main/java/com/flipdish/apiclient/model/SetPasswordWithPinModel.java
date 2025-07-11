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
 * Set password with PIN model
 */
@ApiModel(description = "Set password with PIN model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class SetPasswordWithPinModel {
  @SerializedName("Pin")
  private Integer pin = null;

  @SerializedName("NewPassword")
  private String newPassword = null;

  @SerializedName("RecaptchaToken")
  private String recaptchaToken = null;

  public SetPasswordWithPinModel pin(Integer pin) {
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

  public SetPasswordWithPinModel newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * New Password
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "New Password")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public SetPasswordWithPinModel recaptchaToken(String recaptchaToken) {
    this.recaptchaToken = recaptchaToken;
    return this;
  }

   /**
   * Google Recaptcha Token
   * @return recaptchaToken
  **/
  @ApiModelProperty(value = "Google Recaptcha Token")
  public String getRecaptchaToken() {
    return recaptchaToken;
  }

  public void setRecaptchaToken(String recaptchaToken) {
    this.recaptchaToken = recaptchaToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPasswordWithPinModel setPasswordWithPinModel = (SetPasswordWithPinModel) o;
    return Objects.equals(this.pin, setPasswordWithPinModel.pin) &&
        Objects.equals(this.newPassword, setPasswordWithPinModel.newPassword) &&
        Objects.equals(this.recaptchaToken, setPasswordWithPinModel.recaptchaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin, newPassword, recaptchaToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPasswordWithPinModel {\n");
    
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    recaptchaToken: ").append(toIndentedString(recaptchaToken)).append("\n");
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

