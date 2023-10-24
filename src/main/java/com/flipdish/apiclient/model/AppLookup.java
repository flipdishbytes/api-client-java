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
 * App lookup model
 */
@ApiModel(description = "App lookup model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-24T12:01:02.196Z")
public class AppLookup {
  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("OpportunityId")
  private String opportunityId = null;

  @SerializedName("AccountId")
  private String accountId = null;

  public AppLookup appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AppLookup opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }

   /**
   * Salesforce opportunity id
   * @return opportunityId
  **/
  @ApiModelProperty(value = "Salesforce opportunity id")
  public String getOpportunityId() {
    return opportunityId;
  }

  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }

  public AppLookup accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Salesforce account id
   * @return accountId
  **/
  @ApiModelProperty(value = "Salesforce account id")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLookup appLookup = (AppLookup) o;
    return Objects.equals(this.appId, appLookup.appId) &&
        Objects.equals(this.opportunityId, appLookup.opportunityId) &&
        Objects.equals(this.accountId, appLookup.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, opportunityId, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLookup {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

