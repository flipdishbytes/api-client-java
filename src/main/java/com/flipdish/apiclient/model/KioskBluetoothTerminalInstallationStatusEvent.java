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
import com.flipdish.apiclient.model.UserEventInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Kiosk bluetooth terminal Installation Status
 */
@ApiModel(description = "Kiosk bluetooth terminal Installation Status")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class KioskBluetoothTerminalInstallationStatusEvent {
  @SerializedName("DeviceId")
  private String deviceId = null;

  /**
   * Terminal Type
   */
  @JsonAdapter(BluetoothTerminalTypeEnum.Adapter.class)
  public enum BluetoothTerminalTypeEnum {
    CHIPPER_2X("CHIPPER_2X"),
    
    COTS_DEVICE("COTS_DEVICE"),
    
    VERIFONE_P400("VERIFONE_P400"),
    
    WISEPAD_3("WISEPAD_3"),
    
    WISEPOS_E("WISEPOS_E");

    private String value;

    BluetoothTerminalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BluetoothTerminalTypeEnum fromValue(String text) {
      for (BluetoothTerminalTypeEnum b : BluetoothTerminalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BluetoothTerminalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BluetoothTerminalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BluetoothTerminalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BluetoothTerminalTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("BluetoothTerminalType")
  private BluetoothTerminalTypeEnum bluetoothTerminalType = null;

  @SerializedName("BluetoothTerminalSerialNumber")
  private String bluetoothTerminalSerialNumber = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("Progress")
  private Integer progress = null;

  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("OrgId")
  private String orgId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public KioskBluetoothTerminalInstallationStatusEvent deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Device Id of the Kiosk
   * @return deviceId
  **/
  @ApiModelProperty(value = "Device Id of the Kiosk")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public KioskBluetoothTerminalInstallationStatusEvent bluetoothTerminalType(BluetoothTerminalTypeEnum bluetoothTerminalType) {
    this.bluetoothTerminalType = bluetoothTerminalType;
    return this;
  }

   /**
   * Terminal Type
   * @return bluetoothTerminalType
  **/
  @ApiModelProperty(value = "Terminal Type")
  public BluetoothTerminalTypeEnum getBluetoothTerminalType() {
    return bluetoothTerminalType;
  }

  public void setBluetoothTerminalType(BluetoothTerminalTypeEnum bluetoothTerminalType) {
    this.bluetoothTerminalType = bluetoothTerminalType;
  }

  public KioskBluetoothTerminalInstallationStatusEvent bluetoothTerminalSerialNumber(String bluetoothTerminalSerialNumber) {
    this.bluetoothTerminalSerialNumber = bluetoothTerminalSerialNumber;
    return this;
  }

   /**
   * Serial number of the terminal
   * @return bluetoothTerminalSerialNumber
  **/
  @ApiModelProperty(value = "Serial number of the terminal")
  public String getBluetoothTerminalSerialNumber() {
    return bluetoothTerminalSerialNumber;
  }

  public void setBluetoothTerminalSerialNumber(String bluetoothTerminalSerialNumber) {
    this.bluetoothTerminalSerialNumber = bluetoothTerminalSerialNumber;
  }

  public KioskBluetoothTerminalInstallationStatusEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User who made the change
   * @return user
  **/
  @ApiModelProperty(value = "User who made the change")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public KioskBluetoothTerminalInstallationStatusEvent progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Update Install Progress for Card Reader
   * @return progress
  **/
  @ApiModelProperty(value = "Update Install Progress for Card Reader")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public KioskBluetoothTerminalInstallationStatusEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name
   * @return eventName
  **/
  @ApiModelProperty(value = "The event name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public KioskBluetoothTerminalInstallationStatusEvent flipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
    return this;
  }

   /**
   * The identitfier of the event
   * @return flipdishEventId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The identitfier of the event")
  public UUID getFlipdishEventId() {
    return flipdishEventId;
  }

  public void setFlipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
  }

  public KioskBluetoothTerminalInstallationStatusEvent createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time of creation of the event
   * @return createTime
  **/
  @ApiModelProperty(value = "The time of creation of the event")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public KioskBluetoothTerminalInstallationStatusEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/
  @ApiModelProperty(value = "Position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public KioskBluetoothTerminalInstallationStatusEvent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public KioskBluetoothTerminalInstallationStatusEvent orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Org id
   * @return orgId
  **/
  @ApiModelProperty(value = "Org id")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public KioskBluetoothTerminalInstallationStatusEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Ip Address
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Ip Address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KioskBluetoothTerminalInstallationStatusEvent kioskBluetoothTerminalInstallationStatusEvent = (KioskBluetoothTerminalInstallationStatusEvent) o;
    return Objects.equals(this.deviceId, kioskBluetoothTerminalInstallationStatusEvent.deviceId) &&
        Objects.equals(this.bluetoothTerminalType, kioskBluetoothTerminalInstallationStatusEvent.bluetoothTerminalType) &&
        Objects.equals(this.bluetoothTerminalSerialNumber, kioskBluetoothTerminalInstallationStatusEvent.bluetoothTerminalSerialNumber) &&
        Objects.equals(this.user, kioskBluetoothTerminalInstallationStatusEvent.user) &&
        Objects.equals(this.progress, kioskBluetoothTerminalInstallationStatusEvent.progress) &&
        Objects.equals(this.eventName, kioskBluetoothTerminalInstallationStatusEvent.eventName) &&
        Objects.equals(this.flipdishEventId, kioskBluetoothTerminalInstallationStatusEvent.flipdishEventId) &&
        Objects.equals(this.createTime, kioskBluetoothTerminalInstallationStatusEvent.createTime) &&
        Objects.equals(this.position, kioskBluetoothTerminalInstallationStatusEvent.position) &&
        Objects.equals(this.appId, kioskBluetoothTerminalInstallationStatusEvent.appId) &&
        Objects.equals(this.orgId, kioskBluetoothTerminalInstallationStatusEvent.orgId) &&
        Objects.equals(this.ipAddress, kioskBluetoothTerminalInstallationStatusEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, bluetoothTerminalType, bluetoothTerminalSerialNumber, user, progress, eventName, flipdishEventId, createTime, position, appId, orgId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskBluetoothTerminalInstallationStatusEvent {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    bluetoothTerminalType: ").append(toIndentedString(bluetoothTerminalType)).append("\n");
    sb.append("    bluetoothTerminalSerialNumber: ").append(toIndentedString(bluetoothTerminalSerialNumber)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

