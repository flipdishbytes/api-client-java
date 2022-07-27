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
 * Menu Store Names
 */
@ApiModel(description = "Menu Store Names")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-27T13:13:42.784+01:00")
public class MenuStoreNames {
  @SerializedName("StoreNames")
  private List<String> storeNames = null;

  public MenuStoreNames storeNames(List<String> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public MenuStoreNames addStoreNamesItem(String storeNamesItem) {
    if (this.storeNames == null) {
      this.storeNames = new ArrayList<String>();
    }
    this.storeNames.add(storeNamesItem);
    return this;
  }

   /**
   * Names of stores associated with menu
   * @return storeNames
  **/
  @ApiModelProperty(value = "Names of stores associated with menu")
  public List<String> getStoreNames() {
    return storeNames;
  }

  public void setStoreNames(List<String> storeNames) {
    this.storeNames = storeNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuStoreNames menuStoreNames = (MenuStoreNames) o;
    return Objects.equals(this.storeNames, menuStoreNames.storeNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuStoreNames {\n");
    
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
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

