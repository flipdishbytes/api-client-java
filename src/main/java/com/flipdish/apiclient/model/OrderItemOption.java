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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Order item option
 */
@ApiModel(description = "Order item option")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class OrderItemOption {
  @SerializedName("Metadata")
  private Map<String, String> metadata = null;

  @SerializedName("MenuItemOptionPublicId")
  private UUID menuItemOptionPublicId = null;

  @SerializedName("MenuItemOptionId")
  private Integer menuItemOptionId = null;

  @SerializedName("IsMasterOptionSetItem")
  private Boolean isMasterOptionSetItem = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("MenuItemOptionDisplayOrder")
  private Integer menuItemOptionDisplayOrder = null;

  @SerializedName("MenuItemOptionSetDisplayOrder")
  private Integer menuItemOptionSetDisplayOrder = null;

  public OrderItemOption metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderItemOption putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public OrderItemOption menuItemOptionPublicId(UUID menuItemOptionPublicId) {
    this.menuItemOptionPublicId = menuItemOptionPublicId;
    return this;
  }

   /**
   * Public id of the Menu Item Option
   * @return menuItemOptionPublicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Public id of the Menu Item Option")
  public UUID getMenuItemOptionPublicId() {
    return menuItemOptionPublicId;
  }

  public void setMenuItemOptionPublicId(UUID menuItemOptionPublicId) {
    this.menuItemOptionPublicId = menuItemOptionPublicId;
  }

  public OrderItemOption menuItemOptionId(Integer menuItemOptionId) {
    this.menuItemOptionId = menuItemOptionId;
    return this;
  }

   /**
   * Menu item option identifier
   * @return menuItemOptionId
  **/
  @ApiModelProperty(value = "Menu item option identifier")
  public Integer getMenuItemOptionId() {
    return menuItemOptionId;
  }

  public void setMenuItemOptionId(Integer menuItemOptionId) {
    this.menuItemOptionId = menuItemOptionId;
  }

  public OrderItemOption isMasterOptionSetItem(Boolean isMasterOptionSetItem) {
    this.isMasterOptionSetItem = isMasterOptionSetItem;
    return this;
  }

   /**
   * Is master option set item
   * @return isMasterOptionSetItem
  **/
  @ApiModelProperty(value = "Is master option set item")
  public Boolean isIsMasterOptionSetItem() {
    return isMasterOptionSetItem;
  }

  public void setIsMasterOptionSetItem(Boolean isMasterOptionSetItem) {
    this.isMasterOptionSetItem = isMasterOptionSetItem;
  }

  public OrderItemOption name(String name) {
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

  public OrderItemOption price(Double price) {
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

  public OrderItemOption menuItemOptionDisplayOrder(Integer menuItemOptionDisplayOrder) {
    this.menuItemOptionDisplayOrder = menuItemOptionDisplayOrder;
    return this;
  }

   /**
   * Menu item option display order
   * @return menuItemOptionDisplayOrder
  **/
  @ApiModelProperty(value = "Menu item option display order")
  public Integer getMenuItemOptionDisplayOrder() {
    return menuItemOptionDisplayOrder;
  }

  public void setMenuItemOptionDisplayOrder(Integer menuItemOptionDisplayOrder) {
    this.menuItemOptionDisplayOrder = menuItemOptionDisplayOrder;
  }

  public OrderItemOption menuItemOptionSetDisplayOrder(Integer menuItemOptionSetDisplayOrder) {
    this.menuItemOptionSetDisplayOrder = menuItemOptionSetDisplayOrder;
    return this;
  }

   /**
   * Menu item option set display order
   * @return menuItemOptionSetDisplayOrder
  **/
  @ApiModelProperty(value = "Menu item option set display order")
  public Integer getMenuItemOptionSetDisplayOrder() {
    return menuItemOptionSetDisplayOrder;
  }

  public void setMenuItemOptionSetDisplayOrder(Integer menuItemOptionSetDisplayOrder) {
    this.menuItemOptionSetDisplayOrder = menuItemOptionSetDisplayOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemOption orderItemOption = (OrderItemOption) o;
    return Objects.equals(this.metadata, orderItemOption.metadata) &&
        Objects.equals(this.menuItemOptionPublicId, orderItemOption.menuItemOptionPublicId) &&
        Objects.equals(this.menuItemOptionId, orderItemOption.menuItemOptionId) &&
        Objects.equals(this.isMasterOptionSetItem, orderItemOption.isMasterOptionSetItem) &&
        Objects.equals(this.name, orderItemOption.name) &&
        Objects.equals(this.price, orderItemOption.price) &&
        Objects.equals(this.menuItemOptionDisplayOrder, orderItemOption.menuItemOptionDisplayOrder) &&
        Objects.equals(this.menuItemOptionSetDisplayOrder, orderItemOption.menuItemOptionSetDisplayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, menuItemOptionPublicId, menuItemOptionId, isMasterOptionSetItem, name, price, menuItemOptionDisplayOrder, menuItemOptionSetDisplayOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemOption {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    menuItemOptionPublicId: ").append(toIndentedString(menuItemOptionPublicId)).append("\n");
    sb.append("    menuItemOptionId: ").append(toIndentedString(menuItemOptionId)).append("\n");
    sb.append("    isMasterOptionSetItem: ").append(toIndentedString(isMasterOptionSetItem)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    menuItemOptionDisplayOrder: ").append(toIndentedString(menuItemOptionDisplayOrder)).append("\n");
    sb.append("    menuItemOptionSetDisplayOrder: ").append(toIndentedString(menuItemOptionSetDisplayOrder)).append("\n");
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
