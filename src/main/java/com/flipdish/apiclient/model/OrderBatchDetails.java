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
import org.threeten.bp.OffsetDateTime;

/**
 * Order batch info
 */
@ApiModel(description = "Order batch info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-22T13:15:21.811+01:00")
public class OrderBatchDetails {
  @SerializedName("OrderBatchId")
  private Integer orderBatchId = null;

  @SerializedName("DisplayCode")
  private String displayCode = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  public OrderBatchDetails orderBatchId(Integer orderBatchId) {
    this.orderBatchId = orderBatchId;
    return this;
  }

   /**
   * Order batch id
   * @return orderBatchId
  **/
  @ApiModelProperty(value = "Order batch id")
  public Integer getOrderBatchId() {
    return orderBatchId;
  }

  public void setOrderBatchId(Integer orderBatchId) {
    this.orderBatchId = orderBatchId;
  }

  public OrderBatchDetails displayCode(String displayCode) {
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

  public OrderBatchDetails createTime(OffsetDateTime createTime) {
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

  public OrderBatchDetails isPublished(Boolean isPublished) {
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
    OrderBatchDetails orderBatchDetails = (OrderBatchDetails) o;
    return Objects.equals(this.orderBatchId, orderBatchDetails.orderBatchId) &&
        Objects.equals(this.displayCode, orderBatchDetails.displayCode) &&
        Objects.equals(this.createTime, orderBatchDetails.createTime) &&
        Objects.equals(this.isPublished, orderBatchDetails.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBatchId, displayCode, createTime, isPublished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBatchDetails {\n");
    
    sb.append("    orderBatchId: ").append(toIndentedString(orderBatchId)).append("\n");
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

