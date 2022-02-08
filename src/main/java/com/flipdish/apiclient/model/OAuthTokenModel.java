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
import org.threeten.bp.OffsetDateTime;

/**
 * OAuth token model
 */
@ApiModel(description = "OAuth token model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class OAuthTokenModel {
  @SerializedName("Key")
  private String key = null;

  @SerializedName("TokenType")
  private String tokenType = null;

  @SerializedName("SubjectId")
  private String subjectId = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("Expiry")
  private OffsetDateTime expiry = null;

  public OAuthTokenModel key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Identitifier key
   * @return key
  **/
  @ApiModelProperty(value = "Identitifier key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OAuthTokenModel tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Token type
   * @return tokenType
  **/
  @ApiModelProperty(value = "Token type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OAuthTokenModel subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Oauth subject identifier
   * @return subjectId
  **/
  @ApiModelProperty(value = "Oauth subject identifier")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public OAuthTokenModel clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Oauth client identifier
   * @return clientId
  **/
  @ApiModelProperty(value = "Oauth client identifier")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthTokenModel expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Token expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "Token expiry")
  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthTokenModel oauthTokenModel = (OAuthTokenModel) o;
    return Objects.equals(this.key, oauthTokenModel.key) &&
        Objects.equals(this.tokenType, oauthTokenModel.tokenType) &&
        Objects.equals(this.subjectId, oauthTokenModel.subjectId) &&
        Objects.equals(this.clientId, oauthTokenModel.clientId) &&
        Objects.equals(this.expiry, oauthTokenModel.expiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, tokenType, subjectId, clientId, expiry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthTokenModel {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
