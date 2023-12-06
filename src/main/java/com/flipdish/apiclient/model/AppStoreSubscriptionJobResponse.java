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
 * Subscription change job can be longer running, this contains job information
 */
@ApiModel(description = "Subscription change job can be longer running, this contains job information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-06T15:55:48.779Z")
public class AppStoreSubscriptionJobResponse {
  @SerializedName("SubscriptionChangeJobId")
  private String subscriptionChangeJobId = null;

  public AppStoreSubscriptionJobResponse subscriptionChangeJobId(String subscriptionChangeJobId) {
    this.subscriptionChangeJobId = subscriptionChangeJobId;
    return this;
  }

   /**
   * Subscription change job id
   * @return subscriptionChangeJobId
  **/
  @ApiModelProperty(value = "Subscription change job id")
  public String getSubscriptionChangeJobId() {
    return subscriptionChangeJobId;
  }

  public void setSubscriptionChangeJobId(String subscriptionChangeJobId) {
    this.subscriptionChangeJobId = subscriptionChangeJobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreSubscriptionJobResponse appStoreSubscriptionJobResponse = (AppStoreSubscriptionJobResponse) o;
    return Objects.equals(this.subscriptionChangeJobId, appStoreSubscriptionJobResponse.subscriptionChangeJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionChangeJobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreSubscriptionJobResponse {\n");
    
    sb.append("    subscriptionChangeJobId: ").append(toIndentedString(subscriptionChangeJobId)).append("\n");
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

