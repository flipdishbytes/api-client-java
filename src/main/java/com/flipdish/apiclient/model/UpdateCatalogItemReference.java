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
 * Data to update a {!:CatalogGroupReference}
 */
@ApiModel(description = "Data to update a {!:CatalogGroupReference}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T12:13:53.469Z")
public class UpdateCatalogItemReference {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  /**
   * Type of the SupProduct
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

  @SerializedName("PreselectedQuantity")
  private Integer preselectedQuantity = null;

  public UpdateCatalogItemReference catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Identifier of the CatalogItemId to use as SubProduct
   * @return catalogItemId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the CatalogItemId to use as SubProduct")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public UpdateCatalogItemReference itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Type of the SupProduct
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "Type of the SupProduct")
  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public UpdateCatalogItemReference preselectedQuantity(Integer preselectedQuantity) {
    this.preselectedQuantity = preselectedQuantity;
    return this;
  }

   /**
   * Quantity of the modifier that will be set when the parent product is placed in the basket
   * @return preselectedQuantity
  **/
  @ApiModelProperty(value = "Quantity of the modifier that will be set when the parent product is placed in the basket")
  public Integer getPreselectedQuantity() {
    return preselectedQuantity;
  }

  public void setPreselectedQuantity(Integer preselectedQuantity) {
    this.preselectedQuantity = preselectedQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCatalogItemReference updateCatalogItemReference = (UpdateCatalogItemReference) o;
    return Objects.equals(this.catalogItemId, updateCatalogItemReference.catalogItemId) &&
        Objects.equals(this.itemType, updateCatalogItemReference.itemType) &&
        Objects.equals(this.preselectedQuantity, updateCatalogItemReference.preselectedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, itemType, preselectedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCatalogItemReference {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    preselectedQuantity: ").append(toIndentedString(preselectedQuantity)).append("\n");
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

