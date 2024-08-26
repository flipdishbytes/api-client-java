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
 * Menu Items for Cross-Sell
 */
@ApiModel(description = "Menu Items for Cross-Sell")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-26T14:28:41.057Z")
public class CrossSellMenuItems {
  @SerializedName("MenuItemIds")
  private List<Integer> menuItemIds = null;

  public CrossSellMenuItems menuItemIds(List<Integer> menuItemIds) {
    this.menuItemIds = menuItemIds;
    return this;
  }

  public CrossSellMenuItems addMenuItemIdsItem(Integer menuItemIdsItem) {
    if (this.menuItemIds == null) {
      this.menuItemIds = new ArrayList<Integer>();
    }
    this.menuItemIds.add(menuItemIdsItem);
    return this;
  }

   /**
   * Menu Item Id&#39;s
   * @return menuItemIds
  **/
  @ApiModelProperty(value = "Menu Item Id's")
  public List<Integer> getMenuItemIds() {
    return menuItemIds;
  }

  public void setMenuItemIds(List<Integer> menuItemIds) {
    this.menuItemIds = menuItemIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossSellMenuItems crossSellMenuItems = (CrossSellMenuItems) o;
    return Objects.equals(this.menuItemIds, crossSellMenuItems.menuItemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossSellMenuItems {\n");
    
    sb.append("    menuItemIds: ").append(toIndentedString(menuItemIds)).append("\n");
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

