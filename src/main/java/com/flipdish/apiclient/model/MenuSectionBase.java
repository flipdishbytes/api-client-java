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
import java.util.UUID;

/**
 * Menu section
 */
@ApiModel(description = "Menu section")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class MenuSectionBase {
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

  @SerializedName("PublicId")
  private UUID publicId = null;

  public MenuSectionBase name(String name) {
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

  public MenuSectionBase description(String description) {
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

  public MenuSectionBase displayOrder(Integer displayOrder) {
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

  public MenuSectionBase isAvailable(Boolean isAvailable) {
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

  public MenuSectionBase isHiddenFromCustomers(Boolean isHiddenFromCustomers) {
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

  public MenuSectionBase imageUrl(String imageUrl) {
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

  public MenuSectionBase menuSectionId(Integer menuSectionId) {
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

  public MenuSectionBase publicId(UUID publicId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuSectionBase menuSectionBase = (MenuSectionBase) o;
    return Objects.equals(this.name, menuSectionBase.name) &&
        Objects.equals(this.description, menuSectionBase.description) &&
        Objects.equals(this.displayOrder, menuSectionBase.displayOrder) &&
        Objects.equals(this.isAvailable, menuSectionBase.isAvailable) &&
        Objects.equals(this.isHiddenFromCustomers, menuSectionBase.isHiddenFromCustomers) &&
        Objects.equals(this.imageUrl, menuSectionBase.imageUrl) &&
        Objects.equals(this.menuSectionId, menuSectionBase.menuSectionId) &&
        Objects.equals(this.publicId, menuSectionBase.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, displayOrder, isAvailable, isHiddenFromCustomers, imageUrl, menuSectionId, publicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuSectionBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isHiddenFromCustomers: ").append(toIndentedString(isHiddenFromCustomers)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    menuSectionId: ").append(toIndentedString(menuSectionId)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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

