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
import java.util.UUID;

/**
 * Menu item option set item
 */
@ApiModel(description = "Menu item option set item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-30T13:05:53.551+01:00")
public class MenuItemOptionSetItem {
  @SerializedName("MenuItemOptionSetItemId")
  private Integer menuItemOptionSetItemId = null;

  @SerializedName("PublicId")
  private UUID publicId = null;

  @SerializedName("Metadata")
  private List<CreateMetadata> metadata = null;

  @SerializedName("NextMenuItemOptionSetId")
  private Integer nextMenuItemOptionSetId = null;

  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  @SerializedName("TaxRateName")
  private String taxRateName = null;

  @SerializedName("TaxRateId")
  private Integer taxRateId = null;

  @SerializedName("TaxValue")
  private Double taxValue = null;

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

  public MenuItemOptionSetItem menuItemOptionSetItemId(Integer menuItemOptionSetItemId) {
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

  public MenuItemOptionSetItem publicId(UUID publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * Permanent reference to the item.
   * @return publicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Permanent reference to the item.")
  public UUID getPublicId() {
    return publicId;
  }

  public void setPublicId(UUID publicId) {
    this.publicId = publicId;
  }

  public MenuItemOptionSetItem metadata(List<CreateMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public MenuItemOptionSetItem addMetadataItem(CreateMetadata metadataItem) {
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

  public MenuItemOptionSetItem nextMenuItemOptionSetId(Integer nextMenuItemOptionSetId) {
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

  public MenuItemOptionSetItem catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Catalog item Id when the OptionSet is associated to a Product
   * @return catalogItemId
  **/
  @ApiModelProperty(value = "Catalog item Id when the OptionSet is associated to a Product")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public MenuItemOptionSetItem taxRateName(String taxRateName) {
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

  public MenuItemOptionSetItem taxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
    return this;
  }

   /**
   * Get taxRateId
   * @return taxRateId
  **/
  @ApiModelProperty(value = "")
  public Integer getTaxRateId() {
    return taxRateId;
  }

  public void setTaxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
  }

  public MenuItemOptionSetItem taxValue(Double taxValue) {
    this.taxValue = taxValue;
    return this;
  }

   /**
   * Get taxValue
   * @return taxValue
  **/
  @ApiModelProperty(value = "")
  public Double getTaxValue() {
    return taxValue;
  }

  public void setTaxValue(Double taxValue) {
    this.taxValue = taxValue;
  }

  public MenuItemOptionSetItem name(String name) {
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

  public MenuItemOptionSetItem price(Double price) {
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

  public MenuItemOptionSetItem isAvailable(Boolean isAvailable) {
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

  public MenuItemOptionSetItem displayOrder(Integer displayOrder) {
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

  public MenuItemOptionSetItem cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
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

  public MenuItemOptionSetItem imageUrl(String imageUrl) {
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
    MenuItemOptionSetItem menuItemOptionSetItem = (MenuItemOptionSetItem) o;
    return Objects.equals(this.menuItemOptionSetItemId, menuItemOptionSetItem.menuItemOptionSetItemId) &&
        Objects.equals(this.publicId, menuItemOptionSetItem.publicId) &&
        Objects.equals(this.metadata, menuItemOptionSetItem.metadata) &&
        Objects.equals(this.nextMenuItemOptionSetId, menuItemOptionSetItem.nextMenuItemOptionSetId) &&
        Objects.equals(this.catalogItemId, menuItemOptionSetItem.catalogItemId) &&
        Objects.equals(this.taxRateName, menuItemOptionSetItem.taxRateName) &&
        Objects.equals(this.taxRateId, menuItemOptionSetItem.taxRateId) &&
        Objects.equals(this.taxValue, menuItemOptionSetItem.taxValue) &&
        Objects.equals(this.name, menuItemOptionSetItem.name) &&
        Objects.equals(this.price, menuItemOptionSetItem.price) &&
        Objects.equals(this.isAvailable, menuItemOptionSetItem.isAvailable) &&
        Objects.equals(this.displayOrder, menuItemOptionSetItem.displayOrder) &&
        Objects.equals(this.cellLayoutType, menuItemOptionSetItem.cellLayoutType) &&
        Objects.equals(this.imageUrl, menuItemOptionSetItem.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemOptionSetItemId, publicId, metadata, nextMenuItemOptionSetId, catalogItemId, taxRateName, taxRateId, taxValue, name, price, isAvailable, displayOrder, cellLayoutType, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemOptionSetItem {\n");
    
    sb.append("    menuItemOptionSetItemId: ").append(toIndentedString(menuItemOptionSetItemId)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    nextMenuItemOptionSetId: ").append(toIndentedString(nextMenuItemOptionSetId)).append("\n");
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    taxRateName: ").append(toIndentedString(taxRateName)).append("\n");
    sb.append("    taxRateId: ").append(toIndentedString(taxRateId)).append("\n");
    sb.append("    taxValue: ").append(toIndentedString(taxValue)).append("\n");
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

