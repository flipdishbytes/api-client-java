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
 * Enroll a client device
 */
@ApiModel(description = "Enroll a client device")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:42:52.258Z")
public class ClientDeviceEnroll {
  @SerializedName("DeviceModel")
  private String deviceModel = null;

  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("DeviceName")
  private String deviceName = null;

  public ClientDeviceEnroll deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Device model
   * @return deviceModel
  **/
  @ApiModelProperty(value = "Device model")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ClientDeviceEnroll deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device Id
   * @return deviceId
  **/
  @ApiModelProperty(value = "Device Id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ClientDeviceEnroll deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Device Name
   * @return deviceName
  **/
  @ApiModelProperty(value = "Device Name")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDeviceEnroll clientDeviceEnroll = (ClientDeviceEnroll) o;
    return Objects.equals(this.deviceModel, clientDeviceEnroll.deviceModel) &&
        Objects.equals(this.deviceId, clientDeviceEnroll.deviceId) &&
        Objects.equals(this.deviceName, clientDeviceEnroll.deviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceModel, deviceId, deviceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDeviceEnroll {\n");
    
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
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

