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
import com.flipdish.apiclient.model.MenuItemOptionSet;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-21T13:31:03.338Z")
public class MenuItemOptionSetCreatedEvent {
  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("MenuItemOptionSet")
  private MenuItemOptionSet menuItemOptionSet = null;

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

  public MenuItemOptionSetCreatedEvent menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu identifier
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu identifier")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public MenuItemOptionSetCreatedEvent description(String description) {
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

  public MenuItemOptionSetCreatedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User who has created the menu
   * @return user
  **/
  @ApiModelProperty(value = "User who has created the menu")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public MenuItemOptionSetCreatedEvent menuItemOptionSet(MenuItemOptionSet menuItemOptionSet) {
    this.menuItemOptionSet = menuItemOptionSet;
    return this;
  }

   /**
   * Created menu item optionset
   * @return menuItemOptionSet
  **/
  @ApiModelProperty(value = "Created menu item optionset")
  public MenuItemOptionSet getMenuItemOptionSet() {
    return menuItemOptionSet;
  }

  public void setMenuItemOptionSet(MenuItemOptionSet menuItemOptionSet) {
    this.menuItemOptionSet = menuItemOptionSet;
  }

  public MenuItemOptionSetCreatedEvent eventName(String eventName) {
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

  public MenuItemOptionSetCreatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public MenuItemOptionSetCreatedEvent createTime(OffsetDateTime createTime) {
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

  public MenuItemOptionSetCreatedEvent position(Integer position) {
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

  public MenuItemOptionSetCreatedEvent appId(String appId) {
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

  public MenuItemOptionSetCreatedEvent ipAddress(String ipAddress) {
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
    MenuItemOptionSetCreatedEvent menuItemOptionSetCreatedEvent = (MenuItemOptionSetCreatedEvent) o;
    return Objects.equals(this.menuId, menuItemOptionSetCreatedEvent.menuId) &&
        Objects.equals(this.description, menuItemOptionSetCreatedEvent.description) &&
        Objects.equals(this.user, menuItemOptionSetCreatedEvent.user) &&
        Objects.equals(this.menuItemOptionSet, menuItemOptionSetCreatedEvent.menuItemOptionSet) &&
        Objects.equals(this.eventName, menuItemOptionSetCreatedEvent.eventName) &&
        Objects.equals(this.flipdishEventId, menuItemOptionSetCreatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, menuItemOptionSetCreatedEvent.createTime) &&
        Objects.equals(this.position, menuItemOptionSetCreatedEvent.position) &&
        Objects.equals(this.appId, menuItemOptionSetCreatedEvent.appId) &&
        Objects.equals(this.ipAddress, menuItemOptionSetCreatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, description, user, menuItemOptionSet, eventName, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemOptionSetCreatedEvent {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    menuItemOptionSet: ").append(toIndentedString(menuItemOptionSet)).append("\n");
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

