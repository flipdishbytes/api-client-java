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
 * Describes the configuration of OrderBatching
 */
@ApiModel(description = "Describes the configuration of OrderBatching")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-24T13:37:20.540Z")
public class OrderBatchingConfiguration {
  @SerializedName("BatchIntervalInSeconds")
  private Integer batchIntervalInSeconds = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  public OrderBatchingConfiguration batchIntervalInSeconds(Integer batchIntervalInSeconds) {
    this.batchIntervalInSeconds = batchIntervalInSeconds;
    return this;
  }

   /**
   * Batch sending interval in seconds
   * @return batchIntervalInSeconds
  **/
  @ApiModelProperty(value = "Batch sending interval in seconds")
  public Integer getBatchIntervalInSeconds() {
    return batchIntervalInSeconds;
  }

  public void setBatchIntervalInSeconds(Integer batchIntervalInSeconds) {
    this.batchIntervalInSeconds = batchIntervalInSeconds;
  }

  public OrderBatchingConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * OrderBatching is enabled or not
   * @return isEnabled
  **/
  @ApiModelProperty(value = "OrderBatching is enabled or not")
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
    OrderBatchingConfiguration orderBatchingConfiguration = (OrderBatchingConfiguration) o;
    return Objects.equals(this.batchIntervalInSeconds, orderBatchingConfiguration.batchIntervalInSeconds) &&
        Objects.equals(this.isEnabled, orderBatchingConfiguration.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchIntervalInSeconds, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBatchingConfiguration {\n");
    
    sb.append("    batchIntervalInSeconds: ").append(toIndentedString(batchIntervalInSeconds)).append("\n");
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

