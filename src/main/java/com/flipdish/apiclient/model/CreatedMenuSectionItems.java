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
import com.flipdish.apiclient.model.MenuSectionItem;
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
 * Response for the creation of multiple Menu Section Items
 */
@ApiModel(description = "Response for the creation of multiple Menu Section Items")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class CreatedMenuSectionItems {
  @SerializedName("MenuSectionItems")
  private List<MenuSectionItem> menuSectionItems = null;

  public CreatedMenuSectionItems menuSectionItems(List<MenuSectionItem> menuSectionItems) {
    this.menuSectionItems = menuSectionItems;
    return this;
  }

  public CreatedMenuSectionItems addMenuSectionItemsItem(MenuSectionItem menuSectionItemsItem) {
    if (this.menuSectionItems == null) {
      this.menuSectionItems = new ArrayList<MenuSectionItem>();
    }
    this.menuSectionItems.add(menuSectionItemsItem);
    return this;
  }

   /**
   * Created Menu Section Items
   * @return menuSectionItems
  **/
  @ApiModelProperty(value = "Created Menu Section Items")
  public List<MenuSectionItem> getMenuSectionItems() {
    return menuSectionItems;
  }

  public void setMenuSectionItems(List<MenuSectionItem> menuSectionItems) {
    this.menuSectionItems = menuSectionItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedMenuSectionItems createdMenuSectionItems = (CreatedMenuSectionItems) o;
    return Objects.equals(this.menuSectionItems, createdMenuSectionItems.menuSectionItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuSectionItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedMenuSectionItems {\n");
    
    sb.append("    menuSectionItems: ").append(toIndentedString(menuSectionItems)).append("\n");
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

