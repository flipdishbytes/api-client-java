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
import com.flipdish.apiclient.model.CreateProductReference;
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
 * Create a Catalog Group
 */
@ApiModel(description = "Create a Catalog Group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-28T15:18:01.989+01:00")
public class CreateGroup {
  @SerializedName("MinSelectCount")
  private Integer minSelectCount = null;

  @SerializedName("MaxSelectCount")
  private Integer maxSelectCount = null;

  @SerializedName("Products")
  private List<CreateProductReference> products = null;

  @SerializedName("Metafields")
  private List<Metafield> metafields = null;

  /**
   * Type of group (ModifierGroup, etc)
   */
  @JsonAdapter(GroupTypeEnum.Adapter.class)
  public enum GroupTypeEnum {
    MODIFIERGROUP("ModifierGroup");

    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupTypeEnum fromValue(String text) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GroupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("GroupType")
  private GroupTypeEnum groupType = null;

  @SerializedName("Sku")
  private String sku = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AutogenerateDisplayText")
  private Boolean autogenerateDisplayText = null;

  @SerializedName("ImageFileName")
  private String imageFileName = null;

  public CreateGroup minSelectCount(Integer minSelectCount) {
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

  public CreateGroup maxSelectCount(Integer maxSelectCount) {
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

  public CreateGroup products(List<CreateProductReference> products) {
    this.products = products;
    return this;
  }

  public CreateGroup addProductsItem(CreateProductReference productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<CreateProductReference>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Collection of items associated with this group
   * @return products
  **/
  @ApiModelProperty(value = "Collection of items associated with this group")
  public List<CreateProductReference> getProducts() {
    return products;
  }

  public void setProducts(List<CreateProductReference> products) {
    this.products = products;
  }

  public CreateGroup metafields(List<Metafield> metafields) {
    this.metafields = metafields;
    return this;
  }

  public CreateGroup addMetafieldsItem(Metafield metafieldsItem) {
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

  public CreateGroup groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Type of group (ModifierGroup, etc)
   * @return groupType
  **/
  @ApiModelProperty(required = true, value = "Type of group (ModifierGroup, etc)")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }

  public CreateGroup sku(String sku) {
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

  public CreateGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateGroup autogenerateDisplayText(Boolean autogenerateDisplayText) {
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

  public CreateGroup imageFileName(String imageFileName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroup createGroup = (CreateGroup) o;
    return Objects.equals(this.minSelectCount, createGroup.minSelectCount) &&
        Objects.equals(this.maxSelectCount, createGroup.maxSelectCount) &&
        Objects.equals(this.products, createGroup.products) &&
        Objects.equals(this.metafields, createGroup.metafields) &&
        Objects.equals(this.groupType, createGroup.groupType) &&
        Objects.equals(this.sku, createGroup.sku) &&
        Objects.equals(this.name, createGroup.name) &&
        Objects.equals(this.autogenerateDisplayText, createGroup.autogenerateDisplayText) &&
        Objects.equals(this.imageFileName, createGroup.imageFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minSelectCount, maxSelectCount, products, metafields, groupType, sku, name, autogenerateDisplayText, imageFileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroup {\n");
    
    sb.append("    minSelectCount: ").append(toIndentedString(minSelectCount)).append("\n");
    sb.append("    maxSelectCount: ").append(toIndentedString(maxSelectCount)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    metafields: ").append(toIndentedString(metafields)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autogenerateDisplayText: ").append(toIndentedString(autogenerateDisplayText)).append("\n");
    sb.append("    imageFileName: ").append(toIndentedString(imageFileName)).append("\n");
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
