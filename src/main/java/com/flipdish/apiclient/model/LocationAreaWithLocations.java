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
import com.flipdish.apiclient.model.LocationAreaLocation;
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

/**
 * Represents a LocationArea and its Location list
 */
@ApiModel(description = "Represents a LocationArea and its Location list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-11T11:41:30.072Z")
public class LocationAreaWithLocations {
  @SerializedName("LocationAreaId")
  private Integer locationAreaId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("LocationAreaName")
  private String locationAreaName = null;

  @SerializedName("Locations")
  private List<LocationAreaLocation> locations = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public LocationAreaWithLocations locationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
    return this;
  }

   /**
   * Id of the LocationArea
   * @return locationAreaId
  **/
  @ApiModelProperty(required = true, value = "Id of the LocationArea")
  public Integer getLocationAreaId() {
    return locationAreaId;
  }

  public void setLocationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
  }

  public LocationAreaWithLocations storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Id of the Store that this LocationArea belongs to
   * @return storeId
  **/
  @ApiModelProperty(required = true, value = "Id of the Store that this LocationArea belongs to")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public LocationAreaWithLocations locationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
    return this;
  }

   /**
   * Descriptive LocationArea name
   * @return locationAreaName
  **/
  @ApiModelProperty(required = true, value = "Descriptive LocationArea name")
  public String getLocationAreaName() {
    return locationAreaName;
  }

  public void setLocationAreaName(String locationAreaName) {
    this.locationAreaName = locationAreaName;
  }

  public LocationAreaWithLocations locations(List<LocationAreaLocation> locations) {
    this.locations = locations;
    return this;
  }

  public LocationAreaWithLocations addLocationsItem(LocationAreaLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<LocationAreaLocation>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * List of Locations that belongs to this Location Area
   * @return locations
  **/
  @ApiModelProperty(value = "List of Locations that belongs to this Location Area")
  public List<LocationAreaLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<LocationAreaLocation> locations) {
    this.locations = locations;
  }

  public LocationAreaWithLocations isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Returns if the LocationArea is deleted or not
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Returns if the LocationArea is deleted or not")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationAreaWithLocations locationAreaWithLocations = (LocationAreaWithLocations) o;
    return Objects.equals(this.locationAreaId, locationAreaWithLocations.locationAreaId) &&
        Objects.equals(this.storeId, locationAreaWithLocations.storeId) &&
        Objects.equals(this.locationAreaName, locationAreaWithLocations.locationAreaName) &&
        Objects.equals(this.locations, locationAreaWithLocations.locations) &&
        Objects.equals(this.isDeleted, locationAreaWithLocations.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationAreaId, storeId, locationAreaName, locations, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaWithLocations {\n");
    
    sb.append("    locationAreaId: ").append(toIndentedString(locationAreaId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    locationAreaName: ").append(toIndentedString(locationAreaName)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

