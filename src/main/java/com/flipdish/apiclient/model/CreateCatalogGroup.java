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
import com.flipdish.apiclient.model.CreateCatalogItemReference;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-04T11:37:01.767+01:00")
public class CreateCatalogGroup {
  @SerializedName("MinSelectCount")
  private Integer minSelectCount = null;

  @SerializedName("MaxSelectCount")
  private Integer maxSelectCount = null;

  @SerializedName("Items")
  private List<CreateCatalogItemReference> items = null;

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

  public CreateCatalogGroup minSelectCount(Integer minSelectCount) {
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

  public CreateCatalogGroup maxSelectCount(Integer maxSelectCount) {
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

  public CreateCatalogGroup items(List<CreateCatalogItemReference> items) {
    this.items = items;
    return this;
  }

  public CreateCatalogGroup addItemsItem(CreateCatalogItemReference itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<CreateCatalogItemReference>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Collection of items associated with this group
   * @return items
  **/
  @ApiModelProperty(value = "Collection of items associated with this group")
  public List<CreateCatalogItemReference> getItems() {
    return items;
  }

  public void setItems(List<CreateCatalogItemReference> items) {
    this.items = items;
  }

  public CreateCatalogGroup metafields(List<Metafield> metafields) {
    this.metafields = metafields;
    return this;
  }

  public CreateCatalogGroup addMetafieldsItem(Metafield metafieldsItem) {
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

  public CreateCatalogGroup groupType(GroupTypeEnum groupType) {
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

  public CreateCatalogGroup sku(String sku) {
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

  public CreateCatalogGroup name(String name) {
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

  public CreateCatalogGroup autogenerateDisplayText(Boolean autogenerateDisplayText) {
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

  public CreateCatalogGroup imageFileName(String imageFileName) {
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
    CreateCatalogGroup createCatalogGroup = (CreateCatalogGroup) o;
    return Objects.equals(this.minSelectCount, createCatalogGroup.minSelectCount) &&
        Objects.equals(this.maxSelectCount, createCatalogGroup.maxSelectCount) &&
        Objects.equals(this.items, createCatalogGroup.items) &&
        Objects.equals(this.metafields, createCatalogGroup.metafields) &&
        Objects.equals(this.groupType, createCatalogGroup.groupType) &&
        Objects.equals(this.sku, createCatalogGroup.sku) &&
        Objects.equals(this.name, createCatalogGroup.name) &&
        Objects.equals(this.autogenerateDisplayText, createCatalogGroup.autogenerateDisplayText) &&
        Objects.equals(this.imageFileName, createCatalogGroup.imageFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minSelectCount, maxSelectCount, items, metafields, groupType, sku, name, autogenerateDisplayText, imageFileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCatalogGroup {\n");
    
    sb.append("    minSelectCount: ").append(toIndentedString(minSelectCount)).append("\n");
    sb.append("    maxSelectCount: ").append(toIndentedString(maxSelectCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

