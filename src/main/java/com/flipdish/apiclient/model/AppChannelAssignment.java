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
 * Describes a ChannelAssignment which is   when a AppId is assigned to a Sales Channel
 */
@ApiModel(description = "Describes a ChannelAssignment which is   when a AppId is assigned to a Sales Channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-06T10:26:07.205+01:00")
public class AppChannelAssignment {
  @SerializedName("ChannelId")
  private Integer channelId = null;

  @SerializedName("AppId")
  private String appId = null;

  public AppChannelAssignment channelId(Integer channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Id of the channel on the assignment
   * @return channelId
  **/
  @ApiModelProperty(value = "Id of the channel on the assignment")
  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public AppChannelAssignment appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * AppId of the assignment
   * @return appId
  **/
  @ApiModelProperty(value = "AppId of the assignment")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppChannelAssignment appChannelAssignment = (AppChannelAssignment) o;
    return Objects.equals(this.channelId, appChannelAssignment.channelId) &&
        Objects.equals(this.appId, appChannelAssignment.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppChannelAssignment {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

