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
import com.flipdish.apiclient.model.StoreGroup;
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
 * Store Group Created Event
 */
@ApiModel(description = "Store Group Created Event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:18:55.615Z")
public class StoreGroupCreatedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("StoreGroup")
  private StoreGroup storeGroup = null;

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

  public StoreGroupCreatedEvent eventName(String eventName) {
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

  public StoreGroupCreatedEvent storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store Group Id
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store Group Id")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public StoreGroupCreatedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User which created this store group
   * @return user
  **/
  @ApiModelProperty(value = "User which created this store group")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public StoreGroupCreatedEvent description(String description) {
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

  public StoreGroupCreatedEvent storeGroup(StoreGroup storeGroup) {
    this.storeGroup = storeGroup;
    return this;
  }

   /**
   * Created store group
   * @return storeGroup
  **/
  @ApiModelProperty(value = "Created store group")
  public StoreGroup getStoreGroup() {
    return storeGroup;
  }

  public void setStoreGroup(StoreGroup storeGroup) {
    this.storeGroup = storeGroup;
  }

  public StoreGroupCreatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public StoreGroupCreatedEvent createTime(OffsetDateTime createTime) {
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

  public StoreGroupCreatedEvent position(Integer position) {
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

  public StoreGroupCreatedEvent appId(String appId) {
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

  public StoreGroupCreatedEvent ipAddress(String ipAddress) {
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
    StoreGroupCreatedEvent storeGroupCreatedEvent = (StoreGroupCreatedEvent) o;
    return Objects.equals(this.eventName, storeGroupCreatedEvent.eventName) &&
        Objects.equals(this.storeGroupId, storeGroupCreatedEvent.storeGroupId) &&
        Objects.equals(this.user, storeGroupCreatedEvent.user) &&
        Objects.equals(this.description, storeGroupCreatedEvent.description) &&
        Objects.equals(this.storeGroup, storeGroupCreatedEvent.storeGroup) &&
        Objects.equals(this.flipdishEventId, storeGroupCreatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, storeGroupCreatedEvent.createTime) &&
        Objects.equals(this.position, storeGroupCreatedEvent.position) &&
        Objects.equals(this.appId, storeGroupCreatedEvent.appId) &&
        Objects.equals(this.ipAddress, storeGroupCreatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, storeGroupId, user, description, storeGroup, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreGroupCreatedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    storeGroup: ").append(toIndentedString(storeGroup)).append("\n");
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

