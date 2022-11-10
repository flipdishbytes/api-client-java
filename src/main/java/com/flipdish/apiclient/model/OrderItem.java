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
import com.flipdish.apiclient.model.OrderItemOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Order item
 */
@ApiModel(description = "Order item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-10T11:57:07.208Z")
public class OrderItem {
  @SerializedName("OrderItemOptions")
  private List<OrderItemOption> orderItemOptions = null;

  @SerializedName("Metadata")
  private Map<String, String> metadata = null;

  @SerializedName("MenuItemPublicId")
  private UUID menuItemPublicId = null;

  @SerializedName("MenuSectionName")
  private String menuSectionName = null;

  @SerializedName("MenuSectionDisplayOrder")
  private Integer menuSectionDisplayOrder = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("PriceIncludingOptionSetItems")
  private Double priceIncludingOptionSetItems = null;

  @SerializedName("MenuItemId")
  private Integer menuItemId = null;

  @SerializedName("MenuItemDisplayOrder")
  private Integer menuItemDisplayOrder = null;

  @SerializedName("IsAvailable")
  private Boolean isAvailable = null;

  public OrderItem orderItemOptions(List<OrderItemOption> orderItemOptions) {
    this.orderItemOptions = orderItemOptions;
    return this;
  }

  public OrderItem addOrderItemOptionsItem(OrderItemOption orderItemOptionsItem) {
    if (this.orderItemOptions == null) {
      this.orderItemOptions = new ArrayList<OrderItemOption>();
    }
    this.orderItemOptions.add(orderItemOptionsItem);
    return this;
  }

   /**
   * Option list
   * @return orderItemOptions
  **/
  @ApiModelProperty(value = "Option list")
  public List<OrderItemOption> getOrderItemOptions() {
    return orderItemOptions;
  }

  public void setOrderItemOptions(List<OrderItemOption> orderItemOptions) {
    this.orderItemOptions = orderItemOptions;
  }

  public OrderItem metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderItem putMetadataItem(String key, String metadataItem) {
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

  public OrderItem menuItemPublicId(UUID menuItemPublicId) {
    this.menuItemPublicId = menuItemPublicId;
    return this;
  }

   /**
   * Public id of the Menu Item
   * @return menuItemPublicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Public id of the Menu Item")
  public UUID getMenuItemPublicId() {
    return menuItemPublicId;
  }

  public void setMenuItemPublicId(UUID menuItemPublicId) {
    this.menuItemPublicId = menuItemPublicId;
  }

  public OrderItem menuSectionName(String menuSectionName) {
    this.menuSectionName = menuSectionName;
    return this;
  }

   /**
   * Menu section name
   * @return menuSectionName
  **/
  @ApiModelProperty(value = "Menu section name")
  public String getMenuSectionName() {
    return menuSectionName;
  }

  public void setMenuSectionName(String menuSectionName) {
    this.menuSectionName = menuSectionName;
  }

  public OrderItem menuSectionDisplayOrder(Integer menuSectionDisplayOrder) {
    this.menuSectionDisplayOrder = menuSectionDisplayOrder;
    return this;
  }

   /**
   * Menu section display order
   * @return menuSectionDisplayOrder
  **/
  @ApiModelProperty(value = "Menu section display order")
  public Integer getMenuSectionDisplayOrder() {
    return menuSectionDisplayOrder;
  }

  public void setMenuSectionDisplayOrder(Integer menuSectionDisplayOrder) {
    this.menuSectionDisplayOrder = menuSectionDisplayOrder;
  }

  public OrderItem name(String name) {
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

  public OrderItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderItem price(Double price) {
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

  public OrderItem priceIncludingOptionSetItems(Double priceIncludingOptionSetItems) {
    this.priceIncludingOptionSetItems = priceIncludingOptionSetItems;
    return this;
  }

   /**
   * Price including option set items
   * @return priceIncludingOptionSetItems
  **/
  @ApiModelProperty(value = "Price including option set items")
  public Double getPriceIncludingOptionSetItems() {
    return priceIncludingOptionSetItems;
  }

  public void setPriceIncludingOptionSetItems(Double priceIncludingOptionSetItems) {
    this.priceIncludingOptionSetItems = priceIncludingOptionSetItems;
  }

  public OrderItem menuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
    return this;
  }

   /**
   * Menu item identifier
   * @return menuItemId
  **/
  @ApiModelProperty(value = "Menu item identifier")
  public Integer getMenuItemId() {
    return menuItemId;
  }

  public void setMenuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
  }

  public OrderItem menuItemDisplayOrder(Integer menuItemDisplayOrder) {
    this.menuItemDisplayOrder = menuItemDisplayOrder;
    return this;
  }

   /**
   * Menu item display order
   * @return menuItemDisplayOrder
  **/
  @ApiModelProperty(value = "Menu item display order")
  public Integer getMenuItemDisplayOrder() {
    return menuItemDisplayOrder;
  }

  public void setMenuItemDisplayOrder(Integer menuItemDisplayOrder) {
    this.menuItemDisplayOrder = menuItemDisplayOrder;
  }

  public OrderItem isAvailable(Boolean isAvailable) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.orderItemOptions, orderItem.orderItemOptions) &&
        Objects.equals(this.metadata, orderItem.metadata) &&
        Objects.equals(this.menuItemPublicId, orderItem.menuItemPublicId) &&
        Objects.equals(this.menuSectionName, orderItem.menuSectionName) &&
        Objects.equals(this.menuSectionDisplayOrder, orderItem.menuSectionDisplayOrder) &&
        Objects.equals(this.name, orderItem.name) &&
        Objects.equals(this.description, orderItem.description) &&
        Objects.equals(this.price, orderItem.price) &&
        Objects.equals(this.priceIncludingOptionSetItems, orderItem.priceIncludingOptionSetItems) &&
        Objects.equals(this.menuItemId, orderItem.menuItemId) &&
        Objects.equals(this.menuItemDisplayOrder, orderItem.menuItemDisplayOrder) &&
        Objects.equals(this.isAvailable, orderItem.isAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemOptions, metadata, menuItemPublicId, menuSectionName, menuSectionDisplayOrder, name, description, price, priceIncludingOptionSetItems, menuItemId, menuItemDisplayOrder, isAvailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    orderItemOptions: ").append(toIndentedString(orderItemOptions)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    menuItemPublicId: ").append(toIndentedString(menuItemPublicId)).append("\n");
    sb.append("    menuSectionName: ").append(toIndentedString(menuSectionName)).append("\n");
    sb.append("    menuSectionDisplayOrder: ").append(toIndentedString(menuSectionDisplayOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceIncludingOptionSetItems: ").append(toIndentedString(priceIncludingOptionSetItems)).append("\n");
    sb.append("    menuItemId: ").append(toIndentedString(menuItemId)).append("\n");
    sb.append("    menuItemDisplayOrder: ").append(toIndentedString(menuItemDisplayOrder)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
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

