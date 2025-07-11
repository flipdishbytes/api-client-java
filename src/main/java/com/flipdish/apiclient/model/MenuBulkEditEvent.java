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
 * Menu bulk event
 */
@ApiModel(description = "Menu bulk event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class MenuBulkEditEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("MenuName")
  private String menuName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Item")
  private String item = null;

  @SerializedName("InstanceCount")
  private Integer instanceCount = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  @SerializedName("User")
  private UserEventInfo user = null;

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

  @SerializedName("OrgId")
  private String orgId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public MenuBulkEditEvent eventName(String eventName) {
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

  public MenuBulkEditEvent menuName(String menuName) {
    this.menuName = menuName;
    return this;
  }

   /**
   * Menu Name
   * @return menuName
  **/
  @ApiModelProperty(value = "Menu Name")
  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public MenuBulkEditEvent description(String description) {
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

  public MenuBulkEditEvent item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Product
   * @return item
  **/
  @ApiModelProperty(value = "Product")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public MenuBulkEditEvent instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

   /**
   * Quantity of product
   * @return instanceCount
  **/
  @ApiModelProperty(value = "Quantity of product")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public MenuBulkEditEvent isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Visibility of the item
   * @return isAvailable
  **/
  @ApiModelProperty(value = "Visibility of the item")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public MenuBulkEditEvent user(UserEventInfo user) {
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

  public MenuBulkEditEvent menuId(Integer menuId) {
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

  public MenuBulkEditEvent flipdishEventId(UUID flipdishEventId) {
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

  public MenuBulkEditEvent createTime(OffsetDateTime createTime) {
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

  public MenuBulkEditEvent position(Integer position) {
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

  public MenuBulkEditEvent appId(String appId) {
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

  public MenuBulkEditEvent orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Org id
   * @return orgId
  **/
  @ApiModelProperty(value = "Org id")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public MenuBulkEditEvent ipAddress(String ipAddress) {
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
    MenuBulkEditEvent menuBulkEditEvent = (MenuBulkEditEvent) o;
    return Objects.equals(this.eventName, menuBulkEditEvent.eventName) &&
        Objects.equals(this.menuName, menuBulkEditEvent.menuName) &&
        Objects.equals(this.description, menuBulkEditEvent.description) &&
        Objects.equals(this.item, menuBulkEditEvent.item) &&
        Objects.equals(this.instanceCount, menuBulkEditEvent.instanceCount) &&
        Objects.equals(this.isAvailable, menuBulkEditEvent.isAvailable) &&
        Objects.equals(this.user, menuBulkEditEvent.user) &&
        Objects.equals(this.menuId, menuBulkEditEvent.menuId) &&
        Objects.equals(this.flipdishEventId, menuBulkEditEvent.flipdishEventId) &&
        Objects.equals(this.createTime, menuBulkEditEvent.createTime) &&
        Objects.equals(this.position, menuBulkEditEvent.position) &&
        Objects.equals(this.appId, menuBulkEditEvent.appId) &&
        Objects.equals(this.orgId, menuBulkEditEvent.orgId) &&
        Objects.equals(this.ipAddress, menuBulkEditEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, menuName, description, item, instanceCount, isAvailable, user, menuId, flipdishEventId, createTime, position, appId, orgId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuBulkEditEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    menuName: ").append(toIndentedString(menuName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

