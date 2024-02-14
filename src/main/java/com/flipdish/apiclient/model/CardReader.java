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
import com.flipdish.apiclient.model.ReaderActionStateInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Card reader
 */
@ApiModel(description = "Card reader")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-14T11:06:08.488Z")
public class CardReader {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("DeviceSoftwareVersion")
  private String deviceSoftwareVersion = null;

  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("RegistrationCode")
  private String registrationCode = null;

  @SerializedName("DeviceType")
  private String deviceType = null;

  @SerializedName("Deleted")
  private Boolean deleted = null;

  @SerializedName("Action")
  private ReaderActionStateInfo action = null;

  public CardReader id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Stripe reader id
   * @return id
  **/
  @ApiModelProperty(value = "Stripe reader id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CardReader deviceSoftwareVersion(String deviceSoftwareVersion) {
    this.deviceSoftwareVersion = deviceSoftwareVersion;
    return this;
  }

   /**
   * Software version
   * @return deviceSoftwareVersion
  **/
  @ApiModelProperty(value = "Software version")
  public String getDeviceSoftwareVersion() {
    return deviceSoftwareVersion;
  }

  public void setDeviceSoftwareVersion(String deviceSoftwareVersion) {
    this.deviceSoftwareVersion = deviceSoftwareVersion;
  }

  public CardReader serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Device serial number
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Device serial number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CardReader status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Device status online or offline
   * @return status
  **/
  @ApiModelProperty(value = "Device status online or offline")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CardReader registrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
    return this;
  }

   /**
   * Registration code
   * @return registrationCode
  **/
  @ApiModelProperty(value = "Registration code")
  public String getRegistrationCode() {
    return registrationCode;
  }

  public void setRegistrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
  }

  public CardReader deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Device type
   * @return deviceType
  **/
  @ApiModelProperty(value = "Device type")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public CardReader deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Indicates that the reader is deleted or not
   * @return deleted
  **/
  @ApiModelProperty(value = "Indicates that the reader is deleted or not")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public CardReader action(ReaderActionStateInfo action) {
    this.action = action;
    return this;
  }

   /**
   * Action status
   * @return action
  **/
  @ApiModelProperty(value = "Action status")
  public ReaderActionStateInfo getAction() {
    return action;
  }

  public void setAction(ReaderActionStateInfo action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardReader cardReader = (CardReader) o;
    return Objects.equals(this.id, cardReader.id) &&
        Objects.equals(this.deviceSoftwareVersion, cardReader.deviceSoftwareVersion) &&
        Objects.equals(this.serialNumber, cardReader.serialNumber) &&
        Objects.equals(this.status, cardReader.status) &&
        Objects.equals(this.registrationCode, cardReader.registrationCode) &&
        Objects.equals(this.deviceType, cardReader.deviceType) &&
        Objects.equals(this.deleted, cardReader.deleted) &&
        Objects.equals(this.action, cardReader.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deviceSoftwareVersion, serialNumber, status, registrationCode, deviceType, deleted, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardReader {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceSoftwareVersion: ").append(toIndentedString(deviceSoftwareVersion)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registrationCode: ").append(toIndentedString(registrationCode)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

