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
 * RestaurantVoucherPaygreenConfigurationSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-21T12:06:42.217+01:00")
public class RestaurantVoucherPaygreenConfigurationSummary {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("PaygreenConfigurationId")
  private Integer paygreenConfigurationId = null;

  public RestaurantVoucherPaygreenConfigurationSummary name(String name) {
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

  public RestaurantVoucherPaygreenConfigurationSummary paygreenConfigurationId(Integer paygreenConfigurationId) {
    this.paygreenConfigurationId = paygreenConfigurationId;
    return this;
  }

   /**
   * Get paygreenConfigurationId
   * @return paygreenConfigurationId
  **/
  @ApiModelProperty(value = "")
  public Integer getPaygreenConfigurationId() {
    return paygreenConfigurationId;
  }

  public void setPaygreenConfigurationId(Integer paygreenConfigurationId) {
    this.paygreenConfigurationId = paygreenConfigurationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantVoucherPaygreenConfigurationSummary restaurantVoucherPaygreenConfigurationSummary = (RestaurantVoucherPaygreenConfigurationSummary) o;
    return Objects.equals(this.name, restaurantVoucherPaygreenConfigurationSummary.name) &&
        Objects.equals(this.paygreenConfigurationId, restaurantVoucherPaygreenConfigurationSummary.paygreenConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, paygreenConfigurationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantVoucherPaygreenConfigurationSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paygreenConfigurationId: ").append(toIndentedString(paygreenConfigurationId)).append("\n");
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

