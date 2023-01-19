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
 * APM status
 */
@ApiModel(description = "APM status")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-19T08:27:38.139Z")
public class ApmStatus {
  @SerializedName("IsApmEnabled")
  private Boolean isApmEnabled = null;

  public ApmStatus isApmEnabled(Boolean isApmEnabled) {
    this.isApmEnabled = isApmEnabled;
    return this;
  }

   /**
   * Indicates if APM is active or otherwise
   * @return isApmEnabled
  **/
  @ApiModelProperty(value = "Indicates if APM is active or otherwise")
  public Boolean isIsApmEnabled() {
    return isApmEnabled;
  }

  public void setIsApmEnabled(Boolean isApmEnabled) {
    this.isApmEnabled = isApmEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApmStatus apmStatus = (ApmStatus) o;
    return Objects.equals(this.isApmEnabled, apmStatus.isApmEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isApmEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApmStatus {\n");
    
    sb.append("    isApmEnabled: ").append(toIndentedString(isApmEnabled)).append("\n");
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

