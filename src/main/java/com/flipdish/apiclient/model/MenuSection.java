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
import com.flipdish.apiclient.model.MenuSectionAvailability;
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
import java.util.UUID;

/**
 * Menu section
 */
@ApiModel(description = "Menu section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-08T09:43:56.761Z")
public class MenuSection {
  @SerializedName("MenuSectionId")
  private Integer menuSectionId = null;

  @SerializedName("MenuItems")
  private List<MenuSectionItem> menuItems = null;

  @SerializedName("MenuSectionAvailability")
  private MenuSectionAvailability menuSectionAvailability = null;

  @SerializedName("PublicId")
  private UUID publicId = null;

  @SerializedName("ImageName")
  private String imageName = null;

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

  public MenuSection menuSectionId(Integer menuSectionId) {
    this.menuSectionId = menuSectionId;
    return this;
  }

   /**
   * Menu section identifier
   * @return menuSectionId
  **/
  @ApiModelProperty(value = "Menu section identifier")
  public Integer getMenuSectionId() {
    return menuSectionId;
  }

  public void setMenuSectionId(Integer menuSectionId) {
    this.menuSectionId = menuSectionId;
  }

  public MenuSection menuItems(List<MenuSectionItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public MenuSection addMenuItemsItem(MenuSectionItem menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new ArrayList<MenuSectionItem>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

   /**
   * Menu items
   * @return menuItems
  **/
  @ApiModelProperty(value = "Menu items")
  public List<MenuSectionItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuSectionItem> menuItems) {
    this.menuItems = menuItems;
  }

  public MenuSection menuSectionAvailability(MenuSectionAvailability menuSectionAvailability) {
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

  public MenuSection publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Permanent reference to the item.
   * @return publicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Permanent reference to the item.")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public MenuSection imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Image Name
   * @return imageName
  **/
  @ApiModelProperty(value = "Image Name")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public MenuSection name(String name) {
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

  public MenuSection description(String description) {
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

  public MenuSection displayOrder(Integer displayOrder) {
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

  public MenuSection isAvailable(Boolean isAvailable) {
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

  public MenuSection isHiddenFromCustomers(Boolean isHiddenFromCustomers) {
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

  public MenuSection imageUrl(String imageUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuSection menuSection = (MenuSection) o;
    return Objects.equals(this.menuSectionId, menuSection.menuSectionId) &&
        Objects.equals(this.menuItems, menuSection.menuItems) &&
        Objects.equals(this.menuSectionAvailability, menuSection.menuSectionAvailability) &&
        Objects.equals(this.publicId, menuSection.publicId) &&
        Objects.equals(this.imageName, menuSection.imageName) &&
        Objects.equals(this.name, menuSection.name) &&
        Objects.equals(this.description, menuSection.description) &&
        Objects.equals(this.displayOrder, menuSection.displayOrder) &&
        Objects.equals(this.isAvailable, menuSection.isAvailable) &&
        Objects.equals(this.isHiddenFromCustomers, menuSection.isHiddenFromCustomers) &&
        Objects.equals(this.imageUrl, menuSection.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuSectionId, menuItems, menuSectionAvailability, publicId, imageName, name, description, displayOrder, isAvailable, isHiddenFromCustomers, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuSection {\n");
    
    sb.append("    menuSectionId: ").append(toIndentedString(menuSectionId)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    menuSectionAvailability: ").append(toIndentedString(menuSectionAvailability)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isHiddenFromCustomers: ").append(toIndentedString(isHiddenFromCustomers)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

