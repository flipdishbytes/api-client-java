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
 * Device enrollment result
 */
@ApiModel(description = "Device enrollment result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:19:42.240Z")
public class ClientDeviceEnrollmentResult {
  @SerializedName("PinCode")
  private String pinCode = null;

  public ClientDeviceEnrollmentResult pinCode(String pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * PIN Code for assigning
   * @return pinCode
  **/
  @ApiModelProperty(value = "PIN Code for assigning")
  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDeviceEnrollmentResult clientDeviceEnrollmentResult = (ClientDeviceEnrollmentResult) o;
    return Objects.equals(this.pinCode, clientDeviceEnrollmentResult.pinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDeviceEnrollmentResult {\n");
    
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
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

