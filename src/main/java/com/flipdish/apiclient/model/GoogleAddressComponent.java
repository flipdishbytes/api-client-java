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
import java.util.ArrayList;
import java.util.List;

/**
 * GoogleAddressComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-12T09:58:30.363Z")
public class GoogleAddressComponent {
  @SerializedName("Long_name")
  private String longName = null;

  @SerializedName("Short_name")
  private String shortName = null;

  @SerializedName("Types")
  private List<String> types = null;

  public GoogleAddressComponent longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * Get longName
   * @return longName
  **/
  @ApiModelProperty(value = "")
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public GoogleAddressComponent shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public GoogleAddressComponent types(List<String> types) {
    this.types = types;
    return this;
  }

  public GoogleAddressComponent addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAddressComponent googleAddressComponent = (GoogleAddressComponent) o;
    return Objects.equals(this.longName, googleAddressComponent.longName) &&
        Objects.equals(this.shortName, googleAddressComponent.shortName) &&
        Objects.equals(this.types, googleAddressComponent.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longName, shortName, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAddressComponent {\n");
    
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

