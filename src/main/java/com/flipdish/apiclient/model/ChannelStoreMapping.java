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
 * Describes a channel store mapping
 */
@ApiModel(description = "Describes a channel store mapping")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T09:40:04.883Z")
public class ChannelStoreMapping {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("ChannelStoreId")
  private String channelStoreId = null;

  public ChannelStoreMapping storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public ChannelStoreMapping channelStoreId(String channelStoreId) {
    this.channelStoreId = channelStoreId;
    return this;
  }

   /**
   * Get channelStoreId
   * @return channelStoreId
  **/
  @ApiModelProperty(value = "")
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
    ChannelStoreMapping channelStoreMapping = (ChannelStoreMapping) o;
    return Objects.equals(this.storeId, channelStoreMapping.storeId) &&
        Objects.equals(this.channelStoreId, channelStoreMapping.channelStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, channelStoreId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelStoreMapping {\n");
    
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

