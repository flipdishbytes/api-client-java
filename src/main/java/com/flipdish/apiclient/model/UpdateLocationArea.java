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
 * Input model for updating a LocationArea
 */
@ApiModel(description = "Input model for updating a LocationArea")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-15T14:41:06.949Z")
public class UpdateLocationArea {
  @SerializedName("LocationAreaId")
  private Integer locationAreaId = null;

  @SerializedName("LocationAreaName")
  private String locationAreaName = null;

  @SerializedName("IsDeleted")
  private Boolean isDeleted = null;

  public UpdateLocationArea locationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
    return this;
  }

   /**
   * Location Area Id
   * @return locationAreaId
  **/
  @ApiModelProperty(required = true, value = "Location Area Id")
  public Integer getLocationAreaId() {
    return locationAreaId;
  }

  public void setLocationAreaId(Integer locationAreaId) {
    this.locationAreaId = locationAreaId;
  }

  public UpdateLocationArea locationAreaName(String locationAreaName) {
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

  public UpdateLocationArea isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Sets if the Location Area should be soft deleted or not
   * @return isDeleted
  **/
  @ApiModelProperty(value = "Sets if the Location Area should be soft deleted or not")
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
    UpdateLocationArea updateLocationArea = (UpdateLocationArea) o;
    return Objects.equals(this.locationAreaId, updateLocationArea.locationAreaId) &&
        Objects.equals(this.locationAreaName, updateLocationArea.locationAreaName) &&
        Objects.equals(this.isDeleted, updateLocationArea.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationAreaId, locationAreaName, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLocationArea {\n");
    
    sb.append("    locationAreaId: ").append(toIndentedString(locationAreaId)).append("\n");
    sb.append("    locationAreaName: ").append(toIndentedString(locationAreaName)).append("\n");
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

