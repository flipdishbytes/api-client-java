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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Hydra Connection Status Changed Event
 */
@ApiModel(description = "Hydra Connection Status Changed Event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-23T14:27:15.919Z")
public class HydraConnectionStatusChangedEvent {
  @SerializedName("DeviceId")
  private String deviceId = null;

  /**
   * Hydra Device Status
   */
  @JsonAdapter(HydraDeviceStatusEnum.Adapter.class)
  public enum HydraDeviceStatusEnum {
    ONLINE("Online"),
    
    POSSIBLYOFFLINE("PossiblyOffline"),
    
    OFFLINE("Offline");

    private String value;

    HydraDeviceStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HydraDeviceStatusEnum fromValue(String text) {
      for (HydraDeviceStatusEnum b : HydraDeviceStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HydraDeviceStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HydraDeviceStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HydraDeviceStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HydraDeviceStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("HydraDeviceStatus")
  private HydraDeviceStatusEnum hydraDeviceStatus = null;

  @SerializedName("PollTime")
  private OffsetDateTime pollTime = null;

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

  public HydraConnectionStatusChangedEvent deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Hydra Device Id
   * @return deviceId
  **/
  @ApiModelProperty(value = "Hydra Device Id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public HydraConnectionStatusChangedEvent hydraDeviceStatus(HydraDeviceStatusEnum hydraDeviceStatus) {
    this.hydraDeviceStatus = hydraDeviceStatus;
    return this;
  }

   /**
   * Hydra Device Status
   * @return hydraDeviceStatus
  **/
  @ApiModelProperty(value = "Hydra Device Status")
  public HydraDeviceStatusEnum getHydraDeviceStatus() {
    return hydraDeviceStatus;
  }

  public void setHydraDeviceStatus(HydraDeviceStatusEnum hydraDeviceStatus) {
    this.hydraDeviceStatus = hydraDeviceStatus;
  }

  public HydraConnectionStatusChangedEvent pollTime(OffsetDateTime pollTime) {
    this.pollTime = pollTime;
    return this;
  }

   /**
   * Hydra Last Poll Time
   * @return pollTime
  **/
  @ApiModelProperty(value = "Hydra Last Poll Time")
  public OffsetDateTime getPollTime() {
    return pollTime;
  }

  public void setPollTime(OffsetDateTime pollTime) {
    this.pollTime = pollTime;
  }

  public HydraConnectionStatusChangedEvent eventName(String eventName) {
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

  public HydraConnectionStatusChangedEvent flipdishEventId(UUID flipdishEventId) {
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

  public HydraConnectionStatusChangedEvent createTime(OffsetDateTime createTime) {
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

  public HydraConnectionStatusChangedEvent position(Integer position) {
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

  public HydraConnectionStatusChangedEvent appId(String appId) {
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

  public HydraConnectionStatusChangedEvent ipAddress(String ipAddress) {
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
    HydraConnectionStatusChangedEvent hydraConnectionStatusChangedEvent = (HydraConnectionStatusChangedEvent) o;
    return Objects.equals(this.deviceId, hydraConnectionStatusChangedEvent.deviceId) &&
        Objects.equals(this.hydraDeviceStatus, hydraConnectionStatusChangedEvent.hydraDeviceStatus) &&
        Objects.equals(this.pollTime, hydraConnectionStatusChangedEvent.pollTime) &&
        Objects.equals(this.eventName, hydraConnectionStatusChangedEvent.eventName) &&
        Objects.equals(this.flipdishEventId, hydraConnectionStatusChangedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, hydraConnectionStatusChangedEvent.createTime) &&
        Objects.equals(this.position, hydraConnectionStatusChangedEvent.position) &&
        Objects.equals(this.appId, hydraConnectionStatusChangedEvent.appId) &&
        Objects.equals(this.ipAddress, hydraConnectionStatusChangedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, hydraDeviceStatus, pollTime, eventName, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraConnectionStatusChangedEvent {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    hydraDeviceStatus: ").append(toIndentedString(hydraDeviceStatus)).append("\n");
    sb.append("    pollTime: ").append(toIndentedString(pollTime)).append("\n");
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

