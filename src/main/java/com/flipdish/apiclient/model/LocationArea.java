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
 * Represents a LocationArea
 */
@ApiModel(description = "Represents a LocationArea")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-03T09:57:13.852+01:00")
public class LocationArea {
  @SerializedName("LocationAreaId")
  private Integer locationAreaId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("LocationAreaName")
  private String locationAreaName = null;

  public LocationArea locationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
    return this;
  }

   /**
   * Id of the LocationArea
   * @return locationAreaId
  **/
  @ApiModelProperty(value = "Id of the LocationArea")
  public Integer getLocationAreaId() {
    return locationAreaId;
  }

  public void setLocationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
  }

  public LocationArea storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Id of the Store that this LocationArea belongs to
   * @return storeId
  **/
  @ApiModelProperty(value = "Id of the Store that this LocationArea belongs to")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public LocationArea locationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
    return this;
  }

   /**
   * Descriptive LocationArea name
   * @return locationAreaName
  **/
  @ApiModelProperty(value = "Descriptive LocationArea name")
  public String getLocationAreaName() {
    return locationAreaName;
  }

  public void setLocationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationArea locationArea = (LocationArea) o;
    return Objects.equals(this.locationAreaId, locationArea.locationAreaId) &&
        Objects.equals(this.storeId, locationArea.storeId) &&
        Objects.equals(this.locationAreaName, locationArea.locationAreaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationAreaId, storeId, locationAreaName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationArea {\n");
    
    sb.append("    locationAreaId: ").append(toIndentedString(locationAreaId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    locationAreaName: ").append(toIndentedString(locationAreaName)).append("\n");
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

