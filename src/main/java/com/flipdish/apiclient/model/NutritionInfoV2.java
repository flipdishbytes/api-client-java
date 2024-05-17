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
import com.flipdish.apiclient.model.NutritionInfoV2Item;
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
 * Menu Nutrition Information. Version 2 (localized).
 */
@ApiModel(description = "Menu Nutrition Information. Version 2 (localized).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-17T09:08:34.767Z")
public class NutritionInfoV2 {
  @SerializedName("MenuItems")
  private List<NutritionInfoV2Item> menuItems = null;

  @SerializedName("MenuItemOptionSetItems")
  private List<NutritionInfoV2Item> menuItemOptionSetItems = null;

  @SerializedName("ImageBaseUrl")
  private String imageBaseUrl = null;

  public NutritionInfoV2 menuItems(List<NutritionInfoV2Item> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public NutritionInfoV2 addMenuItemsItem(NutritionInfoV2Item menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new ArrayList<NutritionInfoV2Item>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

   /**
   * List of menu item nutrition infos
   * @return menuItems
  **/
  @ApiModelProperty(value = "List of menu item nutrition infos")
  public List<NutritionInfoV2Item> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<NutritionInfoV2Item> menuItems) {
    this.menuItems = menuItems;
  }

  public NutritionInfoV2 menuItemOptionSetItems(List<NutritionInfoV2Item> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
    return this;
  }

  public NutritionInfoV2 addMenuItemOptionSetItemsItem(NutritionInfoV2Item menuItemOptionSetItemsItem) {
    if (this.menuItemOptionSetItems == null) {
      this.menuItemOptionSetItems = new ArrayList<NutritionInfoV2Item>();
    }
    this.menuItemOptionSetItems.add(menuItemOptionSetItemsItem);
    return this;
  }

   /**
   * List of menu item option set nutrition infos
   * @return menuItemOptionSetItems
  **/
  @ApiModelProperty(value = "List of menu item option set nutrition infos")
  public List<NutritionInfoV2Item> getMenuItemOptionSetItems() {
    return menuItemOptionSetItems;
  }

  public void setMenuItemOptionSetItems(List<NutritionInfoV2Item> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
  }

  public NutritionInfoV2 imageBaseUrl(String imageBaseUrl) {
    this.imageBaseUrl = imageBaseUrl;
    return this;
  }

   /**
   * Base url for allergen images
   * @return imageBaseUrl
  **/
  @ApiModelProperty(value = "Base url for allergen images")
  public String getImageBaseUrl() {
    return imageBaseUrl;
  }

  public void setImageBaseUrl(String imageBaseUrl) {
    this.imageBaseUrl = imageBaseUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfoV2 nutritionInfoV2 = (NutritionInfoV2) o;
    return Objects.equals(this.menuItems, nutritionInfoV2.menuItems) &&
        Objects.equals(this.menuItemOptionSetItems, nutritionInfoV2.menuItemOptionSetItems) &&
        Objects.equals(this.imageBaseUrl, nutritionInfoV2.imageBaseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItems, menuItemOptionSetItems, imageBaseUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfoV2 {\n");
    
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    menuItemOptionSetItems: ").append(toIndentedString(menuItemOptionSetItems)).append("\n");
    sb.append("    imageBaseUrl: ").append(toIndentedString(imageBaseUrl)).append("\n");
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

