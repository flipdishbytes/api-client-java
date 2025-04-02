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
import com.flipdish.apiclient.model.UpdateCatalogGroupReference;
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
 * Update Catalog Item
 */
@ApiModel(description = "Update Catalog Item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T11:34:10.106Z")
public class UpdateCatalogItem {
  @SerializedName("Sku")
  private String sku = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("ImageFileName")
  private String imageFileName = null;

  @SerializedName("Alcohol")
  private Boolean alcohol = null;

  @SerializedName("Groups")
  private List<UpdateCatalogGroupReference> groups = null;

  @SerializedName("Metafields")
  private List<Metafield> metafields = null;

  public UpdateCatalogItem sku(String sku) {
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

  public UpdateCatalogItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Product name
   * @return name
  **/
  @ApiModelProperty(value = "Product name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateCatalogItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Product description
   * @return description
  **/
  @ApiModelProperty(value = "Product description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateCatalogItem price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Product price
   * minimum: 0
   * @return price
  **/
  @ApiModelProperty(value = "Product price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public UpdateCatalogItem imageFileName(String imageFileName) {
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

  public UpdateCatalogItem alcohol(Boolean alcohol) {
    this.alcohol = alcohol;
    return this;
  }

   /**
   * Product contains alcohol
   * @return alcohol
  **/
  @ApiModelProperty(value = "Product contains alcohol")
  public Boolean isAlcohol() {
    return alcohol;
  }

  public void setAlcohol(Boolean alcohol) {
    this.alcohol = alcohol;
  }

  public UpdateCatalogItem groups(List<UpdateCatalogGroupReference> groups) {
    this.groups = groups;
    return this;
  }

  public UpdateCatalogItem addGroupsItem(UpdateCatalogGroupReference groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<UpdateCatalogGroupReference>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Collection of groups associated with this item
   * @return groups
  **/
  @ApiModelProperty(value = "Collection of groups associated with this item")
  public List<UpdateCatalogGroupReference> getGroups() {
    return groups;
  }

  public void setGroups(List<UpdateCatalogGroupReference> groups) {
    this.groups = groups;
  }

  public UpdateCatalogItem metafields(List<Metafield> metafields) {
    this.metafields = metafields;
    return this;
  }

  public UpdateCatalogItem addMetafieldsItem(Metafield metafieldsItem) {
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
    UpdateCatalogItem updateCatalogItem = (UpdateCatalogItem) o;
    return Objects.equals(this.sku, updateCatalogItem.sku) &&
        Objects.equals(this.name, updateCatalogItem.name) &&
        Objects.equals(this.description, updateCatalogItem.description) &&
        Objects.equals(this.price, updateCatalogItem.price) &&
        Objects.equals(this.imageFileName, updateCatalogItem.imageFileName) &&
        Objects.equals(this.alcohol, updateCatalogItem.alcohol) &&
        Objects.equals(this.groups, updateCatalogItem.groups) &&
        Objects.equals(this.metafields, updateCatalogItem.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name, description, price, imageFileName, alcohol, groups, metafields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCatalogItem {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    alcohol: ").append(toIndentedString(alcohol)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

