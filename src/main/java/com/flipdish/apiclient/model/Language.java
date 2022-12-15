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
 * Sorted Language
 */
@ApiModel(description = "Sorted Language")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-15T10:26:14.408Z")
public class Language {
  @SerializedName("LanguageId")
  private String languageId = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("Name")
  private String name = null;

  public Language languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * ISO 639-1 Language Code
   * @return languageId
  **/
  @ApiModelProperty(value = "ISO 639-1 Language Code")
  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public Language displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Display Order
   * @return displayOrder
  **/
  @ApiModelProperty(value = "Display Order")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public Language name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Language Name
   * @return name
  **/
  @ApiModelProperty(value = "Language Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.languageId, language.languageId) &&
        Objects.equals(this.displayOrder, language.displayOrder) &&
        Objects.equals(this.name, language.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, displayOrder, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

