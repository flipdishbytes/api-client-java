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
import com.flipdish.apiclient.model.ProductItem;
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
 * Add Product to a Menu
 */
@ApiModel(description = "Add Product to a Menu")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T12:21:08.098Z")
public class CreateMenuSectionItemFromProducts {
  @SerializedName("ProductItems")
  private List<ProductItem> productItems = new ArrayList<ProductItem>();

  public CreateMenuSectionItemFromProducts productItems(List<ProductItem> productItems) {
    this.productItems = productItems;
    return this;
  }

  public CreateMenuSectionItemFromProducts addProductItemsItem(ProductItem productItemsItem) {
    this.productItems.add(productItemsItem);
    return this;
  }

   /**
   * List of Products to add to the section
   * @return productItems
  **/
  @ApiModelProperty(required = true, value = "List of Products to add to the section")
  public List<ProductItem> getProductItems() {
    return productItems;
  }

  public void setProductItems(List<ProductItem> productItems) {
    this.productItems = productItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMenuSectionItemFromProducts createMenuSectionItemFromProducts = (CreateMenuSectionItemFromProducts) o;
    return Objects.equals(this.productItems, createMenuSectionItemFromProducts.productItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMenuSectionItemFromProducts {\n");
    
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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

