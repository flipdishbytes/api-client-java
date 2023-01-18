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
import com.flipdish.apiclient.model.Menu;
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
 * Menu uploaded event
 */
@ApiModel(description = "Menu uploaded event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-18T09:48:41.601Z")
public class MenuUploadedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("Menu")
  private Menu menu = null;

  @SerializedName("InstanceEventCount")
  private String instanceEventCount = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

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

  public MenuUploadedEvent eventName(String eventName) {
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

  public MenuUploadedEvent description(String description) {
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

  public MenuUploadedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User who has uploaded the menu
   * @return user
  **/
  @ApiModelProperty(value = "User who has uploaded the menu")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public MenuUploadedEvent menu(Menu menu) {
    this.menu = menu;
    return this;
  }

   /**
   * The menu
   * @return menu
  **/
  @ApiModelProperty(value = "The menu")
  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  public MenuUploadedEvent instanceEventCount(String instanceEventCount) {
    this.instanceEventCount = instanceEventCount;
    return this;
  }

   /**
   * Quantity of events
   * @return instanceEventCount
  **/
  @ApiModelProperty(value = "Quantity of events")
  public String getInstanceEventCount() {
    return instanceEventCount;
  }

  public void setInstanceEventCount(String instanceEventCount) {
    this.instanceEventCount = instanceEventCount;
  }

  public MenuUploadedEvent menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * The menu Id
   * @return menuId
  **/
  @ApiModelProperty(value = "The menu Id")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public MenuUploadedEvent flipdishEventId(UUID flipdishEventId) {
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

  public MenuUploadedEvent createTime(OffsetDateTime createTime) {
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

  public MenuUploadedEvent position(Integer position) {
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

  public MenuUploadedEvent appId(String appId) {
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

  public MenuUploadedEvent ipAddress(String ipAddress) {
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
    MenuUploadedEvent menuUploadedEvent = (MenuUploadedEvent) o;
    return Objects.equals(this.eventName, menuUploadedEvent.eventName) &&
        Objects.equals(this.description, menuUploadedEvent.description) &&
        Objects.equals(this.user, menuUploadedEvent.user) &&
        Objects.equals(this.menu, menuUploadedEvent.menu) &&
        Objects.equals(this.instanceEventCount, menuUploadedEvent.instanceEventCount) &&
        Objects.equals(this.menuId, menuUploadedEvent.menuId) &&
        Objects.equals(this.flipdishEventId, menuUploadedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, menuUploadedEvent.createTime) &&
        Objects.equals(this.position, menuUploadedEvent.position) &&
        Objects.equals(this.appId, menuUploadedEvent.appId) &&
        Objects.equals(this.ipAddress, menuUploadedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, description, user, menu, instanceEventCount, menuId, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuUploadedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
    sb.append("    instanceEventCount: ").append(toIndentedString(instanceEventCount)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
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

