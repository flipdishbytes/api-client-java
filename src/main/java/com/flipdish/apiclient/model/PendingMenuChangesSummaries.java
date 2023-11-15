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
 * Pending menu changes summaries
 */
@ApiModel(description = "Pending menu changes summaries")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-15T15:28:34.931Z")
public class PendingMenuChangesSummaries {
  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("TotalPendingChanges")
  private Integer totalPendingChanges = null;

  public PendingMenuChangesSummaries menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu id
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu id")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public PendingMenuChangesSummaries totalPendingChanges(Integer totalPendingChanges) {
    this.totalPendingChanges = totalPendingChanges;
    return this;
  }

   /**
   * Sum of pending changes per menu id
   * @return totalPendingChanges
  **/
  @ApiModelProperty(value = "Sum of pending changes per menu id")
  public Integer getTotalPendingChanges() {
    return totalPendingChanges;
  }

  public void setTotalPendingChanges(Integer totalPendingChanges) {
    this.totalPendingChanges = totalPendingChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingMenuChangesSummaries pendingMenuChangesSummaries = (PendingMenuChangesSummaries) o;
    return Objects.equals(this.menuId, pendingMenuChangesSummaries.menuId) &&
        Objects.equals(this.totalPendingChanges, pendingMenuChangesSummaries.totalPendingChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, totalPendingChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingMenuChangesSummaries {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    totalPendingChanges: ").append(toIndentedString(totalPendingChanges)).append("\n");
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

