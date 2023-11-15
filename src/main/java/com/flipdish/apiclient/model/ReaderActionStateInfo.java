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
 * Card reader state information
 */
@ApiModel(description = "Card reader state information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-15T15:28:34.931Z")
public class ReaderActionStateInfo {
  @SerializedName("ActionState")
  private String actionState = null;

  @SerializedName("FailureCode")
  private String failureCode = null;

  @SerializedName("FailureMessage")
  private String failureMessage = null;

  @SerializedName("Type")
  private String type = null;

  public ReaderActionStateInfo actionState(String actionState) {
    this.actionState = actionState;
    return this;
  }

   /**
   * Action state
   * @return actionState
  **/
  @ApiModelProperty(value = "Action state")
  public String getActionState() {
    return actionState;
  }

  public void setActionState(String actionState) {
    this.actionState = actionState;
  }

  public ReaderActionStateInfo failureCode(String failureCode) {
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Failure code
   * @return failureCode
  **/
  @ApiModelProperty(value = "Failure code")
  public String getFailureCode() {
    return failureCode;
  }

  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }

  public ReaderActionStateInfo failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Failure Message
   * @return failureMessage
  **/
  @ApiModelProperty(value = "Failure Message")
  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  public ReaderActionStateInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @ApiModelProperty(value = "Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderActionStateInfo readerActionStateInfo = (ReaderActionStateInfo) o;
    return Objects.equals(this.actionState, readerActionStateInfo.actionState) &&
        Objects.equals(this.failureCode, readerActionStateInfo.failureCode) &&
        Objects.equals(this.failureMessage, readerActionStateInfo.failureMessage) &&
        Objects.equals(this.type, readerActionStateInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionState, failureCode, failureMessage, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderActionStateInfo {\n");
    
    sb.append("    actionState: ").append(toIndentedString(actionState)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

