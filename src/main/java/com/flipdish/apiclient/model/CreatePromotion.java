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
import java.util.UUID;

/**
 * Create Promotion
 */
@ApiModel(description = "Create Promotion")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T06:28:53.942Z")
public class CreatePromotion {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("MenuItemPublicIds")
  private List<UUID> menuItemPublicIds = null;

  public CreatePromotion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Promotion Name
   * @return name
  **/
  @ApiModelProperty(value = "Promotion Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatePromotion menuItemPublicIds(List<UUID> menuItemPublicIds) {
    this.menuItemPublicIds = menuItemPublicIds;
    return this;
  }

  public CreatePromotion addMenuItemPublicIdsItem(UUID menuItemPublicIdsItem) {
    if (this.menuItemPublicIds == null) {
      this.menuItemPublicIds = new ArrayList<UUID>();
    }
    this.menuItemPublicIds.add(menuItemPublicIdsItem);
    return this;
  }

   /**
   * Promotion Menu Item Awards
   * @return menuItemPublicIds
  **/
  @ApiModelProperty(value = "Promotion Menu Item Awards")
  public List<UUID> getMenuItemPublicIds() {
    return menuItemPublicIds;
  }

  public void setMenuItemPublicIds(List<UUID> menuItemPublicIds) {
    this.menuItemPublicIds = menuItemPublicIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePromotion createPromotion = (CreatePromotion) o;
    return Objects.equals(this.name, createPromotion.name) &&
        Objects.equals(this.menuItemPublicIds, createPromotion.menuItemPublicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, menuItemPublicIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePromotion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    menuItemPublicIds: ").append(toIndentedString(menuItemPublicIds)).append("\n");
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

