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
 * Describes an ID mapping between Flipdish Store and Channel Store
 */
@ApiModel(description = "Describes an ID mapping between Flipdish Store and Channel Store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-16T12:54:25.279Z")
public class StoreChannelStoreMapping {
  @SerializedName("ChannelId")
  private Integer channelId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("ChannelStoreId")
  private String channelStoreId = null;

  public StoreChannelStoreMapping channelId(Integer channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Channel Id
   * @return channelId
  **/
  @ApiModelProperty(value = "Channel Id")
  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public StoreChannelStoreMapping storeId(Integer storeId) {
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

  public StoreChannelStoreMapping channelStoreId(String channelStoreId) {
    this.channelStoreId = channelStoreId;
    return this;
  }

   /**
   * Channel Store Id
   * @return channelStoreId
  **/
  @ApiModelProperty(value = "Channel Store Id")
  public String getChannelStoreId() {
    return channelStoreId;
  }

  public void setChannelStoreId(String channelStoreId) {
    this.channelStoreId = channelStoreId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreChannelStoreMapping storeChannelStoreMapping = (StoreChannelStoreMapping) o;
    return Objects.equals(this.channelId, storeChannelStoreMapping.channelId) &&
        Objects.equals(this.storeId, storeChannelStoreMapping.storeId) &&
        Objects.equals(this.channelStoreId, storeChannelStoreMapping.channelStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, storeId, channelStoreId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreChannelStoreMapping {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    channelStoreId: ").append(toIndentedString(channelStoreId)).append("\n");
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

