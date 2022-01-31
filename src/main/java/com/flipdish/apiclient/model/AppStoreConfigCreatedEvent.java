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
 * AppStore Config Created event
 */
@ApiModel(description = "AppStore Config Created event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-31T15:06:05.506Z")
public class AppStoreConfigCreatedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("AppStoreAppId")
  private String appStoreAppId = null;

  @SerializedName("AppStoreAppConfigurationId")
  private String appStoreAppConfigurationId = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  public AppStoreConfigCreatedEvent eventName(String eventName) {
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

  public AppStoreConfigCreatedEvent appStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
    return this;
  }

   /**
   * App Store App Id
   * @return appStoreAppId
  **/
  @ApiModelProperty(value = "App Store App Id")
  public String getAppStoreAppId() {
    return appStoreAppId;
  }

  public void setAppStoreAppId(String appStoreAppId) {
    this.appStoreAppId = appStoreAppId;
  }

  public AppStoreConfigCreatedEvent appStoreAppConfigurationId(String appStoreAppConfigurationId) {
    this.appStoreAppConfigurationId = appStoreAppConfigurationId;
    return this;
  }

   /**
   * App Store Configuration Id
   * @return appStoreAppConfigurationId
  **/
  @ApiModelProperty(value = "App Store Configuration Id")
  public String getAppStoreAppConfigurationId() {
    return appStoreAppConfigurationId;
  }

  public void setAppStoreAppConfigurationId(String appStoreAppConfigurationId) {
    this.appStoreAppConfigurationId = appStoreAppConfigurationId;
  }

  public AppStoreConfigCreatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public AppStoreConfigCreatedEvent createTime(OffsetDateTime createTime) {
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

  public AppStoreConfigCreatedEvent position(Integer position) {
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

  public AppStoreConfigCreatedEvent appId(String appId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreConfigCreatedEvent appStoreConfigCreatedEvent = (AppStoreConfigCreatedEvent) o;
    return Objects.equals(this.eventName, appStoreConfigCreatedEvent.eventName) &&
        Objects.equals(this.appStoreAppId, appStoreConfigCreatedEvent.appStoreAppId) &&
        Objects.equals(this.appStoreAppConfigurationId, appStoreConfigCreatedEvent.appStoreAppConfigurationId) &&
        Objects.equals(this.flipdishEventId, appStoreConfigCreatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, appStoreConfigCreatedEvent.createTime) &&
        Objects.equals(this.position, appStoreConfigCreatedEvent.position) &&
        Objects.equals(this.appId, appStoreConfigCreatedEvent.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, appStoreAppId, appStoreAppConfigurationId, flipdishEventId, createTime, position, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreConfigCreatedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    appStoreAppId: ").append(toIndentedString(appStoreAppId)).append("\n");
    sb.append("    appStoreAppConfigurationId: ").append(toIndentedString(appStoreAppConfigurationId)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

