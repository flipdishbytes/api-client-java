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
import com.flipdish.apiclient.model.MenuElementListItemResponse;
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
 * Response with any menu elements that had issues being hidden/shown
 */
@ApiModel(description = "Response with any menu elements that had issues being hidden/shown")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-23T10:58:00.815Z")
public class MenuElementListResponse {
  @SerializedName("MenuName")
  private String menuName = null;

  @SerializedName("MenuElementName")
  private String menuElementName = null;

  @SerializedName("InstanceCount")
  private Integer instanceCount = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  @SerializedName("Items")
  private List<MenuElementListItemResponse> items = null;

  public MenuElementListResponse menuName(String menuName) {
    this.menuName = menuName;
    return this;
  }

   /**
   * Menu Name
   * @return menuName
  **/
  @ApiModelProperty(value = "Menu Name")
  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public MenuElementListResponse menuElementName(String menuElementName) {
    this.menuElementName = menuElementName;
    return this;
  }

   /**
   * Menu Item Name
   * @return menuElementName
  **/
  @ApiModelProperty(value = "Menu Item Name")
  public String getMenuElementName() {
    return menuElementName;
  }

  public void setMenuElementName(String menuElementName) {
    this.menuElementName = menuElementName;
  }

  public MenuElementListResponse instanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
    return this;
  }

   /**
   * Menu Item Count
   * @return instanceCount
  **/
  @ApiModelProperty(value = "Menu Item Count")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  public MenuElementListResponse isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Menu Item is hide or unhide
   * @return isAvailable
  **/
  @ApiModelProperty(value = "Menu Item is hide or unhide")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public MenuElementListResponse items(List<MenuElementListItemResponse> items) {
    this.items = items;
    return this;
  }

  public MenuElementListResponse addItemsItem(MenuElementListItemResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MenuElementListItemResponse>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of Items
   * @return items
  **/
  @ApiModelProperty(value = "List of Items")
  public List<MenuElementListItemResponse> getItems() {
    return items;
  }

  public void setItems(List<MenuElementListItemResponse> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuElementListResponse menuElementListResponse = (MenuElementListResponse) o;
    return Objects.equals(this.menuName, menuElementListResponse.menuName) &&
        Objects.equals(this.menuElementName, menuElementListResponse.menuElementName) &&
        Objects.equals(this.instanceCount, menuElementListResponse.instanceCount) &&
        Objects.equals(this.isAvailable, menuElementListResponse.isAvailable) &&
        Objects.equals(this.items, menuElementListResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuName, menuElementName, instanceCount, isAvailable, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuElementListResponse {\n");
    
    sb.append("    menuName: ").append(toIndentedString(menuName)).append("\n");
    sb.append("    menuElementName: ").append(toIndentedString(menuElementName)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

