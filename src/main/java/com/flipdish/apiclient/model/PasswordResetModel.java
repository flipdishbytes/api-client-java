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
 * Password reset model
 */
@ApiModel(description = "Password reset model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-19T12:03:09.347Z")
public class PasswordResetModel {
  @SerializedName("TokenId")
  private String tokenId = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("PasswordConfirmation")
  private String passwordConfirmation = null;

  @SerializedName("Token")
  private String token = null;

  public PasswordResetModel tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token Id
   * @return tokenId
  **/
  @ApiModelProperty(value = "Token Id")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public PasswordResetModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/
  @ApiModelProperty(value = "Email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PasswordResetModel password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PasswordResetModel passwordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
    return this;
  }

   /**
   * Password confirmation
   * @return passwordConfirmation
  **/
  @ApiModelProperty(required = true, value = "Password confirmation")
  public String getPasswordConfirmation() {
    return passwordConfirmation;
  }

  public void setPasswordConfirmation(String passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

  public PasswordResetModel token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Password reset token
   * @return token
  **/
  @ApiModelProperty(value = "Password reset token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordResetModel passwordResetModel = (PasswordResetModel) o;
    return Objects.equals(this.tokenId, passwordResetModel.tokenId) &&
        Objects.equals(this.email, passwordResetModel.email) &&
        Objects.equals(this.password, passwordResetModel.password) &&
        Objects.equals(this.passwordConfirmation, passwordResetModel.passwordConfirmation) &&
        Objects.equals(this.token, passwordResetModel.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, email, password, passwordConfirmation, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordResetModel {\n");
    
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirmation: ").append(toIndentedString(passwordConfirmation)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

