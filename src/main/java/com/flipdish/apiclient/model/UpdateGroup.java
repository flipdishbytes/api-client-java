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
import com.flipdish.apiclient.model.Metafield;
import com.flipdish.apiclient.model.UpdateProductReference;
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
 * Update Catalog Group
 */
@ApiModel(description = "Update Catalog Group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-21T12:49:34.092+01:00")
public class UpdateGroup {
  @SerializedName("Sku")
  private String sku = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AutogenerateDisplayText")
  private Boolean autogenerateDisplayText = null;

  @SerializedName("ImageFileName")
  private String imageFileName = null;

  @SerializedName("MinSelectCount")
  private Integer minSelectCount = null;

  @SerializedName("MaxSelectCount")
  private Integer maxSelectCount = null;

  @SerializedName("Products")
  private List<UpdateProductReference> products = null;

  @SerializedName("Metafields")
  private List<Metafield> metafields = null;

  public UpdateGroup sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Stock Keeping Unit (SKU)
   * @return sku
  **/
  @ApiModelProperty(value = "Stock Keeping Unit (SKU)")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public UpdateGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @ApiModelProperty(value = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateGroup autogenerateDisplayText(Boolean autogenerateDisplayText) {
    this.autogenerateDisplayText = autogenerateDisplayText;
    return this;
  }

   /**
   * Autogenerate display text in ordering applications
   * @return autogenerateDisplayText
  **/
  @ApiModelProperty(value = "Autogenerate display text in ordering applications")
  public Boolean isAutogenerateDisplayText() {
    return autogenerateDisplayText;
  }

  public void setAutogenerateDisplayText(Boolean autogenerateDisplayText) {
    this.autogenerateDisplayText = autogenerateDisplayText;
  }

  public UpdateGroup imageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
    return this;
  }

   /**
   * Image File Name
   * @return imageFileName
  **/
  @ApiModelProperty(value = "Image File Name")
  public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }

  public UpdateGroup minSelectCount(Integer minSelectCount) {
    this.minSelectCount = minSelectCount;
    return this;
  }

   /**
   * Minimum number of items that the user has to select
   * @return minSelectCount
  **/
  @ApiModelProperty(value = "Minimum number of items that the user has to select")
  public Integer getMinSelectCount() {
    return minSelectCount;
  }

  public void setMinSelectCount(Integer minSelectCount) {
    this.minSelectCount = minSelectCount;
  }

  public UpdateGroup maxSelectCount(Integer maxSelectCount) {
    this.maxSelectCount = maxSelectCount;
    return this;
  }

   /**
   * Maximum number of items that the user has to select
   * @return maxSelectCount
  **/
  @ApiModelProperty(value = "Maximum number of items that the user has to select")
  public Integer getMaxSelectCount() {
    return maxSelectCount;
  }

  public void setMaxSelectCount(Integer maxSelectCount) {
    this.maxSelectCount = maxSelectCount;
  }

  public UpdateGroup products(List<UpdateProductReference> products) {
    this.products = products;
    return this;
  }

  public UpdateGroup addProductsItem(UpdateProductReference productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<UpdateProductReference>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Collection of items associated with this group
   * @return products
  **/
  @ApiModelProperty(value = "Collection of items associated with this group")
  public List<UpdateProductReference> getProducts() {
    return products;
  }

  public void setProducts(List<UpdateProductReference> products) {
    this.products = products;
  }

  public UpdateGroup metafields(List<Metafield> metafields) {
    this.metafields = metafields;
    return this;
  }

  public UpdateGroup addMetafieldsItem(Metafield metafieldsItem) {
    if (this.metafields == null) {
      this.metafields = new ArrayList<Metafield>();
    }
    this.metafields.add(metafieldsItem);
    return this;
  }

   /**
   * Collection of metafields
   * @return metafields
  **/
  @ApiModelProperty(value = "Collection of metafields")
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroup updateGroup = (UpdateGroup) o;
    return Objects.equals(this.sku, updateGroup.sku) &&
        Objects.equals(this.name, updateGroup.name) &&
        Objects.equals(this.autogenerateDisplayText, updateGroup.autogenerateDisplayText) &&
        Objects.equals(this.imageFileName, updateGroup.imageFileName) &&
        Objects.equals(this.minSelectCount, updateGroup.minSelectCount) &&
        Objects.equals(this.maxSelectCount, updateGroup.maxSelectCount) &&
        Objects.equals(this.products, updateGroup.products) &&
        Objects.equals(this.metafields, updateGroup.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name, autogenerateDisplayText, imageFileName, minSelectCount, maxSelectCount, products, metafields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroup {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autogenerateDisplayText: ").append(toIndentedString(autogenerateDisplayText)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    minSelectCount: ").append(toIndentedString(minSelectCount)).append("\n");
    sb.append("    maxSelectCount: ").append(toIndentedString(maxSelectCount)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    metafields: ").append(toIndentedString(metafields)).append("\n");
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

