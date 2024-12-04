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
 * An invitation to join a team at Flipdish.
 */
@ApiModel(description = "An invitation to join a team at Flipdish.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-04T10:31:49.133Z")
public class PendingInvitation {
  @SerializedName("AppName")
  private String appName = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("Otc")
  private String otc = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  public PendingInvitation appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * The name of the brand that you have been invited to join.
   * @return appName
  **/
  @ApiModelProperty(value = "The name of the brand that you have been invited to join.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public PendingInvitation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address that the invitation was sent to.
   * @return email
  **/
  @ApiModelProperty(value = "The email address that the invitation was sent to.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PendingInvitation otc(String otc) {
    this.otc = otc;
    return this;
  }

   /**
   * The one-time code that can be used to accept the invitation.
   * @return otc
  **/
  @ApiModelProperty(value = "The one-time code that can be used to accept the invitation.")
  public String getOtc() {
    return otc;
  }

  public void setOtc(String otc) {
    this.otc = otc;
  }

  public PendingInvitation createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time that the invitation was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time that the invitation was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingInvitation pendingInvitation = (PendingInvitation) o;
    return Objects.equals(this.appName, pendingInvitation.appName) &&
        Objects.equals(this.email, pendingInvitation.email) &&
        Objects.equals(this.otc, pendingInvitation.otc) &&
        Objects.equals(this.createdAt, pendingInvitation.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, email, otc, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingInvitation {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    otc: ").append(toIndentedString(otc)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

