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
 * Store campaign start time
 */
@ApiModel(description = "Store campaign start time")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-23T10:58:00.815Z")
public class StoreCampaignStartTime {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("TsStart")
  private OffsetDateTime tsStart = null;

  public StoreCampaignStartTime storeId(Integer storeId) {
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

  public StoreCampaignStartTime tsStart(OffsetDateTime tsStart) {
    this.tsStart = tsStart;
    return this;
  }

   /**
   * Campaign start time in Utc
   * @return tsStart
  **/
  @ApiModelProperty(value = "Campaign start time in Utc")
  public OffsetDateTime getTsStart() {
    return tsStart;
  }

  public void setTsStart(OffsetDateTime tsStart) {
    this.tsStart = tsStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreCampaignStartTime storeCampaignStartTime = (StoreCampaignStartTime) o;
    return Objects.equals(this.storeId, storeCampaignStartTime.storeId) &&
        Objects.equals(this.tsStart, storeCampaignStartTime.tsStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, tsStart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreCampaignStartTime {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    tsStart: ").append(toIndentedString(tsStart)).append("\n");
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

