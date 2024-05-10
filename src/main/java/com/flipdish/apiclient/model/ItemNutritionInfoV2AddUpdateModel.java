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
 * ItemNutritionInfoV2AddUpdateModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-10T13:57:28.794Z")
public class ItemNutritionInfoV2AddUpdateModel {
  @SerializedName("AllergenIds")
  private List<String> allergenIds = null;

  public ItemNutritionInfoV2AddUpdateModel allergenIds(List<String> allergenIds) {
    this.allergenIds = allergenIds;
    return this;
  }

  public ItemNutritionInfoV2AddUpdateModel addAllergenIdsItem(String allergenIdsItem) {
    if (this.allergenIds == null) {
      this.allergenIds = new ArrayList<String>();
    }
    this.allergenIds.add(allergenIdsItem);
    return this;
  }

   /**
   * Get allergenIds
   * @return allergenIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllergenIds() {
    return allergenIds;
  }

  public void setAllergenIds(List<String> allergenIds) {
    this.allergenIds = allergenIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNutritionInfoV2AddUpdateModel itemNutritionInfoV2AddUpdateModel = (ItemNutritionInfoV2AddUpdateModel) o;
    return Objects.equals(this.allergenIds, itemNutritionInfoV2AddUpdateModel.allergenIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allergenIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNutritionInfoV2AddUpdateModel {\n");
    
    sb.append("    allergenIds: ").append(toIndentedString(allergenIds)).append("\n");
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

