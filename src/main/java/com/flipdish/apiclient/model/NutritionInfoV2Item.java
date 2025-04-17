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
import com.flipdish.apiclient.model.NutritionInfoV2Allergen;
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
 * NutritionInfoV2Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-17T06:46:32.991Z")
public class NutritionInfoV2Item {
  @SerializedName("PublicId")
  private UUID publicId = null;

  @SerializedName("Allergens")
  private List<NutritionInfoV2Allergen> allergens = null;

  public NutritionInfoV2Item publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Menu item or menu item option set item public id
   * @return publicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Menu item or menu item option set item public id")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public NutritionInfoV2Item allergens(List<NutritionInfoV2Allergen> allergens) {
    this.allergens = allergens;
    return this;
  }

  public NutritionInfoV2Item addAllergensItem(NutritionInfoV2Allergen allergensItem) {
    if (this.allergens == null) {
      this.allergens = new ArrayList<NutritionInfoV2Allergen>();
    }
    this.allergens.add(allergensItem);
    return this;
  }

   /**
   * List of allergens for this item
   * @return allergens
  **/
  @ApiModelProperty(value = "List of allergens for this item")
  public List<NutritionInfoV2Allergen> getAllergens() {
    return allergens;
  }

  public void setAllergens(List<NutritionInfoV2Allergen> allergens) {
    this.allergens = allergens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfoV2Item nutritionInfoV2Item = (NutritionInfoV2Item) o;
    return Objects.equals(this.publicId, nutritionInfoV2Item.publicId) &&
        Objects.equals(this.allergens, nutritionInfoV2Item.allergens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicId, allergens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfoV2Item {\n");
    
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
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

