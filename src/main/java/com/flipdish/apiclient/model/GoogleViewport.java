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
import com.flipdish.apiclient.model.GoogleCoordinates;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GoogleViewport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-15T15:28:34.931Z")
public class GoogleViewport {
  @SerializedName("Northeast")
  private GoogleCoordinates northeast = null;

  @SerializedName("Southwest")
  private GoogleCoordinates southwest = null;

  public GoogleViewport northeast(GoogleCoordinates northeast) {
    this.northeast = northeast;
    return this;
  }

   /**
   * Get northeast
   * @return northeast
  **/
  @ApiModelProperty(value = "")
  public GoogleCoordinates getNortheast() {
    return northeast;
  }

  public void setNortheast(GoogleCoordinates northeast) {
    this.northeast = northeast;
  }

  public GoogleViewport southwest(GoogleCoordinates southwest) {
    this.southwest = southwest;
    return this;
  }

   /**
   * Get southwest
   * @return southwest
  **/
  @ApiModelProperty(value = "")
  public GoogleCoordinates getSouthwest() {
    return southwest;
  }

  public void setSouthwest(GoogleCoordinates southwest) {
    this.southwest = southwest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleViewport googleViewport = (GoogleViewport) o;
    return Objects.equals(this.northeast, googleViewport.northeast) &&
        Objects.equals(this.southwest, googleViewport.southwest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(northeast, southwest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleViewport {\n");
    
    sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
    sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
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

