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
import com.flipdish.apiclient.model.FieldChangeInformation;
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
 * External event
 */
@ApiModel(description = "External event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-17T15:53:22.758Z")
public class ExternalStoreEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DescriptionFormat")
  private String descriptionFormat = null;

  @SerializedName("DescriptionFields")
  private String descriptionFields = null;

  @SerializedName("DescriptionId")
  private String descriptionId = null;

  @SerializedName("Ref1")
  private String ref1 = null;

  @SerializedName("Ref2")
  private String ref2 = null;

  @SerializedName("Ref3")
  private String ref3 = null;

  @SerializedName("Ref4")
  private String ref4 = null;

  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("FieldChanges")
  private List<FieldChangeInformation> fieldChanges = null;

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

  public ExternalStoreEvent eventName(String eventName) {
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

  public ExternalStoreEvent storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public ExternalStoreEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User which did the action
   * @return user
  **/
  @ApiModelProperty(value = "User which did the action")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public ExternalStoreEvent description(String description) {
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

  public ExternalStoreEvent descriptionFormat(String descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Description with format placeholders
   * @return descriptionFormat
  **/
  @ApiModelProperty(value = "Description with format placeholders")
  public String getDescriptionFormat() {
    return descriptionFormat;
  }

  public void setDescriptionFormat(String descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }

  public ExternalStoreEvent descriptionFields(String descriptionFields) {
    this.descriptionFields = descriptionFields;
    return this;
  }

   /**
   * Description with format placeholders
   * @return descriptionFields
  **/
  @ApiModelProperty(value = "Description with format placeholders")
  public String getDescriptionFields() {
    return descriptionFields;
  }

  public void setDescriptionFields(String descriptionFields) {
    this.descriptionFields = descriptionFields;
  }

  public ExternalStoreEvent descriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
    return this;
  }

   /**
   * Description
   * @return descriptionId
  **/
  @ApiModelProperty(value = "Description")
  public String getDescriptionId() {
    return descriptionId;
  }

  public void setDescriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
  }

  public ExternalStoreEvent ref1(String ref1) {
    this.ref1 = ref1;
    return this;
  }

   /**
   * Ref (reference field)
   * @return ref1
  **/
  @ApiModelProperty(value = "Ref (reference field)")
  public String getRef1() {
    return ref1;
  }

  public void setRef1(String ref1) {
    this.ref1 = ref1;
  }

  public ExternalStoreEvent ref2(String ref2) {
    this.ref2 = ref2;
    return this;
  }

   /**
   * Ref2 (reference field)
   * @return ref2
  **/
  @ApiModelProperty(value = "Ref2 (reference field)")
  public String getRef2() {
    return ref2;
  }

  public void setRef2(String ref2) {
    this.ref2 = ref2;
  }

  public ExternalStoreEvent ref3(String ref3) {
    this.ref3 = ref3;
    return this;
  }

   /**
   * Ref3 (reference field)
   * @return ref3
  **/
  @ApiModelProperty(value = "Ref3 (reference field)")
  public String getRef3() {
    return ref3;
  }

  public void setRef3(String ref3) {
    this.ref3 = ref3;
  }

  public ExternalStoreEvent ref4(String ref4) {
    this.ref4 = ref4;
    return this;
  }

   /**
   * Ref4 (reference field)
   * @return ref4
  **/
  @ApiModelProperty(value = "Ref4 (reference field)")
  public String getRef4() {
    return ref4;
  }

  public void setRef4(String ref4) {
    this.ref4 = ref4;
  }

  public ExternalStoreEvent orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Id
   * @return orderId
  **/
  @ApiModelProperty(value = "Order Id")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public ExternalStoreEvent tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExternalStoreEvent addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(value = "Tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExternalStoreEvent fieldChanges(List<FieldChangeInformation> fieldChanges) {
    this.fieldChanges = fieldChanges;
    return this;
  }

  public ExternalStoreEvent addFieldChangesItem(FieldChangeInformation fieldChangesItem) {
    if (this.fieldChanges == null) {
      this.fieldChanges = new ArrayList<FieldChangeInformation>();
    }
    this.fieldChanges.add(fieldChangesItem);
    return this;
  }

   /**
   * Field changes list
   * @return fieldChanges
  **/
  @ApiModelProperty(value = "Field changes list")
  public List<FieldChangeInformation> getFieldChanges() {
    return fieldChanges;
  }

  public void setFieldChanges(List<FieldChangeInformation> fieldChanges) {
    this.fieldChanges = fieldChanges;
  }

  public ExternalStoreEvent flipdishEventId(UUID flipdishEventId) {
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

  public ExternalStoreEvent createTime(OffsetDateTime createTime) {
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

  public ExternalStoreEvent position(Integer position) {
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

  public ExternalStoreEvent appId(String appId) {
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

  public ExternalStoreEvent ipAddress(String ipAddress) {
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
    ExternalStoreEvent externalStoreEvent = (ExternalStoreEvent) o;
    return Objects.equals(this.eventName, externalStoreEvent.eventName) &&
        Objects.equals(this.storeId, externalStoreEvent.storeId) &&
        Objects.equals(this.user, externalStoreEvent.user) &&
        Objects.equals(this.description, externalStoreEvent.description) &&
        Objects.equals(this.descriptionFormat, externalStoreEvent.descriptionFormat) &&
        Objects.equals(this.descriptionFields, externalStoreEvent.descriptionFields) &&
        Objects.equals(this.descriptionId, externalStoreEvent.descriptionId) &&
        Objects.equals(this.ref1, externalStoreEvent.ref1) &&
        Objects.equals(this.ref2, externalStoreEvent.ref2) &&
        Objects.equals(this.ref3, externalStoreEvent.ref3) &&
        Objects.equals(this.ref4, externalStoreEvent.ref4) &&
        Objects.equals(this.orderId, externalStoreEvent.orderId) &&
        Objects.equals(this.tags, externalStoreEvent.tags) &&
        Objects.equals(this.fieldChanges, externalStoreEvent.fieldChanges) &&
        Objects.equals(this.flipdishEventId, externalStoreEvent.flipdishEventId) &&
        Objects.equals(this.createTime, externalStoreEvent.createTime) &&
        Objects.equals(this.position, externalStoreEvent.position) &&
        Objects.equals(this.appId, externalStoreEvent.appId) &&
        Objects.equals(this.ipAddress, externalStoreEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, storeId, user, description, descriptionFormat, descriptionFields, descriptionId, ref1, ref2, ref3, ref4, orderId, tags, fieldChanges, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalStoreEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    descriptionFields: ").append(toIndentedString(descriptionFields)).append("\n");
    sb.append("    descriptionId: ").append(toIndentedString(descriptionId)).append("\n");
    sb.append("    ref1: ").append(toIndentedString(ref1)).append("\n");
    sb.append("    ref2: ").append(toIndentedString(ref2)).append("\n");
    sb.append("    ref3: ").append(toIndentedString(ref3)).append("\n");
    sb.append("    ref4: ").append(toIndentedString(ref4)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fieldChanges: ").append(toIndentedString(fieldChanges)).append("\n");
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

