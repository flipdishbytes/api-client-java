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
 * Application created event
 */
@ApiModel(description = "Application created event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-08T09:15:58.305+01:00")
public class AppCreatedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("CountryId")
  private String countryId = null;

  @SerializedName("User")
  private UserEventInfo user = null;

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

  public AppCreatedEvent eventName(String eventName) {
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

  public AppCreatedEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppCreatedEvent appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * App Name
   * @return appName
  **/
  @ApiModelProperty(value = "App Name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public AppCreatedEvent countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Country Id
   * @return countryId
  **/
  @ApiModelProperty(value = "Country Id")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public AppCreatedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User information
   * @return user
  **/
  @ApiModelProperty(value = "User information")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public AppCreatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public AppCreatedEvent createTime(OffsetDateTime createTime) {
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

  public AppCreatedEvent position(Integer position) {
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

  public AppCreatedEvent appId(String appId) {
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

  public AppCreatedEvent ipAddress(String ipAddress) {
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
    AppCreatedEvent appCreatedEvent = (AppCreatedEvent) o;
    return Objects.equals(this.eventName, appCreatedEvent.eventName) &&
        Objects.equals(this.description, appCreatedEvent.description) &&
        Objects.equals(this.appName, appCreatedEvent.appName) &&
        Objects.equals(this.countryId, appCreatedEvent.countryId) &&
        Objects.equals(this.user, appCreatedEvent.user) &&
        Objects.equals(this.flipdishEventId, appCreatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, appCreatedEvent.createTime) &&
        Objects.equals(this.position, appCreatedEvent.position) &&
        Objects.equals(this.appId, appCreatedEvent.appId) &&
        Objects.equals(this.ipAddress, appCreatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, description, appName, countryId, user, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCreatedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

