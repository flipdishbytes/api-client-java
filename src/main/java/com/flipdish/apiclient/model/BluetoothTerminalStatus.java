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
import org.threeten.bp.OffsetDateTime;

/**
 * Status of the bluetooth terminal
 */
@ApiModel(description = "Status of the bluetooth terminal")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class BluetoothTerminalStatus {
  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("SoftwareVersion")
  private String softwareVersion = null;

  /**
   * Device Type
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    CHIPPER_2X("CHIPPER_2X"),
    
    COTS_DEVICE("COTS_DEVICE"),
    
    VERIFONE_P400("VERIFONE_P400"),
    
    WISEPAD_3("WISEPAD_3"),
    
    WISEPOS_E("WISEPOS_E");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeviceType")
  private DeviceTypeEnum deviceType = null;

  /**
   * Device Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_CONNECTED("Not_Connected"),
    
    CONNECTING("Connecting"),
    
    CONNECTED("Connected"),
    
    ONLINE("Online"),
    
    OFFLINE("Offline");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("BatteryLevel")
  private Float batteryLevel = null;

  @SerializedName("UpdateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("ReaderId")
  private String readerId = null;

  public BluetoothTerminalStatus serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial Number
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial Number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public BluetoothTerminalStatus softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

   /**
   * Software Version
   * @return softwareVersion
  **/
  @ApiModelProperty(value = "Software Version")
  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public BluetoothTerminalStatus deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Device Type
   * @return deviceType
  **/
  @ApiModelProperty(value = "Device Type")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public BluetoothTerminalStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Device Status
   * @return status
  **/
  @ApiModelProperty(value = "Device Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BluetoothTerminalStatus batteryLevel(Float batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

   /**
   * Indication of the battery level from 0 to 1
   * @return batteryLevel
  **/
  @ApiModelProperty(value = "Indication of the battery level from 0 to 1")
  public Float getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(Float batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public BluetoothTerminalStatus updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Last time the status was updated
   * @return updateTime
  **/
  @ApiModelProperty(value = "Last time the status was updated")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public BluetoothTerminalStatus readerId(String readerId) {
    this.readerId = readerId;
    return this;
  }

   /**
   * ReaderId for Stripe Terminal
   * @return readerId
  **/
  @ApiModelProperty(value = "ReaderId for Stripe Terminal")
  public String getReaderId() {
    return readerId;
  }

  public void setReaderId(String readerId) {
    this.readerId = readerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BluetoothTerminalStatus bluetoothTerminalStatus = (BluetoothTerminalStatus) o;
    return Objects.equals(this.serialNumber, bluetoothTerminalStatus.serialNumber) &&
        Objects.equals(this.softwareVersion, bluetoothTerminalStatus.softwareVersion) &&
        Objects.equals(this.deviceType, bluetoothTerminalStatus.deviceType) &&
        Objects.equals(this.status, bluetoothTerminalStatus.status) &&
        Objects.equals(this.batteryLevel, bluetoothTerminalStatus.batteryLevel) &&
        Objects.equals(this.updateTime, bluetoothTerminalStatus.updateTime) &&
        Objects.equals(this.readerId, bluetoothTerminalStatus.readerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, softwareVersion, deviceType, status, batteryLevel, updateTime, readerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BluetoothTerminalStatus {\n");
    
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
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

