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

/**
 * OrderDropOffLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T13:15:21.811+01:00")
public class OrderDropOffLocation {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("LocationName")
  private String locationName = null;

  @SerializedName("LocationAreaName")
  private String locationAreaName = null;

  @SerializedName("LocationId")
  private Integer locationId = null;

  @SerializedName("LocationAreaId")
  private Integer locationAreaId = null;

  @SerializedName("ExternalLocationId")
  private String externalLocationId = null;

  public OrderDropOffLocation orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderDropOffLocation locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @ApiModelProperty(value = "")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public OrderDropOffLocation locationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
    return this;
  }

   /**
   * Get locationAreaName
   * @return locationAreaName
  **/
  @ApiModelProperty(value = "")
  public String getLocationAreaName() {
    return locationAreaName;
  }

  public void setLocationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
  }

  public OrderDropOffLocation locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public OrderDropOffLocation locationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
    return this;
  }

   /**
   * Get locationAreaId
   * @return locationAreaId
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationAreaId() {
    return locationAreaId;
  }

  public void setLocationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
  }

  public OrderDropOffLocation externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Get externalLocationId
   * @return externalLocationId
  **/
  @ApiModelProperty(value = "")
  public String getExternalLocationId() {
    return externalLocationId;
  }

  public void setExternalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDropOffLocation orderDropOffLocation = (OrderDropOffLocation) o;
    return Objects.equals(this.orderId, orderDropOffLocation.orderId) &&
        Objects.equals(this.locationName, orderDropOffLocation.locationName) &&
        Objects.equals(this.locationAreaName, orderDropOffLocation.locationAreaName) &&
        Objects.equals(this.locationId, orderDropOffLocation.locationId) &&
        Objects.equals(this.locationAreaId, orderDropOffLocation.locationAreaId) &&
        Objects.equals(this.externalLocationId, orderDropOffLocation.externalLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, locationName, locationAreaName, locationId, locationAreaId, externalLocationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDropOffLocation {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationAreaName: ").append(toIndentedString(locationAreaName)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationAreaId: ").append(toIndentedString(locationAreaId)).append("\n");
    sb.append("    externalLocationId: ").append(toIndentedString(externalLocationId)).append("\n");
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

