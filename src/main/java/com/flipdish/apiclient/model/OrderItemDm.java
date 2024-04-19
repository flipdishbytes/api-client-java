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
 * OrderItemDm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-19T12:32:07.573Z")
public class OrderItemDm {
  @SerializedName("MenuItemId")
  private Integer menuItemId = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  @SerializedName("MenuItemOptionSetItemIds")
  private List<Integer> menuItemOptionSetItemIds = null;

  public OrderItemDm menuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
    return this;
  }

   /**
   * Get menuItemId
   * @return menuItemId
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuItemId() {
    return menuItemId;
  }

  public void setMenuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
  }

  public OrderItemDm isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Get isAvailable
   * @return isAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public OrderItemDm menuItemOptionSetItemIds(List<Integer> menuItemOptionSetItemIds) {
    this.menuItemOptionSetItemIds = menuItemOptionSetItemIds;
    return this;
  }

  public OrderItemDm addMenuItemOptionSetItemIdsItem(Integer menuItemOptionSetItemIdsItem) {
    if (this.menuItemOptionSetItemIds == null) {
      this.menuItemOptionSetItemIds = new ArrayList<Integer>();
    }
    this.menuItemOptionSetItemIds.add(menuItemOptionSetItemIdsItem);
    return this;
  }

   /**
   * Get menuItemOptionSetItemIds
   * @return menuItemOptionSetItemIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getMenuItemOptionSetItemIds() {
    return menuItemOptionSetItemIds;
  }

  public void setMenuItemOptionSetItemIds(List<Integer> menuItemOptionSetItemIds) {
    this.menuItemOptionSetItemIds = menuItemOptionSetItemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDm orderItemDm = (OrderItemDm) o;
    return Objects.equals(this.menuItemId, orderItemDm.menuItemId) &&
        Objects.equals(this.isAvailable, orderItemDm.isAvailable) &&
        Objects.equals(this.menuItemOptionSetItemIds, orderItemDm.menuItemOptionSetItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemId, isAvailable, menuItemOptionSetItemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDm {\n");
    
    sb.append("    menuItemId: ").append(toIndentedString(menuItemId)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    menuItemOptionSetItemIds: ").append(toIndentedString(menuItemOptionSetItemIds)).append("\n");
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

