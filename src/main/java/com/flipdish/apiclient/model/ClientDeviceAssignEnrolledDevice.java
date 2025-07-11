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
 * Assign enrolled device to AppId
 */
@ApiModel(description = "Assign enrolled device to AppId")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class ClientDeviceAssignEnrolledDevice {
  @SerializedName("DeviceModel")
  private String deviceModel = null;

  @SerializedName("PinCode")
  private String pinCode = null;

  public ClientDeviceAssignEnrolledDevice deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Device Model
   * @return deviceModel
  **/
  @ApiModelProperty(value = "Device Model")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ClientDeviceAssignEnrolledDevice pinCode(String pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * Pin Code
   * @return pinCode
  **/
  @ApiModelProperty(value = "Pin Code")
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
    ClientDeviceAssignEnrolledDevice clientDeviceAssignEnrolledDevice = (ClientDeviceAssignEnrolledDevice) o;
    return Objects.equals(this.deviceModel, clientDeviceAssignEnrolledDevice.deviceModel) &&
        Objects.equals(this.pinCode, clientDeviceAssignEnrolledDevice.pinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceModel, pinCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDeviceAssignEnrolledDevice {\n");
    
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
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

