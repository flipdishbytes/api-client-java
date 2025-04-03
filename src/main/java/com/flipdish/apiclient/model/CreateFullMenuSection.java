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
import com.flipdish.apiclient.model.CreateFullMenuSectionItem;
import com.flipdish.apiclient.model.MenuSectionAvailability;
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
 * Create menu section
 */
@ApiModel(description = "Create menu section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T14:49:56.858Z")
public class CreateFullMenuSection {
  @SerializedName("MenuSectionAvailability")
  private MenuSectionAvailability menuSectionAvailability = null;

  @SerializedName("MenuItems")
  private List<CreateFullMenuSectionItem> menuItems = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  @SerializedName("IsHiddenFromCustomers")
  private Boolean isHiddenFromCustomers = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("MenuSectionId")
  private Integer menuSectionId = null;

  public CreateFullMenuSection menuSectionAvailability(MenuSectionAvailability menuSectionAvailability) {
    this.menuSectionAvailability = menuSectionAvailability;
    return this;
  }

   /**
   * Menu section availability
   * @return menuSectionAvailability
  **/
  @ApiModelProperty(value = "Menu section availability")
  public MenuSectionAvailability getMenuSectionAvailability() {
    return menuSectionAvailability;
  }

  public void setMenuSectionAvailability(MenuSectionAvailability menuSectionAvailability) {
    this.menuSectionAvailability = menuSectionAvailability;
  }

  public CreateFullMenuSection menuItems(List<CreateFullMenuSectionItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public CreateFullMenuSection addMenuItemsItem(CreateFullMenuSectionItem menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new ArrayList<CreateFullMenuSectionItem>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

   /**
   * Menu items
   * @return menuItems
  **/
  @ApiModelProperty(value = "Menu items")
  public List<CreateFullMenuSectionItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<CreateFullMenuSectionItem> menuItems) {
    this.menuItems = menuItems;
  }

  public CreateFullMenuSection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFullMenuSection description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateFullMenuSection displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Display order
   * @return displayOrder
  **/
  @ApiModelProperty(value = "Display order")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public CreateFullMenuSection isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Is available
   * @return isAvailable
  **/
  @ApiModelProperty(value = "Is available")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public CreateFullMenuSection isHiddenFromCustomers(Boolean isHiddenFromCustomers) {
    this.isHiddenFromCustomers = isHiddenFromCustomers;
    return this;
  }

   /**
   * Is hidden from customer. Perhaps when the item is out of stock.
   * @return isHiddenFromCustomers
  **/
  @ApiModelProperty(value = "Is hidden from customer. Perhaps when the item is out of stock.")
  public Boolean isIsHiddenFromCustomers() {
    return isHiddenFromCustomers;
  }

  public void setIsHiddenFromCustomers(Boolean isHiddenFromCustomers) {
    this.isHiddenFromCustomers = isHiddenFromCustomers;
  }

  public CreateFullMenuSection imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image url
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Image url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CreateFullMenuSection menuSectionId(Integer menuSectionId) {
    this.menuSectionId = menuSectionId;
    return this;
  }

   /**
   * Menu Section Id
   * @return menuSectionId
  **/
  @ApiModelProperty(value = "Menu Section Id")
  public Integer getMenuSectionId() {
    return menuSectionId;
  }

  public void setMenuSectionId(Integer menuSectionId) {
    this.menuSectionId = menuSectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFullMenuSection createFullMenuSection = (CreateFullMenuSection) o;
    return Objects.equals(this.menuSectionAvailability, createFullMenuSection.menuSectionAvailability) &&
        Objects.equals(this.menuItems, createFullMenuSection.menuItems) &&
        Objects.equals(this.name, createFullMenuSection.name) &&
        Objects.equals(this.description, createFullMenuSection.description) &&
        Objects.equals(this.displayOrder, createFullMenuSection.displayOrder) &&
        Objects.equals(this.isAvailable, createFullMenuSection.isAvailable) &&
        Objects.equals(this.isHiddenFromCustomers, createFullMenuSection.isHiddenFromCustomers) &&
        Objects.equals(this.imageUrl, createFullMenuSection.imageUrl) &&
        Objects.equals(this.menuSectionId, createFullMenuSection.menuSectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuSectionAvailability, menuItems, name, description, displayOrder, isAvailable, isHiddenFromCustomers, imageUrl, menuSectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFullMenuSection {\n");
    
    sb.append("    menuSectionAvailability: ").append(toIndentedString(menuSectionAvailability)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isHiddenFromCustomers: ").append(toIndentedString(isHiddenFromCustomers)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    menuSectionId: ").append(toIndentedString(menuSectionId)).append("\n");
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

