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
 * Create account model
 */
@ApiModel(description = "Create account model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-21T15:36:05.706+01:00")
public class CreateAccountModel {
  @SerializedName("Email")
  private String email = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("LanguageId")
  private String languageId = null;

  @SerializedName("Rid")
  private Integer rid = null;

  @SerializedName("Cid")
  private String cid = null;

  public CreateAccountModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email addres
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email addres")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateAccountModel storeName(String storeName) {
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

  public CreateAccountModel languageId(String languageId) {
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

  public CreateAccountModel rid(Integer rid) {
    this.rid = rid;
    return this;
  }

   /**
   * Referral ID
   * @return rid
  **/
  @ApiModelProperty(value = "Referral ID")
  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public CreateAccountModel cid(String cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Campaign ID
   * @return cid
  **/
  @ApiModelProperty(value = "Campaign ID")
  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountModel createAccountModel = (CreateAccountModel) o;
    return Objects.equals(this.email, createAccountModel.email) &&
        Objects.equals(this.storeName, createAccountModel.storeName) &&
        Objects.equals(this.languageId, createAccountModel.languageId) &&
        Objects.equals(this.rid, createAccountModel.rid) &&
        Objects.equals(this.cid, createAccountModel.cid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, storeName, languageId, rid, cid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountModel {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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

