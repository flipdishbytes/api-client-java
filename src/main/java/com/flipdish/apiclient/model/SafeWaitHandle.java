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
 * SafeWaitHandle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class SafeWaitHandle {
  @SerializedName("IsInvalid")
  private Boolean isInvalid = null;

  @SerializedName("IsClosed")
  private Boolean isClosed = null;

   /**
   * Get isInvalid
   * @return isInvalid
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsInvalid() {
    return isInvalid;
  }

   /**
   * Get isClosed
   * @return isClosed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsClosed() {
    return isClosed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SafeWaitHandle safeWaitHandle = (SafeWaitHandle) o;
    return Objects.equals(this.isInvalid, safeWaitHandle.isInvalid) &&
        Objects.equals(this.isClosed, safeWaitHandle.isClosed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInvalid, isClosed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafeWaitHandle {\n");
    
    sb.append("    isInvalid: ").append(toIndentedString(isInvalid)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
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

