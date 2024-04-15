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
 * Input model for creating a Location
 */
@ApiModel(description = "Input model for creating a Location")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-15T11:20:47.121Z")
public class CreateLocation {
  @SerializedName("LocationId")
  private Integer locationId = null;

  @SerializedName("LocationName")
  private String locationName = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("ExternalLocationId")
  private String externalLocationId = null;

  public CreateLocation locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Location Id
   * @return locationId
  **/
  @ApiModelProperty(value = "Location Id")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public CreateLocation locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Descriptive LocationArea name
   * @return locationName
  **/
  @ApiModelProperty(value = "Descriptive LocationArea name")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public CreateLocation displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order that the Location should be displayed on the screen
   * @return displayOrder
  **/
  @ApiModelProperty(value = "The order that the Location should be displayed on the screen")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public CreateLocation externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Id of the Location on an external system
   * @return externalLocationId
  **/
  @ApiModelProperty(value = "Id of the Location on an external system")
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
    CreateLocation createLocation = (CreateLocation) o;
    return Objects.equals(this.locationId, createLocation.locationId) &&
        Objects.equals(this.locationName, createLocation.locationName) &&
        Objects.equals(this.displayOrder, createLocation.displayOrder) &&
        Objects.equals(this.externalLocationId, createLocation.externalLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationName, displayOrder, externalLocationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLocation {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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

