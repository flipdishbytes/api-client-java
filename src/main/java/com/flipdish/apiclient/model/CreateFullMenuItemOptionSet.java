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
import com.flipdish.apiclient.model.CreateFullMenuItemOptionSetItem;
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
 * Create menu item option set
 */
@ApiModel(description = "Create menu item option set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-06T12:39:46.243+01:00")
public class CreateFullMenuItemOptionSet {
  @SerializedName("MenuItemOptionSetId")
  private Integer menuItemOptionSetId = null;

  @SerializedName("MenuItemOptionSetItems")
  private List<CreateFullMenuItemOptionSetItem> menuItemOptionSetItems = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("IsMasterOptionSet")
  private Boolean isMasterOptionSet = null;

  @SerializedName("DisplayOrder")
  private Integer displayOrder = null;

  @SerializedName("MinSelectCount")
  private Integer minSelectCount = null;

  @SerializedName("MaxSelectCount")
  private Integer maxSelectCount = null;

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

  public CreateFullMenuItemOptionSet menuItemOptionSetId(Integer menuItemOptionSetId) {
    this.menuItemOptionSetId = menuItemOptionSetId;
    return this;
  }

   /**
   * Menu item option set identifier
   * @return menuItemOptionSetId
  **/
  @ApiModelProperty(value = "Menu item option set identifier")
  public Integer getMenuItemOptionSetId() {
    return menuItemOptionSetId;
  }

  public void setMenuItemOptionSetId(Integer menuItemOptionSetId) {
    this.menuItemOptionSetId = menuItemOptionSetId;
  }

  public CreateFullMenuItemOptionSet menuItemOptionSetItems(List<CreateFullMenuItemOptionSetItem> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
    return this;
  }

  public CreateFullMenuItemOptionSet addMenuItemOptionSetItemsItem(CreateFullMenuItemOptionSetItem menuItemOptionSetItemsItem) {
    if (this.menuItemOptionSetItems == null) {
      this.menuItemOptionSetItems = new ArrayList<CreateFullMenuItemOptionSetItem>();
    }
    this.menuItemOptionSetItems.add(menuItemOptionSetItemsItem);
    return this;
  }

   /**
   * Option set items
   * @return menuItemOptionSetItems
  **/
  @ApiModelProperty(value = "Option set items")
  public List<CreateFullMenuItemOptionSetItem> getMenuItemOptionSetItems() {
    return menuItemOptionSetItems;
  }

  public void setMenuItemOptionSetItems(List<CreateFullMenuItemOptionSetItem> menuItemOptionSetItems) {
    this.menuItemOptionSetItems = menuItemOptionSetItems;
  }

  public CreateFullMenuItemOptionSet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Menu item option set name
   * @return name
  **/
  @ApiModelProperty(value = "Menu item option set name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFullMenuItemOptionSet isMasterOptionSet(Boolean isMasterOptionSet) {
    this.isMasterOptionSet = isMasterOptionSet;
    return this;
  }

   /**
   * Is master option set. This can affect the layout of the options in the menu displayed to the customer. Usually it is true if the option could be considerd a standalone item as opposed to an addition (\&quot;with ketchup\&quot;) or modifier (\&quot;large\&quot;).
   * @return isMasterOptionSet
  **/
  @ApiModelProperty(value = "Is master option set. This can affect the layout of the options in the menu displayed to the customer. Usually it is true if the option could be considerd a standalone item as opposed to an addition (\"with ketchup\") or modifier (\"large\").")
  public Boolean isIsMasterOptionSet() {
    return isMasterOptionSet;
  }

  public void setIsMasterOptionSet(Boolean isMasterOptionSet) {
    this.isMasterOptionSet = isMasterOptionSet;
  }

  public CreateFullMenuItemOptionSet displayOrder(Integer displayOrder) {
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

  public CreateFullMenuItemOptionSet minSelectCount(Integer minSelectCount) {
    this.minSelectCount = minSelectCount;
    return this;
  }

   /**
   * Minimum items must be selected
   * @return minSelectCount
  **/
  @ApiModelProperty(value = "Minimum items must be selected")
  public Integer getMinSelectCount() {
    return minSelectCount;
  }

  public void setMinSelectCount(Integer minSelectCount) {
    this.minSelectCount = minSelectCount;
  }

  public CreateFullMenuItemOptionSet maxSelectCount(Integer maxSelectCount) {
    this.maxSelectCount = maxSelectCount;
    return this;
  }

   /**
   * Maximum number of items can be selected
   * @return maxSelectCount
  **/
  @ApiModelProperty(value = "Maximum number of items can be selected")
  public Integer getMaxSelectCount() {
    return maxSelectCount;
  }

  public void setMaxSelectCount(Integer maxSelectCount) {
    this.maxSelectCount = maxSelectCount;
  }

  public CreateFullMenuItemOptionSet cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFullMenuItemOptionSet createFullMenuItemOptionSet = (CreateFullMenuItemOptionSet) o;
    return Objects.equals(this.menuItemOptionSetId, createFullMenuItemOptionSet.menuItemOptionSetId) &&
        Objects.equals(this.menuItemOptionSetItems, createFullMenuItemOptionSet.menuItemOptionSetItems) &&
        Objects.equals(this.name, createFullMenuItemOptionSet.name) &&
        Objects.equals(this.isMasterOptionSet, createFullMenuItemOptionSet.isMasterOptionSet) &&
        Objects.equals(this.displayOrder, createFullMenuItemOptionSet.displayOrder) &&
        Objects.equals(this.minSelectCount, createFullMenuItemOptionSet.minSelectCount) &&
        Objects.equals(this.maxSelectCount, createFullMenuItemOptionSet.maxSelectCount) &&
        Objects.equals(this.cellLayoutType, createFullMenuItemOptionSet.cellLayoutType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItemOptionSetId, menuItemOptionSetItems, name, isMasterOptionSet, displayOrder, minSelectCount, maxSelectCount, cellLayoutType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFullMenuItemOptionSet {\n");
    
    sb.append("    menuItemOptionSetId: ").append(toIndentedString(menuItemOptionSetId)).append("\n");
    sb.append("    menuItemOptionSetItems: ").append(toIndentedString(menuItemOptionSetItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMasterOptionSet: ").append(toIndentedString(isMasterOptionSet)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    minSelectCount: ").append(toIndentedString(minSelectCount)).append("\n");
    sb.append("    maxSelectCount: ").append(toIndentedString(maxSelectCount)).append("\n");
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

