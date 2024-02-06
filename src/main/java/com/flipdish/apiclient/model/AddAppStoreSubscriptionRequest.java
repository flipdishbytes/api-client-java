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

/**
 * Add subscription
 */
@ApiModel(description = "Add subscription")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-06T12:18:31.729Z")
public class AddAppStoreSubscriptionRequest {
  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("SubscriptionAccountEmail")
  private String subscriptionAccountEmail = null;

  public AddAppStoreSubscriptionRequest storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public AddAppStoreSubscriptionRequest addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store ids to update
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store ids to update")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public AddAppStoreSubscriptionRequest subscriptionAccountEmail(String subscriptionAccountEmail) {
    this.subscriptionAccountEmail = subscriptionAccountEmail;
    return this;
  }

   /**
   * Email (for subscription setup) - optional, only required for admin access
   * @return subscriptionAccountEmail
  **/
  @ApiModelProperty(value = "Email (for subscription setup) - optional, only required for admin access")
  public String getSubscriptionAccountEmail() {
    return subscriptionAccountEmail;
  }

  public void setSubscriptionAccountEmail(String subscriptionAccountEmail) {
    this.subscriptionAccountEmail = subscriptionAccountEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAppStoreSubscriptionRequest addAppStoreSubscriptionRequest = (AddAppStoreSubscriptionRequest) o;
    return Objects.equals(this.storeIds, addAppStoreSubscriptionRequest.storeIds) &&
        Objects.equals(this.subscriptionAccountEmail, addAppStoreSubscriptionRequest.subscriptionAccountEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeIds, subscriptionAccountEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAppStoreSubscriptionRequest {\n");
    
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    subscriptionAccountEmail: ").append(toIndentedString(subscriptionAccountEmail)).append("\n");
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

