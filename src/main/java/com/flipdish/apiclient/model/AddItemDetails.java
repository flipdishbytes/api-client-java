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
 * Add item details
 */
@ApiModel(description = "Add item details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class AddItemDetails {
  @SerializedName("PromotionalItemId")
  private Integer promotionalItemId = null;

  @SerializedName("PromotionalItemName")
  private String promotionalItemName = null;

  public AddItemDetails promotionalItemId(Integer promotionalItemId) {
    this.promotionalItemId = promotionalItemId;
    return this;
  }

   /**
   * Promotional Item Id
   * @return promotionalItemId
  **/
  @ApiModelProperty(value = "Promotional Item Id")
  public Integer getPromotionalItemId() {
    return promotionalItemId;
  }

  public void setPromotionalItemId(Integer promotionalItemId) {
    this.promotionalItemId = promotionalItemId;
  }

  public AddItemDetails promotionalItemName(String promotionalItemName) {
    this.promotionalItemName = promotionalItemName;
    return this;
  }

   /**
   * Promotional Item Name
   * @return promotionalItemName
  **/
  @ApiModelProperty(value = "Promotional Item Name")
  public String getPromotionalItemName() {
    return promotionalItemName;
  }

  public void setPromotionalItemName(String promotionalItemName) {
    this.promotionalItemName = promotionalItemName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddItemDetails addItemDetails = (AddItemDetails) o;
    return Objects.equals(this.promotionalItemId, addItemDetails.promotionalItemId) &&
        Objects.equals(this.promotionalItemName, addItemDetails.promotionalItemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionalItemId, promotionalItemName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddItemDetails {\n");
    
    sb.append("    promotionalItemId: ").append(toIndentedString(promotionalItemId)).append("\n");
    sb.append("    promotionalItemName: ").append(toIndentedString(promotionalItemName)).append("\n");
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
