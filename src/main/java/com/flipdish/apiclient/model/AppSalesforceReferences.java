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
 * Whitelabel salesforce references
 */
@ApiModel(description = "Whitelabel salesforce references")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-22T10:32:41.599Z")
public class AppSalesforceReferences {
  @SerializedName("OpportunityId")
  private String opportunityId = null;

  @SerializedName("AccountId")
  private String accountId = null;

  public AppSalesforceReferences opportunityId(String opportunityId) {
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

  public AppSalesforceReferences accountId(String accountId) {
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
    AppSalesforceReferences appSalesforceReferences = (AppSalesforceReferences) o;
    return Objects.equals(this.opportunityId, appSalesforceReferences.opportunityId) &&
        Objects.equals(this.accountId, appSalesforceReferences.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opportunityId, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSalesforceReferences {\n");
    
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

