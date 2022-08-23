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
 * Order Fulfillment Status Information
 */
@ApiModel(description = "Order Fulfillment Status Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-23T16:05:27.818+01:00")
public class OrderFulfillmentStatus {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("StatusId")
  private String statusId = null;

  @SerializedName("StatusName")
  private String statusName = null;

  @SerializedName("Icon")
  private String icon = null;

  public OrderFulfillmentStatus orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Id
   * @return orderId
  **/
  @ApiModelProperty(value = "Order Id")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderFulfillmentStatus statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * Fulfillment Status Id
   * @return statusId
  **/
  @ApiModelProperty(value = "Fulfillment Status Id")
  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public OrderFulfillmentStatus statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * Fulfillment Status Name
   * @return statusName
  **/
  @ApiModelProperty(value = "Fulfillment Status Name")
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public OrderFulfillmentStatus icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Status Icon
   * @return icon
  **/
  @ApiModelProperty(value = "Status Icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFulfillmentStatus orderFulfillmentStatus = (OrderFulfillmentStatus) o;
    return Objects.equals(this.orderId, orderFulfillmentStatus.orderId) &&
        Objects.equals(this.statusId, orderFulfillmentStatus.statusId) &&
        Objects.equals(this.statusName, orderFulfillmentStatus.statusName) &&
        Objects.equals(this.icon, orderFulfillmentStatus.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, statusId, statusName, icon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillmentStatus {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

