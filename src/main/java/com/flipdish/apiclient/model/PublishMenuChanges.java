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
 * Publish Menu Changes
 */
@ApiModel(description = "Publish Menu Changes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-28T10:12:52.786+01:00")
public class PublishMenuChanges {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  @SerializedName("MenuIds")
  private List<Integer> menuIds = null;

  public PublishMenuChanges catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Optional Catalog item id
   * @return catalogItemId
  **/
  @ApiModelProperty(value = "Optional Catalog item id")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public PublishMenuChanges menuIds(List<Integer> menuIds) {
    this.menuIds = menuIds;
    return this;
  }

  public PublishMenuChanges addMenuIdsItem(Integer menuIdsItem) {
    if (this.menuIds == null) {
      this.menuIds = new ArrayList<Integer>();
    }
    this.menuIds.add(menuIdsItem);
    return this;
  }

   /**
   * Optional Collection of Menu id
   * @return menuIds
  **/
  @ApiModelProperty(value = "Optional Collection of Menu id")
  public List<Integer> getMenuIds() {
    return menuIds;
  }

  public void setMenuIds(List<Integer> menuIds) {
    this.menuIds = menuIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishMenuChanges publishMenuChanges = (PublishMenuChanges) o;
    return Objects.equals(this.catalogItemId, publishMenuChanges.catalogItemId) &&
        Objects.equals(this.menuIds, publishMenuChanges.menuIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, menuIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishMenuChanges {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    menuIds: ").append(toIndentedString(menuIds)).append("\n");
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

