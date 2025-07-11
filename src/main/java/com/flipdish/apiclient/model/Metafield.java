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
 * Metafield
 */
@ApiModel(description = "Metafield")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class Metafield {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  public Metafield key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key of the metafield.  Allowed characters: lowercase letters, numbers, hyphen, underscore and dot
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key of the metafield.  Allowed characters: lowercase letters, numbers, hyphen, underscore and dot")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Metafield value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the metafield.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value of the metafield.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metafield metafield = (Metafield) o;
    return Objects.equals(this.key, metafield.key) &&
        Objects.equals(this.value, metafield.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metafield {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

