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
import com.flipdish.apiclient.model.PayoutSummary;
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
 * Rest api array result
 */
@ApiModel(description = "Rest api array result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T09:54:22.821Z")
public class RestApiArrayResultPayoutSummary {
  @SerializedName("Data")
  private List<PayoutSummary> data = new ArrayList<PayoutSummary>();

  public RestApiArrayResultPayoutSummary data(List<PayoutSummary> data) {
    this.data = data;
    return this;
  }

  public RestApiArrayResultPayoutSummary addDataItem(PayoutSummary dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Generic data object.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Generic data object.")
  public List<PayoutSummary> getData() {
    return data;
  }

  public void setData(List<PayoutSummary> data) {
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
    RestApiArrayResultPayoutSummary restApiArrayResultPayoutSummary = (RestApiArrayResultPayoutSummary) o;
    return Objects.equals(this.data, restApiArrayResultPayoutSummary.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiArrayResultPayoutSummary {\n");
    
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

