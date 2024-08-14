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
import com.flipdish.apiclient.model.StoreDeliveryZoneFeeConfig;
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
 * Request to update store delivery zone fee config
 */
@ApiModel(description = "Request to update store delivery zone fee config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-14T11:38:28.696Z")
public class StoreDeliveryZoneFeeConfigUpdateRequest {
  @SerializedName("DeliveryZoneFees")
  private List<StoreDeliveryZoneFeeConfig> deliveryZoneFees = null;

  public StoreDeliveryZoneFeeConfigUpdateRequest deliveryZoneFees(List<StoreDeliveryZoneFeeConfig> deliveryZoneFees) {
    this.deliveryZoneFees = deliveryZoneFees;
    return this;
  }

  public StoreDeliveryZoneFeeConfigUpdateRequest addDeliveryZoneFeesItem(StoreDeliveryZoneFeeConfig deliveryZoneFeesItem) {
    if (this.deliveryZoneFees == null) {
      this.deliveryZoneFees = new ArrayList<StoreDeliveryZoneFeeConfig>();
    }
    this.deliveryZoneFees.add(deliveryZoneFeesItem);
    return this;
  }

   /**
   * Delivery zone fees to update
   * @return deliveryZoneFees
  **/
  @ApiModelProperty(value = "Delivery zone fees to update")
  public List<StoreDeliveryZoneFeeConfig> getDeliveryZoneFees() {
    return deliveryZoneFees;
  }

  public void setDeliveryZoneFees(List<StoreDeliveryZoneFeeConfig> deliveryZoneFees) {
    this.deliveryZoneFees = deliveryZoneFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDeliveryZoneFeeConfigUpdateRequest storeDeliveryZoneFeeConfigUpdateRequest = (StoreDeliveryZoneFeeConfigUpdateRequest) o;
    return Objects.equals(this.deliveryZoneFees, storeDeliveryZoneFeeConfigUpdateRequest.deliveryZoneFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryZoneFees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDeliveryZoneFeeConfigUpdateRequest {\n");
    
    sb.append("    deliveryZoneFees: ").append(toIndentedString(deliveryZoneFees)).append("\n");
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

