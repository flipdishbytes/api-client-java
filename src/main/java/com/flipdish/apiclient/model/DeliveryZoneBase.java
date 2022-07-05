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
 * Delivery Zone Base
 */
@ApiModel(description = "Delivery Zone Base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-05T08:07:14.758+01:00")
public class DeliveryZoneBase {
  @SerializedName("DeliveryFee")
  private Double deliveryFee = null;

  @SerializedName("MinimumDeliveryOrderAmount")
  private Double minimumDeliveryOrderAmount = null;

  @SerializedName("WellKnownText")
  private String wellKnownText = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  public DeliveryZoneBase deliveryFee(Double deliveryFee) {
    this.deliveryFee = deliveryFee;
    return this;
  }

   /**
   * Delivery fee (will not be set below 0)
   * @return deliveryFee
  **/
  @ApiModelProperty(value = "Delivery fee (will not be set below 0)")
  public Double getDeliveryFee() {
    return deliveryFee;
  }

  public void setDeliveryFee(Double deliveryFee) {
    this.deliveryFee = deliveryFee;
  }

  public DeliveryZoneBase minimumDeliveryOrderAmount(Double minimumDeliveryOrderAmount) {
    this.minimumDeliveryOrderAmount = minimumDeliveryOrderAmount;
    return this;
  }

   /**
   * Minimum delivery order amount (will not be set below 0)
   * @return minimumDeliveryOrderAmount
  **/
  @ApiModelProperty(value = "Minimum delivery order amount (will not be set below 0)")
  public Double getMinimumDeliveryOrderAmount() {
    return minimumDeliveryOrderAmount;
  }

  public void setMinimumDeliveryOrderAmount(Double minimumDeliveryOrderAmount) {
    this.minimumDeliveryOrderAmount = minimumDeliveryOrderAmount;
  }

  public DeliveryZoneBase wellKnownText(String wellKnownText) {
    this.wellKnownText = wellKnownText;
    return this;
  }

   /**
   * Spatial data in Well Known Text format  We also support CIRCLE((0 0, 200)) - (centerLong centerLat, radius in m)
   * @return wellKnownText
  **/
  @ApiModelProperty(value = "Spatial data in Well Known Text format  We also support CIRCLE((0 0, 200)) - (centerLong centerLat, radius in m)")
  public String getWellKnownText() {
    return wellKnownText;
  }

  public void setWellKnownText(String wellKnownText) {
    this.wellKnownText = wellKnownText;
  }

  public DeliveryZoneBase isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is delivery zone enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is delivery zone enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryZoneBase deliveryZoneBase = (DeliveryZoneBase) o;
    return Objects.equals(this.deliveryFee, deliveryZoneBase.deliveryFee) &&
        Objects.equals(this.minimumDeliveryOrderAmount, deliveryZoneBase.minimumDeliveryOrderAmount) &&
        Objects.equals(this.wellKnownText, deliveryZoneBase.wellKnownText) &&
        Objects.equals(this.isEnabled, deliveryZoneBase.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryFee, minimumDeliveryOrderAmount, wellKnownText, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryZoneBase {\n");
    
    sb.append("    deliveryFee: ").append(toIndentedString(deliveryFee)).append("\n");
    sb.append("    minimumDeliveryOrderAmount: ").append(toIndentedString(minimumDeliveryOrderAmount)).append("\n");
    sb.append("    wellKnownText: ").append(toIndentedString(wellKnownText)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

