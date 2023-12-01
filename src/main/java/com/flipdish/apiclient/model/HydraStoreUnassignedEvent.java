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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Hydra store\\s unassigned event
 */
@ApiModel(description = "Hydra store\\s unassigned event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-01T12:34:33.674Z")
public class HydraStoreUnassignedEvent {
  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

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

  public HydraStoreUnassignedEvent user(UserEventInfo user) {
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

  public HydraStoreUnassignedEvent storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public HydraStoreUnassignedEvent addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store\\s to unassign hydra from
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store\\s to unassign hydra from")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public HydraStoreUnassignedEvent eventName(String eventName) {
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

  public HydraStoreUnassignedEvent flipdishEventId(UUID flipdishEventId) {
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

  public HydraStoreUnassignedEvent createTime(OffsetDateTime createTime) {
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

  public HydraStoreUnassignedEvent position(Integer position) {
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

  public HydraStoreUnassignedEvent appId(String appId) {
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

  public HydraStoreUnassignedEvent ipAddress(String ipAddress) {
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
    HydraStoreUnassignedEvent hydraStoreUnassignedEvent = (HydraStoreUnassignedEvent) o;
    return Objects.equals(this.user, hydraStoreUnassignedEvent.user) &&
        Objects.equals(this.storeIds, hydraStoreUnassignedEvent.storeIds) &&
        Objects.equals(this.eventName, hydraStoreUnassignedEvent.eventName) &&
        Objects.equals(this.flipdishEventId, hydraStoreUnassignedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, hydraStoreUnassignedEvent.createTime) &&
        Objects.equals(this.position, hydraStoreUnassignedEvent.position) &&
        Objects.equals(this.appId, hydraStoreUnassignedEvent.appId) &&
        Objects.equals(this.ipAddress, hydraStoreUnassignedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, storeIds, eventName, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraStoreUnassignedEvent {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

