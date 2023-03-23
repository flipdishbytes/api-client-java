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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-23T12:28:13.209Z")
public class OrderBatchSummary {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("DisplayCode")
  private String displayCode = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  public OrderBatchSummary id(Integer id) {
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

  public OrderBatchSummary displayCode(String displayCode) {
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

  public OrderBatchSummary createTime(OffsetDateTime createTime) {
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

  public OrderBatchSummary isPublished(Boolean isPublished) {
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
    OrderBatchSummary orderBatchSummary = (OrderBatchSummary) o;
    return Objects.equals(this.id, orderBatchSummary.id) &&
        Objects.equals(this.displayCode, orderBatchSummary.displayCode) &&
        Objects.equals(this.createTime, orderBatchSummary.createTime) &&
        Objects.equals(this.isPublished, orderBatchSummary.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayCode, createTime, isPublished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBatchSummary {\n");
    
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

