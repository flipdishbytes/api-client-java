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
 * Kiosk Stripe Terminal Update info received event
 */
@ApiModel(description = "Kiosk Stripe Terminal Update info received event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-07T12:37:23.455Z")
public class KioskBluetoothTerminalFirmwareVersionStatusEvent {
  @SerializedName("DeviceId")
  private String deviceId = null;

  @SerializedName("SerialNumber")
  private String serialNumber = null;

  @SerializedName("HasFirmwareUpdate")
  private Boolean hasFirmwareUpdate = null;

  @SerializedName("HasConfigUpdate")
  private Boolean hasConfigUpdate = null;

  @SerializedName("HasKeyUpdate")
  private Boolean hasKeyUpdate = null;

  /**
   * ETA to install the update
   */
  @JsonAdapter(UpdateTimeEstimateEnum.Adapter.class)
  public enum UpdateTimeEstimateEnum {
    LESSTHANONEMINUTE("LessThanOneMinute"),
    
    ONETOTWOMINUTES("OneToTwoMinutes"),
    
    TWOTOFIVEMINUTES("TwoToFiveMinutes"),
    
    FIVETOFIFTEENMINUTES("FiveToFifteenMinutes");

    private String value;

    UpdateTimeEstimateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateTimeEstimateEnum fromValue(String text) {
      for (UpdateTimeEstimateEnum b : UpdateTimeEstimateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UpdateTimeEstimateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateTimeEstimateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateTimeEstimateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UpdateTimeEstimateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("UpdateTimeEstimate")
  private UpdateTimeEstimateEnum updateTimeEstimate = null;

  @SerializedName("UserEventInfo")
  private UserEventInfo userEventInfo = null;

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

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public KioskBluetoothTerminalFirmwareVersionStatusEvent deviceId(String deviceId) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial Number of the device
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial Number of the device")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent hasFirmwareUpdate(Boolean hasFirmwareUpdate) {
    this.hasFirmwareUpdate = hasFirmwareUpdate;
    return this;
  }

   /**
   * Indicates if Payment Terminal has Firmware Update
   * @return hasFirmwareUpdate
  **/
  @ApiModelProperty(value = "Indicates if Payment Terminal has Firmware Update")
  public Boolean isHasFirmwareUpdate() {
    return hasFirmwareUpdate;
  }

  public void setHasFirmwareUpdate(Boolean hasFirmwareUpdate) {
    this.hasFirmwareUpdate = hasFirmwareUpdate;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent hasConfigUpdate(Boolean hasConfigUpdate) {
    this.hasConfigUpdate = hasConfigUpdate;
    return this;
  }

   /**
   * Indicates if Payment Terminal has Config Update
   * @return hasConfigUpdate
  **/
  @ApiModelProperty(value = "Indicates if Payment Terminal has Config Update")
  public Boolean isHasConfigUpdate() {
    return hasConfigUpdate;
  }

  public void setHasConfigUpdate(Boolean hasConfigUpdate) {
    this.hasConfigUpdate = hasConfigUpdate;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent hasKeyUpdate(Boolean hasKeyUpdate) {
    this.hasKeyUpdate = hasKeyUpdate;
    return this;
  }

   /**
   * Indicates if Payment Terminal has Key Update
   * @return hasKeyUpdate
  **/
  @ApiModelProperty(value = "Indicates if Payment Terminal has Key Update")
  public Boolean isHasKeyUpdate() {
    return hasKeyUpdate;
  }

  public void setHasKeyUpdate(Boolean hasKeyUpdate) {
    this.hasKeyUpdate = hasKeyUpdate;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent updateTimeEstimate(UpdateTimeEstimateEnum updateTimeEstimate) {
    this.updateTimeEstimate = updateTimeEstimate;
    return this;
  }

   /**
   * ETA to install the update
   * @return updateTimeEstimate
  **/
  @ApiModelProperty(value = "ETA to install the update")
  public UpdateTimeEstimateEnum getUpdateTimeEstimate() {
    return updateTimeEstimate;
  }

  public void setUpdateTimeEstimate(UpdateTimeEstimateEnum updateTimeEstimate) {
    this.updateTimeEstimate = updateTimeEstimate;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent userEventInfo(UserEventInfo userEventInfo) {
    this.userEventInfo = userEventInfo;
    return this;
  }

   /**
   * User who made the changes
   * @return userEventInfo
  **/
  @ApiModelProperty(value = "User who made the changes")
  public UserEventInfo getUserEventInfo() {
    return userEventInfo;
  }

  public void setUserEventInfo(UserEventInfo userEventInfo) {
    this.userEventInfo = userEventInfo;
  }

  public KioskBluetoothTerminalFirmwareVersionStatusEvent eventName(String eventName) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent flipdishEventId(UUID flipdishEventId) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent createTime(OffsetDateTime createTime) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent position(Integer position) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent appId(String appId) {
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

  public KioskBluetoothTerminalFirmwareVersionStatusEvent ipAddress(String ipAddress) {
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
    KioskBluetoothTerminalFirmwareVersionStatusEvent kioskBluetoothTerminalFirmwareVersionStatusEvent = (KioskBluetoothTerminalFirmwareVersionStatusEvent) o;
    return Objects.equals(this.deviceId, kioskBluetoothTerminalFirmwareVersionStatusEvent.deviceId) &&
        Objects.equals(this.serialNumber, kioskBluetoothTerminalFirmwareVersionStatusEvent.serialNumber) &&
        Objects.equals(this.hasFirmwareUpdate, kioskBluetoothTerminalFirmwareVersionStatusEvent.hasFirmwareUpdate) &&
        Objects.equals(this.hasConfigUpdate, kioskBluetoothTerminalFirmwareVersionStatusEvent.hasConfigUpdate) &&
        Objects.equals(this.hasKeyUpdate, kioskBluetoothTerminalFirmwareVersionStatusEvent.hasKeyUpdate) &&
        Objects.equals(this.updateTimeEstimate, kioskBluetoothTerminalFirmwareVersionStatusEvent.updateTimeEstimate) &&
        Objects.equals(this.userEventInfo, kioskBluetoothTerminalFirmwareVersionStatusEvent.userEventInfo) &&
        Objects.equals(this.eventName, kioskBluetoothTerminalFirmwareVersionStatusEvent.eventName) &&
        Objects.equals(this.flipdishEventId, kioskBluetoothTerminalFirmwareVersionStatusEvent.flipdishEventId) &&
        Objects.equals(this.createTime, kioskBluetoothTerminalFirmwareVersionStatusEvent.createTime) &&
        Objects.equals(this.position, kioskBluetoothTerminalFirmwareVersionStatusEvent.position) &&
        Objects.equals(this.appId, kioskBluetoothTerminalFirmwareVersionStatusEvent.appId) &&
        Objects.equals(this.ipAddress, kioskBluetoothTerminalFirmwareVersionStatusEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, serialNumber, hasFirmwareUpdate, hasConfigUpdate, hasKeyUpdate, updateTimeEstimate, userEventInfo, eventName, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KioskBluetoothTerminalFirmwareVersionStatusEvent {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    hasFirmwareUpdate: ").append(toIndentedString(hasFirmwareUpdate)).append("\n");
    sb.append("    hasConfigUpdate: ").append(toIndentedString(hasConfigUpdate)).append("\n");
    sb.append("    hasKeyUpdate: ").append(toIndentedString(hasKeyUpdate)).append("\n");
    sb.append("    updateTimeEstimate: ").append(toIndentedString(updateTimeEstimate)).append("\n");
    sb.append("    userEventInfo: ").append(toIndentedString(userEventInfo)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

