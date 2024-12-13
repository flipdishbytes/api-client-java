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
import com.flipdish.apiclient.model.NutritionInfoItemAddUpdateLabelModel;
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
 * ItemNutritionInfoAddUpdateModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T10:34:03.335Z")
public class ItemNutritionInfoAddUpdateModel {
  @SerializedName("Labels")
  private List<NutritionInfoItemAddUpdateLabelModel> labels = null;

  public ItemNutritionInfoAddUpdateModel labels(List<NutritionInfoItemAddUpdateLabelModel> labels) {
    this.labels = labels;
    return this;
  }

  public ItemNutritionInfoAddUpdateModel addLabelsItem(NutritionInfoItemAddUpdateLabelModel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NutritionInfoItemAddUpdateLabelModel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<NutritionInfoItemAddUpdateLabelModel> getLabels() {
    return labels;
  }

  public void setLabels(List<NutritionInfoItemAddUpdateLabelModel> labels) {
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
    ItemNutritionInfoAddUpdateModel itemNutritionInfoAddUpdateModel = (ItemNutritionInfoAddUpdateModel) o;
    return Objects.equals(this.labels, itemNutritionInfoAddUpdateModel.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNutritionInfoAddUpdateModel {\n");
    
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

