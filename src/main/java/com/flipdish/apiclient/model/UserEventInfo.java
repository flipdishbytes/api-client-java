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
 * User Event Info
 */
@ApiModel(description = "User Event Info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-21T13:38:20.864+01:00")
public class UserEventInfo {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UserPhoneNumber")
  private String userPhoneNumber = null;

  @SerializedName("UserEmail")
  private String userEmail = null;

  public UserEventInfo userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User Id
   * @return userId
  **/
  @ApiModelProperty(value = "User Id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UserEventInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User Name
   * @return userName
  **/
  @ApiModelProperty(value = "User Name")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserEventInfo userPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
    return this;
  }

   /**
   * User Phone Number
   * @return userPhoneNumber
  **/
  @ApiModelProperty(value = "User Phone Number")
  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
  }

  public UserEventInfo userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * User Email
   * @return userEmail
  **/
  @ApiModelProperty(value = "User Email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEventInfo userEventInfo = (UserEventInfo) o;
    return Objects.equals(this.userId, userEventInfo.userId) &&
        Objects.equals(this.userName, userEventInfo.userName) &&
        Objects.equals(this.userPhoneNumber, userEventInfo.userPhoneNumber) &&
        Objects.equals(this.userEmail, userEventInfo.userEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userPhoneNumber, userEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEventInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPhoneNumber: ").append(toIndentedString(userPhoneNumber)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
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

