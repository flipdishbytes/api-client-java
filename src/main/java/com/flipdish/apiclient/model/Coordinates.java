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
 * Coordinates
 */
@ApiModel(description = "Coordinates")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:52:00.997Z")
public class Coordinates {
  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public Coordinates latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Coordinates longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.latitude, coordinates.latitude) &&
        Objects.equals(this.longitude, coordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

