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
import com.flipdish.apiclient.model.ObjectDisplayOrder;
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
 * Collection of Display Orders for a Menu Object (Menu Section / Menu Items / Option Sets etc)
 */
@ApiModel(description = "Collection of Display Orders for a Menu Object (Menu Section / Menu Items / Option Sets etc)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class MenuObjectDisplayOrders {
  @SerializedName("DisplayOrders")
  private List<ObjectDisplayOrder> displayOrders = null;

  public MenuObjectDisplayOrders displayOrders(List<ObjectDisplayOrder> displayOrders) {
    this.displayOrders = displayOrders;
    return this;
  }

  public MenuObjectDisplayOrders addDisplayOrdersItem(ObjectDisplayOrder displayOrdersItem) {
    if (this.displayOrders == null) {
      this.displayOrders = new ArrayList<ObjectDisplayOrder>();
    }
    this.displayOrders.add(displayOrdersItem);
    return this;
  }

   /**
   * List of Objects and their new Display Orders
   * @return displayOrders
  **/
  @ApiModelProperty(value = "List of Objects and their new Display Orders")
  public List<ObjectDisplayOrder> getDisplayOrders() {
    return displayOrders;
  }

  public void setDisplayOrders(List<ObjectDisplayOrder> displayOrders) {
    this.displayOrders = displayOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuObjectDisplayOrders menuObjectDisplayOrders = (MenuObjectDisplayOrders) o;
    return Objects.equals(this.displayOrders, menuObjectDisplayOrders.displayOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOrders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuObjectDisplayOrders {\n");
    
    sb.append("    displayOrders: ").append(toIndentedString(displayOrders)).append("\n");
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

