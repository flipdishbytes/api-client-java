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
 * Information to add a CatalogItem to a Menu
 */
@ApiModel(description = "Information to add a CatalogItem to a Menu")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-22T15:57:23.167Z")
public class MenuCatalogItem {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  /**
   * Small | Medium | Large | HiddenImage  Affects the layout of the menu.
   */
  @JsonAdapter(CellLayoutTypeEnum.Adapter.class)
  public enum CellLayoutTypeEnum {
    SMALL("Small"),
    
    MEDIUM("Medium"),
    
    LARGE("Large"),
    
    HIDDENIMAGE("HiddenImage");

    private String value;

    CellLayoutTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CellLayoutTypeEnum fromValue(String text) {
      for (CellLayoutTypeEnum b : CellLayoutTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CellLayoutTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CellLayoutTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CellLayoutTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CellLayoutTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CellLayoutType")
  private CellLayoutTypeEnum cellLayoutType = null;

  public MenuCatalogItem catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Product Id to the product to add as Menu Item
   * @return catalogItemId
  **/
  @ApiModelProperty(required = true, value = "Product Id to the product to add as Menu Item")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public MenuCatalogItem cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
    this.cellLayoutType = cellLayoutType;
    return this;
  }

   /**
   * Small | Medium | Large | HiddenImage  Affects the layout of the menu.
   * @return cellLayoutType
  **/
  @ApiModelProperty(value = "Small | Medium | Large | HiddenImage  Affects the layout of the menu.")
  public CellLayoutTypeEnum getCellLayoutType() {
    return cellLayoutType;
  }

  public void setCellLayoutType(CellLayoutTypeEnum cellLayoutType) {
    this.cellLayoutType = cellLayoutType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuCatalogItem menuCatalogItem = (MenuCatalogItem) o;
    return Objects.equals(this.catalogItemId, menuCatalogItem.catalogItemId) &&
        Objects.equals(this.cellLayoutType, menuCatalogItem.cellLayoutType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, cellLayoutType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuCatalogItem {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    cellLayoutType: ").append(toIndentedString(cellLayoutType)).append("\n");
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

