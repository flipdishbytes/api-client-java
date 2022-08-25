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
import com.flipdish.apiclient.model.RestaurantVoucherAssignedStore;
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
 * RestaurantVoucherPayGreenConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-25T08:51:53.675+01:00")
public class RestaurantVoucherPayGreenConfiguration {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("PayGreenId")
  private String payGreenId = null;

  @SerializedName("PayGreenConfigurationId")
  private Integer payGreenConfigurationId = null;

  @SerializedName("AssignedStores")
  private List<RestaurantVoucherAssignedStore> assignedStores = null;

  public RestaurantVoucherPayGreenConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RestaurantVoucherPayGreenConfiguration payGreenId(String payGreenId) {
    this.payGreenId = payGreenId;
    return this;
  }

   /**
   * Get payGreenId
   * @return payGreenId
  **/
  @ApiModelProperty(value = "")
  public String getPayGreenId() {
    return payGreenId;
  }

  public void setPayGreenId(String payGreenId) {
    this.payGreenId = payGreenId;
  }

  public RestaurantVoucherPayGreenConfiguration payGreenConfigurationId(Integer payGreenConfigurationId) {
    this.payGreenConfigurationId = payGreenConfigurationId;
    return this;
  }

   /**
   * Get payGreenConfigurationId
   * @return payGreenConfigurationId
  **/
  @ApiModelProperty(value = "")
  public Integer getPayGreenConfigurationId() {
    return payGreenConfigurationId;
  }

  public void setPayGreenConfigurationId(Integer payGreenConfigurationId) {
    this.payGreenConfigurationId = payGreenConfigurationId;
  }

  public RestaurantVoucherPayGreenConfiguration assignedStores(List<RestaurantVoucherAssignedStore> assignedStores) {
    this.assignedStores = assignedStores;
    return this;
  }

  public RestaurantVoucherPayGreenConfiguration addAssignedStoresItem(RestaurantVoucherAssignedStore assignedStoresItem) {
    if (this.assignedStores == null) {
      this.assignedStores = new ArrayList<RestaurantVoucherAssignedStore>();
    }
    this.assignedStores.add(assignedStoresItem);
    return this;
  }

   /**
   * Get assignedStores
   * @return assignedStores
  **/
  @ApiModelProperty(value = "")
  public List<RestaurantVoucherAssignedStore> getAssignedStores() {
    return assignedStores;
  }

  public void setAssignedStores(List<RestaurantVoucherAssignedStore> assignedStores) {
    this.assignedStores = assignedStores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantVoucherPayGreenConfiguration restaurantVoucherPayGreenConfiguration = (RestaurantVoucherPayGreenConfiguration) o;
    return Objects.equals(this.name, restaurantVoucherPayGreenConfiguration.name) &&
        Objects.equals(this.payGreenId, restaurantVoucherPayGreenConfiguration.payGreenId) &&
        Objects.equals(this.payGreenConfigurationId, restaurantVoucherPayGreenConfiguration.payGreenConfigurationId) &&
        Objects.equals(this.assignedStores, restaurantVoucherPayGreenConfiguration.assignedStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, payGreenId, payGreenConfigurationId, assignedStores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantVoucherPayGreenConfiguration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payGreenId: ").append(toIndentedString(payGreenId)).append("\n");
    sb.append("    payGreenConfigurationId: ").append(toIndentedString(payGreenConfigurationId)).append("\n");
    sb.append("    assignedStores: ").append(toIndentedString(assignedStores)).append("\n");
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

