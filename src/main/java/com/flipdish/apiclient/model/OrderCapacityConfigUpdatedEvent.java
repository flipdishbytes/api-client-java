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
import com.flipdish.apiclient.model.StoreOrderCapacityConfigEditModel;
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
 * Store&#39;s Order Capacity Configuration Updated
 */
@ApiModel(description = "Store's Order Capacity Configuration Updated")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-10T11:00:02.901+01:00")
public class OrderCapacityConfigUpdatedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("OrderCapacityConfig")
  private StoreOrderCapacityConfigEditModel orderCapacityConfig = null;

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

  public OrderCapacityConfigUpdatedEvent eventName(String eventName) {
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

  public OrderCapacityConfigUpdatedEvent storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Id of the store whose order capacity configuration has been updated
   * @return storeId
  **/
  @ApiModelProperty(value = "Id of the store whose order capacity configuration has been updated")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public OrderCapacityConfigUpdatedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User which updated order capacity configuration for this store
   * @return user
  **/
  @ApiModelProperty(value = "User which updated order capacity configuration for this store")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public OrderCapacityConfigUpdatedEvent description(String description) {
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

  public OrderCapacityConfigUpdatedEvent orderCapacityConfig(StoreOrderCapacityConfigEditModel orderCapacityConfig) {
    this.orderCapacityConfig = orderCapacityConfig;
    return this;
  }

   /**
   * Updated order capacity configuration
   * @return orderCapacityConfig
  **/
  @ApiModelProperty(value = "Updated order capacity configuration")
  public StoreOrderCapacityConfigEditModel getOrderCapacityConfig() {
    return orderCapacityConfig;
  }

  public void setOrderCapacityConfig(StoreOrderCapacityConfigEditModel orderCapacityConfig) {
    this.orderCapacityConfig = orderCapacityConfig;
  }

  public OrderCapacityConfigUpdatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public OrderCapacityConfigUpdatedEvent createTime(OffsetDateTime createTime) {
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

  public OrderCapacityConfigUpdatedEvent position(Integer position) {
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

  public OrderCapacityConfigUpdatedEvent appId(String appId) {
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

  public OrderCapacityConfigUpdatedEvent ipAddress(String ipAddress) {
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
    OrderCapacityConfigUpdatedEvent orderCapacityConfigUpdatedEvent = (OrderCapacityConfigUpdatedEvent) o;
    return Objects.equals(this.eventName, orderCapacityConfigUpdatedEvent.eventName) &&
        Objects.equals(this.storeId, orderCapacityConfigUpdatedEvent.storeId) &&
        Objects.equals(this.user, orderCapacityConfigUpdatedEvent.user) &&
        Objects.equals(this.description, orderCapacityConfigUpdatedEvent.description) &&
        Objects.equals(this.orderCapacityConfig, orderCapacityConfigUpdatedEvent.orderCapacityConfig) &&
        Objects.equals(this.flipdishEventId, orderCapacityConfigUpdatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, orderCapacityConfigUpdatedEvent.createTime) &&
        Objects.equals(this.position, orderCapacityConfigUpdatedEvent.position) &&
        Objects.equals(this.appId, orderCapacityConfigUpdatedEvent.appId) &&
        Objects.equals(this.ipAddress, orderCapacityConfigUpdatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, storeId, user, description, orderCapacityConfig, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCapacityConfigUpdatedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderCapacityConfig: ").append(toIndentedString(orderCapacityConfig)).append("\n");
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

