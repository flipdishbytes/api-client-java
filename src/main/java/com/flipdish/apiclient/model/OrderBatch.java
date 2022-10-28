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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Order batch detailed information
 */
@ApiModel(description = "Order batch detailed information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-28T14:38:13.608+01:00")
public class OrderBatch {
  @SerializedName("OrderIds")
  private List<Integer> orderIds = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("DisplayCode")
  private String displayCode = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  public OrderBatch orderIds(List<Integer> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public OrderBatch addOrderIdsItem(Integer orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<Integer>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Orders&#39; ids on the batch
   * @return orderIds
  **/
  @ApiModelProperty(value = "Orders' ids on the batch")
  public List<Integer> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<Integer> orderIds) {
    this.orderIds = orderIds;
  }

  public OrderBatch id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Order batch id
   * @return id
  **/
  @ApiModelProperty(value = "Order batch id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderBatch displayCode(String displayCode) {
    this.displayCode = displayCode;
    return this;
  }

   /**
   * Order batch 6-sign human readable code
   * @return displayCode
  **/
  @ApiModelProperty(value = "Order batch 6-sign human readable code")
  public String getDisplayCode() {
    return displayCode;
  }

  public void setDisplayCode(String displayCode) {
    this.displayCode = displayCode;
  }

  public OrderBatch createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Batch creation date and time
   * @return createTime
  **/
  @ApiModelProperty(value = "Batch creation date and time")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public OrderBatch isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * If the batch is already published
   * @return isPublished
  **/
  @ApiModelProperty(value = "If the batch is already published")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBatch orderBatch = (OrderBatch) o;
    return Objects.equals(this.orderIds, orderBatch.orderIds) &&
        Objects.equals(this.id, orderBatch.id) &&
        Objects.equals(this.displayCode, orderBatch.displayCode) &&
        Objects.equals(this.createTime, orderBatch.createTime) &&
        Objects.equals(this.isPublished, orderBatch.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds, id, displayCode, createTime, isPublished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBatch {\n");
    
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayCode: ").append(toIndentedString(displayCode)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

