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
 * Store delivery zone fee config
 */
@ApiModel(description = "Store delivery zone fee config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:52:00.997Z")
public class StoreDeliveryZoneFeeConfig {
  @SerializedName("DeliveryZoneId")
  private Integer deliveryZoneId = null;

  @SerializedName("Fee")
  private Double fee = null;

  public StoreDeliveryZoneFeeConfig deliveryZoneId(Integer deliveryZoneId) {
    this.deliveryZoneId = deliveryZoneId;
    return this;
  }

   /**
   * ID of the delivery zone this fee corresponds to
   * @return deliveryZoneId
  **/
  @ApiModelProperty(value = "ID of the delivery zone this fee corresponds to")
  public Integer getDeliveryZoneId() {
    return deliveryZoneId;
  }

  public void setDeliveryZoneId(Integer deliveryZoneId) {
    this.deliveryZoneId = deliveryZoneId;
  }

  public StoreDeliveryZoneFeeConfig fee(Double fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee for delivery within this zone
   * @return fee
  **/
  @ApiModelProperty(value = "Fee for delivery within this zone")
  public Double getFee() {
    return fee;
  }

  public void setFee(Double fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDeliveryZoneFeeConfig storeDeliveryZoneFeeConfig = (StoreDeliveryZoneFeeConfig) o;
    return Objects.equals(this.deliveryZoneId, storeDeliveryZoneFeeConfig.deliveryZoneId) &&
        Objects.equals(this.fee, storeDeliveryZoneFeeConfig.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryZoneId, fee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDeliveryZoneFeeConfig {\n");
    
    sb.append("    deliveryZoneId: ").append(toIndentedString(deliveryZoneId)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

