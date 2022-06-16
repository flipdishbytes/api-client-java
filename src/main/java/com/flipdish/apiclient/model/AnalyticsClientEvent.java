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
 * Client Analytics event
 */
@ApiModel(description = "Client Analytics event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-16T14:34:50.609+01:00")
public class AnalyticsClientEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("EventType")
  private String eventType = null;

  @SerializedName("AppType")
  private String appType = null;

  @SerializedName("Metadata")
  private String metadata = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

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

  public AnalyticsClientEvent eventName(String eventName) {
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

  public AnalyticsClientEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of the event
   * @return eventType
  **/
  @ApiModelProperty(value = "Type of the event")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AnalyticsClientEvent appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Type of the app the event is coming from
   * @return appType
  **/
  @ApiModelProperty(value = "Type of the app the event is coming from")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public AnalyticsClientEvent metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * JSON Metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "JSON Metadata")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public AnalyticsClientEvent userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User Id
   * @return userId
  **/
  @ApiModelProperty(value = "User Id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public AnalyticsClientEvent latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of the event
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude of the event")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AnalyticsClientEvent longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of the event
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude of the event")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AnalyticsClientEvent flipdishEventId(UUID flipdishEventId) {
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

  public AnalyticsClientEvent createTime(OffsetDateTime createTime) {
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

  public AnalyticsClientEvent position(Integer position) {
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

  public AnalyticsClientEvent appId(String appId) {
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

  public AnalyticsClientEvent ipAddress(String ipAddress) {
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
    AnalyticsClientEvent analyticsClientEvent = (AnalyticsClientEvent) o;
    return Objects.equals(this.eventName, analyticsClientEvent.eventName) &&
        Objects.equals(this.eventType, analyticsClientEvent.eventType) &&
        Objects.equals(this.appType, analyticsClientEvent.appType) &&
        Objects.equals(this.metadata, analyticsClientEvent.metadata) &&
        Objects.equals(this.userId, analyticsClientEvent.userId) &&
        Objects.equals(this.latitude, analyticsClientEvent.latitude) &&
        Objects.equals(this.longitude, analyticsClientEvent.longitude) &&
        Objects.equals(this.flipdishEventId, analyticsClientEvent.flipdishEventId) &&
        Objects.equals(this.createTime, analyticsClientEvent.createTime) &&
        Objects.equals(this.position, analyticsClientEvent.position) &&
        Objects.equals(this.appId, analyticsClientEvent.appId) &&
        Objects.equals(this.ipAddress, analyticsClientEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, eventType, appType, metadata, userId, latitude, longitude, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsClientEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

