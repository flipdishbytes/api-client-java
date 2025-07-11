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
import com.flipdish.apiclient.model.LineItem;
import com.flipdish.apiclient.model.Price;
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
 * Defines the cart
 */
@ApiModel(description = "Defines the cart")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class Cart {
  @SerializedName("LineItems")
  private List<LineItem> lineItems = null;

  @SerializedName("CartAmount")
  private Price cartAmount = null;

  @SerializedName("Tip")
  private Price tip = null;

  public Cart lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Cart addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Line items from the cart
   * @return lineItems
  **/
  @ApiModelProperty(value = "Line items from the cart")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Cart cartAmount(Price cartAmount) {
    this.cartAmount = cartAmount;
    return this;
  }

   /**
   * Total cart price
   * @return cartAmount
  **/
  @ApiModelProperty(value = "Total cart price")
  public Price getCartAmount() {
    return cartAmount;
  }

  public void setCartAmount(Price cartAmount) {
    this.cartAmount = cartAmount;
  }

  public Cart tip(Price tip) {
    this.tip = tip;
    return this;
  }

   /**
   * Total tip amount
   * @return tip
  **/
  @ApiModelProperty(value = "Total tip amount")
  public Price getTip() {
    return tip;
  }

  public void setTip(Price tip) {
    this.tip = tip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.lineItems, cart.lineItems) &&
        Objects.equals(this.cartAmount, cart.cartAmount) &&
        Objects.equals(this.tip, cart.tip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, cartAmount, tip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    cartAmount: ").append(toIndentedString(cartAmount)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
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

