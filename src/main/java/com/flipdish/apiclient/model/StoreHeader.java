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
 * Represents the most basic store information, used mostly for searches
 */
@ApiModel(description = "Represents the most basic store information, used mostly for searches")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-12T09:58:30.363Z")
public class StoreHeader {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Category")
  private String category = null;

  public StoreHeader storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store identifier
   * @return storeId
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreHeader category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Name
   * @return category
  **/
  @ApiModelProperty(value = "Name")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreHeader storeHeader = (StoreHeader) o;
    return Objects.equals(this.storeId, storeHeader.storeId) &&
        Objects.equals(this.name, storeHeader.name) &&
        Objects.equals(this.category, storeHeader.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, name, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreHeader {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

