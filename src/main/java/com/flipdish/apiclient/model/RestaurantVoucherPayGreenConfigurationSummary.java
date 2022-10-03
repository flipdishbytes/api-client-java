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
 * RestaurantVoucherPayGreenConfigurationSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-03T09:57:13.852+01:00")
public class RestaurantVoucherPayGreenConfigurationSummary {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("PayGreenConfigurationId")
  private Integer payGreenConfigurationId = null;

  public RestaurantVoucherPayGreenConfigurationSummary name(String name) {
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

  public RestaurantVoucherPayGreenConfigurationSummary payGreenConfigurationId(Integer payGreenConfigurationId) {
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
    RestaurantVoucherPayGreenConfigurationSummary restaurantVoucherPayGreenConfigurationSummary = (RestaurantVoucherPayGreenConfigurationSummary) o;
    return Objects.equals(this.name, restaurantVoucherPayGreenConfigurationSummary.name) &&
        Objects.equals(this.payGreenConfigurationId, restaurantVoucherPayGreenConfigurationSummary.payGreenConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, payGreenConfigurationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantVoucherPayGreenConfigurationSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

