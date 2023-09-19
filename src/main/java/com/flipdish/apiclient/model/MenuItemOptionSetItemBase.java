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
 * Menu item option set item
 */
@ApiModel(description = "Menu item option set item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-19T12:03:09.347Z")
public class MenuItemOptionSetItemBase {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  /**
   * Small | Medium | Large  Affects the layout of the menu.
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

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  public MenuItemOptionSetItemBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuItemOptionSetItemBase price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price
   * @return price
  **/
  @ApiModelProperty(value = "Price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MenuItemOptionSetItemBase isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * Is available
   * @return isAvailable
  **/
  @ApiModelProperty(value = "Is available")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public MenuItemOptionSetItemBase displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Display order. Displayed in ascending order.
   * @return displayOrder
  **/
  @ApiModelProperty(value = "Display order. Displayed in ascending order.")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public MenuItemOptionSetItemBase cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
    this.cellLayoutType = cellLayoutType;
    return this;
  }

   /**
   * Small | Medium | Large  Affects the layout of the menu.
   * @return cellLayoutType
  **/
  @ApiModelProperty(value = "Small | Medium | Large  Affects the layout of the menu.")
  public CellLayoutTypeEnum getCellLayoutType() {
    return cellLayoutType;
  }

  public void setCellLayoutType(CellLayoutTypeEnum cellLayoutType) {
    this.cellLayoutType = cellLayoutType;
  }

  public MenuItemOptionSetItemBase imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image url
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Image url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuItemOptionSetItemBase menuItemOptionSetItemBase = (MenuItemOptionSetItemBase) o;
    return Objects.equals(this.name, menuItemOptionSetItemBase.name) &&
        Objects.equals(this.price, menuItemOptionSetItemBase.price) &&
        Objects.equals(this.isAvailable, menuItemOptionSetItemBase.isAvailable) &&
        Objects.equals(this.displayOrder, menuItemOptionSetItemBase.displayOrder) &&
        Objects.equals(this.cellLayoutType, menuItemOptionSetItemBase.cellLayoutType) &&
        Objects.equals(this.imageUrl, menuItemOptionSetItemBase.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, isAvailable, displayOrder, cellLayoutType, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemOptionSetItemBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    cellLayoutType: ").append(toIndentedString(cellLayoutType)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

