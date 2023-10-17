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
import com.flipdish.apiclient.model.NutritionInfoMenuItem;
import com.flipdish.apiclient.model.NutritionInfoMenuOptionSetItem;
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
 * Menu Nutrition Information
 */
@ApiModel(description = "Menu Nutrition Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-17T09:39:41.364Z")
public class NutritionInfo {
  @SerializedName("Version")
  private String version = null;

  @SerializedName("MenuItems")
  private List<NutritionInfoMenuItem> menuItems = null;

  @SerializedName("MenuItemOptionSetItems")
  private List<NutritionInfoMenuOptionSetItem> menuItemOptionSetItems = null;

  public NutritionInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the nutrition information model
   * @return version
  **/
  @ApiModelProperty(value = "Version of the nutrition information model")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public NutritionInfo menuItems(List<NutritionInfoMenuItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public NutritionInfo addMenuItemsItem(NutritionInfoMenuItem menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new ArrayList<NutritionInfoMenuItem>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

   /**
   * List of menu item nutrition infos
   * @return menuItems
  **/
  @ApiModelProperty(value = "List of menu item nutrition infos")
  public List<NutritionInfoMenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<NutritionInfoMenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public NutritionInfo menuItemOptionSetItems(List<NutritionInfoMenuOptionSetItem> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
    return this;
  }

  public NutritionInfo addMenuItemOptionSetItemsItem(NutritionInfoMenuOptionSetItem menuItemOptionSetItemsItem) {
    if (this.menuItemOptionSetItems == null) {
      this.menuItemOptionSetItems = new ArrayList<NutritionInfoMenuOptionSetItem>();
    }
    this.menuItemOptionSetItems.add(menuItemOptionSetItemsItem);
    return this;
  }

   /**
   * List of menu item option set nutrition infos
   * @return menuItemOptionSetItems
  **/
  @ApiModelProperty(value = "List of menu item option set nutrition infos")
  public List<NutritionInfoMenuOptionSetItem> getMenuItemOptionSetItems() {
    return menuItemOptionSetItems;
  }

  public void setMenuItemOptionSetItems(List<NutritionInfoMenuOptionSetItem> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfo nutritionInfo = (NutritionInfo) o;
    return Objects.equals(this.version, nutritionInfo.version) &&
        Objects.equals(this.menuItems, nutritionInfo.menuItems) &&
        Objects.equals(this.menuItemOptionSetItems, nutritionInfo.menuItemOptionSetItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, menuItems, menuItemOptionSetItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    menuItemOptionSetItems: ").append(toIndentedString(menuItemOptionSetItems)).append("\n");
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

