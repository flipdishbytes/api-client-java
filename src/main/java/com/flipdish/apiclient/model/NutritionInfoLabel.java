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

/**
 * NutritionInfoLabel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T11:34:10.106Z")
public class NutritionInfoLabel {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Values")
  private List<String> values = null;

  @SerializedName("IconUrl")
  private String iconUrl = null;

  public NutritionInfoLabel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the allergen / ingredient
   * @return name
  **/
  @ApiModelProperty(value = "Name of the allergen / ingredient")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NutritionInfoLabel values(List<String> values) {
    this.values = values;
    return this;
  }

  public NutritionInfoLabel addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Optional list of values for the allergen / ingredient
   * @return values
  **/
  @ApiModelProperty(value = "Optional list of values for the allergen / ingredient")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public NutritionInfoLabel iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Url to the icon for the allergen / ingredient
   * @return iconUrl
  **/
  @ApiModelProperty(value = "Url to the icon for the allergen / ingredient")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfoLabel nutritionInfoLabel = (NutritionInfoLabel) o;
    return Objects.equals(this.name, nutritionInfoLabel.name) &&
        Objects.equals(this.values, nutritionInfoLabel.values) &&
        Objects.equals(this.iconUrl, nutritionInfoLabel.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, iconUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfoLabel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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

