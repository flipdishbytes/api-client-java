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
import org.threeten.bp.OffsetDateTime;

/**
 * Pending Menu Changes
 */
@ApiModel(description = "Pending Menu Changes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-29T13:11:55.866+01:00")
public class PendingMenuChanges {
  @SerializedName("CatalogElementId")
  private String catalogElementId = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("LastUpdatedAt")
  private OffsetDateTime lastUpdatedAt = null;

  public PendingMenuChanges catalogElementId(String catalogElementId) {
    this.catalogElementId = catalogElementId;
    return this;
  }

   /**
   * Unique catalog element id
   * @return catalogElementId
  **/
  @ApiModelProperty(value = "Unique catalog element id")
  public String getCatalogElementId() {
    return catalogElementId;
  }

  public void setCatalogElementId(String catalogElementId) {
    this.catalogElementId = catalogElementId;
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

  public PendingMenuChanges lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Update date and time
   * @return lastUpdatedAt
  **/
  @ApiModelProperty(value = "Update date and time")
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
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
    return Objects.equals(this.catalogElementId, pendingMenuChanges.catalogElementId) &&
        Objects.equals(this.menuId, pendingMenuChanges.menuId) &&
        Objects.equals(this.lastUpdatedAt, pendingMenuChanges.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogElementId, menuId, lastUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingMenuChanges {\n");
    
    sb.append("    catalogElementId: ").append(toIndentedString(catalogElementId)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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

