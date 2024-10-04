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
 * MenuZone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-04T11:36:58.526Z")
public class MenuZone {
  @SerializedName("MenuZoneId")
  private Integer menuZoneId = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ImageName")
  private String imageName = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  public MenuZone menuZoneId(Integer menuZoneId) {
    this.menuZoneId = menuZoneId;
    return this;
  }

   /**
   * Get menuZoneId
   * @return menuZoneId
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuZoneId() {
    return menuZoneId;
  }

  public void setMenuZoneId(Integer menuZoneId) {
    this.menuZoneId = menuZoneId;
  }

  public MenuZone menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Get menuId
   * @return menuId
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public MenuZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuZone description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MenuZone imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @ApiModelProperty(value = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public MenuZone displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuZone menuZone = (MenuZone) o;
    return Objects.equals(this.menuZoneId, menuZone.menuZoneId) &&
        Objects.equals(this.menuId, menuZone.menuId) &&
        Objects.equals(this.name, menuZone.name) &&
        Objects.equals(this.description, menuZone.description) &&
        Objects.equals(this.imageName, menuZone.imageName) &&
        Objects.equals(this.displayOrder, menuZone.displayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuZoneId, menuId, name, description, imageName, displayOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuZone {\n");
    
    sb.append("    menuZoneId: ").append(toIndentedString(menuZoneId)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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

