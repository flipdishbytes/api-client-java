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
import com.flipdish.apiclient.model.AppStoreAppSubscriptionAccount;
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
 * AppStoreAppSubscriptionSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T06:28:53.942Z")
public class AppStoreAppSubscriptionSummary {
  @SerializedName("TotalSubscriptions")
  private Integer totalSubscriptions = null;

  @SerializedName("UsedSubscriptions")
  private Integer usedSubscriptions = null;

  @SerializedName("SubscriptionAccountIsSetupForClient")
  private Boolean subscriptionAccountIsSetupForClient = null;

  @SerializedName("SubscriptionAccounts")
  private List<AppStoreAppSubscriptionAccount> subscriptionAccounts = null;

  public AppStoreAppSubscriptionSummary totalSubscriptions(Integer totalSubscriptions) {
    this.totalSubscriptions = totalSubscriptions;
    return this;
  }

   /**
   * Get totalSubscriptions
   * @return totalSubscriptions
  **/
  @ApiModelProperty(value = "")
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
   * Get usedSubscriptions
   * @return usedSubscriptions
  **/
  @ApiModelProperty(value = "")
  public Integer getUsedSubscriptions() {
    return usedSubscriptions;
  }

  public void setUsedSubscriptions(Integer usedSubscriptions) {
    this.usedSubscriptions = usedSubscriptions;
  }

  public AppStoreAppSubscriptionSummary subscriptionAccountIsSetupForClient(Boolean subscriptionAccountIsSetupForClient) {
    this.subscriptionAccountIsSetupForClient = subscriptionAccountIsSetupForClient;
    return this;
  }

   /**
   * Get subscriptionAccountIsSetupForClient
   * @return subscriptionAccountIsSetupForClient
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionAccountIsSetupForClient() {
    return subscriptionAccountIsSetupForClient;
  }

  public void setSubscriptionAccountIsSetupForClient(Boolean subscriptionAccountIsSetupForClient) {
    this.subscriptionAccountIsSetupForClient = subscriptionAccountIsSetupForClient;
  }

  public AppStoreAppSubscriptionSummary subscriptionAccounts(List<AppStoreAppSubscriptionAccount> subscriptionAccounts) {
    this.subscriptionAccounts = subscriptionAccounts;
    return this;
  }

  public AppStoreAppSubscriptionSummary addSubscriptionAccountsItem(AppStoreAppSubscriptionAccount subscriptionAccountsItem) {
    if (this.subscriptionAccounts == null) {
      this.subscriptionAccounts = new ArrayList<AppStoreAppSubscriptionAccount>();
    }
    this.subscriptionAccounts.add(subscriptionAccountsItem);
    return this;
  }

   /**
   * Get subscriptionAccounts
   * @return subscriptionAccounts
  **/
  @ApiModelProperty(value = "")
  public List<AppStoreAppSubscriptionAccount> getSubscriptionAccounts() {
    return subscriptionAccounts;
  }

  public void setSubscriptionAccounts(List<AppStoreAppSubscriptionAccount> subscriptionAccounts) {
    this.subscriptionAccounts = subscriptionAccounts;
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
        Objects.equals(this.usedSubscriptions, appStoreAppSubscriptionSummary.usedSubscriptions) &&
        Objects.equals(this.subscriptionAccountIsSetupForClient, appStoreAppSubscriptionSummary.subscriptionAccountIsSetupForClient) &&
        Objects.equals(this.subscriptionAccounts, appStoreAppSubscriptionSummary.subscriptionAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSubscriptions, usedSubscriptions, subscriptionAccountIsSetupForClient, subscriptionAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppSubscriptionSummary {\n");
    
    sb.append("    totalSubscriptions: ").append(toIndentedString(totalSubscriptions)).append("\n");
    sb.append("    usedSubscriptions: ").append(toIndentedString(usedSubscriptions)).append("\n");
    sb.append("    subscriptionAccountIsSetupForClient: ").append(toIndentedString(subscriptionAccountIsSetupForClient)).append("\n");
    sb.append("    subscriptionAccounts: ").append(toIndentedString(subscriptionAccounts)).append("\n");
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

