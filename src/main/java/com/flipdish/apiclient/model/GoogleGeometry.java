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
import com.flipdish.apiclient.model.GoogleLocation;
import com.flipdish.apiclient.model.GoogleViewport;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GoogleGeometry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T06:28:53.942Z")
public class GoogleGeometry {
  @SerializedName("Location")
  private GoogleLocation location = null;

  @SerializedName("Location_type")
  private String locationType = null;

  @SerializedName("Viewport")
  private GoogleViewport viewport = null;

  public GoogleGeometry location(GoogleLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public GoogleLocation getLocation() {
    return location;
  }

  public void setLocation(GoogleLocation location) {
    this.location = location;
  }

  public GoogleGeometry locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @ApiModelProperty(value = "")
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public GoogleGeometry viewport(GoogleViewport viewport) {
    this.viewport = viewport;
    return this;
  }

   /**
   * Get viewport
   * @return viewport
  **/
  @ApiModelProperty(value = "")
  public GoogleViewport getViewport() {
    return viewport;
  }

  public void setViewport(GoogleViewport viewport) {
    this.viewport = viewport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleGeometry googleGeometry = (GoogleGeometry) o;
    return Objects.equals(this.location, googleGeometry.location) &&
        Objects.equals(this.locationType, googleGeometry.locationType) &&
        Objects.equals(this.viewport, googleGeometry.viewport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationType, viewport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleGeometry {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
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

