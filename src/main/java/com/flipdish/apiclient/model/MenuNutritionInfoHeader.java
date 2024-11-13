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
 * MenuNutritionInfoHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T16:56:42.691Z")
public class MenuNutritionInfoHeader {
  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("NutritionInfoVersionGuid")
  private UUID nutritionInfoVersionGuid = null;

  @SerializedName("AbsoluteUrl")
  private String absoluteUrl = null;

  public MenuNutritionInfoHeader menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu Id
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu Id")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public MenuNutritionInfoHeader nutritionInfoVersionGuid(UUID nutritionInfoVersionGuid) {
    this.nutritionInfoVersionGuid = nutritionInfoVersionGuid;
    return this;
  }

   /**
   * Nutrition information version guid (generated every time the nutrition information is updated)
   * @return nutritionInfoVersionGuid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Nutrition information version guid (generated every time the nutrition information is updated)")
  public UUID getNutritionInfoVersionGuid() {
    return nutritionInfoVersionGuid;
  }

  public void setNutritionInfoVersionGuid(UUID nutritionInfoVersionGuid) {
    this.nutritionInfoVersionGuid = nutritionInfoVersionGuid;
  }

  public MenuNutritionInfoHeader absoluteUrl(String absoluteUrl) {
    this.absoluteUrl = absoluteUrl;
    return this;
  }

   /**
   * Absolute URL of the nutrition information json file
   * @return absoluteUrl
  **/
  @ApiModelProperty(value = "Absolute URL of the nutrition information json file")
  public String getAbsoluteUrl() {
    return absoluteUrl;
  }

  public void setAbsoluteUrl(String absoluteUrl) {
    this.absoluteUrl = absoluteUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuNutritionInfoHeader menuNutritionInfoHeader = (MenuNutritionInfoHeader) o;
    return Objects.equals(this.menuId, menuNutritionInfoHeader.menuId) &&
        Objects.equals(this.nutritionInfoVersionGuid, menuNutritionInfoHeader.nutritionInfoVersionGuid) &&
        Objects.equals(this.absoluteUrl, menuNutritionInfoHeader.absoluteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, nutritionInfoVersionGuid, absoluteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuNutritionInfoHeader {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    nutritionInfoVersionGuid: ").append(toIndentedString(nutritionInfoVersionGuid)).append("\n");
    sb.append("    absoluteUrl: ").append(toIndentedString(absoluteUrl)).append("\n");
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

