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
 * AppStoreSubscriptionItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-27T09:42:08.317Z")
public class AppStoreSubscriptionItem {
  @SerializedName("ExternalSubscriptionId")
  private String externalSubscriptionId = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("UserEmail")
  private String userEmail = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubscriptionChangeJobId")
  private String subscriptionChangeJobId = null;

  public AppStoreSubscriptionItem externalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = externalSubscriptionId;
    return this;
  }

   /**
   * Get externalSubscriptionId
   * @return externalSubscriptionId
  **/
  @ApiModelProperty(value = "")
  public String getExternalSubscriptionId() {
    return externalSubscriptionId;
  }

  public void setExternalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = externalSubscriptionId;
  }

  public AppStoreSubscriptionItem storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public AppStoreSubscriptionItem addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Get storeIds
   * @return storeIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public AppStoreSubscriptionItem userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public AppStoreSubscriptionItem userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @ApiModelProperty(value = "")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public AppStoreSubscriptionItem status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AppStoreSubscriptionItem subscriptionChangeJobId(String subscriptionChangeJobId) {
    this.subscriptionChangeJobId = subscriptionChangeJobId;
    return this;
  }

   /**
   * Get subscriptionChangeJobId
   * @return subscriptionChangeJobId
  **/
  @ApiModelProperty(value = "")
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
    AppStoreSubscriptionItem appStoreSubscriptionItem = (AppStoreSubscriptionItem) o;
    return Objects.equals(this.externalSubscriptionId, appStoreSubscriptionItem.externalSubscriptionId) &&
        Objects.equals(this.storeIds, appStoreSubscriptionItem.storeIds) &&
        Objects.equals(this.userId, appStoreSubscriptionItem.userId) &&
        Objects.equals(this.userEmail, appStoreSubscriptionItem.userEmail) &&
        Objects.equals(this.status, appStoreSubscriptionItem.status) &&
        Objects.equals(this.subscriptionChangeJobId, appStoreSubscriptionItem.subscriptionChangeJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSubscriptionId, storeIds, userId, userEmail, status, subscriptionChangeJobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreSubscriptionItem {\n");
    
    sb.append("    externalSubscriptionId: ").append(toIndentedString(externalSubscriptionId)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

