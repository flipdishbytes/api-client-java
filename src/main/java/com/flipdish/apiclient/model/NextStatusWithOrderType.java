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
 * Next status by order type
 */
@ApiModel(description = "Next status by order type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class NextStatusWithOrderType {
  /**
   * Order type
   */
  @JsonAdapter(OrderTypeEnum.Adapter.class)
  public enum OrderTypeEnum {
    ALL("All"),
    
    DELIVERY("Delivery"),
    
    COLLECTION("Collection"),
    
    DINEIN("DineIn");

    private String value;

    OrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypeEnum fromValue(String text) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OrderType")
  private OrderTypeEnum orderType = null;

  @SerializedName("NextStatus")
  private String nextStatus = null;

  public NextStatusWithOrderType orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Order type
   * @return orderType
  **/
  @ApiModelProperty(value = "Order type")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public NextStatusWithOrderType nextStatus(String nextStatus) {
    this.nextStatus = nextStatus;
    return this;
  }

   /**
   * Next status id
   * @return nextStatus
  **/
  @ApiModelProperty(value = "Next status id")
  public String getNextStatus() {
    return nextStatus;
  }

  public void setNextStatus(String nextStatus) {
    this.nextStatus = nextStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextStatusWithOrderType nextStatusWithOrderType = (NextStatusWithOrderType) o;
    return Objects.equals(this.orderType, nextStatusWithOrderType.orderType) &&
        Objects.equals(this.nextStatus, nextStatusWithOrderType.nextStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, nextStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextStatusWithOrderType {\n");
    
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    nextStatus: ").append(toIndentedString(nextStatus)).append("\n");
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

