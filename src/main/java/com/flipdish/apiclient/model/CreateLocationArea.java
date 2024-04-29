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
 * Input model for creating a LocationArea
 */
@ApiModel(description = "Input model for creating a LocationArea")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-29T09:55:36.813Z")
public class CreateLocationArea {
  @SerializedName("LocationAreaName")
  private String locationAreaName = null;

  public CreateLocationArea locationAreaName(String locationAreaName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLocationArea createLocationArea = (CreateLocationArea) o;
    return Objects.equals(this.locationAreaName, createLocationArea.locationAreaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationAreaName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLocationArea {\n");
    
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

