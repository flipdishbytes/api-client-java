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
 * Store Service Charge
 */
@ApiModel(description = "Store Service Charge")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-11T15:22:02.745+01:00")
public class ServiceCharge {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("PercentageValue")
  private Double percentageValue = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  public ServiceCharge storeId(Integer storeId) {
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

  public ServiceCharge percentageValue(Double percentageValue) {
    this.percentageValue = percentageValue;
    return this;
  }

   /**
   * The Default Service Charge Value
   * @return percentageValue
  **/
  @ApiModelProperty(value = "The Default Service Charge Value")
  public Double getPercentageValue() {
    return percentageValue;
  }

  public void setPercentageValue(Double percentageValue) {
    this.percentageValue = percentageValue;
  }

  public ServiceCharge enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable Service Charge for store true(on) / false(off)
   * @return enabled
  **/
  @ApiModelProperty(value = "Enable Service Charge for store true(on) / false(off)")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCharge serviceCharge = (ServiceCharge) o;
    return Objects.equals(this.storeId, serviceCharge.storeId) &&
        Objects.equals(this.percentageValue, serviceCharge.percentageValue) &&
        Objects.equals(this.enabled, serviceCharge.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, percentageValue, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCharge {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    percentageValue: ").append(toIndentedString(percentageValue)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

