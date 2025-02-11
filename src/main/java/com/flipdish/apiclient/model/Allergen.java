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
 * Allergen
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T16:24:58.787Z")
public class Allergen {
  @SerializedName("AllergenId")
  private String allergenId = null;

  @SerializedName("LocalizedName")
  private String localizedName = null;

  @SerializedName("IconUrl")
  private String iconUrl = null;

  public Allergen allergenId(String allergenId) {
    this.allergenId = allergenId;
    return this;
  }

   /**
   * A unique identifier for the allergen
   * @return allergenId
  **/
  @ApiModelProperty(value = "A unique identifier for the allergen")
  public String getAllergenId() {
    return allergenId;
  }

  public void setAllergenId(String allergenId) {
    this.allergenId = allergenId;
  }

  public Allergen localizedName(String localizedName) {
    this.localizedName = localizedName;
    return this;
  }

   /**
   * Localized name of the allergen
   * @return localizedName
  **/
  @ApiModelProperty(value = "Localized name of the allergen")
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  public Allergen iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Url to the icon for the allergen
   * @return iconUrl
  **/
  @ApiModelProperty(value = "Url to the icon for the allergen")
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
    Allergen allergen = (Allergen) o;
    return Objects.equals(this.allergenId, allergen.allergenId) &&
        Objects.equals(this.localizedName, allergen.localizedName) &&
        Objects.equals(this.iconUrl, allergen.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allergenId, localizedName, iconUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allergen {\n");
    
    sb.append("    allergenId: ").append(toIndentedString(allergenId)).append("\n");
    sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
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

