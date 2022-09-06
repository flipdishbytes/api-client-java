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
import com.flipdish.apiclient.model.CreateMetadata;
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
 * Create menu item option set item
 */
@ApiModel(description = "Create menu item option set item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-06T12:39:46.243+01:00")
public class CreateFullMenuItemOptionSetItem {
  @SerializedName("MenuItemOptionSetItemId")
  private Integer menuItemOptionSetItemId = null;

  @SerializedName("Metadata")
  private List<CreateMetadata> metadata = null;

  @SerializedName("TaxRateName")
  private String taxRateName = null;

  @SerializedName("NextMenuItemOptionSetId")
  private Integer nextMenuItemOptionSetId = null;

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

  public CreateFullMenuItemOptionSetItem menuItemOptionSetItemId(Integer menuItemOptionSetItemId) {
    this.menuItemOptionSetItemId = menuItemOptionSetItemId;
    return this;
  }

   /**
   * Menu item option set item identifier
   * @return menuItemOptionSetItemId
  **/
  @ApiModelProperty(value = "Menu item option set item identifier")
  public Integer getMenuItemOptionSetItemId() {
    return menuItemOptionSetItemId;
  }

  public void setMenuItemOptionSetItemId(Integer menuItemOptionSetItemId) {
    this.menuItemOptionSetItemId = menuItemOptionSetItemId;
  }

  public CreateFullMenuItemOptionSetItem metadata(List<CreateMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateFullMenuItemOptionSetItem addMetadataItem(CreateMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<CreateMetadata>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * List of metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "List of metadata")
  public List<CreateMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<CreateMetadata> metadata) {
    this.metadata = metadata;
  }

  public CreateFullMenuItemOptionSetItem taxRateName(String taxRateName) {
    this.taxRateName = taxRateName;
    return this;
  }

   /**
   * Tax rate name
   * @return taxRateName
  **/
  @ApiModelProperty(value = "Tax rate name")
  public String getTaxRateName() {
    return taxRateName;
  }

  public void setTaxRateName(String taxRateName) {
    this.taxRateName = taxRateName;
  }

  public CreateFullMenuItemOptionSetItem nextMenuItemOptionSetId(Integer nextMenuItemOptionSetId) {
    this.nextMenuItemOptionSetId = nextMenuItemOptionSetId;
    return this;
  }

   /**
   * if null, next option set is next. if -1, this is the final option set
   * @return nextMenuItemOptionSetId
  **/
  @ApiModelProperty(value = "if null, next option set is next. if -1, this is the final option set")
  public Integer getNextMenuItemOptionSetId() {
    return nextMenuItemOptionSetId;
  }

  public void setNextMenuItemOptionSetId(Integer nextMenuItemOptionSetId) {
    this.nextMenuItemOptionSetId = nextMenuItemOptionSetId;
  }

  public CreateFullMenuItemOptionSetItem name(String name) {
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

  public CreateFullMenuItemOptionSetItem price(Double price) {
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

  public CreateFullMenuItemOptionSetItem isAvailable(Boolean isAvailable) {
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

  public CreateFullMenuItemOptionSetItem displayOrder(Integer displayOrder) {
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

  public CreateFullMenuItemOptionSetItem cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
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

  public CreateFullMenuItemOptionSetItem imageUrl(String imageUrl) {
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
    CreateFullMenuItemOptionSetItem createFullMenuItemOptionSetItem = (CreateFullMenuItemOptionSetItem) o;
    return Objects.equals(this.menuItemOptionSetItemId, createFullMenuItemOptionSetItem.menuItemOptionSetItemId) &&
        Objects.equals(this.metadata, createFullMenuItemOptionSetItem.metadata) &&
        Objects.equals(this.taxRateName, createFullMenuItemOptionSetItem.taxRateName) &&
        Objects.equals(this.nextMenuItemOptionSetId, createFullMenuItemOptionSetItem.nextMenuItemOptionSetId) &&
        Objects.equals(this.name, createFullMenuItemOptionSetItem.name) &&
        Objects.equals(this.price, createFullMenuItemOptionSetItem.price) &&
        Objects.equals(this.isAvailable, createFullMenuItemOptionSetItem.isAvailable) &&
        Objects.equals(this.displayOrder, createFullMenuItemOptionSetItem.displayOrder) &&
        Objects.equals(this.cellLayoutType, createFullMenuItemOptionSetItem.cellLayoutType) &&
        Objects.equals(this.imageUrl, createFullMenuItemOptionSetItem.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemOptionSetItemId, metadata, taxRateName, nextMenuItemOptionSetId, name, price, isAvailable, displayOrder, cellLayoutType, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFullMenuItemOptionSetItem {\n");
    
    sb.append("    menuItemOptionSetItemId: ").append(toIndentedString(menuItemOptionSetItemId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    taxRateName: ").append(toIndentedString(taxRateName)).append("\n");
    sb.append("    nextMenuItemOptionSetId: ").append(toIndentedString(nextMenuItemOptionSetId)).append("\n");
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

