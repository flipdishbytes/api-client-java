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
 * Menu item
 */
@ApiModel(description = "Menu item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-19T12:03:09.347Z")
public class MenuSectionItemBase {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  /**
   * Spiciness rating
   */
  @JsonAdapter(SpicinessRatingEnum.Adapter.class)
  public enum SpicinessRatingEnum {
    NOTRATED("NotRated"),
    
    MILD("Mild"),
    
    MEDIUM("Medium"),
    
    HOT("Hot");

    private String value;

    SpicinessRatingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpicinessRatingEnum fromValue(String text) {
      for (SpicinessRatingEnum b : SpicinessRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpicinessRatingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpicinessRatingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpicinessRatingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SpicinessRatingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SpicinessRating")
  private SpicinessRatingEnum spicinessRating = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("Alcohol")
  private Boolean alcohol = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

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

  @SerializedName("DisableVouchers")
  private Boolean disableVouchers = null;

  @SerializedName("ImageName")
  private String imageName = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("MenuItemId")
  private Integer menuItemId = null;

  public MenuSectionItemBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Menu item name (like \&quot;Korma\&quot;)
   * @return name
  **/
  @ApiModelProperty(value = "Menu item name (like \"Korma\")")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuSectionItemBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description (like \&quot;A lovely dish from the east\&quot;)
   * @return description
  **/
  @ApiModelProperty(value = "Description (like \"A lovely dish from the east\")")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MenuSectionItemBase spicinessRating(SpicinessRatingEnum spicinessRating) {
    this.spicinessRating = spicinessRating;
    return this;
  }

   /**
   * Spiciness rating
   * @return spicinessRating
  **/
  @ApiModelProperty(value = "Spiciness rating")
  public SpicinessRatingEnum getSpicinessRating() {
    return spicinessRating;
  }

  public void setSpicinessRating(SpicinessRatingEnum spicinessRating) {
    this.spicinessRating = spicinessRating;
  }

  public MenuSectionItemBase price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price - this is only used when there is no master option set and should be set to 0 if a master option set exists.
   * @return price
  **/
  @ApiModelProperty(value = "Price - this is only used when there is no master option set and should be set to 0 if a master option set exists.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MenuSectionItemBase displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Display order
   * @return displayOrder
  **/
  @ApiModelProperty(value = "Display order")
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public MenuSectionItemBase alcohol(Boolean alcohol) {
    this.alcohol = alcohol;
    return this;
  }

   /**
   * To be set true if the item or an option of the item contains an alcoholic drink.
   * @return alcohol
  **/
  @ApiModelProperty(value = "To be set true if the item or an option of the item contains an alcoholic drink.")
  public Boolean isAlcohol() {
    return alcohol;
  }

  public void setAlcohol(Boolean alcohol) {
    this.alcohol = alcohol;
  }

  public MenuSectionItemBase isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

   /**
   * True if we accept orders for this item still
   * @return isAvailable
  **/
  @ApiModelProperty(value = "True if we accept orders for this item still")
  public Boolean isIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public MenuSectionItemBase cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
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

  public MenuSectionItemBase disableVouchers(Boolean disableVouchers) {
    this.disableVouchers = disableVouchers;
    return this;
  }

   /**
   * If true, then vouchers won&#39;t be applied for this item
   * @return disableVouchers
  **/
  @ApiModelProperty(value = "If true, then vouchers won't be applied for this item")
  public Boolean isDisableVouchers() {
    return disableVouchers;
  }

  public void setDisableVouchers(Boolean disableVouchers) {
    this.disableVouchers = disableVouchers;
  }

  public MenuSectionItemBase imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Image url
   * @return imageName
  **/
  @ApiModelProperty(value = "Image url")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public MenuSectionItemBase imageUrl(String imageUrl) {
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

  public MenuSectionItemBase menuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
    return this;
  }

   /**
   * Menu Item Id
   * @return menuItemId
  **/
  @ApiModelProperty(value = "Menu Item Id")
  public Integer getMenuItemId() {
    return menuItemId;
  }

  public void setMenuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuSectionItemBase menuSectionItemBase = (MenuSectionItemBase) o;
    return Objects.equals(this.name, menuSectionItemBase.name) &&
        Objects.equals(this.description, menuSectionItemBase.description) &&
        Objects.equals(this.spicinessRating, menuSectionItemBase.spicinessRating) &&
        Objects.equals(this.price, menuSectionItemBase.price) &&
        Objects.equals(this.displayOrder, menuSectionItemBase.displayOrder) &&
        Objects.equals(this.alcohol, menuSectionItemBase.alcohol) &&
        Objects.equals(this.isAvailable, menuSectionItemBase.isAvailable) &&
        Objects.equals(this.cellLayoutType, menuSectionItemBase.cellLayoutType) &&
        Objects.equals(this.disableVouchers, menuSectionItemBase.disableVouchers) &&
        Objects.equals(this.imageName, menuSectionItemBase.imageName) &&
        Objects.equals(this.imageUrl, menuSectionItemBase.imageUrl) &&
        Objects.equals(this.menuItemId, menuSectionItemBase.menuItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, spicinessRating, price, displayOrder, alcohol, isAvailable, cellLayoutType, disableVouchers, imageName, imageUrl, menuItemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuSectionItemBase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    spicinessRating: ").append(toIndentedString(spicinessRating)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    alcohol: ").append(toIndentedString(alcohol)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    cellLayoutType: ").append(toIndentedString(cellLayoutType)).append("\n");
    sb.append("    disableVouchers: ").append(toIndentedString(disableVouchers)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    menuItemId: ").append(toIndentedString(menuItemId)).append("\n");
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

