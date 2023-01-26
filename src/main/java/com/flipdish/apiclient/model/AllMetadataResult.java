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
import com.flipdish.apiclient.model.Metadata;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T09:54:22.821Z")
public class AllMetadataResult {
  @SerializedName("MenuItemMetadata")
  private List<Metadata> menuItemMetadata = null;

  @SerializedName("MenuItemOptionSetItemMetadata")
  private List<Metadata> menuItemOptionSetItemMetadata = null;

  public AllMetadataResult menuItemMetadata(List<Metadata> menuItemMetadata) {
    this.menuItemMetadata = menuItemMetadata;
    return this;
  }

  public AllMetadataResult addMenuItemMetadataItem(Metadata menuItemMetadataItem) {
    if (this.menuItemMetadata == null) {
      this.menuItemMetadata = new ArrayList<Metadata>();
    }
    this.menuItemMetadata.add(menuItemMetadataItem);
    return this;
  }

   /**
   * Menu item metadata
   * @return menuItemMetadata
  **/
  @ApiModelProperty(value = "Menu item metadata")
  public List<Metadata> getMenuItemMetadata() {
    return menuItemMetadata;
  }

  public void setMenuItemMetadata(List<Metadata> menuItemMetadata) {
    this.menuItemMetadata = menuItemMetadata;
  }

  public AllMetadataResult menuItemOptionSetItemMetadata(List<Metadata> menuItemOptionSetItemMetadata) {
    this.menuItemOptionSetItemMetadata = menuItemOptionSetItemMetadata;
    return this;
  }

  public AllMetadataResult addMenuItemOptionSetItemMetadataItem(Metadata menuItemOptionSetItemMetadataItem) {
    if (this.menuItemOptionSetItemMetadata == null) {
      this.menuItemOptionSetItemMetadata = new ArrayList<Metadata>();
    }
    this.menuItemOptionSetItemMetadata.add(menuItemOptionSetItemMetadataItem);
    return this;
  }

   /**
   * Menu item optionset item metadata
   * @return menuItemOptionSetItemMetadata
  **/
  @ApiModelProperty(value = "Menu item optionset item metadata")
  public List<Metadata> getMenuItemOptionSetItemMetadata() {
    return menuItemOptionSetItemMetadata;
  }

  public void setMenuItemOptionSetItemMetadata(List<Metadata> menuItemOptionSetItemMetadata) {
    this.menuItemOptionSetItemMetadata = menuItemOptionSetItemMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllMetadataResult allMetadataResult = (AllMetadataResult) o;
    return Objects.equals(this.menuItemMetadata, allMetadataResult.menuItemMetadata) &&
        Objects.equals(this.menuItemOptionSetItemMetadata, allMetadataResult.menuItemOptionSetItemMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemMetadata, menuItemOptionSetItemMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllMetadataResult {\n");
    
    sb.append("    menuItemMetadata: ").append(toIndentedString(menuItemMetadata)).append("\n");
    sb.append("    menuItemOptionSetItemMetadata: ").append(toIndentedString(menuItemOptionSetItemMetadata)).append("\n");
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

