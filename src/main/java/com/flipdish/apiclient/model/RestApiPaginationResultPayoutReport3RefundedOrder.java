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
import com.flipdish.apiclient.model.PayoutReport3RefundedOrder;
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
 * Rest api pagination result
 */
@ApiModel(description = "Rest api pagination result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-04T11:36:58.526Z")
public class RestApiPaginationResultPayoutReport3RefundedOrder {
  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  @SerializedName("Data")
  private List<PayoutReport3RefundedOrder> data = new ArrayList<PayoutReport3RefundedOrder>();

  public RestApiPaginationResultPayoutReport3RefundedOrder page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Current page index
   * @return page
  **/
  @ApiModelProperty(required = true, value = "Current page index")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public RestApiPaginationResultPayoutReport3RefundedOrder limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Current page size
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "Current page size")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public RestApiPaginationResultPayoutReport3RefundedOrder totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * Total record count
   * @return totalRecordCount
  **/
  @ApiModelProperty(required = true, value = "Total record count")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

  public RestApiPaginationResultPayoutReport3RefundedOrder data(List<PayoutReport3RefundedOrder> data) {
    this.data = data;
    return this;
  }

  public RestApiPaginationResultPayoutReport3RefundedOrder addDataItem(PayoutReport3RefundedOrder dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Generic data object.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Generic data object.")
  public List<PayoutReport3RefundedOrder> getData() {
    return data;
  }

  public void setData(List<PayoutReport3RefundedOrder> data) {
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
    RestApiPaginationResultPayoutReport3RefundedOrder restApiPaginationResultPayoutReport3RefundedOrder = (RestApiPaginationResultPayoutReport3RefundedOrder) o;
    return Objects.equals(this.page, restApiPaginationResultPayoutReport3RefundedOrder.page) &&
        Objects.equals(this.limit, restApiPaginationResultPayoutReport3RefundedOrder.limit) &&
        Objects.equals(this.totalRecordCount, restApiPaginationResultPayoutReport3RefundedOrder.totalRecordCount) &&
        Objects.equals(this.data, restApiPaginationResultPayoutReport3RefundedOrder.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalRecordCount, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiPaginationResultPayoutReport3RefundedOrder {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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

