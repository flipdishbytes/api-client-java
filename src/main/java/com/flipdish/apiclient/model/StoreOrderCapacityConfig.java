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
import com.flipdish.apiclient.model.StoreOrderCapacityPeriod;
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
 * Represents one store&#39;s order capacity configuration
 */
@ApiModel(description = "Represents one store's order capacity configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-17T12:59:34.139+01:00")
public class StoreOrderCapacityConfig {
  @SerializedName("StoreId")
  private Integer storeId = null;

  /**
   * Signifies whether the order capacity configuration is for Delivery / Pickup
   */
  @JsonAdapter(DeliveryTypeEnum.Adapter.class)
  public enum DeliveryTypeEnum {
    DELIVERY("Delivery"),
    
    PICKUP("Pickup");

    private String value;

    DeliveryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String text) {
      for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeliveryType")
  private DeliveryTypeEnum deliveryType = null;

  @SerializedName("StoreIntervalInMinutes")
  private Integer storeIntervalInMinutes = null;

  @SerializedName("OrderCapacityPeriods")
  private List<StoreOrderCapacityPeriod> orderCapacityPeriods = null;

  public StoreOrderCapacityConfig storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store identifier
   * @return storeId
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreOrderCapacityConfig deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Signifies whether the order capacity configuration is for Delivery / Pickup
   * @return deliveryType
  **/
  @ApiModelProperty(value = "Signifies whether the order capacity configuration is for Delivery / Pickup")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public StoreOrderCapacityConfig storeIntervalInMinutes(Integer storeIntervalInMinutes) {
    this.storeIntervalInMinutes = storeIntervalInMinutes;
    return this;
  }

   /**
   * Store Interval - time between orders, e.g. 10 minutes between each order time available to customer
   * @return storeIntervalInMinutes
  **/
  @ApiModelProperty(value = "Store Interval - time between orders, e.g. 10 minutes between each order time available to customer")
  public Integer getStoreIntervalInMinutes() {
    return storeIntervalInMinutes;
  }

  public void setStoreIntervalInMinutes(Integer storeIntervalInMinutes) {
    this.storeIntervalInMinutes = storeIntervalInMinutes;
  }

  public StoreOrderCapacityConfig orderCapacityPeriods(List<StoreOrderCapacityPeriod> orderCapacityPeriods) {
    this.orderCapacityPeriods = orderCapacityPeriods;
    return this;
  }

  public StoreOrderCapacityConfig addOrderCapacityPeriodsItem(StoreOrderCapacityPeriod orderCapacityPeriodsItem) {
    if (this.orderCapacityPeriods == null) {
      this.orderCapacityPeriods = new ArrayList<StoreOrderCapacityPeriod>();
    }
    this.orderCapacityPeriods.add(orderCapacityPeriodsItem);
    return this;
  }

   /**
   * Order capacity periods
   * @return orderCapacityPeriods
  **/
  @ApiModelProperty(value = "Order capacity periods")
  public List<StoreOrderCapacityPeriod> getOrderCapacityPeriods() {
    return orderCapacityPeriods;
  }

  public void setOrderCapacityPeriods(List<StoreOrderCapacityPeriod> orderCapacityPeriods) {
    this.orderCapacityPeriods = orderCapacityPeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreOrderCapacityConfig storeOrderCapacityConfig = (StoreOrderCapacityConfig) o;
    return Objects.equals(this.storeId, storeOrderCapacityConfig.storeId) &&
        Objects.equals(this.deliveryType, storeOrderCapacityConfig.deliveryType) &&
        Objects.equals(this.storeIntervalInMinutes, storeOrderCapacityConfig.storeIntervalInMinutes) &&
        Objects.equals(this.orderCapacityPeriods, storeOrderCapacityConfig.orderCapacityPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, deliveryType, storeIntervalInMinutes, orderCapacityPeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreOrderCapacityConfig {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    storeIntervalInMinutes: ").append(toIndentedString(storeIntervalInMinutes)).append("\n");
    sb.append("    orderCapacityPeriods: ").append(toIndentedString(orderCapacityPeriods)).append("\n");
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

