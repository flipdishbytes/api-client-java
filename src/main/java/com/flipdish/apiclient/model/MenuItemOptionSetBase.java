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
 * Menu item option set
 */
@ApiModel(description = "Menu item option set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-31T09:29:45.398Z")
public class MenuItemOptionSetBase {
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

  public MenuItemOptionSetBase name(String name) {
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

  public MenuItemOptionSetBase isMasterOptionSet(Boolean isMasterOptionSet) {
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

  public MenuItemOptionSetBase displayOrder(Integer displayOrder) {
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

  public MenuItemOptionSetBase minSelectCount(Integer minSelectCount) {
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

  public MenuItemOptionSetBase maxSelectCount(Integer maxSelectCount) {
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

  public MenuItemOptionSetBase cellLayoutType(CellLayoutTypeEnum cellLayoutType) {
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
    MenuItemOptionSetBase menuItemOptionSetBase = (MenuItemOptionSetBase) o;
    return Objects.equals(this.name, menuItemOptionSetBase.name) &&
        Objects.equals(this.isMasterOptionSet, menuItemOptionSetBase.isMasterOptionSet) &&
        Objects.equals(this.displayOrder, menuItemOptionSetBase.displayOrder) &&
        Objects.equals(this.minSelectCount, menuItemOptionSetBase.minSelectCount) &&
        Objects.equals(this.maxSelectCount, menuItemOptionSetBase.maxSelectCount) &&
        Objects.equals(this.cellLayoutType, menuItemOptionSetBase.cellLayoutType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isMasterOptionSet, displayOrder, minSelectCount, maxSelectCount, cellLayoutType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuItemOptionSetBase {\n");
    
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

