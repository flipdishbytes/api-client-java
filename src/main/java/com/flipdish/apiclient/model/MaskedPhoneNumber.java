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
 * Represents a masked phone number
 */
@ApiModel(description = "Represents a masked phone number")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T12:13:53.469Z")
public class MaskedPhoneNumber {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("Code")
  private String code = null;

  public MaskedPhoneNumber isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Defines if the feature is enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Defines if the feature is enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public MaskedPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Defines the phone number to call
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Defines the phone number to call")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public MaskedPhoneNumber code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Defines the code to enter
   * @return code
  **/
  @ApiModelProperty(value = "Defines the code to enter")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskedPhoneNumber maskedPhoneNumber = (MaskedPhoneNumber) o;
    return Objects.equals(this.isEnabled, maskedPhoneNumber.isEnabled) &&
        Objects.equals(this.phoneNumber, maskedPhoneNumber.phoneNumber) &&
        Objects.equals(this.code, maskedPhoneNumber.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, phoneNumber, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedPhoneNumber {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

