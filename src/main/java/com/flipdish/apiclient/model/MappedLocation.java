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
 * Representation of a Location and its External Mapping
 */
@ApiModel(description = "Representation of a Location and its External Mapping")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-10T11:57:07.208Z")
public class MappedLocation {
  @SerializedName("LocationId")
  private Integer locationId = null;

  @SerializedName("ExternalLocationId")
  private String externalLocationId = null;

  public MappedLocation locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Id of the Location
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "Id of the Location")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public MappedLocation externalLocationId(String externalLocationId) {
    this.externalLocationId = externalLocationId;
    return this;
  }

   /**
   * Id of the Location on an external system
   * @return externalLocationId
  **/
  @ApiModelProperty(required = true, value = "Id of the Location on an external system")
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
    MappedLocation mappedLocation = (MappedLocation) o;
    return Objects.equals(this.locationId, mappedLocation.locationId) &&
        Objects.equals(this.externalLocationId, mappedLocation.externalLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, externalLocationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappedLocation {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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

