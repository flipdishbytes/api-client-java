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
 * Represents one store&#39;s order capacity configuration edit
 */
@ApiModel(description = "Represents one store's order capacity configuration edit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-03T10:31:00.711+01:00")
public class StoreOrderCapacityConfigEditModel {
  @SerializedName("OrderCapacityPeriods")
  private List<StoreOrderCapacityPeriod> orderCapacityPeriods = null;

  public StoreOrderCapacityConfigEditModel orderCapacityPeriods(List<StoreOrderCapacityPeriod> orderCapacityPeriods) {
    this.orderCapacityPeriods = orderCapacityPeriods;
    return this;
  }

  public StoreOrderCapacityConfigEditModel addOrderCapacityPeriodsItem(StoreOrderCapacityPeriod orderCapacityPeriodsItem) {
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
    StoreOrderCapacityConfigEditModel storeOrderCapacityConfigEditModel = (StoreOrderCapacityConfigEditModel) o;
    return Objects.equals(this.orderCapacityPeriods, storeOrderCapacityConfigEditModel.orderCapacityPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderCapacityPeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreOrderCapacityConfigEditModel {\n");
    
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

