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
 * Event for logging the creating of Locations
 */
@ApiModel(description = "Event for logging the creating of Locations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-02T11:42:55.643+01:00")
public class LocationCreatedEvent {
  @SerializedName("LocationId")
  private Integer locationId = null;

  @SerializedName("LocationName")
  private String locationName = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("ExternalLocationId")
  private String externalLocationId = null;

  @SerializedName("LocationAreaId")
  private Integer locationAreaId = null;

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

  public LocationCreatedEvent locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Location Location Id
   * @return locationId
  **/
  @ApiModelProperty(value = "Location Location Id")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public LocationCreatedEvent locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Location LocationName
   * @return locationName
  **/
  @ApiModelProperty(value = "Location LocationName")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public LocationCreatedEvent displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Location DisplayOrder
   * @return displayOrder
  **/
  @ApiModelProperty(value = "Location DisplayOrder")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public LocationCreatedEvent externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Location ExternalLocationId
   * @return externalLocationId
  **/
  @ApiModelProperty(value = "Location ExternalLocationId")
  public String getExternalLocationId() {
    return externalLocationId;
  }

  public void setExternalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
  }

  public LocationCreatedEvent locationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
    return this;
  }

   /**
   * Location LocationAreaId
   * @return locationAreaId
  **/
  @ApiModelProperty(value = "Location LocationAreaId")
  public Integer getLocationAreaId() {
    return locationAreaId;
  }

  public void setLocationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
  }

  public LocationCreatedEvent eventName(String eventName) {
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

  public LocationCreatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public LocationCreatedEvent createTime(OffsetDateTime createTime) {
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

  public LocationCreatedEvent position(Integer position) {
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

  public LocationCreatedEvent appId(String appId) {
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

  public LocationCreatedEvent ipAddress(String ipAddress) {
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
    LocationCreatedEvent locationCreatedEvent = (LocationCreatedEvent) o;
    return Objects.equals(this.locationId, locationCreatedEvent.locationId) &&
        Objects.equals(this.locationName, locationCreatedEvent.locationName) &&
        Objects.equals(this.displayOrder, locationCreatedEvent.displayOrder) &&
        Objects.equals(this.externalLocationId, locationCreatedEvent.externalLocationId) &&
        Objects.equals(this.locationAreaId, locationCreatedEvent.locationAreaId) &&
        Objects.equals(this.eventName, locationCreatedEvent.eventName) &&
        Objects.equals(this.flipdishEventId, locationCreatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, locationCreatedEvent.createTime) &&
        Objects.equals(this.position, locationCreatedEvent.position) &&
        Objects.equals(this.appId, locationCreatedEvent.appId) &&
        Objects.equals(this.ipAddress, locationCreatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationName, displayOrder, externalLocationId, locationAreaId, eventName, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationCreatedEvent {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
    sb.append("    locationAreaId: ").append(toIndentedString(locationAreaId)).append("\n");
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

