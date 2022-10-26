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
 * Change information for a field
 */
@ApiModel(description = "Change information for a field")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-26T11:07:35.559+01:00")
public class FieldChangeInformation {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("OldValue")
  private String oldValue = null;

  @SerializedName("NewValue")
  private String newValue = null;

  public FieldChangeInformation path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path (hierarchy)
   * @return path
  **/
  @ApiModelProperty(value = "Path (hierarchy)")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FieldChangeInformation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of field
   * @return name
  **/
  @ApiModelProperty(value = "Name of field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldChangeInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key (code) of field
   * @return key
  **/
  @ApiModelProperty(value = "Key (code) of field")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FieldChangeInformation oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Old value
   * @return oldValue
  **/
  @ApiModelProperty(value = "Old value")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public FieldChangeInformation newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * New value
   * @return newValue
  **/
  @ApiModelProperty(value = "New value")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldChangeInformation fieldChangeInformation = (FieldChangeInformation) o;
    return Objects.equals(this.path, fieldChangeInformation.path) &&
        Objects.equals(this.name, fieldChangeInformation.name) &&
        Objects.equals(this.key, fieldChangeInformation.key) &&
        Objects.equals(this.oldValue, fieldChangeInformation.oldValue) &&
        Objects.equals(this.newValue, fieldChangeInformation.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, name, key, oldValue, newValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldChangeInformation {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

