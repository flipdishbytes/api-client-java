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
 * App store subscription information
 */
@ApiModel(description = "App store subscription information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-06T15:55:48.779Z")
public class AppStoreAppSubscriptionSummary {
  @SerializedName("TotalSubscriptions")
  private Integer totalSubscriptions = null;

  @SerializedName("UsedSubscriptions")
  private Integer usedSubscriptions = null;

  public AppStoreAppSubscriptionSummary totalSubscriptions(Integer totalSubscriptions) {
    this.totalSubscriptions = totalSubscriptions;
    return this;
  }

   /**
   * Total subscriptions (per the AppId subscription setup)
   * @return totalSubscriptions
  **/
  @ApiModelProperty(value = "Total subscriptions (per the AppId subscription setup)")
  public Integer getTotalSubscriptions() {
    return totalSubscriptions;
  }

  public void setTotalSubscriptions(Integer totalSubscriptions) {
    this.totalSubscriptions = totalSubscriptions;
  }

  public AppStoreAppSubscriptionSummary usedSubscriptions(Integer usedSubscriptions) {
    this.usedSubscriptions = usedSubscriptions;
    return this;
  }

   /**
   * Number of subscriptions configured and enabled
   * @return usedSubscriptions
  **/
  @ApiModelProperty(value = "Number of subscriptions configured and enabled")
  public Integer getUsedSubscriptions() {
    return usedSubscriptions;
  }

  public void setUsedSubscriptions(Integer usedSubscriptions) {
    this.usedSubscriptions = usedSubscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppSubscriptionSummary appStoreAppSubscriptionSummary = (AppStoreAppSubscriptionSummary) o;
    return Objects.equals(this.totalSubscriptions, appStoreAppSubscriptionSummary.totalSubscriptions) &&
        Objects.equals(this.usedSubscriptions, appStoreAppSubscriptionSummary.usedSubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSubscriptions, usedSubscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppSubscriptionSummary {\n");
    
    sb.append("    totalSubscriptions: ").append(toIndentedString(totalSubscriptions)).append("\n");
    sb.append("    usedSubscriptions: ").append(toIndentedString(usedSubscriptions)).append("\n");
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

