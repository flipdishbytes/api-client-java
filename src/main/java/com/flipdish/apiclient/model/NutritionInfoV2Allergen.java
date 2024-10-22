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
 * NutritionInfoV2Allergen
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-22T08:24:49.146Z")
public class NutritionInfoV2Allergen {
  @SerializedName("AllergenId")
  private String allergenId = null;

  @SerializedName("LocalizedName")
  private String localizedName = null;

  @SerializedName("ImageName")
  private String imageName = null;

  public NutritionInfoV2Allergen allergenId(String allergenId) {
    this.allergenId = allergenId;
    return this;
  }

   /**
   * AllergenId (unique string identifier)
   * @return allergenId
  **/
  @ApiModelProperty(value = "AllergenId (unique string identifier)")
  public String getAllergenId() {
    return allergenId;
  }

  public void setAllergenId(String allergenId) {
    this.allergenId = allergenId;
  }

  public NutritionInfoV2Allergen localizedName(String localizedName) {
    this.localizedName = localizedName;
    return this;
  }

   /**
   * Localized allergen name
   * @return localizedName
  **/
  @ApiModelProperty(value = "Localized allergen name")
  public String getLocalizedName() {
    return localizedName;
  }

  public void setLocalizedName(String localizedName) {
    this.localizedName = localizedName;
  }

  public NutritionInfoV2Allergen imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Name of the image file. Append it to ImageBaseUrl to get the full URL
   * @return imageName
  **/
  @ApiModelProperty(value = "Name of the image file. Append it to ImageBaseUrl to get the full URL")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfoV2Allergen nutritionInfoV2Allergen = (NutritionInfoV2Allergen) o;
    return Objects.equals(this.allergenId, nutritionInfoV2Allergen.allergenId) &&
        Objects.equals(this.localizedName, nutritionInfoV2Allergen.localizedName) &&
        Objects.equals(this.imageName, nutritionInfoV2Allergen.imageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allergenId, localizedName, imageName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfoV2Allergen {\n");
    
    sb.append("    allergenId: ").append(toIndentedString(allergenId)).append("\n");
    sb.append("    localizedName: ").append(toIndentedString(localizedName)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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

