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
import com.flipdish.apiclient.model.WaitHandle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CancellationToken
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-25T09:00:30.301Z")
public class CancellationToken {
  @SerializedName("IsCancellationRequested")
  private Boolean isCancellationRequested = null;

  @SerializedName("CanBeCanceled")
  private Boolean canBeCanceled = null;

  @SerializedName("WaitHandle")
  private WaitHandle waitHandle = null;

   /**
   * Get isCancellationRequested
   * @return isCancellationRequested
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCancellationRequested() {
    return isCancellationRequested;
  }

   /**
   * Get canBeCanceled
   * @return canBeCanceled
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanBeCanceled() {
    return canBeCanceled;
  }

   /**
   * Get waitHandle
   * @return waitHandle
  **/
  @ApiModelProperty(value = "")
  public WaitHandle getWaitHandle() {
    return waitHandle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationToken cancellationToken = (CancellationToken) o;
    return Objects.equals(this.isCancellationRequested, cancellationToken.isCancellationRequested) &&
        Objects.equals(this.canBeCanceled, cancellationToken.canBeCanceled) &&
        Objects.equals(this.waitHandle, cancellationToken.waitHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCancellationRequested, canBeCanceled, waitHandle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationToken {\n");
    
    sb.append("    isCancellationRequested: ").append(toIndentedString(isCancellationRequested)).append("\n");
    sb.append("    canBeCanceled: ").append(toIndentedString(canBeCanceled)).append("\n");
    sb.append("    waitHandle: ").append(toIndentedString(waitHandle)).append("\n");
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

