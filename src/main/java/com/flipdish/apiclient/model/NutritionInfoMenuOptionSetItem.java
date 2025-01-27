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
import com.flipdish.apiclient.model.NutritionInfoLabel;
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
 * NutritionInfoMenuOptionSetItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-27T14:05:13.934Z")
public class NutritionInfoMenuOptionSetItem {
  @SerializedName("PublicId")
  private UUID publicId = null;

  @SerializedName("Labels")
  private List<NutritionInfoLabel> labels = null;

  public NutritionInfoMenuOptionSetItem publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Menu item option set item public id
   * @return publicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Menu item option set item public id")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public NutritionInfoMenuOptionSetItem labels(List<NutritionInfoLabel> labels) {
    this.labels = labels;
    return this;
  }

  public NutritionInfoMenuOptionSetItem addLabelsItem(NutritionInfoLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NutritionInfoLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * List of Nutrition Info Labels for this menu item option set item
   * @return labels
  **/
  @ApiModelProperty(value = "List of Nutrition Info Labels for this menu item option set item")
  public List<NutritionInfoLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<NutritionInfoLabel> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NutritionInfoMenuOptionSetItem nutritionInfoMenuOptionSetItem = (NutritionInfoMenuOptionSetItem) o;
    return Objects.equals(this.publicId, nutritionInfoMenuOptionSetItem.publicId) &&
        Objects.equals(this.labels, nutritionInfoMenuOptionSetItem.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicId, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutritionInfoMenuOptionSetItem {\n");
    
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

