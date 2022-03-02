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
 * Assigned to Store Bank Account
 */
@ApiModel(description = "Assigned to Store Bank Account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T15:41:59.208Z")
public class AssignedBankAccount {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("BankAccountName")
  private String bankAccountName = null;

  public AssignedBankAccount id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of Bank Account
   * @return id
  **/
  @ApiModelProperty(value = "Id of Bank Account")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AssignedBankAccount bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

   /**
   * Name of Bank Account
   * @return bankAccountName
  **/
  @ApiModelProperty(value = "Name of Bank Account")
  public String getBankAccountName() {
    return bankAccountName;
  }

  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedBankAccount assignedBankAccount = (AssignedBankAccount) o;
    return Objects.equals(this.id, assignedBankAccount.id) &&
        Objects.equals(this.bankAccountName, assignedBankAccount.bankAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankAccountName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedBankAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
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

