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
import com.flipdish.apiclient.model.StripeTerminalConnectionToken;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rest api result
 */
@ApiModel(description = "Rest api result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-21T11:49:31.050Z")
public class RestApiResultStripeTerminalConnectionToken {
  @SerializedName("Data")
  private StripeTerminalConnectionToken data = null;

  public RestApiResultStripeTerminalConnectionToken data(StripeTerminalConnectionToken data) {
    this.data = data;
    return this;
  }

   /**
   * Generic data object.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Generic data object.")
  public StripeTerminalConnectionToken getData() {
    return data;
  }

  public void setData(StripeTerminalConnectionToken data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestApiResultStripeTerminalConnectionToken restApiResultStripeTerminalConnectionToken = (RestApiResultStripeTerminalConnectionToken) o;
    return Objects.equals(this.data, restApiResultStripeTerminalConnectionToken.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiResultStripeTerminalConnectionToken {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
