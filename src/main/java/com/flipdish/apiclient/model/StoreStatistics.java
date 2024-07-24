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
import com.flipdish.apiclient.model.StoreDataPoint;
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
 * Store statistics
 */
@ApiModel(description = "Store statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-24T09:30:12.495Z")
public class StoreStatistics {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("Data")
  private List<StoreDataPoint> data = null;

  public StoreStatistics storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreStatistics data(List<StoreDataPoint> data) {
    this.data = data;
    return this;
  }

  public StoreStatistics addDataItem(StoreDataPoint dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<StoreDataPoint>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Store Data Points
   * @return data
  **/
  @ApiModelProperty(value = "Store Data Points")
  public List<StoreDataPoint> getData() {
    return data;
  }

  public void setData(List<StoreDataPoint> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreStatistics storeStatistics = (StoreStatistics) o;
    return Objects.equals(this.storeId, storeStatistics.storeId) &&
        Objects.equals(this.data, storeStatistics.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreStatistics {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

