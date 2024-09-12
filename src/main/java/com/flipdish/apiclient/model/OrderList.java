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
import com.flipdish.apiclient.model.OrderReference;
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
 * A list of orders.
 */
@ApiModel(description = "A list of orders.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-12T09:58:30.363Z")
public class OrderList {
  @SerializedName("Orders")
  private List<OrderReference> orders = null;

  public OrderList orders(List<OrderReference> orders) {
    this.orders = orders;
    return this;
  }

  public OrderList addOrdersItem(OrderReference ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<OrderReference>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * A list of orders.
   * @return orders
  **/
  @ApiModelProperty(value = "A list of orders.")
  public List<OrderReference> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderReference> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderList orderList = (OrderList) o;
    return Objects.equals(this.orders, orderList.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderList {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

