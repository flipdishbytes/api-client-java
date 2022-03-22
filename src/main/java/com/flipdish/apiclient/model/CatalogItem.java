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
import com.flipdish.apiclient.model.CatalogGroupReference;
import com.flipdish.apiclient.model.Metafield;
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
 * CatalogItem
 */
@ApiModel(description = "CatalogItem")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-22T10:31:33.690Z")
public class CatalogItem {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  @SerializedName("IsArchived")
  private Boolean isArchived = null;

  @SerializedName("Groups")
  private List<CatalogGroupReference> groups = null;

  @SerializedName("Metafields")
  private List<Metafield> metafields = null;

  /**
   * Type of item (Product, Modifier, etc)
   */
  @JsonAdapter(ItemTypeEnum.Adapter.class)
  public enum ItemTypeEnum {
    PRODUCT("Product"),
    
    MODIFIER("Modifier");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ItemTypeEnum fromValue(String text) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ItemTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ItemType")
  private ItemTypeEnum itemType = null;

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

  public CatalogItem catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Unique catalog Item id
   * @return catalogItemId
  **/
  @ApiModelProperty(value = "Unique catalog Item id")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public CatalogItem isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Returns true if the item is archived
   * @return isArchived
  **/
  @ApiModelProperty(value = "Returns true if the item is archived")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public CatalogItem groups(List<CatalogGroupReference> groups) {
    this.groups = groups;
    return this;
  }

  public CatalogItem addGroupsItem(CatalogGroupReference groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<CatalogGroupReference>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Collection of groups associated with this item
   * @return groups
  **/
  @ApiModelProperty(value = "Collection of groups associated with this item")
  public List<CatalogGroupReference> getGroups() {
    return groups;
  }

  public void setGroups(List<CatalogGroupReference> groups) {
    this.groups = groups;
  }

  public CatalogItem metafields(List<Metafield> metafields) {
    this.metafields = metafields;
    return this;
  }

  public CatalogItem addMetafieldsItem(Metafield metafieldsItem) {
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

  public CatalogItem itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Type of item (Product, Modifier, etc)
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "Type of item (Product, Modifier, etc)")
  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public CatalogItem sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Stock Keeping Unit (SKU)
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "Stock Keeping Unit (SKU)")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public CatalogItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Item name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Item name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Item description
   * @return description
  **/
  @ApiModelProperty(value = "Item description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogItem price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Item price
   * minimum: 0
   * @return price
  **/
  @ApiModelProperty(required = true, value = "Item price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public CatalogItem imageFileName(String imageFileName) {
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

  public CatalogItem alcohol(Boolean alcohol) {
    this.alcohol = alcohol;
    return this;
  }

   /**
   * item contains alcohol
   * @return alcohol
  **/
  @ApiModelProperty(value = "item contains alcohol")
  public Boolean isAlcohol() {
    return alcohol;
  }

  public void setAlcohol(Boolean alcohol) {
    this.alcohol = alcohol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItem catalogItem = (CatalogItem) o;
    return Objects.equals(this.catalogItemId, catalogItem.catalogItemId) &&
        Objects.equals(this.isArchived, catalogItem.isArchived) &&
        Objects.equals(this.groups, catalogItem.groups) &&
        Objects.equals(this.metafields, catalogItem.metafields) &&
        Objects.equals(this.itemType, catalogItem.itemType) &&
        Objects.equals(this.sku, catalogItem.sku) &&
        Objects.equals(this.name, catalogItem.name) &&
        Objects.equals(this.description, catalogItem.description) &&
        Objects.equals(this.price, catalogItem.price) &&
        Objects.equals(this.imageFileName, catalogItem.imageFileName) &&
        Objects.equals(this.alcohol, catalogItem.alcohol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, isArchived, groups, metafields, itemType, sku, name, description, price, imageFileName, alcohol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItem {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    metafields: ").append(toIndentedString(metafields)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
    sb.append("    alcohol: ").append(toIndentedString(alcohol)).append("\n");
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

