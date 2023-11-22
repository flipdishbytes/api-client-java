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
 * Basic attributes for creating an account
 */
@ApiModel(description = "Basic attributes for creating an account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-22T13:09:00.059Z")
public class CreateBasicAccountModel {
  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("LanguageId")
  private String languageId = null;

  @SerializedName("OpportunityId")
  private String opportunityId = null;

  @SerializedName("AccountId")
  private String accountId = null;

  public CreateBasicAccountModel storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store name
   * @return storeName
  **/
  @ApiModelProperty(required = true, value = "Store name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public CreateBasicAccountModel languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * LanguageId
   * @return languageId
  **/
  @ApiModelProperty(value = "LanguageId")
  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public CreateBasicAccountModel opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }

   /**
   * Salesforce Opportunity ID
   * @return opportunityId
  **/
  @ApiModelProperty(value = "Salesforce Opportunity ID")
  public String getOpportunityId() {
    return opportunityId;
  }

  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }

  public CreateBasicAccountModel accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Salesforce Account Id
   * @return accountId
  **/
  @ApiModelProperty(value = "Salesforce Account Id")
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
    CreateBasicAccountModel createBasicAccountModel = (CreateBasicAccountModel) o;
    return Objects.equals(this.storeName, createBasicAccountModel.storeName) &&
        Objects.equals(this.languageId, createBasicAccountModel.languageId) &&
        Objects.equals(this.opportunityId, createBasicAccountModel.opportunityId) &&
        Objects.equals(this.accountId, createBasicAccountModel.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, languageId, opportunityId, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBasicAccountModel {\n");
    
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
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

