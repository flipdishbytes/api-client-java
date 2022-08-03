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
 * Represents a store that is assigned to a Sales Channel
 */
@ApiModel(description = "Represents a store that is assigned to a Sales Channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-03T13:33:49.409+01:00")
public class StoreChannelAssignment {
  @SerializedName("ChannelId")
  private Integer channelId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  public StoreChannelAssignment channelId(Integer channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Channel ID
   * @return channelId
  **/
  @ApiModelProperty(value = "Channel ID")
  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public StoreChannelAssignment storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID
   * @return storeId
  **/
  @ApiModelProperty(value = "Store ID")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreChannelAssignment storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store Name
   * @return storeName
  **/
  @ApiModelProperty(value = "Store Name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreChannelAssignment storeChannelAssignment = (StoreChannelAssignment) o;
    return Objects.equals(this.channelId, storeChannelAssignment.channelId) &&
        Objects.equals(this.storeId, storeChannelAssignment.storeId) &&
        Objects.equals(this.storeName, storeChannelAssignment.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, storeId, storeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreChannelAssignment {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

