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
 * Pending Menu Changes
 */
@ApiModel(description = "Pending Menu Changes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-28T10:12:52.786+01:00")
public class PendingMenuChanges {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  public PendingMenuChanges catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Unique catalog item id
   * @return catalogItemId
  **/
  @ApiModelProperty(value = "Unique catalog item id")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public PendingMenuChanges menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Unique menu id
   * @return menuId
  **/
  @ApiModelProperty(value = "Unique menu id")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingMenuChanges pendingMenuChanges = (PendingMenuChanges) o;
    return Objects.equals(this.catalogItemId, pendingMenuChanges.catalogItemId) &&
        Objects.equals(this.menuId, pendingMenuChanges.menuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, menuId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingMenuChanges {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
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

