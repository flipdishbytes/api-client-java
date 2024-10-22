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
 * Metadata
 */
@ApiModel(description = "Metadata")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-22T14:01:52.558Z")
public class Metadata {
  @SerializedName("MenuEntityId")
  private Integer menuEntityId = null;

  @SerializedName("Key")
  private String key = null;

  @SerializedName("Value")
  private String value = null;

  public Metadata menuEntityId(Integer menuEntityId) {
    this.menuEntityId = menuEntityId;
    return this;
  }

   /**
   * Menu entity identifier (eg: MenuItemId, MenuItemOptionSetItemId)
   * @return menuEntityId
  **/
  @ApiModelProperty(value = "Menu entity identifier (eg: MenuItemId, MenuItemOptionSetItemId)")
  public Integer getMenuEntityId() {
    return menuEntityId;
  }

  public void setMenuEntityId(Integer menuEntityId) {
    this.menuEntityId = menuEntityId;
  }

  public Metadata key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Metadata key (Unique identifier)
   * @return key
  **/
  @ApiModelProperty(value = "Metadata key (Unique identifier)")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Metadata value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Metadata value
   * @return value
  **/
  @ApiModelProperty(value = "Metadata value")
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
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.menuEntityId, metadata.menuEntityId) &&
        Objects.equals(this.key, metadata.key) &&
        Objects.equals(this.value, metadata.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuEntityId, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    
    sb.append("    menuEntityId: ").append(toIndentedString(menuEntityId)).append("\n");
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

