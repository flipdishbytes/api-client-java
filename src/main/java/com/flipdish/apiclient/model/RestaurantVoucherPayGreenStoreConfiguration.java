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
 * RestaurantVoucherPayGreenStoreConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-10T14:21:53.091Z")
public class RestaurantVoucherPayGreenStoreConfiguration {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Active")
  private Boolean active = null;

  @SerializedName("PayGreenId")
  private String payGreenId = null;

  @SerializedName("PayGreenConfigurationId")
  private Integer payGreenConfigurationId = null;

  public RestaurantVoucherPayGreenStoreConfiguration name(String name) {
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

  public RestaurantVoucherPayGreenStoreConfiguration active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public RestaurantVoucherPayGreenStoreConfiguration payGreenId(String payGreenId) {
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

  public RestaurantVoucherPayGreenStoreConfiguration payGreenConfigurationId(Integer payGreenConfigurationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantVoucherPayGreenStoreConfiguration restaurantVoucherPayGreenStoreConfiguration = (RestaurantVoucherPayGreenStoreConfiguration) o;
    return Objects.equals(this.name, restaurantVoucherPayGreenStoreConfiguration.name) &&
        Objects.equals(this.active, restaurantVoucherPayGreenStoreConfiguration.active) &&
        Objects.equals(this.payGreenId, restaurantVoucherPayGreenStoreConfiguration.payGreenId) &&
        Objects.equals(this.payGreenConfigurationId, restaurantVoucherPayGreenStoreConfiguration.payGreenConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, payGreenId, payGreenConfigurationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantVoucherPayGreenStoreConfiguration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    payGreenId: ").append(toIndentedString(payGreenId)).append("\n");
    sb.append("    payGreenConfigurationId: ").append(toIndentedString(payGreenConfigurationId)).append("\n");
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

