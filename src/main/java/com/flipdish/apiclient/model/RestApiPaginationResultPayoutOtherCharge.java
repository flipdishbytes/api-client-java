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
import com.flipdish.apiclient.model.PayoutOtherCharge;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-16T14:34:50.609+01:00")
public class RestApiPaginationResultPayoutOtherCharge {
  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  @SerializedName("Data")
  private List<PayoutOtherCharge> data = new ArrayList<PayoutOtherCharge>();

  public RestApiPaginationResultPayoutOtherCharge page(Integer page) {
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

  public RestApiPaginationResultPayoutOtherCharge limit(Integer limit) {
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

  public RestApiPaginationResultPayoutOtherCharge totalRecordCount(Integer totalRecordCount) {
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

  public RestApiPaginationResultPayoutOtherCharge data(List<PayoutOtherCharge> data) {
    this.data = data;
    return this;
  }

  public RestApiPaginationResultPayoutOtherCharge addDataItem(PayoutOtherCharge dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Generic data object.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Generic data object.")
  public List<PayoutOtherCharge> getData() {
    return data;
  }

  public void setData(List<PayoutOtherCharge> data) {
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
    RestApiPaginationResultPayoutOtherCharge restApiPaginationResultPayoutOtherCharge = (RestApiPaginationResultPayoutOtherCharge) o;
    return Objects.equals(this.page, restApiPaginationResultPayoutOtherCharge.page) &&
        Objects.equals(this.limit, restApiPaginationResultPayoutOtherCharge.limit) &&
        Objects.equals(this.totalRecordCount, restApiPaginationResultPayoutOtherCharge.totalRecordCount) &&
        Objects.equals(this.data, restApiPaginationResultPayoutOtherCharge.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalRecordCount, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiPaginationResultPayoutOtherCharge {\n");
    
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

